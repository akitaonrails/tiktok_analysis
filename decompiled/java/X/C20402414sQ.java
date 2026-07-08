package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14sQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20402414sQ extends AbstractC960470b6L<C20407814tI> {
    public final InterfaceC20408314tN LL;
    public final View LLILLJJLI;

    public C20402414sQ(View view, InterfaceC20408314tN interfaceC20408314tN) {
        super(view);
        this.LL = interfaceC20408314tN;
        this.LLILLJJLI = view.findViewById(R.id.cw9);
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        layoutParams.height = ((C20407814tI) obj).LIZ;
        C786410Ut5.W5(this.itemView, layoutParams);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.14sy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.LL.LL.LIZIZ();
            }
        }, this.LLILLJJLI);
    }
}
