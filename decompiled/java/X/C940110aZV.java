package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0aZV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940110aZV {
    public static final Map<Long, Long> LJ = new LinkedHashMap();
    public final InterfaceC940700aaS LIZ;
    public C11JF LIZIZ;
    public long LIZJ = -1;
    public boolean LIZLLL;

    public final Boolean LIZIZ() {
        long j = this.LIZJ;
        if (j == -1) {
            return null;
        }
        return (j == 1 || j == 2) ? Boolean.TRUE : Boolean.valueOf(this.LIZLLL);
    }

    public final void LIZLLL() {
        Long lLIZ = this.LIZ.LIZ();
        if (lLIZ != null) {
            LJ.remove(Long.valueOf(lLIZ.longValue()));
        }
        C11JF c11jf = this.LIZIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LIZIZ = null;
    }

    public final void LIZJ() {
        Long lLIZ;
        this.LIZIZ = (C11JF) C784440Upu.LIZ().LJ(C257100z3.class).LJJLL(new AfS184S0100000_15(this, 256), new C09JN() { // from class: X.0aZc
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiGuestV3GuestMaskControllerV2@1395.onViewAttached$2");
                C1C7U.LIZIZ("MultiGuestV3GuestMaskControllerV2@1395.onViewAttached$2");
            }
        });
        if (this.LIZJ == -1 || (lLIZ = this.LIZ.LIZ()) == null) {
            return;
        }
        long jLongValue = lLIZ.longValue();
        if (jLongValue != UserService.getInstance().user().getCurrentUserId()) {
            LJ.put(Long.valueOf(jLongValue), Long.valueOf(this.LIZJ));
        }
    }

    public C940110aZV(InterfaceC940700aaS interfaceC940700aaS) {
        this.LIZ = interfaceC940700aaS;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(X.C257100z3 r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L75
            com.bytedance.android.livesdkapi.depend.model.follow.FollowPair r11 = r13.LIZ
            if (r11 == 0) goto L75
            long r3 = r11.LIZ
            X.0aaS r0 = r12.LIZ
            java.lang.Long r0 = r0.LIZ()
            if (r0 == 0) goto L98
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L98
            r10 = 0
            boolean r0 = X.C931780aM4.LJFF(r10)
            r9 = 1
            r4 = 0
            r8 = 0
            if (r0 == 0) goto L7f
            int r3 = r11.followStatus
        L25:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onEvent, userId="
            r2.append(r0)
            X.0aaS r0 = r12.LIZ
            java.lang.Long r0 = r0.LIZ()
            r2.append(r0)
            java.lang.String r0 = ", last_followStatus="
            r2.append(r0)
            long r0 = r12.LIZJ
            r2.append(r0)
            java.lang.String r0 = ", realFollowStatus = "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "MultiGuestV3GuestMaskControllerV2"
            X.C20441214yg.LIZIZ(r0, r1)
            r6 = 2
            r0 = 1
            if (r3 == 0) goto L7c
            if (r3 == r9) goto L79
            r2 = 2
            if (r3 == r2) goto L76
            r2 = 3
            if (r3 != r2) goto L64
            r2 = 3
            r12.LIZJ = r2
        L64:
            long r2 = r12.LIZJ
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L6e
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L70
        L6e:
            r12.LIZLLL = r8
        L70:
            java.lang.String r0 = "onEvent"
            r12.LJ(r10, r0)
        L75:
            return
        L76:
            r12.LIZJ = r6
            goto L64
        L79:
            r12.LIZJ = r0
            goto L64
        L7c:
            r12.LIZJ = r4
            goto L64
        L7f:
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFollowBackGuideSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFollowBackGuideSetting.INSTANCE
            boolean r0 = r0.enableManagePanelFollowOpt()
            if (r0 == 0) goto L95
            int r3 = r11.LIZJ
            long r1 = (long) r3
            r6 = -1
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L95
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L95
            goto L25
        L95:
            int r3 = r11.followStatus
            goto L25
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C940110aZV.onEvent(X.00z3):void");
    }

    public final void LIZ(long j, User user) {
        this.LIZ.LIZIZ(true);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C1099420eiS c1099420eiS = new C1099420eiS();
        c1099420eiS.LIZIZ(user.getId());
        c1099420eiS.LJ(j);
        c1099420eiS.getClass();
        interfaceC500940JkiUser.LIZ(new C1812130xFz(c1099420eiS)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.00z4
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiGuestV3GuestMaskControllerV2@1395.follow$1");
                C784440Upu.LIZ().LIZIZ(new C257100z3((FollowPair) obj));
                C1C7U.LIZIZ("MultiGuestV3GuestMaskControllerV2@1395.follow$1");
            }
        }, new AfS184S0100000_15(this, 257));
    }

    public final void LJ(Long l, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFollowStatus，followStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sourcr = ");
        sbLIZ.append(str);
        sbLIZ.append(", target = ");
        sbLIZ.append(l);
        C20441214yg.LIZIZ("MultiGuestV3GuestMaskControllerV2", C2188811AlT.LIZIZ(sbLIZ));
        if (l != null || (l = this.LIZ.LIZ()) != null) {
            long jLongValue = l.longValue();
            if (jLongValue != UserService.getInstance().user().getCurrentUserId()) {
                if (this.LIZIZ != null && this.LIZJ != -1) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onEvent, userId:");
                    sbLIZ2.append(jLongValue);
                    sbLIZ2.append(", update followStatus = ");
                    sbLIZ2.append(this.LIZJ);
                    C20441214yg.LIZIZ("MultiGuestV3GuestMaskControllerV2", C2188811AlT.LIZIZ(sbLIZ2));
                    LJ.put(Long.valueOf(jLongValue), Long.valueOf(this.LIZJ));
                }
                long j = this.LIZJ;
                if (j == -1) {
                    UserService.getInstance().user().LJ(jLongValue, "MultiGuestV3GuestMaskControllerV2_updateFollowStatus", "MultiGuestV3GuestMaskControllerV2_updateFollowStatus").LJJIIZ(new AfS184S0100000_15(this, 258), new C09JN() { // from class: X.00LL
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("MultiGuestV3GuestMaskControllerV2@1395.updateFollowStatus$2");
                            C1C7U.LIZIZ("MultiGuestV3GuestMaskControllerV2@1395.updateFollowStatus$2");
                        }
                    });
                    return;
                }
                if (j != 1 && j != 2) {
                    if (j == 3) {
                        C20441214yg.LIZIZ("MultiGuestV3GuestMaskControllerV2", "Guest has followed you");
                        this.LIZ.LIZIZ(false);
                        return;
                    } else {
                        this.LIZ.LIZIZ(false);
                        return;
                    }
                }
                this.LIZ.LIZIZ(true);
            }
        }
    }
}
