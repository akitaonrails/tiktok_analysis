package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D7R, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.TokenGenerator$getAuthContextSync$1", f = "TokenGenerator.kt", l = {69}, m = "invokeSuspend")
public final class C0D7R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C334060D7s>, Object> {
    public int LL;
    public final /* synthetic */ C334070D7t LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D7R(C334070D7t c334070D7t, String str, InterfaceC1364105Vn<? super C0D7R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c334070D7t;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D7R(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TokenGenerator@937f.getAuthContextSync$1");
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
            C334070D7t c334070D7t = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = c334070D7t.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TokenGenerator@937f.getAuthContextSync$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TokenGenerator@937f.getAuthContextSync$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C334060D7s> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
