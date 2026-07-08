package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subgoal.SubGoalCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0exb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108810exb extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ SubGoalCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108810exb(SubGoalCardWidget subGoalCardWidget) {
        super(1);
        this.LL = subGoalCardWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) throws JSONException {
        bool.booleanValue();
        this.LL.C1(true);
        return Unit.LIZ;
    }
}
