package X;

import X.AbstractC1111060f1E;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.setting.LiveExtendedScreenFreqControlNewPhaseOptimizeSetting;
import com.bytedance.android.live.setting.LiveExtendedScreenFreqControlOptimizeEnable;
import com.bytedance.android.live.setting.LiveExtendedScreenUiOptimizeSetting;
import com.bytedance.android.live.setting.LiveMinusOneScreenTipsInFeedSetting;
import com.bytedance.android.livesdk.api.revenue.crm.FullScreenCsCompanionSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import mr0.r0;

/* JADX INFO: renamed from: X.0f20, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1111540f20<MODEL extends r0<? extends AbstractC1136060ffY>, VH extends AbstractC1111060f1E<MODEL>> extends AbstractC1111810f2R<MODEL, VH> {
    public final boolean LJFF = false;

    public final AbstractC1113530f5D LJIIZILJ(View view) {
        View viewTd;
        boolean z = false;
        if (LJIIJJI().LJI && LJIIJJI().LIZLLL) {
            DataChannel dataChannel = LJIIJJI().LJIIIZ;
            if (!LJIIJJI().LJJ ? !C500260Jjc.LJJIZ(dataChannel) : FullScreenCsCompanionSetting.INSTANCE.getValue(dataChannel) > 0) {
                if (!this.LJFF) {
                    z = true;
                }
            }
        }
        if (!z) {
            return null;
        }
        if (LJIIJJI().LJJ) {
            if (LiveExtendedScreenUiOptimizeSetting.INSTANCE.enableUIOptimize(LJIIJJI().LJIIIZ)) {
                viewTd = C786410Ut5.Td(C786410Ut5.ne(view.getContext()), R.layout.gql, (ViewGroup) view.findViewById(R.id.wmz), true);
            } else {
                viewTd = C786410Ut5.Td(C786410Ut5.ne(view.getContext()), R.layout.gqk, (ViewGroup) view.findViewById(R.id.wmz), true);
            }
            if (LiveMinusOneScreenTipsInFeedSetting.isTipsInFeedEnabled()) {
                return new C1113490f59(LJIIJJI().LIZJ(), viewTd, view);
            }
            if (LiveExtendedScreenFreqControlNewPhaseOptimizeSetting.INSTANCE.enable()) {
                return new C1113490f59((AbstractC1113400f50) LJIIJJI().LJIIL.getValue(), viewTd, null);
            }
            if (LiveExtendedScreenFreqControlOptimizeEnable.INSTANCE.enable()) {
                return new C1113490f59((AbstractC1113400f50) LJIIJJI().LJIILIIL.getValue(), viewTd, null);
            }
            return new C1113490f59((AbstractC1113400f50) LJIIJJI().LJIILJJIL.getValue(), viewTd, null);
        }
        return new C1113470f57((AbstractC1113400f50) LJIIJJI().LJIILJJIL.getValue(), C786410Ut5.Td(C786410Ut5.ne(view.getContext()), R.layout.gu7, (ViewGroup) view.findViewById(R.id.wmz), true));
    }
}
