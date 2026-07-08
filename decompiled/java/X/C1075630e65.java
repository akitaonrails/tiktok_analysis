package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.SearchSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0e65, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075630e65 {
    public static void LIZ(Activity activity, C1075640e66 c1075640e66) {
        BaseTemplate baseTemplateLIZIZ;
        final String str = c1075640e66.LJFF;
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "search";
        c1370940lmO.LIZIZ = "search";
        c1370940lmO.LIZLLL = c1075640e66.LIZ;
        c1370940lmO.LJ = c1075640e66.LIZIZ;
        String strLJFF = C1375500ltk.LJFF(C1375500ltk.LJ(c1075640e66.LIZLLL));
        if (strLJFF == null) {
            strLJFF = "";
        }
        c1370940lmO.LJFF = strLJFF;
        if (c1075640e66.LJI.dmCardStyle == 1) {
            String str2 = c1075640e66.LJIIIIZZ;
            String str3 = c1075640e66.LJII;
            if (str3 != null && (baseTemplateLIZIZ = C2241931Cox.LIZIZ(2000, str3)) != null) {
                c1370940lmO.LJIIIIZZ = new SendMessageTemplateTask(str2, baseTemplateLIZIZ, new SendMessageEventParcel(str2, null, null, null, null, null, 62), null, false, 24);
            }
        }
        SearchSharePackage searchSharePackage = new SearchSharePackage(c1370940lmO);
        Bundle bundle = searchSharePackage.extras;
        C786410Ut5.LJJJI("app_name", activity.getString(R.string.drg), bundle);
        C786410Ut5.LJJJI("thumb_url", c1075640e66.LIZJ, bundle);
        C786410Ut5.LJJJI("schema", c1075640e66.LJ, bundle);
        C786410Ut5.LJJJI("track_info", c1075640e66.LJFF, bundle);
        C1324840ka2.LJIJJ(c1075640e66.LIZJ);
        InterfaceC1366490lfD interfaceC1366490lfD = new InterfaceC1366490lfD() { // from class: X.0e63
            @Override // X.InterfaceC1366490lfD
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJ(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJFF(Context context, BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJI(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1361850lXj
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                if (z) {
                    String strKey = interfaceC1369790lkX.key();
                    String str4 = str;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJFF("platform", strKey);
                    C2080208Cy.LIZIZ(c2344009Gk, str4);
                    C20684815ws.LJIILLIIL("share_search_result", c2344009Gk.LIZ);
                }
            }

            @Override // X.InterfaceC1361850lXj
            public final Object LJII(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                Unit unit = Unit.LIZ;
                C099R.LJFF();
                return unit;
            }
        };
        C1371600lnS c1371600lnS = new C1371600lnS();
        if (c1075640e66.LJI.sharePanelStyle == 0) {
            ShareDependService.LIZ.getClass();
            C1075650e67.LIZ(ShareDependServiceImpl.LJJJJI().LJJJIL(searchSharePackage, "share_search"), c1371600lnS);
            C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, activity, true);
            c1371600lnS.LIZIZ(new CopyLinkChannel(false));
        } else {
            c1371600lnS.LJJI = 2131835798;
        }
        c1371600lnS.LJJIIJ = searchSharePackage;
        c1371600lnS.LJJIL = interfaceC1366490lfD;
        c1371600lnS.LJJIZ = new InterfaceC1364520lc2() { // from class: X.0e64
            @Override // X.InterfaceC1364520lc2
            public final void LIZIZ(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LIZLLL(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJ(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJII(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIJJI(BaseSharePackage baseSharePackage, String str4) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIL(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIILIIL(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIIIZZ(BaseSharePackage baseSharePackage) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                C2080208Cy.LIZIZ(c2344009Gk, str);
                C20684815ws.LJIILLIIL("share_video", c2344009Gk.LIZ);
            }
        };
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJII(activity, new C1371590lnR(c1371600lnS), null);
    }
}
