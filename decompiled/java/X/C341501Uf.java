package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01Uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C341501Uf extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C341401Ue LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C341501Uf(int i, C341401Ue c341401Ue) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c341401Ue;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        long jIntValue;
        int i = this.LL;
        if (i == 0) {
            C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
            Long lValueOf = null;
            if (c01hzKi1 != null) {
                c01hzKi1.LIZIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZ("begin_set_time"), null);
            }
            C308301Hl c308301Hl = C308301Hl.LIZ;
            InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
            if (interfaceC938530aWxLIZ != null) {
                lValueOf = Long.valueOf(interfaceC938530aWxLIZ.getPlayId());
            }
            C308301Hl.LIZLLL(c308301Hl, "begin_set_time", "show", lValueOf, null, null, null, 0L, 120);
            TuxSheet tuxSheet = this.LLILLJJLI.LJIJ;
            if (tuxSheet != null) {
                tuxSheet.dismissAllowingStateLoss();
            }
            C341401Ue c341401Ue = this.LLILLJJLI;
            C1579100rC8 c1579100rC8 = new C1579100rC8();
            c1579100rC8.LJI = C497740JfY.LJIJI(2131853899);
            c1579100rC8.LIZJ(2);
            c1579100rC8.LIZLLL(60000L, MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().maxPunishmentDuration * 1000);
            Integer num = this.LLILLJJLI.LJIIL;
            if (num != null) {
                jIntValue = num.intValue();
            } else {
                jIntValue = 0;
            }
            c1579100rC8.LIZIZ(jIntValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT) * 60);
            c1579100rC8.LJII = C497740JfY.LJIJI(2131853901);
            c1579100rC8.LJ = new C5183020f(this.LLILLJJLI, 310);
            c341401Ue.LJIJ = c1579100rC8.LIZ().LIZ;
            C341401Ue c341401Ue2 = this.LLILLJJLI;
            DataChannel dataChannel = c341401Ue2.LIZIZ;
            if (dataChannel != null) {
                TuxSheet tuxSheet2 = c341401Ue2.LJIJ;
                FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
                if (fragmentManager != null && tuxSheet2 != null) {
                    tuxSheet2.show(fragmentManager, "DurationSheetDialog");
                }
            }
        } else {
            this.LLILLJJLI.LIZIZ(i);
        }
        return Unit.LIZ;
    }
}
