package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.047g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10462047g {
    public final Float LIZ;
    public final String LIZIZ;
    public final CombinedSalesVolume LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;
    public final C044R LJFF;
    public final InterfaceC10464047i LJI;
    public final LinkRichText LJII;
    public final ECRichText LJIIIIZZ;
    public final Integer LJIIIZ;
    public final PopUpMessage LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10462047g)) {
            return false;
        }
        C10462047g c10462047g = (C10462047g) obj;
        return Intrinsics.LJFF(this.LIZ, c10462047g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c10462047g.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c10462047g.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c10462047g.LIZLLL) && Intrinsics.LJFF(this.LJ, c10462047g.LJ) && Intrinsics.LJFF(this.LJFF, c10462047g.LJFF) && Intrinsics.LJFF(this.LJI, c10462047g.LJI) && Intrinsics.LJFF(this.LJII, c10462047g.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c10462047g.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c10462047g.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c10462047g.LJIIJ);
    }

    public C10462047g(Float f, String str, CombinedSalesVolume combinedSalesVolume, Boolean bool, Boolean bool2, C044R c044r, InterfaceC10464047i interfaceC10464047i, LinkRichText linkRichText, ECRichText eCRichText, Integer num, PopUpMessage popUpMessage) {
        this.LIZ = f;
        this.LIZIZ = str;
        this.LIZJ = combinedSalesVolume;
        this.LIZLLL = bool;
        this.LJ = bool2;
        this.LJFF = c044r;
        this.LJI = interfaceC10464047i;
        this.LJII = linkRichText;
        this.LJIIIIZZ = eCRichText;
        this.LJIIIZ = num;
        this.LJIIJ = popUpMessage;
    }
}
