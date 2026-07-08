package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14Xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20280514Xb extends AbstractC20284914Yt implements InterfaceC20284714Yr {
    public Context LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public SmartImageView LLJJ;
    public TuxTextView LLJJI;
    public RecyclerView LLJJIII;
    public TuxTextView LLJJIJI;
    public C197039127h LLJJIJIIJIL;
    public ViewStub LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public C19409710wh<Option> LLJJJJLIIL;
    public Option LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public C20284114Yl LLJLILLLLZIIL;
    public long LLJLL;
    public int LLJJL = -1;
    public EnumC19410610wq LLJL = EnumC19410610wq.DEFAULT;
    public final ViewOnClickListenerC20283014Ya LLJLLIL = new View.OnClickListener() { // from class: X.14Ya
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C20280514Xb c20280514Xb;
            Option option;
            String aid;
            String aid2;
            if (view.getId() == R.id.cvd && (option = (c20280514Xb = this.LL).LLJJLIIIJLLLLLLLZ) != null) {
                Option[] optionArr = {option};
                C692060RCq.LIZIZ(c20280514Xb.LL);
                C20287114Zp c20287114Zp = C20287114Zp.LIZ;
                Aweme aweme = c20280514Xb.LL;
                EnumC20283814Yi enumC20283814Yi = EnumC20283814Yi.SUBMIT;
                int type = enumC20283814Yi.getType();
                c20287114Zp.getClass();
                C20287114Zp.LIZJ(type, aweme, optionArr);
                C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
                C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
                Aweme aweme2 = c20280514Xb.LL;
                String aid3 = null;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ.LIZIZ(aid);
                if (c20283314YdLIZIZ == null) {
                    c20283314YdLIZIZ = new C20283314Yd();
                }
                c20280514Xb.LJIILJJIL(c20283314YdLIZIZ, enumC20283814Yi, optionArr);
                C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
                Aweme aweme3 = c20280514Xb.LL;
                if (aweme3 != null) {
                    aid2 = aweme3.getAid();
                } else {
                    aid2 = null;
                }
                c20285414YyLIZ2.LJII(aid2, new C14Z2(c20280514Xb.LLILZ, false));
                C14XX c14xx = new C14XX();
                c14xx.LIZ = this.LL.LLJJL;
                c14xx.LIZIZ = true;
                C20285414Yy c20285414YyLIZ3 = C988000bok.LIZ();
                Aweme aweme4 = this.LL.LL;
                if (aweme4 != null) {
                    aid3 = aweme4.getAid();
                }
                c20285414YyLIZ3.LJI(aid3, c14xx);
                this.LL.LJIJI(true);
                C19409710wh<Option> c19409710wh = this.LL.LLJJJJLIIL;
                if (c19409710wh != null) {
                    c19409710wh.LLILLJJLI = false;
                    c19409710wh.notifyDataSetChanged();
                }
                C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "survey_submit", this.LL.LL));
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIIZ(2131849337);
                c1389890mGx.LJIIJJI();
            }
        }
    };

    @Override // X.InterfaceC690490R6p
    public final void LIZJ() {
        this.LLJJL = -1;
        View view = this.LLJIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLJJJJ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LLJJJJJIL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LLJILJILJ;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
            C786410Ut5.T4(view5, 1.0f);
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        C19409710wh<Option> c19409710wh = this.LLJJJJLIIL;
        if (c19409710wh != null) {
            c19409710wh.LL = -1;
            c19409710wh.notifyDataSetChanged();
        }
        LJIJI(true);
        C20284114Yl c20284114YlLJIL = LJIL();
        if (c20284114YlLJIL != null) {
            c20284114YlLJIL.LIZJ();
        }
        this.LLJL = EnumC19410610wq.DEFAULT;
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC20284714Yr
    public final void LIZIZ() {
        View view = this.LLJILJILJ;
        if (view != null) {
            C19409710wh<Option> c19409710wh = this.LLJJJJLIIL;
            if (c19409710wh != null) {
                c19409710wh.LL = -1;
                c19409710wh.notifyDataSetChanged();
            }
            C786410Ut5.LJLLLLLL(0, view);
            view.animate().alpha(1.0f).setDuration(200L).start();
        }
    }

    @Override // X.InterfaceC690490R6p
    public final void LJI() {
        View view = this.LLJJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJJJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLJJJJJIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJIILIIL() {
        Aweme aweme = this.LL;
        if (aweme == null || !AwemeBizExtKt.isSubAweme(aweme)) {
            return;
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
        c197039127h.setEnabled(true);
        c197039127h.setClickable(true);
        C786410Ut5.LLLLLLJ(c197039127h, 0);
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
        if (this.LLJLILLLLZIIL == null && this.LLJLIL) {
            this.LLJLILLLLZIIL = new C20284114Yl();
        }
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC690490R6p
    public final boolean isShowing() {
        View view = this.LLJIJIL;
        return view != null && view.getVisibility() == 0;
    }

    public final void LJIJI(boolean z) {
        C197039127h c197039127h = this.LLJJIJIIJIL;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
            c197039127h.setClickable(false);
            int i = this.LLILZIL;
            c197039127h.setButtonVariant(2);
            c197039127h.setText(2131849337);
        }
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJ(Aweme aweme, boolean z) {
        View view;
        if (this.LL != null && (view = this.LLJILJILJ) != null) {
            if (view.getVisibility() != 0 && this.LLJLIL) {
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
            if (view.getVisibility() != 0 && this.LLJLIL) {
                C20284114Yl c20284114YlLJIL = LJIL();
                if (c20284114YlLJIL != null) {
                    c20284114YlLJIL.LJIIJJI(EnumC20283814Yi.SWIPE, this.LL, false);
                    return;
                }
                return;
            }
            super.LJIIJJI(EnumC20283814Yi.SWIPE, this.LL, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03a6  */
    @Override // X.InterfaceC690490R6p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.view.ViewStub r22, android.content.Context r23, com.ss.android.ugc.aweme.feed.model.Aweme r24, android.view.View r25, android.view.View r26, android.view.View r27, android.view.View r28, boolean r29, X.AbstractC19368810q6 r30) {
        /*
            Method dump skipped, instruction units count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20280514Xb.LJIIJ(android.view.ViewStub, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View, android.view.View, android.view.View, android.view.View, boolean, X.10q6):void");
    }
}
