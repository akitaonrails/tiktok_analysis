package X;

import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.HashMap;
import java.util.List;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x3Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804340x3Q extends AbstractC1805010x4V<C1804690x3z, IapListResult> implements InterfaceC1804500x3g {
    public final InterfaceC1804600x3q LIZIZ;

    public C1804340x3Q(C1804610x3r c1804610x3r) {
        this.LIZIZ = c1804610x3r;
    }

    public static void LJIIJ(IapListResult iapListResult) throws C1804550x3l {
        List<Diamond> list = iapListResult.data;
        if (!C086I.LIZIZ(list)) {
            if (SlardarSampleSetting.INSTANCE.isReport("ttlive_query_wallet_purchase_all", 0.01d)) {
                HashMap map = new HashMap();
                map.put("iapKey", Integer.valueOf(list.size()));
                C1796590wqv.LIZ("ttlive_query_wallet_purchase", map);
                return;
            }
            return;
        }
        throw new C1804550x3l("query wallet product empty", 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.AbstractC1805010x4V
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C1804690x3z r6, X.InterfaceC1364105Vn<? super webcast.api.profit.IapListResult> r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1804380x3U
            if (r0 == 0) goto L20
            r4 = r7
            X.0x3U r4 = (X.C1804380x3U) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3c
        L20:
            X.0x3U r4 = new X.0x3U
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.0x3q r0 = r5.LIZIZ     // Catch: java.lang.Exception -> L45
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r0.LJIIL(r6, r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L3f
            return r2
        L3c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L45
        L3f:
            webcast.api.profit.IapListResult r3 = (webcast.api.profit.IapListResult) r3     // Catch: java.lang.Exception -> L45
            LJIIJ(r3)     // Catch: java.lang.Exception -> L45
            return r3
        L45:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            boolean r0 = r3 instanceof X.C501520Jle
            if (r0 == 0) goto L6d
            r0 = r3
            X.0Jle r0 = (X.C501520Jle) r0
            int r2 = r0.getErrorCode()
        L54:
            boolean r0 = r3 instanceof X.C1804550x3l
            if (r0 == 0) goto L5f
            r0 = r3
            X.0x3l r0 = (X.C1804550x3l) r0
            int r2 = r0.getErrorCode()
        L5f:
            java.lang.String r1 = r3.getMessage()
            if (r1 != 0) goto L67
            java.lang.String r1 = "api exception"
        L67:
            java.lang.String r0 = "ttlive_query_wallet_purchase"
            X.C1796590wqv.LIZIZ(r2, r0, r1)
            throw r3
        L6d:
            r2 = -1
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1804340x3Q.LJFF(X.0x3z, X.05Vn):java.lang.Object");
    }
}
