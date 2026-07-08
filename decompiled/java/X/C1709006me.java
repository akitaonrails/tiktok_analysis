package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06me, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1709006me extends FrameLayout {
    public final View LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;

    public final void LIZIZ(int i) {
        CharSequence charSequenceLJIIIIZZ;
        String str;
        String string;
        String str2 = "";
        SpannableString spannableString = new SpannableString("");
        Context context = getContext();
        if (context != null) {
            charSequenceLJIIIIZZ = C1308910kAL.LJIIIIZZ(context);
        } else {
            charSequenceLJIIIIZZ = null;
        }
        boolean zEquals = TextUtils.equals(charSequenceLJIIIIZZ, "TikTok Theme Dark");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("wrong stepIndex input=");
                    sbLIZ.append(i);
                    C2188811AlT.LIZIZ(sbLIZ);
                    string = "";
                } else {
                    if (zEquals) {
                        str2 = "https://sf16-sg.tiktokcdn.com/obj/eden-sg/jva_ukj_zsaa/ljhwZthlaukjlkulzlp/poi_main_route/step3_dark_compressed.png";
                    } else {
                        str2 = "https://sf16-sg.tiktokcdn.com/obj/eden-sg/jva_ukj_zsaa/ljhwZthlaukjlkulzlp/poi_main_route/step3_light_compressed.png ";
                    }
                    string = getContext().getString(2131844749);
                    String string2 = getContext().getString(2131844748);
                    spannableString = LIZ(getContext().getString(2131844747, string2), string2, getContext().getString(2131844747), true);
                }
            } else {
                if (zEquals) {
                    str2 = "https://sf16-sg.tiktokcdn.com/obj/eden-sg/jva_ukj_zsaa/ljhwZthlaukjlkulzlp/poi_main_route/step2_dark_compressed.png";
                } else {
                    str2 = "https://sf16-sg.tiktokcdn.com/obj/eden-sg/jva_ukj_zsaa/ljhwZthlaukjlkulzlp/poi_main_route/step2_light_compressed.png";
                }
                string = getContext().getString(2131844746);
                String string3 = getContext().getString(2131844745);
                spannableString = LIZ(getContext().getString(2131844744, string3), string3, getContext().getString(2131844744), true);
            }
        } else {
            if (zEquals) {
                str = "https://sf16-sg.tiktokcdn.com/obj/eden-sg/jva_ukj_zsaa/ljhwZthlaukjlkulzlp/poi_main_route/step1_dark_compressed.png";
            } else {
                str = "https://sf16-sg.tiktokcdn.com/obj/eden-sg/jva_ukj_zsaa/ljhwZthlaukjlkulzlp/poi_main_route/step1_light_compressed.png";
            }
            string = getContext().getString(2131844743);
            spannableString = LIZ(getContext().getString(2131844742), "...", "", false);
            str2 = str;
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
        c1331670kl3LJIIIZ.LJJ(this.LLILLJJLI);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        this.LLILLL.setText(string);
        this.LLILZ.setText(spannableString);
    }

    public C1709006me(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewInflate = FrameLayout.inflate(context, R.layout.e77, this);
        this.LL = viewInflate;
        this.LLILLJJLI = (SmartImageView) viewInflate.findViewById(R.id.lvw);
        this.LLILLL = (TuxTextView) viewInflate.findViewById(R.id.tv_step);
        this.LLILZ = (TuxTextView) viewInflate.findViewById(R.id.tv_step_content);
    }

    public final SpannableString LIZ(String str, String str2, String str3, boolean z) {
        int iLJJJ;
        SpannableString spannableString = new SpannableString(str);
        if (z) {
            iLJJJ = a0.LJJJ(str3, "%1$s", 0, false, 6);
        } else {
            iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
        }
        if (iLJJJ != -1) {
            int length = str2.length() + iLJJJ;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1i, getContext());
            if (numLIZJ != null) {
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJ, length, 33);
            }
            C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJJ, length, 33);
        }
        return spannableString;
    }
}
