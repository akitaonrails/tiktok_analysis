package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CuH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.ui.MarkdownTextViewExt$createMarkdownContentAsync$1", f = "MarkdownTextViewExt.kt", l = {189}, m = "invokeSuspend")
public final class C328510CuH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1860130yVP LLILLJJLI;
    public final /* synthetic */ C21419418s4 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<InterfaceC342000Daw, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C328510CuH(C1860130yVP c1860130yVP, C21419418s4 c21419418s4, String str, Function1<? super InterfaceC342000Daw, Unit> function1, InterfaceC1364105Vn<? super C328510CuH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1860130yVP;
        this.LLILLL = c21419418s4;
        this.LLILZ = str;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328510CuH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MarkdownTextViewExt@7986.createMarkdownContentAsync$1");
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
            InterfaceC342000Daw interfaceC342000DawLIZIZ = C341990Dav.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C328500CuG c328500CuG = new C328500CuG(this.LLILZIL, interfaceC342000DawLIZIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c328500CuG) == objLJFF) {
                C1C7U.LIZIZ("MarkdownTextViewExt@7986.createMarkdownContentAsync$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MarkdownTextViewExt@7986.createMarkdownContentAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
