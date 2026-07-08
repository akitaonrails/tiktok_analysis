package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.USLogisticVH;
import kotlin.Unit;
import kotlin.jvm.internal.AwS18S1100100_1;

/* JADX INFO: renamed from: X.037Y, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C037Y extends C09AY implements InterfaceC1631620sYq<Boolean, Long, String, Unit> {
    public final /* synthetic */ USLogisticVH LL;
    public final /* synthetic */ LogisticDTO LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C037Y(USLogisticVH uSLogisticVH, LogisticDTO logisticDTO, String str) {
        super(3);
        this.LL = uSLogisticVH;
        this.LLILLJJLI = logisticDTO;
        this.LLILLL = str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Boolean bool, Long l, String str) {
        bool.booleanValue();
        long jLongValue = l.longValue();
        USLogisticVH uSLogisticVH = this.LL;
        LogisticDTO logisticDTO = this.LLILLJJLI;
        C1748720vbi.LIZLLL(uSLogisticVH.itemView, new C10512049e(), new AwS18S1100100_1(SystemClock.elapsedRealtime() - jLongValue, logisticDTO, this.LLILLL, 7));
        return Unit.LIZ;
    }
}
