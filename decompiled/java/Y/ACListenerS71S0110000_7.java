package Y;

import X.C0IF2;
import X.C0KT2;
import X.C0KT5;
import X.C0UX6;
import X.C1161920gLG;
import X.C16FS;
import X.C19EG;
import X.C2188811AlT;
import X.C495980Jci;
import X.C498240JgM;
import X.C500260Jjc;
import X.C518180KTw;
import X.C784440Upu;
import X.InterfaceC517920KSw;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceWrongFragment;
import com.bytedance.android.livesdk.profile.cell.HeaderCell;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.superfans.goal.SuperFansGoalJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS71S0110000_7 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS71S0110000_7 aCListenerS71S0110000_7, View view) {
        GameDualDeviceWrongFragment gameDualDeviceWrongFragment = (GameDualDeviceWrongFragment) aCListenerS71S0110000_7.l0;
        if (gameDualDeviceWrongFragment.LLILZLL == 1) {
            if (aCListenerS71S0110000_7.z1) {
                Function1<? super Context, Unit> function1 = gameDualDeviceWrongFragment.LLIZ;
                if (function1 != null) {
                    function1.invoke(gameDualDeviceWrongFragment.getContext());
                    return;
                }
                return;
            }
            gameDualDeviceWrongFragment.NR();
            return;
        }
        if (aCListenerS71S0110000_7.z1) {
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext != null) {
                iHostAppContext.openQrScannerPage(((GameDualDeviceWrongFragment) aCListenerS71S0110000_7.l0).getActivity());
            }
            C19EG activity = ((GameDualDeviceWrongFragment) aCListenerS71S0110000_7.l0).getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        gameDualDeviceWrongFragment.NR();
    }

    public static final void onClick$1(ACListenerS71S0110000_7 aCListenerS71S0110000_7, View view) {
        View view2;
        HeaderCell headerCell = (HeaderCell) aCListenerS71S0110000_7.l0;
        FrameLayout frameLayout = headerCell.LLJJJJJIL;
        boolean z = false;
        if (frameLayout != null && C500260Jjc.LJJJJIZL(frameLayout) && (view2 = headerCell.LLJJJJLIIL) != null && C500260Jjc.LJJJJIZL(view2)) {
            z = true;
        }
        C495980Jci c495980Jci = headerCell.LL;
        if (c495980Jci.LJ) {
            headerCell.LJJI(z);
        } else {
            String strLIZLLL = C498240JgM.LIZLLL("personal_profile", c495980Jci.LIZ, headerCell.LLJZIJLIL, headerCell.LLJJL, z);
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("privilege_page_horizontal_");
            sbLIZ.append(strLIZLLL);
            c784440UpuLIZ.LIZIZ(new C0IF2(C2188811AlT.LIZIZ(sbLIZ)));
        }
        HeaderCell headerCell2 = (HeaderCell) aCListenerS71S0110000_7.l0;
        C498240JgM.LJFF("click", "personal_profile", headerCell2.LLJZ, headerCell2.LLJZIJLIL, aCListenerS71S0110000_7.z1);
        RedDotExtensionKt.LIZ(C0UX6.RED_DOT_LIVE_PRIVILEGE_CENTER);
    }

    public static final void onClick$2(ACListenerS71S0110000_7 aCListenerS71S0110000_7, View view) {
        C16FS c16fs = ((SuperFansGoalJoinDialog) aCListenerS71S0110000_7.l0).LLLFF;
        if (c16fs != null) {
            c16fs.LJ();
        }
        SuperFansGoalJoinDialog superFansGoalJoinDialog = (SuperFansGoalJoinDialog) aCListenerS71S0110000_7.l0;
        SuperFanViewModel superFanViewModel = superFansGoalJoinDialog.LLJZIJLIL;
        if (superFanViewModel != null) {
            C0KT5 c0kt5 = new C0KT5(1, C0KT2.SUPER_FAN_GOAL, superFansGoalJoinDialog.LLJLLL, 0);
            final SuperFansGoalJoinDialog superFansGoalJoinDialog2 = (SuperFansGoalJoinDialog) aCListenerS71S0110000_7.l0;
            superFanViewModel.zQ2(c0kt5, new InterfaceC517920KSw() { // from class: X.0KTd
                @Override // X.InterfaceC517920KSw
                public final void onFailure() {
                    C16FS c16fs2 = superFansGoalJoinDialog2.LLLFF;
                    if (c16fs2 != null) {
                        c16fs2.LJIIL();
                    }
                }

                @Override // X.InterfaceC517920KSw
                public final void onSuccess() {
                    C16FS c16fs2 = superFansGoalJoinDialog2.LLLFF;
                    if (c16fs2 != null) {
                        c16fs2.LJIIL();
                    }
                    superFansGoalJoinDialog2.close(1);
                }
            });
        }
        SuperFansGoalJoinDialog superFansGoalJoinDialog3 = (SuperFansGoalJoinDialog) aCListenerS71S0110000_7.l0;
        C518180KTw.LJJIJLIJ(superFansGoalJoinDialog3.LLL, superFansGoalJoinDialog3.LLJLLL, Boolean.valueOf(aCListenerS71S0110000_7.z1));
    }

    public ACListenerS71S0110000_7(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
