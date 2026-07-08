package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641160PCw extends AbstractC1585810rMx implements C0PCT<Float> {
    public final MutableLiveData<Float> LL;
    public final MutableLiveData<Float> LLILLJJLI;
    public boolean LLILLL;
    public View LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public RecyclerView LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    @Override // X.C0PCT
    public final void LIZ() {
        RecyclerView recyclerView = this.LLIZ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.removeOnScrollListener(this);
        RecyclerView recyclerView2 = this.LLIZ;
        (recyclerView2 != null ? recyclerView2 : null).addOnScrollListener(this);
    }

    @Override // X.C0PCT
    public final Float LJJ() {
        float f = this.LLILZIL;
        Float value = this.LLILLJJLI.getValue();
        if (value != null) {
            return Float.valueOf(f + value.floatValue());
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C0PCT
    public final Float LJJI() {
        float f = this.LLILZIL;
        Float value = this.LL.getValue();
        if (value != null) {
            return Float.valueOf(f + value.floatValue());
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJJIJIIJIL() {
        this.LL.setValue(Float.valueOf(((Number) this.LLJ.getValue()).floatValue()));
        this.LLILLJJLI.setValue(Float.valueOf(((Number) this.LLIZLLLIL.getValue()).floatValue()));
    }

    public C641160PCw() {
        Float fValueOf = Float.valueOf(0.0f);
        this.LL = new MutableLiveData<>(fValueOf);
        this.LLILLJJLI = new MutableLiveData<>(fValueOf);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 935));
        this.LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 932));
    }

    @Override // X.C0PCT
    public final boolean LJIILIIL() {
        return this.LLILLL;
    }

    @Override // X.C0PCT
    public final void LJI(View view) throws Throwable {
        View view2 = (View) view.getParent().getParent();
        this.LLILZ = view2;
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.msy);
        this.LLIZ = recyclerView;
        View view3 = null;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.removeOnScrollListener(this);
        RecyclerView recyclerView2 = this.LLIZ;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.addOnScrollListener(this);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 934);
        View view4 = this.LLILZ;
        if (view4 == null) {
            view4 = null;
        }
        if (view4.getHeight() <= 0) {
            View view5 = this.LLILZ;
            if (view5 != null) {
                view3 = view5;
            }
            C430110Gtl.LIZIZ(view3, new AwS554S0100000_10(awS554S0100000_10, 933));
            return;
        }
        awS554S0100000_10.invoke();
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0 && C641510PEf.LIZIZ(recyclerView, false)) {
            LJJIJIIJIL();
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (i2 == 0) {
            return;
        }
        if (i2 > 0) {
            LJJIJIIJIL();
            i3 = 1;
        } else {
            this.LL.setValue(Float.valueOf(((Number) this.LLIZLLLIL.getValue()).floatValue()));
            this.LLILLJJLI.setValue(Float.valueOf(((Number) this.LLIZLLLIL.getValue()).floatValue() * 2));
            i3 = -1;
        }
        if (i3 != this.LLILZLL) {
            int[] iArr = new int[2];
            View view = this.LLILZ;
            if (view == null) {
                view = null;
            }
            view.getLocationOnScreen(iArr);
            this.LLILZIL = iArr[1];
        }
        this.LLILZLL = i3;
    }
}
