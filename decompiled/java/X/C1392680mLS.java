package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0mLS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392680mLS extends AbstractC1394010mNb {
    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1392680mLS();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ANCHOR_AIGT_TEMPLATE.getTYPE();
    }

    @Override // X.AbstractC1394010mNb, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        TemplateScene templateScene;
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        list.removeAll(arrayList2);
        if (arrayList2.isEmpty()) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) C13LP.LJJJJZI(arrayList2);
        this.LLIZ = anchorCommonStruct2;
        C1392420mL2 c1392420mL2 = C1392420mL2.LIZ;
        if (C298890Bnb.LIZ()) {
            templateScene = TemplateScene.AUTO_CUT;
        } else {
            templateScene = TemplateScene.TEMPLATE_TAB;
        }
        c1392420mL2.getClass();
        EnumC1050190dR3 enumC1050190dR3LIZ = C1392420mL2.LIZ(anchorCommonStruct2, templateScene);
        EnumC1050190dR3 enumC1050190dR3 = EnumC1050190dR3.NOT_FOUND;
        if (enumC1050190dR3LIZ == enumC1050190dR3) {
            return enumC1050190dR3;
        }
        if (C298980Bnk.LIZ() && !C0AYL.LIZ(Integer.valueOf(type()))) {
            return enumC1050190dR3;
        }
        return super.LJJJJLL(arrayList2);
    }
}
