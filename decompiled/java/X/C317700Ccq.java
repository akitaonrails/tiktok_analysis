package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ccq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageListScene$config$2$1$onLoadMore$1", f = "Text2ImageListScene.kt", l = {438}, m = "invokeSuspend")
public final class C317700Ccq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C558180Luq LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Boolean>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C317700Ccq(C558180Luq c558180Luq, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C317700Ccq> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = c558180Luq;
        this.LLILZ = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C317700Ccq c317700Ccq = new C317700Ccq(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c317700Ccq.LLILLJJLI = obj;
        return c317700Ccq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageListScene@1b50.config$2$1$onLoadMore$1");
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
            C572850MdP c572850MdPLLLILZ = this.LLILLL.LLLILZ();
            C317690Ccp c317690Ccp = new C317690Ccp(interfaceC497601wk, this.LLILZ, this.LLILLL, null);
            this.LL = 1;
            if (c572850MdPLLLILZ.s12(false, c317690Ccp, this) == objLJFF) {
                C1C7U.LIZIZ("Text2ImageListScene@1b50.config$2$1$onLoadMore$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Text2ImageListScene@1b50.config$2$1$onLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
