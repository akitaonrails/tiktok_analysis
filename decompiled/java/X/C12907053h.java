package X;

/* JADX INFO: renamed from: X.053h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12907053h implements C053Z {
    public final long LIZ;
    public final EnumC12927054b LIZIZ;
    public final int LIZJ;
    public final EnumC12930054e LIZLLL = EnumC12930054e.MAX_COUNT_AND_MAX_DURATION;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12907053h)) {
            return false;
        }
        C12907053h c12907053h = (C12907053h) obj;
        return this.LIZ == c12907053h.LIZ && this.LIZIZ == c12907053h.LIZIZ && this.LIZJ == c12907053h.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaxCountAndMaxDurationRuleConfig(timeDuration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeUnit=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C053Z
    public final String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL.getTag());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ.getTag());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12907053h(int i, long j, EnumC12927054b enumC12927054b) {
        this.LIZ = j;
        this.LIZIZ = enumC12927054b;
        this.LIZJ = i;
    }
}
