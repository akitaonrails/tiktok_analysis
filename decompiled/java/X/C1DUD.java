package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.bytedance.tux.input.TuxTextView;
import r4b.d;

/* JADX INFO: renamed from: X.1DUD, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DUD extends ViewDataBinding {
    public static final /* synthetic */ int LLJL = 0;
    public final FrameLayout LLJJJIL;
    public final C16G0 LLJJJJ;
    public final View LLJJJJJIL;
    public final TuxTextView LLJJJJLIIL;
    public final TuxTextView LLJJL;
    public d LLJJLIIIJLLLLLLLZ;

    public abstract void LJIILLIIL(d dVar);

    public C1DUD(Object obj, View view, FrameLayout frameLayout, C16G0 c16g0, View view2, TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        super(0, view, obj);
        this.LLJJJIL = frameLayout;
        this.LLJJJJ = c16g0;
        this.LLJJJJJIL = view2;
        this.LLJJJJLIIL = tuxTextView;
        this.LLJJL = tuxTextView2;
    }
}
