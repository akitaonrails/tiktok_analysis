package X;

import com.ss.android.ugc.aweme.im.common.setting.IMPageFpsConfig;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1E7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276251E7r {
    public static final IMPageFpsConfig LIZ = new IMPageFpsConfig(0.1f);
    public static final C01GW LIZIZ;
    public static final float LIZJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(91));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((IMPageFpsConfig) c01gwLIZIZ.getValue()).uploadRatio;
    }
}
