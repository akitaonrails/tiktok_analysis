package X;

import Y.AgS293S0100000_12;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.anchor.BeautyItemAnchorHandler$observeData$3", f = "BeautyItemAnchorHandler.kt", l = {67}, m = "invokeSuspend")
public final class C766560U5e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0U6R LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C766560U5e(C0U6R c0u6r, InterfaceC1364105Vn<? super C766560U5e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0u6r;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C766560U5e(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDq;
        C1C7U.LIZ("BeautyItemAnchorHandler@f300.observeData$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0U6R c0u6r = this.LLILLJJLI;
            LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = c0u6r.LJIIJJI;
            if (liveSmallItemBeautyViewModel != null && (c2252321DDq = liveSmallItemBeautyViewModel.LLILZIL) != null) {
                AgS293S0100000_12 agS293S0100000_12 = new AgS293S0100000_12(c0u6r, 41);
                this.LL = 1;
                if (c2252321DDq.collect(agS293S0100000_12, this) == objLJFF) {
                    C1C7U.LIZIZ("BeautyItemAnchorHandler@f300.observeData$3");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BeautyItemAnchorHandler@f300.observeData$3");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
