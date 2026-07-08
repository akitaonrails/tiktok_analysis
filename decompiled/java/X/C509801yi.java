package X;

import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel$sendAction$1", f = "LiveSmallItemBeautyViewModel.kt", l = {279}, m = "invokeSuspend")
public final class C509801yi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LLILLJJLI;
    public final /* synthetic */ AbstractC399701gx<LiveEffect> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C509801yi(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, AbstractC399701gx<? extends LiveEffect> abstractC399701gx, InterfaceC1364105Vn<? super C509801yi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveSmallItemBeautyViewModel;
        this.LLILLL = abstractC399701gx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C509801yi(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSmallItemBeautyViewModel@ff2.sendAction$1");
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
            C1DEK c1dek = this.LLILLJJLI.LLILLJJLI;
            AbstractC399701gx<LiveEffect> abstractC399701gx = this.LLILLL;
            this.LL = 1;
            if (c1dek.LJIJI(abstractC399701gx, this) == objLJFF) {
                C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.sendAction$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.sendAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
