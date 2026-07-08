package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.sticker.EcommerceStickerModel;
import com.ss.android.ugc.aweme.sticker.data.EcommerceStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;

/* JADX INFO: renamed from: X.11kf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19589911kf extends AbstractC19589811ke<EcommerceStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        int i = C19590011kg.LIZ[LJ().LIZ.ordinal()];
        if (i == 1) {
            final C19EG c19eg = LJ().LIZLLL;
            final C19591211ks c19591211ksLJ = LJ();
            return new AbstractC19584411jm<EcommerceStickerModel>(c19eg, c19591211ksLJ) { // from class: X.11k8
                public final FrameLayout LLILZIL;
                public final C1322110kVd LLILZLL;
                public final TuxTextView LLIZ;

                @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
                public View getView() {
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(com.ss.android.ugc.aweme.ecommerce.sticker.EcommerceStickerModel r8) {
                    /*
                        r7 = this;
                        r4 = 0
                        if (r8 == 0) goto L55
                        com.ss.android.ugc.aweme.sticker.data.EcommerceStickerStruct r6 = r8.getEcommerceSticker()
                        if (r6 == 0) goto L56
                        com.ss.android.ugc.aweme.sticker.data.EcommerceStickerTitle r5 = r6.getTitle()
                        if (r5 == 0) goto L57
                        java.lang.String r3 = r5.text
                        if (r3 == 0) goto L57
                        boolean r0 = kotlin.text.a0.LJJJIL(r3)
                        r0 = r0 ^ 1
                        if (r0 == 0) goto L57
                    L1b:
                        r2 = 8
                        if (r3 != 0) goto L53
                        r1 = 8
                    L21:
                        int r0 = r7.getVisibility()
                        r7.setVisibility(r1)
                        X.C1602160rnK.LIZIZ(r0, r1, r7)
                        com.bytedance.tux.input.TuxTextView r0 = r7.LLIZ
                        if (r3 == 0) goto L30
                        r2 = 0
                    L30:
                        X.C786410Ut5.LLLLZLL(r0, r2)
                        com.bytedance.tux.input.TuxTextView r0 = r7.LLIZ
                        if (r3 != 0) goto L39
                        java.lang.String r3 = ""
                    L39:
                        r0.setText(r3)
                        com.bytedance.tux.input.TuxTextView r1 = r7.LLIZ
                        if (r5 == 0) goto L50
                        java.lang.Integer r0 = r5.textFont
                        if (r0 == 0) goto L50
                        int r0 = r0.intValue()
                    L48:
                        r1.setTuxFont(r0)
                        com.bytedance.tux.input.TuxTextView r3 = r7.LLIZ
                        if (r5 == 0) goto L59
                        goto L5b
                    L50:
                        r0 = 62
                        goto L48
                    L53:
                        r1 = 0
                        goto L21
                    L55:
                        r6 = r4
                    L56:
                        r5 = r4
                    L57:
                        r3 = r4
                        goto L1b
                    L59:
                        r1 = r4
                        goto L67
                    L5b:
                        java.lang.String r0 = r5.textColor     // Catch: java.lang.Throwable -> L6b
                        if (r0 == 0) goto L59
                        int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Throwable -> L6b
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L6b
                    L67:
                        X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L6b
                        goto L77
                    L6b:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        X.00Yq r1 = new X.00Yq
                        r1.<init>(r0)
                        X.C189200o6.m2constructorimpl(r1)
                    L77:
                        boolean r0 = X.C189200o6.m7isFailureimpl(r1)
                        if (r0 == 0) goto L7e
                        r1 = r4
                    L7e:
                        java.lang.Integer r1 = (java.lang.Integer) r1
                        r2 = -1
                        if (r1 == 0) goto La0
                        int r0 = r1.intValue()
                    L87:
                        r3.setTextColor(r0)
                        X.0kVd r1 = r7.LLILZLL
                        r0 = 0
                        r1.setAspectRatio(r0)
                        X.0kVd r1 = r7.LLILZLL
                        if (r6 == 0) goto L9c
                        com.ss.android.ugc.aweme.sticker.data.EcommerceStickerBg r0 = r6.getBg()
                        if (r0 == 0) goto L9c
                        java.lang.String r4 = r0.url
                    L9c:
                        X.C1324750kZt.LJIIIZ(r1, r4, r2, r2)
                        return
                    La0:
                        r0 = -1
                        goto L87
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C19586611k8.LIZIZ(com.ss.android.ugc.aweme.ecommerce.sticker.EcommerceStickerModel):void");
                }

                {
                    super(0, c19eg, null, c19591211ksLJ);
                    FrameLayout frameLayout = new FrameLayout(c19eg);
                    frameLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
                    this.LLILZIL = frameLayout;
                    C1322110kVd c1322110kVd = new C1322110kVd(c19eg);
                    c1322110kVd.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    this.LLILZLL = c1322110kVd;
                    TuxTextView tuxTextView = new TuxTextView(c19eg, null, 6, 0);
                    tuxTextView.setGravity(17);
                    tuxTextView.setMaxLines(2);
                    tuxTextView.setTextColor(-1);
                    tuxTextView.setTextAlignment(4);
                    tuxTextView.setIncludeFontPadding(false);
                    this.LLIZ = tuxTextView;
                    addView(c1322110kVd, new FrameLayout.LayoutParams(-1, -1));
                    addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayout.addView(tuxTextView, layoutParams);
                    LIZIZ(null);
                }

                @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
                public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
                    EcommerceStickerModel ecommerceStickerModel;
                    if (stickerModel instanceof EcommerceStickerModel) {
                        ecommerceStickerModel = (EcommerceStickerModel) stickerModel;
                    } else {
                        ecommerceStickerModel = null;
                    }
                    LIZIZ(ecommerceStickerModel);
                }
            };
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        final C19EG c19eg2 = LJ().LIZLLL;
        final C19591211ks c19591211ksLJ2 = LJ();
        return new AbstractC19584411jm<EcommerceStickerModel>(c19eg2, c19591211ksLJ2) { // from class: X.11k8
            public final FrameLayout LLILZIL;
            public final C1322110kVd LLILZLL;
            public final TuxTextView LLIZ;

            @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
            public View getView() {
                return this;
            }

            public final void LIZIZ(EcommerceStickerModel v) {
                /*
                    this = this;
                    r4 = 0
                    if (r8 == 0) goto L55
                    com.ss.android.ugc.aweme.sticker.data.EcommerceStickerStruct r6 = r8.getEcommerceSticker()
                    if (r6 == 0) goto L56
                    com.ss.android.ugc.aweme.sticker.data.EcommerceStickerTitle r5 = r6.getTitle()
                    if (r5 == 0) goto L57
                    java.lang.String r3 = r5.text
                    if (r3 == 0) goto L57
                    boolean r0 = kotlin.text.a0.LJJJIL(r3)
                    r0 = r0 ^ 1
                    if (r0 == 0) goto L57
                L1b:
                    r2 = 8
                    if (r3 != 0) goto L53
                    r1 = 8
                L21:
                    int r0 = r7.getVisibility()
                    r7.setVisibility(r1)
                    X.C1602160rnK.LIZIZ(r0, r1, r7)
                    com.bytedance.tux.input.TuxTextView r0 = r7.LLIZ
                    if (r3 == 0) goto L30
                    r2 = 0
                L30:
                    X.C786410Ut5.LLLLZLL(r0, r2)
                    com.bytedance.tux.input.TuxTextView r0 = r7.LLIZ
                    if (r3 != 0) goto L39
                    java.lang.String r3 = ""
                L39:
                    r0.setText(r3)
                    com.bytedance.tux.input.TuxTextView r1 = r7.LLIZ
                    if (r5 == 0) goto L50
                    java.lang.Integer r0 = r5.textFont
                    if (r0 == 0) goto L50
                    int r0 = r0.intValue()
                L48:
                    r1.setTuxFont(r0)
                    com.bytedance.tux.input.TuxTextView r3 = r7.LLIZ
                    if (r5 == 0) goto L59
                    goto L5b
                L50:
                    r0 = 62
                    goto L48
                L53:
                    r1 = 0
                    goto L21
                L55:
                    r6 = r4
                L56:
                    r5 = r4
                L57:
                    r3 = r4
                    goto L1b
                L59:
                    r1 = r4
                    goto L67
                L5b:
                    java.lang.String r0 = r5.textColor     // Catch: java.lang.Throwable -> L6b
                    if (r0 == 0) goto L59
                    int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Throwable -> L6b
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L6b
                L67:
                    X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L6b
                    goto L77
                L6b:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    X.00Yq r1 = new X.00Yq
                    r1.<init>(r0)
                    X.C189200o6.m2constructorimpl(r1)
                L77:
                    boolean r0 = X.C189200o6.m7isFailureimpl(r1)
                    if (r0 == 0) goto L7e
                    r1 = r4
                L7e:
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    r2 = -1
                    if (r1 == 0) goto La0
                    int r0 = r1.intValue()
                L87:
                    r3.setTextColor(r0)
                    X.0kVd r1 = r7.LLILZLL
                    r0 = 0
                    r1.setAspectRatio(r0)
                    X.0kVd r1 = r7.LLILZLL
                    if (r6 == 0) goto L9c
                    com.ss.android.ugc.aweme.sticker.data.EcommerceStickerBg r0 = r6.getBg()
                    if (r0 == 0) goto L9c
                    java.lang.String r4 = r0.url
                L9c:
                    X.C1324750kZt.LJIIIZ(r1, r4, r2, r2)
                    return
                La0:
                    r0 = -1
                    goto L87
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19586611k8.LIZIZ(com.ss.android.ugc.aweme.ecommerce.sticker.EcommerceStickerModel):void");
            }

            {
                super(0, c19eg2, null, c19591211ksLJ2);
                FrameLayout frameLayout = new FrameLayout(c19eg2);
                frameLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
                this.LLILZIL = frameLayout;
                C1322110kVd c1322110kVd = new C1322110kVd(c19eg2);
                c1322110kVd.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.LLILZLL = c1322110kVd;
                TuxTextView tuxTextView = new TuxTextView(c19eg2, null, 6, 0);
                tuxTextView.setGravity(17);
                tuxTextView.setMaxLines(2);
                tuxTextView.setTextColor(-1);
                tuxTextView.setTextAlignment(4);
                tuxTextView.setIncludeFontPadding(false);
                this.LLIZ = tuxTextView;
                addView(c1322110kVd, new FrameLayout.LayoutParams(-1, -1));
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                frameLayout.addView(tuxTextView, layoutParams);
                LIZIZ(null);
            }

            @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
            public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
                EcommerceStickerModel ecommerceStickerModel;
                if (stickerModel instanceof EcommerceStickerModel) {
                    ecommerceStickerModel = (EcommerceStickerModel) stickerModel;
                } else {
                    ecommerceStickerModel = null;
                }
                LIZIZ(ecommerceStickerModel);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    @Override // X.AbstractC19589811ke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19589911kf.LIZ(android.view.View):void");
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        BaseStickerModel baseStickerModel = new BaseStickerModel(0, 0, EnumC1466150oFx.ECOMMERCE, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null);
        EcommerceStickerStruct ecommerceStickerStruct = interactStickerStruct.getEcommerceStickerStruct();
        if (ecommerceStickerStruct == null) {
            ecommerceStickerStruct = new EcommerceStickerStruct(null, null, null);
        }
        return new EcommerceStickerModel(baseStickerModel, ecommerceStickerStruct, false);
    }
}
