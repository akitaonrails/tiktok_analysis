package X;

import Y.AfS183S0100000_14;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Ykd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883090Ykd implements InterfaceC883440YlC, InterfaceC883330Yl1, InterfaceC876320YZi {
    public final C0YM2 LL;
    public final C0YHX LLILLJJLI;
    public final InterfaceC874840YTq LLILLL;
    public final C1DW6 LLILZ;
    public final C0YM9 LLILZIL;
    public final C1DEV LLILZLL;
    public final C1DEV LLIZ;
    public AbstractC883300Yky LLIZLLLIL;
    public final C054G LLJ;
    public AnonymousClass0956 LLJI;
    public final AwS593S0100000_14 LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    public static final EnumC883260Yku LJIILL() {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        if (C883250Ykt.LIZJ()) {
            C882400YjW.LIZLLL();
            C882690Yjz.LJIIIZ("MainSafeSDKManager", "IM forbid by ftc");
            return EnumC883260Yku.ABORT_FTC;
        }
        C882400YjW.LIZ();
        if (C883250Ykt.LIZLLL()) {
            C882400YjW.LIZLLL();
            C882690Yjz.LJIIIZ("MainSafeSDKManager", "isImFunctionOff() = true");
            return EnumC883260Yku.ABORT_IM_OFF;
        }
        C882400YjW.LIZ();
        if (C461720I8s.LIZJ() > 0) {
            return null;
        }
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("MainSafeSDKManager", "Invalid UID");
        return EnumC883260Yku.ABORT_INVALID_UID;
    }

    @Override // X.InterfaceC876320YZi
    public final String LJFF() {
        String strName;
        EnumC883260Yku enumC883260YkuLJIIJ = LJIIJ(this.LLIZLLLIL);
        return (enumC883260YkuLJIIJ == null || (strName = enumC883260YkuLJIIJ.name()) == null) ? "not init yet" : strName;
    }

    public final C0YHC LJIIIIZZ() {
        return (C0YHC) this.LLJILJILJ.getValue();
    }

    public final C883010YkV LJIIIZ() {
        return (C883010YkV) this.LLJILLL.getValue();
    }

    public final void LJIIJJI() {
        if (!(this.LLIZLLLIL instanceof C883180Ykm)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("login unsupported in state: ");
            sbLIZ.append(this.LLIZLLLIL);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("MainSafeSDKManager", "loginSDK");
        C882400YjW.LJ();
        C883520YlK c883520YlK = C883520YlK.LIZ;
        C883520YlK.LIZLLL();
        LJIIIIZZ().LJI(C871050YFb.LIZ(this.LL));
        this.LLILLJJLI.LJIILIIL().LLLFF();
        C882400YjW.LIZIZ(this.LL).LJIJI();
    }

    public final void LJIIL() {
        if (!(this.LLIZLLLIL instanceof C883180Ykm)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("logout unsupported in state: ");
            sbLIZ.append(this.LLIZLLLIL);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!LJIIIIZZ().isLogin()) {
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZLLL();
            C882690Yjz.LJIIIZ("MainSafeSDKManager", "SDK is not logged in, skipping logout");
            return;
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("MainSafeSDKManager", "logoutSDK");
        C882400YjW.LJ();
        C883520YlK c883520YlK = C883520YlK.LIZ;
        C883520YlK.LJ();
        this.LLILLL.LIZ();
        LJIIIIZZ().logout();
        C882400YjW.LIZIZ(this.LL).LIZ();
    }

    public static final EnumC883260Yku LJIIJ(AbstractC883300Yky abstractC883300Yky) {
        if (abstractC883300Yky instanceof C883200Yko) {
            return ((C883200Yko) abstractC883300Yky).LIZJ;
        }
        return null;
    }

    @Override // X.InterfaceC883440YlC
    public final void LIZ(C0Z46 c0z46) {
        int i = C0XEQ.LIZ[c0z46.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                return;
            }
            LJIIIIZZ().LJIILJJIL().LIZJ();
            return;
        }
        LJIIIIZZ().LJIILJJIL().LJ();
    }

    @Override // X.InterfaceC876320YZi
    public final void LIZIZ(EnumC883570YlP enumC883570YlP) {
        C23250099c.LIZLLL(this.LLJ, null, null, new C883120Ykg(enumC883570YlP, this, null), 3);
    }

    @Override // X.InterfaceC876320YZi
    public final void LIZJ(AbstractC877810Yc7 abstractC877810Yc7) {
        C23250099c.LIZLLL(this.LLJ, null, null, new C876270YZd(this, abstractC877810Yc7, null), 3);
        C1906580ziK.LIZJ().LIZ().LJJLJLI(new AfS183S0100000_14(this, 13));
    }

    @Override // X.InterfaceC883440YlC
    public final void LJI(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg.service == 5 && wsChannelMsg.method == 1) {
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZ();
            C883250Ykt c883250Ykt = C883250Ykt.LL;
            if (!C461720I8s.LJ()) {
                C882400YjW.LIZLLL();
                C882690Yjz.LJFF("MainSafeSDKManager", "onReceivedMsg but not login");
            } else if (C883400Yl8.LIZ(wsChannelMsg) && !C883400Yl8.LIZIZ(wsChannelMsg)) {
                LJIIIIZZ().LJIILJJIL().LIZIZ(wsChannelMsg.logId);
            } else {
                LJIIIIZZ().LJIILJJIL().LIZ(wsChannelMsg.payloadEncoding, wsChannelMsg.LIZ());
            }
        }
    }

    @Override // X.InterfaceC883330Yl1
    public final void LJII(EnumC883280Ykw enumC883280Ykw, C883460YlE c883460YlE) {
        C23250099c.LIZLLL(this.LLJ, null, null, new C883130Ykh(this, null), 3);
        if (enumC883280Ykw == EnumC883280Ykw.LOGOUT || enumC883280Ykw == EnumC883280Ykw.SWITCH) {
            C23118094a.LJ(LJIIIZ().LIZIZ.LL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.AbstractC883060Yka r9, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C883090Ykd.LJIILJJIL(X.0Yka, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.0Ykd] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.05Vn] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r14, X.EnumC883260Yku r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C883090Ykd.LJIILIIL(java.lang.String, X.0Yku, X.05Vn):java.lang.Object");
    }

    public C883090Ykd(C0YM2 c0ym2, C0YHX c0yhx, InterfaceC874840YTq interfaceC874840YTq, C1DW6 c1dw6, C0YM9 c0ym9) {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LL = c0ym2;
        this.LLILLJJLI = c0yhx;
        this.LLILLL = interfaceC874840YTq;
        this.LLILZ = c1dw6;
        this.LLILZIL = c0ym9;
        this.LLILZLL = C2191201ApK.LIZ();
        this.LLIZ = C2191201ApK.LIZ();
        this.LLIZLLLIL = new C883190Ykn();
        this.LLJ = C2296808zG.LIZ(c1dfh.plus(C2296908zH.LIZ()));
        this.LLJIJIL = new AwS593S0100000_14(this, 353);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1661));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1660));
        this.LLJILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1662));
    }
}
