package X;

import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0m4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382300m4i<R> {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(13));

    public final AbstractC2250601D7a LIZIZ() {
        for (AbstractC2250601D7a abstractC2250601D7a : (List) this.LIZ.getValue()) {
            if (abstractC2250601D7a.LJFF) {
                return abstractC2250601D7a;
            }
        }
        return null;
    }

    public final void LIZ(AbstractC2250601D7a abstractC2250601D7a) {
        ((List) this.LIZ.getValue()).add(abstractC2250601D7a);
    }
}
