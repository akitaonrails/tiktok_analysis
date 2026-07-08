package X;

import android.graphics.Rect;
import com.bytedance.android.livesdk.livesetting.performance.WidgetPlaceholderOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eFj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081610eFj {
    public final int LIZ;
    public final int LIZIZ = C497740JfY.LJIJ();
    public final float LIZJ;
    public final int LIZLLL;

    public C1081610eFj(AbstractC1080560eE2 abstractC1080560eE2) {
        this.LIZ = C12ES.LJIIIIZZ(abstractC1080560eE2.getContext());
        this.LIZJ = abstractC1080560eE2.LJIIJ;
        this.LIZLLL = abstractC1080560eE2.LIZJ;
    }

    public final void LIZ(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
        Rect rect;
        Rect rect2 = C464030IHp.LJIIIZ;
        DataChannel dataChannel = layeredElementContext.getDataChannel();
        if (dataChannel != null) {
            long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getDualDeviceEnabled: roomID: ");
            sbLIZ.append(jLJJLIIIJ);
            sbLIZ.append(", enabled: ");
            sbLIZ.append(C464030IHp.LJIIJ.get(Long.valueOf(jLJJLIIIJ)));
            C20441214yg.LIZIZ("test_lzk_enable", C2188811AlT.LIZIZ(sbLIZ));
            Rect rect3 = C464030IHp.LJIIJJI.get(Long.valueOf(jLJJLIIIJ));
            if (rect3 != null && (rect = C464030IHp.LJIIIZ) != null) {
                double dHeight = ((double) (rect.height() * rect3.bottom)) * 0.8d;
                double d = LSPassThroughRecordSizeConfig.DEFAULT;
                double d2 = ((dHeight / d) + ((double) this.LIZJ)) - ((double) this.LIZLLL);
                constraintProperty.removeConstraints(4);
                constraintProperty.removeConstraints(3);
                if (this.LIZ - this.LIZIZ < ((double) 0) + d2) {
                    constraintProperty.connect(3, 0, 3, (int) ((((((double) (rect.height() * rect3.bottom)) * 0.8d) / d) + ((double) this.LIZJ)) - ((double) (constraintProperty.getView().getMeasuredHeight() / 2))));
                } else {
                    constraintProperty.connect(3, 0, 3, (int) d2);
                }
                if (WidgetPlaceholderOptSetting.enableFullVideoLayoutOpt()) {
                    constraintProperty.endToEnd(R.id.h4p, 0);
                    constraintProperty.applyAndUpdate(layeredElementContext.getContainer());
                } else {
                    constraintProperty.apply();
                }
            }
        }
    }
}
