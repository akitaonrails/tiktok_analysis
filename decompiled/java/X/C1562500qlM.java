package X;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qlM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562500qlM {
    public int LIZ = 2;

    public final void LIZ() {
        int i = this.LIZ - 1;
        this.LIZ = i;
        if (i == 0) {
            for (Pair pair : (ArrayList) C1562470qlJ.LIZIZ) {
                C725430Scv.LJI((AbstractC725500Sd2) pair.getFirst(), (Function1) pair.getSecond());
            }
        }
    }
}
