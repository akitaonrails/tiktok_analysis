package X;

import com.ss.android.ugc.aweme.tako.ccl.net.GetIncrementalMsgResponse;
import defpackage.k9;
import defpackage.r2;
import defpackage.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0yaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$dispatchPullNewTakoMessages$1", f = "MessageOperatorHandler.kt", l = {2147, 2150, 2156, 2203, 2212, 2221, 2267, 2269, 2283, 2288}, m = "invokeSuspend")
public final class C1863290yaV extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public u2 LL;
    public GetIncrementalMsgResponse LLILLJJLI;
    public k9 LLILLL;
    public C1863280yaU LLILZ;
    public r2 LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public final /* synthetic */ C1863280yaU LLIZLLLIL;
    public final /* synthetic */ r2 LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863290yaV(r2 r2Var, C1863280yaU c1863280yaU, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLIZLLLIL = c1863280yaU;
        this.LLJ = r2Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1863290yaV(this.LLJ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x010d, code lost:
    
        if (r9 != r2) goto L40;
     */
    /* JADX WARN: Path cross not found for [B:33:0x00db, B:35:0x00df], limit reached: 302 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x029e -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0140 -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x015c -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0166 -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0170 -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0176 -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01a5 -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01ad -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01b5 -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01d8 -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01e8 -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01f5 -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x023a -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0258 -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0264 -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x026f -> B:40:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x029c -> B:40:0x010d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 1726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863290yaV.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
