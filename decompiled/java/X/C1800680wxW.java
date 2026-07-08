package X;

import android.app.Activity;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800680wxW extends AbstractC1800640wxS {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        String opeartion = ((InterfaceC1800660wxU) xBaseParamModel).getOpeartion();
        int i = 1;
        Activity activityLIZLLL2 = null;
        if (Intrinsics.LJFF(opeartion, "auth")) {
            if (Build.VERSION.SDK_INT >= 33) {
                InterfaceC1800630wxR interfaceC1800630wxR = (InterfaceC1800630wxR) C1909107dp.LIZJ(InterfaceC1800630wxR.class, null);
                interfaceC1800630wxR.setStatus(1);
                completionBlock.onSuccess(interfaceC1800630wxR, "");
                return;
            } else {
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    activityLIZLLL2 = interfaceC634840OvC.LIZLLL();
                }
                new C0UT9(activityLIZLLL2, TokenCert.Companion.with("bpea-get_photo_album_auth_method_for_live_replay_list")).LIZ(new C142V() { // from class: X.0wxV
                    @Override // X.C142V
                    public final /* synthetic */ void LIZIZ(String... strArr) {
                    }

                    @Override // X.C142V
                    public final /* synthetic */ void LIZLLL(String... strArr) {
                    }

                    @Override // X.C142V
                    public final /* synthetic */ void LJ(String str, String... strArr) {
                    }

                    @Override // X.C142V
                    public final /* synthetic */ void LJFF(String... strArr) {
                    }

                    @Override // X.C142V
                    public final void LIZ(String... strArr) {
                        this.LIZ.getClass();
                        InterfaceC1800630wxR interfaceC1800630wxR2 = (InterfaceC1800630wxR) C1909107dp.LIZJ(InterfaceC1800630wxR.class, null);
                        interfaceC1800630wxR2.setStatus(2);
                        completionBlock.onSuccess(interfaceC1800630wxR2, "");
                    }

                    @Override // X.C142V
                    public final void LIZJ(String... strArr) {
                        this.LIZ.getClass();
                        InterfaceC1800630wxR interfaceC1800630wxR2 = (InterfaceC1800630wxR) C1909107dp.LIZJ(InterfaceC1800630wxR.class, null);
                        interfaceC1800630wxR2.setStatus(1);
                        completionBlock.onSuccess(interfaceC1800630wxR2, "");
                    }
                }, false, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
        }
        if (Intrinsics.LJFF(opeartion, "get")) {
            if (Build.VERSION.SDK_INT >= 33) {
                InterfaceC1800630wxR interfaceC1800630wxR2 = (InterfaceC1800630wxR) C1909107dp.LIZJ(InterfaceC1800630wxR.class, null);
                interfaceC1800630wxR2.setStatus(1);
                completionBlock.onSuccess(interfaceC1800630wxR2, "");
                return;
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                activityLIZLLL = interfaceC634840OvC2.LIZLLL();
            } else {
                activityLIZLLL = null;
            }
            boolean zLIZJ = C202002142e.LIZJ(activityLIZLLL, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
            InterfaceC1800630wxR interfaceC1800630wxR3 = (InterfaceC1800630wxR) C1909107dp.LIZJ(InterfaceC1800630wxR.class, null);
            if (!zLIZJ) {
                i = 2;
            }
            interfaceC1800630wxR3.setStatus(i);
            completionBlock.onSuccess(interfaceC1800630wxR3, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
    }
}
