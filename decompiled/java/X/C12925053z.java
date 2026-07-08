package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* JADX INFO: renamed from: X.053z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12925053z {
    public static final /* synthetic */ int LIZ = 0;

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("im_self_config_repo-");
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        return KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 1);
    }
}
