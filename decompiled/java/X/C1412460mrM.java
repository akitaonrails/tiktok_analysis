package X;

import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectMethodType;

/* JADX INFO: renamed from: X.0mrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412460mrM {
    public final boolean LIZ;
    public final String LIZIZ;
    public final MixEditingMaterialType LIZJ;
    public final boolean LIZLLL;
    public final SelectMethodType LJ;
    public final boolean LJFF;

    public C1412460mrM() {
        this(false, null, null, false, null, 127);
    }

    public C1412460mrM(boolean z, String str, MixEditingMaterialType mixEditingMaterialType, boolean z2, SelectMethodType selectMethodType, int i) {
        z = (i & 1) != 0 ? false : z;
        str = (i & 2) != 0 ? "" : str;
        mixEditingMaterialType = (i & 8) != 0 ? MixEditingMaterialType.UNKNOWN_TYPE : mixEditingMaterialType;
        z2 = (i & 16) != 0 ? true : z2;
        selectMethodType = (i & 32) != 0 ? SelectMethodType.UNSELECT : selectMethodType;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = mixEditingMaterialType;
        this.LIZLLL = z2;
        this.LJ = selectMethodType;
        this.LJFF = false;
    }
}
