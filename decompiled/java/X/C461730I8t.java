package X;

import Y.AComparatorS25S0000000_6;
import android.graphics.Rect;
import android.text.Layout;
import androidx.appcompat.widget.AppCompatTextView;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0I8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461730I8t {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(AppCompatTextView appCompatTextView) {
        Layout layout = appCompatTextView.getLayout();
        String string = "";
        if (layout == null) {
            return new Pair(0L, "");
        }
        Rect rect = new Rect();
        if (!appCompatTextView.getLocalVisibleRect(rect)) {
            return new Pair(0L, "");
        }
        CharSequence text = layout.getText();
        int lineCount = layout.getLineCount();
        int iHeight = rect.height();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= lineCount) {
                break;
            }
            int lineBottom = layout.getLineBottom(i);
            if (iHeight < lineBottom) {
                int lineTop = layout.getLineTop(i);
                if (((double) lineTop) + (((double) (lineBottom - lineTop)) * 0.9d) <= iHeight) {
                    j++;
                }
            } else {
                j++;
                i++;
            }
        }
        if (j > 0) {
            string = text.subSequence(0, layout.getLineEnd(((int) j) - 1)).toString();
        }
        return new Pair(Long.valueOf(j), string);
    }

    public static String LIZIZ(String str, List list, List list2) {
        int i;
        if (list != null && !list.isEmpty() && str.length() != 0) {
            StringBuilder sb = new StringBuilder("");
            int length = str.length();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) obj;
                if (textExtraStruct != null && textExtraStruct.getStart() < textExtraStruct.getEnd() && list2.contains(Integer.valueOf(textExtraStruct.getType()))) {
                    arrayList.add(obj);
                }
            }
            int iLJJJ = 0;
            int i2 = 0;
            for (TextExtraStruct textExtraStruct2 : C13LP.LJLLLL(new AComparatorS25S0000000_6(6), arrayList)) {
                if (textExtraStruct2 != null && list2.contains(Integer.valueOf(textExtraStruct2.getType()))) {
                    int start = textExtraStruct2.getStart() - i2;
                    int end = textExtraStruct2.getEnd() - i2;
                    if (iLJJJ <= start && start < length && start < end) {
                        sb.append(str.substring(iLJJJ, start));
                        if (end > length) {
                            i = length;
                        } else {
                            i = end;
                        }
                        String strSubstring = str.substring(start, i);
                        if (a0.LJJIIZI(strSubstring, "…\n", false)) {
                            iLJJJ = a0.LJJJ(strSubstring, "…", 0, false, 6) + start + 1;
                            i2 += end - iLJJJ;
                        } else {
                            iLJJJ = end;
                        }
                        if (iLJJJ < length && C1244080iTm.LJ(str.charAt(iLJJJ))) {
                            iLJJJ++;
                        }
                    }
                }
            }
            if (iLJJJ < length) {
                sb.append(str.substring(iLJJJ));
            }
            return sb.toString();
        }
        return str;
    }
}
