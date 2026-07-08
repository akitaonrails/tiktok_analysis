package X;

import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338970kwp implements C09SW<TypedInput> {
    public C1494850p0F LL;
    public long LLILLJJLI = -1;
    public final /* synthetic */ C1338980kwq LLILLL;
    public final /* synthetic */ InterfaceC1339080kx0 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C1493620oyG LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ InterfaceC1331040kk2 LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ C0X9S LLJIJIL;
    public final /* synthetic */ C1338960kwo LLJILJIL;

    @Override // X.C09SW
    public final void onAsyncPreRequest(RequestBuilder requestBuilder) {
    }

    @Override // X.InterfaceC594300NSq
    public final void onResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) {
    }

    public final void LIZ(C0X52 c0x52, Exception exc) {
        Exception exc2;
        List<C080U> list;
        C1494430ozZ c1494430ozZ;
        if (exc == null) {
            return;
        }
        if (exc instanceof C1339020kwu) {
            C1339020kwu c1339020kwu = (C1339020kwu) exc;
            exc2 = c1339020kwu.e;
            this.LLILLL.LJIIJJI += c1339020kwu.retryCount;
        } else {
            exc2 = exc;
        }
        boolean z = true;
        if (exc instanceof C1338990kwr) {
            this.LLJILJIL.LJI(this.LLILLL, this.LLJ, true);
            return;
        }
        synchronized (C1339000kws.LIZ()) {
        }
        if ((exc2 instanceof C1494430ozZ) && (c1494430ozZ = (C1494430ozZ) exc2) != null && c1494430ozZ.getStatusCode() == 304) {
            z = false;
        }
        if (exc2 instanceof C1494690ozz) {
            C1494690ozz c1494690ozz = (C1494690ozz) exc2;
            C1494600ozq requestInfo = c1494690ozz.getRequestInfo();
            if (requestInfo instanceof C1494850p0F) {
                this.LL = (C1494850p0F) requestInfo;
            } else {
                C1494850p0F c1494850p0F = new C1494850p0F();
                this.LL = c1494850p0F;
                c1494850p0F.LJJIFFI = 0;
                c1494850p0F.LJJIIJ = c1494690ozz.getRequestLog();
            }
        }
        if (z) {
            try {
                if (this.LL == null) {
                    C0X9S c0x9s = this.LLJIJIL;
                    if (c0x9s instanceof InterfaceC1339100kx2) {
                        Object requestInfo2 = ((InterfaceC1339100kx2) c0x9s).getRequestInfo();
                        if (requestInfo2 instanceof C1494850p0F) {
                            this.LL = (C1494850p0F) requestInfo2;
                        }
                    }
                }
                if (this.LL == null) {
                    C0X9S c0x9s2 = this.LLJIJIL;
                    if ((c0x9s2 instanceof InterfaceC843230X6b) && c0x52 != null) {
                        ((InterfaceC843230X6b) c0x9s2).doCollect();
                        this.LL = (C1494850p0F) c0x52.LIZ.LJFF;
                    }
                }
                C1494850p0F c1494850p0F2 = this.LL;
                if (c0x52 != null) {
                    list = c0x52.LIZ.LIZLLL;
                } else {
                    list = null;
                }
                C1338960kwo.LJIIJ(c1494850p0F2, list, this.LLIZ, exc2);
                C1494850p0F c1494850p0F3 = this.LL;
                if (c1494850p0F3 != null) {
                    c1494850p0F3.LJIIIZ = System.currentTimeMillis();
                    C1494850p0F c1494850p0F4 = this.LL;
                    if (c1494850p0F4.LJIIIIZZ <= 0) {
                        c1494850p0F4.LJIIIIZZ = this.LLILLJJLI;
                    }
                    JSONObject jSONObject = c1494850p0F4.LJJIIJZLJL;
                    if (jSONObject != null) {
                        try {
                            jSONObject.put("ex", exc2.getMessage());
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                C1338960kwo c1338960kwo = this.LLJILJIL;
                C1338980kwq c1338980kwq = this.LLILLL;
                C1494850p0F c1494850p0F5 = this.LL;
                c1338960kwo.getClass();
                C1338960kwo.LJIIJJI(c0x52, c1338980kwq, exc2, c1494850p0F5);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        try {
            if (this.LLJ != null) {
                C0X9S c0x9s3 = this.LLJIJIL;
                if (c0x9s3 != null && c0x9s3.isCanceled()) {
                    ((C1328510kfx) this.LLJ).LIZ();
                } else {
                    C1328510kfx c1328510kfx = (C1328510kfx) this.LLJ;
                    c1328510kfx.LIZIZ.LJFF(c1328510kfx.LIZ, exc2);
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b A[Catch: all -> 0x0147, Exception -> 0x0149, TRY_LEAVE, TryCatch #6 {Exception -> 0x0149, blocks: (B:36:0x00b1, B:37:0x00b6, B:48:0x011b, B:54:0x013c, B:55:0x0146, B:45:0x0101), top: B:94:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c A[Catch: all -> 0x0147, Exception -> 0x0149, TRY_ENTER, TryCatch #6 {Exception -> 0x0149, blocks: (B:36:0x00b1, B:37:0x00b6, B:48:0x011b, B:54:0x013c, B:55:0x0146, B:45:0x0101), top: B:94:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.C09SW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAsyncResponse(X.C0X9S<com.bytedance.retrofit2.mime.TypedInput> r16, X.C0X52<com.bytedance.retrofit2.mime.TypedInput> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338970kwp.onAsyncResponse(X.0X9S, X.0X52):void");
    }

    @Override // X.InterfaceC594300NSq
    public final void onFailure(C0X9S<TypedInput> c0x9s, Throwable th) {
        Exception exc;
        this.LLILLJJLI = System.currentTimeMillis();
        if (this.LLJI) {
            C1494520ozi.LIZ.LIZJ();
        }
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = new Exception(th.getMessage(), th.getCause());
        }
        LIZ(null, exc);
    }

    public C1338970kwp(C1338960kwo c1338960kwo, C1338980kwq c1338980kwq, C1339050kwx c1339050kwx, String str, boolean z, C1339030kwv c1339030kwv, String str2, InterfaceC1331040kk2 interfaceC1331040kk2, boolean z2, C0X9S c0x9s) {
        this.LLJILJIL = c1338960kwo;
        this.LLILLL = c1338980kwq;
        this.LLILZ = c1339050kwx;
        this.LLILZIL = str;
        this.LLILZLL = z;
        this.LLIZ = c1339030kwv;
        this.LLIZLLLIL = str2;
        this.LLJ = interfaceC1331040kk2;
        this.LLJI = z2;
        this.LLJIJIL = c0x9s;
    }
}
