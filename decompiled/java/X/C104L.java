package X;

import android.app.Activity;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS90S1300000_28;

/* JADX INFO: renamed from: X.104L, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C104L {
    public static final boolean LIZJ() {
        C191880104w.LIZ.getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        return privacyUserSettingsV2LJIIL != null && C103K.LIZ(privacyUserSettingsV2LJIIL);
    }

    public static final String LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("//privacy/setting/page?page_tag=");
        sbLIZ.append(str);
        sbLIZ.append("&page_type=");
        sbLIZ.append("sheet");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZ(Activity activity, String str, Function1<? super C103L, Unit> function1) {
        C106V.LIZ.getClass();
        C106V.LIZJ().getClass();
        C103L c103lLJ = TPSCRenderManager.LJ(str);
        if (c103lLJ != null) {
            function1.invoke(c103lLJ);
            return;
        }
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activity);
        C0FNV.LIZJ(dialogC1389620mGW);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_fallback");
        C103A.LIZJ(str, C2188811AlT.LIZIZ(sbLIZ), new AwS90S1300000_28(dialogC1389620mGW, (DialogC1389620mGW) str, (String) activity, (Activity) function1, (Function1<? super C103L, Unit>) 4), new AwS429S0200000_28(dialogC1389620mGW, activity, 127));
    }
}
