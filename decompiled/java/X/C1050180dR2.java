package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.anchor.service.CommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0dR2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050180dR2 extends AbstractC1066890drz {
    public final C01GW LLJ = C452501pT.LIZIZ(new C1050150dQz(this));

    public final InterfaceC1050170dR1 LJJIJIIJI() {
        return (InterfaceC1050170dR1) this.LLJ.getValue();
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1050180dR2();
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return LJJIJIIJI().o2();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (anchorCommonStruct2.getBizGroup() == 1 && CommerceAnchorService.LJIILL().LJIIJ(anchorCommonStruct2)) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct3 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct3);
        LJIILIIL(anchorCommonStruct3);
        this.LLIZ = anchorCommonStruct3;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LLLIZZ(Aweme aweme) {
        LJJIJIIJI().LLLIZZ(aweme);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        LJJIJIIJI().p1(c2344009Gk);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String str;
        InterfaceC1050170dR1 interfaceC1050170dR1LJJIJIIJI = LJJIJIIJI();
        if (view instanceof C1394720mOk) {
            str = "anchor_panel";
        } else {
            str = "video_anchor";
        }
        interfaceC1050170dR1LJJIJIIJI.bn1(view, c2344009Gk, str);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void yg(Activity activity, Dialog dialog) {
        LJJIJIIJI().yg(activity, dialog);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void It(View view, Aweme aweme, boolean z) {
        LJJIJIIJI().It(view, aweme, z);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLIIL(C712520RxC c712520RxC, Dialog dialog, boolean z, boolean z2, boolean z3) {
        LJJIJIIJI().go2(dialog, z, z2, z3);
    }
}
