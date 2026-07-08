package X;

import Y.ACListenerS124S0200000_21;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS387S0200000_21;

/* JADX INFO: renamed from: X.0mNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1394010mNb extends AbstractC1066890drz {
    public InterfaceC1394050mNf LLJ;

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI() {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1394010mNb.LJJIJIIJI():void");
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        C1400390mXt c1400390mXtO2;
        AnchorCommonStruct anchorCommonStruct;
        if (!C298980Bnk.LIZ()) {
            InterfaceC1394050mNf interfaceC1394050mNf = this.LLJ;
            if (interfaceC1394050mNf != null) {
                return interfaceC1394050mNf.o2();
            }
            return null;
        }
        InterfaceC1394050mNf interfaceC1394050mNf2 = this.LLJ;
        if (interfaceC1394050mNf2 == null || (c1400390mXtO2 = interfaceC1394050mNf2.o2()) == null || (anchorCommonStruct = this.LLIZ) == null) {
            return null;
        }
        return new C1400390mXt(new C1394020mNc(c1400390mXtO2, anchorCommonStruct), new C1394030mNd(c1400390mXtO2, anchorCommonStruct), new C1394040mNe(c1400390mXtO2, anchorCommonStruct), null, null, 24);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            InterfaceC1394050mNf interfaceC1394050mNf = this.LLJ;
            if (interfaceC1394050mNf != null) {
                interfaceC1394050mNf.LJFF(c2344009Gk);
            }
            C1394230mNx c1394230mNx = C1394230mNx.LIZ;
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            c1394230mNx.getClass();
            C1394230mNx.LIZLLL(c2344009Gk, anchorCommonStruct);
            LJJIIJ(c2344009Gk);
            InterfaceC1394050mNf interfaceC1394050mNf2 = this.LLJ;
            if (interfaceC1394050mNf2 != null) {
                interfaceC1394050mNf2.LIZLLL(LJJ());
            }
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        AnchorCommonStruct next;
        EnumC1050190dR3 enumC1050190dR3LIZ;
        Iterator<AnchorCommonStruct> it2 = list.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (next.getType() != type());
        AnchorCommonStruct anchorCommonStruct = next;
        if (anchorCommonStruct == null) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        this.LLIZ = anchorCommonStruct;
        LJJIJIIJI();
        if (this.LLJ == null) {
            C1394230mNx c1394230mNx = C1394230mNx.LIZ;
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            LJIIZILJ();
            c1394230mNx.getClass();
            C1394230mNx.LJ(10, anchorCommonStruct2, null);
        }
        InterfaceC1394050mNf interfaceC1394050mNf = this.LLJ;
        if (interfaceC1394050mNf != null && (enumC1050190dR3LIZ = interfaceC1394050mNf.LIZ()) != null) {
            return enumC1050190dR3LIZ;
        }
        return super.LJJJJLL(list);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            InterfaceC1394050mNf interfaceC1394050mNf = this.LLJ;
            if (interfaceC1394050mNf != null) {
                interfaceC1394050mNf.p1(c2344009Gk);
            }
            C1394230mNx c1394230mNx = C1394230mNx.LIZ;
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            c1394230mNx.getClass();
            C1394230mNx.LIZLLL(c2344009Gk, anchorCommonStruct);
            LJJIIJZLJL(c2344009Gk);
            InterfaceC1394050mNf interfaceC1394050mNf2 = this.LLJ;
            if (interfaceC1394050mNf2 != null) {
                interfaceC1394050mNf2.LIZJ(LJJ());
            }
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        InterfaceC1394050mNf interfaceC1394050mNf;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            if (creativeToolsPluginService.LIZJ(interfaceC1392640mLO.LIZIZ(), "ugc_template", true) && (interfaceC1394050mNf = this.LLJ) != null && interfaceC1394050mNf.LJ(c2344009Gk) && !C04UD.LIZ()) {
                C1394230mNx c1394230mNx = C1394230mNx.LIZ;
                AnchorCommonStruct anchorCommonStruct = this.LLIZ;
                c1394230mNx.getClass();
                C1394230mNx.LIZLLL(c2344009Gk, anchorCommonStruct);
                LJJII(c2344009Gk, true, true);
            }
        }
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
        C786410Ut5.ca(c1394730mOlLIZ, new ACListenerS124S0200000_21(c2344009Gk, this, 38));
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
        c1394730mOlLIZ.setButtonOnClickListener(new AwS387S0200000_21(this, c2344009Gk, 57));
        viewGroup.addView(c1394730mOlLIZ);
        return c1394730mOlLIZ;
    }
}
