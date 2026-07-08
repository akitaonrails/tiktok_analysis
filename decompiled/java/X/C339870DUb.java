package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339870DUb extends AbstractC339890DUd {
    public final String LIZ;
    public final C0DUY LIZIZ;
    public final C817600W5m LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C339870DUb)) {
            return false;
        }
        C339870DUb c339870DUb = (C339870DUb) obj;
        return Intrinsics.LJFF(this.LIZ, c339870DUb.LIZ) && this.LIZIZ == c339870DUb.LIZIZ && Intrinsics.LJFF(this.LIZJ, c339870DUb.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryThoughtDraftDraftItem(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC339890DUd
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC339890DUd
    public final EnumC339930DUh LIZIZ() {
        return EnumC339930DUh.DRAFT;
    }

    public C339870DUb(String str, C0DUY c0duy, C817600W5m c817600W5m) {
        this.LIZ = str;
        this.LIZIZ = c0duy;
        this.LIZJ = c817600W5m;
    }
}
