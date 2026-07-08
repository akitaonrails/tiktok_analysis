package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734600vEw extends C09AY implements Function1<C1734460vEi, C1734460vEi> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734600vEw(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1734460vEi invoke(C1734460vEi c1734460vEi) {
        final String str = this.LL;
        return C1734460vEi.LIZ(c1734460vEi, null, new C291001Au(new AbstractC788420UwK(str) { // from class: X.0UwJ
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C788410UwJ) && Intrinsics.LJFF(this.LIZ, ((C788410UwJ) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TriggerCaptcha(decision=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = str;
            }
        }), null, false, null, null, 61);
    }
}
