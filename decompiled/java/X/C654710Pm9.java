package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Pm9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654710Pm9 {
    public static final C654710Pm9 LIZ = new C654710Pm9();

    public static void LIZ(Aweme aweme, ISearchContextAbility iSearchContextAbility) {
        String strLIZ;
        String str;
        String string;
        String str2 = null;
        C654740PmC c654740PmC = new C654740PmC(null);
        String str3 = "";
        if (iSearchContextAbility != null) {
            C0PRC c0prc = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
            c654740PmC.LJJIIZI(c0prc.LLILLL);
            c654740PmC.LJIIZILJ("search_keyword", c0prc.LLIZLLLIL);
            C646370PWx c646370PWx = (C646370PWx) iSearchContextAbility.wO2().LIZJ();
            c654740PmC.LJIJJ(c646370PWx.LLILLL);
            Integer num = c646370PWx.LLJILJIL;
            if (num == null || (string = num.toString()) == null) {
                string = "";
            }
            c654740PmC.LJ("universal_rank", string);
        }
        if (aweme != null) {
            strLIZ = C436190H8n.LIZ(aweme);
        } else {
            strLIZ = null;
        }
        c654740PmC.LJJIJIIJI(strLIZ);
        LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C660800Pvy.LIZ.getClass();
        PoiDataStruct poiDataStructLIZ = C660800Pvy.LIZ(aweme);
        linkedHashMap.put("anchor_outreach_type", "1");
        if (poiDataStructLIZ != null && (str = poiDataStructLIZ.poiId) != null) {
            str3 = str;
        }
        linkedHashMap.put("poi_id", str3);
        if (poiDataStructLIZ != null) {
            str2 = poiDataStructLIZ.collectInfo;
        }
        C186700nh.LIZ(str2, linkedHashMap);
        c654740PmC.LJIJ(linkedHashMap);
        C645930PVf.LIZ(c654740PmC);
        c654740PmC.LJIILJJIL();
    }
}
