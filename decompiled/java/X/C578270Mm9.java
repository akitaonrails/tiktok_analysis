package X;

import Y.AgS199S0200000_8;
import android.view.View;
import android.widget.PopupWindow;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mm9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.switchmode.ImageVideoSeparateModeSwitchComponent$addGestureInterceptLayer$1", f = "ImageVideoSeparateModeSwitchApi.kt", l = {279}, m = "invokeSuspend")
public final class C578270Mm9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<EnumC578300MmC> LLILLJJLI;
    public final /* synthetic */ PopupWindow LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C578270Mm9(InterfaceC346201Wa<? extends EnumC578300MmC> interfaceC346201Wa, PopupWindow popupWindow, View view, InterfaceC1364105Vn<? super C578270Mm9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = popupWindow;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578270Mm9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageVideoSeparateModeSwitchComponent@6927.addGestureInterceptLayer$1");
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
            InterfaceC346201Wa<EnumC578300MmC> interfaceC346201Wa = this.LLILLJJLI;
            AgS199S0200000_8 agS199S0200000_8 = new AgS199S0200000_8(this.LLILLL, this.LLILZ, 6);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS199S0200000_8, this) == objLJFF) {
                C1C7U.LIZIZ("ImageVideoSeparateModeSwitchComponent@6927.addGestureInterceptLayer$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageVideoSeparateModeSwitchComponent@6927.addGestureInterceptLayer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
