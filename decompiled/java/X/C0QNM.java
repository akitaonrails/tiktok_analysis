package X;

import Y.AfS179S0100000_10;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetModel;
import com.ss.android.ugc.aweme.search.widget.core.ui.SearchMiddleWidget;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: X.0QNM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QNM {
    public static volatile boolean LIZIZ;
    public static AnonymousClass0956 LIZLLL;
    public static final C0QNM LIZ = new C0QNM();
    public static volatile C05IY<SearchWidgetModel> LIZJ = new C05IY<>();

    public static String LIZ() {
        if (LIZJ.LIZIZ == null) {
            return "";
        }
        SearchWidgetModel searchWidgetModel = LIZJ.LIZIZ;
        if (searchWidgetModel != null) {
            return searchWidgetModel.getFirstGuessWord();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static void LIZJ(Context context) {
        IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService != null) {
            iAppWidgetService.LJIIJJI(context, Collections.singletonList(new SearchMiddleWidget()));
        }
    }

    public final void LIZIZ(final Context context) {
        if (context != null && !LIZIZ) {
            LIZIZ = true;
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJJIFFI(new InterfaceC427710Gpt() { // from class: X.0QNL
                @Override // X.InterfaceC427710Gpt
                public final void LLLLLLZZ(int i, User user, User user2) {
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        return;
                    }
                    C0QL4 c0ql4 = C0QL4.LIZ;
                    Context context2 = context;
                    c0ql4.getClass();
                    if (!C0QL4.LIZIZ(context2)) {
                        return;
                    }
                    C0QNM.LIZLLL(C0QNM.LIZ, context);
                }
            });
            C2214201BlK.LIZLLL().LJJLJLI(new AfS179S0100000_10(context, 9));
            C0QL4.LIZ.getClass();
            boolean zLIZIZ = C0QL4.LIZIZ(context);
            C0QDB c0qdb = C0QDB.LIZ;
            Map mapLJ = C2097608Jq.LJ();
            c0qdb.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(zLIZIZ ? 1 : 0, "has_widget");
            C0QDB.LIZ(c2344009Gk, mapLJ);
            C20684815ws.LJIILLIIL("launch_widget_info", c2344009Gk.LIZ);
            if (C0QL4.LIZIZ(context)) {
                LIZLLL(this, context);
                Map mapLJ2 = C2097608Jq.LJ();
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("widget_kind", "search");
                c2344009Gk2.LIZJ(1, "widget_size");
                C0QDB.LIZ(c2344009Gk2, mapLJ2);
                C20684815ws.LJIILLIIL("launch_widget_subinfo", c2344009Gk2.LIZ);
                return;
            }
            Keva keva = (Keva) C669420QNo.LIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("guide_");
            sbLIZ.append("function_entry_medium");
            keva.erase(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZLLL(C0QNM c0qnm, Context context) {
        if (!LIZIZ) {
            c0qnm.LIZIZ(context);
            return;
        }
        c0qnm.getClass();
        if (!C10EU.LJIILIIL() && !ComplianceServiceProvider.LJIIJJI().LJIIIZ()) {
            if (LIZJ.LIZIZ == null) {
                LIZJ.LIZ = 3;
                LIZJ(context);
            }
            AnonymousClass0956 anonymousClass0956 = LIZLLL;
            if (anonymousClass0956 != null && !anonymousClass0956.isCancelled()) {
                AnonymousClass0956 anonymousClass09562 = LIZLLL;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            LIZLLL = C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C05IV(context, null), 2);
            return;
        }
        LIZJ.LIZ = 1;
        LIZJ(context);
    }
}
