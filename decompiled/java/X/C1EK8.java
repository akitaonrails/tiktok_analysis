package X;

import com.ss.android.ugc.aweme.tako.experiment.TakoPerfMessageCountConfig;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1EK8, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EK8 {
    public static final TakoPerfMessageCountConfig LIZ = new TakoPerfMessageCountConfig(20, 20);
    public static final C01GW LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(24));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((TakoPerfMessageCountConfig) c01gwLIZIZ.getValue()).initMessageCount;
        LIZLLL = ((TakoPerfMessageCountConfig) c01gwLIZIZ.getValue()).loadMessageCount;
    }
}
