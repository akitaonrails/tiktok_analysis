package Y;

import X.C1172210gbr;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1189060h32;
import X.C1189680h42;
import X.C1194140hBE;
import X.C1194160hBG;
import X.C1558360qeg;
import X.C2188811AlT;
import X.C946803n0;
import X.InterfaceC1172180gbo;
import X.InterfaceC1172200gbq;
import X.InterfaceC1194150hBF;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes19.dex */
public class ACListenerS47S0201000_18 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS47S0201000_18 aCListenerS47S0201000_18, View view) {
        String str;
        Object obj;
        String str2;
        String str3;
        InterfaceC1194150hBF interfaceC1194150hBF = ((C1194140hBE) aCListenerS47S0201000_18.l0).LL;
        PoiActivityApi.PoiBannerInfo poiBannerInfo = (PoiActivityApi.PoiBannerInfo) aCListenerS47S0201000_18.l1;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (poiBannerInfo != null) {
            str = poiBannerInfo.activityId;
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        interfaceC1194150hBF.LIZIZ(str);
        C1189680h42 c1189680h42 = C1189680h42.LIZ;
        String str5 = "poi_detail";
        if (((C1194140hBE) aCListenerS47S0201000_18.l0).LLILLJJLI) {
            obj = "poi_detail";
        } else {
            obj = "add_location";
        }
        PoiActivityApi.PoiBannerInfo poiBannerInfo2 = (PoiActivityApi.PoiBannerInfo) aCListenerS47S0201000_18.l1;
        if (poiBannerInfo2 == null || (str2 = poiBannerInfo2.activityId) == null) {
            str2 = "";
        }
        Integer numValueOf = Integer.valueOf(aCListenerS47S0201000_18.i2 + 1);
        C1194140hBE c1194140hBE = (C1194140hBE) aCListenerS47S0201000_18.l0;
        String str6 = c1194140hBE.LLILLL;
        String str7 = c1194140hBE.LLILZ;
        Fragment fragmentLIZ = C946803n0.LIZ(c1194140hBE);
        if (fragmentLIZ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ, null);
        }
        PageFinder pageFinderVia = PageFinder.via((View) aCListenerS47S0201000_18.l0);
        c1189680h42.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", obj);
        linkedHashMap.put("challenge_id", str2);
        if (numValueOf != null) {
            numValueOf.intValue();
            linkedHashMap.put("banner_index", numValueOf.toString());
        }
        if (str6 != null) {
            linkedHashMap.put("poi_id", str6);
        }
        C1189060h32.LIZ(str7, linkedHashMap);
        if (interfaceC665370Q7zLJFF != null) {
            C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJFF);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("campaign_banner_close_click", linkedHashMap, c1185050gwZ);
        PoiActivityApi.PoiBannerInfo poiBannerInfo3 = (PoiActivityApi.PoiBannerInfo) aCListenerS47S0201000_18.l1;
        if (poiBannerInfo3 != null && (str3 = poiBannerInfo3.activityId) != null) {
            str4 = str3;
        }
        if (!((C1194140hBE) aCListenerS47S0201000_18.l0).LLILLJJLI) {
            str5 = "add_location";
        }
        Keva kevaLJFF = C1194160hBG.LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_activity_click_close_");
        sbLIZ.append(str4);
        sbLIZ.append('_');
        sbLIZ.append(str5);
        kevaLJFF.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("mark close, scene: ");
        sbLIZ2.append(str5);
        sbLIZ2.append(", id: ");
        sbLIZ2.append(str4);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final void onClick$1(ACListenerS47S0201000_18 aCListenerS47S0201000_18, View view) {
        InterfaceC1172180gbo interfaceC1172180gbo = ((C1172210gbr) aCListenerS47S0201000_18.l0).LLILLJJLI;
        if (interfaceC1172180gbo != null) {
            interfaceC1172180gbo.LIZIZ((InterfaceC1172200gbq) aCListenerS47S0201000_18.l1, aCListenerS47S0201000_18.i2);
        }
    }

    public ACListenerS47S0201000_18(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
