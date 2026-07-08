package X;

import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IAC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel$sendMessage$5", f = "SendMessageViewModel.kt", l = {170, 171}, m = "invokeSuspend")
public final class C0IAC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SendMessageViewModel LLILLJJLI;
    public final /* synthetic */ CharSequence LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<RichTextInfo> LLILZLL;
    public final /* synthetic */ C0IAQ LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;
    public final /* synthetic */ Map<String, String> LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ C05YC<C0IAH<Object>> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IAC(SendMessageViewModel sendMessageViewModel, CharSequence charSequence, String str, String str2, List<RichTextInfo> list, C0IAQ c0iaq, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, String str3, C05YC<C0IAH<Object>> c05yc, InterfaceC1364105Vn<? super C0IAC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sendMessageViewModel;
        this.LLILLL = charSequence;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = list;
        this.LLIZ = c0iaq;
        this.LLIZLLLIL = map;
        this.LLJ = map2;
        this.LLJI = map3;
        this.LLJIJIL = str3;
        this.LLJILJIL = c05yc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IAC(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0IAC for r15v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r5 = r16
            java.lang.String r4 = "SendMessageViewModel@52c6.sendMessage$5"
            X.C1C7U.LIZ(r4)
            java.lang.Object r2 = X.C099R.LJFF()
            int r3 = r15.LL
            r1 = 2
            r0 = 1
            if (r3 == 0) goto L1e
            if (r3 == r0) goto L41
            if (r3 != r1) goto L52
            X.C155000ia.LIZIZ(r5)
        L18:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L1e:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel r5 = r15.LLILLJJLI
            java.lang.CharSequence r6 = r15.LLILLL
            java.lang.String r7 = r15.LLILZ
            java.lang.String r8 = r15.LLILZIL
            java.util.List<com.bytedance.ies.im.core.api.model.RichTextInfo> r9 = r15.LLILZLL
            X.0IAQ r10 = r15.LLIZ
            java.util.Map<java.lang.String, java.lang.String> r11 = r15.LLIZLLLIL
            java.util.Map<java.lang.String, java.lang.String> r12 = r15.LLJ
            java.util.Map<java.lang.String, java.lang.String> r13 = r15.LLJI
            java.lang.String r14 = r15.LLJIJIL
            r15.LL = r0
            java.lang.Object r5 = r5.wQ2(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r5 != r2) goto L44
            X.C1C7U.LIZIZ(r4)
            return r2
        L41:
            X.C155000ia.LIZIZ(r5)
        L44:
            X.05YC<X.0IAH<java.lang.Object>> r0 = r15.LLJILJIL
            r15.LL = r1
            java.lang.Object r0 = r0.emit(r5, r15)
            if (r0 != r2) goto L18
            X.C1C7U.LIZIZ(r4)
            return r2
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IAC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
