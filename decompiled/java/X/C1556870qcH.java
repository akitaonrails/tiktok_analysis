package X;

/* JADX INFO: renamed from: X.0qcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556870qcH implements InterfaceC0148002o {
    public final EnumC1574970r5T LL;
    public final boolean LLILLJJLI;

    public C1556870qcH() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556870qcH)) {
            return false;
        }
        C1556870qcH c1556870qcH = (C1556870qcH) obj;
        return this.LL == c1556870qcH.LL && this.LLILLJJLI == c1556870qcH.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeatureVideoAwemeListNavBarState(loadingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", saveSuccess=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1556870qcH(int i) {
        this(EnumC1574970r5T.DEFAULT, false);
    }

    public C1556870qcH(EnumC1574970r5T enumC1574970r5T, boolean z) {
        this.LL = enumC1574970r5T;
        this.LLILLJJLI = z;
    }

    public static C1556870qcH LIZ(C1556870qcH c1556870qcH, EnumC1574970r5T enumC1574970r5T) {
        boolean z = c1556870qcH.LLILLJJLI;
        c1556870qcH.getClass();
        return new C1556870qcH(enumC1574970r5T, z);
    }
}
