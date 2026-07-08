package X;

import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.createpayorder.IapV1PayResponse;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* JADX INFO: renamed from: X.0wmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793860wmW extends AbstractC1794360wnK {
    public C1793870wmX LIZLLL;
    public final C1793880wmY LJ;
    public final C1793910wmb LJFF;

    public final void LIZLLL() {
        AbstractC1794360wnK nextState = PaymentServiceManager.get().getIapExternalService().getNextState(this);
        if (nextState != null) {
            nextState.LIZ(this.LIZ);
        }
    }

    @Override // X.AbstractC1794360wnK
    public final EnumC1794620wnk LIZJ() {
        return EnumC1794620wnk.CreateOrder;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0wmY] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0wmb] */
    public C1793860wmW(InterfaceC1794400wnO interfaceC1794400wnO) {
        super(interfaceC1794400wnO);
        this.LJ = new InterfaceC1793900wma<CreateOrderResponseEntity>() { // from class: X.0wmY
            @Override // X.InterfaceC1793900wma
            public final void LIZ(C1792220wjs c1792220wjs) {
                C1793870wmX c1793870wmX = this.LIZ.LIZLLL;
                if (c1793870wmX != null) {
                    c1793870wmX.LIZLLL(false, c1792220wjs);
                }
                if (c1792220wjs instanceof C1792840wks) {
                    this.LIZ.LIZIZ((C1792840wks) c1792220wjs);
                }
            }

            @Override // X.InterfaceC1793900wma
            public final void onSuccess(CreateOrderResponseEntity createOrderResponseEntity) {
                C1793870wmX c1793870wmX = this.LIZ.LIZLLL;
                if (c1793870wmX != null) {
                    c1793870wmX.LIZLLL(true, null);
                }
                this.LIZ.LIZLLL();
            }
        };
        this.LJFF = new InterfaceC1793900wma<IapV1PayResponse>() { // from class: X.0wmb
            @Override // X.InterfaceC1793900wma
            public final void LIZ(C1792220wjs c1792220wjs) {
                C1793870wmX c1793870wmX = this.LIZ.LIZLLL;
                if (c1793870wmX != null) {
                    c1793870wmX.LIZLLL(false, c1792220wjs);
                }
                if (c1792220wjs instanceof C1792840wks) {
                    this.LIZ.LIZIZ((C1792840wks) c1792220wjs);
                }
            }

            @Override // X.InterfaceC1793900wma
            public final void onSuccess(IapV1PayResponse iapV1PayResponse) {
                IapV1PayResponse iapV1PayResponse2 = iapV1PayResponse;
                C1794480wnW c1794480wnW = this.LIZ.LIZ;
                C1792170wjn c1792170wjn = c1794480wnW.LIZ;
                String str = iapV1PayResponse2.baseUrl;
                c1792170wjn.LJIIIIZZ = str;
                if (TextUtils.isEmpty(c1794480wnW.LJFF)) {
                    c1794480wnW.LJFF = str;
                }
                C1794480wnW c1794480wnW2 = this.LIZ.LIZ;
                C1794370wnL c1794370wnL = c1794480wnW2.LJIIL;
                String str2 = iapV1PayResponse2.payOrderId;
                c1794370wnL.LIZJ = str2;
                String str3 = iapV1PayResponse2.payLoad;
                if (str3 != null) {
                    c1794480wnW2.LIZ.LJFF = str3;
                    c1794480wnW2.LJFF();
                } else {
                    c1794480wnW2.LJ = str2;
                    c1794480wnW2.LIZJ = iapV1PayResponse2.productId;
                    C1792170wjn c1792170wjn2 = c1794480wnW2.LIZ;
                    c1792170wjn2.LIZIZ = iapV1PayResponse2.merchantId;
                    c1794480wnW2.LIZLLL = c1792170wjn2.LJ;
                }
                C1793870wmX c1793870wmX = this.LIZ.LIZLLL;
                if (c1793870wmX != null) {
                    c1793870wmX.LIZLLL(true, null);
                }
                this.LIZ.LIZLLL();
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    @Override // X.AbstractC1794360wnK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final X.C1794480wnW r22) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1793860wmW.LIZ(X.0wnW):void");
    }
}
