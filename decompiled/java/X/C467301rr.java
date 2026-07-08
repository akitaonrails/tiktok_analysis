package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.main.functions.notification.page.MinisNotificationSettingFragment$initView$1$2$1$1$1", f = "MinisNotificationSettingFragment.kt", l = {}, m = "invokeSuspend")
public final class C467301rr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseResponse LL;
    public final /* synthetic */ C127M LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C467301rr(BaseResponse baseResponse, C127M c127m, InterfaceC1364105Vn<? super C467301rr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseResponse;
        this.LLILLJJLI = c127m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C467301rr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisNotificationSettingFragment@e13.initView$1$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BaseResponse baseResponse = this.LL;
        if (baseResponse != null) {
            if (baseResponse.status_code == 0) {
                ((C11GO) this.LLILLJJLI).LJIILJJIL(!((C11GO) r0).LJIILIIL());
            } else {
                C127M c127m = this.LLILLJJLI;
                ((C11GO) c127m).LJIILJJIL(((C11GO) c127m).LJIILIIL());
            }
        } else {
            C127M c127m2 = this.LLILLJJLI;
            ((C11GO) c127m2).LJIILJJIL(((C11GO) c127m2).LJIILIIL());
        }
        this.LLILLJJLI.LJIIJJI(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisNotificationSettingFragment@e13.initView$1$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
