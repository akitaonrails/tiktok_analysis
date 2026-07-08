package Y;

import X.C0U3O;
import X.C0U3P;
import X.C0U3Q;
import X.C0UFE;
import X.C474500IjA;
import X.C773210UUt;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AFwS296S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public class AObjectS115S0000000_12 implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public AObjectS115S0000000_12(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS115S0000000_12 aObjectS115S0000000_12, Object obj) {
        C0U3O c0u3o = (C0U3O) obj;
        c0u3o.LJFF(AFwS245S0000000_12.get$arr$(7));
        c0u3o.LIZIZ(AFwS296S0000000_12.get$arr$(2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS115S0000000_12 aObjectS115S0000000_12, Object obj) {
        return C0UFE.fromInt(((AnchorLevelPermission) obj).liveBackground);
    }

    public static final Object invoke$10(AObjectS115S0000000_12 aObjectS115S0000000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        c773210UUt.getClass();
        c773210UUt.LJIIJJI("system_event_capture_first_frame", "");
        return null;
    }

    public static final Object invoke$11(AObjectS115S0000000_12 aObjectS115S0000000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        c773210UUt.getClass();
        c773210UUt.LJIIJJI("system_event_first_rtmp_connected", "");
        return null;
    }

    public static final Object invoke$2(AObjectS115S0000000_12 aObjectS115S0000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII("background", "features");
        return c474500IjA;
    }

    public static final Object invoke$3(AObjectS115S0000000_12 aObjectS115S0000000_12, Object obj) {
        return C0UFE.fromInt(((AnchorLevelPermission) obj).sticker);
    }

    public static final Object invoke$4(AObjectS115S0000000_12 aObjectS115S0000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII("sticker", "features");
        return c474500IjA;
    }

    public static final Object invoke$5(AObjectS115S0000000_12 aObjectS115S0000000_12, Object obj) {
        return C0UFE.fromInt(((AnchorLevelPermission) obj).pin);
    }

    public static final Object invoke$6(AObjectS115S0000000_12 aObjectS115S0000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII("comment_pin", "features");
        return c474500IjA;
    }

    public static final Object invoke$7(AObjectS115S0000000_12 aObjectS115S0000000_12, Object obj) {
        if (((Integer) obj).intValue() == 0) {
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            C0U3P.LJ(C0U3Q.LOCAL_SERVICE_GOODS);
        } else {
            ConcurrentHashSet<C0U3Q> concurrentHashSet2 = C0U3P.LIZ;
            C0U3P.LIZLLL(C0U3Q.LOCAL_SERVICE_GOODS);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AObjectS115S0000000_12 aObjectS115S0000000_12, Object obj) {
        return C0UFE.fromInt(((AnchorLevelPermission) obj).sticker);
    }

    public static final Object invoke$9(AObjectS115S0000000_12 aObjectS115S0000000_12, Object obj) {
        return Unit.LIZ;
    }
}
