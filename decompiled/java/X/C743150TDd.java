package X;

import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceSourceFragmentV2;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0TDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743150TDd extends C09AY implements InterfaceC1685420txc<Integer, Integer, Integer, Integer, Integer, Unit> {
    public final /* synthetic */ GameDualDeviceSourceFragmentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C743150TDd(GameDualDeviceSourceFragmentV2 gameDualDeviceSourceFragmentV2) {
        super(5);
        this.LL = gameDualDeviceSourceFragmentV2;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        int iIntValue5 = num5.intValue();
        String str = this.LL.LLILZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_source_params");
        c474500IjALIZ.LJJII(str, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(C743540TEq.LIZIZ()), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue2), "video_w");
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue3), "video_h");
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "fps");
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue4), "bit_rate");
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue5), "bit_rate_level");
        c474500IjALIZ.LIZ();
        C0TFE.LJIILL(new Pair("fps", String.valueOf(iIntValue)));
        C0TFE.LJIILL(new Pair("resolution_height", String.valueOf(iIntValue3)));
        C0TFE.LJIILL(new Pair("resolution_width", String.valueOf(iIntValue2)));
        return Unit.LIZ;
    }
}
