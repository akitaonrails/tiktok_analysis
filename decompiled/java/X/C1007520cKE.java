package X;

import Y.ACListenerS151S0100000_16;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.Looper;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0cKE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007520cKE extends ConstraintLayout implements InterfaceC497601wk {
    public final BPEAHandler LL;
    public final C0I7D LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxIconView LLILZ;
    public final C0DWJ LLILZIL;
    public final LinearLayout LLILZLL;
    public final C01GW LLIZ;
    public Function1<? super String, Unit> LLIZLLLIL;
    public final C01GW LLJ;
    public final C1DFK LLJI;
    public final CoroutineContext LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final C2252321DDq LLJILJILJ;
    public final AnonymousClass0951 LLJILLL;

    private final C03DQ getTagsAdapter() {
        return (C03DQ) this.LLIZ.getValue();
    }

    private final C1007530cKF getTextWatcher() {
        return (C1007530cKF) this.LLJ.getValue();
    }

    public final void e0() {
        String string = a0.LJLIIIL(String.valueOf(C2204961BRm.LLLLJI(this.LLILLJJLI, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLZzG3SZiFshutcVkhk88jK3etdXrnae+BI99F6qa+aq3hzItazDH", null)))).toString();
        if (string.length() <= 0) {
            this.LLILLJJLI.clearFocus();
            return;
        }
        if (getTagsAdapter().getItemCount() >= 50) {
            this.LLILLJJLI.clearFocus();
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131832042);
            c1389890mGx.LJIIJJI();
            return;
        }
        Function1<? super String, Unit> function1 = this.LLIZLLLIL;
        if (function1 != null) {
            function1.invoke(string);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLJI.LIZIZ(null);
        super.onDetachedFromWindow();
    }

    @Override // X.InterfaceC497601wk
    public CoroutineContext getCoroutineContext() {
        return this.LLJIJIL;
    }

    public final void setAddTagAction(Function1<? super String, Unit> function1) {
        this.LLIZLLLIL = function1;
    }

    public final void setDeleteTagAction(Function1<? super Integer, Unit> function1) {
        getTagsAdapter().LLILLJJLI = function1;
    }

    public final void setLoadingState(boolean z) {
        if (z) {
            this.LLJILJILJ.setValue(new C1007500cKC(false));
            C786410Ut5.LJLIIL(600L, this.LL, new ARunnableS116S0100000_16(this, 59));
        } else {
            this.LL.removeCallbacksAndMessages(null);
            this.LLJILJILJ.setValue(C1007510cKD.LIZ);
        }
    }

    public final void setTags(List<String> list) {
        getTagsAdapter().LLLI(list);
    }

    public C1007520cKE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1007520cKE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new BPEAHandler(Looper.getMainLooper());
        this.LLIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(189));
        this.LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 311));
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LLJI = c1dfkLIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJIJIL = C09A1.LIZLLL(c1dfkLIZ, C2107308Nj.LIZ);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LLJILJIL = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(new C1007500cKC(false));
        this.LLJILJILJ = c2252321DDqLIZ2;
        C414301jJ c414301jJ = new C414301jJ(c2252321DDqLIZ, c2252321DDqLIZ2, new C1007460cK8(null));
        C05YW.LIZ.getClass();
        this.LLJILLL = C09IC.LJJIJIL(c414301jJ, this, C1370905Yd.LIZIZ, Boolean.TRUE);
        View viewSd = C786410Ut5.Sd(R.layout.co_, C786410Ut5.ne(context), this);
        C0I7D c0i7d = (C0I7D) viewSd.findViewById(R.id.gt2);
        c0i7d.setFilters(new InputFilter[]{new InputFilter.LengthFilter() { // from class: X.0cKG
        }});
        c0i7d.addTextChangedListener(getTextWatcher());
        this.LLILLJJLI = c0i7d;
        TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.z8a);
        C786410Ut5.h9(tuxTextView, new ACListenerS151S0100000_16(this, 42));
        this.LLILLL = tuxTextView;
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.jzx);
        tuxIconView.setContentDescription(context.getString(2131823577));
        C786410Ut5.a9(tuxIconView, new ACListenerS151S0100000_16(this, 43));
        this.LLILZ = tuxIconView;
        C0DWJ c0dwj = (C0DWJ) viewSd.findViewById(R.id.x1s);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context, 0);
        flexboxLayoutManager.LJJII(1);
        flexboxLayoutManager.LJJIFFI(0);
        flexboxLayoutManager.LJJI(4);
        flexboxLayoutManager.LJJIII(0);
        c0dwj.setLayoutManager(flexboxLayoutManager);
        c0dwj.setAdapter(getTagsAdapter());
        this.LLILZIL = c0dwj;
        this.LLILZLL = (LinearLayout) viewSd.findViewById(R.id.nlq);
        C23250099c.LIZLLL(this, null, null, new C1007470cK9(this, null), 3);
        C23250099c.LIZLLL(this, null, null, new C1007480cKA(this, null), 3);
    }
}
