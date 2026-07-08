package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.report.api.MinisData;
import java.util.List;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0mSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397280mSs extends AbstractC1397290mSt {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String strLJI;
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC1397300mSu interfaceC1397300mSu = (InterfaceC1397300mSu) xBaseParamModel;
        C508401yU c508401yU = C508401yU.LJIIJJI;
        if (c508401yU == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("minis-ReportImageUploadIDL", "No active ReportSession");
            C2382909Vj.LIZ(completionBlock, -1, "No active report session", null, 4);
            return;
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C06MM.LIZ(activityLIZIZ)) != null) {
            c508401yU.LJI(activityLIZ);
        }
        List<String> imageData = interfaceC1397300mSu.getImageData();
        if (imageData.isEmpty()) {
            C2382909Vj.LIZ(completionBlock, -2, "Empty image list", null, 4);
            return;
        }
        if (imageData.size() > 4) {
            C2382909Vj.LIZ(completionBlock, -3, "Exceeds 4 image limit", null, 4);
            return;
        }
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(completionBlock, (CompletionBlock<InterfaceC1397310mSv>) 1238);
        AwS635S0100000_21 awS635S0100000_21 = new AwS635S0100000_21(completionBlock, (CompletionBlock<InterfaceC1397420mT6>) 124);
        if (c508401yU.LJII) {
            awS635S0100000_21.invoke(0, "Upload already in progress");
            return;
        }
        c508401yU.LJII = true;
        if (c508401yU.LJIIIIZZ == null) {
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                MinisData minisDataLIZ = c508401yU.LIZ();
                c1227904rF.getClass();
                strLJI = C1227904rF.LJI(minisDataLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("buildMinisDataJson failed: ");
                sbLIZ.append(e.getMessage());
                C1720106oR.LIZ("minis-ReportSession", C2188811AlT.LIZIZ(sbLIZ));
                strLJI = null;
            }
            c508401yU.LJIIIIZZ = strLJI;
        }
        awS565S0100000_21.invoke();
        C23250099c.LIZLLL(c508401yU.LJ, null, null, new C507501yL(c508401yU, imageData, null), 3);
    }
}
