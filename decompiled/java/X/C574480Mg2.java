package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Mg2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574480Mg2 {
    public static final MediaModel LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        int[] iArr = new int[10];
        if (C574790MgX.LIZIZ(str, iArr) != 0) {
            return null;
        }
        MediaModel mediaModel = new MediaModel(-1L);
        mediaModel.LJIILL(str);
        mediaModel.width = iArr[0];
        mediaModel.height = iArr[1];
        mediaModel.duration = iArr[3];
        return mediaModel;
    }

    public static final void LIZIZ(InterfaceC1178904jL interfaceC1178904jL) {
        String value = interfaceC1178904jL.getValue();
        if (value != null) {
            try {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideErrorReporter().setCustomTag(interfaceC1178904jL.getKey(), value);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final List<User> LIZJ(ExtraMentionUserModel extraMentionUserModel) {
        List<Pair<String, String>> userList = extraMentionUserModel.getUserList();
        boolean z = !extraMentionUserModel.getUserList().isEmpty();
        ArrayList arrayList = null;
        if (z && userList != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(userList, 10));
            for (Pair<String, String> pair : userList) {
                User user = new User();
                user.setUid(pair.getFirst());
                user.setNickname(pair.getSecond());
                arrayList.add(user);
            }
        }
        return arrayList;
    }
}
