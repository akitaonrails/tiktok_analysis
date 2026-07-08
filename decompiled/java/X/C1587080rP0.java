package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rP0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587080rP0 {
    public static final boolean LIZ(EnumC1586970rOp enumC1586970rOp) {
        if (enumC1586970rOp == EnumC1586970rOp.COLD_START || enumC1586970rOp == EnumC1586970rOp.LOGIN_SUCCESS || enumC1586970rOp == EnumC1586970rOp.SWITCH_ACCOUNT || enumC1586970rOp == EnumC1586970rOp.NON_PERSONALIZED_CHANGED) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(String str) {
        if (Intrinsics.LJFF(str, "friends tab 3.0") || Intrinsics.LJFF(str, "onFriendsFeedRedDotMinus") || Intrinsics.LJFF(str, "removeRedDotByUid") || Intrinsics.LJFF(str, "onTopTabChanged") || Intrinsics.LJFF(str, "switch to 2 tab not first time opt") || Intrinsics.LJFF(str, "switch to 2 tab not first time opt - publish landing") || Intrinsics.LJFF(str, "switch to 2 tab not first time") || Intrinsics.LJFF(str, "switch to 2 tab with null fragment") || Intrinsics.LJFF(str, "landing")) {
            return true;
        }
        return false;
    }

    public static final Pair<Boolean, Boolean> LIZJ(EnumC1586970rOp enumC1586970rOp) {
        boolean z;
        boolean zLIZ = C319860CgK.LIZ();
        boolean z2 = false;
        if (!C1595430rcT.LIZIZ.LIZIZ().enableTabAvatar() && !zLIZ) {
            z = false;
        } else {
            z = true;
        }
        if (enumC1586970rOp == EnumC1586970rOp.COLD_START || enumC1586970rOp == EnumC1586970rOp.LOGIN_SUCCESS || enumC1586970rOp == EnumC1586970rOp.SWITCH_ACCOUNT || (enumC1586970rOp == EnumC1586970rOp.NON_PERSONALIZED_CHANGED && zLIZ)) {
            z2 = true;
        }
        return new Pair<>(Boolean.valueOf(z), Boolean.valueOf(z2));
    }
}
