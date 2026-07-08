package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;

/* JADX INFO: renamed from: X.12Hy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19731612Hy extends C19731412Hw {
    public final String LJFF;

    public C19731612Hy(String str) {
        super("");
        this.LJFF = str;
    }

    @Override // X.C19731412Hw, X.C12HT
    public final void LJI(ComposerBeauty composerBeauty, EnumC19731112Ht enumC19731112Ht, String str, float f) {
        String strLIZJ = C1054690dYJ.LIZJ(this.LJFF, this.LIZ, enumC19731112Ht.getFlag(), composerBeauty.getEffect().getResourceId(), str);
        C19731412Hw.LIZLLL.storeFloat(strLIZJ, f);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveBeautyTagValue key: ");
        sbLIZ.append(strLIZJ);
        sbLIZ.append(" val: ");
        sbLIZ.append(f);
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C19731412Hw, X.C12HT
    public final float LJIIL(ComposerBeauty composerBeauty, EnumC19731112Ht enumC19731112Ht, String str, float f) {
        return C19731412Hw.LIZLLL.getFloat(C1054690dYJ.LIZJ(this.LJFF, this.LIZ, enumC19731112Ht.getFlag(), composerBeauty.getEffect().getResourceId(), str), f);
    }
}
