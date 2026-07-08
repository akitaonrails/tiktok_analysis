package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521240KcM extends AbstractC521250KcN {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        Context context2;
        C0VSJ c0vsj = new C0VSJ(((InterfaceC521260KcO) xBaseParamModel).getPath());
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (c0vsj.exists() && context != null) {
            Intent intent = new Intent();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.getPackageName());
            sbLIZ.append(".ttlive_provider");
            Uri uriForDifVersion = TTLiveFileProvider.getUriForDifVersion(context, C2188811AlT.LIZIZ(sbLIZ), c0vsj);
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", uriForDifVersion);
            intent.setType("application/pdf");
            intent.addFlags(268435456);
            intent.addFlags(1);
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                context2 = interfaceC634840OvC2.getContext();
            } else {
                context2 = null;
            }
            C19EG c19egLJ = C500260Jjc.LJ(context2);
            if (c19egLJ != null) {
                try {
                    if (c19egLJ.getPackageManager() != null && intent.resolveActivity(c19egLJ.getPackageManager()) != null) {
                        Intent intentCreateChooser = Intent.createChooser(intent, "share");
                        ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intentCreateChooser, 1207964160);
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLJ, intentCreateChooser, "Context_startActivity_1");
                        C1701330uNH.LIZ(intentCreateChooser, c19egLJ);
                        C2204961BRm.LJIILLIIL(c19egLJ, intentCreateChooser, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf/N/ILzSAUv4UmvRvfF6qbZrPV/QrE8H7TrGJR7dkZ0p4oVdprPHhnS06+ImRdBj5J3I=", null));
                        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC521270KcP.class, null), "");
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
    }
}
