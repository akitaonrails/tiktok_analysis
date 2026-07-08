package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KME, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.implement.productfetch.ResubscribeStrategy$resubscribe$1", f = "ResubscribeStrategy.kt", l = {105, 123, 124, 169}, m = "invokeSuspend")
public final class C0KME extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C259800zU LLILLJJLI;
    public TemplateInfo LLILLL;
    public Object LLILZ;
    public C259800zU LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C0KMQ LLIZLLLIL;
    public final /* synthetic */ C0KMN LLJ;
    public final /* synthetic */ C19EG LLJI;
    public final /* synthetic */ C0KJX LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KME(C0KMQ c0kmq, C0KMN c0kmn, C19EG c19eg, C0KJX c0kjx, InterfaceC1364105Vn<? super C0KME> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c0kmq;
        this.LLJ = c0kmn;
        this.LLJI = c19eg;
        this.LLJIJIL = c0kjx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0KME c0kme = new C0KME(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c0kme.LLIZ = obj;
        return c0kme;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159 A[LOOP:0: B:53:0x0153->B:55:0x0159, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0204  */
    /* JADX WARN: Type inference failed for: r0v127, types: [T, java.lang.String] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KME.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
