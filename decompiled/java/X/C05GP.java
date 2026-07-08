package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05GP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05GP implements C05GK {
    public final String LIZ;
    public final List<C869590Y9l> LIZIZ;

    public C05GP() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05GP)) {
            return false;
        }
        C05GP c05gp = (C05GP) obj;
        return Intrinsics.LJFF(this.LIZ, c05gp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c05gp.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadMessageEvent(eventType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C05GK
    public final String getEventType() {
        return this.LIZ;
    }

    @Override // X.C05GK
    public final /* bridge */ /* synthetic */ Object getPayload() {
        return this.LIZIZ;
    }

    public C05GP(List list) {
        this.LIZ = "load_message";
        this.LIZIZ = list;
    }
}
