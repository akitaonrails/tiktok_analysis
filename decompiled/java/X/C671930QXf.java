package X;

import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671930QXf extends C671880QXa {
    public TuxTextView LLJILLL;
    public TuxIconView LLJJ;
    public boolean LLJJI;

    public final TuxIconView getIconSearchEnhanceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k3q);
            this.LLJJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTvSearchInputEnhanceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_search_input_enhance);
            this.LLJILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.C671880QXa
    public final void LIZLLL() {
        super.LIZLLL();
        C786410Ut5.h9(getTvSearchInputEnhanceFromXml(), new ACListenerS145S0100000_10(this, 86));
    }

    @Override // X.C671880QXa
    public final void LJ() {
        C786410Ut5.Sd(R.layout.ewg, C786410Ut5.ne(getContext()), this);
        LJFF();
        TuxTextView tvSearchInputEnhanceFromXml = getTvSearchInputEnhanceFromXml();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(6));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c0, getContext());
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        tvSearchInputEnhanceFromXml.setBackground(gradientDrawable);
        C786410Ut5.LLLLZLL(getTvSearchInputEnhanceFromXml(), 4);
        C786410Ut5.LLLLLLZZ(getIconSearchEnhanceFromXml(), 4);
        addOnLayoutChangeListener(new C0R42(this, 6));
    }

    @Override // X.C671880QXa
    public final void LIZJ(String str) {
        if (Intrinsics.LJFF(str, getDefaultHintWord())) {
            return;
        }
        C786410Ut5.LLLLZLL(getTvSearchInputFromXml(), 4);
        C786410Ut5.LLLLZLL(getTvSearchInputEnhanceFromXml(), 0);
        C786410Ut5.LLLLLLZZ(getIconSearchEnhanceFromXml(), 0);
        getTvSearchInputEnhanceFromXml().setText(str);
    }

    public final void setIconSearchEnhanceFromXml(TuxIconView tuxIconView) {
        this.LLJJ = tuxIconView;
    }

    public final void setTvSearchInputEnhanceFromXml(TuxTextView tuxTextView) {
        this.LLJILLL = tuxTextView;
    }

    public C671930QXf(Context context, C671890QXb c671890QXb, Function0 function0, LifecycleOwner lifecycleOwner) {
        super(context, c671890QXb, function0, lifecycleOwner);
    }
}
