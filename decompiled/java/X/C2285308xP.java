package X;

import com.ss.android.ugc.aweme.experiment.DeeplinkSearchSingleActivityData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08xP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2285308xP {
    public static final DeeplinkSearchSingleActivityData LIZ = new DeeplinkSearchSingleActivityData(Boolean.FALSE);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static boolean LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        DeeplinkSearchSingleActivityData deeplinkSearchSingleActivityData = LIZ;
        DeeplinkSearchSingleActivityData deeplinkSearchSingleActivityData2 = (DeeplinkSearchSingleActivityData) c0c64LJIILLIIL.LJJIIJ(false, "deeplink_search_single_activity", 31744, DeeplinkSearchSingleActivityData.class, deeplinkSearchSingleActivityData, 1);
        if (deeplinkSearchSingleActivityData2 != null) {
            deeplinkSearchSingleActivityData = deeplinkSearchSingleActivityData2;
        }
        return Intrinsics.LJFF(deeplinkSearchSingleActivityData.useSearchSingleActivity, Boolean.TRUE);
    }
}
