package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.020S, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020S extends C09AY implements Function0 {
    public final int $t;
    public long j0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020S c020s) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Before Call onDisappear RecordPlayerPosition= ");
        sbLIZ.append(c020s.j0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(C020S c020s) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cached is expired(over ");
        sbLIZ.append(c020s.j0);
        sbLIZ.append("ms), cache is not available.");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(C020S c020s) throws InterruptedException {
        long jLJ = C20510015Ni.LIZ.LJ() - (System.currentTimeMillis() - c020s.j0);
        if (jLJ > 0) {
            Thread.sleep(jLJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(C020S c020s) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitorCurrentPageDismissDuration->unregisterAndCallback: dismiss duration is ");
        sbLIZ.append(c020s.j0);
        sbLIZ.append("ms");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(C020S c020s) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartTypeByOrder: new data delivered whitelist section type=");
        sbLIZ.append(c020s.j0);
        sbLIZ.append(" but items empty, not in result list");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(C020S c020s) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartTypeByOrder: section type=");
        sbLIZ.append(c020s.j0);
        sbLIZ.append(" already in result list");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(C020S c020s) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        long j = c020s.j0;
        if (j <= 0) {
            j = 0;
        }
        sbLIZ.append(j);
        sbLIZ.append("s left");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(C020S c020s) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Tool] database cost = ");
        sbLIZ.append(System.currentTimeMillis() - c020s.j0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(C020S c020s) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sort channel by cache, cost time ");
        sbLIZ.append(SystemClock.elapsedRealtime() - c020s.j0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(C020S c020s) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache is empty, cost time ");
        sbLIZ.append(SystemClock.elapsedRealtime() - c020s.j0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(C020S c020s) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sort channel sync, cost time ");
        sbLIZ.append(SystemClock.elapsedRealtime() - c020s.j0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(C020S c020s) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pbNaPrefetch readBytes unknown-length hint, declaredLength=");
        sbLIZ.append(c020s.j0);
        sbLIZ.append(", hint=262144");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020S(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
