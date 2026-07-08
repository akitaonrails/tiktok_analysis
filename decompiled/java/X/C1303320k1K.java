package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.recommendeffect.compose.HorizontalCarouselKt$Panel$1$1", f = "HorizontalCarousel.kt", l = {123, 129}, m = "invokeSuspend")
public final class C1303320k1K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P0<EnumC994870bzp> LLILLJJLI;
    public final /* synthetic */ C05P0<Float> LLILLL;
    public final /* synthetic */ C05P0<Float> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303320k1K(C05P0<EnumC994870bzp> c05p0, C05P0<Float> c05p02, C05P0<Float> c05p03, InterfaceC1364105Vn<? super C1303320k1K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
        this.LLILZ = c05p03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1303320k1K(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HorizontalCarouselKt@558d.Panel$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Float fValueOf = Float.valueOf(1.0f);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLL.setValue(fValueOf);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                this.LLILZ.setValue(fValueOf);
                this.LLILLL.setValue(fValueOf);
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.getValue() == EnumC994870bzp.SHOW) {
                this.LLILLL.setValue(Float.valueOf(0.5f));
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                    C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$1$1");
                    return objLJFF;
                }
                this.LLILZ.setValue(fValueOf);
                this.LLILLL.setValue(fValueOf);
            } else {
                this.LLILZ.setValue(Float.valueOf(0.0f));
                this.LLILLL.setValue(Float.valueOf(0.5f));
                this.LL = 2;
                if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                    C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$1$1");
                    return objLJFF;
                }
                this.LLILLL.setValue(fValueOf);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
