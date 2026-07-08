package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C430101lr extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C429901lp LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C430101lr(C429901lp c429901lp, int i) {
        super(1);
        this.LL = c429901lp;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        FragmentManager fragmentManager;
        this.LL.requestFocus();
        int i = this.LLILLJJLI;
        if (i == 0) {
            C429901lp c429901lp = this.LL;
            DataChannel dataChannel = c429901lp.LLJIJIL;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                TuxSheet tuxSheet = c429901lp.LLJI;
                if (tuxSheet != null) {
                    tuxSheet.dismissAllowingStateLoss();
                }
                C1579100rC8 c1579100rC8 = new C1579100rC8();
                c1579100rC8.LJI = C497740JfY.LJIJI(2131853899);
                c1579100rC8.LIZJ(2);
                c1579100rC8.LIZLLL(60000L, MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().maxPunishmentDuration * 1000);
                c1579100rC8.LIZIZ(((long) c429901lp.LLJ) * ((long) LSPassThroughRecordSizeConfig.DEFAULT) * 60);
                c1579100rC8.LJII = C497740JfY.LJIJI(2131853901);
                c1579100rC8.LJ = new C5183020f(c429901lp, 152);
                TuxSheet tuxSheet2 = c1579100rC8.LIZ().LIZ;
                c429901lp.LLJI = tuxSheet2;
                if (tuxSheet2 != null) {
                    tuxSheet2.show(fragmentManager, "CountDownForAllDurationEditSheet");
                }
            }
        } else {
            this.LL.e0(i);
        }
        return Unit.LIZ;
    }
}
