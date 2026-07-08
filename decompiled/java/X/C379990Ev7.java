package X;

import Y.ACListenerS140S0100000_5;
import Y.AObserverS209S0100000_5;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ev7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379990Ev7 extends AbstractC376010Eoh {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 325));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 323));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 324));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 326));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 327));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 328));
    public final MutableLiveData<Pair<EditorProAIGCMediaItemModel, Boolean>> LLJL = new MutableLiveData<>();
    public Animator LLJLIL;
    public C380000Ev8 LLJLILLLLZIIL;

    public final void LLLLLLL() {
        ((View) this.LLJJJJ.getValue()).getLayoutParams().height = LLLLLJIL();
        ((View) this.LLJJJJJIL.getValue()).getLayoutParams().height = LLLLLJIL() + C372480Ej0.LLLLLILLIL;
        ((ConstraintLayout) this.LLJJJIL.getValue()).requestLayout();
    }

    public final int LLLLLJIL() {
        int iIntValue = LLLLIL().LJIIIZ.invoke().intValue();
        int i = C372480Ej0.LLLLLILLIL;
        return iIntValue - C372480Ej0.LLLLLILLIL;
    }

    public final void LLLLLLJ() {
        List<EditorProAIGCMediaItemModel> list;
        C375830EoP<List<EditorProAIGCMediaItemModel>> c375830EoP = LLLLILI().LIZ.LJ;
        if (c375830EoP == null || (list = c375830EoP.LIZ) == null) {
            list = C13BV.INSTANCE;
        }
        ((C380080EvG) this.LLJJJJLIIL.getValue()).setEvent(this.LLJL);
        LLLLLLLZIL(list);
    }

    public final boolean LLLLLLLLL() {
        List<EditorProAIGCMediaItemModel> list;
        Integer num = LLLLILI().LIZ.LJII;
        if (num == null || num.intValue() <= 0) {
            return false;
        }
        C375830EoP<List<EditorProAIGCMediaItemModel>> c375830EoP = LLLLILI().LIZ.LJ;
        if (c375830EoP == null || (list = c375830EoP.LIZ) == null) {
            list = C13BV.INSTANCE;
        }
        Iterator<EditorProAIGCMediaItemModel> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            int i2 = i + 1;
            if (it2.next().isSelected) {
                return (i == -1 || LLLLILI().LIZ.LJIIZILJ) ? false : true;
            }
            i = i2;
        }
        return false;
    }

    public final void LLLLLLLLLL(boolean z) {
        LLLLLLL();
        C786410Ut5.LJLLLLLL(0, this.mView);
        if (z) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.LLJJJJ.getValue();
            C786410Ut5.jd(constraintLayout, C418440Gaw.LIZIZ(Integer.valueOf(LLLLLJIL())));
            constraintLayout.animate().translationY(0.0f).setDuration(250L).setInterpolator(new C21388418n4()).start();
        }
    }

    public final void LLLLLLLZIL(List<EditorProAIGCMediaItemModel> list) {
        C380080EvG c380080EvG = (C380080EvG) this.LLJJJJLIIL.getValue();
        c380080EvG.LIZJ();
        c380080EvG.setPanelType(LLLLILI().LIZ.LIZJ);
        c380080EvG.setData(list);
        Iterator<EditorProAIGCMediaItemModel> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            int i2 = i + 1;
            if (it2.next().isSelected) {
                if (i >= 0) {
                    c380080EvG.LIZLLL(i, false);
                    return;
                }
            } else {
                i = i2;
            }
        }
        LLLLLL(null, false);
    }

    public final void LLLLLJLJLL(int i, boolean z) {
        View viewFindViewById;
        View view = this.mView;
        if (view != null && (viewFindViewById = view.findViewById(i)) != null) {
            if (z) {
                TuxIconView tuxIconView = (TuxIconView) viewFindViewById.findViewById(R.id.lho);
                if (tuxIconView != null) {
                    tuxIconView.setTintColorRes(R.attr.a1k);
                }
                TuxTextView tuxTextView = (TuxTextView) viewFindViewById.findViewById(R.id.zmx);
                if (tuxTextView != null) {
                    tuxTextView.setTextColorRes(R.attr.a1k);
                }
                viewFindViewById.setClickable(true);
                return;
            }
            TuxIconView tuxIconView2 = (TuxIconView) viewFindViewById.findViewById(R.id.lho);
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColorRes(R.attr.ei);
            }
            TuxTextView tuxTextView2 = (TuxTextView) viewFindViewById.findViewById(R.id.zmx);
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.ei);
            }
            viewFindViewById.setClickable(false);
        }
    }

    public final void LLLLLL(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, boolean z) {
        int i;
        AIGCGenerationParamType aIGCGenerationParamType;
        int i2;
        View viewFindViewById;
        TextView textView;
        EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus;
        if (editorProAIGCMediaItemModel != null) {
            LLLLIL().LJII.invoke(editorProAIGCMediaItemModel, Boolean.valueOf(z));
        }
        String string = null;
        if (editorProAIGCMediaItemModel != null && (editorProAIGCMediaItemModelStatus = editorProAIGCMediaItemModel.status) != null) {
            i = C378110Es5.LIZ[editorProAIGCMediaItemModelStatus.ordinal()];
        } else {
            i = -1;
        }
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                LLLLLJLJLL(R.id.t3b, false);
                LLLLLJLJLL(R.id.ojy, false);
                LLLLLJLJLL(R.id.t86, false);
                LLLLLJLJLL(R.id.iti, false);
                return;
            }
            LLLLLJLJLL(R.id.t3b, LLLLLLLLL());
            LLLLLJLJLL(R.id.ojy, true);
            LLLLLJLJLL(R.id.t86, false);
            LLLLLJLJLL(R.id.iti, false);
            return;
        }
        LLLLLJLJLL(R.id.t3b, LLLLLLLLL());
        LLLLLJLJLL(R.id.ojy, true);
        LLLLLJLJLL(R.id.t86, true);
        LLLLLJLJLL(R.id.iti, true);
        if (editorProAIGCMediaItemModel != null) {
            aIGCGenerationParamType = editorProAIGCMediaItemModel.type;
        } else {
            aIGCGenerationParamType = null;
        }
        if (C378280EsM.LIZ(C378280EsM.LIZIZ()) && aIGCGenerationParamType == AIGCGenerationParamType.I2I_TYPE) {
            i2 = 2131834002;
        } else {
            i2 = 2131825357;
        }
        View view = this.mView;
        if (view == null || (viewFindViewById = view.findViewById(R.id.iti)) == null || (textView = (TextView) viewFindViewById.findViewById(R.id.zmx)) == null) {
            return;
        }
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            string = sceneContext.getString(i2);
        }
        textView.setText(string);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawableLIZ;
        View viewFindViewById;
        View viewFindViewById2;
        View view2;
        ViewGroup viewGroup;
        Context sceneContext;
        TuxIconView tuxIconView;
        TextView textView;
        int iIntValue;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EvB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C377830Erd) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 313));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Eui
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C377830Erd) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 314));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Euj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C377830Erd) obj).LJII;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 315));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EvA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C377830Erd) obj).LJIIZILJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 316));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Euk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C377830Erd) obj).LJ;
            }
        }, new AwS584S0100000_5(this, 311));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Euh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C377830Erd) obj).LJI;
            }
        }, new AwS584S0100000_5(this, 312));
        this.LLJL.observe(this, new AObserverS209S0100000_5(this, 36));
        C786410Ut5.Y7((ConstraintLayout) this.LLJJL.getValue(), new ACListenerS140S0100000_5(this, 29));
        C786410Ut5.R7((LinearLayout) this.LLJJJJJIL.getValue(), new View.OnClickListener() { // from class: X.0EvD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
            }
        });
        View view3 = (View) this.LLJJJJ.getValue();
        Context sceneContext2 = getSceneContext();
        TuxIconView tuxIconView2 = null;
        if (sceneContext2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(14));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(14));
            drawableLIZ = c384050F3z.LIZ(sceneContext2);
        } else {
            drawableLIZ = null;
        }
        view3.setBackground(drawableLIZ);
        LLLLLLL();
        LLLLLLJ();
        LLLLLLIL(R.id.t3b, R.raw.icon_arrow_counter_clockwise, 2131825359, "click_re_generate", new AwS549S0100000_5(this, 343));
        LLLLLLIL(R.id.ojy, R.raw.icon_pen, 2131825358, "click_modify", new AwS549S0100000_5(this, 341));
        LLLLLLIL(R.id.iti, R.raw.icon_video_star, 2131825357, "click_generate_video", new AwS549S0100000_5(this, 338));
        LLLLLLIL(R.id.t86, R.raw.icon_flag, 2131825360, "click_report", new AwS549S0100000_5(this, 345));
        Scene scene = this.mParentScene;
        if (scene != null && (view2 = scene.mView) != null && (viewGroup = (ViewGroup) view2.findViewById(R.id.gtm)) != null && (sceneContext = getSceneContext()) != null) {
            C380000Ev8 c380000Ev8 = new C380000Ev8(sceneContext);
            View viewFindViewById3 = viewGroup.findViewById(R.id.ap8);
            c380000Ev8.LIZ = viewFindViewById3;
            if (viewFindViewById3 == null) {
                try {
                    View viewLJLLJ = C786410Ut5.LJLLJ(sceneContext, R.layout.bz7, null);
                    if (viewLJLLJ != null) {
                        C384050F3z c384050F3z2 = new C384050F3z();
                        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zc);
                        viewLJLLJ.setBackground(c384050F3z2.LIZ(sceneContext));
                        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0EvE
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                            }
                        }, viewLJLLJ);
                    } else {
                        viewLJLLJ = null;
                    }
                    c380000Ev8.LIZ = viewLJLLJ;
                    if (viewLJLLJ != null && (textView = (TextView) viewLJLLJ.findViewById(R.id.gus)) != null) {
                        textView.setText(textView.getContext().getString(2131820555));
                        Context context = textView.getContext();
                        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.za, context)) != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = -16777216;
                        }
                        textView.setShadowLayer(2.0f, 0.0f, 2.0f, iIntValue);
                    }
                    View view4 = c380000Ev8.LIZ;
                    if (view4 != null && (tuxIconView = (TuxIconView) view4.findViewById(R.id.gur)) != null) {
                        tuxIconView.setImageDrawable(C380000Ev8.LIZ(tuxIconView.getContext()));
                        tuxIconView2 = tuxIconView;
                    }
                    c380000Ev8.LIZIZ = tuxIconView2;
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                    viewGroup.addView(c380000Ev8.LIZ, layoutParams);
                } catch (InflateException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            View view5 = c380000Ev8.LIZ;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 339);
            TuxIconView tuxIconView3 = c380000Ev8.LIZIZ;
            if (tuxIconView3 != null) {
                C786410Ut5.a9(tuxIconView3, new ACListenerS140S0100000_5(awS549S0100000_5, 30));
            }
            this.LLJLILLLLZIIL = c380000Ev8;
        }
        View view6 = this.mView;
        if (view6 != null && (viewFindViewById = view6.findViewById(R.id.t3b)) != null && (viewFindViewById2 = viewFindViewById.findViewById(R.id.lho)) != null && this.LLJLIL == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById2, "rotation", 360.0f, 0.0f);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            this.LLJLIL = objectAnimatorOfFloat;
        }
        LLLLLLJ();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bzh, viewGroup, false);
        C786410Ut5.LJLLLLLL(8, viewTd);
        return (ViewGroup) viewTd;
    }

    public final void LLLLLLIL(int i, int i2, int i3, final String str, final Function0<Unit> function0) {
        ViewStub viewStub;
        View viewLJLLLL;
        String string;
        View view = this.mView;
        if (view != null && (viewStub = (ViewStub) view.findViewById(i)) != null && (viewLJLLLL = C786410Ut5.LJLLLL(viewStub)) != null) {
            TuxIconView tuxIconView = (TuxIconView) viewLJLLLL.findViewById(R.id.lho);
            if (tuxIconView != null) {
                tuxIconView.setIconRes(i2);
            }
            TextView textView = (TextView) viewLJLLLL.findViewById(R.id.zmx);
            if (textView != null) {
                Context sceneContext = getSceneContext();
                if (sceneContext != null) {
                    string = sceneContext.getString(i3);
                } else {
                    string = null;
                }
                textView.setText(string);
            }
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Ev9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.LLLLIL().LJIIIIZZ.invoke(str);
                    function0.invoke();
                }
            }, viewLJLLLL);
        }
    }
}
