package X;

/* JADX INFO: renamed from: X.0bLZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969910bLZ {
    public final C056N LIZ;
    public final EnumC124700dh LIZIZ;
    public final boolean LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C969910bLZ() {
        this((C056N) null, (EnumC124700dh) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C969910bLZ)) {
            return false;
        }
        C969910bLZ c969910bLZ = (C969910bLZ) obj;
        return this.LIZ == c969910bLZ.LIZ && this.LIZIZ == c969910bLZ.LIZIZ && this.LIZJ == c969910bLZ.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplatePageOptions(emptyClickAction=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", editDismissAction=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", forceRefresh=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C969910bLZ(C056N c056n, EnumC124700dh enumC124700dh, int i) {
        boolean z;
        c056n = (i & 1) != 0 ? C056N.REOPEN_NOTICEBOARD_DIALOG : c056n;
        enumC124700dh = (i & 2) != 0 ? EnumC124700dh.REOPEN_TEXTHEADER_PAGE : enumC124700dh;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(c056n, enumC124700dh, z);
    }

    public C969910bLZ(C056N c056n, EnumC124700dh enumC124700dh, boolean z) {
        this.LIZ = c056n;
        this.LIZIZ = enumC124700dh;
        this.LIZJ = z;
    }
}
