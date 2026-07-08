package X;

import Y.ARunnableS3S0400100_20;
import android.net.Uri;
import android.util.Pair;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0kx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1339110kx3 implements C09SW<TypedInput> {
    public C1494850p0F LL;
    public long LLILLJJLI = -1;
    public final /* synthetic */ C1333970kol LLILLL;
    public final /* synthetic */ InterfaceC1335890krr LLILZ;
    public final /* synthetic */ C2222771Bz9 LLILZIL;

    @Override // X.C09SW
    public final void onAsyncPreRequest(RequestBuilder requestBuilder) {
    }

    @Override // X.InterfaceC594300NSq
    public final void onResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) {
    }

    @Override // X.C09SW
    public final void onAsyncResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) throws Throwable {
        Uri uri;
        long jCurrentTimeMillis;
        boolean zLJI = MethodIDManager.LJI(137650);
        InputStream inputStream = null;
        try {
            try {
                try {
                    this.LLILLJJLI = System.currentTimeMillis();
                    C1333970kol c1333970kol = this.LLILLL;
                    System.currentTimeMillis();
                    c1333970kol.getClass();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Exception e) {
                e = e;
            }
            if (c0x52 == null) {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            TypedInput typedInput = c0x52.LIZIZ;
            if (!c0x52.LIZJ()) {
                C1333970kol c1333970kol2 = this.LLILLL;
                long j = c1333970kol2.LIZJ - c1333970kol2.LIZ;
                if (j <= 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL.LIZ;
                } else {
                    jCurrentTimeMillis = 0;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unexpected HTTP code ");
                sbLIZ.append(c0x52);
                IOException iOException = new IOException(C2188811AlT.LIZIZ(sbLIZ));
                this.LLILZIL.LJIIJ(c0x52, this.LLILLL, iOException, j, jCurrentTimeMillis);
                this.LLILZIL.LJIIIIZZ(this.LLILZ, iOException);
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            String strLIZIZ = c0x52.LIZ.LIZ;
            if (C1E2X.LIZ() && strLIZIZ != null && strLIZIZ.contains("/tiktok/v1/im/image/refresh/") && (uri = this.LLILLL.LJFF) != null) {
                strLIZIZ = this.LLILZIL.LIZLLL.LIZIZ(uri.toString());
            }
            Pair pairLIZ = this.LLILZIL.LIZLLL.LIZ(typedInput.in(), typedInput.length(), strLIZIZ);
            InputStream inputStream2 = (InputStream) pairLIZ.first;
            try {
                long jLongValue = ((Long) pairLIZ.second).longValue();
                if (jLongValue >= 0) {
                    this.LLILLL.getClass();
                } else {
                    jLongValue = 0;
                }
                C2222771Bz9 c2222771Bz9 = this.LLILZIL;
                C1333970kol c1333970kol3 = this.LLILLL;
                c2222771Bz9.getClass();
                C2222771Bz9.LJIIIZ(c0x52, c1333970kol3);
                C1333970kol c1333970kol4 = this.LLILLL;
                c1333970kol4.LJII = new ARunnableS3S0400100_20((SsHttpCall) c0x9s, jLongValue, this, c1333970kol4, c0x52, 1);
                ((C1328510kfx) ((C1335880krq) this.LLILZ).LIZ).LIZIZ(inputStream2, (int) jLongValue);
                C1495270p0v.LJI(inputStream2);
            } catch (Exception e2) {
                e = e2;
                inputStream = inputStream2;
                TryCatchGuardChecker.doCheck(e);
                C1333970kol c1333970kol5 = this.LLILLL;
                long j2 = c1333970kol5.LIZJ - c1333970kol5.LIZ;
                long jCurrentTimeMillis2 = 0;
                if (j2 <= 0) {
                    jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLILLL.LIZ;
                }
                this.LLILZIL.LJIIJ(c0x52, this.LLILLL, e, j2, jCurrentTimeMillis2);
                LIZ(c0x52, e, this.LL, j2, jCurrentTimeMillis2);
                this.LLILZIL.LJIIIIZZ(this.LLILZ, e);
                C1495270p0v.LJI(inputStream);
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream2;
                TryCatchGuardChecker.doCheck(th);
                try {
                    C1495270p0v.LJI(inputStream);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    throw th;
                }
                throw th;
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // X.InterfaceC594300NSq
    public final void onFailure(C0X9S<TypedInput> c0x9s, Throwable th) {
        Exception exc;
        this.LLILLJJLI = System.currentTimeMillis();
        C1333970kol c1333970kol = this.LLILLL;
        long j = c1333970kol.LIZJ - c1333970kol.LIZ;
        long jCurrentTimeMillis = 0;
        if (j <= 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL.LIZ;
        }
        this.LLILZIL.LJIIJ(null, this.LLILLL, th, j, jCurrentTimeMillis);
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = new Exception(th.getMessage(), th.getCause());
        }
        LIZ(null, exc, this.LL, j, jCurrentTimeMillis);
        C2222771Bz9 c2222771Bz9 = this.LLILZIL;
        InterfaceC1335890krr interfaceC1335890krr = this.LLILZ;
        c2222771Bz9.getClass();
        c2222771Bz9.LJIIIIZZ(interfaceC1335890krr, C2222771Bz9.LJ(th));
        this.LLILZIL.LJIILIIL(this.LLILLL, false);
    }

    public C1339110kx3(C2222771Bz9 c2222771Bz9, C1333990kon c1333990kon, C1335880krq c1335880krq) {
        this.LLILZIL = c2222771Bz9;
        this.LLILLL = c1333990kon;
        this.LLILZ = c1335880krq;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[Catch: all -> 0x00c4, PHI: r8
      0x0069: PHI (r8v2 X.0p0F) = (r8v1 X.0p0F), (r8v1 X.0p0F), (r8v6 X.0p0F) binds: [B:28:0x0054, B:30:0x0062, B:32:0x0067] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00c4, blocks: (B:41:0x008b, B:43:0x0094, B:45:0x00a2, B:46:0x00a6, B:50:0x00b5, B:51:0x00b8, B:40:0x0087, B:27:0x004e, B:29:0x0056, B:31:0x0064, B:33:0x0069, B:39:0x0078, B:48:0x00aa), top: B:58:0x004e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074 A[PHI: r8
      0x0074: PHI (r8v9 X.0p0F) = (r8v1 X.0p0F), (r8v2 X.0p0F), (r8v2 X.0p0F), (r8v6 X.0p0F) binds: [B:22:0x0038, B:34:0x006f, B:35:0x0071, B:32:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C0X52 r15, java.lang.Exception r16, X.C1494850p0F r17, long r18, long r20) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1339110kx3.LIZ(X.0X52, java.lang.Exception, X.0p0F, long, long):void");
    }
}
