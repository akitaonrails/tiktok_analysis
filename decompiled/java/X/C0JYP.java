package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.sub.GetSubOnlyLiveInfoResponse;
import webcast.api.sub.VIPSubOnlyLiveSettingInfo;

/* JADX INFO: renamed from: X.0JYP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingVM$fetchVipChoice$1$2$1$5", f = "SubOnlyLiveSettingVM.kt", l = {}, m = "invokeSuspend")
public final class C0JYP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C493830JYf LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ VIPSubOnlyLiveSettingInfo LLILLL;
    public final /* synthetic */ SubOnlyLiveSettingVM LLILZ;
    public final /* synthetic */ GetSubOnlyLiveInfoResponse LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JYP(C493830JYf c493830JYf, C013C c013c, VIPSubOnlyLiveSettingInfo vIPSubOnlyLiveSettingInfo, SubOnlyLiveSettingVM subOnlyLiveSettingVM, GetSubOnlyLiveInfoResponse getSubOnlyLiveInfoResponse, InterfaceC1364105Vn<? super C0JYP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c493830JYf;
        this.LLILLJJLI = c013c;
        this.LLILLL = vIPSubOnlyLiveSettingInfo;
        this.LLILZ = subOnlyLiveSettingVM;
        this.LLILZIL = getSubOnlyLiveInfoResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JYP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.0JYf] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.0JYf] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int size;
        C1C7U.LIZ("SubOnlyLiveSettingVM@cde9.fetchVipChoice$1$2$1$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU c259800zU = new C259800zU();
        ?? r1 = this.LL;
        c259800zU.element = r1;
        if (!this.LLILLJJLI.element) {
            if (r1.LIZIZ == 0 && (size = this.LLILLL.planCategoryList.size()) >= 0 && size < 2) {
                i = 1;
            } else {
                i = this.LL.LIZIZ;
            }
            ?? c493830JYf = new C493830JYf(i, 0, this.LLILLL.monthCategoryList.size(), 0L, 0L, C497740JfY.LJIJI(2131857042));
            c259800zU.element = c493830JYf;
            C0KPJ.df.LIZJ(C0JYR.LIZIZ(c493830JYf));
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131857033, this.LL.LIZ));
        }
        this.LLILZ.setState(new C0JYO(this.LLILZIL, c259800zU));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyLiveSettingVM@cde9.fetchVipChoice$1$2$1$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
