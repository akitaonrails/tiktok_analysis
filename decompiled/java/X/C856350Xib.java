package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shortvideo.CheckTitleSensitivityResult;
import com.ss.android.ugc.aweme.shortvideo.PostPrompts;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Xib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856350Xib {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final boolean LIZ;
    public Boolean LIZIZ;
    public CheckTitleSensitivityResult LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public C19501211Ri LJFF;
    public final long LJI;
    public C11JF LJII;
    public C11JF LJIIIIZZ;

    public final void LIZ() {
        CheckTitleSensitivityResult checkTitleSensitivityResult;
        PostPrompts postPrompts;
        String postAnyway;
        CheckTitleSensitivityResult checkTitleSensitivityResult2;
        PostPrompts postPrompts2;
        String goBack;
        PostPrompts postPrompts3;
        C201955140j.LIZ("TitleSensitivity checkresult triggered");
        CheckTitleSensitivityResult checkTitleSensitivityResult3 = this.LIZJ;
        String text = null;
        if (checkTitleSensitivityResult3 != null && (postPrompts3 = checkTitleSensitivityResult3.getPostPrompts()) != null) {
            text = postPrompts3.getText();
        }
        boolean z = false;
        if (text != null && text.length() != 0 && (checkTitleSensitivityResult = this.LIZJ) != null && (postPrompts = checkTitleSensitivityResult.getPostPrompts()) != null && (postAnyway = postPrompts.getPostAnyway()) != null && postAnyway.length() != 0 && (checkTitleSensitivityResult2 = this.LIZJ) != null && (postPrompts2 = checkTitleSensitivityResult2.getPostPrompts()) != null && (goBack = postPrompts2.getGoBack()) != null && goBack.length() != 0) {
            z = true;
        }
        this.LIZIZ = Boolean.valueOf(z);
    }

    public C856350Xib(String str, String str2, boolean z) {
        String string;
        String strReplace;
        SettingsManager.LIZLLL().getClass();
        this.LJI = SettingsManager.LJ("maximum_delay", 500);
        this.LIZ = z;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(str2);
            str2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (str2 != null && (strReplace = new Regex("\n+").replace(str2, " ")) != null) {
            string = a0.LJLIIIL(strReplace).toString();
        } else {
            string = null;
        }
        this.LIZJ = null;
        this.LIZIZ = null;
        this.LJ = false;
        this.LJFF = null;
        C11JF c11jf = this.LJII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LJIIIIZZ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LIZLLL = string;
    }
}
