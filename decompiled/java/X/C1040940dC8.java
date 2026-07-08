package X;

import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dC8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040940dC8 implements InterfaceC1039570d9v {
    public final C1039460d9k LL;
    public final C1040740dBo LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(400));

    @Override // X.InterfaceC1039570d9v
    public final void ze(long j) {
    }

    public C1040940dC8(C1039460d9k c1039460d9k, C1040740dBo c1040740dBo) {
        this.LL = c1039460d9k;
        this.LLILLJJLI = c1040740dBo;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // X.InterfaceC1039570d9v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            X.0dBo r4 = r9.LLILLJJLI
            r4.getClass()
            java.lang.String r8 = "gaSession"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r8)
            r7 = 0
            r5 = 1
            java.lang.String r6 = "adobeSession"
            if (r0 == 0) goto L54
            X.0ckk r3 = X.C2266201Dn0.LIZ
        L13:
            com.ss.android.ugc.aweme.log.AdWebEventLogger r2 = new com.ss.android.ugc.aweme.log.AdWebEventLogger
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.0d3y r0 = r4.LL
            r1[r7] = r0
            r2.<init>(r1)
            X.0d3y r0 = r4.LL
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            r2.logAd(r3, r0)
        L27:
            if (r11 == 0) goto L4a
            X.0dBo r4 = r9.LLILLJJLI
            r4.getClass()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r8)
            if (r0 == 0) goto L4b
            X.0ckk r3 = X.C2266221Dn2.LIZ
        L36:
            com.ss.android.ugc.aweme.log.AdWebEventLogger r2 = new com.ss.android.ugc.aweme.log.AdWebEventLogger
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.0d3y r0 = r4.LL
            r1[r7] = r0
            r2.<init>(r1)
            X.0d3y r0 = r4.LL
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            r2.logAd(r3, r0)
        L4a:
            return
        L4b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r6)
            if (r0 == 0) goto L4a
            X.0ckk r3 = X.C2266181Dmy.LIZ
            goto L36
        L54:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r6)
            if (r0 == 0) goto L27
            X.0ckk r3 = X.C2266161Dmw.LIZ
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1040940dC8.I1(java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC1039570d9v
    public final void C1(Long l, int i, List list) {
        C1040740dBo c1040740dBo = this.LLILLJJLI;
        c1040740dBo.getClass();
        new AdWebEventLogger(c1040740dBo.LL).logAd(C2266241Dn4.LIZ, c1040740dBo.LL.getAwemeRawAd());
    }
}
