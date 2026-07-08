package X;

import Y.AgS78S1200000_14;
import com.ss.android.ugc.aweme.im.streaming.sugar.StreamingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.sugar.StreamingViewModel$newTrackedStream$job$1", f = "StreamingViewModel.kt", l = {75}, m = "invokeSuspend")
public final class C905740Zg4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<InterfaceC905820ZgC> LLILLJJLI;
    public final /* synthetic */ InterfaceC332260D0u<InterfaceC905820ZgC> LLILLL;
    public final /* synthetic */ StreamingViewModel LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C905740Zg4(InterfaceC346201Wa<? extends InterfaceC905820ZgC> interfaceC346201Wa, InterfaceC332260D0u<InterfaceC905820ZgC> interfaceC332260D0u, StreamingViewModel streamingViewModel, String str, InterfaceC1364105Vn<? super C905740Zg4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = interfaceC332260D0u;
        this.LLILZ = streamingViewModel;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C905740Zg4(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamingViewModel@690d.newTrackedStream$job$1");
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
            InterfaceC346201Wa<InterfaceC905820ZgC> interfaceC346201Wa = this.LLILLJJLI;
            AgS78S1200000_14 agS78S1200000_14 = new AgS78S1200000_14(this.LLILZIL, this.LLILLL, this.LLILZ, 0);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS78S1200000_14, this) == objLJFF) {
                C1C7U.LIZIZ("StreamingViewModel@690d.newTrackedStream$job$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamingViewModel@690d.newTrackedStream$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
