package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06vC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1762006vC implements InterfaceC904740ZeS {
    public static final /* synthetic */ int LIZJ = 0;
    public final List<C869590Y9l> LIZ;
    public final EnumC1762106vD LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1762006vC)) {
            return false;
        }
        C1762006vC c1762006vC = (C1762006vC) obj;
        return Intrinsics.LJFF(this.LIZ, c1762006vC.LIZ) && this.LIZIZ == c1762006vC.LIZIZ;
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return "OnLoadOlderEvent";
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnLoadOlderEvent(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1762006vC(List<? extends C869590Y9l> list, EnumC1762106vD enumC1762106vD) {
        this.LIZ = list;
        this.LIZIZ = enumC1762106vD;
    }
}
