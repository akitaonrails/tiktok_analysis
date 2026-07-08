package X;

import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.livesdk.dataChannel.AudienceShowOrientationBeginTime;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0IMP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IMP {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(DataChannel dataChannel) {
        if (!C1080800eEQ.LIZ()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_comment_horizon_show");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(0, "is_default_show");
            c474500IjALIZ.LIZ();
        }
    }

    public static final void LIZ(DataChannel dataChannel, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_comment_horizon_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_click");
        c474500IjALIZ.LJJII(Integer.valueOf(!C1080800eEQ.LIZ() ? 1 : 0), "is_open");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZJ(int i, int i2, DataChannel dataChannel, String str) {
        long jLongValue;
        long jCurrentTimeMillis;
        int iIntValue;
        Long l = (Long) dataChannel.gg0(C751340Tdc.class);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = (Long) dataChannel.gg0(AudienceShowOrientationBeginTime.class);
        if (l2 != null) {
            jCurrentTimeMillis = l2.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        IDefinitionService iDefinitionService = (IDefinitionService) C1161920gLG.LIZJ(IDefinitionService.class);
        if (iDefinitionService != null) {
            String strValueOf = String.valueOf(jLongValue);
            Integer num = (Integer) dataChannel.gg0(C0TZO.class);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            iDefinitionService.vu2(i, i2, iIntValue, jCurrentTimeMillis, strValueOf, str);
        }
        dataChannel.zW(AudienceShowOrientationBeginTime.class, Long.valueOf(System.currentTimeMillis()));
    }
}
