package X;

import android.util.Log;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.hybrid.retention.PipoRetentionPopupConfig;

/* JADX INFO: renamed from: X.0v0L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725550v0L extends AbstractC1725560v0M {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        SparkContext sparkContext;
        String containerID2;
        try {
            if (!C1725580v0O.LIZ().enable) {
                C2382909Vj.LIZ(completionBlock, 104, "container retention popup is disabled", null, 4);
                return;
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            C1529880puk c1529880puk = SparkContext.Companion;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            c1529880puk.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
            if (c1537480q70LIZIZ instanceof SparkContext) {
                sparkContext = (SparkContext) c1537480q70LIZIZ;
            } else {
                sparkContext = null;
            }
            C1725540v0K c1725540v0K = new C1725540v0K();
            PipoRetentionPopupConfig pipoRetentionPopupConfigLIZJ = c1725540v0K.LIZJ(sparkContext);
            if (sparkContext == null) {
                C2382909Vj.LIZ(completionBlock, 101, "no sparkContent found", null, 4);
                return;
            }
            if (pipoRetentionPopupConfigLIZJ == null) {
                C2382909Vj.LIZ(completionBlock, 102, "no retention popup config found in schema", null, 4);
                return;
            }
            InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
            if (interfaceC1059280dfiLJJIJLIJ == null) {
                C2382909Vj.LIZ(completionBlock, 103, "no spark container found", null, 4);
                return;
            }
            boolean zLJ = c1725540v0K.LJ(interfaceC1059280dfiLJJIJLIJ, pipoRetentionPopupConfigLIZJ, "jsb");
            if (interfaceC634840OvC != null) {
                containerID2 = interfaceC634840OvC.getContainerID();
            } else {
                containerID2 = null;
            }
            InterfaceC1725570v0N interfaceC1725570v0N = (InterfaceC1725570v0N) C1909107dp.LIZJ(InterfaceC1725570v0N.class, containerID2);
            interfaceC1725570v0N.setHasShown(Boolean.valueOf(zLJ));
            completionBlock.onSuccess(interfaceC1725570v0N, "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C1725270uzt.LJI("216", th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("jsb exception: ");
            sbLIZ.append(Log.getStackTraceString(th));
            C2382909Vj.LIZ(completionBlock, 100, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
