package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0zmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909100zmO extends AbstractC1875020ytQ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1875070ytV interfaceC1875070ytV = (InterfaceC1875070ytV) xBaseParamModel;
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            C1909230zmb c1909230zmb = C1909230zmb.LIZ;
            InterfaceC1875060ytU interfaceC1875060ytU = new InterfaceC1875060ytU() { // from class: X.0ytS
                @Override // X.InterfaceC1875060ytU
                public final void show() {
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1875030ytR.class, null), "");
                }
            };
            c1909230zmb.getClass();
            C15O7.LJIIIIZZ(300L).LJ(new C19335210kg(activityLJFF, interfaceC1875070ytV, 3), C15O7.LJI, null).LJ(new C19335410ki(activityLJFF, interfaceC1875070ytV, interfaceC1875060ytU, 1), C15O7.LJIIIIZZ, null);
        }
    }
}
