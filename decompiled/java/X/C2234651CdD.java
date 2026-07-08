package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkEnableMuteLocalVideoImpl;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiTalkSetting;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1CdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234651CdD implements InterfaceC966930bGl {
    public final LinkMicMultiLinker LIZ;
    public final boolean LIZIZ;
    public volatile boolean LIZJ;
    public final AtomicReference<Function0<Unit>> LIZLLL = new AtomicReference<>(new C2234691CdH(this));

    @Override // X.InterfaceC966930bGl
    public final void LJFF(String str) {
    }

    @Override // X.InterfaceC966930bGl
    public final void LJIIIZ(int i, String str) {
    }

    @Override // X.InterfaceC966930bGl
    public final void LJIIZILJ(Map<String, C968380bJ6> map) {
    }

    @Override // X.InterfaceC966930bGl
    public final void LJIJ(int i, String str, String str2) {
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJI(String str, boolean z) {
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJIJL(long j, boolean z) {
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJLLLLLLLZ(long j, int i, EnumC2233251Cax enumC2233251Cax) {
    }

    @Override // X.InterfaceC966930bGl
    public final void muteRemoteAudioStream(String str, boolean z) {
    }

    public static final Throwable LJIIJJI() {
        if (C1304630k3R.LIZIZ && C1304650k3T.LIZ) {
            return new Throwable();
        }
        return null;
    }

    @Override // X.InterfaceC966930bGl
    public final void LIZ() {
        LJIIL(new C2235371CeN(this));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJ() {
        LJIIL(new C2235421CeS(this));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJJ() {
        LJIIL(new C2235351CeL(this));
    }

    @Override // X.InterfaceC966930bGl
    public final List<C968340bJ2> LJJJJZI() {
        List listInvoke = C13BV.INSTANCE;
        C2234741CdM c2234741CdM = new C2234741CdM(this);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            listInvoke = c2234741CdM.invoke();
        }
        return listInvoke;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJLIIL() {
        C1304630k3R.LIZ(100001, "multi linker but call leaveRtcRoom", "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIJ() {
        LiveSeiTalkSetting liveSeiTalkSetting = LiveSeiTalkSetting.INSTANCE;
        if (liveSeiTalkSetting.enable()) {
            LJIIL(new C2235321CeI(this, liveSeiTalkSetting.getInterval(), liveSeiTalkSetting.volumeThreshold()));
        }
    }

    @Override // X.InterfaceC966930bGl
    public final boolean LJJLIL() {
        return this.LIZ.LLJ();
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLJLI() {
        C1304630k3R.LIZ(100001, "multi linker but call joinRtcRoom", "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLI() {
        LJIIL(new C2235361CeM(this));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLIIIL() {
        LJIIL(new C2235401CeQ(this));
    }

    @Override // X.InterfaceC966930bGl
    public final LinkMicRtcDispatcher LJLIIL() {
        return this.LIZ.LJJLIIJ();
    }

    @Override // X.InterfaceC966930bGl
    public final List<C968980bK4> LJLIL() {
        List listInvoke = C13BV.INSTANCE;
        C2234731CdL c2234731CdL = new C2234731CdL(this);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            listInvoke = c2234731CdL.invoke();
        }
        return listInvoke;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJLJL() {
        List listInvoke = C13BV.INSTANCE;
        C2234791CdR c2234791CdR = new C2234791CdR(this);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            listInvoke = c2234791CdR.invoke();
        }
        return listInvoke;
    }

    @Override // X.InterfaceC966930bGl
    public final void LL() {
        C965900bF6.LIZ(new C2235441CeU(this));
    }

    @Override // X.InterfaceC966930bGl
    public final String LLF() {
        return this.LIZ.LJJLIL();
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LLFF() {
        List listInvoke = C13BV.INSTANCE;
        C2234721CdK c2234721CdK = new C2234721CdK(this);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            listInvoke = c2234721CdK.invoke();
        }
        return listInvoke;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJJJI() {
        C1304630k3R.LJFF();
        List listInvoke = C13BV.INSTANCE;
        C2234761CdO c2234761CdO = new C2234761CdO(this);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            listInvoke = c2234761CdO.invoke();
        }
        return listInvoke;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJJJJ() {
        C1304630k3R.LJFF();
        List listInvoke = C13BV.INSTANCE;
        C2234751CdN c2234751CdN = new C2234751CdN(this);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            listInvoke = c2234751CdN.invoke();
        }
        return listInvoke;
    }

    @Override // X.InterfaceC966930bGl
    public final C967830bID LJJL() {
        Object objInvoke;
        C1304630k3R.LJFF();
        C2235091Cdv c2235091Cdv = new C2235091Cdv(this);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
            objInvoke = null;
        } else {
            objInvoke = c2235091Cdv.invoke();
        }
        return (C967830bID) objInvoke;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJJLIIIIJ() {
        C1304630k3R.LJFF();
        List listInvoke = C13BV.INSTANCE;
        C2234781CdQ c2234781CdQ = new C2234781CdQ(this);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            listInvoke = c2234781CdQ.invoke();
        }
        return listInvoke;
    }

    @Override // X.InterfaceC966930bGl
    public final int LJJLIIIJILLIZJL() {
        C1304630k3R.LJFF();
        Object objInvoke = 0;
        C2234811CdT c2234811CdT = new C2234811CdT(this);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            objInvoke = c2234811CdT.invoke();
        }
        return ((Number) objInvoke).intValue();
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJLLJ() {
        C1304630k3R.LJFF();
        List listInvoke = C13BV.INSTANCE;
        C2234771CdP c2234771CdP = new C2234771CdP(this);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            listInvoke = c2234771CdP.invoke();
        }
        return listInvoke;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJII() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJIL() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJJIJIIJI() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJJIJLIJ() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJJJJLI() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC966930bGl
    public final void LIZIZ(String str) {
        C1304630k3R.LIZ(100001, "multi linker but call reset", "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final boolean LJ(String str) {
        Object objInvoke = Boolean.FALSE;
        C2234801CdS c2234801CdS = new C2234801CdS(this, str);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            objInvoke = c2234801CdS.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // X.InterfaceC966930bGl
    public final boolean LJI(String str) {
        Object objInvoke = Boolean.FALSE;
        C2234301Cce c2234301Cce = new C2234301Cce(this, str);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            objInvoke = c2234301Cce.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    public final void LJIIL(Function0<Unit> function0) {
        C965900bF6.LIZ(new C2234711CdJ(this, LJIIJJI(), function0));
    }

    @Override // X.InterfaceC968620bJU
    public final void LJJIFFI(boolean z) {
        LJIIL(new C2235411CeR(this, z));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJIZL(C2227521CGg c2227521CGg) {
        LJIIL(new C2234141CcO(this, c2227521CGg));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJLZIJ(boolean z) {
        LJIIL(new C2234201CcU(this, z));
    }

    @Override // X.InterfaceC966930bGl
    public final C967180bHA LJJLL(String str) {
        Object objInvoke;
        C1304630k3R.LJFF();
        C2235011Cdn c2235011Cdn = new C2235011Cdn(this, str);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
            objInvoke = null;
        } else {
            objInvoke = c2235011Cdn.invoke();
        }
        return (C967180bHA) objInvoke;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLILLLLZI(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try to changeVideoState to ");
        sbLIZ.append(z);
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), "MultiLinker[Biz]");
        LJIIL(new C2235341CeK(this, z));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLJJI(InterfaceC2235471CeX interfaceC2235471CeX) {
        C2234401Cco c2234401Cco = new C2234401Cco(interfaceC2235471CeX, this);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            c2234401Cco.invoke();
        }
    }

    @Override // X.InterfaceC966930bGl
    public final Long LJLJJL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try to get selfWillJoinLinkedTimeWithTargetUser with ");
        sbLIZ.append(j);
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), "MultiLinker[Biz]");
        return null;
    }

    @Override // X.InterfaceC966930bGl
    public final int LJZ(String str) {
        Object objValueOf = Integer.valueOf(C1282000jSw.LJFF(C1CXJ.Undefined));
        C2234681CdG c2234681CdG = new C2234681CdG(this, str);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            objValueOf = c2234681CdG.invoke();
        }
        return ((Number) objValueOf).intValue();
    }

    @Override // X.InterfaceC966930bGl
    public final void LJZL(List<C967180bHA> list) {
        LJIIL(new C2234241CcY(this, list));
    }

    @Override // X.InterfaceC966930bGl
    public final void LLD(String str) {
        C1304630k3R.LIZ(100001, "multi linker but call clearCrossStates", "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final void LLFZ(boolean z) {
        LJIIL(new C2235381CeO(this, z));
    }

    @Override // X.InterfaceC966930bGl
    public final int LLI(String str) {
        Object objInvoke = -1;
        C2234821CdU c2234821CdU = new C2234821CdU(this, str);
        Throwable thLJIIJJI = LJIIJJI();
        if (this.LIZJ) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            objInvoke = c2234821CdU.invoke();
        }
        return ((Number) objInvoke).intValue();
    }

    @Override // X.InterfaceC966930bGl
    public final void changeOnlineUserState(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try to changeOnlineUserState to ");
        sbLIZ.append(i);
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), "MultiLinker[Biz]");
        LJIIL(new C2235391CeP(this, i));
    }

    public C2234651CdD(LinkMicMultiLinker linkMicMultiLinker, boolean z) {
        this.LIZ = linkMicMultiLinker;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC967010bGt
    public final void LIZJ(C968750bJh c968750bJh, C966240bFe c966240bFe) {
        LJIIL(new C2235041Cdq(this, c968750bJh, c966240bFe));
    }

    @Override // X.InterfaceC967010bGt
    public final void LIZLLL(C969130bKJ c969130bKJ, C966240bFe c966240bFe) {
        LJIIL(new C2235051Cdr(this, c969130bKJ, c966240bFe));
    }

    @Override // X.InterfaceC967010bGt
    public final void LJIIIIZZ(C2231451CVj c2231451CVj, C966240bFe c966240bFe) {
        LJIIL(new C2235181Ce4(this, c2231451CVj, c966240bFe));
    }

    @Override // X.InterfaceC967010bGt
    public final void LJIIJ(C920810a4N c920810a4N, C966240bFe c966240bFe) {
        LJIIL(new C2235191Ce5(this, c920810a4N, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJIIZ(String str, boolean z) {
        LJIIL(new C2234181CcS(this, str, z));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJI(C2234021CcC c2234021CcC, C966240bFe c966240bFe) {
        LJIIL(new C2235131Cdz(this, c2234021CcC, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJJL(boolean z, String str) {
        if (!LinkMicSdkEnableMuteLocalVideoImpl.INSTANCE.getValue()) {
            return;
        }
        LJIIL(new C2235431CeT(this, str, z));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJL(C2235631Cen c2235631Cen, C966240bFe c966240bFe) {
        C1304630k3R.LIZ(100001, "multi linker but call inviteGroup", "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJLL(C969440bKo c969440bKo, C966240bFe c966240bFe) {
        C1304630k3R.LIZ(100001, "multi linker but call cancelApplyGroup", "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJZ(C968530bJL c968530bJL, C966240bFe c966240bFe) {
        LJIIL(new C2235161Ce2(this, c968530bJL, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJLL(C2234011CcB c2234011CcB, C966240bFe c966240bFe) {
        LJIIL(new C2234661CdE(c2234011CcB, this, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJZ(C2231451CVj c2231451CVj, C966240bFe c966240bFe) {
        LJIIL(new C2235121Cdy(this, c2231451CVj, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLI(C2235631Cen c2235631Cen, C966240bFe c966240bFe) {
        C1304630k3R.LIZ(100001, "multi linker but call applyGroup", "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJ(C2235641Ceo c2235641Ceo, C966240bFe c966240bFe) {
        C1304630k3R.LIZ(100001, "multi linker but call permitGroup", "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJJIZ(C2234001CcA c2234001CcA, C966240bFe c966240bFe) {
        C1304630k3R.LIZ(100001, "multi linker but call leaveGroup", "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJL(C969290bKZ c969290bKZ, String str) {
        LJIIL(new C2234291Ccd(this, c969290bKZ, str));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJLJLI(C2234011CcB c2234011CcB, C966240bFe c966240bFe) {
        LJIIL(new C2234671CdF(c2234011CcB, this, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLJ(C969440bKo c969440bKo, C966240bFe c966240bFe) {
        C1304630k3R.LIZ(100001, "multi linker but call cancelInviteGroup", "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJZ(C969140bKK c969140bKK, C966240bFe c966240bFe) {
        LJIIL(new C2235071Cdt(this, c969140bKK, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJZZI(C972290bPP c972290bPP, InterfaceC968200bIo interfaceC968200bIo) {
        LJIIL(new C2234261Cca(this, c972290bPP, interfaceC968200bIo));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJZZIII(C920810a4N c920810a4N, C966240bFe c966240bFe) {
        LJIIL(new C2235141Ce0(this, c920810a4N, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJL(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("multi linker but call dispose, source ");
        sbLIZ.append(str);
        C1304630k3R.LIZ(100001, C2188811AlT.LIZIZ(sbLIZ), "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLJI(C969290bKZ c969290bKZ, C966240bFe c966240bFe) {
        LJIIL(new C2235101Cdw(this, c969290bKZ, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLJJLL(C968750bJh c968750bJh, C966240bFe c966240bFe) {
        LJIIL(new C2235171Ce3(this, c968750bJh, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final C1AZI LJLJLJ(List<C2183391Acj> list, C1AZR c1azr) {
        if (this.LIZJ) {
            return null;
        }
        return this.LIZ.LJJLIIIJ(list, c1azr);
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLJLLL(C969130bKJ c969130bKJ, C966240bFe c966240bFe) {
        LJIIL(new C2235061Cds(this, c969130bKJ, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLLI(C2235641Ceo c2235641Ceo, C966240bFe c966240bFe) {
        C1304630k3R.LIZ(100001, "multi linker but call replyGroup", "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final C1AZI LJLLILLLL(List<C2183391Acj> list, C1AZQ c1azq) {
        return this.LIZ.LJJL(list, c1azq);
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLLL(C2227521CGg c2227521CGg, C966240bFe c966240bFe) {
        LJIIL(new C2235111Cdx(this, c2227521CGg, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLLLL(C1CKR c1ckr, InterfaceC968200bIo interfaceC968200bIo) {
        LJIIL(new C2234271Ccb(this, c1ckr, interfaceC968200bIo));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLLLLLL(C969280bKY c969280bKY, C966240bFe c966240bFe) {
        LJIIL(new C2235151Ce1(this, c969280bKY, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLZ(C968370bJ5 c968370bJ5, C966240bFe c966240bFe) {
        C1304630k3R.LIZ(100001, "multi linker but call rechargeGroupList", "Linker[Biz]");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJZI(InterfaceC967450bHb interfaceC967450bHb, List list) {
        LJIIL(new C2234701CdI(this, list, interfaceC967450bHb));
    }

    @Override // X.InterfaceC966930bGl
    public final void LLFFF(C968590bJR c968590bJR, C966240bFe c966240bFe) {
        LJIIL(new C2235081Cdu(this, c968590bJR, c966240bFe));
    }

    @Override // X.InterfaceC966930bGl
    public final void LLFII(C969130bKJ c969130bKJ, String str) {
        LJIIL(new C2235331CeJ(this, c969130bKJ, str));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLL(int i, String str, boolean z) {
        LJIIL(new C2234191CcT(this, i, z, str));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJJI(boolean z, boolean z2, String str, EnumC965730bEp enumC965730bEp, boolean z3) {
        Function0<Unit> andSet = this.LIZLLL.getAndSet(null);
        if (andSet != null) {
            if (this.LIZIZ) {
                C965900bF6.LIZ(new C2234051CcF(z2, andSet, this, str));
            } else if (z) {
                LJIIL(new C2234071CcH(this, andSet));
            } else {
                C965900bF6.LIZ(andSet);
            }
        }
    }
}
