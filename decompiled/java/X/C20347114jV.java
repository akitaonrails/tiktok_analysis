package X;

import com.bytedance.android.livesdk.comp.impl.pcs.data.playentity.QueueEntity;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14jV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20347114jV extends C09AY implements Function1<AbstractC518960KWw, Unit> {
    public final /* synthetic */ QueueEntity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20347114jV(QueueEntity queueEntity) {
        super(1);
        this.LL = queueEntity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC518960KWw abstractC518960KWw) {
        AbstractC518960KWw abstractC518960KWw2 = abstractC518960KWw;
        if (abstractC518960KWw2.LIZ == EnumC518930KWt.QUEUE) {
            QueueEntity queueEntity = this.LL;
            C20361214lm c20361214lm = queueEntity.LLJJJJLIIL;
            InterfaceC20354714kj interfaceC20354714kj = queueEntity.LLJJL;
            if (c20361214lm != null && interfaceC20354714kj != null && (abstractC518960KWw2 instanceof C518950KWv)) {
                PlayEntityUtilKt.LJII(queueEntity, 0, c20361214lm, interfaceC20354714kj, true);
            }
        }
        return Unit.LIZ;
    }
}
