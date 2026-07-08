package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0DlM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348460DlM extends C348440DlK {
    public String LJIIL;
    public String LJIILIIL;
    public String[] LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;

    public C348460DlM() {
        this(0);
    }

    @Override // X.C348440DlK
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InfoStickerParams(path=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", params=");
        String[] strArr = this.LJIILJJIL;
        sbLIZ.append(strArr != null ? Arrays.toString(strArr) : null);
        sbLIZ.append(')');
        sbLIZ.append(super.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C348460DlM(int i) {
        super(EnumC356050Dxb.INFO);
    }

    public C348460DlM(EnumC356050Dxb enumC356050Dxb) {
        super(enumC356050Dxb);
    }
}
