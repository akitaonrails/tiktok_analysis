package X;

import com.tiktok.strategycenterengine.coreinterface.TTMTarsDelegate;
import com.tiktok.ttm.TTMParamData;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AwS613S0100000_34;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213381Bk0 extends AbstractC2213701BkW {
    public C2213361Bjy LJIIJJI;
    public final CountDownLatch LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;

    @Override // X.AbstractC2213701BkW, X.InterfaceC830900Wie
    public final void LJ(InterfaceC805220ViK interfaceC805220ViK) {
    }

    @Override // X.AbstractC2213701BkW, X.InterfaceC830900Wie
    public final boolean LIZLLL() {
        super.LIZLLL();
        TTMTarsDelegate.LIZ.getClass();
        TTMTarsDelegate tTMTarsDelegate = C2213391Bk1.LIZIZ;
        if (tTMTarsDelegate == null) {
            return true;
        }
        tTMTarsDelegate.LIZIZ(this.LJIIJJI);
        return true;
    }

    public final String LJIIL() {
        C2213831Bkj c2213831Bkj;
        JSONObject jSONObject;
        String strOptString;
        AbstractC2213721BkY abstractC2213721BkYLJII = LJII();
        if (!(abstractC2213721BkYLJII instanceof C2213831Bkj) || (c2213831Bkj = (C2213831Bkj) abstractC2213721BkYLJII) == null || (jSONObject = c2213831Bkj.LJFF) == null || (strOptString = jSONObject.optString("biz_id")) == null) {
            return null;
        }
        return strOptString;
    }

    @Override // X.AbstractC2213701BkW
    public final String LJIIIIZZ() {
        return "se_tars";
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    @Override // X.AbstractC2213701BkW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2213641BkQ LJIIJ(com.tiktok.ttm.TTMParamData r18) {
        /*
            r17 = this;
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r4 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "success"
            r7.put(r0, r1)
            r8 = r17
            boolean r2 = r8.LJIILIIL
            r0 = 1
            r1 = r18
            if (r2 != 0) goto L2d
            X.1BkQ r5 = new X.1BkQ
            X.0zoT r6 = X.EnumC1910390zoT.RunError
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r2 = "tars env is not ready"
            r9.<init>(r2)
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r4] = r1
            r11 = 32
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L2d:
            X.1Bjy r2 = r8.LJIIJJI
            if (r2 != 0) goto L46
            X.1BkQ r5 = new X.1BkQ
            X.0zoT r6 = X.EnumC1910390zoT.RunError
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r2 = " engine is null"
            r9.<init>(r2)
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r4] = r1
            r11 = 32
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L46:
            X.1Bk1 r2 = com.tiktok.strategycenterengine.coreinterface.TTMTarsDelegate.LIZ
            r2.getClass()
            com.tiktok.strategycenterengine.coreinterface.TTMTarsDelegate r3 = X.C2213391Bk1.LIZIZ
            r9 = 0
            if (r3 == 0) goto L81
            X.1Bjy r2 = r8.LJIIJJI
            X.1Bjz r3 = r3.LIZ(r2, r1)
            if (r3 == 0) goto L82
            int r2 = r3.LIZIZ
            if (r2 != 0) goto L82
            X.1BkQ r5 = new X.1BkQ
            X.0zoT r6 = X.EnumC1910390zoT.TarsResult
            if (r3 == 0) goto L7f
            java.lang.Object r7 = r3.LIZ
        L64:
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r4] = r1
            r11 = 32
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L6d:
            X.1Bjy r1 = r8.LJIIJJI
            if (r1 == 0) goto L7e
            boolean r0 = r1.LIZIZ
            if (r0 != 0) goto L7e
            com.tiktok.strategycenterengine.coreinterface.TTMTarsDelegate r0 = X.C2213391Bk1.LIZIZ
            if (r0 == 0) goto L7c
            r0.LIZIZ(r1)
        L7c:
            r8.LJIIJJI = r9
        L7e:
            return r5
        L7f:
            r7 = r9
            goto L64
        L81:
            r3 = r9
        L82:
            X.1BkQ r5 = new X.1BkQ
            X.0zoT r11 = X.EnumC1910390zoT.RunError
            if (r3 == 0) goto L9e
            java.lang.Object r12 = r3.LIZ
        L8a:
            java.lang.Exception r14 = new java.lang.Exception
            java.lang.String r2 = "tars run error"
            r14.<init>(r2)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r1
            r16 = 32
            r10 = r5
            r13 = r8
            r15 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L6d
        L9e:
            r12 = r9
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2213381Bk0.LJIIJ(com.tiktok.ttm.TTMParamData):X.1BkQ");
    }

    public final Map<String, Object> LJIILIIL(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) throws InterruptedException {
        Object obj;
        C2213361Bjy c2213361BjyLIZLLL;
        this.LJIIL.await();
        if (this.LJIIJJI == null) {
            TTMTarsDelegate.LIZ.getClass();
            TTMTarsDelegate tTMTarsDelegate = C2213391Bk1.LIZIZ;
            if (tTMTarsDelegate != null) {
                c2213361BjyLIZLLL = tTMTarsDelegate.LIZLLL(LJIIL(), map2);
            } else {
                c2213361BjyLIZLLL = null;
            }
            this.LJIIJJI = c2213361BjyLIZLLL;
        }
        C2213641BkQ c2213641BkQLJIIJJI = LJIIJJI(new TTMParamData((Map<String, Object>) map), true);
        if (c2213641BkQLJIIJJI != null) {
            obj = c2213641BkQLJIIJJI.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Map)) {
            return null;
        }
        return (Map) obj;
    }

    public C2213381Bk0(String str, AbstractC2213721BkY abstractC2213721BkY, String str2, int i) {
        super(str, str2, i);
        this.LJIIL = new CountDownLatch(1);
        this.LJIIIIZZ = abstractC2213721BkY;
        if (LJIIL() != null) {
            C2213391Bk1 c2213391Bk1 = TTMTarsDelegate.LIZ;
            c2213391Bk1.getClass();
            TTMTarsDelegate tTMTarsDelegate = C2213391Bk1.LIZIZ;
            if (tTMTarsDelegate != null) {
                tTMTarsDelegate.LJ();
            }
            c2213391Bk1.getClass();
            TTMTarsDelegate tTMTarsDelegate2 = C2213391Bk1.LIZIZ;
            if (tTMTarsDelegate2 != null) {
                tTMTarsDelegate2.LIZJ(LJIIL(), new AwS613S0100000_34(this, 128));
            }
            this.LJIIIZ = true;
        }
    }
}
