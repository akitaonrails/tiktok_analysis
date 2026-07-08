package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0vcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749180vcS {
    public static final C1749180vcS LIZ = new C1749180vcS();
    public static final WeakHashMap<ViewGroup, View> LIZIZ = new WeakHashMap<>();

    public static boolean LJ(MotionEvent motionEvent, ViewGroup viewGroup) {
        WeakHashMap<ViewGroup, View> weakHashMap = LIZIZ;
        View view = weakHashMap.get(viewGroup);
        if (view == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            weakHashMap.remove(viewGroup);
            return true;
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            view.performClick();
        }
        weakHashMap.remove(viewGroup);
        return true;
    }

    public static View LIZJ(int i, int i2, View view) {
        if (view.getId() == R.id.jsh && view.getVisibility() == 0) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect) && rect.contains(i, i2)) {
                return view;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View viewLIZJ = LIZJ(i, i2, viewGroup.getChildAt(i3));
                if (viewLIZJ != null) {
                    return viewLIZJ;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(android.view.ViewGroup r7, android.view.ViewGroup r8, android.view.MotionEvent r9) {
        /*
            int r0 = r9.getAction()
            r6 = 0
            r3 = 1
            if (r0 != 0) goto L4e
            if (r8 == 0) goto L4e
            X.0vcS r0 = X.C1749180vcS.LIZ
            r0.getClass()
            float r0 = r9.getRawX()
            int r5 = (int) r0
            float r0 = r9.getRawY()
            int r4 = (int) r0
            boolean r0 = r8 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L3a
            r2 = r8
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            float r1 = r9.getX()
            float r0 = r9.getY()
            android.view.View r0 = r2.findChildViewUnder(r1, r0)
            if (r0 == 0) goto L3a
            android.view.View r0 = LIZJ(r5, r4, r0)
            if (r0 == 0) goto L4e
        L34:
            java.util.WeakHashMap<android.view.ViewGroup, android.view.View> r1 = X.C1749180vcS.LIZIZ
            r1.put(r7, r0)
            return r3
        L3a:
            int r2 = r8.getChildCount()
            r1 = 0
        L3f:
            if (r1 >= r2) goto L4e
            android.view.View r0 = r8.getChildAt(r1)
            android.view.View r0 = LIZJ(r5, r4, r0)
            if (r0 != 0) goto L34
            int r1 = r1 + 1
            goto L3f
        L4e:
            int r1 = r9.getAction()
            r0 = 3
            if (r1 == r0) goto L5b
            int r0 = r9.getAction()
            if (r0 != r3) goto L60
        L5b:
            java.util.WeakHashMap<android.view.ViewGroup, android.view.View> r0 = X.C1749180vcS.LIZIZ
            r0.remove(r7)
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1749180vcS.LIZLLL(android.view.ViewGroup, android.view.ViewGroup, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x018c A[Catch: all -> 0x01b3, CancellationException -> 0x01b8, TryCatch #2 {CancellationException -> 0x01b8, all -> 0x01b3, blocks: (B:61:0x016c, B:63:0x0172, B:65:0x0178, B:68:0x0183, B:70:0x0193, B:66:0x017d, B:69:0x018c), top: B:80:0x016c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r16, com.bytedance.tux.input.TuxTextView r17, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1749180vcS.LIZIZ(android.content.Context, com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[Catch: all -> 0x0072, CancellationException -> 0x0080, TryCatch #2 {CancellationException -> 0x0080, all -> 0x0072, blocks: (B:9:0x002a, B:11:0x002e, B:13:0x0034, B:16:0x003f, B:18:0x004f, B:14:0x0039, B:17:0x0048), top: B:28:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r9, com.bytedance.tux.input.TuxTextView r10, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag r11, int r12, int r13, int r14, int r15) {
        /*
            r2 = r10
            if (r11 == 0) goto L85
            r0 = 0
            X.C12ES.LJIILL(r0, r2)
            int r12 = r12 + r14
            int r0 = -r12
            X.C0H9H.LJI(r0, r2)
            int r13 = r13 + r15
            int r0 = -r13
            X.C0H9H.LIZLLL(r0, r2)
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r3 = r11.text
            java.lang.String r4 = "hot_selling_tag_tips"
            r5 = 0
            r7 = 0
            r8 = 28
            r6 = r5
            android.text.SpannableStringBuilder r0 = X.C03C8.LIZ(r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L28
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
        L24:
            r2.setText(r0)
            goto L2a
        L28:
            r0 = r5
            goto L24
        L2a:
            com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor r1 = r11.backgroundColor     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            if (r1 == 0) goto L48
            boolean r0 = X.C1744700vVE.LJ(r9, r5)     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            if (r0 == 0) goto L39
            java.lang.String r0 = r1.getDarkColor()     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            goto L3d
        L39:
            java.lang.String r0 = r1.getColor()     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
        L3d:
            if (r0 == 0) goto L48
            int r0 = X.C0HEZ.LIZIZ(r0)     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            goto L4f
        L48:
            r0 = 2131100455(0x7f060327, float:1.7813292E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r9)     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
        L4f:
            X.0F3z r1 = new X.0F3z     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            r1.<init>()     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            r1.LIZ = r0     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            float r0 = X.C418440Gaw.LIZIZ(r0)     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            r1.LIZJ = r0     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            android.graphics.drawable.Drawable r0 = r1.LIZ(r9)     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            r2.setBackground(r0)     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            r0 = 17
            r2.setGravity(r0)     // Catch: java.lang.Throwable -> L72 java.util.concurrent.CancellationException -> L80
            goto L76
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L76:
            irm.AkS63S0200000_26 r1 = new irm.AkS63S0200000_26
            r0 = 2
            r1.<init>(r11, r9, r0)
            X.C786410Ut5.I7(r1, r2)
            return
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L85:
            X.C0H1U.LIZIZ(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1749180vcS.LIZ(android.content.Context, com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag, int, int, int, int):void");
    }
}
