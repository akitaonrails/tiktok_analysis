package X;

import com.ss.android.ugc.aweme.account.login.trustedfriends.RecoveryStatusPollingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10hg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.trustedfriends.RecoveryStatusPollingService$startRecoveryStatusPolling$1", f = "RecoveryStatusPollingService.kt", l = {111, 134, 181}, m = "invokeSuspend")
public final class C19316610hg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ RecoveryStatusPollingService LLILLL;
    public final /* synthetic */ C238400w2 LLILZ;
    public final /* synthetic */ C013C LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19316610hg(RecoveryStatusPollingService recoveryStatusPollingService, C238400w2 c238400w2, C013C c013c, long j, int i, String str, int i2, InterfaceC1364105Vn<? super C19316610hg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = recoveryStatusPollingService;
        this.LLILZ = c238400w2;
        this.LLILZIL = c013c;
        this.LLILZLL = j;
        this.LLIZ = i;
        this.LLIZLLLIL = str;
        this.LLJ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19316610hg c19316610hg = new C19316610hg(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c19316610hg.LLILLJJLI = obj;
        return c19316610hg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015f -> B:8:0x001e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19316610hg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
