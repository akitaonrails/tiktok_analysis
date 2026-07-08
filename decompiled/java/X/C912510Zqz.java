package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.chat.ReportChatMsgManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.report.ReportUtils$report$1", f = "ReportUtils.kt", l = {102}, m = "invokeSuspend")
public final class C912510Zqz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C912520Zr0 LL;
    public C912540Zr2 LLILLJJLI;
    public ReportChatMsgManager LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ InterfaceC1688806jO LLILZLL;
    public final /* synthetic */ C869590Y9l LLIZ;
    public final /* synthetic */ Activity LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C912510Zqz(InterfaceC1688806jO interfaceC1688806jO, C869590Y9l c869590Y9l, Activity activity, boolean z, InterfaceC1364105Vn<? super C912510Zqz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = interfaceC1688806jO;
        this.LLIZ = c869590Y9l;
        this.LLIZLLLIL = activity;
        this.LLJ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C912510Zqz(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C912510Zqz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
