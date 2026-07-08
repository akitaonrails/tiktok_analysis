package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.TextHighlight;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11B5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11B5 extends RecyclerView.ViewHolder {
    public final C11B1 LL;
    public final C11BA LLILLJJLI;
    public final C417370GYd LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final TuxIconView LLILZLL;

    public C11B5(View view, C11B1 c11b1, C11BA c11ba) {
        super(view);
        this.LL = c11b1;
        this.LLILLJJLI = c11ba;
        this.LLILLL = (C417370GYd) view.findViewById(R.id.lqd);
        this.LLILZ = (TextView) view.findViewById(R.id.tv_org_name);
        this.LLILZIL = (TextView) view.findViewById(R.id.tv_org_desc);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.lqc);
    }

    public static Spannable I5(Context context, String str, List list) {
        SpannableString spannableString = new SpannableString(str);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TextHighlight textHighlight = (TextHighlight) it2.next();
            Integer num = textHighlight.startIndex;
            if (num != null) {
                int iIntValue = num.intValue();
                Integer num2 = textHighlight.endIndex;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    if (context != null) {
                        C786410Ut5.p2(spannableString, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a04, context)), iIntValue, iIntValue2, 33);
                    }
                }
            }
        }
        return spannableString;
    }
}
