package Y;

import X.C0IJT;
import X.C0U61;
import X.C0U76;
import X.C0U7R;
import X.C0UOJ;
import X.C0WZX;
import X.C1161920gLG;
import X.C1701330uNH;
import X.C2204961BRm;
import X.C474500IjA;
import X.C497740JfY;
import X.C766270U4b;
import X.C784440Upu;
import X.C785410UrT;
import X.C786410Ut5;
import X.InterfaceC743640TFa;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.TabChangeEvent;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.panel.LiveEnhanceDialogFragment;
import com.bytedance.android.livesdk.game.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class AcS29S2100000_12 implements InterfaceC743640TFa {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS29S2100000_12 acS29S2100000_12, LiveDialog liveDialog) {
        Dialog dialog;
        C0U7R c0u7r = C0U7R.LIZ;
        c0u7r.LJFF("cancel task", "");
        ((LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76()).get(LiveSmallItemBeautyViewModel.class)).BQ2(false, true);
        ((LiveEnhanceDialogFragment) acS29S2100000_12.l2).NR(acS29S2100000_12.s0, "click", "exit");
        if (acS29S2100000_12.s1.length() > 0 && !Intrinsics.LJFF(acS29S2100000_12.s1, "Cancel")) {
            c0u7r.LJFF("enter setting tab", "");
            DataChannel dataChannel = ((LiveEnhanceDialogFragment) acS29S2100000_12.l2).dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(TabChangeEvent.class, acS29S2100000_12.s1);
            }
            liveDialog.dismiss();
            return;
        }
        if (acS29S2100000_12.s1.length() == 0 && (dialog = ((LiveEnhanceDialogFragment) acS29S2100000_12.l2).getDialog()) != null) {
            dialog.dismiss();
            C785410UrT.LIZ(dialog);
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS29S2100000_12 acS29S2100000_12, LiveDialog liveDialog) {
        PackageInfo packageInfoY3;
        liveDialog.dismiss();
        ScreenRecordStatusWidget screenRecordStatusWidget = (ScreenRecordStatusWidget) acS29S2100000_12.l2;
        String str = acS29S2100000_12.s0;
        screenRecordStatusWidget.getClass();
        Long lValueOf = null;
        int i = 0;
        try {
            packageInfoY3 = C786410Ut5.Y3(C497740JfY.LJII().getPackageManager(), str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            packageInfoY3 = null;
        }
        if (packageInfoY3 != null) {
            Intent launchIntentForPackage = C497740JfY.LJII().getPackageManager().getLaunchIntentForPackage(acS29S2100000_12.s0);
            if (launchIntentForPackage != null) {
                ScreenRecordStatusWidget screenRecordStatusWidget2 = (ScreenRecordStatusWidget) acS29S2100000_12.l2;
                if (C0UOJ.LIZ(17, C0UOJ.LIZIZ, false) && !screenRecordStatusWidget2.LLILZ) {
                    C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.0UeO
                    });
                }
                ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(launchIntentForPackage, 1207968513);
                Context contextLJII = C497740JfY.LJII();
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLJII, launchIntentForPackage, "Context_startActivity_1");
                C1701330uNH.LIZ(launchIntentForPackage, contextLJII);
                C2204961BRm.LJJJJJL(contextLJII, launchIntentForPackage, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MzD/FV9f3YRV8gIdxgLSBPnxa7Qs9bvJBscHD0B8EByA5broJKy1Dn", null));
            }
            ScreenRecordStatusWidget screenRecordStatusWidget3 = (ScreenRecordStatusWidget) acS29S2100000_12.l2;
            String str2 = acS29S2100000_12.s0;
            screenRecordStatusWidget3.getClass();
            ScreenRecordStatusWidget.x1(0, str2);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_auto_switch_game_click");
            c474500IjALIZ.LJJ("screen_share");
            c474500IjALIZ.LJII(((ScreenRecordStatusWidget) acS29S2100000_12.l2).LLILLJJLI);
            Room room = ((ScreenRecordStatusWidget) acS29S2100000_12.l2).LL;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            }
            c474500IjALIZ.LJJIJIIJI(lValueOf);
            if (((ScreenRecordStatusWidget) acS29S2100000_12.l2).LLILZIL == null) {
                i = 1;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i), "is_live");
            c474500IjALIZ.LJJII("confirm", "position");
            c474500IjALIZ.LIZ();
            return;
        }
        C766270U4b.LJIIJJI(C786410Ut5.j4(C497740JfY.LJIJI(2131841816), Arrays.copyOf(new Object[]{acS29S2100000_12.s1}, 1)));
        ScreenRecordStatusWidget screenRecordStatusWidget4 = (ScreenRecordStatusWidget) acS29S2100000_12.l2;
        String str3 = acS29S2100000_12.s0;
        screenRecordStatusWidget4.getClass();
        ScreenRecordStatusWidget.x1(1, str3);
    }

    public AcS29S2100000_12(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
