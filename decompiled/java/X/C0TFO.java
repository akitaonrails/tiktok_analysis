package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0TFO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TFO {
    public static final void LIZ(String str, String str2) {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttlive_board_");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }
}
