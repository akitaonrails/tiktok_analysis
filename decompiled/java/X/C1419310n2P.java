package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.INLEModelNetworkDelegate;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0n2P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419310n2P extends INLEModelNetworkDelegate {
    public final Map<String, InterfaceC420801kM> LIZ = new LinkedHashMap();
    public InterfaceC1419480n2g LIZIZ;

    @Override // com.bytedance.ies.smartmovie.jni.INLEModelNetworkDelegate
    public final void cancel(String str) {
        Unit unit;
        if (str == null) {
            return;
        }
        try {
            InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((LinkedHashMap) this.LIZ).get(str);
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LIZ.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e A[PHI: r3
      0x005e: PHI (r3v2 boolean) = (r3v1 boolean), (r3v5 boolean) binds: [B:25:0x005b, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020f  */
    @Override // com.bytedance.ies.smartmovie.jni.INLEModelNetworkDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void request(final com.bytedance.ies.smartmovie.jni.NLEModelRequestParams r19, final com.bytedance.ies.smartmovie.jni.NLEModelRequestCallback r20) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419310n2P.request(com.bytedance.ies.smartmovie.jni.NLEModelRequestParams, com.bytedance.ies.smartmovie.jni.NLEModelRequestCallback):void");
    }

    public static void LIZ(String str, NLEModel nLEModel, String str2, NLEModelRequestParams nLEModelRequestParams, String str3, NLEError nLEError) {
        Integer numValueOf = null;
        if ((nLEModel == null || nLEModel.getMainTrack() == null) && nLEModelRequestParams != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoCutNLEModelDelegate AUTO_CUT_NO_TRACK_CRASH: tag=");
            sbLIZ.append(str);
            sbLIZ.append(", isTemplateModel=");
            sbLIZ.append(a0.LJJIIZI(str2, "_templateModel", false));
            sbLIZ.append(", nleError=");
            if (nLEError != null) {
                numValueOf = Integer.valueOf(nLEError.swigValue());
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", extraParams=");
            sbLIZ.append(nLEModelRequestParams.LIZ());
            sbLIZ.append(',');
            sbLIZ.append(str3);
            sbLIZ.append(",templateJSON=");
            sbLIZ.append(str2);
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
