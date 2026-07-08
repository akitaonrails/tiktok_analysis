package X;

import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveMultiGuestEffectFetchUtils$restoreMultiGuestEffectToLiveCoreForGuest$1", f = "LiveMultiGuestEffectFetchUtils.kt", l = {38}, m = "invokeSuspend")
public final class C509901yj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LLILLJJLI;
    public final /* synthetic */ C0U78 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509901yj(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, C0U78 c0u78, InterfaceC1364105Vn<? super C509901yj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveSmallItemBeautyViewModel;
        this.LLILLL = c0u78;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C509901yj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMultiGuestEffectFetchUtils@fbdb.restoreMultiGuestEffectToLiveCoreForGuest$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
            C517001zs c517001zs = new C517001zs(this.LLILLL, 16);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, c517001zs, this) == objLJFF) {
                C1C7U.LIZIZ("LiveMultiGuestEffectFetchUtils@fbdb.restoreMultiGuestEffectToLiveCoreForGuest$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
