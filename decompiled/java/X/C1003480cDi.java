package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;

/* JADX INFO: renamed from: X.0cDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003480cDi {
    public static final void LIZ(ViewOnClickListenerC1003470cDh viewOnClickListenerC1003470cDh, boolean z) {
        String str;
        Long lValueOf;
        String str2;
        String str3 = (String) viewOnClickListenerC1003470cDh.LLL.getValue();
        if (z) {
            str = "othershow";
        } else {
            str = "othershow_fail";
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str3, str, viewOnClickListenerC1003470cDh.LLILLJJLI.LIZLLL);
        c1022820ciuLIZLLL.LIZJ(viewOnClickListenerC1003470cDh.LLLF.getValue(), "refer");
        c1022820ciuLIZLLL.LIZIZ(Long.valueOf(viewOnClickListenerC1003470cDh.LL.getID()), "component_id");
        AnoleModel anoleModel = viewOnClickListenerC1003470cDh.LLILLJJLI.LIZLLL.getAnoleModel();
        if (anoleModel != null) {
            lValueOf = Long.valueOf(anoleModel.templateID);
        } else {
            lValueOf = null;
        }
        c1022820ciuLIZLLL.LIZIZ(lValueOf, "template_id");
        c1022820ciuLIZLLL.LIZIZ(viewOnClickListenerC1003470cDh.LL.type, "component_type");
        if (!z) {
            if (!viewOnClickListenerC1003470cDh.LLJLLIL) {
                str2 = "image_load_failed";
            } else {
                str2 = "-1";
            }
            c1022820ciuLIZLLL.LIZIZ(str2, "fail_reason");
            c1022820ciuLIZLLL.LIZIZ(viewOnClickListenerC1003470cDh.LLJZ, "failed_detail_reason");
            c1022820ciuLIZLLL.LIZIZ(viewOnClickListenerC1003470cDh.LLJZIJLIL, "origin_url");
        }
        c1022820ciuLIZLLL.LIZIZ(0, "is_lynx");
        c1022820ciuLIZLLL.LJII();
    }
}
