package com.android.billingclient.api;

import X.C19885612rG;
import X.C1BAM;
import X.InterfaceC1796090wq7;
import X.InterfaceC1796100wq8;
import X.InterfaceC2200251B9j;
import X.InterfaceC2200341B9s;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class zzcl implements InterfaceC2200251B9j, InterfaceC2200341B9s, C1BAM, InterfaceC1796090wq7, InterfaceC1796100wq8 {
    public static native void nativeOnAcknowledgePurchaseResponse(int i, String str, long j);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i, String str, long j);

    public static native void nativeOnConsumePurchaseResponse(int i, String str, String str2, long j);

    public static native void nativeOnPriceChangeConfirmationResult(int i, String str, long j);

    public static native void nativeOnPurchaseHistoryResponse(int i, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j);

    public static native void nativeOnPurchasesUpdated(int i, String str, Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int i, String str, Purchase[] purchaseArr, long j);

    public static native void nativeOnSkuDetailsResponse(int i, String str, SkuDetails[] skuDetailsArr, long j);

    @Override // X.InterfaceC2200341B9s
    public final void LIZ() {
        nativeOnBillingServiceDisconnected();
    }

    @Override // X.InterfaceC2200251B9j
    public final void LIZIZ(C19885612rG c19885612rG) {
        nativeOnAcknowledgePurchaseResponse(c19885612rG.LIZ, c19885612rG.LIZJ, 0L);
    }

    @Override // X.InterfaceC2200341B9s
    public final void LJ(C19885612rG c19885612rG) {
        nativeOnBillingSetupFinished(c19885612rG.LIZ, c19885612rG.LIZJ, 0L);
    }

    @Override // X.InterfaceC1796100wq8
    public final void LIZJ(C19885612rG c19885612rG, List<Purchase> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnPurchasesUpdated(c19885612rG.LIZ, c19885612rG.LIZJ, (Purchase[]) list.toArray(new Purchase[list.size()]));
    }

    @Override // X.C1BAM
    public final void LIZLLL(C19885612rG c19885612rG, String str) {
        nativeOnConsumePurchaseResponse(c19885612rG.LIZ, c19885612rG.LIZJ, str, 0L);
    }

    @Override // X.InterfaceC1796090wq7
    public final void LJFF(C19885612rG c19885612rG, List<Purchase> list) {
        nativeOnQueryPurchasesResponse(c19885612rG.LIZ, c19885612rG.LIZJ, (Purchase[]) list.toArray(new Purchase[list.size()]), 0L);
    }
}
