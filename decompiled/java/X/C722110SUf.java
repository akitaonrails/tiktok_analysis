package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722110SUf extends ConstraintLayout implements InterfaceC722460SVo<C07XG> {
    public final View LL;
    public final C431790GwT LLILLJJLI;

    public C722110SUf(Context context, C07XG c07xg) {
        super(context, null);
        View viewSd = C786410Ut5.Sd(R.layout.i3e, C786410Ut5.ne(context), this);
        this.LL = viewSd;
        C431790GwT c431790GwT = (C431790GwT) viewSd.findViewById(R.id.zf5);
        this.LLILLJJLI = c431790GwT;
        if (c431790GwT != null) {
            c431790GwT.setTextWithChevron(c07xg.LIZ);
        }
    }

    @Override // X.InterfaceC722460SVo
    public final void LLLLZLLLI(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        C07XG c07xg = (C07XG) c07xh;
        C431790GwT c431790GwT = this.LLILLJJLI;
        if (c431790GwT != null) {
            c431790GwT.setTextWithChevron(c07xg.LIZ);
        }
    }
}
