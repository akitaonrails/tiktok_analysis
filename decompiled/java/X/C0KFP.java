package X;

import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0KFP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KFP implements C0KLW {
    public final /* synthetic */ C0KFQ LIZ;
    public final /* synthetic */ C0KFL LIZIZ;
    public final /* synthetic */ CompletionBlock<C0KFT> LIZJ;

    @Override // X.C0KLW
    public final void onFail(int i, String str) {
        this.LIZIZ.getClass();
        C0KFT c0kft = (C0KFT) C1549500qQO.LIZ(C0KFT.class);
        c0kft.setPayStatus(Integer.valueOf(i));
        c0kft.setPayMessage(str);
        c0kft.setGetSkuResponse(null);
        c0kft.setPackageId("");
        this.LIZJ.onFailure(0, str, c0kft);
    }

    public C0KFP(C0KFQ c0kfq, C0KFL c0kfl, CompletionBlock<C0KFT> completionBlock) {
        this.LIZ = c0kfq;
        this.LIZIZ = c0kfl;
        this.LIZJ = completionBlock;
    }

    @Override // X.C0KLW
    public final void LIZ(C0KFM c0kfm, String str, String str2, C515650KKd c515650KKd) {
        String str3;
        String str4;
        boolean z;
        String str5;
        SubscribeBadge subscribeBadge;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IapForSubscriptionV2PGCMethod.payCallback.onSuccess, action=RECOVER, packageId=");
        sbLIZ.append(this.LIZ.getPackageId());
        sbLIZ.append(", subscribePayloadOrderId=");
        String str6 = null;
        if (c0kfm != null) {
            str3 = c0kfm.LJJIIZ;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        sbLIZ.append(", secAnchorId=");
        if (c0kfm != null) {
            str4 = c0kfm.LJIIIZ;
        } else {
            str4 = null;
        }
        sbLIZ.append(str4);
        sbLIZ.append(", msg=");
        sbLIZ.append(str);
        sbLIZ.append(", payStatus=");
        sbLIZ.append(1);
        sbLIZ.append(", payMessage=");
        sbLIZ.append(str2);
        sbLIZ.append(", hasBadge=");
        if (c515650KKd != null && c515650KKd.LIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", toast=");
        if (c515650KKd != null) {
            str5 = c515650KKd.LIZIZ;
        } else {
            str5 = null;
        }
        sbLIZ.append(str5);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ.getClass();
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0KFT.class, null);
        C0KFQ c0kfq = this.LIZ;
        C0KFT c0kft = (C0KFT) xBaseModelLIZJ;
        c0kft.setPayStatus(1);
        c0kft.setPayMessage(str2);
        c0kft.setGetSkuResponse(null);
        String packageId = c0kfq.getPackageId();
        if (packageId == null) {
            packageId = "";
        }
        c0kft.setPackageId(packageId);
        if (c515650KKd != null) {
            subscribeBadge = c515650KKd.LIZ;
        } else {
            subscribeBadge = null;
        }
        C512200K6w.LIZ(c0kfm, subscribeBadge);
        if (c515650KKd != null) {
            str6 = c515650KKd.LIZIZ;
        }
        C512200K6w.LIZIZ(str6);
        this.LIZJ.onSuccess(c0kft, str2);
    }
}
