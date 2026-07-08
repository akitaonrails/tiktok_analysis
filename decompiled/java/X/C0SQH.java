package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SQH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQH extends FrameLayout {
    public float LL;
    public float LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public C0SQG LLIZ;
    public boolean LLIZLLLIL;

    private final int getTouchSlop() {
        return ((Number) this.LLILLL.getValue()).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (r1 != 3) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SQH.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0SQG c0sqg;
        if (this.LLIZLLLIL && (c0sqg = this.LLIZ) != null && motionEvent != null) {
            return c0sqg.LIZ(motionEvent, new AwS412S0200000_11(this, motionEvent, 9));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0SQG c0sqg;
        if (this.LLIZLLLIL && (c0sqg = this.LLIZ) != null && motionEvent != null) {
            return c0sqg.LIZIZ(motionEvent, new AwS412S0200000_11(this, motionEvent, 10));
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[EDGE_INSN: B:17:0x0043->B:18:0x0044 BREAK  A[LOOP:0: B:13:0x0021->B:43:?], PHI: r5
      0x0044: PHI (r5v3 boolean) = (r5v0 boolean), (r5v4 boolean) binds: [B:37:0x008d, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090 A[PHI: r5
      0x0090: PHI (r5v1 boolean) = (r5v0 boolean), (r5v3 boolean), (r5v3 boolean), (r5v3 boolean), (r5v3 boolean), (r5v3 boolean) binds: [B:37:0x008d, B:19:0x0048, B:21:0x004e, B:23:0x0052, B:25:0x0058, B:44:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setEnableLongPressInterceptor(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r6 = this;
            r4 = 1
            if (r7 == 0) goto L92
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.getAwemeRawAd()
            if (r0 == 0) goto L8c
            com.ss.android.ugc.aweme.commercialize.model.AnoleModel r0 = r0.getAnoleModel()
            if (r0 == 0) goto L8c
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel> r1 = r0.components
            if (r1 == 0) goto L8c
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L8c
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L21:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            X.01GW r0 = X.C1113104Wz.LIZJ
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r2.getValue()
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r0 = (com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel) r0
            java.lang.String r0 = r0.type
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L21
            r5 = 1
        L44:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.getAwemeRawAd()
            if (r0 == 0) goto L90
            com.ss.android.ugc.aweme.commercialize.model.AnoleModel r0 = r0.getAnoleModel()
            if (r0 == 0) goto L90
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel> r1 = r0.components
            if (r1 == 0) goto L90
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L90
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L62:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            X.01GW r0 = X.C303770BvT.LIZIZ
            java.lang.Object r1 = r0.getValue()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object r0 = r2.getValue()
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r0 = (com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel) r0
            java.lang.String r0 = r0.type
            boolean r0 = X.C13LQ.LJIILLIIL(r0, r1)
            if (r0 == 0) goto L62
            r0 = 1
        L85:
            if (r5 == 0) goto L92
            if (r0 != 0) goto L92
        L89:
            r6.LLIZLLLIL = r4
            return
        L8c:
            r5 = 0
            if (r7 == 0) goto L90
            goto L44
        L90:
            r0 = 0
            goto L85
        L92:
            r4 = 0
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SQH.setEnableLongPressInterceptor(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public C0SQH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1387));
    }
}
