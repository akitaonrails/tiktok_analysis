package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.web.jsbridge.UploadALogUtil$doUploadAllLogs$1", f = "UploadALogUtil.kt", l = {137, 139}, m = "invokeSuspend")
public final class C835790WqX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C835770WqV LLILLL;
    public final /* synthetic */ Function1<JSONObject, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C835790WqX(C835770WqV c835770WqV, Function1<? super JSONObject, Unit> function1, InterfaceC1364105Vn<? super C835790WqX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c835770WqV;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C835790WqX(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r7 = "UploadALogUtil@5934.doUploadAllLogs$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L3f
            if (r0 == r3) goto L57
            if (r0 != r4) goto L76
            java.lang.Object r1 = r8.LL
            java.lang.String r1 = (java.lang.String) r1
            X.C155000ia.LIZIZ(r9)
        L1b:
            java.lang.String r9 = (java.lang.String) r9
            if (r1 == 0) goto L33
            X.0WqV r0 = r8.LLILLL
            r0.getClass()
            org.json.JSONObject r1 = X.C835770WqV.LJ(r1, r9)
        L28:
            kotlin.jvm.functions.Function1<org.json.JSONObject, kotlin.Unit> r0 = r8.LLILZ
            r0.invoke(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L33:
            X.0WqV r0 = r8.LLILLL
            r0.getClass()
            java.lang.String r0 = "null"
            org.json.JSONObject r1 = X.C835770WqV.LJ(r0, r9)
            goto L28
        L3f:
            X.C155000ia.LIZIZ(r9)
            X.1DFH r2 = X.C0PEM.LIZ
            X.0WqZ r1 = new X.0WqZ
            X.0WqV r0 = r8.LLILLL
            r1.<init>(r0, r5)
            r8.LLILLJJLI = r3
            java.lang.Object r9 = X.C23250099c.LJI(r8, r2, r1)
            if (r9 != r6) goto L5a
            X.C1C7U.LIZIZ(r7)
            return r6
        L57:
            X.C155000ia.LIZIZ(r9)
        L5a:
            java.lang.String r9 = (java.lang.String) r9
            X.1DFH r2 = X.C0PEM.LIZ
            X.0WqY r1 = new X.0WqY
            X.0WqV r0 = r8.LLILLL
            r1.<init>(r0, r5)
            r8.LL = r9
            r8.LLILLJJLI = r4
            java.lang.Object r0 = X.C23250099c.LJI(r8, r2, r1)
            if (r0 != r6) goto L73
            X.C1C7U.LIZIZ(r7)
            return r6
        L73:
            r1 = r9
            r9 = r0
            goto L1b
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C835790WqX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
