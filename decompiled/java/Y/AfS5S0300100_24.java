package Y;

import X.C09JN;
import X.C1610420s0e;
import X.C1610750s1B;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes25.dex */
public class AfS5S0300100_24 implements C09JN {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS5S0300100_24 r14, java.lang.Object r15) {
        /*
            java.lang.String r13 = "AvatarBorderViewControllerProxy@56c1.tryRefreshLiveState$1"
            X.C1C7U.LIZ(r13)
            java.util.Map r15 = (java.util.Map) r15
            if (r15 == 0) goto L58
            long r2 = r14.j3
            java.lang.Object r10 = r14.l0
            X.0s1B r10 = (X.C1610750s1B) r10
            java.lang.Object r8 = r14.l1
            com.ss.android.ugc.aweme.profile.model.User r8 = (com.ss.android.ugc.aweme.profile.model.User) r8
            java.lang.Object r7 = r14.l2
            X.09JN r7 = (X.C09JN) r7
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r9 = r15.get(r0)
            java.lang.Long r9 = (java.lang.Long) r9
            r4 = 0
            if (r9 == 0) goto L2d
            long r11 = r9.longValue()
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 != 0) goto L66
        L2d:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r10.LJII
            if (r6 == 0) goto L5c
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService> r0 = com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService r0 = (com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService) r0
            boolean r1 = r0.LJFF(r6)
            r0 = 1
            if (r1 != r0) goto L5c
            if (r9 != 0) goto L66
            r0 = 0
        L48:
            r8.roomId = r0
        L4a:
            X.0s0e r0 = new X.0s0e
            if (r9 == 0) goto L52
            long r4 = r9.longValue()
        L52:
            r0.<init>(r2, r4)
            r7.accept(r0)
        L58:
            X.C1C7U.LIZIZ(r13)
            return
        L5c:
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r8.roomId = r4
            r10.LJIIIIZZ()
            goto L4a
        L66:
            long r0 = r9.longValue()
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS5S0300100_24.accept$0(Y.AfS5S0300100_24, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS5S0300100_24 r14, java.lang.Object r15) {
        /*
            java.lang.String r13 = "AvatarBorderViewController@a9c6.tryRefreshLiveState$1"
            X.C1C7U.LIZ(r13)
            java.util.Map r15 = (java.util.Map) r15
            if (r15 == 0) goto L58
            long r2 = r14.j3
            java.lang.Object r10 = r14.l0
            X.0s1A r10 = (X.C1610740s1A) r10
            java.lang.Object r8 = r14.l1
            com.ss.android.ugc.aweme.profile.model.User r8 = (com.ss.android.ugc.aweme.profile.model.User) r8
            java.lang.Object r7 = r14.l2
            X.09JN r7 = (X.C09JN) r7
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r9 = r15.get(r0)
            java.lang.Long r9 = (java.lang.Long) r9
            r4 = 0
            if (r9 == 0) goto L2d
            long r11 = r9.longValue()
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 != 0) goto L66
        L2d:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r10.LJIIJJI
            if (r6 == 0) goto L5c
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService> r0 = com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService r0 = (com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService) r0
            boolean r1 = r0.LJFF(r6)
            r0 = 1
            if (r1 != r0) goto L5c
            if (r9 != 0) goto L66
            r0 = 0
        L48:
            r8.roomId = r0
        L4a:
            X.0s0e r0 = new X.0s0e
            if (r9 == 0) goto L52
            long r4 = r9.longValue()
        L52:
            r0.<init>(r2, r4)
            r7.accept(r0)
        L58:
            X.C1C7U.LIZIZ(r13)
            return
        L5c:
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r8.roomId = r4
            r10.LJIIIIZZ()
            goto L4a
        L66:
            long r0 = r9.longValue()
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS5S0300100_24.accept$1(Y.AfS5S0300100_24, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:Y.AfS5S0300100_24) (LINE:83886083) Y.AfS5S0300100_24.j3 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:Y.AfS5S0300100_24) (LINE:83886085) Y.AfS5S0300100_24.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.AfS5S0300100_24, java.lang.Object] */
    public AfS5S0300100_24(long j, long j2, C1610750s1B c1610750s1B, User user, C09JN<C1610420s0e> c09jn) {
        long j3;
        Object obj;
        obj.$t = c09jn;
        obj.j3 = j3;
        obj.l0 = obj;
        obj.l1 = c1610750s1B;
        obj.l2 = user;
        ?? obj2 = new Object();
    }
}
