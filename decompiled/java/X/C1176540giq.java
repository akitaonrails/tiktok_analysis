package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailFilterAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedFilterOption;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0giq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176540giq extends C09AY implements Function2<UIAssem, Map<C1176550gir, ? extends List<? extends PoiFeedFilterOption>>, Unit> {
    public final /* synthetic */ PoiMapDetailFilterAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176540giq(PoiMapDetailFilterAssem poiMapDetailFilterAssem) {
        super(2);
        this.LL = poiMapDetailFilterAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Map<C1176550gir, ? extends List<? extends PoiFeedFilterOption>> map) {
        String strLJJLIIIJ;
        Map<C1176550gir, ? extends List<? extends PoiFeedFilterOption>> map2 = map;
        if (map2 != null) {
            PoiMapDetailFilterAssem poiMapDetailFilterAssem = this.LL;
            for (Map.Entry<C1176550gir, ? extends List<? extends PoiFeedFilterOption>> entry : map2.entrySet()) {
                C1176550gir key = entry.getKey();
                List<? extends PoiFeedFilterOption> value = entry.getValue();
                if (C1176530gip.LIZ(value)) {
                    C19M4 c19m4 = (C19M4) ((LinkedHashMap) poiMapDetailFilterAssem.LLJIJIL).get(Integer.valueOf(key.LIZ));
                    if (c19m4 != null) {
                        if (value == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(value, null, null, null, 0, null, AFwS256S0000000_18.get$arr$(6), 31)) == null) {
                            strLJJLIIIJ = key.LIZIZ;
                        }
                        poiMapDetailFilterAssem.No(c19m4, strLJJLIIIJ);
                    }
                } else {
                    C19M4 c19m42 = (C19M4) ((LinkedHashMap) poiMapDetailFilterAssem.LLJIJIL).get(Integer.valueOf(key.LIZ));
                    if (c19m42 != null) {
                        poiMapDetailFilterAssem.So(c19m42, key.LIZIZ);
                    }
                }
            }
        } else {
            PoiMapDetailFilterAssem poiMapDetailFilterAssem2 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("selectedPoiFeedFilterOptions is null,otherFilterChips:");
            sbLIZ.append(poiMapDetailFilterAssem2.LLJIJIL);
            C2188811AlT.LIZIZ(sbLIZ);
            for (Map.Entry entry2 : ((LinkedHashMap) poiMapDetailFilterAssem2.LLJIJIL).entrySet()) {
                String str = (String) ((LinkedHashMap) poiMapDetailFilterAssem2.LLJILJIL).get(entry2.getKey());
                if (str != null) {
                    poiMapDetailFilterAssem2.So((C19M4) entry2.getValue(), str);
                }
            }
        }
        if (this.LL.Jo().LLILLJJLI) {
            PoiMapDetailFilterAssem poiMapDetailFilterAssem3 = this.LL;
            if (!Intrinsics.LJFF(poiMapDetailFilterAssem3.LLJJIJIL, poiMapDetailFilterAssem3.Jo().xQ2())) {
                this.LL.Lo().zQ2();
            }
        }
        PoiMapDetailFilterAssem poiMapDetailFilterAssem4 = this.LL;
        poiMapDetailFilterAssem4.LLJJIJIL = poiMapDetailFilterAssem4.Jo().xQ2();
        return Unit.LIZ;
    }
}
