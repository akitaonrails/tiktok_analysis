package X;

import com.ss.android.ugc.gamora.editor.sticker.donation.model.MatchDonationText;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationModel;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationSearchResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.10xH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19413310xH {
    public final String LIZ;
    public final boolean LIZIZ;
    public final List<OrganizationSearchResultModel> LIZJ;
    public final List<OrganizationModel> LIZLLL;
    public final String LJ;
    public final MatchDonationText LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;

    public C19413310xH() {
        this(null, false, null, null, null, null, false, false, false, false, 1023);
    }

    public C19413310xH(String str, boolean z, List list, List list2, String str2, MatchDonationText matchDonationText, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        str = (i & 1) != 0 ? null : str;
        z = (i & 2) != 0 ? false : z;
        list = (i & 4) != 0 ? null : list;
        list2 = (i & 8) != 0 ? null : list2;
        str2 = (i & 16) != 0 ? null : str2;
        matchDonationText = (i & 32) != 0 ? null : matchDonationText;
        z2 = (i & 64) != 0 ? true : z2;
        z3 = (i & 128) != 0 ? false : z3;
        z4 = (i & 256) != 0 ? false : z4;
        z5 = (i & 512) != 0 ? false : z5;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = str2;
        this.LJFF = matchDonationText;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = z5;
    }
}
