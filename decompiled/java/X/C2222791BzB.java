package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.image.IMIOImageRequest;
import com.ss.mediakit.image.MIOImageCallback;
import com.ss.mediakit.image.MIOImageError;
import com.ss.mediakit.image.MIOImageResponse;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222791BzB implements MIOImageCallback {
    public C1494850p0F LIZ;
    public volatile MIOImageResponse LIZJ;
    public volatile boolean LIZLLL;
    public final /* synthetic */ C1333970kol LJFF;
    public final /* synthetic */ InterfaceC1335890krr LJI;
    public final /* synthetic */ C2222781BzA LJII;
    public long LIZIZ = -1;
    public final CountDownLatch LJ = new CountDownLatch(1);

    @Override // com.ss.mediakit.image.MIOImageCallback
    public final void onComplete(IMIOImageRequest iMIOImageRequest, MIOImageResponse mIOImageResponse) {
        String strDump;
        if (mIOImageResponse == null) {
            this.LJ.countDown();
            return;
        }
        this.LIZJ = mIOImageResponse;
        this.LJ.countDown();
        if (C1328570kg3.LJIIJ(2)) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[4];
            objArr[0] = this.LJFF.LIZLLL;
            objArr[1] = Boolean.valueOf(mIOImageResponse.isSuccess());
            objArr[2] = Integer.valueOf(mIOImageResponse.code());
            if (mIOImageResponse.detail() != null) {
                strDump = mIOImageResponse.detail().dump();
            } else {
                strDump = "null";
            }
            objArr[3] = strDump;
            C1330590kjJ.LIZJ("MIOImageFetcher", "onComplete", C786410Ut5.k4(locale, "<%s>stream complete, success: %b, code: %d, detail: %s", objArr));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0219 A[Catch: all -> 0x027e, TryCatch #18 {all -> 0x027e, blocks: (B:87:0x0209, B:89:0x0219, B:90:0x0223), top: B:142:0x0209 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.0W1Y] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.mediakit.image.MIOImageCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResponse(com.ss.mediakit.image.IMIOImageRequest r33, final com.ss.mediakit.image.MIOImageResponse r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2222791BzB.onResponse(com.ss.mediakit.image.IMIOImageRequest, com.ss.mediakit.image.MIOImageResponse):void");
    }

    public C2222791BzB(C2222781BzA c2222781BzA, C1333990kon c1333990kon, C1335880krq c1335880krq) {
        this.LJII = c2222781BzA;
        this.LJFF = c1333990kon;
        this.LJI = c1335880krq;
    }

    public final void LIZ(MIOImageResponse mIOImageResponse, Exception exc, C1494850p0F c1494850p0F, long j, long j2) {
        boolean z;
        C1494850p0F c1494850p0F2 = c1494850p0F;
        if (mIOImageResponse == null) {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LIZJ("MIOImageFetcher", "callHandleException", "response is null");
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report failure point, code: ");
        sbLIZ.append(mIOImageResponse.code());
        sbLIZ.append(", nativeCode: ");
        sbLIZ.append(mIOImageResponse.code());
        C1330590kjJ.LIZJ("MIOImageFetcher", "callHandleException", C2188811AlT.LIZIZ(sbLIZ));
        if (mIOImageResponse.detail().statusCode != 304 && mIOImageResponse.code() != MIOImageError.TASK_CANCELED.code()) {
            z = true;
        } else {
            C1330590kjJ.LIZJ("MIOImageFetcher", "callHandleException", "304 no need report");
            z = false;
        }
        if (c1494850p0F2 == null) {
            c1494850p0F2 = new C1494850p0F();
            c1494850p0F2.LJJIFFI = 2;
        }
        if (mIOImageResponse.detail().extraInfo != null) {
            c1494850p0F2.LJJIIJ = C786410Ut5.J3(mIOImageResponse.detail().extraInfo);
            c1494850p0F2.LJJIIJZLJL = mIOImageResponse.detail().extraInfo;
        }
        if (z) {
            try {
                c1494850p0F2.LJIJ = mIOImageResponse.detail().remoteIp;
                T t = c1494850p0F2.LIZJ;
                if (t != 0) {
                    ((C1493620oyG) t).LIZ = mIOImageResponse.detail().remoteIp;
                }
                c1494850p0F2.LJIIIZ = System.currentTimeMillis();
                if (c1494850p0F2.LJIIIIZZ <= 0) {
                    c1494850p0F2.LJIIIIZZ = this.LIZIZ;
                }
                JSONObject jSONObject = c1494850p0F2.LJJIIJZLJL;
                if (jSONObject != null && exc != null) {
                    try {
                        jSONObject.put("ex", exc.getMessage());
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                this.LJII.LJIIJ(mIOImageResponse, this.LJFF, exc, c1494850p0F2, j, j2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }
}
