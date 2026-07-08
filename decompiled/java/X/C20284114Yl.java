package X;

import Y.AAListenerS340S0100000_30;
import Y.ACListenerS53S0201000_29;
import Y.AComparatorS49S0000000_30;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS99S0200000_30;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.feed.survey.layoutmanager.SurveyFlexLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS465S0200000_30;

/* JADX INFO: renamed from: X.14Yl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20284114Yl extends AbstractC20283714Yh implements C11GG {
    public Context LLIZLLLIL;
    public InterfaceC20284714Yr LLJ;
    public Option LLJILJILJ;
    public View LLJJ;
    public View LLJJI;
    public TuxIconView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public RecyclerView LLJJIJIL;
    public View LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxIconView LLJJJJ;
    public C197039127h LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public C20286814Zm LLJL;
    public C19409710wh<Option> LLJLIL;
    public String LLJLILLLLZIIL;
    public boolean LLJLL;
    public final Map<Integer, Option> LLIZ = new LinkedHashMap();
    public EnumC19410610wq LLJI = EnumC19410610wq.DEFAULT;
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public int LLJILLL = -1;
    public final ViewOnClickListenerC20284014Yk LLJLLIL = new View.OnClickListener() { // from class: X.14Yk
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C20286814Zm c20286814Zm;
            String aid;
            String aid2;
            String aid3;
            String aid4;
            Option[] optionArr;
            C20286814Zm c20286814Zm2;
            String aid5;
            String aid6;
            String aid7;
            this.LL.LJIJJ();
            int id = view.getId();
            if (id == R.id.krx) {
                C20284114Yl c20284114Yl = this.LL;
                Context context = c20284114Yl.LLIZLLLIL;
                if (context != null) {
                    C11GD c11gd = new C11GD(context, false, c20284114Yl.LLJLILLLLZIIL, c20284114Yl, null, null, null);
                    c11gd.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.14Yq
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                        }
                    });
                    C1391850mK7.LIZIZ(c11gd, "fyp_survey_option_other_reason_nscreen");
                    c11gd.show();
                    C785410UrT.LIZIZ(c11gd);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(c11gd);
                    C816490W1f.LIZ(c11gd);
                    return;
                }
                return;
            }
            if (id == R.id.e0h) {
                TuxTextView tuxTextView = this.LL.LLJJJIL;
                if (tuxTextView == null) {
                    return;
                }
                tuxTextView.setText("");
                return;
            }
            String aid8 = null;
            if (id == R.id.cvd) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((LinkedHashMap) this.LL.LLIZ).entrySet()) {
                    ((Number) entry.getKey()).intValue();
                    arrayList.add(entry.getValue());
                }
                Option[] optionArrLJIILJJIL = this.LL.LJIILJJIL();
                if (optionArrLJIILJJIL != null) {
                    C20284114Yl c20284114Yl2 = this.LL;
                    C692060RCq.LIZIZ(c20284114Yl2.LL);
                    C20287114Zp c20287114Zp = C20287114Zp.LIZ;
                    Aweme aweme = c20284114Yl2.LL;
                    int type = EnumC20283814Yi.SUBMIT.getType();
                    c20287114Zp.getClass();
                    C20287114Zp.LIZJ(type, aweme, optionArrLJIILJJIL);
                    C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
                    C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
                    Aweme aweme2 = c20284114Yl2.LL;
                    if (aweme2 != null) {
                        aid6 = aweme2.getAid();
                    } else {
                        aid6 = null;
                    }
                    C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ.LIZIZ(aid6);
                    if (c20283314YdLIZIZ == null) {
                        c20283314YdLIZIZ = new C20283314Yd();
                    }
                    c20284114Yl2.LJFF(c20283314YdLIZIZ, EnumC20283814Yi.SECONDARY_SUBMIT, (Option) C13LQ.LJJIFFI(optionArrLJIILJJIL));
                    C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
                    Aweme aweme3 = c20284114Yl2.LL;
                    if (aweme3 != null) {
                        aid7 = aweme3.getAid();
                    } else {
                        aid7 = null;
                    }
                    c20285414YyLIZ2.LJII(aid7, new C14Z2(c20284114Yl2.LLILZ, false));
                }
                C20285114Yv c20285114Yv = C20285114Yv.LIZ;
                EnumC19410610wq enumC19410610wq = this.LL.LLJI;
                c20285114Yv.getClass();
                if (C20285114Yv.LJ(enumC19410610wq)) {
                    C14XX c14xx = new C14XX();
                    c14xx.LIZIZ = true;
                    c14xx.LIZ = this.LL.LLJILLL;
                    c14xx.LIZJ = arrayList;
                    C01GW<C20285414Yy> c01gw2 = C20285414Yy.LIZLLL;
                    C20285414Yy c20285414YyLIZ3 = C988000bok.LIZ();
                    Aweme aweme4 = this.LL.LL;
                    if (aweme4 != null) {
                        aid8 = aweme4.getAid();
                    }
                    c20285414YyLIZ3.LJI(aid8, c14xx);
                    this.LL.LJIIZILJ(true);
                    C19409710wh<Option> c19409710wh = this.LL.LLJLIL;
                    if (c19409710wh != null) {
                        c19409710wh.LLILLJJLI = false;
                        c19409710wh.notifyDataSetChanged();
                    }
                } else {
                    View view2 = this.LL.LLJJ;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(8, view2);
                    }
                    this.LL.LIZJ();
                }
                C1440005kM.LIZ(new C483280IxK());
                C786410Ut5.LJJZZIII(new BPEAHandler(), new ARunnableS99S0200000_30(view, this.LL, 22));
                if (!C14Z4.LJ(this.LL.LL)) {
                    return;
                }
                C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "survey_submit", this.LL.LL));
                return;
            }
            if (id == R.id.j2n) {
                C01GW<C20285414Yy> c01gw3 = C20285414Yy.LIZLLL;
                C20285414Yy c20285414YyLIZ4 = C988000bok.LIZ();
                Aweme aweme5 = this.LL.LL;
                if (aweme5 != null && (aid5 = aweme5.getAid()) != null) {
                    C603820NmG<String, C14XX> c603820NmG = c20285414YyLIZ4.LIZ;
                    if (c603820NmG != null) {
                        c603820NmG.LJ(aid5);
                    }
                } else {
                    c20285414YyLIZ4.getClass();
                }
                C20284114Yl c20284114Yl3 = this.LL;
                View view3 = c20284114Yl3.LLJJ;
                if (view3 != null) {
                    view3.animate().alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS99S0200000_30(view3, c20284114Yl3, 23)).start();
                    C20285114Yv c20285114Yv2 = C20285114Yv.LIZ;
                    EnumC19410610wq enumC19410610wq2 = c20284114Yl3.LLJI;
                    c20285114Yv2.getClass();
                    if (C20285114Yv.LIZLLL(enumC19410610wq2) && (c20286814Zm2 = c20284114Yl3.LLJL) != null) {
                        c20286814Zm2.LJJL = false;
                        c20286814Zm2.LJIJJLI();
                    }
                }
                Question question = this.LL.LLILZIL;
                if (question != null && (optionArr = question.options) != null) {
                    for (Option option : optionArr) {
                        option.setSelected(false);
                    }
                }
                C20284114Yl c20284114Yl4 = this.LL;
                c20284114Yl4.getClass();
                C01GW<C20285414Yy> c01gw4 = C20285414Yy.LIZLLL;
                C20285414Yy c20285414YyLIZ5 = C988000bok.LIZ();
                Aweme aweme6 = c20284114Yl4.LL;
                if (aweme6 != null) {
                    aid3 = aweme6.getAid();
                } else {
                    aid3 = null;
                }
                if (!c20285414YyLIZ5.LIZLLL(c20284114Yl4.LLILZ, aid3)) {
                    return;
                }
                C20285414Yy c20285414YyLIZ6 = C988000bok.LIZ();
                Aweme aweme7 = c20284114Yl4.LL;
                if (aweme7 != null) {
                    aid4 = aweme7.getAid();
                } else {
                    aid4 = null;
                }
                C20283314Yd c20283314YdLIZIZ2 = c20285414YyLIZ6.LIZIZ(aid4);
                if (c20283314YdLIZIZ2 == null) {
                    c20283314YdLIZIZ2 = new C20283314Yd();
                }
                c20284114Yl4.LJFF(c20283314YdLIZIZ2, EnumC20283814Yi.BACK, null);
                return;
            }
            if (id == R.id.jzi) {
                View view4 = this.LL.LLJJ;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(8, view4);
                }
                this.LL.LJII(EnumC20283814Yi.CANCEL);
                C1440005kM.LIZ(new C483280IxK());
                this.LL.LIZJ();
                return;
            }
            if (id != R.id.hk1 || (c20286814Zm = this.LL.LLJL) == null || !c20286814Zm.LJIJJ) {
                return;
            }
            c20286814Zm.LJJ(1.0f, 0.0f, false);
            C20284114Yl c20284114Yl5 = this.LL;
            c20284114Yl5.getClass();
            C01GW<C20285414Yy> c01gw5 = C20285414Yy.LIZLLL;
            C20285414Yy c20285414YyLIZ7 = C988000bok.LIZ();
            Aweme aweme8 = c20284114Yl5.LL;
            if (aweme8 != null) {
                aid = aweme8.getAid();
            } else {
                aid = null;
            }
            if (!c20285414YyLIZ7.LIZLLL(c20284114Yl5.LLILZ, aid)) {
                return;
            }
            C20285414Yy c20285414YyLIZ8 = C988000bok.LIZ();
            Aweme aweme9 = c20284114Yl5.LL;
            if (aweme9 != null) {
                aid2 = aweme9.getAid();
            } else {
                aid2 = null;
            }
            C20283314Yd c20283314YdLIZIZ3 = c20285414YyLIZ8.LIZIZ(aid2);
            if (c20283314YdLIZIZ3 == null) {
                c20283314YdLIZIZ3 = new C20283314Yd();
            }
            c20284114Yl5.LJFF(c20283314YdLIZIZ3, EnumC20283814Yi.CLICK_VIDEO, null);
        }
    };

    public final void LIZJ() {
        View view;
        ViewGroup.LayoutParams layoutParams;
        int i;
        View view2 = this.LLJJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
            C786410Ut5.T4(view2, 0.0f);
        }
        C19409710wh<Option> c19409710wh = this.LLJLIL;
        if (c19409710wh != null) {
            ((LinkedHashMap) this.LLIZ).clear();
            c19409710wh.notifyDataSetChanged();
        }
        View view3 = this.LLJJJ;
        if (view3 != null && view3.getVisibility() == 0) {
            C20285114Yv c20285114Yv = C20285114Yv.LIZ;
            EnumC19410610wq enumC19410610wq = this.LLJI;
            c20285114Yv.getClass();
            if (C20285114Yv.LJ(enumC19410610wq) && (view = this.LLJJL) != null && (layoutParams = view.getLayoutParams()) != null && (i = layoutParams.height) > 100) {
                layoutParams.height = i - C341940Daq.LIZ(56.0d);
            }
        }
        View view4 = this.LLJJJ;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
            C786410Ut5.T4(view4, 0.0f);
        }
        TuxTextView tuxTextView = this.LLJJJIL;
        if (tuxTextView != null) {
            tuxTextView.setText("");
        }
        LJIIZILJ(false);
        View view5 = this.LLJJL;
        if (view5 != null) {
            C618720OOo.LIZIZ(view5, -1, -2);
            view5.requestLayout();
        }
    }

    public final Option[] LJIILJJIL() {
        Object objLJII;
        Question question;
        Object objLJII2 = null;
        try {
            objLJII = new Gson().LJII(new Gson().LJIILL(this.LLJILJILJ), Option.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            objLJII = null;
        }
        Option option = (Option) objLJII;
        if (option == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.LLIZ).entrySet()) {
            ((Number) entry.getKey()).intValue();
            arrayList.add(entry.getValue());
        }
        ArrayList arrayList2 = new ArrayList(C13LP.LJLLLL(new AComparatorS49S0000000_30(18), arrayList));
        Question[] questionArr = option.questions;
        if (questionArr != null && (question = questionArr[0]) != null) {
            try {
                objLJII2 = new Gson().LJII(new Gson().LJIILL(question), Question.class);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            Question question2 = (Question) objLJII2;
            if (question2 != null) {
                question2.setOptions((Option[]) arrayList2.toArray(new Option[0]));
                Question[] questionArr2 = option.questions;
                if (questionArr2 != null) {
                    questionArr2[0] = question2;
                }
            }
        }
        return new Option[]{option};
    }

    public final void LJIILL() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.LLIZ).entrySet()) {
            ((Number) entry.getKey()).intValue();
            arrayList.add(entry.getValue());
        }
        C14XX c14xx = new C14XX();
        c14xx.LIZIZ = false;
        c14xx.LIZ = this.LLJILLL;
        c14xx.LIZJ = arrayList;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        c20285414YyLIZ.LJI(aweme != null ? aweme.getAid() : null, c14xx);
    }

    public final void LJIILLIIL() {
        Option[] optionArr;
        boolean z = true;
        if (!(!this.LLIZ.isEmpty())) {
            LJIIZILJ(false);
            LJIJI(false);
            return;
        }
        C197039127h c197039127h = this.LLJJJJJIL;
        if (c197039127h != null) {
            c197039127h.setEnabled(true);
            c197039127h.setClickable(true);
            c197039127h.setButtonVariant(0);
        }
        Question question = this.LLILZIL;
        if (question == null || (optionArr = question.options) == null) {
            z = false;
        } else {
            int length = optionArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Option option = optionArr[i];
                if (option.type != 1) {
                    i++;
                } else if (!option.isSelected()) {
                    break;
                }
            }
            z = false;
        }
        LJIJI(z);
    }

    public final void LJIJJ() {
        C20286814Zm c20286814Zm = this.LLJL;
        if (c20286814Zm == null || !c20286814Zm.LJIJJ) {
            return;
        }
        C20552315bV.LIZIZ(this.LL);
    }

    @Override // X.C11GG
    public final void LIZIZ(String str) {
        TuxTextView tuxTextView = this.LLJJJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public final void LJIIZILJ(boolean z) {
        C197039127h c197039127h = this.LLJJJJJIL;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
            c197039127h.setClickable(false);
            c197039127h.setButtonVariant(2);
            if (z) {
                c197039127h.setText(2131849337);
                View view = this.LLJJJ;
                if (view != null) {
                    view.setEnabled(false);
                }
                TuxIconView tuxIconView = this.LLJJJJ;
                if (tuxIconView != null) {
                    tuxIconView.setEnabled(false);
                }
                TuxTextView tuxTextView = this.LLJJJJLIIL;
                if (tuxTextView != null) {
                    tuxTextView.setEnabled(false);
                    return;
                }
                return;
            }
            View view2 = this.LLJJJ;
            if (view2 != null) {
                view2.setEnabled(true);
            }
            TuxIconView tuxIconView2 = this.LLJJJJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setEnabled(true);
            }
            TuxTextView tuxTextView2 = this.LLJJJJLIIL;
            if (tuxTextView2 == null) {
                return;
            }
            tuxTextView2.setEnabled(true);
        }
    }

    public final void LJIJI(boolean z) {
        double d;
        if (z) {
            View view = this.LLJJJ;
            if (view != null && view.getVisibility() == 0) {
                return;
            }
        } else {
            View view2 = this.LLJJJ;
            if (view2 != null && view2.getVisibility() == 8) {
                return;
            }
        }
        View view3 = this.LLJJJ;
        if (view3 != null) {
            if (z) {
                C786410Ut5.LJLLLLLL(0, view3);
                view3.animate().alpha(1.0f).setDuration(200L).setStartDelay(100L).start();
            } else {
                view3.animate().alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS119S0100000_19(view3, 177)).start();
            }
        }
        final View view4 = this.LLJJL;
        if (view4 != null) {
            final int height = view4.getHeight();
            C20285114Yv c20285114Yv = C20285114Yv.LIZ;
            EnumC19410610wq enumC19410610wq = this.LLJI;
            c20285114Yv.getClass();
            if (C20285114Yv.LJ(enumC19410610wq)) {
                d = 56.0d;
            } else {
                d = 41.0d;
            }
            final int iLIZ = C341940Daq.LIZ(d);
            if (z) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, iLIZ + height);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.14Yo
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        if (iIntValue > 0) {
                            view4.getLayoutParams().height = iIntValue;
                            view4.requestLayout();
                            C20285114Yv c20285114Yv2 = C20285114Yv.LIZ;
                            EnumC19410610wq enumC19410610wq2 = this.LLJI;
                            c20285114Yv2.getClass();
                            if (C20285114Yv.LIZLLL(enumC19410610wq2)) {
                                View view5 = this.LLJJI;
                                if (view5 != null) {
                                    ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
                                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = height - iIntValue;
                                    C786410Ut5.W5(view5, layoutParams);
                                }
                                C20286814Zm c20286814Zm = this.LLJL;
                                if (c20286814Zm != null) {
                                    c20286814Zm.LJIL(height - iIntValue);
                                }
                            }
                        }
                    }
                });
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
                valueAnimatorOfInt.addListener(new AAListenerS340S0100000_30(this, 3));
                valueAnimatorOfInt.start();
                return;
            }
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(height, height - iLIZ);
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.14Yp
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (iIntValue > 0) {
                        view4.getLayoutParams().height = iIntValue;
                        view4.requestLayout();
                        C20285114Yv c20285114Yv2 = C20285114Yv.LIZ;
                        EnumC19410610wq enumC19410610wq2 = this.LLJI;
                        c20285114Yv2.getClass();
                        if (C20285114Yv.LIZLLL(enumC19410610wq2)) {
                            View view5 = this.LLJJI;
                            if (view5 != null) {
                                ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
                                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (height - iLIZ) - iIntValue;
                                C786410Ut5.W5(view5, layoutParams);
                            }
                            C20286814Zm c20286814Zm = this.LLJL;
                            if (c20286814Zm != null) {
                                c20286814Zm.LJIL((height - iLIZ) - iIntValue);
                            }
                        }
                    }
                }
            });
            valueAnimatorOfInt2.setDuration(250L);
            valueAnimatorOfInt2.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
            valueAnimatorOfInt2.setStartDelay(100L);
            valueAnimatorOfInt2.addListener(new AAListenerS340S0100000_30(this, 4));
            valueAnimatorOfInt2.start();
        }
    }

    public final void LJIJ(EnumC20283814Yi enumC20283814Yi, boolean z) {
        Integer numValueOf;
        int type;
        String str;
        String aid;
        String requestId;
        int type2;
        String str2;
        String aid2;
        String authorUid;
        String requestId2;
        int i = C20283514Yf.LIZIZ[enumC20283814Yi.ordinal()];
        if (i != 1) {
            if (i != 2) {
                String str3 = this.LLJILJIL;
                Aweme aweme = this.LL;
                Option option = this.LLJILJILJ;
                if (option != null) {
                    numValueOf = Integer.valueOf(option.id);
                } else {
                    numValueOf = null;
                }
                Option[] optionArrLJIILJJIL = LJIILJJIL();
                String str4 = this.LLJLILLLLZIIL;
                C14Z0 c14z0 = this.LLILLL;
                int i2 = C20285514Yz.LIZ[c14z0.ordinal()];
                String str5 = "";
                if (i2 != 1 && i2 != 2) {
                    C20286614Zk c20286614Zk = C20286614Zk.LIZ;
                    C20286614Zk.LIZJ = C20286514Zj.LIZ(optionArrLJIILJJIL);
                    int type3 = enumC20283814Yi.getType();
                    if (type3 != EnumC20283814Yi.SWIPE.getType() && type3 != EnumC20283814Yi.CLICK_BLANK.getType() && type3 != EnumC20283814Yi.BACK.getType() && type3 != EnumC20283814Yi.CLICK_VIDEO.getType()) {
                        if (type3 == EnumC20283814Yi.SUBMIT.getType()) {
                            type2 = EnumC20283814Yi.SECONDARY_SUBMIT.getType();
                        } else {
                            type2 = enumC20283814Yi.getType();
                        }
                    } else {
                        type2 = EnumC20283814Yi.SECONDARY_CANCEL.getType();
                    }
                    if (!C14Z4.LIZIZ(aweme) || type2 != EnumC20283814Yi.SECONDARY_CANCEL.getType()) {
                        C20286614Zk.LIZ.getClass();
                        C20286614Zk.LJI(type2, aweme, optionArrLJIILJJIL);
                    }
                    if (z) {
                        String strName = enumC20283814Yi.name();
                        Locale locale = Locale.ENGLISH;
                        String lowerCase = strName.toLowerCase(locale);
                        if (!TextUtils.equals(lowerCase, "SUBMIT".toLowerCase(locale))) {
                            str2 = "";
                        } else {
                            str2 = C20286614Zk.LIZJ;
                        }
                        if (TextUtils.equals(lowerCase, "SUBMIT".toLowerCase(locale))) {
                            str5 = str4;
                        }
                        C14ZT c14zt = C14ZT.LIZ;
                        if (aweme != null) {
                            aid2 = aweme.getAid();
                            authorUid = AwemeExtKt.getAuthorUid(aweme);
                        } else {
                            aid2 = null;
                            authorUid = null;
                        }
                        String lowerCase2 = "MULTIPLE_CHOICE_INPUT".toLowerCase(locale);
                        if (aweme != null) {
                            requestId2 = aweme.getRequestId();
                        } else {
                            requestId2 = null;
                        }
                        c14zt.getClass();
                        C14ZT.LJIIIZ(aweme, lowerCase, numValueOf, str2, str5, str3, aid2, authorUid, lowerCase2, c14z0, requestId2, optionArrLJIILJJIL);
                    }
                    C20286614Zk.LJ = false;
                    C20286614Zk.LIZIZ = null;
                    return;
                }
                C14Z7 c14z7 = C14Z7.LIZ;
                C14Z7.LJ = C20286514Zj.LIZ(optionArrLJIILJJIL);
                int type4 = enumC20283814Yi.getType();
                if (type4 != EnumC20283814Yi.SWIPE.getType() && type4 != EnumC20283814Yi.CLICK_BLANK.getType() && type4 != EnumC20283814Yi.BACK.getType() && type4 != EnumC20283814Yi.CLICK_VIDEO.getType()) {
                    if (type4 == EnumC20283814Yi.SUBMIT.getType()) {
                        type = EnumC20283814Yi.SECONDARY_SUBMIT.getType();
                    } else {
                        type = enumC20283814Yi.getType();
                    }
                } else {
                    type = EnumC20283814Yi.SECONDARY_CANCEL.getType();
                }
                C14Z7.LIZ.getClass();
                if (C14ZW.LIZLLL(aweme) != C14Z5.BACKGROUND.getType() || type != EnumC20283814Yi.SECONDARY_CANCEL.getType()) {
                    C14Z7.LJFF(type, aweme, optionArrLJIILJJIL);
                }
                if (z) {
                    String strName2 = enumC20283814Yi.name();
                    Locale locale2 = Locale.ENGLISH;
                    String lowerCase3 = strName2.toLowerCase(locale2);
                    if (!TextUtils.equals(lowerCase3, "SUBMIT".toLowerCase(locale2))) {
                        str = "";
                    } else {
                        str = C14Z7.LJ;
                    }
                    if (TextUtils.equals(lowerCase3, "SUBMIT".toLowerCase(locale2))) {
                        str5 = str4;
                    }
                    C14ZT c14zt2 = C14ZT.LIZ;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    String str6 = C14Z7.LIZIZ;
                    String lowerCase4 = "MULTIPLE_CHOICE_INPUT".toLowerCase(locale2);
                    if (aweme != null) {
                        requestId = aweme.getRequestId();
                    } else {
                        requestId = null;
                    }
                    c14zt2.getClass();
                    C14ZT.LJIIIZ(aweme, lowerCase3, numValueOf, str, str5, str3, aid, str6, lowerCase4, c14z0, requestId, optionArrLJIILJJIL);
                }
                C14Z7.LJFF = false;
                C14Z7.LIZLLL = null;
                return;
            }
            LJIIJJI(EnumC20283814Yi.SWIPE, this.LL, false);
            return;
        }
        LJII(enumC20283814Yi);
    }

    public final void LJIJJLI(ViewStub viewStub, final Context context, EnumC19410610wq enumC19410610wq, String str, InterfaceC20284714Yr interfaceC20284714Yr, String str2, Option option, int i, Question question, Aweme aweme, C14Z0 c14z0, boolean z, C20286814Zm c20286814Zm) {
        Integer numValueOf;
        String str3;
        String str4;
        C197039127h c197039127h;
        Option[] optionArr;
        View view;
        ViewTreeObserver viewTreeObserver;
        String aid;
        Integer num;
        Option[] optionArr2;
        RecyclerView.LayoutManager layoutManagerLIZIZ;
        Integer numValueOf2;
        C19409710wh<Option> c19409710whLIZ;
        Object next;
        String str5;
        TuxIconView tuxIconView;
        View viewFindViewById;
        TuxIconView tuxIconView2;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        RecyclerView recyclerView;
        View viewFindViewById2;
        TuxTextView tuxTextView3;
        TuxIconView tuxIconView3;
        C197039127h c197039127h2;
        TuxTextView tuxTextView4;
        View viewFindViewById3;
        View viewFindViewById4;
        Option[] optionArr3;
        String str6;
        String aid2;
        List<Option> list;
        if (context == null) {
            return;
        }
        LIZJ();
        this.LLIZLLLIL = context;
        this.LLJ = interfaceC20284714Yr;
        this.LLJI = enumC19410610wq;
        this.LLJIJIL = str;
        this.LLJILJIL = str2;
        this.LLJILJILJ = option;
        this.LLJILLL = i;
        this.LLILZIL = question;
        this.LL = aweme;
        this.LLILLL = c14z0;
        this.LLJL = c20286814Zm;
        C14XX c14xxLIZJ = null;
        if (z) {
            if (aweme != null && (aid2 = aweme.getAid()) != null) {
                C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
                C14XX c14xxLIZJ2 = C988000bok.LIZ().LIZJ(aid2);
                if (c14xxLIZJ2 != null && (list = c14xxLIZJ2.LIZJ) != null && list.size() > 0 && list != null) {
                    for (Option option2 : list) {
                        this.LLIZ.put(Integer.valueOf(option2.id), option2);
                    }
                }
            }
            Question question2 = this.LLILZIL;
            if (question2 != null && (optionArr3 = question2.options) != null) {
                for (Option option3 : optionArr3) {
                    if (this.LLIZ.containsKey(Integer.valueOf(option3.id))) {
                        option3.setSelected(true);
                        if (option3.type == C00GA.WITH_INPUT.getType()) {
                            Option option4 = (Option) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(option3.id));
                            if (option4 == null || (str6 = option4.additional_content) == null) {
                                str6 = "";
                            }
                            option3.setAdditional_content(str6);
                        }
                    } else {
                        option3.setSelected(false);
                    }
                }
            }
        }
        if (this.LLJJ == null) {
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            this.LLJJ = viewLJLLLL;
            if (viewLJLLLL != null) {
                C786410Ut5.LJLLLLLL(8, viewLJLLLL);
            }
            View view2 = this.LLJJ;
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.ex3);
            } else {
                viewFindViewById = null;
            }
            this.LLJJI = viewFindViewById;
            View view3 = this.LLJJ;
            if (view3 != null) {
                tuxIconView2 = (TuxIconView) view3.findViewById(R.id.jzi);
            } else {
                tuxIconView2 = null;
            }
            this.LLJJIII = tuxIconView2;
            View view4 = this.LLJJ;
            if (view4 != null) {
                tuxTextView = (TuxTextView) view4.findViewById(R.id.tv_title);
            } else {
                tuxTextView = null;
            }
            this.LLJJIJI = tuxTextView;
            View view5 = this.LLJJ;
            if (view5 != null) {
                tuxTextView2 = (TuxTextView) view5.findViewById(R.id.tv_sub_title);
            } else {
                tuxTextView2 = null;
            }
            this.LLJJIJIIJIL = tuxTextView2;
            View view6 = this.LLJJ;
            if (view6 != null) {
                recyclerView = (RecyclerView) view6.findViewById(R.id.ntx);
            } else {
                recyclerView = null;
            }
            this.LLJJIJIL = recyclerView;
            View view7 = this.LLJJ;
            if (view7 != null) {
                viewFindViewById2 = view7.findViewById(R.id.krx);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJJ = viewFindViewById2;
            View view8 = this.LLJJ;
            if (view8 != null) {
                tuxTextView3 = (TuxTextView) view8.findViewById(R.id.ksm);
            } else {
                tuxTextView3 = null;
            }
            this.LLJJJIL = tuxTextView3;
            View view9 = this.LLJJ;
            if (view9 != null) {
                tuxIconView3 = (TuxIconView) view9.findViewById(R.id.e0h);
            } else {
                tuxIconView3 = null;
            }
            this.LLJJJJ = tuxIconView3;
            View view10 = this.LLJJ;
            if (view10 != null) {
                c197039127h2 = (C197039127h) view10.findViewById(R.id.cvd);
            } else {
                c197039127h2 = null;
            }
            this.LLJJJJJIL = c197039127h2;
            View view11 = this.LLJJ;
            if (view11 != null) {
                tuxTextView4 = (TuxTextView) view11.findViewById(R.id.j2n);
            } else {
                tuxTextView4 = null;
            }
            this.LLJJJJLIIL = tuxTextView4;
            View view12 = this.LLJJ;
            if (view12 != null) {
                viewFindViewById3 = view12.findViewById(R.id.dgb);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJL = viewFindViewById3;
            View view13 = this.LLJJ;
            if (view13 != null) {
                viewFindViewById4 = view13.findViewById(R.id.hk1);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJJLIIIJLLLLLLLZ = viewFindViewById4;
        }
        View view14 = this.LLJJ;
        if (view14 != null) {
            C786410Ut5.LJLLLLLL(0, view14);
            if (z) {
                C786410Ut5.T4(view14, 1.0f);
            } else {
                view14.animate().alpha(1.0f).setDuration(200L).start();
            }
        }
        this.LL = aweme;
        C14ZW.LIZ.getClass();
        this.LLILLJJLI = C14ZW.LJ(aweme);
        this.LLILLL = C14Z4.LIZ(aweme);
        this.LLILZ = C14ZW.LIZLLL(aweme);
        this.LLILZLL = Integer.valueOf(C14ZW.LIZIZ(aweme));
        this.LLILZIL = question;
        if (this.LLJI == EnumC19410610wq.GREY_CARD && (tuxIconView = this.LLJJIII) != null) {
            C786410Ut5.a9(tuxIconView, this.LLJLLIL);
        }
        TuxTextView tuxTextView5 = this.LLJJIJI;
        if (tuxTextView5 != null) {
            Question question3 = this.LLILZIL;
            if (question3 != null) {
                str5 = question3.title;
            } else {
                str5 = null;
            }
            tuxTextView5.setText(str5);
        }
        TuxTextView tuxTextView6 = this.LLJJIJI;
        if (tuxTextView6 != null) {
            C426750GoL.LJIIL(tuxTextView6, null, null, null, 0, 23);
        }
        C14Z9 c14z9 = C14ZA.Companion;
        Question question4 = this.LLILZIL;
        if (question4 != null) {
            numValueOf = Integer.valueOf(question4.type);
        } else {
            numValueOf = null;
        }
        c14z9.getClass();
        if (C14Z9.LIZIZ(numValueOf)) {
            TuxTextView tuxTextView7 = this.LLJJIJIIJIL;
            if (tuxTextView7 != null) {
                C786410Ut5.LLLLZLL(tuxTextView7, 0);
            }
        } else {
            TuxTextView tuxTextView8 = this.LLJJIJIIJIL;
            if (tuxTextView8 != null) {
                C786410Ut5.LLLLZLL(tuxTextView8, 8);
            }
        }
        Question question5 = this.LLILZIL;
        if (question5 != null) {
            str3 = question5.subtitle;
        } else {
            str3 = null;
        }
        if (TextUtils.isEmpty(str3)) {
            TuxTextView tuxTextView9 = this.LLJJIJIIJIL;
            if (tuxTextView9 != null) {
                tuxTextView9.setText(context.getResources().getString(2131836151));
            }
        } else {
            TuxTextView tuxTextView10 = this.LLJJIJIIJIL;
            if (tuxTextView10 != null) {
                Question question6 = this.LLILZIL;
                if (question6 != null) {
                    str4 = question6.subtitle;
                } else {
                    str4 = null;
                }
                tuxTextView10.setText(str4);
            }
        }
        TuxTextView tuxTextView11 = this.LLJJJIL;
        if (tuxTextView11 != null) {
            tuxTextView11.addTextChangedListener(new TextWatcher() { // from class: X.14Yn
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    TuxIconView tuxIconView4 = this.LL.LLJJJJ;
                    if (tuxIconView4 != null) {
                        int i5 = 0;
                        if (charSequence == null || charSequence.length() <= 0) {
                            i5 = 8;
                        }
                        C786410Ut5.LLLLLLZZ(tuxIconView4, i5);
                    }
                    this.LL.LLJLILLLLZIIL = String.valueOf(charSequence);
                    C20284114Yl c20284114Yl = this.LL;
                    for (Map.Entry entry : ((LinkedHashMap) c20284114Yl.LLIZ).entrySet()) {
                        ((Number) entry.getKey()).intValue();
                        Option option5 = (Option) entry.getValue();
                        if (option5.type == C00GA.WITH_INPUT.getType()) {
                            String str7 = c20284114Yl.LLJLILLLLZIIL;
                            if (str7 == null) {
                                str7 = "";
                            }
                            option5.setAdditional_content(str7);
                        }
                    }
                }
            });
        }
        TuxIconView tuxIconView4 = this.LLJJJJ;
        if (tuxIconView4 != null) {
            C786410Ut5.a9(tuxIconView4, this.LLJLLIL);
        }
        View view15 = this.LLJJJ;
        if (view15 != null) {
            C786410Ut5.I7(this.LLJLLIL, view15);
        }
        C197039127h c197039127h3 = this.LLJJJJJIL;
        if (c197039127h3 != null) {
            c197039127h3.setText(this.LLJIJIL);
            C786410Ut5.U8(c197039127h3, this.LLJLLIL);
        }
        TuxTextView tuxTextView12 = this.LLJJJJLIIL;
        if (tuxTextView12 != null) {
            tuxTextView12.setText(2131836150);
            C786410Ut5.h9(tuxTextView12, this.LLJLLIL);
        }
        if (C20283514Yf.LIZ[this.LLJI.ordinal()] == 1) {
            if (C0HCN.LIZJ()) {
                View view16 = this.LLJJLIIIJLLLLLLLZ;
                if (view16 != null) {
                    view16.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108));
                    view16.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                }
                C197039127h c197039127h4 = this.LLJJJJJIL;
                if (c197039127h4 != null) {
                    c197039127h4.setTuxFont(42);
                    c197039127h4.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                }
            } else {
                View view17 = this.LLJJLIIIJLLLLLLLZ;
                if (view17 != null) {
                    view17.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160));
                    view17.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                }
                C197039127h c197039127h5 = this.LLJJJJJIL;
                if (c197039127h5 != null) {
                    c197039127h5.setTuxFont(42);
                }
            }
            C20286814Zm c20286814Zm2 = this.LLJL;
            if (c20286814Zm2 != null) {
                c20286814Zm2.LJJL = false;
            }
            View view18 = this.LLJJI;
            if (view18 != null) {
                ViewGroup.LayoutParams layoutParams = view18.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                C786410Ut5.W5(view18, layoutParams);
            }
            View view19 = this.LLJJLIIIJLLLLLLLZ;
            if (view19 != null) {
                C786410Ut5.I7(this.LLJLLIL, view19);
            }
        }
        RecyclerView recyclerView2 = this.LLJJIJIL;
        if (recyclerView2 != null && (num = this.LLILZLL) != null) {
            int iIntValue = num.intValue();
            Question question7 = this.LLILZIL;
            if (question7 != null && (optionArr2 = question7.options) != null) {
                if (C14Z9.LIZIZ(Integer.valueOf(question7.type))) {
                    layoutManagerLIZIZ = new SurveyFlexLayoutManager();
                } else {
                    layoutManagerLIZIZ = C19411210ww.LIZIZ(iIntValue, context);
                }
                recyclerView2.setLayoutManager(layoutManagerLIZIZ);
                final ArrayList arrayList = new ArrayList(optionArr2.length);
                C19719612Di.LJJII(arrayList, optionArr2);
                Question question8 = this.LLILZIL;
                if (question8 != null) {
                    numValueOf2 = Integer.valueOf(question8.type);
                } else {
                    numValueOf2 = null;
                }
                if (C14Z9.LIZIZ(numValueOf2)) {
                    final AwS465S0200000_30 awS465S0200000_30 = new AwS465S0200000_30(this, (C20284114Yl) arrayList, (ArrayList<Option>) 14);
                    c19409710whLIZ = new C19409710wh<Option>(context, arrayList) { // from class: X.10wf
                        public final Context LLILZIL;
                        public final ArrayList<Option> LLILZLL;

                        @Override // X.AbstractC21673619ry
                        public final int getItemCount() {
                            return this.LLILZLL.size();
                        }

                        {
                            super(context, arrayList);
                            this.LLILZIL = context;
                            this.LLILZLL = arrayList;
                        }

                        @Override // X.AbstractC21673619ry
                        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                            if (!(viewHolder instanceof C19409610wg)) {
                                return;
                            }
                            if (this.LLILLJJLI) {
                                C786410Ut5.I7(new ACListenerS53S0201000_29(this, i2, viewHolder, 9), viewHolder.itemView);
                            }
                            C19409610wg c19409610wg = (C19409610wg) viewHolder;
                            c19409610wg.LL.setText(((Option) ListProtector.get(this.LLILZLL, i2)).name);
                            c19409610wg.LL.setSelected(((Option) ListProtector.get(this.LLILZLL, i2)).isSelected());
                            C20285114Yv c20285114Yv = C20285114Yv.LIZ;
                            EnumC19410610wq enumC19410610wq2 = this.LLILLL;
                            c20285114Yv.getClass();
                            if (C20285114Yv.LIZLLL(enumC19410610wq2)) {
                                if (c19409610wg.LL.isSelected()) {
                                    c19409610wg.LL.setTextColorRes(R.attr.ee);
                                } else {
                                    c19409610wg.LL.setTextColorRes(R.attr.eg);
                                }
                            }
                        }

                        @Override // X.AbstractC21673619ry
                        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                            int i3;
                            int i4 = C19409910wj.LIZ[this.LLILLL.ordinal()];
                            if (i4 != 1 && i4 != 2) {
                                if (i4 != 3) {
                                    i3 = R.layout.b8c;
                                } else {
                                    i3 = R.layout.b8d;
                                }
                            } else {
                                i3 = R.layout.b8b;
                            }
                            C19409610wg c19409610wg = new C19409610wg(C786410Ut5.Td(C786410Ut5.ne(this.LLILZIL), i3, viewGroup, false));
                            try {
                                View view20 = c19409610wg.itemView;
                                if (view20 != null) {
                                    view20.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            c19409610wg.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                            try {
                                if (c19409610wg.itemView.getParent() != null) {
                                    try {
                                        SettingsManager.LIZLLL().getClass();
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                    if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                        stringBuffer.append(C19409610wg.class.getName());
                                        stringBuffer.append(" parent ");
                                        stringBuffer.append(viewGroup.getClass().getName());
                                        stringBuffer.append(" viewType ");
                                        stringBuffer.append(i2);
                                        C1AF0.LIZJ(stringBuffer.toString());
                                        ViewGroup viewGroup2 = (ViewGroup) c19409610wg.itemView.getParent();
                                        if (viewGroup2 != null) {
                                            C786410Ut5.LJJJLZIJ(c19409610wg.itemView, viewGroup2);
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C2081408Dk.LIZ(e2);
                                C2344809Gs.LIZ(e2);
                            }
                            C20612085q.LIZ = C19409610wg.class.getName();
                            return c19409610wg;
                        }
                    };
                    c19409710whLIZ.LLILZ = new InterfaceC19409010wa() { // from class: X.10wx
                        @Override // X.InterfaceC19409010wa
                        public final void LIZ(int i2, View view20) {
                            Function2<View, Integer, Unit> function2 = awS465S0200000_30;
                            if (function2 != null) {
                                function2.invoke(view20, Integer.valueOf(i2));
                            }
                        }
                    };
                } else {
                    c19409710whLIZ = C19411210ww.LIZ(iIntValue, context, arrayList, new AwS465S0200000_30(this, (C20284114Yl) arrayList, (ArrayList<Option>) 15));
                }
                this.LLJLIL = c19409710whLIZ;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((Option) next).isSelected()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                c19409710whLIZ.LL = arrayList.indexOf(next);
                C19409710wh<Option> c19409710wh = this.LLJLIL;
                if (c19409710wh != null) {
                    c19409710wh.LLILLL = this.LLJI;
                }
                recyclerView2.setAdapter(c19409710wh);
            }
        }
        if (z) {
            Aweme aweme2 = this.LL;
            if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                C01GW<C20285414Yy> c01gw2 = C20285414Yy.LIZLLL;
                c14xxLIZJ = C988000bok.LIZ().LIZJ(aid);
            }
            final View view20 = this.LLJJL;
            if (view20 != null) {
                if (c14xxLIZJ != null && c14xxLIZJ.LIZIZ) {
                    LJIIZILJ(true);
                    C19409710wh<Option> c19409710wh2 = this.LLJLIL;
                    if (c19409710wh2 != null) {
                        c19409710wh2.LLILLJJLI = false;
                        c19409710wh2.notifyDataSetChanged();
                    }
                } else if ((!this.LLIZ.isEmpty()) && (c197039127h = this.LLJJJJJIL) != null) {
                    c197039127h.setEnabled(true);
                    c197039127h.setClickable(true);
                    c197039127h.setButtonVariant(0);
                }
                Question question9 = this.LLILZIL;
                if (question9 != null && (optionArr = question9.options) != null) {
                    for (final Option option5 : optionArr) {
                        if (option5.isSelected() && option5.type == C00GA.WITH_INPUT.getType() && (view = this.LLJJJ) != null && view.getVisibility() == 8 && (viewTreeObserver = view20.getViewTreeObserver()) != null) {
                            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.14Ym
                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public final void onGlobalLayout() {
                                    ViewGroup.MarginLayoutParams marginLayoutParams;
                                    ViewTreeObserver viewTreeObserver2 = view20.getViewTreeObserver();
                                    if (viewTreeObserver2 != null) {
                                        viewTreeObserver2.removeOnGlobalLayoutListener(this);
                                        C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnGlobalLayoutListener.class);
                                    }
                                    view20.getLayoutParams().height = view20.getHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(56.0d)));
                                    C20285114Yv c20285114Yv = C20285114Yv.LIZ;
                                    EnumC19410610wq enumC19410610wq2 = this.LLJI;
                                    c20285114Yv.getClass();
                                    if (C20285114Yv.LIZLLL(enumC19410610wq2)) {
                                        View view21 = this.LLJJI;
                                        if (view21 != null) {
                                            ViewGroup.LayoutParams layoutParams2 = view21.getLayoutParams();
                                            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                                                marginLayoutParams.topMargin = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(56.0d)));
                                            }
                                            C786410Ut5.W5(view21, layoutParams2);
                                        }
                                        C20286814Zm c20286814Zm3 = this.LLJL;
                                        if (c20286814Zm3 != null) {
                                            c20286814Zm3.LJJL = true;
                                        }
                                    }
                                    view20.requestLayout();
                                    View view22 = this.LLJJJ;
                                    if (view22 != null) {
                                        C786410Ut5.LJLLLLLL(0, view22);
                                    }
                                    View view23 = this.LLJJJ;
                                    if (view23 != null) {
                                        C786410Ut5.T4(view23, 1.0f);
                                    }
                                    TuxTextView tuxTextView13 = this.LLJJJIL;
                                    if (tuxTextView13 != null) {
                                        tuxTextView13.setText(option5.additional_content);
                                    }
                                }
                            };
                            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                        }
                    }
                }
            }
        }
        LJIILIIL();
    }
}
