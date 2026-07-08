package X;

import com.bytedance.android.livesdk.model.message.Voucher;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import njp.a;
import webcast.data.oec_msg.PopCardInfo;
import webcast.data.oec_msg.VoucherItem;

/* JADX INFO: renamed from: X.17uW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.AbsECLiveExplanationCardWidget$setVoucherByMessage$1", f = "AbsECLiveExplanationCardWidget.kt", l = {1667}, m = "invokeSuspend")
public final class C21179817uW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ AbstractC21194217wq LLILLL;
    public final /* synthetic */ ECommerceMessage LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21179817uW(C013C c013c, AbstractC21194217wq abstractC21194217wq, ECommerceMessage eCommerceMessage, InterfaceC1364105Vn<? super C21179817uW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = abstractC21194217wq;
        this.LLILZ = eCommerceMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21179817uW(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        int i;
        int i2;
        String str;
        String str2;
        C1C7U.LIZ("AbsECLiveExplanationCardWidget@7dc4.setVoucherByMessage$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        if (i3 != 0) {
            if (i3 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.element && !C294670Bgn.LIZ()) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(400L, this) == objLJFF) {
                    C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.setVoucherByMessage$1");
                    return objLJFF;
                }
            }
        }
        VoucherItem voucherItem = new VoucherItem();
        Voucher voucher = this.LLILZ.voucher;
        long j2 = 0;
        if (voucher != null) {
            j = voucher.voucherTypeId;
        } else {
            j = 0;
        }
        voucherItem.voucherTypeId = j;
        if (voucher != null) {
            j2 = voucher.taskId;
        }
        voucherItem.taskId = j2;
        if (voucher != null) {
            i = voucher.taskType;
        } else {
            i = 0;
        }
        voucherItem.taskType = i;
        if (voucher != null) {
            i2 = voucher.liveVoucherType;
        } else {
            i2 = 0;
        }
        voucherItem.liveVoucherType = i2;
        String str3 = "";
        if (voucher == null || (str = voucher.creatorOperationUniqueId) == null) {
            str = "";
        }
        voucherItem.creatorOperationUniqueId = str;
        if (voucher != null && (str2 = voucher.voucherMaxFaceValue) != null) {
            str3 = str2;
        }
        voucherItem.voucherMaxFaceValue = str3;
        PopCardInfo popCardInfo = new PopCardInfo();
        popCardInfo.popCardType = 3;
        AbstractC21194217wq abstractC21194217wq = this.LLILLL;
        C21179117uP c21179117uP = abstractC21194217wq.LLLILZ;
        AbstractC21196217xA abstractC21196217xALJJIJLIJ = abstractC21194217wq.LJJIJLIJ();
        ECommerceMessage eCommerceMessage = this.LLILZ;
        int iLJJIJL = this.LLILLL.LJJIJL(false);
        AbstractC21194217wq abstractC21194217wq2 = this.LLILLL;
        c21179117uP.LIZ(abstractC21196217xALJJIJLIJ, eCommerceMessage, null, popCardInfo, voucherItem, iLJJIJL, false, false, "message_request", abstractC21194217wq2.LLJJJJ, new AwS611S0100000_32(abstractC21194217wq2, 227), new C21179917uX(this.LLILLL), new AwS611S0100000_32(this.LLILLL, 228), new AwS576S0100000_32(this.LLILLL, 453));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.setVoucherByMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
