package Y;

import X.C1161920gLG;
import X.C20441214yg;
import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AObjectS162S0000000_12 implements Function2 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS162S0000000_12(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS162S0000000_12 aObjectS162S0000000_12, Object obj, Object obj2) {
        Context context = (Context) obj;
        PerceptionDialogInfo perceptionDialogInfo = (PerceptionDialogInfo) obj2;
        String str = perceptionDialogInfo.violationDetailUrl;
        if (str != null && str.length() != 0) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, perceptionDialogInfo.violationDetailUrl);
        } else {
            C20441214yg.LJIIL("UserViolation", "handle perception detail click failed, violationDetailUrl is null or empty");
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AObjectS162S0000000_12 aObjectS162S0000000_12, Object obj, Object obj2) {
        return Unit.LIZ;
    }
}
