package X;

import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U7Z, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel$fetchAiBeautyUntilEnd$1", f = "LiveSmallItemBeautyViewModel.kt", l = {361}, m = "invokeSuspend")
public final class C0U7Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U7Z(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, String str, long j, String str2, InterfaceC1364105Vn<? super C0U7Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveSmallItemBeautyViewModel;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U7Z(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSmallItemBeautyViewModel@ff2.fetchAiBeautyUntilEnd$1");
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
            this.LLILLJJLI.LLJJ = System.currentTimeMillis();
            LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = this.LLILLJJLI;
            liveSmallItemBeautyViewModel.LLILZLL = EnumC767070U7d.ANALYZING;
            C767080U7e c767080U7e = new C767080U7e();
            c767080U7e.LJ = this.LLILLL;
            liveSmallItemBeautyViewModel.LLJI = c767080U7e;
            C2501109r7 c2501109r7 = new C2501109r7(new C510101yl(this.LLILLJJLI, null), new C095D(new C767040U7a(liveSmallItemBeautyViewModel, this.LLILZ, null)), 0);
            C0U7W c0u7w = new C0U7W(this.LLILLJJLI, this.LLILLL, this.LLILZIL);
            this.LL = 1;
            if (c2501109r7.collect(c0u7w, this) == objLJFF) {
                C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.fetchAiBeautyUntilEnd$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.fetchAiBeautyUntilEnd$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
