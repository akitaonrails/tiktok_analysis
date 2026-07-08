package X;

import Y.ACListenerS146S0100000_11;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;
import u4.q0;

/* JADX INFO: renamed from: X.0SfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726880SfG extends RelativeLayout implements InterfaceC727710Sgb {
    public final View LL;
    public Function0<Unit> LLILLJJLI;
    public Function0<Unit> LLILLL;

    public final View getView() {
        return this.LL;
    }

    public C726880SfG(Context context) {
        int i;
        super(context, null, 0);
        View viewLIZLLL = C1618440sDa.LIZIZ.LJJ().LIZLLL(context, null, R.layout.fc6, this, true);
        this.LL = viewLIZLLL;
        C786410Ut5.a9((TuxIconView) viewLIZLLL.findViewById(R.id.lc0), new ACListenerS146S0100000_11(this, 45));
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 46), viewLIZLLL);
        if (C281310B0v.LIZ()) {
            i = R.raw.icon_story_camera_rounded;
        } else {
            i = R.raw.icon_story_camera;
        }
        ((TuxIconView) viewLIZLLL.findViewById(R.id.lan)).setIconRes(i);
        q0.LJIJ(viewLIZLLL.findViewById(R.id.lc0), new C739060Syu(this, 1));
    }

    @Override // X.InterfaceC727710Sgb
    public final void LIZ(boolean z) {
        int i = 0;
        C786410Ut5.LJLLLLLL(0, this.LL.findViewById(R.id.ybc));
        View viewFindViewById = this.LL.findViewById(R.id.cel);
        if (z) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
    }

    @Override // X.InterfaceC727710Sgb
    public final void LIZIZ(AwS563S0100000_19 awS563S0100000_19, AwS563S0100000_19 awS563S0100000_192) {
        this.LLILLJJLI = awS563S0100000_19;
        this.LLILLL = awS563S0100000_192;
    }
}
