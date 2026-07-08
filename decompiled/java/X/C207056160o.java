package X;

import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.160o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207056160o {
    public static final int LJIJI;
    public static final int LJIJJ;
    public static final int LJIJJLI;
    public static final int LJIL;
    public final FrameLayout LIZ;
    public final AnonymousClass1615 LIZIZ;
    public final EnumC207058160q LIZJ;
    public C160B LIZLLL;
    public String LJ;
    public AbstractC991170btr LJI;
    public final AnonymousClass1611 LJII;
    public final Context LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIILJJIL;
    public View LJIILL;
    public View LJIILLIIL;
    public final C01GW LJFF = C452501pT.LIZIZ(new C207057160p(this));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C207063160v(this));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new C207065160x(this));
    public final C01GW LJIIL = C452501pT.LIZIZ(new C207066160y(this));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new C207064160w(this));
    public int LJIIZILJ = -1;
    public int LJIJ = -1;

    public static int LIZ() {
        C01GW c01gw = C0AFX.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 2) {
            return 103;
        }
        if (((Number) c01gw.getValue()).intValue() == 3) {
            return 33;
        }
        return ((Number) c01gw.getValue()).intValue() == 1 ? 43 : 53;
    }

    public final C0SK1 LIZIZ() {
        C21415018rM c21415018rM = (C21415018rM) this.LIZ.findViewById(R.id.ddj);
        if (c21415018rM == null) {
            return C0SK1.VIEW_NOT_INFLATED;
        }
        if (c21415018rM.getVisibility() != 0) {
            return C0SK1.TEXT_VIEW_NOT_VISIBLE;
        }
        if (LIZJ().getVisibility() != 0) {
            return C0SK1.ROOT_VIEW_NOT_VISIBLE;
        }
        if (this.LIZ.getVisibility() != 0) {
            return C0SK1.CONTAINER_VIEW_NOT_VISIBLE;
        }
        if (!LJ()) {
            return C0SK1.CAPTION_STATE_NOT_DISPLAYED;
        }
        Layout textLayout = c21415018rM.getTextLayout();
        return textLayout == null ? C0SK1.TEXT_LAYOUT_NOT_SET : textLayout.getText().length() > 0 ? C0SK1.SUCCESS : C0SK1.CONTENT_IS_EMPTY;
    }

    public final ConstraintLayout LIZJ() {
        return (ConstraintLayout) this.LJIIJ.getValue();
    }

    public final C417230GXp LIZLLL() {
        return (C417230GXp) this.LJIIJJI.getValue();
    }

    public final boolean LJ() {
        AbstractC991170btr abstractC991170btr = this.LJI;
        return (abstractC991170btr instanceof C991160btq) && C123100dR.LIZ(((C991160btq) abstractC991170btr).LIZ);
    }

    static {
        int iLIZJ;
        if (C300980Bqy.LIZ()) {
            iLIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        } else {
            C844470XAv.LIZ.getClass();
            iLIZJ = (int) C12ES.LIZJ(16.0f, C844470XAv.LIZ());
        }
        LJIJI = iLIZJ;
        C844470XAv.LIZ.getClass();
        LJIJJ = (int) C12ES.LIZJ(72.0f, C844470XAv.LIZ());
        LJIJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(406));
        LJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    }

    public C207056160o(FrameLayout frameLayout, AnonymousClass1615 anonymousClass1615, EnumC207058160q enumC207058160q, String str) {
        this.LIZ = frameLayout;
        this.LIZIZ = anonymousClass1615;
        this.LIZJ = enumC207058160q;
        this.LJ = str;
        this.LJII = new AnonymousClass1611(frameLayout, anonymousClass1615);
        this.LJIIIIZZ = frameLayout.getContext();
    }

    public final void LJFF(String str, C160B c160b, String str2, boolean z) {
        AbstractC991170btr c991160btq;
        C991160btq c991160btq2;
        String str3;
        boolean z2;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        if (str != null) {
            this.LJ = str;
        }
        C160B c160b2 = this.LIZLLL;
        if (c160b2 != c160b) {
            if (c160b2 != null) {
                ICLAPerfETService iCLAPerfETServiceLIZ = C1485670olR.LIZ();
                String str4 = this.LJ;
                if (str4 == null) {
                    str4 = "";
                }
                iCLAPerfETServiceLIZ.LJIIIIZZ(str4, c160b);
            }
            this.LIZLLL = c160b;
        }
        int i = C207055160n.LIZIZ[c160b.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                if (str2 != null && str2.length() != 0) {
                    c991160btq = new C991160btq(str2, z);
                } else {
                    c991160btq = new AbstractC991170btr() { // from class: X.0bts
                    };
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            c991160btq = new AbstractC991170btr() { // from class: X.0bts
            };
        }
        if (Intrinsics.LJFF(c991160btq, this.LJI)) {
            return;
        }
        this.LJI = c991160btq;
        if (!this.LJIIIZ && !Intrinsics.LJFF(c991160btq, new AbstractC991170btr() { // from class: X.0bts
        })) {
            this.LJIIIZ = true;
            C786410Ut5.LJLLJ(this.LJIIIIZZ, R.layout.adg, this.LIZ);
            EnumC207058160q enumC207058160q = this.LIZJ;
            if (LIZJ() != null) {
                EnumC207058160q enumC207058160q2 = EnumC207058160q.PORTRAIT_CENTER_ALIGN_NATIVE_LAYOUT;
                if (enumC207058160q != enumC207058160q2) {
                    LIZJ().setBackgroundResource(R.drawable.aot);
                    if (C277170Atf.LIZ() != 1 && C277170Atf.LIZ() != 3) {
                        float f = C715390S4j.LIZ;
                        C715390S4j.LIZJ(2, LIZJ());
                    } else {
                        LIZJ().setBackgroundResource(R.drawable.awr);
                    }
                    float f2 = C715390S4j.LIZ;
                    C715390S4j.LIZIZ(4, LIZJ());
                }
                if (enumC207058160q != EnumC207058160q.PORTRAIT_CENTER_ALIGN && enumC207058160q != enumC207058160q2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    ViewGroup.LayoutParams layoutParams3 = this.LIZ.getLayoutParams();
                    if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                        layoutParams2.gravity = 81;
                        layoutParams2.setMarginEnd(0);
                        layoutParams2.setMarginStart(0);
                        C786410Ut5.a6(this.LIZ, layoutParams2);
                    }
                }
                int i3 = C207055160n.LIZ[enumC207058160q.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3 && i3 != 4) {
                            if (i3 == 5) {
                                C786410Ut5.LLLLZIL((C21415018rM) this.LJIIL.getValue(), 8);
                                C417230GXp c417230GXpLIZLLL = LIZLLL();
                                int visibility = c417230GXpLIZLLL.getVisibility();
                                c417230GXpLIZLLL.setVisibility(0);
                                C1602160rnK.LIZIZ(visibility, 0, c417230GXpLIZLLL);
                                LIZLLL().setTuxFont(103);
                                LIZLLL().setNeedStroke(true);
                                C19MB c19mb = new C19MB();
                                c19mb.LJII(LIZJ());
                                c19mb.LJIIIIZZ(R.id.ddi, 4, R.id.dcg, 3);
                                c19mb.LIZIZ(LIZJ());
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            this.LJIILJJIL = true;
                            C786410Ut5.LLLLZIL((C21415018rM) this.LJIIL.getValue(), 0);
                            C417230GXp c417230GXpLIZLLL2 = LIZLLL();
                            int visibility2 = c417230GXpLIZLLL2.getVisibility();
                            c417230GXpLIZLLL2.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility2, 8, c417230GXpLIZLLL2);
                        }
                    }
                } else {
                    C417230GXp c417230GXpLIZLLL3 = LIZLLL();
                    c417230GXpLIZLLL3.setMaxWidth(LJIJJLI);
                    c417230GXpLIZLLL3.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    c417230GXpLIZLLL3.setTextAlignment(4);
                    LIZLLL().setTuxFont(LIZ());
                    ViewGroup.LayoutParams layoutParams4 = this.LIZ.getLayoutParams();
                    if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
                        layoutParams.gravity = 81;
                        layoutParams.setMarginEnd(0);
                        layoutParams.setMarginStart(0);
                        C786410Ut5.a6(this.LIZ, layoutParams);
                    }
                }
            }
            C786410Ut5.Y7(LIZJ(), new ACListenerS165S0100000_31(this, 4));
        }
        if (this.LJIIIZ) {
            AbstractC991170btr abstractC991170btr = this.LJI;
            if ((abstractC991170btr instanceof C991160btq) && (c991160btq2 = (C991160btq) abstractC991170btr) != null && (str3 = c991160btq2.LIZ) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Testing :: captionText: ");
                sbLIZ.append(str3);
                sbLIZ.append(" \n");
                System.out.print((Object) C2188811AlT.LIZIZ(sbLIZ));
                EnumC207058160q enumC207058160q3 = this.LIZJ;
                if (enumC207058160q3 != null && enumC207058160q3 != EnumC207058160q.LANDSCAPE && enumC207058160q3 != EnumC207058160q.PORTRAIT_NON_FC2 && enumC207058160q3 != EnumC207058160q.PORTRAIT_CENTER_ALIGN_NATIVE_LAYOUT) {
                    ((C444830HcP) this.LJFF.getValue()).LJIILIIL(str3);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, this.LJIIIIZZ);
                    if (numLIZJ != null) {
                        ((C444830HcP) this.LJFF.getValue()).LJIILJJIL(numLIZJ.intValue());
                    }
                    Layout layoutLIZJ = C444830HcP.LIZJ((C444830HcP) this.LJFF.getValue(), C0C64.LJIILLIIL().LJIILL(31744, "caption_balancer", true, 0.0f), true, null, 28);
                    if (layoutLIZJ.getLineCount() > 3) {
                        layoutLIZJ = ((C444830HcP) this.LJFF.getValue()).LIZIZ();
                    }
                    ((C21415018rM) this.LJIIL.getValue()).setTextLayout(layoutLIZJ);
                } else {
                    LIZLLL().setText(str3);
                    LIZLLL().setTuxFont(LIZ());
                }
            }
        }
        if (this.LJIIIZ) {
            AbstractC991170btr abstractC991170btr2 = this.LJI;
            if (!Intrinsics.LJFF(abstractC991170btr2, new AbstractC991170btr() { // from class: X.0bts
            }) && abstractC991170btr2 != null) {
                if (abstractC991170btr2 instanceof C991160btq) {
                    if (!this.LJIILJJIL) {
                        LIZLLL().setTextColorRes(R.attr.ee);
                    }
                    C786410Ut5.LL(0, LIZJ());
                    LIZJ().setClickable(true);
                    TuxTextView tuxTextView = (TuxTextView) this.LJIILIIL.getValue();
                    if (!((C991160btq) abstractC991170btr2).LIZIZ) {
                        i2 = 8;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView, i2);
                    return;
                }
                throw new C1954807lC();
            }
            ConstraintLayout constraintLayoutLIZJ = LIZJ();
            if (constraintLayoutLIZJ == null) {
                return;
            }
            C786410Ut5.LL(8, constraintLayoutLIZJ);
        }
    }
}
