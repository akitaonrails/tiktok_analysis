package X;

import Y.ACListenerS164S0100000_30;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS307S0300000_30;

/* JADX INFO: renamed from: X.14Xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20280714Xd extends AbstractC20284914Yt implements InterfaceC20284714Yr {
    public Context LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public TuxIconView LLJILLL;
    public TuxTextView LLJJ;
    public RecyclerView LLJJI;
    public C197039127h LLJJIII;
    public ViewStub LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public C19409710wh<Option> LLJJJJ;
    public Option LLJJJJJIL;
    public int LLJJJJLIIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public C20284114Yl LLJLIL;
    public final EnumC19410610wq LLJJL = EnumC19410610wq.GREY_CARD;
    public final ACListenerS164S0100000_30 LLJLILLLLZIIL = new ACListenerS164S0100000_30(this, 36);

    @Override // X.InterfaceC20284714Yr
    public final void LIZIZ() {
        View view = this.LLJILJILJ;
        if (view == null) {
            return;
        }
        C19409710wh<Option> c19409710wh = this.LLJJJJ;
        if (c19409710wh != null) {
            c19409710wh.LL = -1;
            c19409710wh.notifyDataSetChanged();
        }
        C786410Ut5.LJLLLLLL(0, view);
        view.animate().alpha(1.0f).setDuration(200L).start();
        C197039127h c197039127h = this.LLJJIII;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
            c197039127h.setClickable(false);
            c197039127h.setButtonVariant(2);
        }
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZJ() {
        View view = this.LLJIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJIJIIJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLJJJ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LLJJJIL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LLJILJILJ;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(8, view5);
            C786410Ut5.T4(view5, 0.0f);
            if (this.LLJJJJLIIL > 0) {
                view5.getLayoutParams().height = this.LLJJJJLIIL;
            } else {
                view5.getLayoutParams().height = -2;
            }
        }
        this.LLJJJJJIL = null;
        C19409710wh<Option> c19409710wh = this.LLJJJJ;
        if (c19409710wh != null) {
            c19409710wh.LL = -1;
            c19409710wh.notifyDataSetChanged();
        }
        C197039127h c197039127h = this.LLJJIII;
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 8);
            C786410Ut5.w5(c197039127h, 0.0f);
            C197039127h c197039127h2 = this.LLJJIII;
            if (c197039127h2 != null) {
                c197039127h2.setEnabled(false);
                c197039127h2.setClickable(false);
                c197039127h2.setButtonVariant(2);
            }
        }
        View view6 = this.LLJJIJIL;
        if (view6 != null) {
            C786410Ut5.LJLLLLLL(0, view6);
        }
        View view7 = this.LLJJIJIL;
        if (view7 != null) {
            C786410Ut5.T4(view7, 1.0f);
        }
        C20284114Yl c20284114YlLJIJI = LJIJI();
        if (c20284114YlLJIJI != null) {
            c20284114YlLJIJI.LIZJ();
        }
    }

    @Override // X.InterfaceC690490R6p
    public final void LJI() {
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLJJJIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
    }

    public final C20284114Yl LJIJI() {
        if (this.LLJLIL == null && this.LLJJLIIIJLLLLLLLZ) {
            this.LLJLIL = new C20284114Yl();
        }
        return this.LLJLIL;
    }

    @Override // X.InterfaceC690490R6p
    public final boolean isShowing() {
        View view = this.LLJIJIL;
        return view != null && view.getVisibility() == 0;
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIIIZZ() {
        if (isShowing()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(), new ARunnableS109S0100000_9(this, 168));
        }
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJ(Aweme aweme, boolean z) {
        View view = this.LLJILJILJ;
        if (view == null) {
            return;
        }
        if (view.getVisibility() != 0 && this.LLJJLIIIJLLLLLLLZ) {
            C20284114Yl c20284114YlLJIJI = LJIJI();
            if (c20284114YlLJIJI != null) {
                c20284114YlLJIJI.LJ(aweme, z);
                return;
            }
            return;
        }
        super.LJ(aweme, z);
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJIIJJI(EnumC20283814Yi enumC20283814Yi, Aweme aweme, boolean z) {
        View view = this.LLJILJILJ;
        if (view == null) {
            return;
        }
        if (view.getVisibility() != 0 && this.LLJJLIIIJLLLLLLLZ) {
            C20284114Yl c20284114YlLJIJI = LJIJI();
            if (c20284114YlLJIJI != null) {
                c20284114YlLJIJI.LJIIJJI(enumC20283814Yi, aweme, z);
                return;
            }
            return;
        }
        super.LJIIJJI(enumC20283814Yi, aweme, z);
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIJ(ViewStub viewStub, Context context, Aweme aweme, View view, View view2, View view3, View view4, boolean z, AbstractC19368810q6 abstractC19368810q6) {
        Question[] questionArr;
        Question question;
        RecyclerView recyclerView;
        Option[] optionArr;
        int iLIZIZ;
        View viewFindViewById;
        View viewFindViewById2;
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        RecyclerView recyclerView2;
        C197039127h c197039127h;
        ViewStub viewStub2;
        if (context == null || aweme == null) {
            return;
        }
        C1387620mDI.LIZ.getClass();
        if (C1387620mDI.LJI(aweme)) {
            return;
        }
        LJII(aweme);
        FeedSurvey feedSurvey = this.LLILLJJLI;
        if (feedSurvey != null && (questionArr = feedSurvey.questions) != null && (question = questionArr[0]) != null) {
            this.LLJJJJLIIL = 0;
            this.LLJJLIIIJLLLLLLLZ = C20286514Zj.LIZLLL(question);
            LIZJ();
            this.LLJI = context;
            this.LL = aweme;
            this.LLJJIJIIJIL = view;
            this.LLJJIJIL = view2;
            this.LLJJJ = view3;
            this.LLJJJIL = view4;
            View view5 = this.LLJIJIL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            String str = null;
            if (this.LLJIJIL == null && viewStub != null) {
                View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                this.LLJIJIL = viewLJLLLL;
                if (viewLJLLLL != null) {
                    viewFindViewById = viewLJLLLL.findViewById(R.id.ex3);
                } else {
                    viewFindViewById = null;
                }
                this.LLJILJIL = viewFindViewById;
                View view6 = this.LLJIJIL;
                if (view6 != null) {
                    viewFindViewById2 = view6.findViewById(R.id.dgb);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJILJILJ = viewFindViewById2;
                View view7 = this.LLJIJIL;
                if (view7 != null) {
                    tuxIconView = (TuxIconView) view7.findViewById(R.id.jzi);
                } else {
                    tuxIconView = null;
                }
                this.LLJILLL = tuxIconView;
                View view8 = this.LLJIJIL;
                if (view8 != null) {
                    tuxTextView = (TuxTextView) view8.findViewById(R.id.tv_title);
                } else {
                    tuxTextView = null;
                }
                this.LLJJ = tuxTextView;
                View view9 = this.LLJIJIL;
                if (view9 != null) {
                    recyclerView2 = (RecyclerView) view9.findViewById(R.id.ntx);
                } else {
                    recyclerView2 = null;
                }
                this.LLJJI = recyclerView2;
                View view10 = this.LLJIJIL;
                if (view10 != null) {
                    c197039127h = (C197039127h) view10.findViewById(R.id.cvd);
                } else {
                    c197039127h = null;
                }
                this.LLJJIII = c197039127h;
                View view11 = this.LLJIJIL;
                if (view11 != null) {
                    viewStub2 = (ViewStub) view11.findViewById(R.id.uia);
                } else {
                    viewStub2 = null;
                }
                this.LLJJIJI = viewStub2;
            }
            TuxTextView tuxTextView2 = this.LLJJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(question.title);
            }
            C197039127h c197039127h2 = this.LLJJIII;
            if (c197039127h2 != null) {
                FeedSurvey feedSurvey2 = this.LLILLJJLI;
                if (feedSurvey2 != null) {
                    str = feedSurvey2.submitText;
                }
                c197039127h2.setText(str);
                C786410Ut5.LLLLLLJ(c197039127h2, 8);
            }
            C197039127h c197039127h3 = this.LLJJIII;
            if (c197039127h3 != null) {
                C786410Ut5.U8(c197039127h3, this.LLJLILLLLZIIL);
            }
            TuxIconView tuxIconView2 = this.LLJILLL;
            if (tuxIconView2 != null) {
                C786410Ut5.a9(tuxIconView2, this.LLJLILLLLZIIL);
            }
            View view12 = this.LLJILJILJ;
            if (view12 != null) {
                C786410Ut5.I7(this.LLJLILLLLZIIL, view12);
            }
            View view13 = this.LLJILJIL;
            if (view13 != null) {
                C786410Ut5.I7(this.LLJLILLLLZIIL, view13);
            }
            View view14 = this.LLJJIJIL;
            if (view14 != null) {
                view14.animate().alpha(0.0f).setDuration(150L).start();
                C786410Ut5.LJLLLLLL(8, view14);
            }
            View view15 = this.LLJIJIL;
            if (view15 != null) {
                C786410Ut5.LJLLLLLL(0, view15);
            }
            View view16 = this.LLJILJILJ;
            if (view16 != null) {
                C786410Ut5.LJLLLLLL(0, view16);
                view16.animate().alpha(1.0f).setDuration(200L).setStartDelay(100L).start();
            }
            if (this.LLILLL != C14Z0.LIVE_TYPE) {
                C20286614Zk.LJII();
            }
            Context context2 = this.LLJI;
            if (context2 != null && (recyclerView = this.LLJJI) != null && (optionArr = question.options) != null) {
                boolean z2 = this.LLJJLIIIJLLLLLLLZ;
                recyclerView.setLayoutManager(C19411210ww.LIZIZ(z2 ? 1 : 0, context2));
                if (this.LLJJLIIIJLLLLLLLZ) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                } else {
                    iLIZIZ = 0;
                }
                C426750GoL.LJIIIZ(recyclerView, 0, Integer.valueOf(iLIZIZ), 0, 0, false, 16);
                ArrayList arrayList = new ArrayList(optionArr.length);
                C19719612Di.LJJII(arrayList, optionArr);
                C19409710wh<Option> c19409710whLIZ = C19411210ww.LIZ(z2 ? 1 : 0, context2, arrayList, new AwS307S0300000_30(optionArr, (Option[]) this, (C20280714Xd) arrayList, (ArrayList<Option>) 5));
                this.LLJJJJ = c19409710whLIZ;
                c19409710whLIZ.LLILLL = EnumC19410610wq.GREY_CARD;
                recyclerView.setAdapter(c19409710whLIZ);
            }
        }
    }
}
