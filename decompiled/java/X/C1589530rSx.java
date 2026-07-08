package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0rSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589530rSx implements C0N6Y {
    public static int LIZIZ = -1;
    public List<Aweme> LIZ;

    @Override // X.C0N6Y
    public final String LIZ() {
        return "friend_recommend_card";
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r3 != 3) goto L20;
     */
    @Override // X.C0N6Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C0N6X r8, com.ss.android.ugc.aweme.feed.model.FeedItemList r9, X.C1160560gJ4 r10) {
        /*
            r7 = this;
            int r1 = r8.LIZ
            r0 = 8
            if (r1 != r0) goto L7
            return
        L7:
            r6 = 0
            boolean r0 = X.C1386360mBG.LJII(r6)
            if (r0 != 0) goto Lf
            return
        Lf:
            boolean r0 = X.C0CN5.LJII()
            if (r0 != 0) goto L16
            return
        L16:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r8.LIZIZ
            r7.LIZ = r0
            X.0rlr r1 = new X.0rlr
            java.util.List r0 = r9.getItems()
            r1.<init>(r0, r10)
            r9.setItems(r1)
            int r3 = r8.LIZ
            java.util.List r5 = r9.getItems()
            if (r5 == 0) goto L4b
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L4b
            X.0rSn r0 = X.C1589420rSm.LIZ
            java.lang.ref.WeakReference<X.07Ru> r0 = r0.LIZ
            if (r0 == 0) goto L4b
            java.lang.Object r4 = r0.get()
            X.07Ru r4 = (X.InterfaceC1864007Ru) r4
            if (r4 != 0) goto L4f
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r1 = "FEED_UR_DOWNGRADE"
            java.lang.String r0 = "[ERROR] tryInsertRecommendUserCard - recUserBigCardController is null"
            X.C1720106oR.LJI(r1, r0)
        L4b:
            r0 = 0
            r7.LIZ = r0
            return
        L4f:
            X.1E8n r2 = X.C2276471E8n.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[FeedFetchModel] queryType = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " and aweme size is "
            r1.append(r0)
            int r0 = r5.size()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "TTRecUser"
            r2.d(r0, r1)
            r0 = 1
            if (r3 == r0) goto L83
            r0 = 2
            if (r3 == r0) goto L7c
            r0 = 3
            if (r3 == r0) goto L83
            goto L4b
        L7c:
            int r0 = X.C1589530rSx.LIZIZ
            int r0 = r0 + 1
            X.C1589530rSx.LIZIZ = r0
            goto L85
        L83:
            X.C1589530rSx.LIZIZ = r6
        L85:
            int r3 = X.C1589530rSx.LIZIZ
            java.lang.String r2 = r9.getRequestId()
            Y.AObjectS398S0100000_24 r1 = new Y.AObjectS398S0100000_24
            r0 = 11
            r1.<init>(r7, r0)
            r4.LIZIZ(r3, r5, r2, r1)
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1589530rSx.LIZIZ(X.0N6X, com.ss.android.ugc.aweme.feed.model.FeedItemList, X.0gJ4):void");
    }
}
