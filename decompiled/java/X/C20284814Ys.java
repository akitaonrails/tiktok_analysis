package X;

import Y.ACListenerS164S0100000_30;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;

/* JADX INFO: renamed from: X.14Ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20284814Ys implements InterfaceC20284714Yr, InterfaceC690490R6p {
    public Context LL;
    public Aweme LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public SmartImageView LLIZLLLIL;
    public TuxTextView LLJ;
    public RecyclerView LLJI;
    public C197039127h LLJIJIL;
    public TuxTextView LLJILJIL;
    public ViewStub LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public C19409710wh<Option> LLJJIJI;
    public Option LLJJIJIL;
    public FeedSurvey LLJJJIL;
    public boolean LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public C20284114Yl LLJLIL;
    public int LLJJIJIIJIL = -1;
    public C14Z0 LLJJJ = C14Z0.FEED_TYPE;
    public String LLJJJJ = "";
    public String LLJJJJJIL = "";
    public EnumC19410610wq LLJJJJLIIL = EnumC19410610wq.DEFAULT;
    public final ACListenerS164S0100000_30 LLJLILLLLZIIL = new ACListenerS164S0100000_30(this, 39);

    @Override // X.InterfaceC690490R6p
    public final void LIZ() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZJ() {
        this.LLJJIJIIJIL = -1;
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJILLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLJJI;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LLJJIII;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LLILZLL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(8, view5);
            C786410Ut5.T4(view5, 0.0f);
        }
        View view6 = this.LLILZIL;
        if (view6 != null) {
            C786410Ut5.LJLLLLLL(0, view6);
            C786410Ut5.T4(view6, 1.0f);
        }
        this.LLJJIJIL = null;
        C19409710wh<Option> c19409710wh = this.LLJJIJI;
        if (c19409710wh != null) {
            c19409710wh.LL = -1;
            c19409710wh.notifyDataSetChanged();
        }
        LJII(true);
        C20284114Yl c20284114YlLJIILL = LJIILL();
        if (c20284114YlLJIILL != null) {
            c20284114YlLJIILL.LIZJ();
        }
        this.LLJJJJLIIL = EnumC19410610wq.DEFAULT;
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC20289914aH
    public final void LJFF() {
    }

    @Override // X.InterfaceC20289914aH
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LJJLJLI() {
    }

    @Override // X.InterfaceC20289914aH
    public final boolean So() {
        return false;
    }

    @Override // X.InterfaceC690490R6p
    public final void g2() {
    }

    @Override // X.InterfaceC20284714Yr
    public final void LIZIZ() {
        C20285114Yv c20285114Yv = C20285114Yv.LIZ;
        EnumC19410610wq enumC19410610wq = this.LLJJJJLIIL;
        c20285114Yv.getClass();
        View view = C20285114Yv.LJ(enumC19410610wq) ? this.LLILZIL : this.LLILZLL;
        if (view != null) {
            C19409710wh<Option> c19409710wh = this.LLJJIJI;
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

    @Override // X.InterfaceC690490R6p
    public final void LJIIIIZZ() {
        if (C14Z4.LJFF(this.LLILLJJLI) && this.LLJJJJLIIL == EnumC19410610wq.GREY_CARD && isShowing() && this.LLJJJ != C14Z0.LIVE_TYPE) {
            C20286614Zk.LJII();
        }
    }

    public final C14XX LJIILJJIL() {
        String aid;
        Aweme aweme = this.LLILLJJLI;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return null;
        }
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        return C988000bok.LIZ().LIZJ(aid);
    }

    public final C20284114Yl LJIILL() {
        if (this.LLJLIL == null && this.LLJJL) {
            this.LLJLIL = new C20284114Yl();
        }
        return this.LLJLIL;
    }

    @Override // X.InterfaceC690490R6p
    public final boolean isShowing() {
        View view = this.LLILLL;
        return view != null && view.getVisibility() == 0;
    }

    @Override // X.InterfaceC690000R4s
    public final void LJIILIIL() {
        if (isShowing()) {
            C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
            C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
            Aweme aweme = this.LLILLJJLI;
            C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ.LIZIZ(aweme != null ? aweme.getAid() : null);
            C14Z0 c14z0 = this.LLJJJ;
            int[] iArr = C20285514Yz.LIZ;
            int i = iArr[c14z0.ordinal()];
            if (i == 1 || i == 2) {
                C14Z7.LIZ.getClass();
                C14Z7.LJFF = true;
            } else {
                C20286614Zk.LIZ.getClass();
                C20286614Zk.LJ = true;
            }
            if (c20283314YdLIZIZ == null) {
                c20283314YdLIZIZ = new C20283314Yd();
            } else if (c20283314YdLIZIZ.LIZ) {
                return;
            }
            c20283314YdLIZIZ.LIZ = true;
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme2 = this.LLILLJJLI;
            c20285414YyLIZ2.LJFF(aweme2 != null ? aweme2.getAid() : null, c20283314YdLIZIZ);
            FeedSurvey feedSurvey = this.LLJJJIL;
            String str = feedSurvey != null ? feedSurvey.id : null;
            Aweme aweme3 = this.LLILLJJLI;
            int i2 = iArr[this.LLJJJ.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (aweme3 != null) {
                    aweme3.getAid();
                    AwemeExtKt.getAuthorUid(aweme3);
                    aweme3.getRequestId();
                }
                C20286614Zk.LJ = true;
                C20291314aV.LIZ.getClass();
                C20291314aV.LJIILJJIL(aweme3);
                C14ZT.LIZ.getClass();
                C14ZT.LJIIL(aweme3, str, "single_choice");
                return;
            }
            if (aweme3 != null) {
                aweme3.getAid();
                AwemeExtKt.getAuthorUid(aweme3);
                aweme3.getRequestId();
            }
            C14Z7 c14z7 = C14Z7.LIZ;
            C20291314aV.LIZ.getClass();
            C20291314aV.LJIILJJIL(aweme3);
            System.currentTimeMillis();
            C14ZT.LIZ.getClass();
            C14ZT.LJIIL(aweme3, str, "single_choice");
        }
    }

    public final void LJII(boolean z) {
        C197039127h c197039127h = this.LLJIJIL;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
            c197039127h.setClickable(false);
            c197039127h.setButtonVariant(2);
            c197039127h.setText(2131849337);
            if (this.LLJJJJLIIL == EnumC19410610wq.FORCE_VIDEO_NO_COVER) {
                C786410Ut5.w5(c197039127h, 0.4f);
            }
        }
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIL(C1049060dPE c1049060dPE) {
        C1049070dPF.LIZ(this, c1049060dPE);
    }

    @Override // X.InterfaceC690000R4s
    public final void LJ(Aweme aweme, boolean z) {
        View view;
        if (aweme == null) {
            return;
        }
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20283314Yd c20283314YdLIZIZ = C988000bok.LIZ().LIZIZ(aweme.getAid());
        if (c20283314YdLIZIZ == null) {
            c20283314YdLIZIZ = new C20283314Yd();
            C988000bok.LIZ().LJFF(aweme.getAid(), c20283314YdLIZIZ);
        }
        C20285114Yv c20285114Yv = C20285114Yv.LIZ;
        EnumC19410610wq enumC19410610wq = this.LLJJJJLIIL;
        c20285114Yv.getClass();
        if (C20285114Yv.LJ(enumC19410610wq)) {
            view = this.LLILZIL;
        } else {
            view = this.LLILZLL;
        }
        if (view != null) {
            if (view.getVisibility() != 0 && this.LLJJL) {
                if (c20283314YdLIZIZ.LJIIIZ) {
                    return;
                }
                C20284114Yl c20284114YlLJIILL = LJIILL();
                if (c20284114YlLJIILL != null) {
                    c20284114YlLJIILL.LJ(c20284114YlLJIILL.LL, z);
                }
                if (!z) {
                    c20283314YdLIZIZ.LJIIIZ = true;
                    return;
                }
                return;
            }
            if (c20283314YdLIZIZ.LJIIIIZZ) {
                return;
            }
            C20285114Yv.LIZ(aweme, z);
            if (!z) {
                c20283314YdLIZIZ.LJIIIIZZ = true;
                return;
            }
            return;
        }
        C20286614Zk.LIZ.getClass();
        if (!C20286614Zk.LJII || c20283314YdLIZIZ.LJIIIIZZ) {
            return;
        }
        C20285114Yv.LIZ(aweme, z);
        if (!z) {
            c20283314YdLIZIZ.LJIIIIZZ = true;
        }
    }

    @Override // X.InterfaceC690000R4s
    public final void LJIIJJI(EnumC20283814Yi enumC20283814Yi, Aweme aweme, boolean z) {
        View view;
        Option[] optionArr;
        if (aweme == null) {
            return;
        }
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20283314Yd c20283314YdLIZIZ = C988000bok.LIZ().LIZIZ(aweme.getAid());
        if (c20283314YdLIZIZ == null || c20283314YdLIZIZ.LJII) {
            return;
        }
        C20285114Yv c20285114Yv = C20285114Yv.LIZ;
        EnumC19410610wq enumC19410610wq = this.LLJJJJLIIL;
        c20285114Yv.getClass();
        if (C20285114Yv.LJ(enumC19410610wq)) {
            view = this.LLILZIL;
        } else {
            view = this.LLILZLL;
        }
        if (view != null) {
            if (view.getVisibility() != 0 && this.LLJJL && c20283314YdLIZIZ.LIZIZ) {
                C20284114Yl c20284114YlLJIILL = LJIILL();
                if (c20284114YlLJIILL != null) {
                    c20284114YlLJIILL.LJIJ(enumC20283814Yi, !c20283314YdLIZIZ.LJFF);
                }
                c20283314YdLIZIZ.LJFF = true;
            } else if (c20283314YdLIZIZ.LIZ) {
                Option option = this.LLJJIJIL;
                if (option != null) {
                    optionArr = new Option[]{option};
                } else {
                    optionArr = null;
                }
                aweme.getAid();
                C20285114Yv.LIZJ(enumC20283814Yi, aweme, optionArr, C14Z4.LIZ(aweme), !c20283314YdLIZIZ.LJ);
                c20283314YdLIZIZ.LJ = true;
            }
        }
        C988000bok.LIZ().LJFF(aweme.getAid(), c20283314YdLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:308:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05fb  */
    @Override // X.InterfaceC690490R6p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.view.ViewStub r29, android.content.Context r30, com.ss.android.ugc.aweme.feed.model.Aweme r31, android.view.View r32, android.view.View r33, android.view.View r34, android.view.View r35, boolean r36, X.AbstractC19368810q6 r37) {
        /*
            Method dump skipped, instruction units count: 1625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20284814Ys.LJIIJ(android.view.ViewStub, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View, android.view.View, android.view.View, android.view.View, boolean, X.10q6):void");
    }
}
