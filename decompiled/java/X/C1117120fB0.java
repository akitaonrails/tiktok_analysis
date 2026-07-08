package X;

import android.app.Activity;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0fB0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117120fB0 extends AbstractC1060370dhT {
    public InterfaceC420801kM LLILLL;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        InterfaceC420801kM interfaceC420801kM = this.LLILLL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

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
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C476760Imo c476760Imo = new C476760Imo();
            c476760Imo.LIZ = C497740JfY.LJIJI(2131853574);
            interfaceC500940JkiUser.LJIILL(activityLIZLLL, new C501600Jlm(c476760Imo)).LIZIZ(new InterfaceC626120Oh8<InterfaceC2262081DgM>() { // from class: X.0dhW
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                    CompletionBlock<InterfaceC1060380dhU> completionBlock2 = completionBlock;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C2382909Vj.LIZ(completionBlock2, 0, message, null, 4);
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(InterfaceC2262081DgM interfaceC2262081DgM) {
                    this.LL.getClass();
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1060380dhU.class, null), "");
                }

                @Override // X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    this.LL.LLILLL = interfaceC420801kM;
                }
            });
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "activity is null", null, 4);
    }
}
