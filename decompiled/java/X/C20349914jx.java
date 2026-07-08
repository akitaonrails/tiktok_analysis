package X;

import com.bytedance.android.livesdk.comp.impl.subscription.playcondition.QueueFinishedCondition;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14jx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20349914jx extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ QueueFinishedCondition LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20349914jx(QueueFinishedCondition queueFinishedCondition) {
        super(1);
        this.LL = queueFinishedCondition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            this.LL.LJIIIZ("observe status");
            InterfaceC946300ajU interfaceC946300ajU = this.LL.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
            }
        }
        return Unit.LIZ;
    }
}
