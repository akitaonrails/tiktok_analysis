package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0ate, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952600ate {
    public static final boolean LIZ;

    static {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        LIZ = iHostAppContext.isOffline() || iHostAppContext.isRegressionTest();
    }
}
