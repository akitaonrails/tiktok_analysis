package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ccu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageListScene$refreshPageWithSkeleton$1$1$1", f = "Text2ImageListScene.kt", l = {}, m = "invokeSuspend")
public final class C317740Ccu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C558180Luq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317740Ccu(int i, boolean z, C558180Luq c558180Luq, InterfaceC1364105Vn<? super C317740Ccu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = c558180Luq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317740Ccu(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageListScene@1b50.refreshPageWithSkeleton$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        EnumC314970CWh enumC314970CWh = EnumC314970CWh.FAIL;
        if (i == enumC314970CWh.getProgress() && this.LLILLJJLI) {
            this.LLILLL.LLLILZ().wp0(true);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("Text2ImageListScene@1b50.refreshPageWithSkeleton$1$1$1");
            return unit;
        }
        if (this.LL == enumC314970CWh.getProgress() && !this.LLILLJJLI) {
            this.LLILLL.LLLILZ().wp0(true);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("Text2ImageListScene@1b50.refreshPageWithSkeleton$1$1$1");
            return unit2;
        }
        if (this.LL != EnumC314970CWh.NLE_FINISH.getProgress()) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("Text2ImageListScene@1b50.refreshPageWithSkeleton$1$1$1");
            return unit3;
        }
        C558180Luq c558180Luq = this.LLILLL;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = c558180Luq.LLJILLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) c558180Luq.LLJLLL.getValue());
        }
        this.LLILLL.LLLILZ().DJ1(false);
        InterfaceC1460000o62 interfaceC1460000o62LLLIILIL = this.LLILLL.LLLIILIL();
        if (interfaceC1460000o62LLLIILIL != null) {
            interfaceC1460000o62LLLIILIL.BJ(true);
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("Text2ImageListScene@1b50.refreshPageWithSkeleton$1$1$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
