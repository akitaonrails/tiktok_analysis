package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0WaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825840WaU extends C09AY implements Function1<EnumC825810WaR, List<? extends String>> {
    public C825840WaU() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends String> invoke(EnumC825810WaR enumC825810WaR) {
        int i = C825820WaS.LIZ[enumC825810WaR.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                    return null;
                }
                return C825850WaV.LIZIZ;
            }
            return null;
        }
        return C825850WaV.LIZ;
    }
}
