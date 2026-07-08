package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.toolbar.TextToImageTitleBarComponent$simulateProgress$1", f = "TextToImageTitleBarComponent.kt", l = {310}, m = "invokeSuspend")
public final class C314960CWg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ DialogC1390150mHN LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314960CWg(int i, int i2, float f, DialogC1390150mHN dialogC1390150mHN, InterfaceC1364105Vn<? super C314960CWg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = f;
        this.LLIZLLLIL = dialogC1390150mHN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C314960CWg c314960CWg = new C314960CWg(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c314960CWg.LLILZ = obj;
        return c314960CWg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        int iMin;
        int i;
        long j;
        C1C7U.LIZ("TextToImageTitleBarComponent@ec65.simulateProgress$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLL;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LLILLJJLI;
                iMin = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
            iMin = Math.min(99, this.LLILZIL);
            i = this.LLILZLL;
        }
        do {
            if (C2296808zG.LJI(interfaceC497601wk)) {
                j = (long) (this.LLIZ * 50);
                if (j < 5) {
                    j = 5;
                }
                if (i >= iMin) {
                    C2296808zG.LIZJ(interfaceC497601wk, null);
                } else {
                    i++;
                    this.LLIZLLLIL.LJJLL(i, false);
                    this.LLILZ = interfaceC497601wk;
                    this.LL = iMin;
                    this.LLILLJJLI = i;
                    this.LLILLL = 1;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.simulateProgress$1");
            return unit;
        } while (AnonymousClass0958.LIZIZ(j, this) != objLJFF);
        C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.simulateProgress$1");
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
