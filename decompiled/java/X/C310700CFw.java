package X;

import com.ss.android.ugc.aweme.im.common.experiment.IMSafDelayedTransitionParam;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310700CFw {
    public static final IMSafDelayedTransitionParam LIZ = new IMSafDelayedTransitionParam(0, 500, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4564));

    public static boolean LIZ() {
        C01GW c01gw = LIZIZ;
        return ((IMSafDelayedTransitionParam) c01gw.getValue()).transitionTimeoutMs > 0 && ((IMSafDelayedTransitionParam) c01gw.getValue()).triggerAfterListSkeleton;
    }
}
