package X;

import Y.ACListenerS154S0100000_19;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountUserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238550iKr {
    public final Context LIZ;
    public final C1238760iLC LIZIZ;
    public final TuxTextView LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final C11NJ LJFF;
    public String LJI;

    public C1238550iKr(Context context) {
        this.LIZ = context;
        this.LIZIZ = C1238610iKx.LIZ(context.getString(2131827750), new ACListenerS154S0100000_19(this, 191));
        boolean z = false;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(41);
        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1k, tuxTextView.getContext()));
        this.LIZJ = tuxTextView;
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("blue_v_verification_setting_url", "");
        this.LIZLLL = strLJI;
        if (!((AccountUserService) C0XQ7.LJFF()).LIZ() && strLJI.length() > 0) {
            z = true;
        }
        this.LJ = z;
        this.LJFF = new C11NJ();
        this.LJI = "unknown";
    }

    public final void LIZ(String str) {
        String string;
        this.LJI = str;
        if (Intrinsics.LJFF(str, "under_assessment")) {
            string = this.LIZ.getString(2131827830);
        } else if (Intrinsics.LJFF(str, "verified")) {
            string = this.LIZ.getString(2131827831);
        } else {
            string = "";
        }
        this.LIZJ.setText(string);
        this.LIZIZ.LJI(new AwS133S1100000_19(this.LIZJ, (String) null, 20));
    }
}
