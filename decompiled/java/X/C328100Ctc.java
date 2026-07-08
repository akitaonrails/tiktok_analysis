package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CollabInfo;
import com.ss.android.ugc.aweme.feed.model.CollaboratorInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ctc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C328100Ctc {
    public static final List<User> LIZIZ(Aweme aweme) {
        int i;
        CollabInfo collabInfo = aweme.getCollabInfo();
        if (collabInfo == null) {
            return C13BV.INSTANCE;
        }
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        List<CollaboratorInfo> list = collabInfo.collaborators;
        ArrayList arrayList = new ArrayList();
        for (CollaboratorInfo collaboratorInfo : list) {
            User user = collaboratorInfo.user;
            String uid = user.getUid();
            if (uid != null && uid.length() != 0 && !Intrinsics.LJFF(uid, authorUid) && collaboratorInfo.collabStatus == 2) {
                arrayList.add(user);
            }
        }
        if (!(!arrayList.isEmpty()) && ((Boolean) C258750ACb.LIZ.getValue()).booleanValue() && collabInfo.shouldDisplayTag) {
            List<CollaboratorInfo> list2 = collabInfo.collaborators;
            ArrayList arrayList2 = new ArrayList();
            for (CollaboratorInfo collaboratorInfo2 : list2) {
                User user2 = collaboratorInfo2.user;
                String uid2 = user2.getUid();
                if (uid2 != null && uid2.length() != 0 && !Intrinsics.LJFF(uid2, authorUid) && (i = collaboratorInfo2.collabStatus) != 3 && i != 4 && i != 5) {
                    arrayList2.add(user2);
                }
            }
            return arrayList2;
        }
        return arrayList;
    }

    public static final List<User> LIZJ(Aweme aweme) {
        List<CollaboratorInfo> list;
        String uid;
        List<CollaboratorInfo> list2;
        if (!((Boolean) C0AEV.LIZ.getValue()).booleanValue()) {
            CollabInfo collabInfo = aweme.getCollabInfo();
            if (collabInfo != null && (list2 = collabInfo.collaborators) != null) {
                ArrayList arrayList = new ArrayList();
                for (CollaboratorInfo collaboratorInfo : list2) {
                    CollaboratorInfo collaboratorInfo2 = collaboratorInfo;
                    if (!Intrinsics.LJFF(collaboratorInfo2.user.getUid(), AwemeExtKt.getAuthorUid(aweme)) && collaboratorInfo2.collabStatus == 2) {
                        arrayList.add(collaboratorInfo);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((CollaboratorInfo) it2.next()).user);
                }
                return arrayList2;
            }
            return C13BV.INSTANCE;
        }
        CollabInfo collabInfo2 = aweme.getCollabInfo();
        if (collabInfo2 != null && (list = collabInfo2.collaborators) != null && !list.isEmpty()) {
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            ArrayList arrayList3 = new ArrayList();
            for (CollaboratorInfo collaboratorInfo3 : list) {
                User user = collaboratorInfo3.user;
                if (user != null && (uid = user.getUid()) != null && uid.length() != 0 && !Intrinsics.LJFF(uid, authorUid) && collaboratorInfo3.collabStatus == 2 && user != null) {
                    arrayList3.add(user);
                }
            }
            return arrayList3;
        }
        return C13BV.INSTANCE;
    }

    public static final boolean LJ(Aweme aweme) {
        User author;
        int i;
        CollabInfo collabInfo = aweme.getCollabInfo();
        boolean z = false;
        if (collabInfo == null || (author = aweme.getAuthor()) == null) {
            return false;
        }
        if (((Boolean) C258750ACb.LIZ.getValue()).booleanValue() && collabInfo.shouldDisplayTag) {
            return true;
        }
        if (!Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid(), author.getUid())) {
            List<CollaboratorInfo> list = collabInfo.collaborators;
            if (list.isEmpty() || list.isEmpty()) {
                return false;
            }
            for (CollaboratorInfo collaboratorInfo : list) {
                if (!Intrinsics.LJFF(collaboratorInfo.user.getUid(), author.getUid()) && collaboratorInfo.collabStatus == 2) {
                    return true;
                }
            }
            return false;
        }
        if (collabInfo.collaborators.isEmpty() || (collabInfo.collaborators.size() == 1 && Intrinsics.LJFF(((CollaboratorInfo) C13LP.LJJJJZI(collabInfo.collaborators)).user.getUid(), author.getUid()))) {
            return false;
        }
        List<CollaboratorInfo> list2 = collabInfo.collaborators;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = true;
        } else {
            for (CollaboratorInfo collaboratorInfo2 : list2) {
                if (!Intrinsics.LJFF(collaboratorInfo2.user.getUid(), author.getUid()) && ((i = collaboratorInfo2.collabStatus) == 2 || i == 1)) {
                    break;
                }
            }
            z = true;
        }
        return !z;
    }

    public static final List<User> LIZLLL(Aweme aweme, String str) {
        List<CollaboratorInfo> list;
        CollabInfo collabInfo = aweme.getCollabInfo();
        if (collabInfo != null && (list = collabInfo.collaborators) != null) {
            ArrayList arrayList = new ArrayList();
            for (CollaboratorInfo collaboratorInfo : list) {
                CollaboratorInfo collaboratorInfo2 = collaboratorInfo;
                if (!Intrinsics.LJFF(collaboratorInfo2.user.getUid(), str) && collaboratorInfo2.collabStatus == 2) {
                    arrayList.add(collaboratorInfo);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((CollaboratorInfo) it2.next()).user);
            }
            return arrayList2;
        }
        return C13BV.INSTANCE;
    }

    public static final User LIZ(Aweme aweme, String str, String str2) {
        CollabInfo collabInfo = aweme.getCollabInfo();
        if (collabInfo == null) {
            return aweme.getAuthor();
        }
        if (Intrinsics.LJFF(str2, "personal_homepage") || Intrinsics.LJFF(str2, "others_homepage")) {
            for (CollaboratorInfo collaboratorInfo : collabInfo.collaborators) {
                if (Intrinsics.LJFF(collaboratorInfo.user.getUid(), str) && collaboratorInfo.collabStatus == 2) {
                    return collaboratorInfo.user;
                }
            }
        }
        return aweme.getAuthor();
    }
}
