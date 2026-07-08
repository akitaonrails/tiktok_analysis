package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.toolbar.TextToImageTitleBarComponent$clickNext$2", f = "TextToImageTitleBarComponent.kt", l = {}, m = "invokeSuspend")
public final class C314710CVh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ C571990Mc1 LLILZ;
    public final /* synthetic */ DialogC1390150mHN LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314710CVh(DialogC1390150mHN dialogC1390150mHN, C571990Mc1 c571990Mc1, InterfaceC1364105Vn interfaceC1364105Vn, C118300cf c118300cf, C118300cf c118300cf2) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c118300cf;
        this.LLILLL = c118300cf2;
        this.LLILZ = c571990Mc1;
        this.LLILZIL = dialogC1390150mHN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C118300cf c118300cf = this.LLILLJJLI;
        C118300cf c118300cf2 = this.LLILLL;
        C314710CVh c314710CVh = new C314710CVh(this.LLILZIL, this.LLILZ, interfaceC1364105Vn, c118300cf, c118300cf2);
        c314710CVh.LL = obj;
        return c314710CVh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextToImageTitleBarComponent@ec65.clickNext$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        this.LLILLJJLI.element = 0;
        this.LLILLL.element = 0;
        C09AE c09ae = this.LLILZ.LLJILLL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C786410Ut5.K4(this.LLILZIL);
        this.LLILZIL.setOnDismissListener(new DialogInterfaceOnDismissListenerC346380Di0(C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0CSJ(this.LLILZIL, this.LLILZ, null, this.LLILLJJLI, this.LLILLL), 3), this.LLILZ, 0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2");
        return unit;
    }
}
