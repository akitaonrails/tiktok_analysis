package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u7M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.view.TakoAIVideoInputKt$InputTextField$1$1", f = "TakoAIVideoInput.kt", l = {}, m = "invokeSuspend")
public final class C1691460u7M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC1679580toC LL;
    public final /* synthetic */ Function1<C1686970u07, Unit> LLILLJJLI;
    public final /* synthetic */ C1686970u07 LLILLL;
    public final /* synthetic */ C20060213eK LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1691460u7M(EnumC1679580toC enumC1679580toC, Function1<? super C1686970u07, Unit> function1, C1686970u07 c1686970u07, C20060213eK c20060213eK, InterfaceC1364105Vn<? super C1691460u7M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC1679580toC;
        this.LLILLJJLI = function1;
        this.LLILLL = c1686970u07;
        this.LLILZ = c20060213eK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1691460u7M(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        if (r1.LJIJJ().LLJILLL != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        X.C1696250uF5.LIZIZ("visitChildren called on an unattached node");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        r5 = new X.C19968013Aw(new X.AbstractC20055413dY[16]);
        r0 = r1.LJIJJ().LLILZLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (r0 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        X.C20052513d5.LIZ(r5, r1.LJIJJ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        r0 = r5.LLILLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
    
        if (r0 == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        r4 = (X.AbstractC20055413dY) r5.LJIILIIL(r0 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        if ((r4.LLILZ & 1024) != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        X.C20052513d5.LIZ(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        if (r4 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        if ((r4.LLILLL & 1024) == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
    
        if ((r4 instanceof androidx.compose.ui.focus.FocusTargetNode) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e4, code lost:
    
        if (X.C20060113eJ.LIZIZ((androidx.compose.ui.focus.FocusTargetNode) r4) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ec, code lost:
    
        if ((r4.LLILLL & 1024) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f0, code lost:
    
        if ((r4 instanceof X.AbstractC20055313dX) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f2, code lost:
    
        r2 = ((X.AbstractC20055313dX) r4).LLJJI;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f8, code lost:
    
        if (r2 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fe, code lost:
    
        if ((r2.LLILLL & 1024) == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0100, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0102, code lost:
    
        if (r1 != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0104, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        r2 = r2.LLILZLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0108, code lost:
    
        if (r3 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010a, code lost:
    
        r3 = new X.C19968013Aw(new X.AbstractC20055413dY[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0111, code lost:
    
        if (r4 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0113, code lost:
    
        r3.LIZLLL(r4);
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0117, code lost:
    
        r3.LIZLLL(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011b, code lost:
    
        r4 = X.C20052513d5.LIZIZ(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0120, code lost:
    
        if (r1 != 1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0122, code lost:
    
        if (r4 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0125, code lost:
    
        r4 = r4.LLILZLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0128, code lost:
    
        r5.LIZLLL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012c, code lost:
    
        r7 = r7 + 1;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1691460u7M.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
