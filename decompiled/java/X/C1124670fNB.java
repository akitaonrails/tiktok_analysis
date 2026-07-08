package X;

import Y.ARunnableS25S0400000_17;
import android.view.View;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fNB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124670fNB implements InterfaceC1127800fSE {
    public final DataChannel LL;
    public final AbstractC1100450ek7 LLILLJJLI;
    public final EnumC1127500fRk LLILLL = EnumC1127500fRk.USER_LEVEL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final boolean LLILZLL;

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final C1117710fBx LJ() {
        return (C1117710fBx) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIIZZ() {
        C1128710fTh c1128710fTh;
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLILLJJLI;
        if ((abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null) {
            c1128710fTh.LLZZZZ = LJ();
        }
        LJ().setDatachannel(this.LL);
    }

    public final void LJIIJ() {
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLILLJJLI;
        C1128710fTh c1128710fTh = abstractC1100450ek7 instanceof C1128710fTh ? (C1128710fTh) abstractC1100450ek7 : null;
        if (c1128710fTh != null) {
            c1128710fTh.LLZILL = false;
        }
        C1117710fBx c1117710fBxLJ = LJ();
        C1117710fBx.u0(false);
        c1117710fBxLJ.LLJLIL = false;
        C1091250eVH c1091250eVH = (C1091250eVH) this.LLILZIL.getValue();
        if (c1091250eVH != null) {
            C786410Ut5.LLLIILIL(c1091250eVH, 8);
        }
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJII() {
        LJIIJ();
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIZ() {
        LJIIJ();
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        boolean zBooleanValue;
        Boolean bool;
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if ((c1094360eaIHP != null && c1094360eaIHP.LJFF == 2) || zBooleanValue || LJIIJJI(c1124680fNC, LJ())) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJJI(C1124680fNC c1124680fNC, C1117710fBx c1117710fBx) {
        C1128710fTh c1128710fTh;
        if (c1117710fBx != null && c1117710fBx.getUpdateBadgeViewOpt()) {
            AbstractC1100450ek7 abstractC1100450ek7 = c1124680fNC.LJIIJ;
            if ((abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null && !c1128710fTh.LLLLLLIL) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1124670fNB(View view, DataChannel dataChannel, AbstractC1100450ek7 abstractC1100450ek7) {
        this.LL = dataChannel;
        this.LLILLJJLI = abstractC1100450ek7;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(view, 543));
        C01GW c01gwLIZ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(view, 544));
        this.LLILZIL = c01gwLIZ;
        C1091250eVH c1091250eVH = (C1091250eVH) c01gwLIZ.getValue();
        if (c1091250eVH != null) {
            c1091250eVH.setEnableSizeChange(true);
        }
        C1091250eVH c1091250eVH2 = (C1091250eVH) c01gwLIZ.getValue();
        if (c1091250eVH2 != null) {
            c1091250eVH2.setEnableFixedSize(true);
        }
        this.LLILZLL = true;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE, View view, C1124680fNC c1124680fNC) {
        if (interfaceC1127800fSE.getBannerType() != this.LLILLL) {
            LJIIJ();
        }
    }

    @Override // X.InterfaceC1127800fSE
    public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
        C1128710fTh c1128710fTh;
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        AbstractC1100450ek7 abstractC1100450ek7 = c1124680fNC.LJIIJ;
        if (abstractC1100450ek7 instanceof C1128710fTh) {
            c1128710fTh = (C1128710fTh) abstractC1100450ek7;
        } else {
            c1128710fTh = null;
        }
        HandlerHook.viewPostDelay(LJ(), new ARunnableS25S0400000_17(c1128710fTh, c1124680fNC, this, c1094360eaIHP, 6), 300L);
        if (c1128710fTh != null) {
            c1128710fTh.LLZILL = true;
        }
        C1091250eVH c1091250eVH = (C1091250eVH) this.LLILZIL.getValue();
        boolean z = false;
        if (c1091250eVH != null) {
            C786410Ut5.LLLIILIL(c1091250eVH, 0);
        }
        C1117710fBx c1117710fBxLJ = LJ();
        if (!c1117710fBxLJ.LLJLIL) {
            z = true;
        }
        C1117710fBx.u0(z);
        c1117710fBxLJ.LLJLIL = true;
        return LJ();
    }
}
