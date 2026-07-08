package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0x1C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1802960x1C {
    public static SpannableStringBuilder LIZJ(Context context, String str, Map map, InterfaceC1802940x1A interfaceC1802940x1A) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (map != null) {
            boolean z = false;
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
                        C1864470ycP c1864470ycP = new C1864470ycP(interfaceC1802940x1A, str3, 1);
                        C1150160g2I c1150160g2I = new C1150160g2I();
                        c1150160g2I.LIZIZ = 0;
                        c1150160g2I.LIZJ = length2;
                        c1150160g2I.LIZLLL = 18;
                        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.a1r});
                        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
                        typedArrayObtainStyledAttributes.recycle();
                        c1150160g2I.LIZ(new ForegroundColorSpan(color));
                        c1150160g2I.LIZ(new AbsoluteSizeSpan(13, true));
                        c1150160g2I.LIZ(c1864470ycP);
                        c1150160g2I.LIZIZ(spannableStringBuilder2);
                        C1119920fFW.LJ(context, spannableStringBuilder2, 0, length2, 33, 6, 500);
                    }
                    spannableStringBuilder.replace(iLJJJ, length, (CharSequence) spannableStringBuilder2);
                    z = true;
                }
            }
            if (z) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(" >");
                Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.emz);
                if (drawableLJIIJ != null) {
                    drawableLJIIJ.setBounds(0, 0, (int) C497740JfY.LIZIZ(10.0f), (int) C497740JfY.LIZIZ(10.0f));
                    C786410Ut5.q2(spannableStringBuilder3, new ImageSpan(drawableLJIIJ, 1), 0, 2, 17);
                }
                spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
            }
        }
        return spannableStringBuilder;
    }
}
