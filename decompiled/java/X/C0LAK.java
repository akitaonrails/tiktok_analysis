package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LAK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LAK {
    public static final C0LSZ LIZ(List<C0LSZ> list) {
        C0LSZ next;
        Iterator<C0LSZ> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C0LSZ c0lsz = next;
                if (c0lsz.LJIIL == Source.SHOOTING_I2V && !Intrinsics.LJFF(c0lsz.LJ, "STOPPED") && !Intrinsics.LJFF(c0lsz.LJ, "CANCELED")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }
}
