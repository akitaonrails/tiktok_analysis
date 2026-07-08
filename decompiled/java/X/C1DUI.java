package X;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.bytedance.tux.input.TuxTextView;
import m2b.b;

/* JADX INFO: renamed from: X.1DUI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DUI extends ViewDataBinding {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public final TuxTextView LLJJJIL;
    public final TuxTextView LLJJJJ;
    public final TuxTextView LLJJJJJIL;
    public final TuxTextView LLJJJJLIIL;
    public b LLJJL;

    public abstract void LJIILLIIL(b bVar);

    public C1DUI(Object obj, View view, TuxTextView tuxTextView, TuxTextView tuxTextView2, TuxTextView tuxTextView3, TuxTextView tuxTextView4) {
        super(0, view, obj);
        this.LLJJJIL = tuxTextView;
        this.LLJJJJ = tuxTextView2;
        this.LLJJJJJIL = tuxTextView3;
        this.LLJJJJLIIL = tuxTextView4;
    }
}
