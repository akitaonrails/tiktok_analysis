package X;

import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18l7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21376318l7 {
    public final List<C21376418l8> LIZ;
    public final EnumC21376018l4 LIZIZ;
    public final CustomColor LIZJ;
    public final CustomColor LIZLLL;
    public final CustomColor LJ;
    public final CustomColor LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21376318l7)) {
            return false;
        }
        C21376318l7 c21376318l7 = (C21376318l7) obj;
        return Intrinsics.LJFF(this.LIZ, c21376318l7.LIZ) && this.LIZIZ == c21376318l7.LIZIZ && Intrinsics.LJFF(this.LIZJ, c21376318l7.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c21376318l7.LIZLLL) && Intrinsics.LJFF(this.LJ, c21376318l7.LJ) && Intrinsics.LJFF(this.LJFF, c21376318l7.LJFF);
    }

    public C21376318l7(List<C21376418l8> list, EnumC21376018l4 enumC21376018l4, CustomColor customColor, CustomColor customColor2, CustomColor customColor3, CustomColor customColor4) {
        this.LIZ = list;
        this.LIZIZ = enumC21376018l4;
        this.LIZJ = customColor;
        this.LIZLLL = customColor2;
        this.LJ = customColor3;
        this.LJFF = customColor4;
    }

    public /* synthetic */ C21376318l7(List list, EnumC21376018l4 enumC21376018l4, CustomColor customColor, CustomColor customColor2, CustomColor customColor3, CustomColor customColor4, int i) {
        this(list, enumC21376018l4, (i & 4) != 0 ? null : customColor, (i & 8) != 0 ? null : customColor2, (i & 16) != 0 ? null : customColor3, (i & 32) == 0 ? customColor4 : null);
    }
}
