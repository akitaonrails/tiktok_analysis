package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mL8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392480mL8 extends C09AY implements Function1<C1357620lQu, Unit> {
    public final /* synthetic */ C1392530mLD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392480mL8(C1392530mLD c1392530mLD) {
        super(1);
        this.LL = c1392530mLD;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1357620lQu c1357620lQu) {
        C2344009Gk c2344009GkLJ;
        ArrayList arrayList;
        C2344009Gk c2344009Gk;
        Map<String, String> mapInvoke;
        Function0<? extends Map<String, String>> function0;
        String componentKey;
        C1357620lQu c1357620lQu2 = c1357620lQu;
        InterfaceC712540RxE host = c1357620lQu2.getHost();
        if (host != null && (host instanceof InterfaceC1393560mMs)) {
            if (c1357620lQu2.LIZJ) {
                c2344009GkLJ = this.LL.LJ((InterfaceC1393560mMs) host);
            } else {
                c2344009GkLJ = (C2344009Gk) this.LL.LLILZLL.getValue();
            }
            InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) host;
            List<String> listLIZ = interfaceC1393560mMs.LJII().LIZ();
            Aweme awemeLJJLIIIJJIZ = null;
            if (listLIZ != null) {
                arrayList = new ArrayList();
                for (String str : listLIZ) {
                    if (u.LJJIIJZLJL(str, "anchor_", false)) {
                        arrayList.add(str);
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
            C735840Sti c735840Sti = C735840Sti.LIZ;
            if (c2344009GkLJ != null) {
                C1392530mLD c1392530mLD = this.LL;
                C1400390mXt anchorMobConfiguration = interfaceC1393560mMs.getAnchorMobConfiguration();
                if (anchorMobConfiguration != null && (function0 = anchorMobConfiguration.LIZ) != null) {
                    mapInvoke = function0.invoke();
                } else {
                    mapInvoke = null;
                }
                c1392530mLD.getClass();
                c2344009GkLJ.LJII(mapInvoke);
                c2344009Gk = c2344009GkLJ;
            } else {
                c2344009Gk = null;
            }
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL.LL;
            if (interfaceC1392640mLO != null) {
                awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
            }
            c735840Sti.getClass();
            C735840Sti.LIZIZ(awemeLJJLIIIJJIZ, c2344009Gk);
            C1205210hT5.LIZ(null, c2344009GkLJ, c2344009GkLJ.LJIIIZ("enter_from"), "multi_anchor_entrance_show");
            c2344009GkLJ.LJFF("should_preload_list", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62));
            C1893310zMv.LIZIZ.LJI(PageFinder.via(this.LL.LL.LJ()), c2344009GkLJ, "multi_anchor_entrance_show");
            JSONObject jSONObjectLIZLLL = C1065330dpT.LIZLLL(c2344009GkLJ);
            this.LL.LJIIJ(jSONObjectLIZLLL);
            C20684815ws.LJIJ("multi_anchor_entrance_show", jSONObjectLIZLLL);
        }
        return Unit.LIZ;
    }
}
