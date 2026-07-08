package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$countDownJob$1", f = "AIGCOfflineProcessingViewModel.kt", l = {954}, m = "invokeSuspend")
public final class C544550LXh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544550LXh(int i, int i2, AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, int i3, int i4, InterfaceC1364105Vn<? super C544550LXh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = aIGCOfflineProcessingViewModel;
        this.LLIZ = i3;
        this.LLIZLLLIL = i4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C544550LXh c544550LXh = new C544550LXh(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c544550LXh.LLILLL = obj;
        return c544550LXh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C118300cf c118300cf;
        Object value;
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.countDownJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c118300cf = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            c118300cf = new C118300cf();
            c118300cf.element = this.LLILZ;
        }
        while (c118300cf.element <= this.LLILZIL && C2296808zG.LJI(interfaceC497601wk)) {
            C2252321DDq c2252321DDq = this.LLILZLL.LLJILLL;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C0LY8.LIZ((C0LY8) value, null, C2286608xc.LJ(c118300cf.element / LSPassThroughRecordSizeConfig.DEFAULT), null, null, null, null, null, null, null, null, null, null, null, 32765)));
            c118300cf.element += this.LLIZ;
            long j = this.LLIZLLLIL;
            this.LLILLL = interfaceC497601wk;
            this.LL = c118300cf;
            this.LLILLJJLI = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.countDownJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.countDownJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
