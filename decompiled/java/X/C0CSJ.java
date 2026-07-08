package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.toolbar.TextToImageTitleBarComponent$clickNext$2$genImageJob$1", f = "TextToImageTitleBarComponent.kt", l = {162}, m = "invokeSuspend")
public final class C0CSJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C571990Mc1 LLILLL;
    public final /* synthetic */ DialogC1390150mHN LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CSJ(DialogC1390150mHN dialogC1390150mHN, C571990Mc1 c571990Mc1, InterfaceC1364105Vn interfaceC1364105Vn, C118300cf c118300cf, C118300cf c118300cf2) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c571990Mc1;
        this.LLILZ = dialogC1390150mHN;
        this.LLILZIL = c118300cf;
        this.LLILZLL = c118300cf2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CSJ c0csj = new C0CSJ(this.LLILZ, this.LLILLL, interfaceC1364105Vn, this.LLILZIL, this.LLILZLL);
        c0csj.LLILLJJLI = obj;
        return c0csj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (2 == ((Number) C276860AtA.LIZ.getValue()).intValue()) {
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0CSI(this.LLILLL, null), 3);
            }
            C23250099c.LIZIZ(interfaceC497601wk, null, null, new C0CSG(this.LLILLL, null), 3);
            C0CSK c0cskW2 = this.LLILLL.w2();
            C314930CWd c314930CWd = new C314930CWd(interfaceC497601wk, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null);
            this.LL = 1;
            if (c0cskW2.sZ0(c314930CWd, this) == objLJFF) {
                C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
