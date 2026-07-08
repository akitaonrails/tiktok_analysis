package X;

/* JADX INFO: renamed from: X.0dPH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049090dPH implements InterfaceC0148002o {
    public final int LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1049090dPH)) {
            return false;
        }
        C1049090dPH c1049090dPH = (C1049090dPH) obj;
        return this.LL == c1049090dPH.LL && this.LLILLJJLI == c1049090dPH.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdExtensionLayerState(labelState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", layerVisible=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1049090dPH(int i, boolean z) {
        this.LL = i;
        this.LLILLJJLI = z;
    }
}
