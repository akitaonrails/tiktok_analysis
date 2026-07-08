package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
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

/* JADX INFO: renamed from: X.0Dcx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343250Dcx {
    public static final C343250Dcx LIZ = new C343250Dcx();

    public static List LIZ(Aweme aweme) {
        CollabInfo collabInfo;
        boolean z;
        boolean z2;
        if (aweme != null && (collabInfo = aweme.getCollabInfo()) != null) {
            List<CollaboratorInfo> list = collabInfo.collaborators;
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            if ((list instanceof Collection) && list.isEmpty()) {
                z = false;
            } else {
                for (CollaboratorInfo collaboratorInfo : list) {
                    if (Intrinsics.LJFF(collaboratorInfo.user.getUid(), curUser.getUid()) && collaboratorInfo.collabStatus == 1) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            User author = aweme.getAuthor();
            if (author != null && LIZIZ(author)) {
                z2 = true;
            } else {
                z2 = false;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (CollaboratorInfo collaboratorInfo2 : collabInfo.collaborators) {
                if (Intrinsics.LJFF(collaboratorInfo2.user.getUid(), AwemeExtKt.getAuthorUid(aweme))) {
                    User user = collaboratorInfo2.user;
                    LIZ.getClass();
                    ListProtector.add(arrayList2, 0, new C343260Dcy(0, user, LIZLLL(aweme), aweme, false));
                } else {
                    int i = 2;
                    if (collaboratorInfo2.collabStatus == 2) {
                        C343250Dcx c343250Dcx = LIZ;
                        User user2 = collaboratorInfo2.user;
                        c343250Dcx.getClass();
                        if (!LIZIZ(user2)) {
                            i = 1;
                        }
                        arrayList2.add(new C343260Dcy(i, collaboratorInfo2.user, aweme, false));
                    }
                    if (z2 && collaboratorInfo2.collabStatus == 1) {
                        arrayList3.add(new C343260Dcy(1, collaboratorInfo2.user, aweme, true));
                    }
                    if (z) {
                        C343250Dcx c343250Dcx2 = LIZ;
                        User user3 = collaboratorInfo2.user;
                        c343250Dcx2.getClass();
                        if (LIZIZ(user3) && !z2) {
                            arrayList3.add(new C343240Dcw(aweme, collaboratorInfo2.user));
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (!arrayList3.isEmpty()) {
                if (z2) {
                    arrayList.add(new C0185003z(0));
                }
                arrayList.addAll(arrayList3);
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static boolean LIZIZ(User user) {
        return Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), user.getUid());
    }

    public static boolean LIZLLL(Aweme aweme) {
        User author = aweme.getAuthor();
        if ((author != null && LIZIZ(author)) || C2540509xT.LIZ() != 3 || C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
            return false;
        }
        return true;
    }

    public static List LIZJ(User user, List list) {
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        if (list.size() < 4) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1576550r81((Aweme) it2.next(), user, false, 8));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        List listLL = C13LP.LL(list, 3);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
        Iterator it3 = listLL.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new C1576550r81((Aweme) it3.next(), user, false, 8));
        }
        arrayList2.addAll(arrayList3);
        arrayList2.add(new C1576550r81((Aweme) ListProtector.get(list, 3), user, true, 8));
        return arrayList2;
    }
}
