package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.android.livesdk.condition.PlayCondition;
import java.util.Map;

/* JADX INFO: renamed from: X.14lJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20358314lJ extends C2217421BqW implements InterfaceC1631620sYq<Condition, LifecycleOwner, C20361214lm, PlayCondition> {
    public C20358314lJ(AbstractC20358714lN abstractC20358714lN) {
        super(3, abstractC20358714lN, AbstractC20358714lN.class, "createCondition", "createCondition(Lcom/bytedance/android/livesdk/condition/Condition;Landroidx/lifecycle/LifecycleOwner;Lcom/bytedance/android/livesdk/entity/PlaybookTask;)Lcom/bytedance/android/livesdk/condition/PlayCondition;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final PlayCondition invoke(Condition condition, LifecycleOwner lifecycleOwner, C20361214lm c20361214lm) {
        Condition condition2 = condition;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        C20361214lm c20361214lm2 = c20361214lm;
        AbstractC20358714lN abstractC20358714lN = (AbstractC20358714lN) this.receiver;
        PlayCondition playCondition = (PlayCondition) ((Map) abstractC20358714lN.LIZLLL.getValue()).get(condition2.name);
        if (playCondition == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can't find the play entity impl by name=");
            sbLIZ.append(condition2.name);
            C20441214yg.LJ("BaseDirectorV2", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        playCondition.LJII(condition2);
        playCondition.LIZIZ(abstractC20358714lN.LIZ);
        playCondition.LJ(c20361214lm2);
        playCondition.LJFF(lifecycleOwner2);
        return playCondition;
    }
}
