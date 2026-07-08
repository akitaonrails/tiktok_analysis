package X;

import Y.ARunnableS107S0100000_7;
import android.os.SystemClock;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout$DrawerListener;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerFollowSetting;
import com.bytedance.android.livesdk.watch.clearscreen.IClearScreenService;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469250Iah implements DrawerLayout$DrawerListener {
    public final /* synthetic */ LiveDrawerDialogV3 LIZ;

    @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public final void onDrawerStateChanged(int i) {
    }

    public C469250Iah(LiveDrawerDialogV3 liveDrawerDialogV3) {
        this.LIZ = liveDrawerDialogV3;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0173  */
    @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDrawerClosed(android.view.View r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C469250Iah.onDrawerClosed(android.view.View):void");
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public final void onDrawerOpened(View view) {
        Fragment fragmentLLLIILIL;
        Fragment fragmentLLLIILIL2;
        C467820IWe.LJII((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class));
        if (this.LIZ.getUserVisibleHint()) {
            C467800IWc c467800IWc = C467800IWc.LJIJ;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c467800IWc.LIZJ() == 0) {
                c467800IWc.LJI = jElapsedRealtime;
            }
            LiveDrawerDialogV3 liveDrawerDialogV3 = this.LIZ;
            liveDrawerDialogV3.getClass();
            liveDrawerDialogV3.LLJJI = SystemClock.elapsedRealtime();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_more_anchor_show");
            c474500IjALIZ.LJJII(C466640IRq.LIZJ().LIZLLL(), "request_page");
            c474500IjALIZ.LJIILL(c467800IWc.LJ);
            c474500IjALIZ.LJIJJLI(liveDrawerDialogV3.LLJJIII);
            c474500IjALIZ.LIZ();
            DataChannel dataChannel = this.LIZ.LLJJIII;
            if (dataChannel != null) {
                dataChannel.zW(LiveExploreDrawerShowChannel.class, Boolean.TRUE);
            }
        }
        if (this.LIZ.getView() != null) {
            this.LIZ.nS(false);
            LiveDrawerDialogV3 liveDrawerDialogV32 = this.LIZ;
            liveDrawerDialogV32.LLJJJJJIL = null;
            InterfaceC469270Iaj interfaceC469270Iaj = liveDrawerDialogV32.LLJZ;
            if (interfaceC469270Iaj != null && (fragmentLLLIILIL = interfaceC469270Iaj.LLLIILIL()) != null && fragmentLLLIILIL.isAdded()) {
                InterfaceC469270Iaj interfaceC469270Iaj2 = this.LIZ.LLJZ;
                if (interfaceC469270Iaj2 != null && (fragmentLLLIILIL2 = interfaceC469270Iaj2.LLLIILIL()) != null) {
                    fragmentLLLIILIL2.setUserVisibleHint(true);
                }
                InterfaceC469270Iaj interfaceC469270Iaj3 = this.LIZ.LLJZ;
                if (interfaceC469270Iaj3 != null) {
                    interfaceC469270Iaj3.S0();
                }
            } else if (this.LIZ.SR().getVisibility() == 0 && !this.LIZ.LLJLLL) {
                C0IUE.LIZ();
            }
            View view2 = this.LIZ.getView();
            if (view2 != null) {
                HandlerHook.viewPost(view2, new ARunnableS107S0100000_7(this.LIZ, 79));
            }
        }
        this.LIZ.LLJLLL = false;
        C1EOY c1eoy = C1EOY.LIZ;
        String str = C467800IWc.LJIJ.LJIIIIZZ;
        if (str == null) {
            str = "";
        }
        C1EOY.LJIJJ = str;
        C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("drawer_open");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LIZJ(null);
        }
        if (Intrinsics.LJFF(this.LIZ.LLJLILLLLZIIL, "music_spotlight")) {
            C784440Upu.LIZ().LIZIZ(new C469280Iak(4));
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public final void onDrawerSlide(View view, float f) {
        InterfaceC1081980eGK interfaceC1081980eGKWy2;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        IClearScreenService iClearScreenService = (IClearScreenService) C1161920gLG.LIZJ(IClearScreenService.class);
        if (iClearScreenService != null) {
            interfaceC1081980eGKWy2 = iClearScreenService.wy2(room, this.LIZ.LLJJIII);
        } else {
            interfaceC1081980eGKWy2 = null;
        }
        boolean z = false;
        if (0.0f == f) {
            C467820IWe.LJ(true);
            if (interfaceC1081980eGKWy2 != null) {
                interfaceC1081980eGKWy2.LIZLLL(true);
            }
        } else if (interfaceC1081980eGKWy2 != null) {
            interfaceC1081980eGKWy2.LIZLLL(false);
        }
        if (C467820IWe.LIZ <= 0 && !C467820IWe.LJ) {
            C467820IWe.LIZ = System.currentTimeMillis();
            C467820IWe.LIZJ().put("enter_timestamp", String.valueOf(C467820IWe.LIZ));
        }
        if (LiveDrawerFollowSetting.INSTANCE.isGameEntranceExp() && C0IKG.LJ()) {
            z = true;
        }
        C467800IWc c467800IWc = C467800IWc.LJIJ;
        boolean zLJFF = c467800IWc.LJFF();
        boolean zLJFF2 = Intrinsics.LJFF(c467800IWc.LJIIIZ, "game_drawer_guessing");
        if (!this.LIZ.LLJJLIIIJLLLLLLLZ && (!((ArrayList) r1.LLJJL).isEmpty()) && (z || zLJFF || zLJFF2)) {
            this.LIZ.hS(true, EnumC469260Iai.LLILLJJLI);
            return;
        }
        if (!(!((ArrayList) this.LIZ.LLJJL).isEmpty()) || this.LIZ.gS()) {
            return;
        }
        LiveDrawerDialogV3 liveDrawerDialogV3 = this.LIZ;
        if (!liveDrawerDialogV3.LLJLIL.LIZIZ(this.LIZ.LLJJL, true, liveDrawerDialogV3.gS())) {
            return;
        }
        this.LIZ.hS(true, EnumC469260Iai.LLILLJJLI);
    }
}
