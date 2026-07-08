package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0amI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel$dispatchIntent$1", f = "MultiGuestPreviewLiveSettingViewModel.kt", l = {74}, m = "invokeSuspend")
public final class C948040amI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MultiGuestPreviewLiveSettingViewModel LLILLJJLI;
    public final /* synthetic */ AbstractC948200amY LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C948040amI(MultiGuestPreviewLiveSettingViewModel multiGuestPreviewLiveSettingViewModel, AbstractC948200amY abstractC948200amY, InterfaceC1364105Vn<? super C948040amI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = multiGuestPreviewLiveSettingViewModel;
        this.LLILLL = abstractC948200amY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C948040amI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiGuestPreviewLiveSettingViewModel@4186.dispatchIntent$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILZLL;
            C948170amV c948170amV = new C948170amV(((C948150amT) this.LLILLL).LIZ);
            this.LL = 1;
            if (c2252331DDr.emit(c948170amV, this) == objLJFF) {
                C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.dispatchIntent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.dispatchIntent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
