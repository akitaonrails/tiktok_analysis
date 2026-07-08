package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Hgq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447580Hgq {
    public static final C447580Hgq LIZ = new C447580Hgq();
    public static final Set<Integer> LIZIZ = C13LQ.LJLIIL(new Integer[]{1001, 1002, 1003, 1004});
    public static final LruCache<String, Bitmap> LIZJ = new LruCache<>(32);
    public static long LIZLLL;

    public static long LIZ(TextView textView) {
        long j = LIZLLL + 1;
        LIZLLL = j;
        textView.setTag(R.id.knt, Long.valueOf(j));
        textView.setTag(R.id.knu, null);
        return j;
    }

    public static C447620Hgu LIZJ(List list) {
        boolean z;
        Text text;
        String str;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem = (PublicAreaMessageCommon.CreatorSuccessInfo.TagItem) obj;
            if (LIZIZ.contains(Integer.valueOf(tagItem.tagType)) && (text = tagItem.tagText) != null && (str = text.defaultPattern) != null && str.length() != 0) {
                arrayList.add(obj);
            }
        }
        List listLL = C13LP.LL(arrayList, 3);
        if (listLL.isEmpty()) {
            return null;
        }
        return new C447620Hgu(arrayList, listLL);
    }

    public static void LJFF(TextView textView) {
        ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC462840IDa viewTreeObserverOnPreDrawListenerC462840IDa = new ViewTreeObserverOnPreDrawListenerC462840IDa(textView, viewTreeObserver, 3);
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC462840IDa);
        C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC462840IDa, ViewTreeObserver.OnPreDrawListener.class);
    }

    public static void LJI(final TextView textView, final long j, final List list, final Function2 function2) {
        if (function2 == null) {
            return;
        }
        final ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            function2.invoke(C13BV.INSTANCE, list);
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0Hgo
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Spanned spanned;
                int lineForOffset;
                ViewTreeObserver viewTreeObserver2 = viewTreeObserver.isAlive() ? viewTreeObserver : textView.getViewTreeObserver();
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(this);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnPreDrawListener.class);
                }
                Object tag = textView.getTag(R.id.knt);
                Long l = tag instanceof Long ? (Long) tag : null;
                long j2 = j;
                if (l == null || l.longValue() != j2) {
                    return true;
                }
                C447580Hgq c447580Hgq = C447580Hgq.LIZ;
                TextView textView2 = textView;
                c447580Hgq.getClass();
                Layout layout = textView2.getLayout();
                int i = 0;
                if (layout != null) {
                    CharSequence text = textView2.getText();
                    if ((text instanceof Spanned) && (spanned = (Spanned) text) != null) {
                        C447570Hgp[] c447570HgpArr = (C447570Hgp[]) spanned.getSpans(0, spanned.length(), C447570Hgp.class);
                        if (c447570HgpArr.length != 0) {
                            int maxLines = textView2.getMaxLines();
                            if (1 > maxLines || maxLines >= Integer.MAX_VALUE) {
                                maxLines = layout.getLineCount();
                            }
                            int width = (textView2.getWidth() - textView2.getTotalPaddingLeft()) - textView2.getTotalPaddingRight();
                            Paint.FontMetricsInt fontMetricsInt = textView2.getPaint().getFontMetricsInt();
                            C089E c089e = new C089E(c447570HgpArr);
                            i = 0;
                            while (c089e.hasNext()) {
                                int spanStart = spanned.getSpanStart(c089e.next());
                                if (spanStart >= 0 && (lineForOffset = layout.getLineForOffset(spanStart)) < layout.getLineCount() && lineForOffset < maxLines && (layout.getEllipsisCount(lineForOffset) <= 0 || spanStart < layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset))) {
                                    if (width > 0) {
                                        if (layout.getPrimaryHorizontal(spanStart) + (((C416760GVu) C13LQ.LJJIFFI(spanned.getSpans(spanStart, spanStart + 1, C416760GVu.class))) != null ? r9.getSize(r10, spanned, spanStart, r13, fontMetricsInt) : 0) <= C439101nJ.LIZ(4) + width) {
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                }
                function2.invoke(C13LP.LL(list, i), C13LP.LJJJJIZL(list, i));
                return true;
            }
        };
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        C2187701Ajg.LIZ(viewTreeObserver, onPreDrawListener, ViewTreeObserver.OnPreDrawListener.class);
    }

    public static int LIZIZ(Context context, CharSequence charSequence, int i, List list, TextView textView) {
        ViewGroup viewGroup;
        int width;
        int i2;
        int measuredWidth = (textView.getMeasuredWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        ViewParent parent = textView.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null && (width = viewGroup.getWidth()) > 0) {
            int paddingLeft = (width - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt != textView && childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i2 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    } else {
                        i2 = 0;
                    }
                    paddingLeft -= childAt.getMeasuredWidth() + i2;
                }
            }
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                paddingLeft -= marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
            }
            int paddingLeft2 = paddingLeft - (textView.getPaddingLeft() + textView.getPaddingRight());
            if (paddingLeft2 > measuredWidth) {
                measuredWidth = paddingLeft2;
            }
        }
        if (measuredWidth <= 0) {
            return list.size();
        }
        int iLIZ = measuredWidth - C439101nJ.LIZ(4);
        TextPaint paint = textView.getPaint();
        for (int size = list.size(); size > 0; size--) {
            CharSequence charSequenceLJ = LJ(context, charSequence, i, C13LP.LL(list, size), null);
            if (charSequenceLJ != charSequence && ((int) Layout.getDesiredWidth(charSequenceLJ, 0, charSequenceLJ.length(), paint)) <= iLIZ) {
                return size;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence LJ(android.content.Context r12, java.lang.CharSequence r13, int r14, java.util.List r15, kotlin.jvm.functions.Function1 r16) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447580Hgq.LJ(android.content.Context, java.lang.CharSequence, int, java.util.List, kotlin.jvm.functions.Function1):java.lang.CharSequence");
    }

    public static CharSequence LIZLLL(final Context context, final CharSequence charSequence, final int i, final List list, final List list2, final TextView textView, final Function1 function1, final Function2 function2, boolean z) {
        int maxLines;
        if (textView == null) {
            function2.invoke(list, C13LP.LJJJJIZL(list2, list.size()));
            return LJ(context, charSequence, i, list, function1);
        }
        if (!z && ((Build.VERSION.SDK_INT >= 29 && textView.isSingleLine()) || (maxLines = textView.getMaxLines()) == 1 || (maxLines > 0 && maxLines != Integer.MAX_VALUE && textView.getEllipsize() != null))) {
            if (textView.getMeasuredWidth() <= 0) {
                final long jLIZ = LIZ(textView);
                final ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0Hgr
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public final boolean onPreDraw() {
                            ViewTreeObserver viewTreeObserver2 = viewTreeObserver.isAlive() ? viewTreeObserver : textView.getViewTreeObserver();
                            if (viewTreeObserver2.isAlive()) {
                                viewTreeObserver2.removeOnPreDrawListener(this);
                                C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnPreDrawListener.class);
                            }
                            Object tag = textView.getTag(R.id.knt);
                            Long l = tag instanceof Long ? (Long) tag : null;
                            long j = jLIZ;
                            if (l == null || l.longValue() != j || textView.getMeasuredWidth() <= 0) {
                                return true;
                            }
                            C447580Hgq c447580Hgq = C447580Hgq.LIZ;
                            Context context2 = context;
                            CharSequence charSequence2 = charSequence;
                            int i2 = i;
                            List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list3 = list;
                            TextView textView2 = textView;
                            c447580Hgq.getClass();
                            int iLIZIZ = C447580Hgq.LIZIZ(context2, charSequence2, i2, list3, textView2);
                            if (iLIZIZ <= 0) {
                                Function2<List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem>, List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem>, Unit> function22 = function2;
                                if (function22 != null) {
                                    function22.invoke(C13BV.INSTANCE, list2);
                                }
                                return true;
                            }
                            CharSequence charSequenceLJ = C447580Hgq.LJ(context, charSequence, i, C13LP.LL(list, iLIZIZ), function1);
                            if (charSequenceLJ != charSequence) {
                                textView.setText(charSequenceLJ);
                                TextView textView3 = textView;
                                long j2 = jLIZ;
                                List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list4 = list2;
                                Function2<List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem>, List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem>, Unit> function23 = function2;
                                c447580Hgq.getClass();
                                C447580Hgq.LJI(textView3, j2, list4, function23);
                                if (function1 != null) {
                                    TextView textView4 = textView;
                                    c447580Hgq.getClass();
                                    C447580Hgq.LJFF(textView4);
                                }
                            } else {
                                Function2<List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem>, List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem>, Unit> function24 = function2;
                                if (function24 != null) {
                                    function24.invoke(C13BV.INSTANCE, list2);
                                    return true;
                                }
                            }
                            return true;
                        }
                    };
                    viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
                    C2187701Ajg.LIZ(viewTreeObserver, onPreDrawListener, ViewTreeObserver.OnPreDrawListener.class);
                }
                return charSequence;
            }
            long jLIZ2 = LIZ(textView);
            int iLIZIZ = LIZIZ(context, charSequence, i, list, textView);
            if (iLIZIZ <= 0) {
                function2.invoke(C13BV.INSTANCE, list2);
                return charSequence;
            }
            CharSequence charSequenceLJ = LJ(context, charSequence, i, C13LP.LL(list, iLIZIZ), function1);
            if (charSequenceLJ != charSequence) {
                LJI(textView, jLIZ2, list2, function2);
                LJFF(textView);
                return charSequenceLJ;
            }
            function2.invoke(C13BV.INSTANCE, list2);
            return charSequenceLJ;
        }
        long jLIZ3 = LIZ(textView);
        CharSequence charSequenceLJ2 = LJ(context, charSequence, i, list, function1);
        if (charSequenceLJ2 != charSequence) {
            LJI(textView, jLIZ3, list2, function2);
            LJFF(textView);
            return charSequenceLJ2;
        }
        function2.invoke(C13BV.INSTANCE, list2);
        return charSequenceLJ2;
    }
}
