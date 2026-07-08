package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelOpenHelper$open$2", f = "FeedbackPanelOpenHelper.kt", l = {86, 95}, m = "invokeSuspend")
public final class C1536905zz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0604 LLILLJJLI;
    public final /* synthetic */ DialogC1389620mGW LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C19EG LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536905zz(AnonymousClass0604 anonymousClass0604, DialogC1389620mGW dialogC1389620mGW, String str, String str2, String str3, C19EG c19eg, InterfaceC1364105Vn<? super C1536905zz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0604;
        this.LLILLL = dialogC1389620mGW;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1536905zz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1536905zz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
