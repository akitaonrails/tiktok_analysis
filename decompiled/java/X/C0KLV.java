package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KLV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.implement.productfetch.ResubscribeStrategy$resubscribe$2", f = "ResubscribeStrategy.kt", l = {110, 149, 162, 176}, m = "invokeSuspend")
public final class C0KLV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public C259800zU LLILLL;
    public C259800zU LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C0KLW LLIZLLLIL;
    public final /* synthetic */ C19EG LLJ;
    public final /* synthetic */ C0KLA LLJI;
    public final /* synthetic */ C0KMZ LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KLV(C0KLW c0klw, C19EG c19eg, C0KLA c0kla, C0KMZ c0kmz, InterfaceC1364105Vn<? super C0KLV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c0klw;
        this.LLJ = c19eg;
        this.LLJI = c0kla;
        this.LLJIJIL = c0kmz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0KLV c0klv = new C0KLV(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c0klv.LLIZ = obj;
        return c0klv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KLV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
