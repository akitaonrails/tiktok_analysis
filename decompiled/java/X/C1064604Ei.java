package X;

import Y.AsS29S0100000_1;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.04Ei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1064604Ei extends FrameLayout implements InterfaceC2172581A0y {
    public RecyclerView LL;
    public TuxTextView LLILLJJLI;
    public ConstraintLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public LinearLayout LLILZLL;
    public TuxTextView LLIZ;
    public View LLIZLLLIL;
    public FrameLayout LLJ;
    public InterfaceC1065204Eo LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public List<C042Y> LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public final C1065404Eq LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public final TuxIconView LLJJJJ;

    private final int getDataSize() {
        List<C042Y> list = this.LLJILJILJ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final FrameLayout getCommerceSizeGuideContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ej5);
            this.LLJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final View getDivideLineViewFromXml() {
        View view = this.LLIZLLLIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.fz0);
        this.LLIZLLLIL = viewFindViewById;
        return viewFindViewById;
    }

    public final ConstraintLayout getSpecContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vsz);
            this.LLILLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final RecyclerView getSpecListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt1);
            this.LL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final TuxTextView getSpecNameDotFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt3);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getSpecNameFullTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt4);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getSpecNameTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt5);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getSpecNameTextLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt6);
            this.LLILZLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getSpecNameTextValueFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt7);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public C1064604Ei(Context context) {
        super(context);
        this.LLJIJIL = -1;
        this.LLJILJIL = -2;
        this.LLJILLL = -1;
        C1065404Eq c1065404Eq = new C1065404Eq();
        this.LLJJIII = c1065404Eq;
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = Integer.MAX_VALUE;
        this.LLJJIJIL = -1;
        this.LLJJJ = -1;
        C954703oH.LIZ(context, R.layout.azl, this, true);
        getSpecListFromXml().setAdapter(c1065404Eq);
        getSpecListFromXml().setItemAnimator(null);
        RecyclerView specListFromXml = getSpecListFromXml();
        ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context);
        scrollTopLinearLayoutManager.setOrientation(0);
        specListFromXml.setLayoutManager(scrollTopLinearLayoutManager);
        getSpecListFromXml().addOnScrollListener(new AsS29S0100000_1(this, 8));
        int iLIZLLL = (int) (((double) C958103op.LIZLLL()) * 0.5d);
        if (iLIZLLL > 0) {
            getSpecNameTextFromXml().setMaxWidth(iLIZLLL);
        }
        getSpecListFromXml().setClipChildren(false);
        getSpecListFromXml().setClipToPadding(false);
        getSpecContainerFromXml().setClipChildren(true);
        getSpecContainerFromXml().setClipToPadding(false);
        this.LLJJJJ = (TuxIconView) findViewById(R.id.b8y);
    }

    @Override // X.InterfaceC2172581A0y
    public final void M2(int i) {
        C042Y c042y;
        InterfaceC1065204Eo interfaceC1065204Eo = this.LLJI;
        if (interfaceC1065204Eo != null) {
            List<C042Y> list = this.LLJILJILJ;
            if (list != null) {
                c042y = (C042Y) C13LP.LJJJLZIJ(i, list);
            } else {
                c042y = null;
            }
            interfaceC1065204Eo.o5(i, c042y, this.LLJILJILJ, this.LLJJJ);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1749180vcS c1749180vcS = C1749180vcS.LIZ;
        RecyclerView specListFromXml = getSpecListFromXml();
        c1749180vcS.getClass();
        if (C1749180vcS.LIZLLL(this, specListFromXml, motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1749180vcS.LIZ.getClass();
        if (C1749180vcS.LJ(motionEvent, this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCommerceSizeGuideContainerFromXml(FrameLayout frameLayout) {
        this.LLJ = frameLayout;
    }

    public final void setDivideLineViewFromXml(View view) {
        this.LLIZLLLIL = view;
    }

    public final void setSpecContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILLL = constraintLayout;
    }

    public final void setSpecListFromXml(RecyclerView recyclerView) {
        this.LL = recyclerView;
    }

    public final void setSpecListener(InterfaceC1065204Eo interfaceC1065204Eo) {
        this.LLJI = interfaceC1065204Eo;
    }

    public final void setSpecNameDotFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setSpecNameFullTextFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setSpecNameTextFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setSpecNameTextLayoutFromXml(LinearLayout linearLayout) {
        this.LLILZLL = linearLayout;
    }

    public final void setSpecNameTextValueFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    @Override // X.InterfaceC2172581A0y
    public final void LJJIFFI(int i, Object obj) {
        boolean z;
        InterfaceC1065204Eo interfaceC1065204Eo;
        C042Y c042y;
        if (i != this.LLJIJIL) {
            z = true;
        } else {
            z = false;
        }
        if ((!(obj instanceof C1064804Ek) || z) && (interfaceC1065204Eo = this.LLJI) != null) {
            int i2 = this.LLJILLL;
            List<C042Y> list = this.LLJILJILJ;
            if (list != null) {
                c042y = (C042Y) C13LP.LJJJLZIJ(i, list);
            } else {
                c042y = null;
            }
            interfaceC1065204Eo.G4(i2, i, c042y);
        }
    }

    @Override // X.InterfaceC2172581A0y
    public final void LJJLIIIJ(int i, RecyclerView.ViewHolder viewHolder) {
        C042Y c042y;
        InterfaceC1065204Eo interfaceC1065204Eo = this.LLJI;
        if (interfaceC1065204Eo != null) {
            View view = viewHolder.itemView;
            int i2 = this.LLJILLL;
            List<C042Y> list = this.LLJILJILJ;
            if (list != null) {
                c042y = (C042Y) C13LP.LJJJLZIJ(i, list);
            } else {
                c042y = null;
            }
            interfaceC1065204Eo.LLLLZLLLI(view, i2, i, c042y);
        }
    }
}
