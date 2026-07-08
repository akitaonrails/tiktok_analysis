package Y;

import android.content.Context;
import com.ss.android.ugc.aweme.anrmonitor.GwpasanAction;
import com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class AObjectS300S0200000_33 implements Function0 {
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

    public static final Object invoke$0(AObjectS300S0200000_33 aObjectS300S0200000_33) {
        SysOptimizerTask.LJJIIJZLJL((Context) aObjectS300S0200000_33.l0, (GwpasanAction.GwpasanSceneConfig) aObjectS300S0200000_33.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS300S0200000_33 aObjectS300S0200000_33) {
        SysOptimizerTask.LJJIJ((Context) aObjectS300S0200000_33.l0, (SysOptimizerTask.PageSizeMonitorPara16kb) aObjectS300S0200000_33.l1);
        return Unit.LIZ;
    }

    public AObjectS300S0200000_33(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
