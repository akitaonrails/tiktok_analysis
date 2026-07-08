package X;

import Y.ACListenerS150S0100000_15;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS370S0200000_4;

/* JADX INFO: renamed from: X.0aQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934680aQk extends AbstractC960470b6L<C07U6> {
    public final Function0<Unit> LL;
    public final Function0<Unit> LLILLJJLI;
    public final C197039127h LLILLL;
    public final LiveIconView LLILZ;
    public boolean LLILZIL;
    public final boolean LLILZLL;
    public final AwS370S0200000_4 LLIZ;
    public final AwS370S0200000_4 LLIZLLLIL;

    public final void L5(boolean z) {
        this.LLILZIL = z;
        if (z) {
            C197039127h c197039127h = this.LLILLL;
            if (c197039127h != null) {
                c197039127h.LJJJJL(this.LLIZLLLIL);
            }
            C197039127h c197039127h2 = this.LLILLL;
            if (c197039127h2 != null) {
                c197039127h2.setText(C497740JfY.LJIJI(2131853881));
                return;
            }
            return;
        }
        C197039127h c197039127h3 = this.LLILLL;
        if (c197039127h3 != null) {
            c197039127h3.LJJJJL(this.LLIZ);
        }
        C197039127h c197039127h4 = this.LLILLL;
        if (c197039127h4 == null) {
            return;
        }
        c197039127h4.setText(C497740JfY.LJIJI(2131853880));
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        String str;
        View view;
        C07U6 c07u6 = (C07U6) obj;
        if (this.LLILZLL && (view = this.itemView) != null) {
            if (i == 0) {
                C426750GoL.LJIIIZ(view, 0, 0, 0, 0, false, 16);
            } else {
                C1546210qL5.LIZ.getClass();
                C426750GoL.LJIIIZ(view, 0, Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(16))), 0, 0, false, 16);
            }
            view.setBackground(C800330VaR.LIZIZ(view.getContext(), R.drawable.dk3));
        }
        if (c07u6.LIZ) {
            str = "allowed";
        } else {
            str = "allow";
        }
        C925650aCB.LIZJ(C925650aCB.LIZ(), "show", str);
        L5(c07u6.LIZ);
        C197039127h c197039127h = this.LLILLL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS150S0100000_15(this, 25));
        }
        LiveIconView liveIconView = this.LLILZ;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 26));
        }
    }

    public C934680aQk(View view, Function0<Unit> function0, Function0<Unit> function02) {
        super(view);
        this.LL = function0;
        this.LLILLJJLI = function02;
        this.LLILLL = (C197039127h) view.findViewById(R.id.bcr);
        this.LLILZ = (LiveIconView) view.findViewById(R.id.bct);
        this.LLILZLL = C930540aK4.LJIJJLI();
        this.LLIZ = new AwS370S0200000_4(this, view, 8);
        this.LLIZLLLIL = new AwS370S0200000_4(this, view, 7);
    }
}
