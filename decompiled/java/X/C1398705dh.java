package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS27S0600000_2;
import njp.a;

/* JADX INFO: renamed from: X.05dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.list.compose.utils.LazyListProxyView$fling$1$1", f = "LazyListProxyView.kt", l = {243}, m = "invokeSuspend")
public final class C1398705dh extends C09AX implements Function2<InterfaceC1392705cj, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C817403Hg LLILLL;
    public final /* synthetic */ InterfaceC1677940tlY<Float> LLILZ;
    public final /* synthetic */ C817403Hg LLILZIL;
    public final /* synthetic */ C1690080u58 LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1398705dh(C817403Hg c817403Hg, InterfaceC1677940tlY<Float> interfaceC1677940tlY, C817403Hg c817403Hg2, C1690080u58 c1690080u58, int i, InterfaceC1364105Vn<? super C1398705dh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c817403Hg;
        this.LLILZ = interfaceC1677940tlY;
        this.LLILZIL = c817403Hg2;
        this.LLILZLL = c1690080u58;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1398705dh c1398705dh = new C1398705dh(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1398705dh.LLILLJJLI = obj;
        return c1398705dh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LazyListProxyView@932e.fling$1$1");
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
            InterfaceC1392705cj interfaceC1392705cj = (InterfaceC1392705cj) this.LLILLJJLI;
            C817403Hg c817403Hg = new C817403Hg();
            C118300cf c118300cf = new C118300cf();
            C118300cf c118300cf2 = new C118300cf();
            C1677580tky c1677580tkyLIZ = C1677590tkz.LIZ(0.0f, this.LLILLL.element, 28);
            InterfaceC1677940tlY<Float> interfaceC1677940tlY = this.LLILZ;
            AwS27S0600000_2 awS27S0600000_2 = new AwS27S0600000_2(c817403Hg, c118300cf, interfaceC1392705cj, c118300cf2, this.LLILZIL, this.LLILZLL, 3);
            this.LLILLJJLI = c118300cf;
            this.LL = 1;
            if (C1677810tlL.LIZLLL(c1677580tkyLIZ, interfaceC1677940tlY, false, awS27S0600000_2, this) == objLJFF) {
                C1C7U.LIZIZ("LazyListProxyView@932e.fling$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LazyListProxyView@932e.fling$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1392705cj interfaceC1392705cj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1392705cj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
