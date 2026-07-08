package X;

import Y.ACListenerS124S0200000_21;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.services.external.IAnchorService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394740mOm extends AbstractC1066890drz {
    public static final C1394750mOn LLJIJIL = new C1394750mOn();
    public long LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(421));

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        Object c098200Yq;
        C1394750mOn c1394750mOn = LLJIJIL;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        String extra = anchorCommonStruct != null ? anchorCommonStruct.getExtra() : null;
        c1394750mOn.getClass();
        Object obj = "";
        if (!(extra == null || extra.length() == 0)) {
            try {
                c098200Yq = new JSONObject(extra).optString("dispatch_type");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("template_dispatch_type", obj), new Pair("tt_template_type", "autocut_algo_lyric"));
        return new C1400390mXt(new AwS565S0100000_21(mapLJIIIIZZ, (Map<String, String>) 1342), new AwS565S0100000_21(mapLJIIIIZZ, (Map<String, String>) 1343), new AwS565S0100000_21(mapLJIIIIZZ, (Map<String, String>) 1344), null, null, 24);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1394740mOm();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.LYRIC_EFFECT_ANCHOR.getTYPE();
    }

    public final void LJJIJIIJI(C2344009Gk c2344009Gk) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        C1426005i6.LIZ(c1398350mUb, "Anchor.FYP.Click", "ENTRY");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJ < 500) {
            C1426005i6.LIZ(c1398350mUb, "Anchor.FYP.Click", "SKIP-FAST-CLICK");
            return;
        }
        this.LLJ = jCurrentTimeMillis;
        LJJII(c2344009Gk, true, true);
        LJJIJ(new AwS387S0200000_21(this, c2344009Gk, 71));
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        boolean z;
        String extra;
        ArrayList arrayList = new ArrayList();
        Iterator<AnchorCommonStruct> it2 = list.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            AnchorCommonStruct next = it2.next();
            AnchorCommonStruct anchorCommonStruct = next;
            if (anchorCommonStruct.getType() == type() && anchorCommonStruct.getExtra().length() > 0) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        IAnchorService iAnchorService = (IAnchorService) this.LLJI.getValue();
        if (iAnchorService == null || !iAnchorService.enableLyricEffectAnchor()) {
            z = false;
        }
        if (!z) {
            C1426005i6.LIZJ(C1398350mUb.LIZIZ, "Anchor.FYP.Filter", "NOT-FOUND-experiment-off");
            return EnumC1050190dR3.NOT_FOUND;
        }
        C1394750mOn c1394750mOn = LLJIJIL;
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) C13LP.LJJJLL(arrayList);
        String extra2 = null;
        if (anchorCommonStruct2 != null) {
            extra2 = anchorCommonStruct2.getExtra();
        }
        c1394750mOn.getClass();
        C1394760mOo c1394760mOoLIZ = C1394750mOn.LIZ(extra2);
        if (c1394760mOoLIZ == null) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NOT-FOUND-invalid-extra extra=");
            AnchorCommonStruct anchorCommonStruct3 = (AnchorCommonStruct) C13LP.LJJJLL(arrayList);
            if (anchorCommonStruct3 == null || (extra = anchorCommonStruct3.getExtra()) == null) {
                extra = "";
            }
            sbLIZ.append(extra);
            C1426005i6.LIZJ(c1398350mUb, "Anchor.FYP.Filter", C2188811AlT.LIZIZ(sbLIZ));
            return EnumC1050190dR3.NOT_FOUND;
        }
        C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OK key=");
        sbLIZ2.append(c1394760mOoLIZ.LIZ);
        sbLIZ2.append('#');
        sbLIZ2.append(c1394760mOoLIZ.LIZIZ);
        C1426005i6.LIZ(c1398350mUb2, "Anchor.FYP.Filter", C2188811AlT.LIZIZ(sbLIZ2));
        return super.LJJJJLL(list);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        LJJIJIIJI(c2344009Gk);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        AnchorPanelAction next;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        UrlModel icon = null;
        if (anchorCommonStruct == null) {
            return null;
        }
        C1394730mOl c1394730mOlLIZ = C1066980ds8.LIZ(viewGroup.getContext());
        UrlModel thumbnail = anchorCommonStruct.getThumbnail();
        if (thumbnail != null) {
            c1394730mOlLIZ.setIcon(thumbnail);
        }
        c1394730mOlLIZ.setTitle(LIZLLL());
        c1394730mOlLIZ.setSubTitle(anchorCommonStruct.getDescription());
        C786410Ut5.ca(c1394730mOlLIZ, new ACListenerS124S0200000_21(c2344009Gk, this, 50));
        List<AnchorPanelAction> actions = anchorCommonStruct.getActions();
        if (actions != null) {
            Iterator<AnchorPanelAction> it2 = actions.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getActionType() == 1) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorPanelAction anchorPanelAction = next;
            if (anchorPanelAction != null) {
                icon = anchorPanelAction.getIcon();
            }
        }
        c1394730mOlLIZ.setButtonIcon(icon);
        c1394730mOlLIZ.setButtonOnClickListener(new AwS387S0200000_21(this, c2344009Gk, 70));
        viewGroup.addView(c1394730mOlLIZ);
        return c1394730mOlLIZ;
    }
}
