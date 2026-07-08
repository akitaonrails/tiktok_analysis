package X;

import com.bytedance.android.alog.Alog;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0WdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827750WdZ {
    public static final void LIZ(String str, String str2) {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            Alog alogLIZ = C827610WdL.LIZ().LIZ();
            if (alogLIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ttlive_enter_room_log_");
                sbLIZ.append(str);
                alogLIZ.LJIILL(2, C2188811AlT.LIZIZ(sbLIZ), str2);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ttlive_enter_room_log_");
            sbLIZ2.append(str);
            sbLIZ2.append(' ');
            sbLIZ2.append(str2);
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ttlive_enter_room_log_");
        sbLIZ3.append(str);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3), str2);
    }

    public static final void LIZIZ(String str, String str2) {
        Alog alogLIZ;
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && (alogLIZ = C827610WdL.LIZ().LIZ()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttlive_enter_room_log_");
            sbLIZ.append(str);
            alogLIZ.LJIILL(4, C2188811AlT.LIZIZ(sbLIZ), str2);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ttlive_enter_room_log_");
        sbLIZ2.append(str);
        C20441214yg.LJ(C2188811AlT.LIZIZ(sbLIZ2), str2);
    }

    public static final void LIZJ(String str, String str2) {
        Alog alogLIZ;
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && (alogLIZ = C827610WdL.LIZ().LIZ()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttlive_enter_room_log_");
            sbLIZ.append(str);
            alogLIZ.LJIILL(2, C2188811AlT.LIZIZ(sbLIZ), str2);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ttlive_enter_room_log_");
        sbLIZ2.append(str);
        C20441214yg.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), str2);
    }
}
