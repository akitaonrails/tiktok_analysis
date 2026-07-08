package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0aY3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939210aY3 {
    public static final boolean LIZJ() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.isOffline();
        }
        return false;
    }

    public static final void LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Rust_Tracker<");
        sbLIZ.append(str2);
        sbLIZ.append('>');
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    public static final void LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Rust_Tracker<");
        sbLIZ.append(str2);
        sbLIZ.append('>');
        C20441214yg.LJ(C2188811AlT.LIZIZ(sbLIZ), str);
    }
}
