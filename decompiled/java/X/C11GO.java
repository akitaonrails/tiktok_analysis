package X;

import Y.ACListenerS131S0200000_29;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import avg.f;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS273S0300000_29;
import mf.a;

/* JADX INFO: renamed from: X.11GO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11GO extends C127M {
    public final C11GN<CompoundButton> LIZIZ;
    public Function0<Boolean> LIZJ;

    public abstract CompoundButton LJIIL(Context context, AttributeSet attributeSet);

    @Override // X.C127M
    public final View LJFF() {
        return this.LIZIZ.LIZIZ;
    }

    public final boolean LJIILIIL() {
        return ((CompoundButton) this.LIZIZ.LIZ).isChecked();
    }

    @Override // X.C127M
    public final void LJIIIZ(boolean z) {
        ((TextView) this.LIZIZ.LIZ).setEnabled(z);
    }

    @Override // X.C127M
    public final void LJIIJJI(boolean z) {
        int i;
        C11GN<CompoundButton> c11gn = this.LIZIZ;
        T t = c11gn.LIZ;
        int i2 = 0;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, t);
        TuxSpinner tuxSpinner = c11gn.LIZJ;
        if (!z) {
            i2 = 8;
        }
        C786410Ut5.LLZILL(tuxSpinner, i2);
    }

    public final void LJIILJJIL(boolean z) {
        ((CompoundButton) this.LIZIZ.LIZ).setChecked(z);
    }

    public final void LJIILL(Function0<Boolean> function0) {
        KeyEvent.Callback callback = (CompoundButton) this.LIZIZ.LIZ;
        if (callback instanceof C0HZT) {
            ((C0HZT) callback).setInterceptToggleListener(function0);
        }
        this.LIZJ = function0;
    }

    public final void LJIILLIIL(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        View view = this.LIZIZ.LIZ;
        View.OnClickListener aCListenerS131S0200000_29 = new ACListenerS131S0200000_29(onCheckedChangeListener, this, 40);
        if (C1848410yCV.LIZ) {
            aCListenerS131S0200000_29 = new f(aCListenerS131S0200000_29);
        }
        a aVar = new a(aCListenerS131S0200000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(view);
        }
        view.setOnClickListener(aVar);
    }

    public C11GO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextCell, R.attr.z2, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTextCell_android_checked, false);
        typedArrayObtainStyledAttributes.recycle();
        this.LIZIZ = new C11GN<>(context, attributeSet, new AwS273S0300000_29(this, context, attributeSet, 19));
        LJIILJJIL(z);
    }
}
