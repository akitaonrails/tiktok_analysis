package X;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: renamed from: X.0ds7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1066970ds7 extends AbstractC1066890drz {
    public long LLJ;

    public abstract boolean LJJIJIL();

    public abstract void LJJIJL(View view, C2344009Gk c2344009Gk, String str);

    public final void LJJIJIIJIL() {
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("main_anchor_type", ((C1065100dp6) LJJJJJL()).LJ());
            Aweme awemeLJIIZILJ = LJIIZILJ();
            c2344009Gk.LJIIIIZZ("group_id", awemeLJIIZILJ != null ? awemeLJIIZILJ.getGroupId() : null);
            C20684815ws.LJIILLIIL("enter_creation_anchor_detail", c2344009Gk.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static boolean LJJIJIIJI(AbstractC1066970ds7 abstractC1066970ds7) {
        String id;
        abstractC1066970ds7.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - abstractC1066970ds7.LLJ < 1000) {
            C823920WTu c823920WTu = C823920WTu.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isFastClick, id=");
            AnchorCommonStruct anchorCommonStruct = abstractC1066970ds7.LLIZ;
            if (anchorCommonStruct != null) {
                id = anchorCommonStruct.getId();
            } else {
                id = null;
            }
            sbLIZ.append(id);
            C201955140j.LJIJI(c823920WTu, C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        abstractC1066970ds7.LLJ = jCurrentTimeMillis;
        return false;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJJJI(SmartImageView smartImageView) {
        LJJIIZI(smartImageView, new AwS417S0200000_16(this, smartImageView, 54));
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public void p1(C2344009Gk c2344009Gk) {
        super.p1(c2344009Gk);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        LJJIJL(view, c2344009Gk, "anchor");
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        Object c098200Yq;
        String strLJIL;
        AnchorPanelAction next;
        k kVarLJJIIZ;
        UrlModel thumbnail;
        List<String> urlList;
        UrlModel thumbnail2;
        List<String> urlList2;
        String str;
        String str2 = "";
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        UrlModel icon = null;
        if (anchorCommonStruct == null) {
            return null;
        }
        C1394730mOl c1394730mOlLIZ = C1066980ds8.LIZ(viewGroup.getContext());
        if (anchorCommonStruct.getThumbnail() != null && (thumbnail = anchorCommonStruct.getThumbnail()) != null && (urlList = thumbnail.getUrlList()) != null && !urlList.isEmpty() && (thumbnail2 = anchorCommonStruct.getThumbnail()) != null && (urlList2 = thumbnail2.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList2)) != null && str.length() != 0) {
            UrlModel thumbnail3 = anchorCommonStruct.getThumbnail();
            if (thumbnail3 != null) {
                c1394730mOlLIZ.setIcon(thumbnail3);
            }
        } else {
            UrlModel icon2 = anchorCommonStruct.getIcon();
            if (icon2 != null) {
                c1394730mOlLIZ.setIcon(icon2);
            }
        }
        try {
            new p();
            String extra = anchorCommonStruct.getExtra();
            if (extra == null) {
                extra = "";
            }
            c098200Yq = p.LIZJ(extra).LJIILIIL();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        n nVar = (n) c098200Yq;
        if (nVar == null || (kVarLJJIIZ = nVar.LJJIIZ("title")) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
            strLJIL = "";
        }
        String description = anchorCommonStruct.getDescription();
        if (description != null) {
            str2 = description;
        }
        c1394730mOlLIZ.setSubTitle(str2);
        c1394730mOlLIZ.setTitle(strLJIL);
        C786410Ut5.I7(new C1077250e8h(this, c2344009Gk, 0), c1394730mOlLIZ);
        if (LJJIJIL()) {
            c1394730mOlLIZ.LIZIZ(true);
        } else {
            c1394730mOlLIZ.LIZIZ(false);
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
        }
        c1394730mOlLIZ.setButtonOnClickListener(new AwS382S0200000_16(this, c2344009Gk, 65));
        viewGroup.addView(c1394730mOlLIZ);
        return c1394730mOlLIZ;
    }
}
