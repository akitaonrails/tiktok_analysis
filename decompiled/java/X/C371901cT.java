package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.templatedownload.TemplateProducer$getProducedTemplateZip$1", f = "TemplateProducer.kt", l = {102}, m = "invokeSuspend")
public final class C371901cT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ AnonymousClass0957<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C371901cT(C259800zU<String> c259800zU, AnonymousClass0957<String> anonymousClass0957, InterfaceC1364105Vn<? super C371901cT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C371901cT(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU<String> c259800zU;
        T t;
        C1C7U.LIZ("TemplateProducer@ae93.getProducedTemplateZip$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
                t = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = this.LLILLL;
            AnonymousClass0957<String> anonymousClass0957 = this.LLILZ;
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            Object objLJLIIIL = anonymousClass0957.LJLIIIL(this);
            t = objLJLIIIL;
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("TemplateProducer@ae93.getProducedTemplateZip$1");
                return objLJFF;
            }
        }
        c259800zU.element = t;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateProducer@ae93.getProducedTemplateZip$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
