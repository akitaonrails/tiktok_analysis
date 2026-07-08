package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372740EjQ extends AbstractViewOnClickListenerC372950Ejl {
    public final /* synthetic */ C372490Ej1 LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ TuxIconView LLIZ;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        if (this.LLILZ.LJII.invoke().booleanValue() && !this.LLILZ.LIZLLL.invoke(Boolean.FALSE).booleanValue()) {
            C1524705y1.LIZJ(new AwS549S0100000_5(this, 868));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C372740EjQ(C372490Ej1 c372490Ej1, View view, View view2, TuxIconView tuxIconView) {
        super(1500L);
        this.LLILZ = c372490Ej1;
        this.LLILZIL = view;
        this.LLILZLL = view2;
        this.LLIZ = tuxIconView;
    }
}
