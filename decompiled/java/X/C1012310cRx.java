package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.component.livepincardcomponent.AnoleLivePinCardModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0cRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012310cRx {
    public static final void LIZ(C1012320cRy c1012320cRy) {
        Long lValueOf;
        InterfaceC1014270cV7 interfaceC1014270cV7 = c1012320cRy.LLILLL;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair(EnumC1005330cGh.ENTER_FROM.getRName(), 98);
        String rName = EnumC1005330cGh.REFER.getRName();
        String refer = c1012320cRy.LL.getRefer();
        if (refer == null) {
            refer = "card";
        }
        pairArr[1] = new Pair(rName, refer);
        String rName2 = EnumC1005330cGh.TAG.getRName();
        String tag = c1012320cRy.LL.getTag();
        if (tag == null) {
            tag = "draw_ad";
        }
        pairArr[2] = new Pair(rName2, tag);
        pairArr[3] = new Pair(EnumC1005330cGh.REPORT_CLICK.getRName(), Boolean.TRUE);
        String rName3 = EnumC1005330cGh.AD_EXTRA_DATA.getRName();
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = new Pair("component_id", Long.valueOf(c1012320cRy.LL.getID()));
        pairArr2[1] = new Pair("component_type", c1012320cRy.LL.type);
        AnoleModel anoleModel = c1012320cRy.LLILLJJLI.LIZLLL.getAnoleModel();
        if (anoleModel != null) {
            lValueOf = Long.valueOf(anoleModel.templateID);
        } else {
            lValueOf = null;
        }
        pairArr2[2] = new Pair("template_id", lValueOf);
        pairArr[4] = new Pair(rName3, C2097608Jq.LJIIJ(pairArr2));
        interfaceC1014270cV7.LJIJ(new C991670buf(C2097608Jq.LJIIJ(pairArr)), c1012320cRy);
    }

    public static final void LIZIZ(C1012320cRy c1012320cRy) {
        Map<String, Object> map;
        Object obj;
        Long lLJIILIIL;
        InterfaceC1012330cRz interfaceC1012330cRzF4;
        AnoleLivePinCardModel anoleLivePinCardModelLJJ = c1012320cRy.LJJ();
        if (anoleLivePinCardModelLJJ != null && (map = anoleLivePinCardModelLJJ.subPinCard) != null && (obj = map.get(FollowStatusChangeMethod.PARAM_UID)) != null) {
            if (obj instanceof Number) {
                lLJIILIIL = Long.valueOf(((Number) obj).longValue());
            } else if (!(obj instanceof String)) {
                return;
            } else {
                lLJIILIIL = C2095008Iq.LJIILIIL((String) obj);
            }
            if (lLJIILIIL != null) {
                long jLongValue = lLJIILIIL.longValue();
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null && (interfaceC1012330cRzF4 = iLiveOuterService.F4()) != null) {
                    interfaceC1012330cRzF4.LIZ(jLongValue, (InterfaceC1107240ev4) c1012320cRy.LLJZIJLIL.getValue());
                }
            }
        }
    }
}
