package X;

import Y.ACListenerS13S1400000_7;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;

/* JADX INFO: renamed from: X.0JcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495870JcX {
    public static final /* synthetic */ C495870JcX LIZ = new C495870JcX();

    public static void LIZ(C495980Jci c495980Jci, EnumC495860JcW enumC495860JcW, String str, Map map) {
        String str2;
        C495920Jcc c495920Jcc;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_profile_card_module_click");
        DataChannel dataChannel = null;
        if ((c495980Jci instanceof C495920Jcc) && (c495920Jcc = (C495920Jcc) c495980Jci) != null) {
            dataChannel = c495920Jcc.LJIIJJI;
        }
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(c495980Jci.LJIIIIZZ.clickModule, "click_module");
        c474500IjALIZ.LJJII(c495980Jci.LIZJ.LIZ(), "card_click_view");
        c474500IjALIZ.LJJII(Long.valueOf(c495980Jci.LJFF.getId()), "actual_room_id");
        c474500IjALIZ.LJJII(Long.valueOf(c495980Jci.LJFF.getOwnerUserId()), "actual_anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(c495980Jci.LJI.getId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(c495980Jci.LJII), "to_user_id");
        c474500IjALIZ.LJJII(Long.valueOf(c495980Jci.LJFF.getOwner().getFollowInfo().getFollowStatus()), "follow_status");
        switch (C495850JcV.LIZ[enumC495860JcW.ordinal()]) {
            case 1:
                str2 = "general_tool";
                break;
            case 2:
                str2 = "privilege_tool";
                break;
            case 3:
                str2 = "vertical_party";
                break;
            case 4:
                str2 = "operate_tool";
                break;
            case 5:
                str2 = "temp_tool";
                break;
            case 6:
                str2 = "overlay_tool";
                break;
            case 7:
                str2 = "explanation_tool";
                break;
            case 8:
                str2 = "enigma";
                break;
            default:
                throw new C1954807lC();
        }
        c474500IjALIZ.LJJII(str2, "module_name");
        c474500IjALIZ.LJJII(str, "function_name");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(View view, final View.OnClickListener onClickListener, boolean z, final C495980Jci c495980Jci, final EnumC495860JcW enumC495860JcW, final String str, final Map map) {
        if (z) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JcY
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view2) {
                    if (view2 != null) {
                        C495870JcX.LIZ(c495980Jci, enumC495860JcW, str, map);
                        onClickListener.onClick(view2);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1500L);
                }
            }, view);
        } else {
            C786410Ut5.I7(new ACListenerS13S1400000_7(c495980Jci, enumC495860JcW, map, onClickListener, str, 1), view);
        }
    }
}
