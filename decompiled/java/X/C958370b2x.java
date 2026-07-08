package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0b2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958370b2x {
    public static long LIZ;

    public static boolean LIZIZ() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.isLocalTest();
        }
        return false;
    }

    public static boolean LIZJ() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.isOffline();
        }
        return false;
    }

    public static final void LIZ(String str) {
        if (str == null) {
            return;
        }
        if (LIZIZ() || LIZJ()) {
            C766270U4b.LJIIJJI(str);
        }
    }
}
