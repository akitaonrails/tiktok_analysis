package X;

import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0RnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC706530RnX {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(517));
    public volatile boolean LIZIZ;

    public abstract void LIZJ();

    public final List<String> LIZ() {
        if (!this.LIZIZ) {
            LIZJ();
            this.LIZIZ = true;
        }
        return LIZIZ();
    }

    public final List<String> LIZIZ() {
        return (List) this.LIZ.getValue();
    }
}
