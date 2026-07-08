package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveDecorationIntelligentModelSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.intro.TuxPanel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: renamed from: X.0Tox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758370Tox {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        if (System.currentTimeMillis() - C0KPJ.sf.LIZIZ().longValue() > 1209600000) {
            C0KPJ.tf.LJFF(0L);
        }
        return C0KPJ.tf.LIZIZ().longValue() < 3;
    }

    public static boolean LIZ() {
        C758470Tp7 c758470Tp7LIZ = C758510TpB.LIZ();
        return (c758470Tp7LIZ == null || c758470Tp7LIZ.LJFF) ? false : true;
    }

    public static void LIZIZ(final DataChannel dataChannel, final Function2 function2) {
        C0KPJ.sf.LJFF(Long.valueOf(System.currentTimeMillis()));
        C20337914i1<Long> c20337914i1 = C0KPJ.tf;
        c20337914i1.LJFF(Long.valueOf(c20337914i1.LIZIZ().longValue() + 1));
        FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        if (fragmentManager != null) {
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = "close";
            C1391960mKI c1391960mKI = new C1391960mKI();
            c1391960mKI.LJII = C497740JfY.LJIJI(2131851157);
            c1391960mKI.LJIIIIZZ = C497740JfY.LJIJJ(2131851158, LiveDecorationIntelligentModelSetting.INSTANCE.getValue());
            c1391960mKI.LIZIZ(C497740JfY.LJIJI(2131851159), new AwS626S0100000_12(c259800zU, (C259800zU<String>) 39));
            c1391960mKI.LIZJ(C497740JfY.LJIJI(2131851160), new AwS626S0100000_12(c259800zU, (C259800zU<String>) 40));
            C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
            DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.010q
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    DataChannel dataChannel2 = dataChannel;
                    String str = c259800zU.element;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_aigc_disclaimer");
                    c474500IjALIZ.LJIJJLI(dataChannel2);
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "anchor_id");
                    c474500IjALIZ.LJJII("click", "action_type");
                    c474500IjALIZ.LJJII(str, "click_type");
                    c474500IjALIZ.LIZ();
                    function2.invoke(dataChannel, c259800zU.element);
                }
            };
            TuxPanel tuxPanel = c439850HMpLIZ.LIZ;
            tuxPanel.LLILZIL = onDismissListener;
            tuxPanel.show(fragmentManager, "IntelligentBoardClaimSheet");
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_aigc_disclaimer");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "anchor_id");
            c474500IjALIZ.LJJII("show", "action_type");
            c474500IjALIZ.LIZ();
        }
    }
}
