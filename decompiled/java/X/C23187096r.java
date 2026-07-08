package X;

import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.ImageInfoList;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.params.NLEModelRequestConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.096r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23187096r {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public final List<MetaExt> LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final List<String> LJIIIIZZ;
    public List<ImageInfoList> LJIIIZ;
    public final boolean LJIIJ;
    public String LJIIJJI;
    public final int LJIIL;
    public final Map<String, String> LJIILIIL;
    public final int LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;

    public C23187096r() {
        this(0, null, null, null, false, false, false, 0, null, 0, null, null, 2097151);
    }

    public final String LIZ() {
        NLEModelRequestConfig nLEModelRequestConfig = new NLEModelRequestConfig("", "", new ArrayList(), new ArrayList(), true, true, false, false);
        List<ImageInfoList> list = this.LJIIIZ;
        if (list != null) {
            nLEModelRequestConfig.setImageInfoList(new ArrayList(list));
        }
        nLEModelRequestConfig.setReturnNleConfig(this.LJI);
        nLEModelRequestConfig.setReturnMovieConfig(this.LJII);
        nLEModelRequestConfig.setUseResourceId(this.LJFF);
        List<String> arrayList = this.LJIIIIZZ;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        nLEModelRequestConfig.setCacheEffectList(arrayList);
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(nLEModelRequestConfig);
        return strLJI == null ? "" : strLJI;
    }

    public C23187096r(int i, String str, String str2, List list, boolean z, boolean z2, boolean z3, int i2, Map map, int i3, String str3, String str4, int i4) {
        String str5;
        List arrayList = list;
        String str6 = str2;
        String str7 = str;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        int i5 = i3;
        Map mapLJ = map;
        int i6 = i2;
        String str8 = str4;
        String str9 = str3;
        int i7 = (i4 & 2) != 0 ? 0 : i;
        str7 = (i4 & 4) != 0 ? "" : str7;
        str6 = (i4 & 64) != 0 ? "" : str6;
        if ((i4 & 128) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        arrayList = (i4 & 256) != 0 ? new ArrayList() : arrayList;
        z6 = (i4 & 512) != 0 ? false : z6;
        z5 = (i4 & 1024) != 0 ? true : z5;
        z4 = (i4 & 16384) != 0 ? false : z4;
        String str10 = (32768 & i4) == 0 ? null : "";
        i6 = (65536 & i4) != 0 ? 0 : i6;
        mapLJ = (131072 & i4) != 0 ? C2097608Jq.LJ() : mapLJ;
        i5 = (262144 & i4) != 0 ? 0 : i5;
        str9 = (524288 & i4) != 0 ? null : str9;
        str8 = (i4 & 1048576) != 0 ? null : str8;
        this.LIZ = i7;
        this.LIZIZ = str7;
        this.LIZJ = str6;
        this.LIZLLL = str5;
        this.LJ = arrayList;
        this.LJFF = z6;
        this.LJI = z5;
        this.LJII = false;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = z4;
        this.LJIIJJI = str10;
        this.LJIIL = i6;
        this.LJIILIIL = mapLJ;
        this.LJIILJJIL = i5;
        this.LJIILL = str9;
        this.LJIILLIIL = str8;
    }
}
