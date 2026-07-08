package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS49S0010000_3;

/* JADX INFO: renamed from: X.0svC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645480svC {
    public static C1631550sYj LIZ(C1DRG c1drg, Function0 function0, boolean z, Long l, int i) {
        boolean z2;
        boolean zLIZ;
        Long l2 = l;
        boolean z3 = z;
        Function0 function02 = function0;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 32) != 0) {
            function02 = AFwS214S0000000_25.get$arr$(132);
        }
        if ((i & 64) != 0) {
            zLIZ = C1645510svF.LIZ();
        } else {
            zLIZ = false;
        }
        if ((i & 128) != 0) {
            z3 = false;
        }
        if ((i & 512) != 0) {
            l2 = null;
        }
        ShortVideoContext shortVideoContext = (ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null);
        boolean z4 = shortVideoContext.isStory;
        return new C1631550sYj(c1drg, new AwS49S0010000_3(z4, 0), AFwS266S0000000_25.get$arr$(118), l2, new C1645490svD(null, shortVideoContext, z4, z2, function02, z3, zLIZ, false));
    }
}
