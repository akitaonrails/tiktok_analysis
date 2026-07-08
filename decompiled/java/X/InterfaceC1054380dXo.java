package X;

import com.shopify.checkout.models.CheckoutCompletedPayload;
import com.shopify.checkout.models.CheckoutStatePayload;
import com.shopify.checkout.models.ProgressButtonStage;
import com.shopify.checkout.models.ProgressButtonState;
import java.util.List;

/* JADX INFO: renamed from: X.0dXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1054380dXo {
    void LIZ(ProgressButtonState progressButtonState, ProgressButtonStage progressButtonStage);

    void LIZIZ(CheckoutCompletedPayload checkoutCompletedPayload);

    void LIZJ(CheckoutStatePayload checkoutStatePayload);

    void LIZLLL(List<? extends InterfaceC1054410dXr> list);

    void LJ();

    void LJFF(boolean z);

    void LJI(CheckoutStatePayload checkoutStatePayload);

    void onInit();
}
