package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ri1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598870ri1 implements InterfaceC1891350zJl, InterfaceC1890700zIi, InterfaceC1595240rcA, InterfaceC1598460rhM {
    public final Aweme LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public int LLILZIL;
    public final List<Aweme> LLILZLL;
    public final List<MediaModel> LLIZ;
    public final boolean LLIZLLLIL;
    public final String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1598870ri1)) {
            return false;
        }
        C1598870ri1 c1598870ri1 = (C1598870ri1) obj;
        return Intrinsics.LJFF(this.LL, c1598870ri1.LL) && this.LLILLJJLI == c1598870ri1.LLILLJJLI && this.LLILLL == c1598870ri1.LLILLL && Intrinsics.LJFF(this.LLILZ, c1598870ri1.LLILZ) && this.LLILZIL == c1598870ri1.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1598870ri1.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1598870ri1.LLIZ) && this.LLIZLLLIL == c1598870ri1.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1598870ri1.LLJ);
    }

    @Override // X.InterfaceC1595240rcA
    public final String getCellType() {
        return "on_this_day";
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1598460rhM
    public final String getItemFilterUid(String str) {
        return "ignore";
    }

    @Override // X.InterfaceC1595240rcA
    public final int getReRankSequence() {
        return -1;
    }

    @Override // X.InterfaceC1595240rcA
    public final Integer getReRankType() {
        return -1;
    }

    @Override // X.InterfaceC1595240rcA
    public final User getUser() {
        return null;
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        int iHashCode = (((((((((aweme == null ? 0 : aweme.hashCode()) * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31;
        List<Aweme> list = this.LLILZLL;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MediaModel> list2 = this.LLIZ;
        return ((((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ.hashCode();
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isSingleUser() {
        return false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryOnThisDayInboxItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", viewCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPosted=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pastMemoryKey=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", awemes=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", localMedias=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", hasScannedAlbum=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", onThisDayEnterMethod=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1595240rcA
    public final String getUid() {
        return C1595950rdJ.LIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skylight_onthisday_");
        Aweme aweme = this.LL;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C1598110rgn.LIZIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1598460rhM
    public final int getItemPriority(int i) {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1598870ri1)) {
            return C1600110rk1.LIZ("unknown");
        }
        return C1600110rk1.LIZJ();
    }

    public static C1598870ri1 LIZ(C1598870ri1 c1598870ri1, List list, boolean z, String str, int i) {
        Aweme aweme;
        int i2;
        int i3;
        String str2;
        int i4;
        String str3 = str;
        boolean z2 = z;
        List list2 = list;
        List<Aweme> list3 = null;
        if ((i & 1) != 0) {
            aweme = c1598870ri1.LL;
        } else {
            aweme = null;
        }
        if ((i & 2) != 0) {
            i2 = c1598870ri1.LLILLJJLI;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            i3 = c1598870ri1.LLILLL;
        } else {
            i3 = 0;
        }
        if ((i & 8) != 0) {
            str2 = c1598870ri1.LLILZ;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            i4 = c1598870ri1.LLILZIL;
        } else {
            i4 = 0;
        }
        if ((i & 32) != 0) {
            list3 = c1598870ri1.LLILZLL;
        }
        if ((i & 64) != 0) {
            list2 = c1598870ri1.LLIZ;
        }
        if ((i & 128) != 0) {
            z2 = c1598870ri1.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            str3 = c1598870ri1.LLJ;
        }
        c1598870ri1.getClass();
        return new C1598870ri1(aweme, i2, i3, str2, i4, list3, list2, z2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1598870ri1(Aweme aweme, int i, int i2, String str, int i3, List<? extends Aweme> list, List<? extends MediaModel> list2, boolean z, String str2) {
        this.LL = aweme;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str;
        this.LLILZIL = i3;
        this.LLILZLL = list;
        this.LLIZ = list2;
        this.LLIZLLLIL = z;
        this.LLJ = str2;
    }
}
