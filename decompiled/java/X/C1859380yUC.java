package X;

import android.graphics.Color;
import android.text.Spannable;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.typewriter.ForegroundAlphaSpan;
import com.ss.android.ugc.aweme.tako.experiment.TakoChatStreamTypeConfigExperiment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yUC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859380yUC {
    public TextView LJFF;
    public AnonymousClass0956 LJI;
    public final long LIZ = 1000 / ((long) TakoChatStreamTypeConfigExperiment.LIZ().alphaFps);
    public final C054G LIZIZ = C2296808zG.LIZIZ();
    public CharSequence LIZJ = "";
    public String LIZLLL = "";
    public final Map<Integer, Integer> LJ = new LinkedHashMap();
    public final long LJII = TakoChatStreamTypeConfigExperiment.LIZ().alphaTime;

    public final void LIZ() {
        Spannable spannable;
        int length;
        TextView textView = this.LJFF;
        if (textView == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable) || (spannable = (Spannable) text) == null) {
            return;
        }
        for (Object obj : spannable.getSpans(0, spannable.length(), ForegroundAlphaSpan.class)) {
            spannable.removeSpan(obj);
        }
        List listLJLLJ = C13LP.LJLLJ(C13LP.LLIIII(((LinkedHashMap) this.LJ).keySet()));
        int i = 0;
        for (Object obj2 : listLJLLJ) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            int iIntValue = ((Number) obj2).intValue();
            if (spannable.length() > iIntValue) {
                if (i2 < listLJLLJ.size()) {
                    length = ((Number) ListProtector.get(listLJLLJ, i2)).intValue();
                    int length2 = spannable.length();
                    if (length > length2) {
                        length = length2;
                    }
                } else {
                    length = spannable.length();
                }
                Integer num = (Integer) ((LinkedHashMap) this.LJ).get(Integer.valueOf(iIntValue));
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    C786410Ut5.o2(spannable, new ForegroundAlphaSpan(Color.argb(iIntValue2, 0, 0, 0), iIntValue2), iIntValue, length, 17);
                }
            }
            i = i2;
        }
        textView.invalidate();
    }
}
