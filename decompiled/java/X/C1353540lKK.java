package X;

import Y.AComparatorS518S0100000_21;
import android.text.Editable;
import android.text.Spannable;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0lKK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353540lKK {
    public static List LIZ(Editable editable) {
        if (editable != null && editable.length() != 0) {
            Object[] spans = editable.getSpans(0, editable.length(), CommentEmojiSpan.class);
            Arrays.sort(spans, new AComparatorS518S0100000_21(editable, 3));
            return C13LQ.LJJLL(spans);
        }
        return null;
    }

    public static ArrayList LIZIZ(Editable editable) {
        if (editable != null && editable.length() != 0) {
            ArrayList arrayList = new ArrayList();
            InterfaceC1353590lKP[] interfaceC1353590lKPArr = (InterfaceC1353590lKP[]) LIZJ(editable, InterfaceC1353590lKP.class);
            if (interfaceC1353590lKPArr == null) {
                return arrayList;
            }
            for (InterfaceC1353590lKP interfaceC1353590lKP : interfaceC1353590lKPArr) {
                if (interfaceC1353590lKP.getType() == 0 || interfaceC1353590lKP.getType() == 8 || interfaceC1353590lKP.getType() == 9) {
                    TextExtraStruct textExtraStructLIZ = interfaceC1353590lKP.LIZ();
                    if (textExtraStructLIZ != null) {
                        textExtraStructLIZ.setStart(editable.getSpanStart(interfaceC1353590lKP));
                    }
                    TextExtraStruct textExtraStructLIZ2 = interfaceC1353590lKP.LIZ();
                    if (textExtraStructLIZ2 != null) {
                        textExtraStructLIZ2.setEnd(editable.getSpanEnd(interfaceC1353590lKP));
                    }
                    TextExtraStruct textExtraStructLIZ3 = interfaceC1353590lKP.LIZ();
                    if (textExtraStructLIZ3 != null) {
                        arrayList.add(textExtraStructLIZ3);
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    public static Object[] LIZJ(Spannable spannable, Class cls) {
        if (spannable != null && spannable.length() != 0) {
            Object[] spans = spannable.getSpans(0, spannable.length(), cls);
            if (spans != null && spans.length != 0) {
                Arrays.sort(spans, new AComparatorS518S0100000_21(spannable, 4));
                return spans;
            }
            return spans;
        }
        return null;
    }
}
