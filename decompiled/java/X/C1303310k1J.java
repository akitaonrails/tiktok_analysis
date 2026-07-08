package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.recommendeffect.compose.HorizontalCarouselKt$Panel$2$1", f = "HorizontalCarousel.kt", l = {136}, m = "invokeSuspend")
public final class C1303310k1J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05P0 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C05P0<EnumC994870bzp> LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303310k1J(C05P0<EnumC994870bzp> c05p0, C05P0<Boolean> c05p02, InterfaceC1364105Vn<? super C1303310k1J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05p0;
        this.LLILZ = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1303310k1J(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05P0<Boolean> c05p0;
        C1C7U.LIZ("HorizontalCarouselKt@558d.Panel$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                c05p0 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c05p0 = this.LLILZ;
            if (this.LLILLL.getValue() == EnumC994870bzp.HIDE) {
                this.LL = c05p0;
                this.LLILLJJLI = 1;
                if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                    C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$2$1");
                    return objLJFF;
                }
            } else {
                z = false;
            }
        }
        c05p0.setValue(Boolean.valueOf(z));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
