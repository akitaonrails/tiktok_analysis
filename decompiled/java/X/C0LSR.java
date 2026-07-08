package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput;
import com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LSR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationQuotaTask$run$2", f = "AICreationQuotaTask.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT, 44, 54, 68}, m = "invokeSuspend")
public final class C0LSR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LQD>, Object> {
    public QuotaResult LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C0LSS LLILZ;
    public final /* synthetic */ CommonAigcQuotaInput LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LSR(C0LSS c0lss, CommonAigcQuotaInput commonAigcQuotaInput, InterfaceC1364105Vn<? super C0LSR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0lss;
        this.LLILZIL = commonAigcQuotaInput;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LSR(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LQD> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
