package X;

import Y.AObjectS58S0000000_5;
import Y.AObjectS82S0000000_35;
import com.bytedance.ies.nleeditor.NLE;
import com.ss.ugc.android.davinciresource.DavinciResource;
import com.ss.ugc.android.davinciresource.jni.IDAVHTTPClientDelegateWrapper;

/* JADX INFO: renamed from: X.0EYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366380EYa {
    public static C357530Dzz LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new AObjectS58S0000000_5(0));
    public static final C01GW LIZJ = C452501pT.LIZIZ(new AObjectS82S0000000_35(5));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new AObjectS58S0000000_5(1));
    public static final C01GW LJ = C452501pT.LIZIZ(new AObjectS58S0000000_5(2));

    public static void LIZ(C357530Dzz c357530Dzz) {
        C2229261CMy.LIZ = c357530Dzz.LIZJ;
        C357400Dzm.LIZ = c357530Dzz.LIZLLL;
        DavinciResource.INSTANCE.setHttpClient((IDAVHTTPClientDelegateWrapper) LIZIZ.getValue());
        LIZ = c357530Dzz;
        C2169008ee.LIZ.LIZ();
        NLE.loadNLELibrary$default(NLE.INSTANCE, true, false, false, 6, null);
    }
}
