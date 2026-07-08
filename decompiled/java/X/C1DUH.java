package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import ola.k;

/* JADX INFO: renamed from: X.1DUH, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DUH extends ViewDataBinding {
    public static final /* synthetic */ int LLJL = 0;
    public final FrameLayout LLJJJIL;
    public final TuxIconView LLJJJJ;
    public final SmartImageView LLJJJJJIL;
    public final TuxTextView LLJJJJLIIL;
    public final ConstraintLayout LLJJL;
    public k LLJJLIIIJLLLLLLLZ;

    public abstract void LJIILLIIL(k kVar);

    public C1DUH(Object obj, View view, FrameLayout frameLayout, TuxIconView tuxIconView, SmartImageView smartImageView, TuxTextView tuxTextView, ConstraintLayout constraintLayout) {
        super(0, view, obj);
        this.LLJJJIL = frameLayout;
        this.LLJJJJ = tuxIconView;
        this.LLJJJJJIL = smartImageView;
        this.LLJJJJLIIL = tuxTextView;
        this.LLJJL = constraintLayout;
    }
}
