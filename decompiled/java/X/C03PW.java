package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03PW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C03PW extends C2217421BqW implements Function2<ChangeInfo, InterfaceC1364105Vn<? super C842503Qx>, Object>, InterfaceC842703Qz {
    public C03PW(Object obj) {
        super(2, obj, MiniOspViewModel.class, "queryBillInfoSuspendForPaymentPage", "queryBillInfoSuspendForPaymentPage(Lcom/ss/android/ugc/aweme/ecommerce/base/osp/repository/dto/ChangeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChangeInfo changeInfo, InterfaceC1364105Vn<? super C842503Qx> interfaceC1364105Vn) {
        return ((MiniOspViewModel) this.receiver).fR2(changeInfo, interfaceC1364105Vn);
    }
}
