package X;

import Y.AObjectS73S0000000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oZC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478080oZC {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;

    static {
        AObjectS73S0000000_23 aObjectS73S0000000_23 = new AObjectS73S0000000_23(7);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LIZ = C452501pT.LIZ(enumC452301pR, aObjectS73S0000000_23);
        LIZIZ = C452501pT.LIZ(enumC452301pR, new AObjectS73S0000000_23(8));
        LIZJ = C452501pT.LIZ(enumC452301pR, new AObjectS73S0000000_23(9));
        LIZLLL = C452501pT.LIZ(enumC452301pR, new AObjectS73S0000000_23(10));
    }

    public static JSONObject LIZJ(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public static SimAudioBitrate LIZ(int i, List list) {
        int iAbs;
        SimAudioBitrate simAudioBitrate = null;
        if (i > 0 && list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            int i2 = Integer.MAX_VALUE;
            while (it2.hasNext()) {
                SimAudioBitrate simAudioBitrate2 = (SimAudioBitrate) it2.next();
                if (simAudioBitrate2 != null && (iAbs = (int) Math.abs(i - simAudioBitrate2.getBitRate())) < i2) {
                    simAudioBitrate = simAudioBitrate2;
                    if (iAbs == 0) {
                        break;
                    }
                    i2 = iAbs;
                }
            }
        }
        return simAudioBitrate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[PHI: r2 r5
      0x0077: PHI (r2v6 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate) = 
      (r2v0 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate)
      (r2v12 com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate)
     binds: [B:62:0x0169, B:18:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r5v1 X.07eD) = (r5v0 X.07eD), (r5v7 X.07eD) binds: [B:62:0x0169, B:18:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate LIZIZ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r8, X.InterfaceC1477220oXo r9, java.util.List<? extends com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate> r10) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1478080oZC.LIZIZ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, X.0oXo, java.util.List):com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate");
    }
}
