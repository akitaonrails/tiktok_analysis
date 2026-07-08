package X;

import com.ss.android.ugc.aweme.badge.EditProfileBadgeCampaignModel;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20579215fq {
    public final Integer LIZ;
    public final String LIZIZ;
    public final List<EditProfileBadgeModel> LIZJ;
    public final EditProfileBadgeCampaignModel LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public C20579215fq() {
        this(null, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20579215fq)) {
            return false;
        }
        C20579215fq c20579215fq = (C20579215fq) obj;
        return Intrinsics.LJFF(this.LIZ, c20579215fq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20579215fq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20579215fq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20579215fq.LIZLLL) && this.LJ == c20579215fq.LJ && this.LJFF == c20579215fq.LJFF;
    }

    public /* synthetic */ C20579215fq(List list, boolean z, int i) {
        this(null, null, (i & 4) != 0 ? null : list, null, (i & 16) != 0 ? true : z, false);
    }

    public C20579215fq(Integer num, String str, List<EditProfileBadgeModel> list, EditProfileBadgeCampaignModel editProfileBadgeCampaignModel, boolean z, boolean z2) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = editProfileBadgeCampaignModel;
        this.LJ = z;
        this.LJFF = z2;
    }
}
