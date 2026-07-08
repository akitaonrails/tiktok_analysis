package X;

import Y.ARunnableS7S0500000_10;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: X.0P6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639530P6p {
    public static final C639530P6p LIZ = new C639530P6p();
    public static final C11NJ LIZIZ = new C11NJ();
    public static int LIZJ;
    public static final int LIZLLL;

    static {
        C0P5N.LIZ.getClass();
        LIZLLL = C0P5N.LIZIZ.preOffset;
    }

    public static void LIZIZ(Context context, AbstractC683590Qrd abstractC683590Qrd, RecyclerView recyclerView, boolean z) {
        List data;
        if (z) {
            LIZJ = 0;
        }
        RecyclerView.LayoutManager layoutManager = null;
        if (recyclerView != null) {
            layoutManager = recyclerView.getLayoutManager();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            if (abstractC683590Qrd != null && (data = abstractC683590Qrd.getData()) != null) {
                LIZ.getClass();
                C118300cf c118300cf = new C118300cf();
                c118300cf.element = iFindLastVisibleItemPosition;
                if (iFindLastVisibleItemPosition < 0) {
                    c118300cf.element = 0;
                }
                int size = data.size();
                C118300cf c118300cf2 = new C118300cf();
                int i = c118300cf.element + LIZLLL;
                c118300cf2.element = i;
                if (i >= size) {
                    c118300cf2.element = size - 1;
                }
                int i2 = c118300cf2.element;
                int i3 = LIZJ;
                if (i2 > i3) {
                    if (c118300cf.element <= i3) {
                        c118300cf.element = i3 + 1;
                    }
                    LIZJ = c118300cf2.element;
                    C0P5N.LIZ.getClass();
                    if (C0P5N.LIZIZ.enableSingleThread) {
                        C823050WQl.LIZJ().execute(new ARunnableS7S0500000_10(c118300cf, c118300cf2, data, context, abstractC683590Qrd, 1));
                    } else {
                        LIZ(c118300cf.element, c118300cf2.element, data, context, abstractC683590Qrd);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(int r18, int r19, java.util.List r20, android.content.Context r21, X.AbstractC683590Qrd r22) {
        /*
            r1 = r19
            r2 = r18
            if (r2 > r1) goto Lb8
        L6:
            r3 = r20
            int r0 = r3.size()
            if (r2 >= r0) goto L99
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r2)
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r4 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r4
            int r3 = r4.getFeedType()
            r0 = 65514(0xffea, float:9.1805E-41)
            if (r3 != r0) goto L99
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r4.getDynamicPatch()
            r12 = 0
            if (r0 == 0) goto Lb5
            java.lang.String r0 = r0.getBulletSchema()
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La8
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r4.getDynamicPatch()
            if (r0 == 0) goto Lb3
            java.lang.String r11 = r0.schema
        L36:
            X.0PaW r8 = X.C647500PaW.LIZ
            java.lang.String r6 = ""
            if (r11 != 0) goto La6
            r0 = r6
        L3d:
            r8.getClass()
            boolean r0 = X.C647500PaW.LJIILLIIL(r0)
            if (r0 == 0) goto L99
            X.0P6q r0 = X.C639540P6q.LIZ
            r0.getClass()
            X.01GW r5 = X.C639540P6q.LIZJ
            java.lang.Object r0 = r5.getValue()
            com.ss.android.ugc.aweme.search.lynx.core.config.LynxNonFirstScreenPreLayoutConfig r0 = (com.ss.android.ugc.aweme.search.lynx.core.config.LynxNonFirstScreenPreLayoutConfig) r0
            int r0 = r0.enablePraLayoutWithCommonParams
            r3 = 1
            r7 = r22
            if (r0 != r3) goto La4
            boolean r0 = r7 instanceof X.C645130PSd
            if (r0 == 0) goto La4
            r0 = r7
            X.0PSd r0 = (X.C645130PSd) r0
            if (r0 == 0) goto La4
            java.util.Map r13 = r0.LLLLIILL(r2, r4)
        L67:
            boolean r0 = r7 instanceof X.C645130PSd
            if (r0 == 0) goto La2
            r0 = r7
            X.0PSd r0 = (X.C645130PSd) r0
            if (r0 == 0) goto La2
            androidx.fragment.app.Fragment r10 = r0.LLILZIL
        L72:
            if (r11 != 0) goto L75
            r11 = r6
        L75:
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r4.getDynamicPatch()
            if (r0 == 0) goto L7f
            java.lang.String r12 = r0.getRawData()
        L7f:
            X.0PGG r15 = X.C0PGG.FINAL_RAW_DATA
            X.0PGD r16 = X.C0PGD.NON_FIRST_SCREEN
            r17 = 0
            java.lang.Object r0 = r5.getValue()
            com.ss.android.ugc.aweme.search.lynx.core.config.LynxNonFirstScreenPreLayoutConfig r0 = (com.ss.android.ugc.aweme.search.lynx.core.config.LynxNonFirstScreenPreLayoutConfig) r0
            int r0 = r0.enablePraLayoutWithoutParallelFetchResource
            if (r0 != r3) goto L9f
            r18 = 1
        L91:
            r19 = 256(0x100, float:3.59E-43)
            r14 = 1
            r9 = r21
            X.C647500PaW.LJJIFFI(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L99:
            if (r2 == r1) goto Lb8
            int r2 = r2 + 1
            goto L6
        L9f:
            r18 = 0
            goto L91
        La2:
            r10 = r12
            goto L72
        La4:
            r13 = r12
            goto L67
        La6:
            r0 = r11
            goto L3d
        La8:
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r4.getDynamicPatch()
            if (r0 == 0) goto Lb3
            java.lang.String r11 = r0.getBulletSchema()
            goto L36
        Lb3:
            r11 = r12
            goto L36
        Lb5:
            r0 = r12
            goto L28
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C639530P6p.LIZ(int, int, java.util.List, android.content.Context, X.0Qrd):void");
    }
}
