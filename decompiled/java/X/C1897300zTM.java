package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0zTM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897300zTM implements InterfaceC690020R4u {
    public View LIZ;
    public C1322110kVd LIZIZ;
    public TuxTextView LIZJ;
    public C1295960jpS LIZLLL;
    public TuxTextView LJ;
    public FrameLayout LJFF;
    public ReferralFeedBanner LJI;
    public View LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public boolean LJIIJJI;
    public Context LJIIL;
    public int LJIILIIL = -1;

    @Override // X.InterfaceC690020R4u
    public final void LIZIZ() {
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("is_click", this.LJIIJJI ? "1" : CardStruct.IStatusCode.DEFAULT);
            interfaceC1897260zTILIZIZ.LIZ("screen_time_banner_disappear", linkedHashMap);
        }
        C1295960jpS c1295960jpS = this.LIZLLL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LIZLLL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.clearAnimation();
        }
        this.LJIIJJI = false;
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZJ() {
        View view = this.LIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LJII;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LJIIIZ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LJIIJ;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LJIIIIZZ;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    @Override // X.InterfaceC690020R4u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r7 = this;
            com.bytedance.touchpoint.api.model.ReferralFeedBanner r1 = r7.LJI
            r0 = 0
            if (r1 == 0) goto L23
            java.util.List<com.bytedance.touchpoint.api.model.FeedCommonPicture> r2 = r1.feedCommonPictures
            if (r2 == 0) goto L23
            int r1 = r7.LJIILIIL
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r1)
            com.bytedance.touchpoint.api.model.FeedCommonPicture r1 = (com.bytedance.touchpoint.api.model.FeedCommonPicture) r1
        L11:
            r4 = 0
            if (r1 == 0) goto L5e
            com.bytedance.touchpoint.api.model.Animation r5 = r1.animation
            if (r5 == 0) goto L5e
            java.lang.String r1 = r5.LIZ
            if (r1 == 0) goto L97
            int r1 = r1.length()
            if (r1 == 0) goto L97
            goto L25
        L23:
            r1 = r0
            goto L11
        L25:
            X.0VSP r2 = new X.0VSP     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r5.LIZ     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            X.0jpS r3 = r7.LIZLLL     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L48
            java.lang.String r0 = r5.lottieMd5     // Catch: java.lang.Throwable -> L4c
            X.0jj7 r2 = X.C1294250jmh.LJ(r2, r0)     // Catch: java.lang.Throwable -> L4c
            X.0IE1 r1 = new X.0IE1     // Catch: java.lang.Throwable -> L4c
            r0 = 4
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L4c
            r2.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4c
            X.0T3m r0 = new X.0T3m     // Catch: java.lang.Throwable -> L4c
            r0.<init>()     // Catch: java.lang.Throwable -> L4c
            r2.LIZ(r0)     // Catch: java.lang.Throwable -> L4c
            r0 = r3
        L48:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L4c
            goto L58
        L4c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L58:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto L97
        L5e:
            X.0jpS r0 = r7.LIZLLL
            if (r0 == 0) goto L65
            r0.playAnimation()
        L65:
            com.bytedance.touchpoint.api.model.ReferralFeedBanner r0 = r7.LJI
            if (r0 == 0) goto L95
            int r2 = r0.LIZ
            java.lang.Integer r0 = r0.LIZJ
            if (r0 == 0) goto L73
            int r4 = r0.intValue()
        L73:
            Y.ACallableS3S0002000_11 r1 = new Y.ACallableS3S0002000_11
            r0 = 1
            r1.<init>(r2, r4, r0)
            X.C15O7.LIZJ(r1)
            com.bytedance.touchpoint.api.model.ReferralFeedBanner r1 = r7.LJI
            if (r1 == 0) goto L94
            X.0zOY r0 = X.C1894320zOY.LIZ
            int r1 = r1.LIZ
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r3 = 0
            java.lang.String r6 = ""
            r0.getClass()
            r4 = r3
            r5 = r3
            X.C1894320zOY.LJIJJ(r1, r2, r3, r4, r5, r6)
        L94:
            return
        L95:
            r2 = 0
            goto L73
        L97:
            X.0jpS r0 = r7.LIZLLL
            if (r0 == 0) goto L9e
            r0.setRepeatCount(r4)
        L9e:
            X.0jpS r0 = r7.LIZLLL
            if (r0 == 0) goto La5
            r0.setFrame(r4)
        La5:
            X.0jpS r2 = r7.LIZLLL
            if (r2 == 0) goto Lb3
            Y.ALAdapterS23S0100000_28 r1 = new Y.ALAdapterS23S0100000_28
            r0 = 11
            r1.<init>(r7, r0)
            r2.addAnimatorListener(r1)
        Lb3:
            X.0jpS r1 = r7.LIZLLL
            if (r1 == 0) goto Lbc
            X.0T1d<T> r0 = new X.InterfaceC1292040jj8() { // from class: X.0T1d
                static {
                    /*
                        X.0T1d r0 = new X.0T1d
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0T1d<T>) X.0T1d.LL X.0T1d
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C740030T1d.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C740030T1d.<init>():void");
                }

                @Override // X.InterfaceC1292040jj8
                public final /* bridge */ /* synthetic */ void onResult(java.lang.Object r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C740030T1d.onResult(java.lang.Object):void");
                }
            }
            r1.setFailureListener(r0)
        Lbc:
            X.0jpS r1 = r7.LIZLLL
            if (r1 == 0) goto L5e
            java.lang.String r0 = r5.LIZ
            r1.setImageAssetsFolder(r0)
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1897300zTM.LIZLLL():void");
    }

    @Override // X.InterfaceC690020R4u
    public final boolean isShowing() {
        View view = this.LIZ;
        return view != null && view.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0126  */
    @Override // X.InterfaceC690020R4u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.ViewStub r13, java.lang.String r14, android.content.Context r15, int r16, android.view.View r17, android.view.View r18, android.view.View r19, android.view.View r20, final java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1897300zTM.LIZ(android.view.ViewStub, java.lang.String, android.content.Context, int, android.view.View, android.view.View, android.view.View, android.view.View, java.lang.String):void");
    }
}
