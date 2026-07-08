package X;

import Y.ACListenerS164S0100000_30;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.14XZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14XZ extends AbstractC20284914Yt implements InterfaceC20284714Yr {
    public static int LLLF;
    public Context LLJI;
    public View LLJIJIL;
    public C0SUT LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public SmartImageView LLJJ;
    public TuxTextView LLJJI;
    public RecyclerView LLJJIII;
    public TuxTextView LLJJIJI;
    public C197039127h LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public ViewStub LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public C20286814Zm LLJJL;
    public C19409710wh<Option> LLJJLIIIJLLLLLLLZ;
    public Option LLJLIL;
    public boolean LLJLL;
    public long LLJLLIL;
    public C20284114Yl LLJZ;
    public int LLJL = -1;
    public final EnumC19410610wq LLJLILLLLZIIL = EnumC19410610wq.BACKGROUND;
    public final C20293414aq LLJLLL = new C20293414aq("background");
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 348));
    public final ACListenerS164S0100000_30 LLL = new ACListenerS164S0100000_30(this, 37);

    @Override // X.InterfaceC690490R6p
    public final void LIZJ() {
        this.LLJL = -1;
        View view = this.LLJIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLJJJJJIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LLJJJJLIIL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LLJILJILJ;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
            C786410Ut5.T4(view5, 1.0f);
        }
        this.LLJLIL = null;
        C19409710wh<Option> c19409710wh = this.LLJJLIIIJLLLLLLLZ;
        if (c19409710wh != null) {
            c19409710wh.LL = -1;
            c19409710wh.notifyDataSetChanged();
        }
        C20284114Yl c20284114YlLJIL = LJIL();
        if (c20284114YlLJIL != null) {
            c20284114YlLJIL.LIZJ();
        }
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC20284714Yr
    public final void LIZIZ() {
        View view = this.LLJILJILJ;
        if (view == null) {
            return;
        }
        C19409710wh<Option> c19409710wh = this.LLJJLIIIJLLLLLLLZ;
        if (c19409710wh != null) {
            c19409710wh.LL = -1;
            c19409710wh.notifyDataSetChanged();
        }
        LJIJI(false);
        C786410Ut5.LJLLLLLL(0, view);
        view.animate().alpha(1.0f).setDuration(200L).start();
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC20289914aH
    public final void LJFF() {
        LJIIJJI(EnumC20283814Yi.SWIPE, this.LL, true);
    }

    @Override // X.InterfaceC690490R6p
    public final void LJI() {
        View view = this.LLJJJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJJJJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLJJJJLIIL;
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
        super.LJIILIIL();
    }

    public final void LJIJJ() {
        C197039127h c197039127h = this.LLJJIJIIJIL;
        if (c197039127h == null) {
            return;
        }
        int i = this.LLILZIL;
        if (i == 0 || i == 1) {
            c197039127h.setButtonVariant(0);
        } else if (i == 3 || i == 4) {
            c197039127h.setButtonVariant(EnumC1779710wPh.FIVE_LEVEL.getValue());
        }
        C786410Ut5.LLLLLLJ(c197039127h, 0);
        c197039127h.setEnabled(true);
        c197039127h.setClickable(true);
    }

    public final C14XX LJIJJLI() {
        String aid;
        Aweme aweme = this.LL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return null;
        }
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        return C988000bok.LIZ().LIZJ(aid);
    }

    public final C20284114Yl LJIL() {
        if (this.LLJZ == null && this.LLJLL) {
            this.LLJZ = new C20284114Yl();
        }
        return this.LLJZ;
    }

    public final void LJJ() {
        C20286814Zm c20286814Zm = this.LLJJL;
        if (c20286814Zm == null || !c20286814Zm.LJIJJ) {
            return;
        }
        C20552315bV.LIZIZ(this.LL);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // X.AbstractC20284914Yt, X.InterfaceC20289914aH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean So() {
        /*
            r6 = this;
            X.14aV r1 = X.C20291314aV.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LL
            r1.getClass()
            boolean r0 = X.C20291314aV.LJIIIIZZ(r0)
            r5 = 0
            if (r0 == 0) goto L56
            java.util.HashSet<java.lang.String> r1 = X.C20291314aV.LJIIIIZZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LL
            if (r0 == 0) goto L54
            java.lang.String r0 = r0.getAid()
        L18:
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 != 0) goto L56
            r4 = 0
        L1f:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LL
            boolean r3 = X.C692060RCq.LIZ(r0)
            X.14aq r2 = r6.LLJLLL
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
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LL
            r2.LJIIJ(r1, r0)
            if (r4 == 0) goto L53
            if (r3 != 0) goto L53
            r5 = 1
        L53:
            return r5
        L54:
            r0 = 0
            goto L18
        L56:
            r4 = 1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XZ.So():boolean");
    }

    @Override // X.InterfaceC690490R6p
    public final boolean isShowing() {
        View view = this.LLJIJIL;
        return view != null && view.getVisibility() == 0;
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJIILIIL() {
        super.LJIILIIL();
    }

    public final void LJIJI(boolean z) {
        C197039127h c197039127h = this.LLJJIJIIJIL;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
            c197039127h.setClickable(false);
            int i = this.LLILZIL;
            c197039127h.setButtonVariant(2);
            if (z) {
                c197039127h.setText(2131849337);
            }
        }
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJ(Aweme aweme, boolean z) {
        View view;
        if (aweme != null && (view = this.LLJILJILJ) != null) {
            if (view.getVisibility() != 0 && this.LLJLL) {
                C20284114Yl c20284114YlLJIL = LJIL();
                if (c20284114YlLJIL != null) {
                    c20284114YlLJIL.LJ(aweme, z);
                    return;
                }
                return;
            }
            super.LJ(aweme, z);
        }
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJIIJJI(EnumC20283814Yi enumC20283814Yi, Aweme aweme, boolean z) {
        View view;
        if (this.LL != null && (view = this.LLJILJILJ) != null) {
            if (view.getVisibility() != 0 && this.LLJLL) {
                C20284114Yl c20284114YlLJIL = LJIL();
                if (c20284114YlLJIL != null) {
                    c20284114YlLJIL.LJIIJJI(enumC20283814Yi, aweme, z);
                    return;
                }
                return;
            }
            super.LJIIJJI(enumC20283814Yi, aweme, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    @Override // X.InterfaceC690490R6p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.view.ViewStub r23, android.content.Context r24, com.ss.android.ugc.aweme.feed.model.Aweme r25, android.view.View r26, android.view.View r27, android.view.View r28, android.view.View r29, boolean r30, X.AbstractC19368810q6 r31) {
        /*
            Method dump skipped, instruction units count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XZ.LJIIJ(android.view.ViewStub, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View, android.view.View, android.view.View, android.view.View, boolean, X.10q6):void");
    }
}
