package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PQU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.clicksearch.network.EcClickSearchApiHelper$sendRequest$2", f = "EcClickSearchApiHelper.kt", l = {110, 134}, m = "invokeSuspend")
public final class C0PQU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Function1 LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ EnumC645610PTz LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ Map<String, Object> LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ Function1<C0PQX, Unit> LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0PQU(EnumC645610PTz enumC645610PTz, String str, boolean z, String str2, int i, Map<String, ? extends Object> map, String str3, String str4, Function1<? super C0PQX, Unit> function1, InterfaceC1364105Vn<? super C0PQU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = enumC645610PTz;
        this.LLJI = str;
        this.LLJIJIL = z;
        this.LLJILJIL = str2;
        this.LLJILJILJ = i;
        this.LLJILLL = map;
        this.LLJJ = str3;
        this.LLJJI = str4;
        this.LLJJIII = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0PQU c0pqu = new C0PQU(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
        c0pqu.LLIZLLLIL = obj;
        return c0pqu;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PQU.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
