package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.AgeRestrictedChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01L2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01L2 {
    public static final C01L2 LIZ = new C01L2();

    public static final LiveDialog LIZ(final Fragment fragment, final DataChannel dataChannel, Context context, Runnable runnable, final Runnable runnable2, final String str, final String str2) {
        int iLJJJ;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String strLJIJI = C497740JfY.LJIJI(2131844065);
        String strLJIJI2 = C497740JfY.LJIJI(2131844063);
        String strLJIJJ = C497740JfY.LJIJJ(2131844064, strLJIJI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJI2);
        sbLIZ.append("\n\n");
        sbLIZ.append(strLJIJJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        spannableStringBuilder.append((CharSequence) strLIZIZ);
        LIZ.getClass();
        if (!TextUtils.isEmpty(strLIZIZ) && !TextUtils.isEmpty(strLJIJI) && (iLJJJ = a0.LJJJ(strLIZIZ, strLJIJI, 0, false, 6)) != -1) {
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, strLJIJI.length() + iLJJJ, 33, 500);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C497740JfY.LJFF(R.color.c7)), iLJJJ, strLJIJI.length() + iLJJJ, 33);
            if (runnable != null) {
                C786410Ut5.q2(spannableStringBuilder, new C511701z1(runnable, 0), iLJJJ, strLJIJI.length() + iLJJJ, 33);
            }
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIIZILJ(2131844066);
        c782110Um9.LJIIIZ(spannableStringBuilder);
        c782110Um9.LJIILL = false;
        c782110Um9.LJIJI = new DialogInterfaceOnCancelListenerC512001z4(runnable2, 2);
        c782110Um9.LJIILIIL(2131843699, new InterfaceC743640TFa() { // from class: X.01L0
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C01JY(dataChannel, null), 3);
                DataChannel dataChannel2 = dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.zW(AgeRestrictedChannel.class, 4);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mature_theme_popup_click");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(str, "enter_from");
                c474500IjALIZ.LJJII("1", "action_type");
                c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                c474500IjALIZ.LJJII(str2, "source");
                c474500IjALIZ.LIZ();
            }
        });
        c782110Um9.LJIIJ(2131843114, new InterfaceC743640TFa() { // from class: X.01L1
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mature_theme_popup_click");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(str, "enter_from");
                c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "action_type");
                c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                c474500IjALIZ.LJJII(str2, "source");
                c474500IjALIZ.LIZ();
                Runnable runnable3 = runnable2;
                if (runnable3 != null) {
                    runnable3.run();
                }
            }
        });
        return c782110Um9.LIZ();
    }
}
