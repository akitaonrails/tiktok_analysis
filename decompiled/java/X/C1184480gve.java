package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@InterfaceC1294060jmO
public final class C1184480gve implements InterfaceC111300bX, InterfaceC2753014t, InterfaceC1185170gwl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final C1188440h22 LLILZLL;
    public final C1185490gxH LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final Map<String, String> LLJILJILJ;
    public final Boolean LLJILLL;
    public final PoiDetailApi.PoiDetailDataModel LLJJ;
    public final PoiAnchorExtra LLJJI;
    public final boolean LLJJIII;
    public final String LLJJIJI;
    public final String LLJJIJIIJIL;

    public C1184480gve() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 524287);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1184480gve)) {
            return false;
        }
        C1184480gve c1184480gve = (C1184480gve) obj;
        return Intrinsics.LJFF(this.LL, c1184480gve.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1184480gve.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1184480gve.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1184480gve.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1184480gve.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1184480gve.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1184480gve.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1184480gve.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1184480gve.LLJ) && Intrinsics.LJFF(this.LLJI, c1184480gve.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1184480gve.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1184480gve.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1184480gve.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1184480gve.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1184480gve.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1184480gve.LLJJI) && this.LLJJIII == c1184480gve.LLJJIII && Intrinsics.LJFF(this.LLJJIJI, c1184480gve.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1184480gve.LLJJIJIIJIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C1188440h22 c1188440h22 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c1188440h22 == null ? 0 : c1188440h22.hashCode())) * 31;
        C1185490gxH c1185490gxH = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (c1185490gxH == null ? 0 : c1185490gxH.hashCode())) * 31;
        String str6 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLJI;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LLJIJIL;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LLJILJIL;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Map<String, String> map = this.LLJILJILJ;
        int iHashCode13 = (iHashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.LLJILLL;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        PoiDetailApi.PoiDetailDataModel poiDetailDataModel = this.LLJJ;
        int iHashCode15 = (iHashCode14 + (poiDetailDataModel == null ? 0 : poiDetailDataModel.hashCode())) * 31;
        PoiAnchorExtra poiAnchorExtra = this.LLJJI;
        int iHashCode16 = (((iHashCode15 + (poiAnchorExtra == null ? 0 : poiAnchorExtra.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31;
        String str11 = this.LLJJIJI;
        return ((iHashCode16 + (str11 != null ? str11.hashCode() : 0)) * 31) + this.LLJJIJIIJIL.hashCode();
    }

    public final String toString() {
        return "PoiVideoDetailHierarchyData(entranceEnterMethod=" + this.LL + ", entranceEnterPage=" + this.LLILLJJLI + ", initialPoiEnterFrom=" + this.LLILLL + ", initialPoiEnterMethod=" + this.LLILZ + ", initialPoiFromGroupId=" + this.LLILZIL + ", poiAnchorData=" + this.LLILZLL + ", poiAnchorMobData=" + this.LLIZ + ", groupId=" + this.LLIZLLLIL + ", authorId=" + this.LLJ + ", logPb=" + this.LLJI + ", previousPage=" + this.LLJIJIL + ", poiId=" + this.LLJILJIL + ", searchParams=" + this.LLJILJILJ + ", inSheetMode=" + this.LLJILLL + ", poiDetailDataModel=" + this.LLJJ + ", poiAnchorExtra=" + this.LLJJI + ", inMapMode=" + this.LLJJIII + ", typeLevel=" + this.LLJJIJI + ", sourceId=" + this.LLJJIJIIJIL + ')';
    }

    @Override // X.InterfaceC1185170gwl
    public final String LIZ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1185170gwl
    public final String LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1185170gwl
    public final String LIZJ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1185170gwl
    public final String LJ() {
        return this.LL;
    }

    @Override // X.InterfaceC1185170gwl
    public final C1185490gxH LJFF() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1185170gwl
    public final Boolean LJII() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1185170gwl
    public final C1188440h22 LJIIIZ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1185170gwl
    public final String LJIIJJI() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1185170gwl
    public final String getGroupId() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1185170gwl
    public final String getPoiId() {
        return this.LLJILJIL;
    }

    public C1184480gve(String str, String str2, String str3, String str4, String str5, C1188440h22 c1188440h22, C1185490gxH c1185490gxH, String str6, String str7, String str8, String str9, String str10, Map map, Boolean bool, PoiDetailApi.PoiDetailDataModel poiDetailDataModel, PoiAnchorExtra poiAnchorExtra, boolean z, String str11, int i) {
        String str12;
        String str13 = str4;
        String str14 = str3;
        String str15 = str2;
        String str16 = str7;
        String str17 = str6;
        C1185490gxH c1185490gxH2 = c1185490gxH;
        C1188440h22 c1188440h222 = c1188440h22;
        String str18 = str5;
        Map map2 = map;
        Boolean bool2 = bool;
        String str19 = str10;
        String str20 = str9;
        String str21 = str8;
        String str22 = str11;
        boolean z2 = z;
        PoiAnchorExtra poiAnchorExtra2 = poiAnchorExtra;
        PoiDetailApi.PoiDetailDataModel poiDetailDataModel2 = poiDetailDataModel;
        String str23 = (i & 1) != 0 ? null : str;
        str15 = (i & 2) != 0 ? null : str15;
        str14 = (i & 4) != 0 ? null : str14;
        str13 = (i & 8) != 0 ? null : str13;
        str18 = (i & 16) != 0 ? null : str18;
        c1188440h222 = (i & 32) != 0 ? null : c1188440h222;
        c1185490gxH2 = (i & 64) != 0 ? null : c1185490gxH2;
        str17 = (i & 128) != 0 ? null : str17;
        str16 = (i & 256) != 0 ? null : str16;
        str21 = (i & 512) != 0 ? null : str21;
        str20 = (i & 1024) != 0 ? null : str20;
        str19 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str19;
        map2 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : map2;
        bool2 = (i & 8192) != 0 ? null : bool2;
        poiDetailDataModel2 = (i & 16384) != 0 ? null : poiDetailDataModel2;
        poiAnchorExtra2 = (32768 & i) != 0 ? null : poiAnchorExtra2;
        z2 = (65536 & i) != 0 ? false : z2;
        str22 = (131072 & i) != 0 ? null : str22;
        if ((i & 262144) != 0) {
            str12 = "PoiVideoDetailHierarchyData";
        } else {
            str12 = null;
        }
        this.LL = str23;
        this.LLILLJJLI = str15;
        this.LLILLL = str14;
        this.LLILZ = str13;
        this.LLILZIL = str18;
        this.LLILZLL = c1188440h222;
        this.LLIZ = c1185490gxH2;
        this.LLIZLLLIL = str17;
        this.LLJ = str16;
        this.LLJI = str21;
        this.LLJIJIL = str20;
        this.LLJILJIL = str19;
        this.LLJILJILJ = map2;
        this.LLJILLL = bool2;
        this.LLJJ = poiDetailDataModel2;
        this.LLJJI = poiAnchorExtra2;
        this.LLJJIII = z2;
        this.LLJJIJI = str22;
        this.LLJJIJIIJIL = str12;
    }
}
