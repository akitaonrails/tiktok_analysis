package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.bytedance.tux.input.TuxTextView;
import r4b.d;

/* JADX INFO: renamed from: X.1DUE, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DUE extends ViewDataBinding {
    public static final /* synthetic */ int LLJLIL = 0;
    public final FrameLayout LLJJJIL;
    public final C16G0 LLJJJJ;
    public final View LLJJJJJIL;
    public final View LLJJJJLIIL;
    public final TuxTextView LLJJL;
    public final TuxTextView LLJJLIIIJLLLLLLLZ;
    public d LLJL;

    public abstract void LJIILLIIL(d dVar);

    public C1DUE(Object obj, View view, FrameLayout frameLayout, C16G0 c16g0, View view2, View view3, TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        super(0, view, obj);
        this.LLJJJIL = frameLayout;
        this.LLJJJJ = c16g0;
        this.LLJJJJJIL = view2;
        this.LLJJJJLIIL = view3;
        this.LLJJL = tuxTextView;
        this.LLJJLIIIJLLLLLLLZ = tuxTextView2;
    }
}
