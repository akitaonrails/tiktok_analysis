package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0xtT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class ViewOnClickListenerC1836610xtT extends FrameLayout implements View.OnClickListener {
    public final C830490Whz LL;
    public final C830490Whz LLILLJJLI;
    public final C830490Whz LLILLL;
    public String LLILZ;
    public View LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public TransitionSet LLJIJIL;
    public TransitionSet LLJILJIL;
    public final int LLJILJILJ;
    public boolean LLJILLL;

    public final void LIZLLL() {
        LIZJ("CONTENT");
    }

    public final void LJ() {
        LIZJ("EMPTY");
    }

    public final void LJFF() {
        LIZJ("ERROR");
    }

    public final void LJI() {
        LIZJ("LOADING");
    }

    public final void LJII() {
        LIZJ("OFFLINE");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(String str) {
        if (!str.equals(this.LLILZ)) {
            if (this.LL.containsKey(this.LLILZ)) {
                if (this.LLJI && this.LLJILJIL != null) {
                    TransitionManager.beginDelayedTransition(this, new TransitionSet().addTransition(this.LLJILJIL).addTarget((View) this.LL.get(this.LLILZ)));
                }
                C786410Ut5.LJLLLLLL(this.LLJILJILJ, (View) this.LL.get(this.LLILZ));
            }
            if (this.LL.containsKey(str)) {
                if (this.LLJ && this.LLJIJIL != null) {
                    TransitionManager.beginDelayedTransition(this, new TransitionSet().addTransition(this.LLJIJIL).addTarget((View) this.LL.get(str)));
                }
                C786410Ut5.LJLLLLLL(0, (View) this.LL.get(str));
            }
            this.LLILZ = str;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1813060xHU interfaceC1813060xHU = (InterfaceC1813060xHU) this.LLILLL.get(this.LLILLJJLI.get(view));
        if (interfaceC1813060xHU != null) {
            interfaceC1813060xHU.LIZIZ();
        }
    }

    public void setContentView(View view) {
        LIZ(view, "CONTENT");
    }

    public void setContentViewSrc(int i) {
        LIZIZ(i, "CONTENT");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEmptyClickListener(InterfaceC1813060xHU interfaceC1813060xHU) {
        this.LLILLL.put("EMPTY", interfaceC1813060xHU);
        View view = this.LLILZLL;
        if (view == null) {
            if (this.LL.containsKey("EMPTY")) {
                C786410Ut5.I7(this, (View) this.LL.get("EMPTY"));
                this.LLILLJJLI.put(this.LL.get("EMPTY"), "EMPTY");
                return;
            }
            return;
        }
        C786410Ut5.I7(this, view);
        this.LLILLJJLI.put(this.LLILZLL, "EMPTY");
    }

    public void setEmptyView(View view) {
        LIZ(view, "EMPTY");
    }

    public void setEmptyViewSrc(int i) {
        LIZIZ(i, "EMPTY");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setErrorClickListener(InterfaceC1813060xHU interfaceC1813060xHU) {
        this.LLILLL.put("ERROR", interfaceC1813060xHU);
        View view = this.LLIZ;
        if (view == null) {
            if (this.LL.containsKey("ERROR")) {
                C786410Ut5.I7(this, (View) this.LL.get("ERROR"));
                this.LLILLJJLI.put(this.LL.get("ERROR"), "ERROR");
                return;
            }
            return;
        }
        C786410Ut5.I7(this, view);
        this.LLILLJJLI.put(this.LLIZ, "ERROR");
    }

    public void setErrorView(View view) {
        LIZ(view, "ERROR");
    }

    public void setErrorViewSrc(int i) {
        LIZIZ(i, "ERROR");
    }

    public void setHugContent(boolean z) {
        if (this.LLJILLL != z) {
            this.LLJILLL = z;
            requestLayout();
        }
    }

    public void setInTransition(TransitionSet transitionSet) {
        this.LLJIJIL = transitionSet;
    }

    public void setLoadingView(View view) {
        LIZ(view, "LOADING");
    }

    public void setLoadingViewSrc(int i) {
        LIZIZ(i, "LOADING");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOfflineClickListener(InterfaceC1813060xHU interfaceC1813060xHU) {
        this.LLILLL.put("OFFLINE", interfaceC1813060xHU);
        View view = this.LLIZLLLIL;
        if (view == null) {
            if (this.LL.containsKey("OFFLINE")) {
                C786410Ut5.I7(this, (View) this.LL.get("OFFLINE"));
                this.LLILLJJLI.put(this.LL.get("OFFLINE"), "OFFLINE");
                return;
            }
            return;
        }
        C786410Ut5.I7(this, view);
        this.LLILLJJLI.put(this.LLIZLLLIL, "OFFLINE");
    }

    public void setOfflineView(View view) {
        LIZ(view, "OFFLINE");
    }

    public void setOfflineViewSrc(int i) {
        LIZIZ(i, "OFFLINE");
    }

    public void setOutTransition(TransitionSet transitionSet) {
        this.LLJILJIL = transitionSet;
    }

    public ViewOnClickListenerC1836610xtT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C830490Whz();
        this.LLILLJJLI = new C830490Whz();
        this.LLILLL = new C830490Whz();
        this.LLJILJILJ = 8;
        this.LLILZIL = new FrameLayout(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StateLayout, 0, 0);
        if (typedArrayObtainStyledAttributes.getInt(R$styleable.StateLayout_invisibleProperty, 8) == 1) {
            this.LLJILJILJ = 4;
        } else {
            this.LLJILJILJ = 8;
        }
        setLoadingViewSrc(typedArrayObtainStyledAttributes.getResourceId(R$styleable.StateLayout_loadingSrc, -1));
        setContentViewSrc(typedArrayObtainStyledAttributes.getResourceId(R$styleable.StateLayout_contentSrc, -1));
        setEmptyViewSrc(typedArrayObtainStyledAttributes.getResourceId(R$styleable.StateLayout_emptySrc, -1));
        setErrorViewSrc(typedArrayObtainStyledAttributes.getResourceId(R$styleable.StateLayout_errorSrc, -1));
        setOfflineViewSrc(typedArrayObtainStyledAttributes.getResourceId(R$styleable.StateLayout_offlineSrc, -1));
        this.LLILZLL = findViewById(typedArrayObtainStyledAttributes.getResourceId(R$styleable.StateLayout_emptyClickId, 0));
        this.LLIZ = findViewById(typedArrayObtainStyledAttributes.getResourceId(R$styleable.StateLayout_errorClickId, 0));
        this.LLIZLLLIL = findViewById(typedArrayObtainStyledAttributes.getResourceId(R$styleable.StateLayout_offlineClickId, 0));
        this.LLJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StateLayout_useInTransition, true);
        this.LLJI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StateLayout_useOutTransition, false);
        typedArrayObtainStyledAttributes.recycle();
        this.LLJIJIL = new TransitionSet().addTransition(new Fade(1)).setDuration(300L).setInterpolator((TimeInterpolator) new AccelerateInterpolator());
        this.LLJILJIL = new TransitionSet().addTransition(new Fade(2)).setDuration(300L).setInterpolator((TimeInterpolator) new DecelerateInterpolator());
    }

    public final void LIZ(View view, String str) {
        this.LL.put(str, view);
        C786410Ut5.LJLLLLLL(this.LLJILJILJ, view);
        if (view.getParent() == this) {
            return;
        }
        addView(view);
        if (this.LLILLL.containsKey(str)) {
            C786410Ut5.I7(this, view);
        }
    }

    public final void LIZIZ(int i, String str) {
        if (i == -1) {
            LIZ(this.LLILZIL, str);
        } else {
            LIZ(C786410Ut5.Td(C786410Ut5.ne(getContext()), i, this, false), str);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLJILLL) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != this.LL.get("CONTENT")) {
                    int measuredHeight = childAt.getMeasuredHeight();
                    int measuredHeight2 = (int) ((getMeasuredHeight() - measuredHeight) * 0.4f);
                    if (childAt.getVisibility() != this.LLJILJILJ) {
                        childAt.layout(childAt.getLeft(), measuredHeight2, childAt.getRight(), measuredHeight + measuredHeight2);
                    }
                }
            }
        }
    }
}
