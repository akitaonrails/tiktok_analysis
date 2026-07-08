package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0grT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181890grT {
    public static final PoiListApi.PoiDetailResponse LIZ(Fragment fragment) {
        C1185600gxS c1185600gxS;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility;
        PoiListApi.PoiDetailResponse poiDetailResponseFZ1;
        if (fragment != null && (iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), IPoiDetailInfoVAbility.class, null)) != null && (poiDetailResponseFZ1 = iPoiDetailInfoVAbility.fZ1()) != null) {
            return poiDetailResponseFZ1;
        }
        C1181880grS c1181880grSLIZJ = LIZJ(fragment);
        if (c1181880grSLIZJ == null || (c1185600gxS = c1181880grSLIZJ.LIZIZ) == null) {
            return null;
        }
        return c1185600gxS.LJIIIZ;
    }

    public static final String LIZIZ(Fragment fragment) {
        C1185600gxS c1185600gxS;
        C1185410gx9 c1185410gx9;
        String enterFrom;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility;
        String strHP2;
        if (fragment == null || (iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), IPoiDetailInfoVAbility.class, null)) == null || (strHP2 = iPoiDetailInfoVAbility.HP2()) == null) {
            C1181880grS c1181880grSLIZJ = LIZJ(fragment);
            if (c1181880grSLIZJ == null || (c1185600gxS = c1181880grSLIZJ.LIZIZ) == null || (c1185410gx9 = c1185600gxS.LJFF) == null || (enterFrom = c1185410gx9.getEnterFrom()) == null) {
                return "";
            }
            return enterFrom;
        }
        return strHP2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C1181880grS LIZJ(Fragment fragment) {
        InterfaceC1181010gq3 interfaceC1181010gq3;
        C1181550gqv c1181550gqvEr2;
        if (!(fragment instanceof InterfaceC1181010gq3) || (interfaceC1181010gq3 = (InterfaceC1181010gq3) fragment) == null || (c1181550gqvEr2 = interfaceC1181010gq3.Er2()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((LinkedHashMap) c1181550gqvEr2.LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            Object value = ((Map.Entry) it2.next()).getValue();
            if (value instanceof C1181880grS) {
                arrayList.add(value);
            }
        }
        return (C1181880grS) ((InterfaceC1181670gr7) C13LP.LJJJLL(arrayList));
    }

    public static final String LIZLLL(Fragment fragment) {
        C1185600gxS c1185600gxS;
        String str;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility;
        String poiId;
        if (fragment == null || (iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), IPoiDetailInfoVAbility.class, null)) == null || (poiId = iPoiDetailInfoVAbility.getPoiId()) == null) {
            C1181880grS c1181880grSLIZJ = LIZJ(fragment);
            if (c1181880grSLIZJ == null || (c1185600gxS = c1181880grSLIZJ.LIZIZ) == null || (str = c1185600gxS.LIZ) == null) {
                return "";
            }
            return str;
        }
        return poiId;
    }
}
