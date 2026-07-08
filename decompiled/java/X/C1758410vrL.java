package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.starter.SeaPdpStarterOptimized$jump2PdpInterceptor$1$1", f = "SeaPdpStarterOptimized.kt", l = {380}, m = "invokeSuspend")
public final class C1758410vrL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public C11JF LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ IPdpStarter.PdpEnterParam LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1758370vrH LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ C19EG LLJ;
    public final /* synthetic */ C1758390vrJ LLJI;
    public final /* synthetic */ long LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1758410vrL(IPdpStarter.PdpEnterParam pdpEnterParam, String str, C1758370vrH c1758370vrH, boolean z, Function0<Unit> function0, C19EG c19eg, C1758390vrJ c1758390vrJ, long j, InterfaceC1364105Vn<? super C1758410vrL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = pdpEnterParam;
        this.LLILZIL = str;
        this.LLILZLL = c1758370vrH;
        this.LLIZ = z;
        this.LLIZLLLIL = function0;
        this.LLJ = c19eg;
        this.LLJI = c1758390vrJ;
        this.LLJIJIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1758410vrL(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758410vrL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
