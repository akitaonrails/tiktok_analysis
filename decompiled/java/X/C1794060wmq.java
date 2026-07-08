package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.manager.UploadTokenManager;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* JADX INFO: renamed from: X.0wmq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1794060wmq implements InterfaceC1793900wma<ResponseEntity> {
    public final /* synthetic */ UploadTokenManager LIZ;

    public C1794060wmq(UploadTokenManager uploadTokenManager) {
        this.LIZ = uploadTokenManager;
    }

    @Override // X.InterfaceC1793900wma
    public final void LIZ(C1792220wjs c1792220wjs) {
        UploadTokenManager uploadTokenManager = this.LIZ;
        int i = uploadTokenManager.LJ;
        if (i >= uploadTokenManager.LJFF) {
            PaymentServiceManager.get().getGoogleIapExternalService().getRestoreGoogleOrderService().onFailedFinishedTokenUpload(uploadTokenManager.LIZLLL);
            InterfaceC1793900wma<ResponseEntity> interfaceC1793900wma = uploadTokenManager.LJIIJJI;
            if (interfaceC1793900wma != null) {
                interfaceC1793900wma.LIZ(c1792220wjs);
                return;
            }
            return;
        }
        int i2 = i + 1;
        uploadTokenManager.LJ = i2;
        uploadTokenManager.LJI.sendEmptyMessageDelayed(1, ((long) Math.min(Math.max(i2, 1), 5)) * 1000);
    }

    @Override // X.InterfaceC1793900wma
    public final void onSuccess(ResponseEntity responseEntity) {
        ResponseEntity responseEntity2 = responseEntity;
        PaymentServiceManager.get().getGoogleIapExternalService().getRestoreGoogleOrderService().onSuccessFinishedTokenUpload(this.LIZ.LIZLLL);
        UploadTokenManager uploadTokenManager = this.LIZ;
        if (uploadTokenManager.LJIIJJI != null) {
            responseEntity2.setRetryCount(uploadTokenManager.LJ);
            this.LIZ.LJIIJJI.onSuccess(responseEntity2);
        }
    }
}
