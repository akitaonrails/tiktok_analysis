package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0DHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C336680DHu extends FrameLayout implements InterfaceC1436400nTy {
    public LifecycleOwner LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public TuxTextView LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public C1322110kVd LLJ;
    public final C01GW LLJI;

    public final InterfaceC332260D0u<EnumC319700Cg4> getSaveToLocalStateFlow() {
        return (InterfaceC332260D0u) this.LLJI.getValue();
    }

    public void LIZIZ() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.bmn, this, true);
        this.LLILLJJLI = viewTd;
        this.LLILLL = viewTd != null ? viewTd.findViewById(R.id.e1g) : null;
        View view = this.LLILLJJLI;
        this.LLILZ = view != null ? view.findViewById(R.id.tz5) : null;
        View view2 = this.LLILLJJLI;
        this.LLILZIL = view2 != null ? view2.findViewById(R.id.u05) : null;
        View view3 = this.LLILLJJLI;
        this.LLILZLL = view3 != null ? (TuxTextView) view3.findViewById(R.id.u07) : null;
        View view4 = this.LLILLJJLI;
        this.LLIZ = view4 != null ? view4.findViewById(R.id.ril) : null;
        View view5 = this.LLILLJJLI;
        this.LLIZLLLIL = view5 != null ? view5.findViewById(R.id.rix) : null;
        View view6 = this.LLILLJJLI;
        this.LLJ = view6 != null ? (C1322110kVd) view6.findViewById(R.id.l9h) : null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0CHQ.LIZ().getPublishService().LJIIZILJ();
        this.LL = null;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.LL;
    }

    public final String LIZ(int i) {
        Context context = getContext();
        if (context != null) {
            return u.LJJIFFI(context.getString(2131832045), "%1$s", String.valueOf(i), false);
        }
        return null;
    }

    @Override // X.InterfaceC1436400nTy
    public void LJIIJ(String str) {
        getSaveToLocalStateFlow().setValue(EnumC319700Cg4.SAVING);
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            tuxTextView.setText(LIZ(0));
        }
    }

    @Override // X.InterfaceC1436400nTy
    public final void LJJJLIIL(String str) {
        getSaveToLocalStateFlow().setValue(EnumC319700Cg4.IDLE);
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    @Override // X.InterfaceC1436400nTy
    public void e4(Integer num, String str) {
        int iIntValue;
        getSaveToLocalStateFlow().setValue(EnumC319700Cg4.SAVING);
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            tuxTextView.setText(LIZ(iIntValue));
        }
    }

    @Override // X.InterfaceC1436400nTy
    public void z8(int i, String str) {
        getSaveToLocalStateFlow().setValue(EnumC319700Cg4.SAVING);
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            tuxTextView.setText(LIZ(i));
        }
    }

    public C336680DHu(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJI = C452501pT.LIZ(EnumC452301pR.NONE, AFwS190S0000000_4.get$arr$(2171));
        LIZIZ();
    }
}
