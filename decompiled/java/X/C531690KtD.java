package X;

import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.FetchDetailNodeKt$fetchDetailNode$1", f = "FetchDetailNode.kt", l = {47}, m = "invokeSuspend")
public final class C531690KtD extends C09AX implements Function2<C531580Kt2, InterfaceC1364105Vn<? super TemplateConsumeCoreParam>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C531690KtD(InterfaceC1364105Vn<? super C531690KtD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531690KtD c531690KtD = new C531690KtD(interfaceC1364105Vn);
        c531690KtD.LLILLL = obj;
        return c531690KtD;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6 A[Catch: Exception -> 0x0147, TryCatch #2 {Exception -> 0x0147, blocks: (B:28:0x009a, B:30:0x00a6, B:32:0x00aa, B:34:0x00bd, B:35:0x00cd, B:37:0x00d1, B:39:0x00d5, B:41:0x00d9, B:45:0x00e2, B:47:0x00ec, B:48:0x00f4, B:51:0x0139), top: B:68:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[Catch: Exception -> 0x0147, TryCatch #2 {Exception -> 0x0147, blocks: (B:28:0x009a, B:30:0x00a6, B:32:0x00aa, B:34:0x00bd, B:35:0x00cd, B:37:0x00d1, B:39:0x00d5, B:41:0x00d9, B:45:0x00e2, B:47:0x00ec, B:48:0x00f4, B:51:0x0139), top: B:68:0x009a }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C531690KtD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C531580Kt2 c531580Kt2, InterfaceC1364105Vn<? super TemplateConsumeCoreParam> interfaceC1364105Vn) {
        return ((a) create(c531580Kt2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
