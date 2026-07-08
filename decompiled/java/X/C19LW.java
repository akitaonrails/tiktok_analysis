package X;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19LW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LW implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
        }
    }

    public C19LW(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onFocusChange$0(C19LW c19lw, View view, boolean z) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        C21384418mQ c21384418mQ;
        EditText editText;
        if (z) {
            if (!((C21384318mP) c19lw.l0).LLLIIIIL()) {
                C21384318mP c21384318mP = (C21384318mP) c19lw.l0;
                C531650Kt9 it2 = C13LZ.LJIILJJIL(0, c21384318mP.getItemCount()).iterator();
                while (it2.LLILLL) {
                    int iNextInt = it2.nextInt();
                    RecyclerView recyclerView = c21384318mP.LLIZLLLIL;
                    if (recyclerView != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iNextInt)) != null && (viewHolderFindViewHolderForAdapterPosition instanceof C21384418mQ) && (c21384418mQ = (C21384418mQ) viewHolderFindViewHolderForAdapterPosition) != null && (editText = c21384418mQ.LLILLJJLI) != null) {
                        editText.setFocusable(false);
                    }
                }
                ((C21384418mQ) c19lw.l1).LLILLJJLI.clearFocus();
                ((C21384318mP) c19lw.l0).LLLILZ();
                return;
            }
            ((C21384318mP) c19lw.l0).LLILLJJLI.uo(((C21384418mQ) c19lw.l1).getLayoutPosition(), ((C21384418mQ) c19lw.l1).LLIZLLLIL);
            C21384318mP c21384318mP2 = (C21384318mP) c19lw.l0;
            c21384318mP2.LLILZLL = view;
            c21384318mP2.LLIZ = ((C21384418mQ) c19lw.l1).getLayoutPosition();
            C786410Ut5.LJZI(0, ((C21384418mQ) c19lw.l1).LLILZIL);
            ConstraintLayout constraintLayout = ((C21384418mQ) c19lw.l1).LLILLL;
            ((C21384318mP) c19lw.l0).getClass();
            constraintLayout.setBackgroundColor(C21384318mP.LLLFZ());
            return;
        }
        C786410Ut5.LJZI(8, ((C21384418mQ) c19lw.l1).LLILZIL);
        C786410Ut5.LLD(8, ((C21384418mQ) c19lw.l1).LLILZ);
        ((C21384418mQ) c19lw.l1).LLILZ.pauseAnimation();
        ConstraintLayout constraintLayout2 = ((C21384418mQ) c19lw.l1).LLILLL;
        C844470XAv.LIZ.getClass();
        constraintLayout2.setBackgroundColor(C844470XAv.LIZ().getResources().getColor(R.color.a1d));
    }

    public static final void onFocusChange$1(C19LW c19lw, View view, boolean z) {
        CharSequence charSequenceU;
        InputMethodManager inputMethodManager;
        IBinder windowToken;
        if (z) {
            ((C21392818nm) c19lw.l0).getFypAutoScrollService().LJIILLIIL(true);
            C21392818nm c21392818nm = (C21392818nm) c19lw.l0;
            int i = c21392818nm.getLayoutParams().width;
            C21392918nn c21392918nn = C21392918nn.LIZ;
            int screenWidthDp = ((C21392818nm) c19lw.l0).getScreenWidthDp();
            c21392918nn.getClass();
            c21392818nm.LJI(i, C21392918nn.LJI(screenWidthDp, z));
            FrameLayout framelayout = ((C21392818nm) c19lw.l0).getFramelayout();
            if (framelayout != null) {
                framelayout.setBackground(C800330VaR.LIZIZ((Context) c19lw.l1, R.drawable.ddc));
            }
            ((C21392818nm) c19lw.l0).setVisibilities(z);
            return;
        }
        ((C21392818nm) c19lw.l0).getFypAutoScrollService().LJIILLIIL(false);
        C21392918nn.LIZ.getClass();
        if (C21392918nn.LIZJ) {
            C21392818nm c21392818nm2 = (C21392818nm) c19lw.l0;
            ViewGroup.LayoutParams layoutParams = c21392818nm2.getLayoutParams();
            layoutParams.width = C21392918nn.LJI(((C21392818nm) c19lw.l0).getScreenWidthDp(), z);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21392818nm2);
            c21392818nm2.setLayoutParams(layoutParams);
            View topTabContainer = ((C21392818nm) c19lw.l0).getTopTabContainer();
            if (topTabContainer != null) {
                C786410Ut5.T4(topTabContainer, 1.0f);
            }
            C21392918nn.LIZJ = false;
        } else {
            C21392818nm c21392818nm3 = (C21392818nm) c19lw.l0;
            c21392818nm3.LJI(c21392818nm3.getLayoutParams().width, C21392918nn.LJI(((C21392818nm) c19lw.l0).getScreenWidthDp(), z));
        }
        FrameLayout framelayout2 = ((C21392818nm) c19lw.l0).getFramelayout();
        if (framelayout2 != null) {
            framelayout2.setBackground(C800330VaR.LIZIZ((Context) c19lw.l1, R.drawable.ddb));
        }
        C21392818nm c21392818nm4 = (C21392818nm) c19lw.l0;
        Object objH2 = C786410Ut5.H2(c21392818nm4.getContext(), "input_method");
        CharSequence hint = null;
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
            C0F96 c0f96 = c21392818nm4.LLILLL;
            if (c0f96 != null) {
                windowToken = c0f96.getWindowToken();
            } else {
                windowToken = null;
            }
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - C21392918nn.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("pad_search_bar_keyboard_dismiss", c2344009Gk.LIZ);
        ((C21392818nm) c19lw.l0).setVisibilities(z);
        if (!C21392918nn.LIZLLL) {
            return;
        }
        C0F96 searchEditTextView = ((C21392818nm) c19lw.l0).getSearchEditTextView();
        if (searchEditTextView == null || (charSequenceU = C2204961BRm.u(searchEditTextView, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pYZPLyHy7bgWZ5xp5THjV6R2Hh0NDR+i4MFrPc7hsrDtl+A7Cw3mVcE6R4DDALrM=", null))) == null) {
            charSequenceU = "";
        }
        if (charSequenceU.length() != 0) {
            return;
        }
        C0F96 searchEditTextView2 = ((C21392818nm) c19lw.l0).getSearchEditTextView();
        if (searchEditTextView2 != null) {
            hint = searchEditTextView2.getHint();
        }
        C0F96 searchEditTextView3 = ((C21392818nm) c19lw.l0).getSearchEditTextView();
        if (searchEditTextView3 == null) {
            return;
        }
        searchEditTextView3.setText(String.valueOf(hint));
    }
}
