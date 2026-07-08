package X;

import Y.ACListenerS54S1200000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SVR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVR extends ConstraintLayout implements InterfaceC722460SVo<C0SVS> {
    public final View LL;
    public final TuxIconView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxTextView LLILZ;

    public final void e0(TuxIconView tuxIconView, C722300SUy c722300SUy) {
        if (c722300SUy.LIZ == C0SV1.LOCAL.ordinal()) {
            int i = c722300SUy.LIZIZ;
            if (i > 0) {
                tuxIconView.setIconRes(i);
            }
            Integer num = c722300SUy.LIZJ;
            if (num != null) {
                tuxIconView.setTintColor(num.intValue());
                return;
            }
            return;
        }
        C0SV1.REMOTE.ordinal();
    }

    @Override // X.InterfaceC722460SVo
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final void LLLLZLLLI(C0SVS c0svs, InterfaceC722440SVm<C0SVS> interfaceC722440SVm) {
        Integer num;
        C0SVT c0svt = c0svs.LIZJ;
        if (c0svt != null) {
            int i = c0svt.LIZ;
            if (i == C0SXM.IMAGE.ordinal()) {
                int i2 = c0svt.LIZIZ;
                if (i2 > 0) {
                    this.LL.setBackgroundResource(i2);
                }
            } else if (i == C0SXM.COLOR.ordinal() && (num = c0svt.LIZJ) != null) {
                this.LL.setBackgroundColor(num.intValue());
            }
        }
        Function1<View, Unit> function1 = c0svs.LJ;
        if (function1 != null) {
            C786410Ut5.I7(new ACListenerS54S1200000_11(interfaceC722440SVm, "banner_view", function1, 2), this.LL);
        }
        e0(this.LLILLJJLI, c0svs.LIZ);
        this.LLILZ.setText(c0svs.LIZIZ);
        C722300SUy c722300SUy = c0svs.LIZLLL;
        if (c722300SUy != null) {
            e0(this.LLILLL, c722300SUy);
            C786410Ut5.LLLLLLZZ(this.LLILLL, 0);
        }
    }

    public C0SVR(Context context, C0SVS c0svs, InterfaceC722440SVm<C0SVS> interfaceC722440SVm) {
        super(context, null);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i3d, this, true);
        this.LL = viewTd;
        this.LLILLJJLI = (TuxIconView) viewTd.findViewById(R.id.bry);
        this.LLILLL = (TuxIconView) viewTd.findViewById(R.id.bs3);
        this.LLILZ = (TuxTextView) viewTd.findViewById(R.id.bsc);
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        LLLLZLLLI(c0svs, interfaceC722440SVm);
    }
}
