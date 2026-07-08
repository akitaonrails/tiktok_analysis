package X;

import com.ss.android.ugc.aweme.tako.detail.model.TakoKeyFramePoint;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14FS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14FS implements InterfaceC1618180sDA<C14FS> {
    public final List<Pair<String, Long>> LL;
    public final C0PHT LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final Map<String, List<TakoKeyFramePoint>> LLJILLL;
    public final boolean LLJJ;
    public final String LLJJI;

    public C14FS() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14FS)) {
            return false;
        }
        C14FS c14fs = (C14FS) obj;
        return Intrinsics.LJFF(this.LL, c14fs.LL) && Intrinsics.LJFF(this.LLILLJJLI, c14fs.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c14fs.LLILLL) && Intrinsics.LJFF(this.LLILZ, c14fs.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c14fs.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c14fs.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c14fs.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c14fs.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c14fs.LLJ) && Intrinsics.LJFF(this.LLJI, c14fs.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c14fs.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c14fs.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c14fs.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c14fs.LLJILLL) && this.LLJJ == c14fs.LLJJ && Intrinsics.LJFF(this.LLJJI, c14fs.LLJJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31;
        String str = this.LLJIJIL;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLJILJIL.hashCode()) * 31;
        String str2 = this.LLJILJILJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, List<TakoKeyFramePoint>> map = this.LLJILLL;
        return ((((iHashCode3 + (map != null ? map.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31) + this.LLJJI.hashCode();
    }

    public final String toString() {
        return "TakoEnterDetailState(awemeIdListWithIndex=" + this.LL + ", streamRoot=" + this.LLILLJJLI + ", enterAid=" + this.LLILLL + ", outId=" + this.LLILZ + ", takoOutSearchId=" + this.LLILZIL + ", conversationId=" + this.LLILZLL + ", msgId=" + this.LLIZ + ", uuid=" + this.LLIZLLLIL + ", isMixedLayout=" + this.LLJ + ", responseType=" + this.LLJI + ", responseRank=" + this.LLJIJIL + ", botType=" + this.LLJILJIL + ", inspirationSessionId=" + this.LLJILJILJ + ", keyframePointsBindingToAweme=" + this.LLJILLL + ", enableLoadMore=" + this.LLJJ + ", sourceId=" + this.LLJJI + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public C14FS(int i) {
        this(C13BV.INSTANCE, new C0PHT(null, 511), "", "", "", "", "", "", "", "", null, "", null, null, true, UUID.randomUUID().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14FS(List<Pair<String, Long>> list, C0PHT c0pht, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map<String, ? extends List<TakoKeyFramePoint>> map, boolean z, String str12) {
        this.LL = list;
        this.LLILLJJLI = c0pht;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
        this.LLJ = str7;
        this.LLJI = str8;
        this.LLJIJIL = str9;
        this.LLJILJIL = str10;
        this.LLJILJILJ = str11;
        this.LLJILLL = map;
        this.LLJJ = z;
        this.LLJJI = str12;
    }
}
