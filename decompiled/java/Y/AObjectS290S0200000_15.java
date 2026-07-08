package Y;

import X.C1161920gLG;
import X.C1AZW;
import X.C2188811AlT;
import X.C960830b6v;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostFeedbackWebViewSetting;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AObjectS290S0200000_15 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS290S0200000_15 aObjectS290S0200000_15) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS290S0200000_15.l0;
        C960830b6v c960830b6v = (C960830b6v) aObjectS290S0200000_15.l1;
        if (linkControlWidget.LLJILJILJ) {
            StringBuilder sb = new StringBuilder("&channel_id=");
            sb.append(c960830b6v.LIZIZ);
            sb.append("&show_reason=");
            sb.append(c960830b6v.LIZJ);
            sb.append("&feedback_content_type=");
            sb.append(c960830b6v.LIZLLL);
            sb.append("&group_channel_id=");
            sb.append(c960830b6v.LIZ);
            sb.append("&linkmic_id=");
            sb.append(c960830b6v.LJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LiveCohostFeedbackWebViewSetting.INSTANCE.getValue());
            sbLIZ.append((Object) sb);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String strM1 = linkControlWidget.M1(2976);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("open feedback dialog url: ");
            sbLIZ2.append(strLIZIZ);
            C1AZW.LJIIIIZZ(strM1, C2188811AlT.LIZIZ(sbLIZ2));
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(linkControlWidget.context, strLIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS290S0200000_15 aObjectS290S0200000_15) {
        ((LinkControlWidget) aObjectS290S0200000_15.l0).R1((WeakReference) aObjectS290S0200000_15.l1, null);
        return Unit.LIZ;
    }

    public AObjectS290S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
