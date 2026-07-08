package X;

import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0n0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418200n0c {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final C0MJ9 LJI;
    public final List<AutoCutMediaModel> LJII;
    public final AutoCutThemeData LJIIIIZZ;
    public final AutoCutThemeData LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final CreativeInfo LJIIL;
    public final boolean LJIILIIL;
    public final EnumC1418280n0k LJIILJJIL;
    public final Map<String, Object> LJIILL;
    public final List<InterfaceC1418260n0i> LJIILLIIL;

    public final String toString() {
        return "AutoCutProcessConfig(needRecommendMusic=" + this.LIZ + ", needRecommendNLEModel=" + this.LIZIZ + ", needDownloadMusic=" + this.LIZJ + ", recommendMusicNum=" + this.LIZLLL + ", useCommerceMusic=" + this.LJ + ", autoCutIndex=" + this.LJFF + ", autoCutSource=" + this.LJI + ", mediaModelList=" + this.LJII + ", presetTheme=" + this.LJIIIIZZ + ", targetTheme=" + this.LJIIIZ + ", taskId=" + this.LJIIJ + ", soundSyncMode=" + this.LJIIJJI + ", creativeInfo=" + this.LJIIL + ", ignoreCompress=" + this.LJIILIIL + ", entrancePage=" + this.LJIILJJIL + ", extraExtension=" + this.LJIILL + ", callbacks=" + this.LJIILLIIL + ')';
    }

    public C1418200n0c(boolean z, boolean z2, boolean z3, boolean z4, int i, C0MJ9 c0mj9, List list, AutoCutThemeData autoCutThemeData, AutoCutThemeData autoCutThemeData2, String str, CreativeInfo creativeInfo, boolean z5, EnumC1418280n0k enumC1418280n0k, Map map, int i2) {
        int i3;
        int i4 = i;
        C0MJ9 c0mj92 = c0mj9;
        AutoCutThemeData autoCutThemeData3 = autoCutThemeData;
        String str2 = str;
        AutoCutThemeData autoCutThemeData4 = autoCutThemeData2;
        Map map2 = map;
        boolean z6 = z5;
        if ((i2 & 8) != 0) {
            s sVar = s.LIZ;
            i3 = 15;
        } else {
            i3 = 0;
        }
        i4 = (i2 & 32) != 0 ? 0 : i4;
        c0mj92 = (i2 & 64) != 0 ? C0MJ9.AUTO_CUT : c0mj92;
        autoCutThemeData3 = (i2 & 256) != 0 ? null : autoCutThemeData3;
        autoCutThemeData4 = (i2 & 512) != 0 ? null : autoCutThemeData4;
        str2 = (i2 & 1024) != 0 ? null : str2;
        z6 = (i2 & 8192) != 0 ? false : z6;
        map2 = (32768 & i2) != 0 ? null : map2;
        ArrayList arrayList = (i2 & 65536) != 0 ? new ArrayList(C13BV.INSTANCE) : null;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = i3;
        this.LJ = z4;
        this.LJFF = i4;
        this.LJI = c0mj92;
        this.LJII = list;
        this.LJIIIIZZ = autoCutThemeData3;
        this.LJIIIZ = autoCutThemeData4;
        this.LJIIJ = str2;
        this.LJIIJJI = false;
        this.LJIIL = creativeInfo;
        this.LJIILIIL = z6;
        this.LJIILJJIL = enumC1418280n0k;
        this.LJIILL = map2;
        this.LJIILLIIL = arrayList;
    }
}
