package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722290SUx extends ConstraintLayout implements InterfaceC722460SVo<C722280SUw> {
    public final View LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;

    public final void e0(C722280SUw c722280SUw) {
        C722300SUy c722300SUy = c722280SUw.LIZ;
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (c722300SUy.LIZ == C0SV1.LOCAL.ordinal()) {
            int i = c722300SUy.LIZIZ;
            if (i > 0) {
                tuxIconView.setIconRes(i);
            }
            Integer num = c722300SUy.LIZJ;
            if (num != null) {
                tuxIconView.setTintColor(num.intValue());
            }
        } else {
            C0SV1.REMOTE.ordinal();
        }
        this.LLILLL.setText(c722280SUw.LIZIZ);
    }

    public C722290SUx(Context context, C722280SUw c722280SUw) {
        super(context, null);
        View viewSd = C786410Ut5.Sd(R.layout.i3i, C786410Ut5.ne(context), this);
        this.LL = viewSd;
        this.LLILLJJLI = (TuxIconView) viewSd.findViewById(R.id.warning_label_left_icon);
        this.LLILLL = (TuxTextView) viewSd.findViewById(R.id.warning_label_title);
        e0(c722280SUw);
    }

    @Override // X.InterfaceC722460SVo
    public final /* bridge */ /* synthetic */ void LLLLZLLLI(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        e0((C722280SUw) c07xh);
    }
}
