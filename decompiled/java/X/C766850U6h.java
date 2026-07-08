package X;

import Y.AgS202S0200000_12;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.beauty.multiguest.LiveBeautySubItemMultiGuestFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.multiguest.LiveBeautySubItemMultiGuestFragment$registerDataChannel$1", f = "LiveBeautySubItemMultiGuestFragment.kt", l = {78}, m = "invokeSuspend")
public final class C766850U6h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveBeautySubItemMultiGuestFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C766850U6h(LiveBeautySubItemMultiGuestFragment liveBeautySubItemMultiGuestFragment, InterfaceC1364105Vn<? super C766850U6h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveBeautySubItemMultiGuestFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C766850U6h c766850U6h = new C766850U6h(this.LLILLL, interfaceC1364105Vn);
        c766850U6h.LLILLJJLI = obj;
        return c766850U6h;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBeautySubItemMultiGuestFragment@97d6.registerDataChannel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C2252321DDq c2252321DDq = ((LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76()).get(LiveSmallItemBeautyViewModel.class)).LLILZIL;
            AgS202S0200000_12 agS202S0200000_12 = new AgS202S0200000_12(interfaceC497601wk, this.LLILLL, 6);
            this.LL = 1;
            if (c2252321DDq.collect(agS202S0200000_12, this) == objLJFF) {
                C1C7U.LIZIZ("LiveBeautySubItemMultiGuestFragment@97d6.registerDataChannel$1");
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
