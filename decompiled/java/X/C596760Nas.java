package X;

import com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl$onCommandReceived$2", f = "TakoClientAgentServiceImpl.kt", l = {172, 210, 212}, m = "invokeSuspend")
public final class C596760Nas extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C596790Nav LLILZIL;
    public InterfaceC497601wk LLILZLL;
    public long LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ InterfaceC596810Nax LLJI;
    public final /* synthetic */ AgentCommandRequest LLJIJIL;
    public final /* synthetic */ TakoClientAgentServiceImpl LLJILJIL;
    public final /* synthetic */ long LLJILJILJ;
    public final /* synthetic */ InterfaceC596800Naw LLJILLL;
    public final /* synthetic */ C596790Nav LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596760Nas(InterfaceC596810Nax interfaceC596810Nax, AgentCommandRequest agentCommandRequest, TakoClientAgentServiceImpl takoClientAgentServiceImpl, long j, InterfaceC596800Naw interfaceC596800Naw, C596790Nav c596790Nav, InterfaceC1364105Vn<? super C596760Nas> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = interfaceC596810Nax;
        this.LLJIJIL = agentCommandRequest;
        this.LLJILJIL = takoClientAgentServiceImpl;
        this.LLJILJILJ = j;
        this.LLJILLL = interfaceC596800Naw;
        this.LLJJ = c596790Nav;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C596760Nas c596760Nas = new C596760Nas(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
        c596760Nas.LLJ = obj;
        return c596760Nas;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|(1:105)|(6:(1:(1:(7:7|76|77|89|(1:91)|92|93)(2:8|9))(11:10|96|11|70|72|(2:74|75)|77|89|(0)|92|93))(3:12|103|13)|88|89|(0)|92|93)(16:16|17|(1:22)(2:21|23)|(1:25)(3:(4:29|(1:31)(1:35)|32|(1:34))|37|(2:39|40)(1:41))|36|94|43|99|44|98|(2:46|47)(4:(1:52)(2:51|53)|(1:55)|(1:62)(2:59|63)|(11:65|66|(2:68|69)|70|72|(0)|77|89|(0)|92|93)(8:71|72|(0)|77|89|(0)|92|93))|88|89|(0)|92|93)|101|42|94|43|99|44|98|(0)(0)|88|89|(0)|92|93) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0147, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01aa, code lost:
    
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ac, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b1, code lost:
    
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b2, code lost:
    
        r11 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f A[Catch: all -> 0x0147, TRY_ENTER, TryCatch #2 {all -> 0x0147, blocks: (B:46:0x011f, B:49:0x0127, B:55:0x0133, B:57:0x0140), top: B:98:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cf  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C596760Nas.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
