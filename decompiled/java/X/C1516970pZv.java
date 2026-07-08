package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.proto.hybrid.PbDecodersProvider$registerIfAbsent$created$1", f = "PbDecodersProvider.kt", l = {74}, m = "invokeSuspend")
public final class C1516970pZv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1516910pZp<Object>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1516960pZu LLILLJJLI;
    public final /* synthetic */ InterfaceC1507360pKQ<Object> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516970pZv(InterfaceC1516960pZu interfaceC1516960pZu, InterfaceC1507360pKQ<Object> interfaceC1507360pKQ, String str, InterfaceC1364105Vn<? super C1516970pZv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1516960pZu;
        this.LLILLL = interfaceC1507360pKQ;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1516970pZv(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PbDecodersProvider@f829.registerIfAbsent$created$1");
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
            InterfaceC1516960pZu interfaceC1516960pZu = this.LLILLJJLI;
            InterfaceC1507360pKQ<Object> interfaceC1507360pKQ = this.LLILLL;
            String str = this.LLILZ;
            this.LL = 1;
            obj = interfaceC1516960pZu.LIZIZ(interfaceC1507360pKQ, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PbDecodersProvider@f829.registerIfAbsent$created$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PbDecodersProvider@f829.registerIfAbsent$created$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1516910pZp<Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
