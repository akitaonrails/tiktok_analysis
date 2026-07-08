package X;

import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C517101zt implements InterfaceC1487280oo2 {
    public final int $t;
    public long j0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return apply$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return apply$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return apply$12(this, obj);
            default:
                return null;
        }
    }

    public C517101zt(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final Object apply$0(C517101zt c517101zt, Object obj) {
        return Long.valueOf(c517101zt.j0 - ((Long) obj).longValue());
    }

    public static final Object apply$1(C517101zt c517101zt, Object obj) {
        return Long.valueOf(c517101zt.j0 - ((Long) obj).longValue());
    }

    public static final Object apply$10(C517101zt c517101zt, Object obj) {
        return Long.valueOf(c517101zt.j0 - ((Number) obj).longValue());
    }

    public static final Object apply$11(C517101zt c517101zt, Object obj) {
        return Long.valueOf(c517101zt.j0 - ((Long) obj).longValue());
    }

    public static final Object apply$12(C517101zt c517101zt, Object obj) {
        return Long.valueOf(c517101zt.j0 - ((Long) obj).longValue());
    }

    public static final Object apply$2(C517101zt c517101zt, Object obj) {
        return Long.valueOf(c517101zt.j0 - ((Number) obj).longValue());
    }

    public static final Object apply$3(C517101zt c517101zt, Object obj) {
        return Long.valueOf(c517101zt.j0 - ((Number) obj).longValue());
    }

    public static final Object apply$4(C517101zt c517101zt, Object obj) {
        return Long.valueOf(c517101zt.j0 + ((Number) obj).longValue());
    }

    public static final Object apply$5(C517101zt c517101zt, Object obj) {
        boolean z;
        InterfaceC2262081DgM interfaceC2262081DgM = (InterfaceC2262081DgM) obj;
        if (interfaceC2262081DgM instanceof User) {
            User.EnigmaInfo enigmaInfo = ((User) interfaceC2262081DgM).enigmaInfo;
            if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            long j = c517101zt.j0;
            Boolean bool = Boolean.TRUE;
            if ((Intrinsics.LJFF(boolValueOf, bool) && j == 2) || (!Intrinsics.LJFF(boolValueOf, bool) && j == 1)) {
                return C11NZ.LJJJJZ(interfaceC2262081DgM);
            }
        }
        return C11NZ.LJJIJLIJ(new C290301An());
    }

    public static final Object apply$6(C517101zt c517101zt, Object obj) {
        return new Pair(Long.valueOf(c517101zt.j0), obj);
    }

    public static final Object apply$7(C517101zt c517101zt, Object obj) {
        return Long.valueOf(c517101zt.j0 - ((Long) obj).longValue());
    }

    public static final Object apply$8(C517101zt c517101zt, Object obj) {
        return Long.valueOf(c517101zt.j0 - ((Long) obj).longValue());
    }

    public static final Object apply$9(C517101zt c517101zt, Object obj) {
        return Long.valueOf(c517101zt.j0 - ((Long) obj).longValue());
    }
}
