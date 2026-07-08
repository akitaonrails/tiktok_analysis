package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058810dex implements InterfaceC1060140dh6 {
    @Override // X.InterfaceC1060140dh6
    public final boolean LIZ(SparkContext sparkContext, Context context) {
        ISparkHostApi iSparkHostApi;
        Class<? extends Activity> clsLLJJIII;
        if (!a0.LJJIIZI(sparkContext.LJIJI(), "bypass_presentation_hook=0", false) || (iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) == null || (clsLLJJIII = iSparkHostApi.LLJJIII()) == null) {
            return false;
        }
        Intent intent = new Intent(context, clsLLJJIII);
        C905703gN.LIZ.getClass();
        C1041990dDp.LIZ.getClass();
        C1041990dDp.LIZJ(sparkContext);
        intent.putExtra("SparkContextContainerId", sparkContext.containerId);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOKxYY3H2Dn0OlcFaCXYa87YbKvkkoYfmyXruXBYW1fC+OLfkPB9", null));
        return true;
    }
}
