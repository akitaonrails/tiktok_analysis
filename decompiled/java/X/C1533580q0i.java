package X;

import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0q0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533580q0i {
    public final String LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final GeckoConfig LJI;
    public final Map<String, GeckoConfig> LJII;
    public final Object LJIIIIZZ;
    public final Object LJIIIZ;

    public C1533580q0i() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{[host]=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",[region]=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(",[prefix]=");
        Object[] array = this.LIZJ.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sbLIZ.append(Arrays.toString(array));
        sbLIZ.append(",[appId]=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(",[appVersion]=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(",[did]=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1533580q0i(List list, GeckoConfig geckoConfig, C20116913nT c20116913nT) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = list;
        this.LIZLLL = "";
        this.LJ = "";
        this.LJFF = "";
        this.LJI = geckoConfig;
        this.LJII = linkedHashMap;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        new ArrayList();
    }
}
