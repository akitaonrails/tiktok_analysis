package X;

import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.util.Range;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.15gl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20584915gl {
    public static final C20584915gl LIZ = new C20584915gl();

    public static void LIZLLL(Spannable spannable, Class... clsArr) {
        for (Class cls : clsArr) {
            for (Object obj : spannable.getSpans(0, spannable.length(), cls)) {
                spannable.removeSpan(obj);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.widget.TextView r13, java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20584915gl.LJ(android.widget.TextView, java.util.List):void");
    }

    public static Range LIZJ(String str, StoryNoteTextExtra storyNoteTextExtra, Layout layout) {
        Integer num;
        Object c098200Yq;
        Integer num2 = storyNoteTextExtra.start;
        Integer num3 = storyNoteTextExtra.end;
        if (num2 != null && num3 != null && (num = storyNoteTextExtra.type) != null) {
            boolean z = true;
            if (num.intValue() == 1) {
                int iIntValue = num2.intValue();
                int iIntValue2 = num3.intValue();
                if (iIntValue >= 0 && iIntValue <= str.length() && iIntValue2 >= 0 && iIntValue2 <= str.length() && iIntValue < iIntValue2) {
                    z = false;
                }
                if (z) {
                    return null;
                }
                try {
                    c098200Yq = Float.valueOf(layout.getPrimaryHorizontal(num2.intValue()));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                if (c098200Yq == null) {
                    return null;
                }
                return new Range(num2, num3);
            }
        }
        return null;
    }

    public static void LJFF(TextView textView, boolean z, EnumC1257160ios enumC1257160ios, C1256320inW c1256320inW) {
        Map<Integer, Integer> map;
        Context context = textView.getContext();
        boolean z2 = false;
        if (z) {
            if (r2.heightPixels / context.getResources().getDisplayMetrics().density <= 640.0f) {
                z2 = true;
            }
        }
        if (c1256320inW == null) {
            c1256320inW = enumC1257160ios.getTuxFontConfig();
        }
        if (z2) {
            map = c1256320inW.LIZIZ;
        } else {
            map = c1256320inW.LIZ;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int maxWidth = textView.getMaxWidth();
            int measuredHeightAndState = textView.getMeasuredHeightAndState();
            if (textView instanceof TuxTextView) {
                ((TuxTextView) textView).setTuxFont(iIntValue);
            } else if (textView instanceof C0I7D) {
                ((C0I7D) textView).setTuxFont(iIntValue);
            }
            if (maxWidth == -1) {
                maxWidth = View.MeasureSpec.getSize(Integer.MIN_VALUE);
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(maxWidth, 1073741824), measuredHeightAndState);
            textView.requestLayout();
            textView.invalidate();
            if (textView.getLineCount() <= iIntValue2) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    public static void LIZ(String str, Layout layout, Spannable spannable, List list, List list2) {
        ?? arrayList;
        Object c098200Yq;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            RichTextInfo richTextInfo = (RichTextInfo) it2.next();
            C20584915gl c20584915gl = LIZ;
            int i = richTextInfo.start;
            int i2 = richTextInfo.end;
            int size = ((ArrayList) list).size();
            c20584915gl.getClass();
            if (i >= 0 && i <= size && i2 >= 0 && i2 <= size && i < i2) {
                int i3 = richTextInfo.end - richTextInfo.start;
                List<Integer> list3 = richTextInfo.gradientColors;
                if (!list3.isEmpty() && i3 > 0) {
                    int iIntValue = ((Number) ListProtector.get(list3, 0)).intValue();
                    if (list3.size() == 1) {
                        arrayList = new ArrayList(i3);
                        int i4 = 0;
                        do {
                            arrayList.add(new int[]{iIntValue, iIntValue});
                            i4++;
                        } while (i4 < i3);
                    } else {
                        int iIntValue2 = ((Number) ListProtector.get(list3, 1)).intValue();
                        arrayList = new ArrayList();
                        float f = 1.0f / i3;
                        int i5 = 0;
                        do {
                            float f2 = i5 * f;
                            i5++;
                            arrayList.add(new int[]{C20632215oO.LIZ(f2, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)).intValue(), C20632215oO.LIZ(i5 * f, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)).intValue()});
                        } while (i5 < i3);
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                int i6 = 0;
                for (Object obj : arrayList) {
                    int i7 = i6 + 1;
                    Object obj2 = null;
                    if (i6 >= 0) {
                        int[] iArr = (int[]) obj;
                        int i8 = richTextInfo.start + i6;
                        int length = 0;
                        for (int i9 = 0; i9 < i8; i9++) {
                            length += ((String) ListProtector.get(list, i9)).length();
                        }
                        int i10 = richTextInfo.start + i6 + 1;
                        int length2 = 0;
                        for (int i11 = 0; i11 < i10; i11++) {
                            length2 += ((String) ListProtector.get(list, i11)).length();
                        }
                        LIZ.getClass();
                        if (length >= 0 && length <= str.length() && length2 >= 0 && length2 <= str.length() && length < length2) {
                            try {
                                c098200Yq = Float.valueOf(layout.getPrimaryHorizontal(length));
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                obj2 = c098200Yq;
                            }
                            Float f3 = (Float) obj2;
                            if (f3 != null) {
                                C786410Ut5.o2(spannable, new C1697090uGR(f3.floatValue(), str.substring(length, length2), iArr), length, length2, 33);
                            }
                        }
                        i6 = i7;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }

    public static void LIZIZ(String str, Layout layout, Spannable spannable, List list, TextView textView, boolean z, boolean z2, StoryNoteDataCollection storyNoteDataCollection, String str2) {
        if (z2) {
            return;
        }
        if (z) {
            textView.setOnTouchListener(new View.OnTouchListener() { // from class: X.15go
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    TextView textView2;
                    Spannable spannable2;
                    C20584915gl.LIZ.getClass();
                    if (motionEvent.getAction() != 1) {
                        return true;
                    }
                    C20585315gp c20585315gp = null;
                    if ((view instanceof TextView) && (textView2 = (TextView) view) != null) {
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spannable) && (spannable2 = (Spannable) text) != null) {
                            Layout layout2 = textView2.getLayout();
                            float x = motionEvent.getX();
                            float compoundPaddingLeft = (x - textView2.getCompoundPaddingLeft()) + textView2.getScrollX();
                            int lineForVertical = layout2.getLineForVertical((int) ((motionEvent.getY() - textView2.getCompoundPaddingTop()) + textView2.getScrollY()));
                            int lineStart = layout2.getLineStart(lineForVertical);
                            int lineEnd = layout2.getLineEnd(lineForVertical);
                            C20585315gp[] c20585315gpArr = (C20585315gp[]) spannable2.getSpans(lineStart, lineEnd, C20585315gp.class);
                            if (c20585315gpArr.length == 0) {
                                return true;
                            }
                            C089E c089e = new C089E(c20585315gpArr);
                            float f = Float.MAX_VALUE;
                            while (c089e.hasNext()) {
                                C20585315gp c20585315gp2 = (C20585315gp) c089e.next();
                                int spanStart = spannable2.getSpanStart(c20585315gp2);
                                int spanEnd = spannable2.getSpanEnd(c20585315gp2);
                                int iMax = Math.max(spanStart, lineStart);
                                int iMin = Math.min(spanEnd, lineEnd);
                                float primaryHorizontal = layout2.getPrimaryHorizontal(iMax);
                                float primaryHorizontal2 = layout2.getPrimaryHorizontal(iMin);
                                if (primaryHorizontal <= compoundPaddingLeft && compoundPaddingLeft <= primaryHorizontal2) {
                                    float fAbs = Math.abs(compoundPaddingLeft - ((primaryHorizontal + primaryHorizontal2) / 2.0f));
                                    if (fAbs < f) {
                                        c20585315gp = c20585315gp2;
                                        f = fAbs;
                                    }
                                }
                            }
                            if (c20585315gp == null) {
                                return true;
                            }
                            c20585315gp.LLILZIL = Float.valueOf(motionEvent.getRawX());
                            c20585315gp.LLILZLL = Float.valueOf(motionEvent.getRawY());
                            c20585315gp.onClick(textView2);
                            return true;
                        }
                    }
                    return false;
                }
            });
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            StoryNoteTextExtra storyNoteTextExtra = (StoryNoteTextExtra) it2.next();
            LIZ.getClass();
            Range rangeLIZJ = LIZJ(str, storyNoteTextExtra, layout);
            if (rangeLIZJ != null) {
                C786410Ut5.o2(spannable, new C20585315gp(storyNoteTextExtra, z, textView.getContext(), storyNoteDataCollection, str2), ((Number) rangeLIZJ.getLower()).intValue(), ((Number) rangeLIZJ.getUpper()).intValue(), 33);
            }
        }
    }
}
