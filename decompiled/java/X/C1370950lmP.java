package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lmP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370950lmP {
    public static void LIZIZ(SharePackage sharePackage, AbstractC1375550ltp abstractC1375550ltp, Activity activity, Function1 function1, Function2 function2) {
        String str;
        if (abstractC1375550ltp instanceof C1371430lnB) {
            str = ((C1371430lnB) abstractC1375550ltp).LIZLLL;
        } else if (abstractC1375550ltp instanceof C1371420lnA) {
            str = ((C1371420lnA) abstractC1375550ltp).LIZIZ;
        } else {
            str = "";
        }
        LIZ(str, sharePackage, abstractC1375550ltp, activity, function1, function2);
    }

    public static void LIZ(String str, SharePackage sharePackage, AbstractC1375550ltp abstractC1375550ltp, Activity activity, Function1 function1, Function2 function2) {
        String string;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        if (sharePackage == null || (bundle3 = sharePackage.extras) == null || (string = bundle3.getString("share_form", "url_form")) == null) {
            string = "url_form";
        }
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            bundle2.putInt("link_form", C1370370llT.LJ.LIZJ(str));
        }
        if (!(abstractC1375550ltp instanceof C1371420lnA) && !(abstractC1375550ltp instanceof C1371430lnB)) {
            function2.invoke(abstractC1375550ltp, Boolean.TRUE);
            return;
        }
        if (((Boolean) function1.invoke(str)).booleanValue()) {
            function2.invoke(abstractC1375550ltp, Boolean.TRUE);
            return;
        }
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            bundle.putInt("link_form", 1);
        }
        function2.invoke(abstractC1375550ltp, Boolean.FALSE);
        if (!Intrinsics.LJFF(string, "url_form") || activity == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(2131848062);
        c1389890mGx.LJIIJJI();
    }
}
