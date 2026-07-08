package X;

import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0pWV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514850pWV {
    public static final Set<C1514840pWU> LIZ = new LinkedHashSet();
    public static final ReferenceQueue<View> LIZIZ = new ReferenceQueue<>();
    public static final String LIZJ = "spark_schema";
    public static final String LIZLLL = "spark_start";

    public static void LIZ() {
        Reference<? extends View> referencePoll = LIZIZ.poll();
        while (referencePoll != null && (referencePoll instanceof C1514840pWU)) {
            C1491570oux c1491570oux = C1491570oux.LIZ;
            String str = ((C1514840pWU) referencePoll).LIZ;
            c1491570oux.getClass();
            C1491570oux.LJIIZILJ(str);
            referencePoll = LIZIZ.poll();
            C19719512Dh.LIZ(LIZ).remove(referencePoll);
        }
    }
}
