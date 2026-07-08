package X;

import Y.AcS498S0100000_27;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0x1B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802950x1B implements InterfaceC782330UmV {
    @Override // X.InterfaceC782330UmV
    public final C773790UWz LIZ(String str, AcS498S0100000_27 acS498S0100000_27, String str2, AcS498S0100000_27 acS498S0100000_272) {
        return null;
    }

    @Override // X.InterfaceC782330UmV
    public final C782320UmU getIcon() {
        return null;
    }

    @Override // X.InterfaceC782330UmV
    public final SpannableStringBuilder LIZIZ(Context context, String str, Map map, C1802820x0y c1802820x0y) {
        ForegroundColorSpan foregroundColorSpan;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("%{");
                sbLIZ.append((String) entry.getKey());
                sbLIZ.append("}%");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int iLJJJ = a0.LJJJ(spannableStringBuilder, strLIZIZ, 0, false, 6);
                if (iLJJJ >= 0) {
                    int length = strLIZIZ.length() + iLJJJ;
                    CustomErrorExtra.PopContentReplace popContentReplace = (CustomErrorExtra.PopContentReplace) entry.getValue();
                    String str2 = popContentReplace.replaceValue;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str4 = popContentReplace.valueSchema;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                    if (C500260Jjc.LJJIIZ(str3)) {
                        int length2 = spannableStringBuilder2.length();
                        C1864470ycP c1864470ycP = new C1864470ycP(c1802820x0y, str3, 0);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                        if (numLIZJ != null) {
                            foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
                        } else {
                            foregroundColorSpan = null;
                        }
                        C1150160g2I c1150160g2I = new C1150160g2I();
                        c1150160g2I.LIZIZ = 0;
                        c1150160g2I.LIZJ = length2;
                        c1150160g2I.LIZLLL = 18;
                        c1150160g2I.LIZ(foregroundColorSpan);
                        c1150160g2I.LIZ(new AbsoluteSizeSpan(13, true));
                        c1150160g2I.LIZ(c1864470ycP);
                        c1150160g2I.LIZIZ(spannableStringBuilder2);
                        C1119920fFW.LJ(context, spannableStringBuilder2, 0, length2, 33, 6, OppoPermissionPopupMaskDelayExp.DEFAULT);
                    }
                    spannableStringBuilder.replace(iLJJJ, length, (CharSequence) spannableStringBuilder2);
                }
            }
        }
        return spannableStringBuilder;
    }
}
