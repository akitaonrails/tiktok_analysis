package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.toolbar.TextToImageTitleBarComponent$clickNext$2$genImageJob$1$3$2", f = "TextToImageTitleBarComponent.kt", l = {}, m = "invokeSuspend")
public final class C314940CWe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ DialogC1390150mHN LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ C571990Mc1 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314940CWe(int i, C118300cf c118300cf, DialogC1390150mHN dialogC1390150mHN, C118300cf c118300cf2, C571990Mc1 c571990Mc1, InterfaceC1364105Vn<? super C314940CWe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = dialogC1390150mHN;
        this.LLILZ = c118300cf2;
        this.LLILZIL = c571990Mc1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314940CWe(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLJJIJIIJI;
        int progress;
        C1C7U.LIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC314970CWh[] enumC314970CWhArrValues = EnumC314970CWh.values();
        int i = this.LL;
        int length = enumC314970CWhArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                EnumC314970CWh enumC314970CWh = enumC314970CWhArrValues[i2];
                if (enumC314970CWh.getProgress() == i) {
                    iLJJIJIIJI = C13LQ.LJJIJIIJI(enumC314970CWh, enumC314970CWhArrValues);
                    break;
                }
                i2++;
            } else {
                iLJJIJIIJI = -1;
                break;
            }
        }
        int i3 = this.LL;
        int i4 = this.LLILLJJLI.element;
        if (i3 < i4) {
            this.LLILLL.LJJLL(i4, false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3$2");
            return unit;
        }
        EnumC314970CWh enumC314970CWh2 = (EnumC314970CWh) C13LQ.LJJIIZ(iLJJIJIIJI + 1, enumC314970CWhArrValues);
        if (enumC314970CWh2 != null) {
            progress = enumC314970CWh2.getProgress();
        } else {
            progress = this.LL;
        }
        int i5 = this.LL;
        if (progress <= i5) {
            this.LLILLJJLI.element = i5;
            this.LLILZ.element = i5;
            this.LLILLL.LJJLL(i5, false);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3$2");
            return unit2;
        }
        double d = 31.0d / ((double) (progress - i5));
        this.LLILLJJLI.element = i5;
        this.LLILZ.element = i5;
        C09AE c09ae = this.LLILZIL.LLJILLL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C571990Mc1 c571990Mc1 = this.LLILZIL;
        c571990Mc1.LLJILLL = c571990Mc1.c3((float) d, progress, this.LLILLL, this.LLILLJJLI.element, this.LLILZ.element);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
