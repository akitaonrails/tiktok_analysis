package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import j0b.c;

/* JADX INFO: renamed from: X.04Iw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1076404Iw extends ViewDataBinding {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public final TuxTextView LLJJJIL;
    public final ConstraintLayout LLJJJJ;
    public final TuxIconView LLJJJJJIL;
    public final TuxTextView LLJJJJLIIL;
    public c LLJJL;

    public abstract void LJIILLIIL(c cVar);

    public AbstractC1076404Iw(Object obj, View view, TuxTextView tuxTextView, ConstraintLayout constraintLayout, TuxIconView tuxIconView, TuxTextView tuxTextView2) {
        super(0, view, obj);
        this.LLJJJIL = tuxTextView;
        this.LLJJJJ = constraintLayout;
        this.LLJJJJJIL = tuxIconView;
        this.LLJJJJLIIL = tuxTextView2;
    }
}
