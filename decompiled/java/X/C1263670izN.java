package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0izN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263670izN implements InterfaceC0148002o {
    public final int LL;
    public final MufPageTrackInfo LLILLJJLI;
    public final EnumC1263720izS LLILLL;
    public final EnumC1263700izQ LLILZ;
    public final C1075800e6M LLILZIL;
    public final String LLILZLL;
    public final List<IMUser> LLIZ;
    public final EnumC1263680izO LLIZLLLIL;
    public final EnumC1263650izL LLJ;
    public final int LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1263670izN)) {
            return false;
        }
        C1263670izN c1263670izN = (C1263670izN) obj;
        return this.LL == c1263670izN.LL && Intrinsics.LJFF(this.LLILLJJLI, c1263670izN.LLILLJJLI) && this.LLILLL == c1263670izN.LLILLL && this.LLILZ == c1263670izN.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1263670izN.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1263670izN.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1263670izN.LLIZ) && this.LLIZLLLIL == c1263670izN.LLIZLLLIL && this.LLJ == c1263670izN.LLJ && this.LLJI == c1263670izN.LLJI;
    }

    public final int hashCode() {
        int i = this.LL * 31;
        MufPageTrackInfo mufPageTrackInfo = this.LLILLJJLI;
        return ((((((((((((((((i + (mufPageTrackInfo == null ? 0 : mufPageTrackInfo.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MufListPageVMState(scene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", trackInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mafChunkState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", mufSourceState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", mafSourceState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", searchText=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", searchResult=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", authState=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", pageState=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", maxNewFriendShowCount=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1263670izN(int i, MufPageTrackInfo mufPageTrackInfo, EnumC1263720izS enumC1263720izS, EnumC1263700izQ enumC1263700izQ, C1075800e6M c1075800e6M, String str, List<? extends IMUser> list, EnumC1263680izO enumC1263680izO, EnumC1263650izL enumC1263650izL, int i2) {
        this.LL = i;
        this.LLILLJJLI = mufPageTrackInfo;
        this.LLILLL = enumC1263720izS;
        this.LLILZ = enumC1263700izQ;
        this.LLILZIL = c1075800e6M;
        this.LLILZLL = str;
        this.LLIZ = list;
        this.LLIZLLLIL = enumC1263680izO;
        this.LLJ = enumC1263650izL;
        this.LLJI = i2;
    }

    public static C1263670izN LIZ(C1263670izN c1263670izN, int i, MufPageTrackInfo mufPageTrackInfo, EnumC1263720izS enumC1263720izS, EnumC1263700izQ enumC1263700izQ, C1075800e6M c1075800e6M, String str, List list, EnumC1263680izO enumC1263680izO, EnumC1263650izL enumC1263650izL, int i2, int i3) {
        int i4 = i2;
        EnumC1263650izL enumC1263650izL2 = enumC1263650izL;
        EnumC1263680izO enumC1263680izO2 = enumC1263680izO;
        List list2 = list;
        String str2 = str;
        C1075800e6M c1075800e6M2 = c1075800e6M;
        EnumC1263700izQ enumC1263700izQ2 = enumC1263700izQ;
        EnumC1263720izS enumC1263720izS2 = enumC1263720izS;
        MufPageTrackInfo mufPageTrackInfo2 = mufPageTrackInfo;
        int i5 = i;
        if ((i3 & 1) != 0) {
            i5 = c1263670izN.LL;
        }
        if ((i3 & 2) != 0) {
            mufPageTrackInfo2 = c1263670izN.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            enumC1263720izS2 = c1263670izN.LLILLL;
        }
        if ((i3 & 8) != 0) {
            enumC1263700izQ2 = c1263670izN.LLILZ;
        }
        if ((i3 & 16) != 0) {
            c1075800e6M2 = c1263670izN.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            str2 = c1263670izN.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            list2 = c1263670izN.LLIZ;
        }
        if ((i3 & 128) != 0) {
            enumC1263680izO2 = c1263670izN.LLIZLLLIL;
        }
        if ((i3 & 256) != 0) {
            enumC1263650izL2 = c1263670izN.LLJ;
        }
        if ((i3 & 512) != 0) {
            i4 = c1263670izN.LLJI;
        }
        c1263670izN.getClass();
        return new C1263670izN(i5, mufPageTrackInfo2, enumC1263720izS2, enumC1263700izQ2, c1075800e6M2, str2, list2, enumC1263680izO2, enumC1263650izL2, i4);
    }
}
