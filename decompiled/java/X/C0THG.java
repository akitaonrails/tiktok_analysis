package X;

import android.os.Build;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.cert.token.TokenCert;

/* JADX INFO: renamed from: X.0THG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0THG {
    public static void LIZ(Fragment fragment) {
        C19EG activity;
        boolean zLIZ = new C815520Vyw(fragment.requireContext()).LIZ();
        if (Build.VERSION.SDK_INT >= 33 && !zLIZ && (activity = fragment.getActivity()) != null) {
            C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-game_broadcast_post_notification_on_preview_page")).LIZIZ("android.permission.POST_NOTIFICATIONS").LIZJ(new InterfaceC19515111Wr() { // from class: X.0THH
                @Override // X.InterfaceC19515111Wr
                public final void onCanceled() {
                    C20441214yg.LIZ("notification permissions apply onCanceled on preview page");
                }

                @Override // X.InterfaceC19515111Wr
                public final void LIZ(C0HWO... c0hwoArr) {
                    if (c0hwoArr.length == 0) {
                        C20441214yg.LIZ("notification permissions apply results isEmpty on preview page");
                        return;
                    }
                    EnumC442280HVy enumC442280HVy = ((C0HWO) C13LQ.LJIL(c0hwoArr)).LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("notification permissions apply resultType(");
                    sbLIZ.append(enumC442280HVy);
                    sbLIZ.append(") on preview page");
                    C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
    }
}
