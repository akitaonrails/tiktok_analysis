package X;

import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0fqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143110fqv extends AbstractC1143130fqx {
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0fqw] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1143140fqy interfaceC1143140fqy = (InterfaceC1143140fqy) xBaseParamModel;
        long jLongValue = interfaceC1143140fqy.getItemId().longValue();
        int iIntValue = interfaceC1143140fqy.getItemType().intValue();
        long jLongValue2 = interfaceC1143140fqy.getCount().longValue();
        Context context = null;
        if (jLongValue > 0 && iIntValue >= 0 && jLongValue2 > 0) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r10 = new InterfaceC1130520fWc() { // from class: X.0fqw
                @Override // X.InterfaceC1130520fWc
                public final void onSuccess(long j) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        this.getClass();
                        InterfaceC1143150fqz interfaceC1143150fqz = (InterfaceC1143150fqz) C1909107dp.LIZJ(InterfaceC1143150fqz.class, null);
                        interfaceC1143150fqz.setRemainCount(Long.valueOf(j));
                        completionBlock.onSuccess(interfaceC1143150fqz, "Consume bag item success");
                    }
                }

                @Override // X.InterfaceC1130520fWc
                public final void onFailure(int i, String str) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        CompletionBlock<InterfaceC1143150fqz> completionBlock2 = completionBlock;
                        if (str == null) {
                            str = "Consume bag item failed";
                        }
                        C2382909Vj.LIZ(completionBlock2, i, str, null, 4);
                    }
                }
            };
            Boolean combo = interfaceC1143140fqy.getCombo();
            if (combo != null) {
                combo.booleanValue();
            }
            C1130250fWB c1130250fWB = new C1130250fWB(jLongValue, iIntValue, jLongValue2, r10);
            IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                context = interfaceC634840OvC.getContext();
            }
            iGiftService.consumeBagItemFromJsb(context, c1130250fWB);
            return;
        }
        C2382909Vj.LIZ(completionBlock, -3, "Invalid bag item params", null, 4);
    }
}
