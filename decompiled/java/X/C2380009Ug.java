package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2380009Ug extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Throwable LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Pair<String, Object>[] LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2380009Ug(Throwable th, String str, String str2, Pair<String, ? extends Object>[] pairArr) {
        super(1);
        this.LL = th;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = pairArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C957403oi r6) {
        /*
            r5 = this;
            X.03oi r6 = (X.C957403oi) r6
            X.C0XJZ.LIZIZ(r6)
            java.lang.Throwable r0 = r5.LL
            X.0ozz r0 = (X.C1494690ozz) r0
            X.0ozq r2 = r0.getRequestInfo()
            java.lang.Throwable r0 = r5.LL
            X.0ozz r0 = (X.C1494690ozz) r0
            int r0 = r0.getStatusCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "error_code"
            r6.LIZIZ(r0, r1)
            java.lang.String r1 = r5.LLILLJJLI
            if (r1 != 0) goto L24
            java.lang.String r1 = ""
        L24:
            java.lang.String r0 = "path"
            r6.LIZJ(r0, r1)
            java.lang.Throwable r0 = r5.LL
            X.0ozc r0 = (X.C1494460ozc) r0
            java.lang.String r1 = r0.getTraceCode()
            java.lang.String r0 = "log_id"
            r6.LIZIZ(r0, r1)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = r5.LLILLL
            r6.LIZIZ(r1, r0)
            if (r2 == 0) goto L74
            long r0 = r2.LJIILLIIL
        L41:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration"
            r6.LIZJ(r0, r1)
            r4 = 0
            if (r2 == 0) goto L72
            boolean r1 = r2.LJJI
            r0 = 1
            if (r1 != r0) goto L72
        L52:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_socket_reused"
            r6.LIZJ(r0, r1)
            kotlin.Pair<java.lang.String, java.lang.Object>[] r3 = r5.LLILZ
            int r2 = r3.length
        L5e:
            if (r4 >= r2) goto L77
            r0 = r3[r4]
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getSecond()
            r6.LIZIZ(r1, r0)
            int r4 = r4 + 1
            goto L5e
        L72:
            r0 = 0
            goto L52
        L74:
            r0 = 0
            goto L41
        L77:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2380009Ug.invoke(java.lang.Object):java.lang.Object");
    }
}
