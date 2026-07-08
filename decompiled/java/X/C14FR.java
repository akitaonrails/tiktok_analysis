package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.tako.detail.related.config.TakoRelatedViewEnabledEnterFromConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14FR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14FR implements InterfaceC1350790lFt {
    public static final C14FR LIZ = new C14FR();
    public static Boolean LIZIZ;
    public static volatile Drawable.ConstantState LIZJ;

    @Override // X.InterfaceC1350790lFt
    public final Drawable LIZIZ() {
        Drawable.ConstantState constantState = LIZJ;
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // X.InterfaceC1350790lFt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ() {
        /*
            r3 = this;
            java.lang.Boolean r0 = X.C14FR.LIZIZ
            if (r0 == 0) goto L4e
            boolean r0 = r0.booleanValue()
        L8:
            r2 = 1
            if (r0 == 0) goto L4c
            boolean r0 = X.C07J7.LIZ()
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            com.ss.android.ugc.aweme.AccountUserService r0 = (com.ss.android.ugc.aweme.AccountUserService) r0
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L4c
            X.14TO r0 = X.C14TO.LIZ
            r0.getClass()
            X.01GW r0 = X.C14TO.LJFF
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4c
            r1 = 1
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C14FR.LIZIZ = r0
            if (r1 == 0) goto L53
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L53
            boolean r0 = X.C1843207Ju.LIZ()
            if (r0 == 0) goto L53
            return r2
        L4c:
            r1 = 0
            goto L31
        L4e:
            boolean r0 = X.C07G5.LIZ()
            goto L8
        L53:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14FR.LJIIIIZZ():boolean");
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LJII() {
        if (!LJIIIIZZ() || ((Boolean) C1099404Rs.LIZ.getValue()).booleanValue()) {
            return false;
        }
        C14TO.LIZ.getClass();
        return !((Boolean) C14TO.LJ.getValue()).booleanValue() && C123100dR.LIZ(C14TF.LIZIZ.LJJLIIIJLLLLLLLZ());
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LJIIJJI() {
        return C07OI.LIZ() && C123100dR.LIZ(C14TF.LIZIZ.LJJLIIIJLLLLLLLZ());
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LJIILIIL() {
        return LJIIIIZZ() && C123100dR.LIZ(C14TF.LIZIZ.LJJLIIIJLLLLLLLZ());
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LJIILLIIL() {
        return C1148304eP.LIZ() && C123100dR.LIZ(C14TF.LIZIZ.LJJLIIIJLLLLLLLZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    @Override // X.InterfaceC1350790lFt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C326730CrP
            if (r0 == 0) goto L43
            r4 = r6
            X.0CrP r4 = (X.C326730CrP) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L49
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L35
            boolean r0 = X.C300940Bqu.LIZ()
            if (r0 != 0) goto L35
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L35:
            r1 = 0
            goto L30
        L37:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r1
            java.lang.Object r3 = r5.LJIIZILJ(r4)
            if (r3 != r2) goto L22
            return r2
        L43:
            X.0CrP r4 = new X.0CrP
            r4.<init>(r5, r6)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14FR.LIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LIZJ(Aweme aweme) {
        if (!AwemeSaaSExtKt.isLive(aweme) && !C1ER1.LIZIZ.LJJII().LJFF(aweme)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LIZLLL(String str) {
        if (!Intrinsics.LJFF(str, "homepage_hot") && !Intrinsics.LJFF(str, "general_search")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LJ(C2189821An6 c2189821An6) {
        String eventType;
        String eventType2;
        if (((Number) C18047074z.LIZ.getValue()).intValue() != 0 && LJIILIIL()) {
            C14TO.LIZ.getClass();
            if (!((Boolean) C14TO.LIZLLL.getValue()).booleanValue() && C07J7.LIZ() && !C300940Bqu.LIZ()) {
                String eventType3 = null;
                if (c2189821An6 != null) {
                    eventType = c2189821An6.getEventType();
                } else {
                    eventType = null;
                }
                if (!Intrinsics.LJFF(eventType, "homepage_hot") || ((Boolean) C1099304Rr.LIZ.getValue()).booleanValue()) {
                    if (c2189821An6 != null) {
                        eventType2 = c2189821An6.getEventType();
                    } else {
                        eventType2 = null;
                    }
                    if (!Intrinsics.LJFF(eventType2, "general_search") || ((((Boolean) C0AZ8.LIZ.getValue()).booleanValue() && ((Boolean) C1865730yeR.LIZIZ.getValue()).booleanValue()) || C0AXY.LIZ())) {
                        if (c2189821An6 != null) {
                            eventType3 = c2189821An6.getEventType();
                        }
                        if (!Intrinsics.LJFF(eventType3, "playlist") || !Intrinsics.LJFF(c2189821An6.getPlaylistPreviousPage(), "general_search") || C0AXY.LIZ()) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LJFF(Aweme aweme) {
        if (!aweme.isAd() && !AwemeSaaSExtKt.isLive(aweme) && !C1ER1.LIZIZ.LJJII().LJFF(aweme)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LJI(C2189821An6 c2189821An6) {
        if (C1148304eP.LIZ() || ((Number) C18047074z.LIZ.getValue()).intValue() != 0 || !LJIIL(c2189821An6)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LJIIJ(String str) {
        if (str == null) {
            return false;
        }
        return TakoRelatedViewEnabledEnterFromConfig.LIZ(str);
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LJIIL(C2189821An6 c2189821An6) {
        String eventType;
        String eventType2;
        C14TO.LIZ.getClass();
        if (((Boolean) C14TO.LIZLLL.getValue()).booleanValue() || !C07J7.LIZ() || C300940Bqu.LIZ()) {
            return false;
        }
        String eventType3 = null;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        if (!Intrinsics.LJFF(eventType, "homepage_hot") || ((Boolean) C1099304Rr.LIZ.getValue()).booleanValue()) {
            if (c2189821An6 != null) {
                eventType2 = c2189821An6.getEventType();
            } else {
                eventType2 = null;
            }
            if (!Intrinsics.LJFF(eventType2, "general_search") || ((((Boolean) C0AZ8.LIZ.getValue()).booleanValue() && ((Boolean) C1865730yeR.LIZIZ.getValue()).booleanValue()) || C0AXY.LIZ())) {
                if (c2189821An6 != null) {
                    eventType3 = c2189821An6.getEventType();
                }
                if (!Intrinsics.LJFF(eventType3, "playlist") || !Intrinsics.LJFF(c2189821An6.getPlaylistPreviousPage(), "general_search") || C0AXY.LIZ()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LJIILL(C2189821An6 c2189821An6) {
        String eventType;
        String eventType2;
        String eventType3 = null;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        if (!Intrinsics.LJFF(eventType, "homepage_hot")) {
            if (c2189821An6 != null) {
                eventType2 = c2189821An6.getEventType();
            } else {
                eventType2 = null;
            }
            if (!Intrinsics.LJFF(eventType2, "general_search")) {
                if (c2189821An6 != null) {
                    eventType3 = c2189821An6.getEventType();
                }
                if (Intrinsics.LJFF(eventType3, "playlist") && Intrinsics.LJFF(c2189821An6.getPlaylistPreviousPage(), "general_search")) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14FR.LJIIZILJ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LJIIIZ(Aweme aweme, String str) {
        IFamilyPairingService iFamilyPairingServiceLJIIL;
        if (aweme != null && !C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme)) && !C10EU.LJIILL(aweme.getAuthor(), C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme)))) {
            CommentService.LIZ.getClass();
            if (!C523420Kfs.LIZ().LJIILLIIL(aweme) && C523420Kfs.LIZ().LJJIJIIJIL(aweme)) {
                C735280Sso.LIZ.getClass();
                if (C735280Sso.LJI(aweme) && !Intrinsics.LJFF(str, "selfharm") && (((iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL()) == null || !iFamilyPairingServiceLJIIL.LJIIIZ()) && C07IL.LIZ() != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC1350790lFt
    public final boolean LJIILJJIL(Aweme aweme, C2189821An6 c2189821An6) {
        if (C1148304eP.LIZ() || ((Number) C18047074z.LIZ.getValue()).intValue() != 0) {
            return false;
        }
        C14TO.LIZ.getClass();
        if (((Boolean) C14TO.LIZLLL.getValue()).booleanValue() || !LJIILIIL() || C300940Bqu.LIZ()) {
            return false;
        }
        if (((C298790BnR.LIZ() & 2) == 0 && !LJFF(aweme)) || !LJIILL(c2189821An6)) {
            return false;
        }
        return true;
    }
}
