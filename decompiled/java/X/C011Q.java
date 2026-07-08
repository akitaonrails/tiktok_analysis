package X;

import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.011Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011Q extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ SubPinCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C011Q(SubPinCard subPinCard) {
        super(1);
        this.LL = subPinCard;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        new C203100qL(this.LL).invoke(sparkContext);
        return Unit.LIZ;
    }
}
