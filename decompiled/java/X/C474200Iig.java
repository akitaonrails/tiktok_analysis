package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widgets.giftwidget.presenter.FastGiftConfirmDialog;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.widgets.giftwidget.presenter.FastGiftConfirmDialog$showLottieView$2", f = "FastGiftConfirmDialog.kt", l = {245}, m = "invokeSuspend")
public final class C474200Iig extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FastGiftConfirmDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474200Iig(FastGiftConfirmDialog fastGiftConfirmDialog, InterfaceC1364105Vn<? super C474200Iig> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fastGiftConfirmDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C474200Iig(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("FastGiftConfirmDialog@e3a5.showLottieView$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0KZZ c0kzz = C0KZZ.LIZ;
            C1295960jpS c1295960jpSPR = this.LLILLJJLI.PR();
            if (C497740JfY.LJJ()) {
                str = "ttlive_first_gift_large_lottie_rtl.zip";
            } else {
                str = "ttlive_first_gift_large_lottie_ltr.zip";
            }
            List<String> listSingletonList = Collections.singletonList("image_4");
            List<? extends ImageModel> listSingletonList2 = Collections.singletonList(UserService.getInstance().user().getCurrentUser().getAvatarMedium());
            Integer numLJ = C2286608xc.LJ((int) C497740JfY.LIZIZ(36.0f));
            Integer numLJ2 = C2286608xc.LJ((int) C497740JfY.LIZIZ(36.0f));
            this.LL = 1;
            if (c0kzz.LIZJ(c1295960jpSPR, str, listSingletonList, listSingletonList2, numLJ, numLJ2, true, true, C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_revenue_demand_1"), this) == objLJFF) {
                C1C7U.LIZIZ("FastGiftConfirmDialog@e3a5.showLottieView$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FastGiftConfirmDialog@e3a5.showLottieView$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
