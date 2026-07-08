package X;

/* JADX INFO: renamed from: X.0iwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261770iwJ implements InterfaceC1262230ix3 {
    public final EnumC1070410dxf LL;
    public final AbstractC1262510ixV LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public boolean LLILZIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthCard(platform=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", strategy=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showWhenHasDataOnly=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", elementId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // X.InterfaceC1262230ix3
    public final String getElementId() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1262230ix3
    public final boolean isRemoved() {
        return this.LLILZIL;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1261770iwJ) || this.LL != ((C1261770iwJ) obj).LL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1262230ix3
    public final void setRemoved(boolean z) {
        this.LLILZIL = true;
    }

    public C1261770iwJ(EnumC1070410dxf enumC1070410dxf, AbstractC1262510ixV abstractC1262510ixV, boolean z) {
        String strName = enumC1070410dxf.name();
        this.LL = enumC1070410dxf;
        this.LLILLJJLI = abstractC1262510ixV;
        this.LLILLL = z;
        this.LLILZ = strName;
    }
}
