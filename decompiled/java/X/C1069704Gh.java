package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InstanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InteractiveUserTask;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInteractiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FollowAndClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.04Gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.promotion.SeaPdpPromotionMgr$followAndClaimCoupon$1", f = "SeaPdpPromotionMgr.kt", l = {}, m = "invokeSuspend")
public final class C1069704Gh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Voucher LL;
    public final /* synthetic */ C04GO LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1069704Gh(Voucher voucher, C04GO c04go, Context context, int i, InterfaceC1364105Vn<? super C1069704Gh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = voucher;
        this.LLILLJJLI = c04go;
        this.LLILLL = context;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1069704Gh(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String userTaskId;
        String roomId;
        InstanceInfo instanceInfo;
        InteractiveUserTask taskInfo;
        InteractiveUserTask taskInfo2;
        C1C7U.LIZ("SeaPdpPromotionMgr@45da.followAndClaimCoupon$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1069904Gj c1069904Gj = InterfaceC1069804Gi.LIZ;
        String voucherTypeID = this.LL.getVoucherTypeID();
        VoucherInteractiveInfo interactiveInfo = this.LL.getInteractiveInfo();
        String instanceKey = null;
        if (interactiveInfo != null && (taskInfo2 = interactiveInfo.getTaskInfo()) != null) {
            userTaskId = taskInfo2.getUserTaskId();
        } else {
            userTaskId = null;
        }
        VoucherInteractiveInfo interactiveInfo2 = this.LL.getInteractiveInfo();
        if (interactiveInfo2 != null && (taskInfo = interactiveInfo2.getTaskInfo()) != null) {
            roomId = taskInfo.getRoomId();
        } else {
            roomId = null;
        }
        C1017603yQ c1017603yQ = InterfaceC1018003yU.LIZ;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LLILLJJLI.LIZ.LLIZ;
        c1017603yQ.getClass();
        Integer numLJ = C2286608xc.LJ(C1017603yQ.LIZ(pdpEnterParam));
        List<InstanceInfo> instanceInfoList = this.LL.getInstanceInfoList();
        if (instanceInfoList != null && (instanceInfo = (InstanceInfo) C13LP.LJJJLL(instanceInfoList)) != null) {
            instanceKey = instanceInfo.getInstanceKey();
        }
        FollowAndClaimVoucherRequest followAndClaimVoucherRequest = new FollowAndClaimVoucherRequest(voucherTypeID, userTaskId, null, roomId, numLJ, null, instanceKey);
        c1069904Gj.getClass();
        C11O8 c11o8LJJJLZIJ = ((InterfaceC1069804Gi) C1069904Gj.LIZIZ.create(InterfaceC1069804Gi.class)).LIZLLL(followAndClaimVoucherRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        final C04GO c04go = this.LLILLJJLI;
        final Context context = this.LLILLL;
        final int i = this.LLILZ;
        final Voucher voucher = this.LL;
        c11o8LJJJLZIJ.LIZIZ(new C11N2<ClaimVoucherResponse>() { // from class: X.04Gg
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() throws JSONException {
                c04go.LIZ.LLLLLJIL.LJ(context, i, 1, "", null, voucher);
                dispose();
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) throws JSONException {
                c04go.LIZ.LLLLLJIL.LJ(context, i, 1, "", null, voucher);
                dispose();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC626120Oh8
            public final void onNext(Object obj2) throws JSONException {
                String strValueOf;
                Voucher voucher2;
                boolean z;
                Voucher voucher3;
                String voucherID;
                Response response = (Response) obj2;
                int i2 = 4;
                if (response.isCodeOK()) {
                    ClaimVoucherResponseData claimVoucherResponseData = (ClaimVoucherResponseData) response.data;
                    if (claimVoucherResponseData != null && (voucher3 = claimVoucherResponseData.getVoucher()) != null && (voucherID = voucher3.getVoucherID()) != null && C123100dR.LIZ(voucherID)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    strValueOf = "";
                    if (z) {
                        i2 = 3;
                    } else {
                        ClaimVoucherResponseData claimVoucherResponseData2 = (ClaimVoucherResponseData) response.data;
                        if (claimVoucherResponseData2 == null || !Intrinsics.LJFF(claimVoucherResponseData2.getCanRetry(), Boolean.FALSE)) {
                            i2 = 1;
                        }
                    }
                } else {
                    ClaimVoucherResponseData claimVoucherResponseData3 = (ClaimVoucherResponseData) response.data;
                    if (claimVoucherResponseData3 == null || !Intrinsics.LJFF(claimVoucherResponseData3.getCanRetry(), Boolean.FALSE)) {
                        i2 = 1;
                    }
                    strValueOf = String.valueOf(response.code);
                }
                C04GO c04go2 = c04go;
                Context context2 = context;
                int i3 = i;
                ClaimVoucherResponseData claimVoucherResponseData4 = (ClaimVoucherResponseData) response.data;
                if (claimVoucherResponseData4 != null) {
                    voucher2 = claimVoucherResponseData4.getVoucher();
                } else {
                    voucher2 = null;
                }
                c04go2.LJ(context2, i3, i2, strValueOf, voucher2, voucher);
                dispose();
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpPromotionMgr@45da.followAndClaimCoupon$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
