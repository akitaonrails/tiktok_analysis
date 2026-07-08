package X;

import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.tako.router.model.AnswerInnerAnchor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Goq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427060Goq implements InterfaceC427070Gor {
    public final C00EN LIZ = C00EN.MARKDOWN_TITLE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View] */
    @Override // X.InterfaceC427070Gor
    public final C1170804i2 LIZ(View view, AnswerInnerAnchor answerInnerAnchor) {
        String string;
        Layout layout;
        Spanned spanned;
        Object next;
        ?? r4 = (TextView) view.findViewById(R.id.xa2);
        if (r4 == 0) {
            return null;
        }
        String str = answerInnerAnchor.anchorKey;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
            string = "";
        }
        int top = 0;
        if (string.length() != 0 && r4.isAttachedToWindow() && r4.getWidth() > 0 && r4.getHeight() > 0 && (layout = r4.getLayout()) != null) {
            CharSequence text = r4.getText();
            if ((text instanceof Spanned) && (spanned = (Spanned) text) != null && layout.getLineCount() > 0 && spanned.length() != 0) {
                Object[] spans = spanned.getSpans(0, spanned.length(), C445090Hcp.class);
                ArrayList arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    arrayList.add(new Pair(Integer.valueOf(spanned.getSpanStart(obj)), obj));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((Number) ((Pair) obj2).getFirst()).intValue() >= 0) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        Pair pair = (Pair) next;
                        if (Intrinsics.LJFF(a0.LJLIIIL(spanned.subSequence(((Number) pair.getFirst()).intValue(), spanned.getSpanEnd(pair.getSecond())).toString()).toString(), string)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Pair pair2 = (Pair) next;
                if (pair2 != null) {
                    int iIntValue = ((Number) pair2.getFirst()).intValue();
                    int length = layout.getText().length() - 1;
                    if (length < 0) {
                        length = 0;
                    }
                    int lineForOffset = layout.getLineForOffset(C13LZ.LJ(iIntValue, 0, length));
                    while (r4 != view) {
                        top += r4.getTop();
                        Object parent = r4.getParent();
                        if (!(parent instanceof View) || (r4 = (View) parent) == 0) {
                            break;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(top + layout.getLineTop(lineForOffset));
                    if (numValueOf != null) {
                        return new C1170804i2(numValueOf.intValue(), view);
                    }
                }
            }
        }
        return null;
    }
}
