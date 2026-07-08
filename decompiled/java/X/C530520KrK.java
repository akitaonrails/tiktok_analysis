package X;

import Y.ARunnableS19S0101000_8;
import Y.AUListenerS258S0100000_8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: renamed from: X.0KrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530520KrK extends FrameLayout {
    public static final /* synthetic */ int LLJJIII = 0;
    public View LL;
    public RecyclerView LLILLJJLI;
    public C529680Kpy LLILLL;
    public int LLILZ;
    public View LLILZIL;
    public Function2<? super Integer, ? super Boolean, Unit> LLILZLL;
    public Function1<? super Integer, Unit> LLIZ;
    public final ContextThemeWrapper LLIZLLLIL;
    public Function1<? super Integer, Boolean> LLJ;
    public Function1<? super Integer, Boolean> LLJI;
    public final ArrayList<CutSameVideoImageExtraData> LLJIJIL;
    public TuxTextView LLJILJIL;
    public View LLJILJILJ;
    public boolean LLJILLL;
    public Function0<Unit> LLJJ;
    public final Drawable LLJJI;

    public final void LIZLLL() {
        boolean z = this.LLJIJIL.size() >= 4;
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(z ? 0 : 8, view);
        }
    }

    public final List<TikTokMediaModel> getSelectedMediaModels() {
        ArrayList<TikTokMediaModel> arrayList;
        C529680Kpy c529680Kpy = this.LLILLL;
        return (c529680Kpy == null || (arrayList = c529680Kpy.LL) == null) ? C13BV.INSTANCE : arrayList;
    }

    public final Function1<Integer, Boolean> getCanClickItemPredicate() {
        return this.LLJI;
    }

    public final Function1<Integer, Boolean> getCanDeleteItemPredicate() {
        return this.LLJ;
    }

    public final ContextThemeWrapper getDarkCtx() {
        return this.LLIZLLLIL;
    }

    public final int getSelectedPosition() {
        return this.LLILZ;
    }

    public final C529680Kpy getTemplateAdapter() {
        return this.LLILLL;
    }

    public static void LIZJ(View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.95f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS258S0100000_8(view, 7));
        valueAnimatorOfFloat.start();
    }

    public final void LIZ(int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (i < 0) {
            return;
        }
        RecyclerView recyclerView = this.LLILLJJLI;
        View view = null;
        if (recyclerView != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) != null) {
            view = viewHolderFindViewHolderForAdapterPosition.itemView;
        }
        int i2 = 0;
        if (view == null) {
            RecyclerView recyclerView2 = this.LLILLJJLI;
            if (recyclerView2 != null) {
                int i3 = i - 1;
                if (i3 > 0) {
                    i2 = i3;
                }
                recyclerView2.scrollToPosition(i2);
                return;
            }
            return;
        }
        RecyclerView recyclerView3 = this.LLILLJJLI;
        if (recyclerView3 == null) {
            return;
        }
        int i4 = i - 1;
        if (i4 > 0) {
            i2 = i4;
        }
        recyclerView3.smoothScrollToPosition(i2);
    }

    public final void LIZIZ(int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (i < 0) {
            return;
        }
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) != null && viewHolderFindViewHolderForAdapterPosition.itemView != null) {
            RecyclerView recyclerView2 = this.LLILLJJLI;
            if (recyclerView2 != null) {
                recyclerView2.smoothScrollToPosition(i);
                return;
            }
            return;
        }
        RecyclerView recyclerView3 = this.LLILLJJLI;
        if (recyclerView3 == null) {
            return;
        }
        HandlerHook.viewPost(recyclerView3, new ARunnableS19S0101000_8(i, this, 2));
    }

    public final void setCanClickItemPredicate(Function1<? super Integer, Boolean> function1) {
        this.LLJI = function1;
    }

    public final void setCanDeleteItemPredicate(Function1<? super Integer, Boolean> function1) {
        this.LLJ = function1;
    }

    public final void setDisabled(boolean z) {
        int i;
        this.LLJILLL = z;
        View view = this.LLJILJILJ;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void setNextButtonEnabled(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        TuxTextView tuxTextView = this.LLJILJIL;
        if (tuxTextView != null) {
            tuxTextView.setBackground(this.LLJJI);
        }
        float f = 1.0f;
        if (z) {
            TuxTextView tuxTextView2 = this.LLJILJIL;
            if (tuxTextView2 != null) {
                C786410Ut5.B5(tuxTextView2, 1.0f);
            }
        } else {
            TuxTextView tuxTextView3 = this.LLJILJIL;
            if (tuxTextView3 != null) {
                C786410Ut5.B5(tuxTextView3, 0.5f);
            }
        }
        TuxTextView tuxTextView4 = this.LLJILJIL;
        if (tuxTextView4 != null && (viewPropertyAnimatorAnimate = tuxTextView4.animate()) != null) {
            if (!z) {
                f = 0.5f;
            }
            ViewPropertyAnimator viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(f);
            if (viewPropertyAnimatorAlpha != null && (duration = viewPropertyAnimatorAlpha.setDuration(300L)) != null && (listener = duration.setListener(null)) != null) {
                listener.start();
            }
        }
    }

    public final void setOnNextClickListener(Function0<Unit> function0) {
        this.LLJJ = function0;
    }

    public final void setOnTemplateDeleteListener(Function1<? super Integer, Unit> function1) {
        this.LLIZ = function1;
    }

    public final void setOnTemplateSelectedListener(Function2<? super Integer, ? super Boolean, Unit> function2) {
        this.LLILZLL = function2;
    }

    public final void setTemplateAdapter(C529680Kpy c529680Kpy) {
        this.LLILLL = c529680Kpy;
    }

    public final void setTemplateItems(ArrayList<CutSameVideoImageExtraData> arrayList) {
        int size = this.LLJIJIL.size();
        this.LLJIJIL.addAll(arrayList);
        C529680Kpy c529680Kpy = this.LLILLL;
        if (c529680Kpy != null) {
            c529680Kpy.LLLLIL(this.LLJIJIL);
        }
        if (size == 0) {
            C529680Kpy c529680Kpy2 = this.LLILLL;
            if (c529680Kpy2 != null) {
                c529680Kpy2.notifyItemRangeInserted(0, arrayList.size());
            }
        } else {
            C529680Kpy c529680Kpy3 = this.LLILLL;
            if (c529680Kpy3 != null) {
                c529680Kpy3.notifyItemRangeChanged(0, this.LLJIJIL.size());
            }
        }
        LIZLLL();
    }

    public C530520KrK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZLLLIL = new ContextThemeWrapper(context, R.style.y0);
        this.LLJIJIL = new ArrayList<>();
        this.LL = C786410Ut5.Sd(R.layout.i9i, C786410Ut5.ne(context), this);
        this.LLJILJILJ = findViewById(R.id.fuu);
        this.LLILZIL = findViewById(R.id.gn9);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            View view = this.LL;
            if (view != null) {
                view.setBackgroundColor(iIntValue);
            }
        }
        setOutlineProvider(new ViewOutlineProvider() { // from class: X.0KrM
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
            }
        });
        setClipToOutline(true);
        setElevation(C0JAI.LIZ(16.0f, context));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.xib);
        this.LLILLJJLI = recyclerView;
        if (recyclerView != null) {
            final Context context2 = getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(context2) { // from class: X.0hUa
                {
                    setOrientation(0);
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final void smoothScrollToPosition(RecyclerView recyclerView2, C21673919s1 c21673919s1, int i) {
                    final Context context3 = recyclerView2.getContext();
                    C21674119s3 c21674119s3 = new C21674119s3(context3) { // from class: X.0hUb
                        @Override // X.C21674119s3
                        public final float LJIIJJI(DisplayMetrics displayMetrics) {
                            return 500 / ((long) displayMetrics.densityDpi);
                        }

                        @Override // X.C21674119s3
                        public final int LJIIIIZZ(int i2, int i3, int i4, int i5, int i6) {
                            return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
                        }
                    };
                    c21674119s3.LIZ = i;
                    startSmoothScroll(c21674119s3);
                }
            });
        }
        C423520Gj8 c423520Gj8 = new C423520Gj8();
        c423520Gj8.LLILLL = 150L;
        c423520Gj8.LLILZIL = 200L;
        c423520Gj8.LLILZ = 150L;
        c423520Gj8.LLILZLL = 150L;
        c423520Gj8.LLIZ = true;
        RecyclerView recyclerView2 = this.LLILLJJLI;
        if (recyclerView2 != null) {
            recyclerView2.setItemAnimator(c423520Gj8);
        }
        getContext();
        C529680Kpy c529680Kpy = new C529680Kpy(this);
        this.LLILLL = c529680Kpy;
        RecyclerView recyclerView3 = this.LLILLJJLI;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(c529680Kpy);
        }
        C529680Kpy c529680Kpy2 = this.LLILLL;
        if (c529680Kpy2 != null) {
            c529680Kpy2.LLJILJIL = new AwS622S0100000_8(this, 19);
        }
        C529680Kpy c529680Kpy3 = this.LLILLL;
        if (c529680Kpy3 != null) {
            c529680Kpy3.LLJILJILJ = new AwS587S0100000_8(this, 245);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.csc);
        this.LLJILJIL = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new C580850MqJ(this, 2));
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.0f);
        animate().alpha(1.0f).setDuration(300L).setListener(null).start();
        Context context3 = getContext();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        this.LLJJI = c384050F3z.LIZ(context3);
    }
}
