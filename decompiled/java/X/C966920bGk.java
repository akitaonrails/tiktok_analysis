package X;

import android.os.Looper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRustDowngradeSetting;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966920bGk implements InterfaceC966930bGl {
    public final boolean LIZ;
    public final String LIZIZ = "RustLinker";
    public final Function0<InterfaceC966930bGl> LIZJ;
    public final Function0<Unit> LIZLLL;
    public volatile InterfaceC966930bGl LJ;
    public boolean LJFF;
    public boolean LJI;

    @Override // X.InterfaceC966930bGl
    public final void LIZ() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LIZ();
        }
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJII() {
        List<C967180bHA> listLJII;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLJII = interfaceC966930bGl.LJII()) == null) ? C13BV.INSTANCE : listLJII;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJIL() {
        List<C967180bHA> listLJIL;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLJIL = interfaceC966930bGl.LJIL()) == null) ? C13BV.INSTANCE : listLJIL;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJJIJIIJI() {
        List<C967180bHA> listLJJIJIIJI;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLJJIJIIJI = interfaceC966930bGl.LJJIJIIJI()) == null) ? C13BV.INSTANCE : listLJJIJIIJI;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJJIJLIJ() {
        List<C967180bHA> listLJJIJLIJ;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLJJIJLIJ = interfaceC966930bGl.LJJIJLIJ()) == null) ? C13BV.INSTANCE : listLJJIJLIJ;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJ() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJJ();
        }
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJJJI() {
        List<C967180bHA> listLJJJI;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLJJJI = interfaceC966930bGl.LJJJI()) == null) ? C13BV.INSTANCE : listLJJJI;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJJJJ() {
        List<C967180bHA> listLJJJJ;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLJJJJ = interfaceC966930bGl.LJJJJ()) == null) ? C13BV.INSTANCE : listLJJJJ;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJJ() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJJJJ();
        }
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJJJJLI() {
        List<C967180bHA> listLJJJJLI;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLJJJJLI = interfaceC966930bGl.LJJJJLI()) == null) ? C13BV.INSTANCE : listLJJJJLI;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C968340bJ2> LJJJJZI() {
        List<C968340bJ2> listLJJJJZI;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLJJJJZI = interfaceC966930bGl.LJJJJZI()) == null) ? C13BV.INSTANCE : listLJJJJZI;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJLIIL() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJJLIIL();
        }
    }

    @Override // X.InterfaceC966930bGl
    public final C967830bID LJJL() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            return interfaceC966930bGl.LJJL();
        }
        return null;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJJLIIIIJ() {
        List<C967180bHA> listLJJLIIIIJ;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLJJLIIIIJ = interfaceC966930bGl.LJJLIIIIJ()) == null) ? C13BV.INSTANCE : listLJJLIIIIJ;
    }

    @Override // X.InterfaceC966930bGl
    public final int LJJLIIIJILLIZJL() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            return interfaceC966930bGl.LJJLIIIJILLIZJL();
        }
        return 0;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIJ() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJLIIJ();
        }
    }

    @Override // X.InterfaceC966930bGl
    public final boolean LJJLIL() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            return interfaceC966930bGl.LJJLIL();
        }
        return false;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLJLI() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJLJLI();
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLI() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLI();
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLIIIL() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLIIIL();
        }
    }

    @Override // X.InterfaceC966930bGl
    public final LinkMicRtcDispatcher LJLIIL() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            return interfaceC966930bGl.LJLIIL();
        }
        return null;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C968980bK4> LJLIL() {
        List<C968980bK4> listLJLIL;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLJLIL = interfaceC966930bGl.LJLIL()) == null) ? C13BV.INSTANCE : listLJLIL;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJLJL() {
        List<C967180bHA> listLJLJL;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLJLJL = interfaceC966930bGl.LJLJL()) == null) ? C13BV.INSTANCE : listLJLJL;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LJLLJ() {
        List<C967180bHA> listLJLLJ;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLJLLJ = interfaceC966930bGl.LJLLJ()) == null) ? C13BV.INSTANCE : listLJLLJ;
    }

    @Override // X.InterfaceC966930bGl
    public final void LL() {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LL();
        }
    }

    @Override // X.InterfaceC966930bGl
    public final String LLF() {
        String strLLF;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (strLLF = interfaceC966930bGl.LLF()) == null) ? "" : strLLF;
    }

    @Override // X.InterfaceC966930bGl
    public final List<C967180bHA> LLFF() {
        List<C967180bHA> listLLFF;
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        return (interfaceC966930bGl == null || (listLLFF = interfaceC966930bGl.LLFF()) == null) ? C13BV.INSTANCE : listLLFF;
    }

    @Override // X.InterfaceC966930bGl
    public final void LIZIZ(String str) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LIZIZ(str);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final boolean LJ(String str) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            return interfaceC966930bGl.LJ(str);
        }
        return false;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJFF(String str) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJFF(str);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final boolean LJI(String str) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            return interfaceC966930bGl.LJI(str);
        }
        return false;
    }

    public final void LJIIJJI(C966240bFe c966240bFe) {
        if (this.LJI && !this.LIZ) {
            if (!this.LJFF && LinkMicRustDowngradeSetting.INSTANCE.downgrade()) {
                this.LIZLLL.invoke();
            } else if (this.LJFF) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131840613));
            }
            c966240bFe.LIZJ(new C967640bHu("", new C966980bGq(-1L, "on rtc downgrade", "", "", ""), null));
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJIIZILJ(Map<String, C968380bJ6> map) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJIIZILJ(map);
        }
    }

    @Override // X.InterfaceC968620bJU
    public final void LJJIFFI(boolean z) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJIFFI(z);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJIZL(C2227521CGg c2227521CGg) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJJJIZL(c2227521CGg);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJLZIJ(boolean z) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJJLZIJ(z);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final C967180bHA LJJLL(String str) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            return interfaceC966930bGl.LJJLL(str);
        }
        return null;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLILLLLZI(boolean z) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLILLLLZI(z);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLJJI(InterfaceC2235471CeX interfaceC2235471CeX) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLJJI(interfaceC2235471CeX);
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
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            return interfaceC966930bGl.LJZ(str);
        }
        return C1282000jSw.LJFF(C1CXJ.Undefined);
    }

    @Override // X.InterfaceC966930bGl
    public final void LJZL(List<C967180bHA> list) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJZL(list);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LLD(String str) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LLD(str);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LLFZ(boolean z) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LLFZ(z);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final int LLI(String str) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            return interfaceC966930bGl.LLI(str);
        }
        return -1;
    }

    @Override // X.InterfaceC966930bGl
    public final void changeOnlineUserState(int i) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.changeOnlineUserState(i);
        }
    }

    @Override // X.InterfaceC967010bGt
    public final void LIZJ(C968750bJh c968750bJh, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LIZJ(c968750bJh, c966240bFe);
        } else {
            LJIIJJI(c966240bFe);
        }
    }

    @Override // X.InterfaceC967010bGt
    public final void LIZLLL(C969130bKJ c969130bKJ, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LIZLLL(c969130bKJ, c966240bFe);
        } else {
            LJIIJJI(c966240bFe);
        }
    }

    @Override // X.InterfaceC967010bGt
    public final void LJIIIIZZ(C2231451CVj c2231451CVj, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJIIIIZZ(c2231451CVj, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJIIIZ(int i, String str) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJIIIZ(i, str);
        }
    }

    @Override // X.InterfaceC967010bGt
    public final void LJIIJ(C920810a4N c920810a4N, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJIIJ(c920810a4N, c966240bFe);
        } else {
            LJIIJJI(c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJI(String str, boolean z) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJI(str, z);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJIIZ(String str, boolean z) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJIIZ(str, z);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJIJL(long j, boolean z) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJIJL(j, z);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJI(C2234021CcC c2234021CcC, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJJJI(c2234021CcC, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJJL(boolean z, String str) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJJJJL(z, str);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJL(C2235631Cen c2235631Cen, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJJJL(c2235631Cen, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJLL(C969440bKo c969440bKo, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJJJLL(c969440bKo, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJZ(C968530bJL c968530bJL, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJJJZ(c968530bJL, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJLL(C2234011CcB c2234011CcB, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJJLL(c2234011CcB, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJZ(C2231451CVj c2231451CVj, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJJZ(c2231451CVj, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLI(C2235631Cen c2235631Cen, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJLI(c2235631Cen, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJ(C2235641Ceo c2235641Ceo, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJLIIIJ(c2235641Ceo, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJJIZ(C2234001CcA c2234001CcA, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJLIIIJJIZ(c2234001CcA, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJL(C969290bKZ c969290bKZ, String str) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJLIIIJL(c969290bKZ, str);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJLJLI(C2234011CcB c2234011CcB, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJLIIIJLJLI(c2234011CcB, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLJ(C969440bKo c969440bKo, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJLJ(c969440bKo, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJZ(C969140bKK c969140bKK, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJZ(c969140bKK, c966240bFe);
        } else {
            LJIIJJI(c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJZZI(C972290bPP c972290bPP, InterfaceC968200bIo interfaceC968200bIo) {
        C966990bGr c966990bGr = new C966990bGr(this, c972290bPP, interfaceC968200bIo);
        C969310bKb c969310bKb = C969310bKb.LIZLLL;
        if (Intrinsics.LJFF(c969310bKb.LIZIZ, Looper.myLooper())) {
            c966990bGr.invoke();
        } else {
            c969310bKb.LIZ(new RunnableC966320bFm(c966990bGr));
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJZZIII(C920810a4N c920810a4N, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJZZIII(c920810a4N, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJL(String str, boolean z) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJL(str, z);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLJI(C969290bKZ c969290bKZ, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLJI(c969290bKZ, c966240bFe);
        } else {
            LJIIJJI(c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLJJLL(C968750bJh c968750bJh, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLJJLL(c968750bJh, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final C1AZI LJLJLJ(List<C2183391Acj> list, C1AZR c1azr) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            return interfaceC966930bGl.LJLJLJ(list, c1azr);
        }
        return null;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLJLLL(C969130bKJ c969130bKJ, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLJLLL(c969130bKJ, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLLI(C2235641Ceo c2235641Ceo, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLLI(c2235641Ceo, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final C1AZI LJLLILLLL(List<C2183391Acj> list, C1AZQ c1azq) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            return interfaceC966930bGl.LJLLILLLL(list, c1azq);
        }
        return null;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLLL(C2227521CGg c2227521CGg, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLLL(c2227521CGg, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLLLL(C1CKR c1ckr, InterfaceC968200bIo interfaceC968200bIo) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLLLL(c1ckr, interfaceC968200bIo);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLLLLLL(C969280bKY c969280bKY, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLLLLLL(c969280bKY, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLZ(C968370bJ5 c968370bJ5, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLZ(c968370bJ5, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJZI(final InterfaceC967450bHb interfaceC967450bHb, List list) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJZI(new InterfaceC967450bHb() { // from class: X.0bGu
                @Override // X.InterfaceC967500bHg
                public final void LJIIL() {
                }

                @Override // X.InterfaceC967500bHg
                public final void LJIILJJIL(int i, C967130bH5 c967130bH5) {
                }

                @Override // X.InterfaceC967500bHg
                public final void LJIILLIIL(List<LinkUser> list2, List<LinkUser> list3) {
                }

                @Override // X.InterfaceC967450bHb
                public final void LJJIIJ(List<LinkUser> list2, List<LinkUser> list3) {
                }

                @Override // X.InterfaceC967450bHb
                public final void LJJJJZ(List<LinkUser> list2, List<LinkUser> list3) {
                }

                @Override // X.InterfaceC967450bHb
                public final void LJJJJZI(List<LinkUser> list2) {
                }

                @Override // X.InterfaceC967450bHb
                public final void LJJJLL(List<LinkUser> list2) {
                }

                @Override // X.InterfaceC967450bHb
                public final void LJJJLZIJ(LinkUser linkUser) {
                }

                @Override // X.InterfaceC967450bHb
                public final void LJJL() {
                    C500260Jjc.LJJLIIIJILLIZJL(new C967740bI4(interfaceC967450bHb));
                }
            }, list);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LLFFF(C968590bJR c968590bJR, C966240bFe c966240bFe) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LLFFF(c968590bJR, c966240bFe);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LLFII(C969130bKJ c969130bKJ, String str) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LLFII(c969130bKJ, str);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void muteRemoteAudioStream(String str, boolean z) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.muteRemoteAudioStream(str, z);
        }
    }

    public C966920bGk(C972570bPr c972570bPr, C966670bGL c966670bGL, boolean z) {
        this.LIZ = z;
        this.LIZJ = c972570bPr;
        this.LIZLLL = c966670bGL;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJIJ(int i, String str, String str2) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJIJ(i, str, str2);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJLLLLLLLZ(long j, int i, EnumC2233251Cax enumC2233251Cax) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJLIIIJLLLLLLLZ(j, i, enumC2233251Cax);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLL(int i, String str, boolean z) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJLL(i, str, z);
        }
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJJI(boolean z, boolean z2, String str, EnumC965730bEp enumC965730bEp, boolean z3) {
        InterfaceC966930bGl interfaceC966930bGl = this.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJLIIIJJI(z, z2, str, enumC965730bEp, z3);
            return;
        }
        if (!this.LJFF) {
            this.LJFF = true;
        }
        if (this.LJI) {
            C1304630k3R.LJII(6, "on rust Linker init error and has downgrade", this.LIZIZ);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on rust Linker destroy without initialized..[");
        sbLIZ.append(str);
        sbLIZ.append("] ");
        C1304630k3R.LIZ(100001, C2188811AlT.LIZIZ(sbLIZ), this.LIZIZ);
    }
}
