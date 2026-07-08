package X;

import Y.AsS32S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0F30, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F30 extends ConstraintLayout {
    public final RecyclerView LL;
    public final C376330EpD LLILLJJLI;
    public final View LLILLL;
    public float LLILZ;
    public C0F31 LLILZIL;
    public C0E3W LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI;
    public int LLJIJIL;
    public C0F3D LLJILJIL;
    public C560530Lyd<Long> LLJILJILJ;
    public C560530Lyd<Long> LLJILLL;
    public C560530Lyd<Long> LLJJ;
    public Function1<? super Integer, Unit> LLJJI;
    public final C0F33 LLJJIII;
    public C0F3A LLJJIJI;

    public final boolean e0() {
        return ((Boolean) this.LLJI.getValue()).booleanValue();
    }

    public final C560530Lyd<Long> getCurStartTimeEvent() {
        return this.LLJILJILJ;
    }

    public final C0F3D getCursorTouchListener() {
        return this.LLJILJIL;
    }

    public final InterfaceC358390E3h getDynamicParams() {
        return this.LLJJIII;
    }

    public final C0F3A getFrameCacheProvider() {
        return this.LLJJIJI;
    }

    public final RecyclerView getFrameRecycler() {
        return this.LL;
    }

    public final C560530Lyd<Long> getOnScrollTouchUp() {
        return this.LLJJ;
    }

    public final Function1<Integer, Unit> getOnScrollerChange() {
        return this.LLJJI;
    }

    public final C560530Lyd<Long> getRangeSeekEvent() {
        return this.LLJILLL;
    }

    public final int getSelectRangeWidth() {
        return this.LLJIJIL;
    }

    public final void setCurStartTimeEvent(C560530Lyd<Long> c560530Lyd) {
        this.LLJILJILJ = c560530Lyd;
    }

    public final void setCursorTouchListener(C0F3D c0f3d) {
        this.LLJILJIL = c0f3d;
    }

    public final void setFrameCacheProvider(C0F3A c0f3a) {
        this.LLJJIJI = c0f3a;
    }

    public final void setOnScrollTouchUp(C560530Lyd<Long> c560530Lyd) {
        this.LLJJ = c560530Lyd;
    }

    public final void setOnScrollerChange(Function1<? super Integer, Unit> function1) {
        this.LLJJI = function1;
    }

    public final void setRangeSeekEvent(C560530Lyd<Long> c560530Lyd) {
        this.LLJILLL = c560530Lyd;
    }

    public final void setSelectRangeWidth(int i) {
        this.LLJIJIL = i;
    }

    public C0F30(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0F30(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJ = true;
        this.LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(context, 758));
        this.LLJIJIL = C0F39.LIZ;
        this.LLJILJILJ = new C560530Lyd<>();
        this.LLJILLL = new C560530Lyd<>();
        this.LLJJ = new C560530Lyd<>();
        this.LLJJIII = new C0F33(this);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.byv, this, true);
        RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.ikb);
        this.LL = recyclerView;
        View viewFindViewById = viewTd.findViewById(R.id.view_rect);
        this.LLILLL = viewFindViewById;
        C376330EpD c376330EpD = (C376330EpD) viewTd.findViewById(R.id.gpc);
        this.LLILLJJLI = c376330EpD;
        int iLIZ = C372570Ej9.LIZ(2);
        int iLIZ2 = C372570Ej9.LIZ(86);
        View viewFindViewById2 = viewTd.findViewById(R.id.ai8);
        int i2 = C0F39.LIZJ;
        this.LLJIJIL = i2 - (iLIZ2 * 2);
        viewFindViewById.getLayoutParams().width = this.LLJIJIL;
        viewFindViewById2.getLayoutParams().width = this.LLJIJIL + (iLIZ * 2);
        Integer numLIZJ = C1308910kAL.LIZJ(C0EGL.LIZ(), context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            View viewFindViewById3 = viewTd.findViewById(R.id.ai9);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setBackgroundColor(iIntValue);
            }
            View viewFindViewById4 = viewTd.findViewById(R.id.ahw);
            if (viewFindViewById4 != null) {
                viewFindViewById4.setBackgroundColor(iIntValue);
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        int i3 = (i2 - this.LLJIJIL) / 2;
        C369030EdR.LIZJ(recyclerView, i3, getPaddingTop(), i3, getPaddingBottom());
        recyclerView.setClipToPadding(false);
        c376330EpD.setOnMoveListener(new AwS619S0100000_5(this, 23));
        c376330EpD.setOnMoveDownListener(new AwS584S0100000_5(this, 679));
        c376330EpD.setOnMoveUpListener(new AwS584S0100000_5(this, 680));
        recyclerView.addOnScrollListener(new AsS32S0100000_5(this, 2));
    }
}
