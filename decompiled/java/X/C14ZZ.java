package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS112S0100000_12;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14ZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZZ extends AbstractC20284914Yt implements InterfaceC690000R4s, InterfaceC20284714Yr {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public View LLJI;
    public C0SUT LLJIJIL;
    public SmartImageView LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public C20286814Zm LLJJIJI;
    public int LLJJIJIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJJ;
    public boolean LLJJJIL;
    public final C786220Usm LLJJJJJIL;
    public final C11W6 LLJJJJLIIL;
    public boolean LLJJL;
    public final C20293414aq LLJJIJIIJIL = new C20293414aq("background");
    public final ACListenerS163S0100000_29 LLJJJJ = new ACListenerS163S0100000_29(this, 224);

    @Override // X.AbstractC20284914Yt, X.InterfaceC690490R6p
    public final void LIZLLL() {
        this.LLJJJIL = false;
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC20289914aH
    public final void LJFF() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIIIZZ() {
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJIIJJI(EnumC20283814Yi enumC20283814Yi, Aweme aweme, boolean z) {
    }

    @Override // X.InterfaceC20284714Yr
    public final void LIZIZ() {
        C0SUT c0sut = this.LLJIJIL;
        if (c0sut == null) {
            return;
        }
        C786410Ut5.V(c0sut, 0);
        c0sut.animate().alpha(1.0f).setDuration(200L).start();
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZJ() {
        View view;
        View view2 = this.LLJI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLJILLL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LLJJI;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LLJJIII;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        C0SUT c0sut = this.LLJIJIL;
        if (c0sut != null) {
            C786410Ut5.V(c0sut, 0);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0sut);
            c0sut.setAlpha(1.0f);
        }
        C20286814Zm c20286814Zm = this.LLJJIJI;
        if (c20286814Zm == null || (view = c20286814Zm.LJJIJIIJI) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view);
        C786410Ut5.T4(view, 1.0f);
    }

    @Override // X.InterfaceC690490R6p
    public final void LJI() {
        View view = this.LLJILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLJJIII;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC20289914aH
    public final void LJIIIZ() {
        String aid;
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        if (C586380MzE.LIZ().LIZIZ("homepage_hot")) {
            C1440005kM.LIZ(new C714060Rzg(false, EnumC1616310sA9.OTHER_EXIT.getType(), "", "homepage_hot"));
        }
        Aweme aweme = this.LL;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            C20291314aV.LIZ.getClass();
            C20291314aV.LJIIIIZZ.add(aid);
        }
        LJIILIIL();
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJIILIIL() {
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        c20285414YyLIZ.LJII(aweme != null ? aweme.getAid() : null, new C14Z2(this.LLILZ, true));
        C20291314aV c20291314aV = C20291314aV.LIZ;
        Aweme aweme2 = this.LL;
        c20291314aV.getClass();
        C20291314aV.LJIILJJIL(aweme2);
    }

    public final void LJIJI() {
        C20286814Zm c20286814Zm = this.LLJJIJI;
        if (c20286814Zm == null || !c20286814Zm.LJIJJ) {
            return;
        }
        c20286814Zm.LJJ(1.0f, 0.0f, false);
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        if (c20285414YyLIZ.LIZLLL(this.LLILZ, aweme != null ? aweme.getAid() : null)) {
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme2 = this.LL;
            C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ2.LIZIZ(aweme2 != null ? aweme2.getAid() : null);
            if (c20283314YdLIZIZ == null) {
                c20283314YdLIZIZ = new C20283314Yd();
            }
            C20285414Yy c20285414YyLIZ3 = C988000bok.LIZ();
            Aweme aweme3 = this.LL;
            c20285414YyLIZ3.LJFF(aweme3 != null ? aweme3.getAid() : null, c20283314YdLIZIZ);
        }
        this.LLJJJIL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    @Override // X.AbstractC20284914Yt, X.InterfaceC20289914aH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean So() {
        /*
            r7 = this;
            X.14aV r1 = X.C20291314aV.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LL
            r1.getClass()
            boolean r0 = X.C20291314aV.LJIIIIZZ(r0)
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L73
            java.util.HashSet<java.lang.String> r1 = X.C20291314aV.LJIIIIZZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LL
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.getAid()
        L19:
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 != 0) goto L73
            r4 = 0
        L20:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LL
            boolean r3 = X.C692060RCq.LIZ(r0)
            X.14aq r2 = r7.LLJJIJIIJIL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "needTrans, outOfFrequncy = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", isDisabled = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", showSet = "
            r1.append(r0)
            java.util.HashSet<java.lang.String> r0 = X.C20291314aV.LJIIIIZZ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LL
            r2.LJIIJ(r1, r0)
            if (r4 == 0) goto L75
            if (r3 != 0) goto L75
            java.lang.Boolean r1 = r7.LLIZLLLIL
            if (r1 == 0) goto L5f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L75
        L5f:
            int r0 = r7.LLJJIJIL
            if (r0 > 0) goto L68
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LL
            r7.LJIL(r0)
        L68:
            boolean r0 = X.C2529109vd.LIZ
            if (r0 == 0) goto L76
            int r0 = r7.LLJJIJIL
            if (r0 > 0) goto L76
            return r5
        L71:
            r0 = 0
            goto L19
        L73:
            r4 = 1
            goto L20
        L75:
            r6 = 0
        L76:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14ZZ.So():boolean");
    }

    @Override // X.InterfaceC690490R6p
    public final boolean isShowing() {
        View view = this.LLJI;
        return view != null && view.getVisibility() == 0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.11W6] */
    public C14ZZ() {
        C622680Oba.LIZJ(this);
        this.LLJJJJJIL = new C786220Usm(this, 4);
        this.LLJJJJLIIL = new InterfaceC1141530foN() { // from class: X.11W6
            @Override // X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
                C14ZZ c14zz = this.LL;
                c14zz.LJIL(c14zz.LL);
            }
        };
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690490R6p
    public final void LIZ() {
        super.LIZ();
        C622680Oba.LIZLLL(this);
        if (C2552409zO.LIZ) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            }
            this.LLJJJ = null;
        }
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690490R6p
    public final void LJJLJLI() {
        super.LJJLJLI();
        C20286814Zm c20286814Zm = this.LLJJIJI;
        View view = c20286814Zm != null ? c20286814Zm.LJJIJIIJI : null;
        if (this.LLJJJIL && isShowing() && view != null) {
            C786410Ut5.T4(view, 0.0f);
        }
        C1548820qPI.LIZLLL("PGC-IN-FEED-SURVEY-REMOVE-VIDEO", this.LLJJJJJIL);
        C1548820qPI.LIZLLL("PGC-IN-FEED-SURVEY-PAGE-SHOW", this.LLJJJJLIIL);
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690490R6p
    public final void g2() {
        super.g2();
        C1548820qPI.LJIIIIZZ("PGC-IN-FEED-SURVEY-REMOVE-VIDEO", this.LLJJJJJIL);
        C1548820qPI.LJIIIIZZ("PGC-IN-FEED-SURVEY-PAGE-SHOW", this.LLJJJJLIIL);
    }

    public static float LJIJJ(Aweme aweme) {
        if (aweme == null) {
            return 0.0f;
        }
        if (C735370Ssx.LJJIJIL(aweme)) {
            if (C0HCN.LIZ()) {
                return C418440Gaw.LIZIZ(68);
            }
            return C418440Gaw.LIZIZ(100);
        }
        if (C0HCN.LIZ()) {
            return C418440Gaw.LIZIZ(90);
        }
        return C418440Gaw.LIZIZ(130);
    }

    public static float LJIJJLI(Aweme aweme) {
        if (aweme == null) {
            return 0.0f;
        }
        if (C735370Ssx.LJJIJIL(aweme)) {
            if (C0HCN.LIZ()) {
                return C418440Gaw.LIZIZ(90);
            }
            return C418440Gaw.LIZIZ(130);
        }
        if (C0HCN.LIZ()) {
            return C418440Gaw.LIZIZ(68);
        }
        return C418440Gaw.LIZIZ(100);
    }

    @Override // X.AbstractC20284914Yt
    public final void LJII(Aweme aweme) {
        if (!Intrinsics.LJFF(this.LL, aweme)) {
            this.LLJJJIL = false;
        }
        super.LJII(aweme);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(com.ss.android.ugc.aweme.feed.model.Aweme r14) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14ZZ.LJIL(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @C14EU
    public final void onFeedScrollToNextEvent(C483280IxK c483280IxK) {
        String str;
        String aid;
        SurveyInfo surveyInfo;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        C692060RCq.LIZIZ(this.LL);
        C20291314aV c20291314aV = C20291314aV.LIZ;
        Aweme aweme = this.LL;
        if (aweme == null || (surveyInfo = aweme.getSurveyInfo()) == null || (str = surveyInfo.surveyKey) == null) {
            str = "";
        }
        c20291314aV.getClass();
        C20291314aV.LJIIL(str);
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme2 = this.LL;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        c20285414YyLIZ.LJII(aid, new C14Z2(this.LLILZ, false));
        C622680Oba.LIZLLL(this);
        C786410Ut5.LJJZZIII(new BPEAHandler(), new ARunnableS112S0100000_12(this, 351));
        LIZJ();
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJ(Aweme aweme, boolean z) {
        String aid;
        if (z) {
            C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
            C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
            Aweme aweme2 = this.LL;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (c20285414YyLIZ.LIZLLL(C14Z5.BACKGROUND.getType(), aid) && !C20552315bV.LIZIZ) {
                C20552315bV.LIZ = System.currentTimeMillis();
                C20552315bV.LIZIZ = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02ba  */
    @Override // X.InterfaceC690490R6p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.view.ViewStub r18, android.content.Context r19, final com.ss.android.ugc.aweme.feed.model.Aweme r20, android.view.View r21, android.view.View r22, android.view.View r23, android.view.View r24, boolean r25, X.AbstractC19368810q6 r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14ZZ.LJIIJ(android.view.ViewStub, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View, android.view.View, android.view.View, android.view.View, boolean, X.10q6):void");
    }
}
