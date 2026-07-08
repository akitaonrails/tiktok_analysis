package X;

import com.ss.android.ugc.aweme.experiment.NUJAutoRefreshConfigExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0qsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566780qsG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1566760qsE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566780qsG(C1566760qsE c1566760qsE) {
        super(0);
        this.LL = c1566760qsE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (NUJAutoRefreshConfigExp.isEnable()) {
            C0CNO.LIZLLL(0L, new AwS568S0100000_24(this.LL, 1835));
        }
        return Unit.LIZ;
    }
}
