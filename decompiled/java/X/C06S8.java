package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06S8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06S8 extends C06S9 implements InterfaceC904740ZeS {
    public final C0Y3I LIZ;
    public final List<C869590Y9l> LIZIZ;
    public final Map<String, Map<String, String>> LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06S8)) {
            return false;
        }
        C06S8 c06s8 = (C06S8) obj;
        return Intrinsics.LJFF(this.LIZ, c06s8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c06s8.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c06s8.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnUpdateMessageEvent(tracer=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", list=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", oldMsgExtMap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return this.LIZLLL;
    }

    public /* synthetic */ C06S8(C0Y3I c0y3i, List list) {
        this(c0y3i, list, C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C06S8(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, ? extends Map<String, String>> map) {
        this.LIZ = c0y3i;
        this.LIZIZ = list;
        this.LIZJ = map;
        this.LIZLLL = "OnUpdateMessageEvent";
    }
}
