package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e2C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.dialogcenter.common.RelationAuthDialogCenter$serve$1", f = "RelationAuthDialogCenter.kt", l = {41, 43, 48}, m = "invokeSuspend")
public final class C1073220e2C extends C09AX implements Function2<InterfaceC346701Wf<? super C1073120e22>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1073210e2B LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073220e2C(C1073210e2B c1073210e2B, InterfaceC1364105Vn<? super C1073220e2C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1073210e2B;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1073220e2C c1073220e2C = new C1073220e2C(this.LLILZIL, interfaceC1364105Vn);
        c1073220e2C.LLILZ = obj;
        return c1073220e2C;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r2 r7
      0x0035: PHI (r2v3 X.01Wf) = (r2v1 X.01Wf), (r2v4 X.01Wf), (r2v4 X.01Wf) binds: [B:10:0x0024, B:24:0x00c6, B:26:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r7v2 java.util.Iterator<X.0e2T>) = (r7v0 java.util.Iterator<X.0e2T>), (r7v3 java.util.Iterator<X.0e2T>), (r7v3 java.util.Iterator<X.0e2T>) binds: [B:10:0x0024, B:24:0x00c6, B:26:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009f -> B:23:0x00b5). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1073220e2C.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C1073120e22> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
