package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mLY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392740mLY extends AbstractC1394010mNb {
    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final String LIZLLL() {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) {
            keyword = "";
        }
        return (keyword.length() <= 0 || !a0.LJJJIL(keyword)) ? keyword : C20642515q3.LJI(2131857993);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1392740mLY();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.MV_TEMPLATE.getTYPE();
    }

    @Override // X.AbstractC1394010mNb, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        AnchorCommonStruct next;
        List<AnchorPanelAction> actions;
        if (C298890Bnb.LIZ() && C298980Bnk.LIZ()) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        Iterator<AnchorCommonStruct> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getType() == type()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct = next;
        if (anchorCommonStruct == null) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        EnumC1412640mre enumC1412640mreLIZ = C1394480mOM.LIZ(anchorCommonStruct);
        if (enumC1412640mreLIZ == null) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        C1392420mL2.LIZ.getClass();
        if (!C1392420mL2.LIZIZ.contains(enumC1412640mreLIZ)) {
            return super.LJJJJLL(list);
        }
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        if (C1392750mLZ.LIZ(this.LLIZ, interfaceC1392640mLO2.LJJLIIIJJIZ()) && awemeLJJLIIIJJIZ.getAwemeType() != 61) {
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct2 : list) {
                AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct2;
                if (anchorCommonStruct3.getType() == type() && (actions = anchorCommonStruct3.getActions()) != null) {
                    Iterator<AnchorPanelAction> it3 = actions.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            AnchorPanelAction next2 = it3.next();
                            if (next2.getActionType() == 1) {
                                if (next2 != null) {
                                    arrayList.add(anchorCommonStruct2);
                                }
                            }
                        }
                    }
                }
            }
            if (arrayList.size() == 0) {
                return EnumC1050190dR3.NOT_FOUND;
            }
            AnchorCommonStruct anchorCommonStruct4 = (AnchorCommonStruct) C13LP.LJJJJZI(arrayList);
            LJIILIIL(anchorCommonStruct4);
            list.remove(anchorCommonStruct4);
            this.LLIZ = anchorCommonStruct4;
            LJJIJIIJI();
            if (enumC1412640mreLIZ == EnumC1412640mre.CUT_SAME) {
                C1392420mL2 c1392420mL2 = C1392420mL2.LIZ;
                AnchorCommonStruct anchorCommonStruct5 = this.LLIZ;
                TemplateScene templateScene = TemplateScene.AUTO_CUT;
                c1392420mL2.getClass();
                EnumC1050190dR3 enumC1050190dR3LIZ = C1392420mL2.LIZ(anchorCommonStruct5, templateScene);
                EnumC1050190dR3 enumC1050190dR3 = EnumC1050190dR3.NOT_FOUND;
                if (enumC1050190dR3LIZ == enumC1050190dR3) {
                    return enumC1050190dR3;
                }
            }
            if (arrayList.size() > 1) {
                return EnumC1050190dR3.PROCEED;
            }
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.NOT_FOUND;
    }
}
