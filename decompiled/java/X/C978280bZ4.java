package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility;
import com.bytedance.android.live.liveinteract.multimatch.ui.IBottomNoticeAbility;
import com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility;
import com.bytedance.android.live.liveinteract.multimatch.ui.audience.v2.views.IMatchWidgetTitleAbility;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: renamed from: X.0bZ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978280bZ4 implements InterfaceC975560bUg {
    public MatchBaseWidget LL;
    public C978290bZ5 LLILLJJLI;
    public EnumC919170a1j LLILLL = EnumC919170a1j.UNKNOWN;
    public EnumC976730bWZ LLILZ;

    @Override // X.InterfaceC975560bUg
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void onDestroy() {
        C978290bZ5 c978290bZ5 = this.LLILLJJLI;
        if (c978290bZ5 != null) {
            c978290bZ5.LIZ();
        }
        this.LLILLJJLI = null;
        this.LL = null;
    }

    public C978280bZ4() {
        EnumSet.noneOf(EnumC963560bBK.class);
        this.LLILZ = EnumC976730bWZ.P1;
    }

    @Override // X.InterfaceC975560bUg
    public final EnumC976730bWZ getPriority() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
        Fragment fragmentLIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        MatchBaseWidget matchBaseWidget = this.LL;
        if (matchBaseWidget != null && (fragmentLIZ = C946803n0.LIZ(matchBaseWidget.contentView)) != null && (interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ, null)) != null) {
            IPKCountDownTitleAbility iPKCountDownTitleAbility = (IPKCountDownTitleAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPKCountDownTitleAbility.class, null);
            if (iPKCountDownTitleAbility != null) {
                iPKCountDownTitleAbility.ri();
            }
            IBottomNoticeAbility iBottomNoticeAbility = (IBottomNoticeAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, IBottomNoticeAbility.class, null);
            if (iBottomNoticeAbility != null) {
                iBottomNoticeAbility.ri();
            }
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        this.LL = matchBaseWidget;
        if (!C500260Jjc.LJIIZILJ(matchBaseWidget.provideDataChannel())) {
            if (this.LLILLJJLI == null) {
                this.LLILLJJLI = new C978290bZ5();
            }
            C978290bZ5 c978290bZ5 = this.LLILLJJLI;
            if (c978290bZ5 != null) {
                c978290bZ5.LIZIZ(matchBaseWidget, this.LLILLL);
            }
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
        Fragment fragmentLIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI;
        IMatchWidgetTitleAbility iMatchWidgetTitleAbility;
        MatchBaseWidget matchBaseWidget = this.LL;
        if (matchBaseWidget != null && (fragmentLIZ = C946803n0.LIZ(matchBaseWidget.contentView)) != null && (interfaceC665370Q7zLJIIJJI = C1558360qeg.LJIIJJI(fragmentLIZ, null)) != null && (iMatchWidgetTitleAbility = (IMatchWidgetTitleAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIJJI, IMatchWidgetTitleAbility.class, null)) != null) {
            iMatchWidgetTitleAbility.nr0();
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJI(EnumC919170a1j enumC919170a1j) {
        this.LLILLL = enumC919170a1j;
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI;
        IMatchWidgetTitleAbility iMatchWidgetTitleAbility;
        IInteractTitleAbility iInteractTitleAbility;
        MatchBaseWidget matchBaseWidget = this.LL;
        if (matchBaseWidget != null) {
            Fragment fragmentLIZ = C946803n0.LIZ(matchBaseWidget.contentView);
            if (fragmentLIZ != null && (iInteractTitleAbility = (IInteractTitleAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), IInteractTitleAbility.class, null)) != null) {
                iInteractTitleAbility.R0();
            }
            Fragment fragmentLIZ2 = C946803n0.LIZ(matchBaseWidget.contentView);
            if (fragmentLIZ2 != null && (interfaceC665370Q7zLJIIJJI = C1558360qeg.LJIIJJI(fragmentLIZ2, null)) != null && (iMatchWidgetTitleAbility = (IMatchWidgetTitleAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIJJI, IMatchWidgetTitleAbility.class, null)) != null) {
                iMatchWidgetTitleAbility.R0();
            }
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
        IInteractTitleAbility iInteractTitleAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI;
        IMatchWidgetTitleAbility iMatchWidgetTitleAbility;
        MatchBaseWidget matchBaseWidget = this.LL;
        if (matchBaseWidget != null) {
            Fragment fragmentLIZ = C946803n0.LIZ(matchBaseWidget.contentView);
            if (fragmentLIZ != null && (interfaceC665370Q7zLJIIJJI = C1558360qeg.LJIIJJI(fragmentLIZ, null)) != null && (iMatchWidgetTitleAbility = (IMatchWidgetTitleAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIJJI, IMatchWidgetTitleAbility.class, null)) != null) {
                iMatchWidgetTitleAbility.e5();
            }
            Fragment fragmentLIZ2 = C946803n0.LIZ(matchBaseWidget.contentView);
            if (fragmentLIZ2 != null && (iInteractTitleAbility = (IInteractTitleAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ2, null), IInteractTitleAbility.class, null)) != null) {
                iInteractTitleAbility.e5();
            }
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void vc(List<C954460awe> list, List<C954460awe> list2) {
        Fragment fragmentLIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        MatchBaseWidget matchBaseWidget = this.LL;
        if (matchBaseWidget != null && (fragmentLIZ = C946803n0.LIZ(matchBaseWidget.contentView)) != null && (interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ, null)) != null) {
            IInteractTitleAbility iInteractTitleAbility = (IInteractTitleAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, IInteractTitleAbility.class, null);
            if (iInteractTitleAbility != null) {
                iInteractTitleAbility.v31();
            }
            IBottomNoticeAbility iBottomNoticeAbility = (IBottomNoticeAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, IBottomNoticeAbility.class, null);
            if (iBottomNoticeAbility != null) {
                iBottomNoticeAbility.vc(list, list2);
            }
        }
    }
}
