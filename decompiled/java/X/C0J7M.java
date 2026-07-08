package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0J7M, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J7M {
    public static final void LIZ(String str, String str2) {
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("user_live_room_");
            sbLIZ.append(str);
            C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public static final void LIZIZ(String str, String str2) {
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("user_live_room_");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }
}
