package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mL9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392490mL9 extends C09AY implements Function1<C1361920lXq, Unit> {
    public final /* synthetic */ C1392530mLD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392490mL9(C1392530mLD c1392530mLD) {
        super(1);
        this.LL = c1392530mLD;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1361920lXq c1361920lXq) {
        C2344009Gk c2344009GkLJ;
        ArrayList arrayList;
        Map<String, String> mapInvoke;
        Aweme awemeLJJLIIIJJIZ;
        Function0<? extends Map<String, String>> function0;
        String componentKey;
        C1361920lXq c1361920lXq2 = c1361920lXq;
        InterfaceC712540RxE host = c1361920lXq2.getHost();
        if (host != null && (host instanceof InterfaceC1393560mMs)) {
            if (c1361920lXq2.LIZLLL) {
                c2344009GkLJ = this.LL.LJ((InterfaceC1393560mMs) host);
            } else {
                c2344009GkLJ = (C2344009Gk) this.LL.LLILZLL.getValue();
            }
            InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) host;
            List<String> listLIZ = interfaceC1393560mMs.LJII().LIZ();
            String str = null;
            if (listLIZ != null) {
                arrayList = new ArrayList();
                for (String str2 : listLIZ) {
                    if (u.LJJIIJZLJL(str2, "anchor_", false)) {
                        arrayList.add(str2);
                    }
                }
            } else {
                arrayList = null;
            }
            List<InterfaceC1393560mMs> listLJI = this.LL.LJI();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJI, 10));
            Iterator<InterfaceC1393560mMs> it2 = listLJI.iterator();
            while (it2.hasNext()) {
                AnchorCommonStruct anchorCommonStructData = it2.next().data();
                if (anchorCommonStructData == null || (componentKey = anchorCommonStructData.getComponentKey()) == null) {
                    componentKey = "";
                }
                arrayList2.add(componentKey);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (arrayList != null && arrayList.contains(obj)) {
                    arrayList3.add(obj);
                }
            }
            C1392530mLD c1392530mLD = this.LL;
            C1400390mXt anchorMobConfiguration = interfaceC1393560mMs.getAnchorMobConfiguration();
            if (anchorMobConfiguration != null && (function0 = anchorMobConfiguration.LIZIZ) != null) {
                mapInvoke = function0.invoke();
            } else {
                mapInvoke = null;
            }
            c1392530mLD.getClass();
            c2344009GkLJ.LJII(mapInvoke);
            c2344009GkLJ.LJIIIIZZ("click_method", c1361920lXq2.LIZJ);
            c2344009GkLJ.LJIIIIZZ("should_preload_list", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62));
            Map<String, String> map = c2344009GkLJ.LIZ;
            C735840Sti c735840Sti = C735840Sti.LIZ;
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL.LL;
            if (interfaceC1392640mLO != null) {
                awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
            } else {
                awemeLJJLIIIJJIZ = null;
            }
            c735840Sti.getClass();
            C735840Sti.LIZIZ(awemeLJJLIIIJJIZ, map);
            if (map != null) {
                str = (String) ((HashMap) map).get("enter_from");
            }
            C1205210hT5.LIZ(null, map, str, "multi_anchor_entrance_show");
            JSONObject jSONObjectLIZJ = C1065330dpT.LIZJ(map);
            this.LL.LJIIJ(jSONObjectLIZJ);
            C20684815ws.LJIJ("multi_anchor_entrance_click", jSONObjectLIZJ);
        }
        return Unit.LIZ;
    }
}
