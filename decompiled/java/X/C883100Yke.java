package X;

import Y.AfS183S0100000_14;
import android.os.SystemClock;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.im.core.service.IMCoreProxyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883100Yke implements InterfaceC883440YlC, InterfaceC883330Yl1, InterfaceC876320YZi {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C0YM2 LL;
    public final C0YHX LLILLJJLI;
    public final InterfaceC874840YTq LLILLL;
    public final C1DW6 LLILZ;
    public final C0YM9 LLILZIL;
    public AbstractC883300Yky LLILZLL;
    public final C054G LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public final C883290Ykx LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public volatile C0YHV LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C883100Yke.class, "imClientProcessor", "getImClientProcessor()Lcom/bytedance/ies/im/core/api/client/IMClientProcessor;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public static final EnumC883260Yku LJIILL() {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        if (C883250Ykt.LIZJ()) {
            C882400YjW.LIZLLL();
            C882690Yjz.LJIIIZ("SDKManagerV2", "IM forbid by ftc");
            return EnumC883260Yku.ABORT_FTC;
        }
        C882400YjW.LIZ();
        if (C883250Ykt.LIZLLL()) {
            C882400YjW.LIZLLL();
            C882690Yjz.LJIIIZ("SDKManagerV2", "isImFunctionOff() = true");
            return EnumC883260Yku.ABORT_IM_OFF;
        }
        C882400YjW.LIZ();
        if (C461720I8s.LIZJ() > 0) {
            return null;
        }
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("SDKManagerV2", "Invalid UID");
        return EnumC883260Yku.ABORT_INVALID_UID;
    }

    @Override // X.InterfaceC876320YZi
    public final String LJFF() {
        String strName;
        EnumC883260Yku enumC883260YkuLJIIJ = LJIIJ(this.LLILZLL);
        return (enumC883260YkuLJIIJ == null || (strName = enumC883260YkuLJIIJ.name()) == null) ? "not init yet" : strName;
    }

    public final C0YHC LJIIIIZZ() {
        return (C0YHC) this.LLJIJIL.getValue();
    }

    public final C883010YkV LJIIIZ() {
        return (C883010YkV) this.LLJILJIL.getValue();
    }

    public final void LJIIL() {
        if (!(this.LLILZLL instanceof C883180Ykm)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("logout unsupported in state: ");
            sbLIZ.append(this.LLILZLL);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!LJIIIIZZ().isLogin()) {
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZLLL();
            C882690Yjz.LJIIIZ("SDKManagerV2", "SDK is not logged in, skipping logout");
            return;
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("SDKManagerV2", "logoutSDK");
        C882400YjW.LJ();
        C883520YlK c883520YlK = C883520YlK.LIZ;
        C883520YlK.LJ();
        this.LLILLL.LIZ();
        C0YHV c0yhv = this.LLJILJILJ;
        if (c0yhv == null) {
            synchronized (this) {
                c0yhv = this.LLJILJILJ;
                if (c0yhv == null) {
                    c0yhv = (C0YHV) C1807670x8n.LJJIIZI();
                    this.LLJILJILJ = c0yhv;
                }
            }
        }
        c0yhv.LIZIZ();
    }

    public static final EnumC883260Yku LJIIJ(AbstractC883300Yky abstractC883300Yky) {
        if (abstractC883300Yky instanceof C883200Yko) {
            return ((C883200Yko) abstractC883300Yky).LIZJ;
        }
        return null;
    }

    @Override // X.InterfaceC883440YlC
    public final void LIZ(C0Z46 c0z46) {
        int i = C883560YlO.LIZIZ[c0z46.LIZ.ordinal()];
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
        boolean z;
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBizSceneChanged: ");
        sbLIZ.append(enumC883570YlP);
        C882690Yjz.LJIIIZ("SDKManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        switch (C883560YlO.LIZ[enumC883570YlP.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AbstractC883300Yky abstractC883300Yky = this.LLILZLL;
                boolean z2 = false;
                if (!(abstractC883300Yky instanceof C883190Ykn) && !(abstractC883300Yky instanceof C883170Ykl)) {
                    z = false;
                } else {
                    z = true;
                }
                boolean zLJIILJJIL = LJIILJJIL(new C883310Ykz(LJIIJ(abstractC883300Yky), 1));
                if (z && zLJIILJJIL) {
                    z2 = true;
                }
                C882400YjW.LJFF().LJ().getClass();
                IIMUserPortraitManager iIMUserPortraitManager = (IIMUserPortraitManager) PluggableExtentionKt.pluggableSpiForReal(IIMUserPortraitManager.class);
                if (iIMUserPortraitManager != null) {
                    iIMUserPortraitManager.LJI(z2, enumC883570YlP, C0I0B.LJFF.LIZIZ());
                }
                break;
        }
    }

    @Override // X.InterfaceC876320YZi
    public final void LIZJ(AbstractC877810Yc7 abstractC877810Yc7) {
        C23250099c.LIZLLL(this.LLIZ, null, null, new C876250YZb(this, abstractC877810Yc7, null), 3);
        C1906580ziK.LIZJ().LIZ().LJJLJLI(new AfS183S0100000_14(this, 14));
    }

    @Override // X.InterfaceC883440YlC
    public final void LJI(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg.service == 5 && wsChannelMsg.method == 1) {
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZ();
            C883250Ykt c883250Ykt = C883250Ykt.LL;
            if (!C461720I8s.LJ()) {
                C882400YjW.LIZLLL();
                C882690Yjz.LJFF("SDKManagerV2", "onReceivedMsg but not login");
            } else if (C883400Yl8.LIZ(wsChannelMsg) && !C883400Yl8.LIZIZ(wsChannelMsg)) {
                LJIIIIZZ().LJIILJJIL().LIZIZ(wsChannelMsg.logId);
            } else {
                LJIIIIZZ().LJIILJJIL().LIZ(wsChannelMsg.payloadEncoding, wsChannelMsg.LIZ());
            }
        }
    }

    public final void LJIIJJI(Function0<Unit> function0) {
        if (this.LLILZLL instanceof C883180Ykm) {
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZLLL();
            C882690Yjz.LJIIIZ("SDKManagerV2", "loginSDK");
            C882400YjW.LJ();
            C883520YlK c883520YlK = C883520YlK.LIZ;
            C883520YlK.LIZLLL();
            C0YHV c0yhv = this.LLJILJILJ;
            if (c0yhv == null) {
                synchronized (this) {
                    c0yhv = this.LLJILJILJ;
                    if (c0yhv == null) {
                        c0yhv = (C0YHV) C1807670x8n.LJJIIZI();
                        this.LLJILJILJ = c0yhv;
                    }
                }
            }
            c0yhv.LIZ(function0);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("login unsupported in state: ");
        sbLIZ.append(this.LLILZLL);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIILIIL(AbstractC883300Yky abstractC883300Yky) {
        this.LLILZLL = abstractC883300Yky;
        if (abstractC883300Yky instanceof C883170Ykl) {
            this.LLIZLLLIL = C23250099c.LIZLLL(this.LLIZ, null, null, new C0YUH(((C883170Ykl) abstractC883300Yky).LIZIZ, this, null), 3);
            return;
        }
        if (abstractC883300Yky instanceof C883230Ykr) {
            int i = IMCoreProxyService.LIZJ;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - IMCoreProxyService.LIZIZ;
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setUp: moduleLiveDuration-");
            sbLIZ.append(jElapsedRealtime);
            sbLIZ.append("ms");
            C882690Yjz.LJIIIZ("SDKManagerV2", C2188811AlT.LIZIZ(sbLIZ));
            AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C882400YjW.LJFF().LJ().getClass();
            IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpiForReal(IAwemeImManager.class);
            if (iAwemeImManager != null) {
                iAwemeImManager.LIZ();
            }
            C882400YjW.LIZ();
            C883250Ykt c883250Ykt = C883250Ykt.LL;
            C883250Ykt.LIZIZ(this);
            C882400YjW.LIZ();
            C1336205Ku.LIZJ().LJII(new C883240Yks(this));
            ((InterfaceC883070Ykb) this.LLJI.getValue()).LIZ(LJIIIIZZ());
            this.LLILLJJLI.LJIJI().LJIIJ(this.LLILZ);
            C883370Yl5 c883370Yl5 = C883370Yl5.LL;
            C883370Yl5.LIZJ(this);
            C882400YjW.LIZIZ(this.LL).LJIILJJIL();
            LJIILJJIL(new C883310Ykz((EnumC883260Yku) null, 3));
            return;
        }
        if (!(abstractC883300Yky instanceof C883180Ykm)) {
            return;
        }
        C883180Ykm c883180Ykm = (C883180Ykm) abstractC883300Yky;
        String str = c883180Ykm.LIZIZ;
        EnumC883260Yku enumC883260Yku = c883180Ykm.LIZJ;
        synchronized (this) {
            C882400YjW.LIZ.getClass();
            C0YUF c0yufLIZLLL = C882400YjW.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("refreshSDK started, prevUid: ");
            sbLIZ2.append(str);
            sbLIZ2.append("\n\tisSDKLogin:");
            sbLIZ2.append(LJIIIIZZ().isLogin());
            sbLIZ2.append(", new UID:");
            C882400YjW.LIZ();
            C883250Ykt c883250Ykt2 = C883250Ykt.LL;
            sbLIZ2.append(C461720I8s.LIZIZ());
            C882690Yjz.LJIIIZ("SDKManagerV2", C2188811AlT.LIZIZ(sbLIZ2));
            if (this.LLILZLL instanceof C883180Ykm) {
                C882400YjW.LIZ();
                if (!C461720I8s.LJ()) {
                    LJIIL();
                    EnumC883260Yku enumC883260Yku2 = EnumC883260Yku.ABORT_ACCOUNT_NOT_LOGIN;
                    LJIILJJIL(new C883050YkZ(CardStruct.IStatusCode.DEFAULT, enumC883260Yku2));
                    LJIIIZ().LIZ(enumC883260Yku2, this.LLJ, enumC883260Yku);
                    return;
                }
                EnumC883260Yku enumC883260YkuLJIILL = LJIILL();
                if (enumC883260YkuLJIILL == null) {
                    if (LJIIIIZZ().isLogin()) {
                        C882400YjW.LIZ();
                        if (Intrinsics.LJFF(str, C461720I8s.LIZIZ())) {
                            C882690Yjz.LJIIIZ("SDKManagerV2", "SDK already logged in for this account");
                            EnumC883260Yku enumC883260Yku3 = EnumC883260Yku.SKIP_SDK_ALREADY_LOGIN;
                            LJIILJJIL(new C883050YkZ(str, enumC883260Yku3));
                            LJIIIZ().LIZ(enumC883260Yku3, this.LLJ, enumC883260Yku);
                            return;
                        }
                    }
                    if (!Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                        C882400YjW.LIZ();
                        if (!Intrinsics.LJFF(str, C461720I8s.LIZIZ())) {
                            LJIIL();
                        }
                    }
                    C882400YjW.LIZIZ(this.LL).LJJI();
                    if (!Intrinsics.LJFF(this.LLILZLL.LIZ, C877820Yc8.LIZ) && C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_sdk_ensure_in_caller_thread", true) != 2) {
                        C23250099c.LIZLLL(this.LLIZ, null, null, new C0YUK(this, null), 3);
                    } else {
                        LJIIJJI(new AwS558S0100000_14(this, 1666));
                    }
                } else {
                    LJIIL();
                    C882400YjW.LIZ();
                    LJIILJJIL(new C883050YkZ(C461720I8s.LIZIZ(), enumC883260YkuLJIILL));
                    LJIIIZ().LIZ(enumC883260YkuLJIILL, this.LLJ, enumC883260Yku);
                }
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Unsupported in state: ");
            sbLIZ3.append(this.LLILZLL);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public final synchronized boolean LJIILJJIL(AbstractC883060Yka abstractC883060Yka) {
        boolean z;
        AbstractC883300Yky abstractC883300YkyLIZ = this.LLILZLL.LIZ(abstractC883060Yka);
        if (Intrinsics.LJFF(this.LLILZLL, abstractC883300YkyLIZ)) {
            C882400YjW.LIZ.getClass();
            C0YUF c0yufLIZLLL = C882400YjW.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("same state [");
            sbLIZ.append(this.LLILZLL);
            sbLIZ.append("], do nothing");
            C882690Yjz.LJIIIZ("SDKManagerV2", C2188811AlT.LIZIZ(sbLIZ));
            z = false;
        } else {
            C882400YjW.LIZ.getClass();
            C0YUF c0yufLIZLLL2 = C882400YjW.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("from [");
            sbLIZ2.append(this.LLILZLL);
            sbLIZ2.append("] to [");
            sbLIZ2.append(abstractC883300YkyLIZ);
            sbLIZ2.append(']');
            C882690Yjz.LJIIIZ("SDKManagerV2", C2188811AlT.LIZIZ(sbLIZ2));
            LJIILIIL(abstractC883300YkyLIZ);
            z = true;
        }
        return z;
    }

    @Override // X.InterfaceC883330Yl1
    public final void LJII(EnumC883280Ykw enumC883280Ykw, C883460YlE c883460YlE) {
        LJIILJJIL(new C883310Ykz(LJIIJ(this.LLILZLL), 1));
        if (enumC883280Ykw == EnumC883280Ykw.LOGOUT || enumC883280Ykw == EnumC883280Ykw.SWITCH) {
            C23118094a.LJ(LJIIIZ().LIZIZ.LL);
        }
    }

    public C883100Yke(C0YM2 c0ym2, C0YHX c0yhx, InterfaceC874840YTq interfaceC874840YTq, C1DW6 c1dw6, C0YM9 c0ym9) {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LL = c0ym2;
        this.LLILLJJLI = c0yhx;
        this.LLILLL = interfaceC874840YTq;
        this.LLILZ = c1dw6;
        this.LLILZIL = c0ym9;
        this.LLILZLL = new C883190Ykn();
        this.LLIZ = C2296808zG.LIZ(c1dfh.plus(C2296908zH.LIZ()));
        this.LLJ = new C883290Ykx(this);
        this.LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1665));
        this.LLJIJIL = C452501pT.LIZIZ(new C883080Ykc(this));
        this.LLJILJIL = C452501pT.LIZIZ(new C883020YkW(this));
    }
}
