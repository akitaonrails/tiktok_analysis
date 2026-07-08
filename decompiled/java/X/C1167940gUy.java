package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.mix.model.MixStatisStruct;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167940gUy implements InterfaceC1891350zJl {
    public final String LL;
    public final UrlModel LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final Long LLILZIL;
    public final int LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final ShareInfo LLJI;

    public C1167940gUy() {
        this(null, null, null, null, null, 0, null, null, "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1167940gUy)) {
            return false;
        }
        C1167940gUy c1167940gUy = (C1167940gUy) obj;
        return Intrinsics.LJFF(this.LL, c1167940gUy.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1167940gUy.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1167940gUy.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1167940gUy.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1167940gUy.LLILZIL) && this.LLILZLL == c1167940gUy.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1167940gUy.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1167940gUy.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1167940gUy.LLJ) && Intrinsics.LJFF(this.LLJI, c1167940gUy.LLJI);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UrlModel urlModel = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.LLILZIL;
        int iHashCode5 = (((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31) + this.LLILZLL) * 31;
        String str3 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLIZLLLIL;
        int iHashCode7 = (((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LLJ.hashCode()) * 31;
        ShareInfo shareInfo = this.LLJI;
        return iHashCode7 + (shareInfo != null ? shareInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManagePlaylistItem(playlistName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", partCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", playlistId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", lastUpdateTime=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", mixLabel=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", shareInfo=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1167940gUy)) {
            return false;
        }
        C1167940gUy c1167940gUy = (C1167940gUy) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c1167940gUy.LLILZ, this.LLILZ) || !Intrinsics.LJFF(c1167940gUy.LL, this.LL) || !Intrinsics.LJFF(c1167940gUy.LLILZIL, this.LLILZIL) || !Intrinsics.LJFF(c1167940gUy.LLILLL, this.LLILLL) || c1167940gUy.LLILZLL != this.LLILZLL || !Intrinsics.LJFF(c1167940gUy.LLILLJJLI, this.LLILLJJLI)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1167940gUy)) {
            return false;
        }
        return Intrinsics.LJFF(((C1167940gUy) interfaceC1891350zJl).LLILZ, this.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof C1167940gUy) {
            C1167940gUy c1167940gUy = (C1167940gUy) interfaceC1891350zJl;
            boolean z2 = !Intrinsics.LJFF(c1167940gUy.LLILLJJLI, this.LLILLJJLI);
            boolean z3 = !Intrinsics.LJFF(c1167940gUy.LL, this.LL);
            boolean z4 = !Intrinsics.LJFF(c1167940gUy.LLILLL, this.LLILLL);
            boolean z5 = false;
            if (c1167940gUy.LLILZLL != this.LLILZLL) {
                z = true;
            } else {
                z = false;
            }
            Integer num = c1167940gUy.LLILLL;
            if ((num != null && num.intValue() == 0) || !Intrinsics.LJFF(c1167940gUy.LLILZIL, this.LLILZIL)) {
                z5 = true;
            }
            return new C445520HdW(z2, z3, z4, z, z5);
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1167940gUy(MixStruct mixStruct, String str, String str2, String str3) {
        Integer numValueOf;
        String mixName = mixStruct.getMixName();
        UrlModel icon = mixStruct.getIcon();
        MixStatisStruct statis = mixStruct.getStatis();
        if (statis != null) {
            numValueOf = Integer.valueOf(statis.getTotal());
        } else {
            numValueOf = null;
        }
        this(mixName, icon, numValueOf, mixStruct.mixId, mixStruct.getLastAddVideoTimestamp(), mixStruct.getMixLabel(), str, str2, str3, mixStruct.getShareInfo());
    }

    public static C1167940gUy LIZ(C1167940gUy c1167940gUy, String str, UrlModel urlModel, Integer num, Long l, int i, ShareInfo shareInfo, int i2) {
        String str2;
        String str3;
        String str4;
        int i3 = i;
        ShareInfo shareInfo2 = shareInfo;
        Integer num2 = num;
        Long l2 = l;
        UrlModel urlModel2 = urlModel;
        String str5 = str;
        if ((i2 & 1) != 0) {
            str5 = c1167940gUy.LL;
        }
        if ((i2 & 2) != 0) {
            urlModel2 = c1167940gUy.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            num2 = c1167940gUy.LLILLL;
        }
        String str6 = null;
        if ((i2 & 8) != 0) {
            str2 = c1167940gUy.LLILZ;
        } else {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            l2 = c1167940gUy.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            i3 = c1167940gUy.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            str3 = c1167940gUy.LLIZ;
        } else {
            str3 = null;
        }
        if ((i2 & 128) != 0) {
            str4 = c1167940gUy.LLIZLLLIL;
        } else {
            str4 = null;
        }
        if ((i2 & 256) != 0) {
            str6 = c1167940gUy.LLJ;
        }
        if ((i2 & 512) != 0) {
            shareInfo2 = c1167940gUy.LLJI;
        }
        return new C1167940gUy(str5, urlModel2, num2, str2, l2, i3, str3, str4, str6, shareInfo2);
    }

    public C1167940gUy(String str, UrlModel urlModel, Integer num, String str2, Long l, int i, String str3, String str4, String str5, ShareInfo shareInfo) {
        this.LL = str;
        this.LLILLJJLI = urlModel;
        this.LLILLL = num;
        this.LLILZ = str2;
        this.LLILZIL = l;
        this.LLILZLL = i;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = shareInfo;
    }
}
