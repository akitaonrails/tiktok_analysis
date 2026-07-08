package Y;

import X.C1579100rC8;
import X.C1894320zOY;
import X.C1896850zSd;
import X.C1897020zSu;
import X.C1909410zmt;
import X.C497740JfY;
import X.C748880TZe;
import X.DialogC20518615Qq;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicCountDownTimerPlayModeConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public class ACListenerS60S0101000_28 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final void onClick$0(ACListenerS60S0101000_28 aCListenerS60S0101000_28, View view) {
        String str;
        boolean zBooleanValue;
        Map<String, String> map;
        Boolean bool;
        if (aCListenerS60S0101000_28.i1 == ((FeedTimerPendantManger) aCListenerS60S0101000_28.l0).LJLI()) {
            TimerPendant timerPendant = (TimerPendant) ((FeedTimerPendantManger) aCListenerS60S0101000_28.l0).LLILLL;
            String str2 = "";
            if (timerPendant == null || (str = timerPendant.LIZIZ) == null) {
                str = "";
            }
            int i = 0;
            if (timerPendant != null && (bool = timerPendant.needLoginGate) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            T t = ((FeedTimerPendantManger) aCListenerS60S0101000_28.l0).LLILLL;
            Integer numValueOf = null;
            if (t != 0) {
                map = t.LJ;
                numValueOf = Integer.valueOf(t.LIZ);
            } else {
                map = null;
            }
            C1897020zSu c1897020zSu = C1897020zSu.LIZ;
            C1897020zSu.LIZJ(((FeedTimerPendantManger) aCListenerS60S0101000_28.l0).LLJIJIL, false);
            C1897020zSu.LIZLLL(((FeedTimerPendantManger) aCListenerS60S0101000_28.l0).LLJIJIL, 0);
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            FeedTimerPendantManger feedTimerPendantManger = (FeedTimerPendantManger) aCListenerS60S0101000_28.l0;
            T t2 = feedTimerPendantManger.LLILLL;
            if (t2 != 0) {
                i = t2.LIZ;
            }
            String strLJJIZ = feedTimerPendantManger.LJJIZ();
            if (strLJJIZ != null) {
                str2 = strLJJIZ;
            }
            FeedTimerPendantManger feedTimerPendantManger2 = (FeedTimerPendantManger) aCListenerS60S0101000_28.l0;
            C1894320zOY.LJFF(c1894320zOY, i, str2, feedTimerPendantManger2.LLJJIII, feedTimerPendantManger2.LJJJI(), ((FeedTimerPendantManger) aCListenerS60S0101000_28.l0).LJJJ(), null, null, C1896850zSd.LIZJ(), 192);
            ((FeedTimerPendantManger) aCListenerS60S0101000_28.l0).LJJJJL(numValueOf, str, zBooleanValue, map);
            return;
        }
        FeedTimerPendantManger feedTimerPendantManger3 = (FeedTimerPendantManger) aCListenerS60S0101000_28.l0;
        Bubble bubble = feedTimerPendantManger3.LLJIJIL;
        if (bubble == null) {
            return;
        }
        feedTimerPendantManger3.LJJIJIIJI(bubble);
    }

    public static final void onClick$1(ACListenerS60S0101000_28 aCListenerS60S0101000_28, View view) {
        FragmentManager fragmentManager;
        long jIntValue;
        int i = aCListenerS60S0101000_28.i1;
        if (i == 0) {
            DataChannel dataChannel = ((DialogC20518615Qq) aCListenerS60S0101000_28.l0).LLJJI;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                TuxSheet tuxSheet = ((DialogC20518615Qq) aCListenerS60S0101000_28.l0).LLLFZ;
                if (tuxSheet != null) {
                    tuxSheet.dismissAllowingStateLoss();
                }
                DialogC20518615Qq dialogC20518615Qq = (DialogC20518615Qq) aCListenerS60S0101000_28.l0;
                C1579100rC8 c1579100rC8 = new C1579100rC8();
                c1579100rC8.LJI = C497740JfY.LJIJI(2131853899);
                c1579100rC8.LIZJ(5);
                c1579100rC8.LIZLLL(60000L, LinkmicCountDownTimerPlayModeConfig.INSTANCE.maxCustomCountDownDuration() * ((long) 60) * 1000);
                Integer num = ((DialogC20518615Qq) aCListenerS60S0101000_28.l0).LLJZ;
                if (num != null) {
                    jIntValue = num.intValue();
                } else {
                    jIntValue = 0;
                }
                c1579100rC8.LIZIZ(jIntValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT) * 60);
                c1579100rC8.LJII = C497740JfY.LJIJI(2131853901);
                c1579100rC8.LJ = new AwS607S0100000_28((DialogC20518615Qq) aCListenerS60S0101000_28.l0, 228);
                dialogC20518615Qq.LLLFZ = c1579100rC8.LIZ().LIZ;
                TuxSheet tuxSheet2 = ((DialogC20518615Qq) aCListenerS60S0101000_28.l0).LLLFZ;
                if (tuxSheet2 != null) {
                    tuxSheet2.show(fragmentManager, "CountDownDurationEditSheet");
                    return;
                }
                return;
            }
            return;
        }
        ((DialogC20518615Qq) aCListenerS60S0101000_28.l0).LJLI(i);
    }

    public static final void onClick$2(ACListenerS60S0101000_28 aCListenerS60S0101000_28, View view) {
        ((C1909410zmt) aCListenerS60S0101000_28.l0).getSubmit().setButtonVariant(0);
        ((C1909410zmt) aCListenerS60S0101000_28.l0).getSubmit().setEnabled(true);
        C1909410zmt c1909410zmt = (C1909410zmt) aCListenerS60S0101000_28.l0;
        c1909410zmt.LLJI = aCListenerS60S0101000_28.i1 + 1;
        c1909410zmt.LIZ();
    }

    public ACListenerS60S0101000_28(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
