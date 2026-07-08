package X;

import com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade.LiveInnerFlowDowngradePipeline;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule.LiveTaskScheduleTuneScene;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519020KXc extends C09AY implements Function0<List<? extends InterfaceC519030KXd>> {
    public C519020KXc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends InterfaceC519030KXd> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LiveInnerFlowDowngradePipeline.LIZ);
        arrayList.add(LiveTaskScheduleTuneScene.LIZ);
        arrayList.add(C0KY5.LIZ);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((InterfaceC519030KXd) obj).enable()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
