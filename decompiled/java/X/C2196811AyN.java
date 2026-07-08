package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.minis.exp.MinisParallelPreloadConfig;

/* JADX INFO: renamed from: X.1AyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196811AyN implements C09YW {
    public final boolean LIZ;
    public final boolean LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2196811AyN(boolean z) {
        C2196881AyU.LIZ.getClass();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MinisParallelPreloadConfig minisParallelPreloadConfig = C2196881AyU.LIZIZ;
        MinisParallelPreloadConfig minisParallelPreloadConfig2 = (MinisParallelPreloadConfig) settingsManagerLIZLLL.LJIIIIZZ("minis_parallel_preload_subpackages_settings", MinisParallelPreloadConfig.class, minisParallelPreloadConfig);
        this(z, (minisParallelPreloadConfig2 != null ? minisParallelPreloadConfig2 : minisParallelPreloadConfig).enable);
    }

    public C2196811AyN(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    @Override // X.C09YW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C2390309Yf r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2196811AyN.LIZ(X.09Yf, X.05Vn):java.lang.Object");
    }
}
