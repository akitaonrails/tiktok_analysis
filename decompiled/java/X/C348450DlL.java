package X;

/* JADX INFO: renamed from: X.0DlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348450DlL extends C348440DlK {
    public String LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public final boolean LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;

    public C348450DlL() {
        this(false, 15);
    }

    @Override // X.C348440DlK
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageStickerParams(path=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(')');
        sbLIZ.append(super.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C348450DlL(boolean z, int i) {
        super(EnumC356050Dxb.IMAGE);
        z = (i & 8) != 0 ? false : z;
        this.LJIIL = null;
        this.LJIILIIL = 0.0f;
        this.LJIILJJIL = 0.0f;
        this.LJIILL = z;
    }
}
