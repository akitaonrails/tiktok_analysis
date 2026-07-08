package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k1P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.recommendeffect.compose.HorizontalCarouselKt$Panel$5$1$1", f = "HorizontalCarousel.kt", l = {221}, m = "invokeSuspend")
public final class C1303370k1P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C1303440k1W LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ C05P0<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303370k1P(C1690080u58 c1690080u58, int i, int i2, C1303440k1W c1303440k1W, Function0<Unit> function0, C05P0<String> c05p0, InterfaceC1364105Vn<? super C1303370k1P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = c1303440k1W;
        this.LLILZLL = function0;
        this.LLIZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1303370k1P(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("HorizontalCarouselKt@558d.Panel$5$1$1");
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
            C1690080u58 c1690080u58 = this.LLILLJJLI;
            int i2 = this.LLILLL;
            int i3 = this.LLILZ;
            this.LL = 1;
            if (c1690080u58.LJFF(i2, i3, this) == objLJFF) {
                C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$5$1$1");
                return objLJFF;
            }
        }
        C05P0<String> c05p0 = this.LLIZ;
        int i4 = this.LLILZIL.LIZLLL;
        if (i4 != -1) {
            if (i4 != 1) {
                str = "";
            } else {
                str = "edit_page_slide_left";
            }
        } else {
            str = "edit_page_slide_right";
        }
        c05p0.setValue(str);
        this.LLILZLL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$5$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
