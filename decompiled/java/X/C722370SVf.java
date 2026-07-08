package X;

import Y.ACListenerS54S1200000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.IComponentStatus;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722370SVf extends ConstraintLayout implements InterfaceC722460SVo<C722380SVg> {
    public final View LL;
    public final C197039127h LLILLJJLI;

    @Override // X.InterfaceC722460SVo
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final void LLLLZLLLI(C722380SVg c722380SVg, InterfaceC722440SVm<C722380SVg> interfaceC722440SVm) {
        C786410Ut5.W5(this.LL, new ViewGroup.MarginLayoutParams(-2, -2));
        C426750GoL.LJIIIZ(this.LL, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 16);
        this.LLILLJJLI.LJJLI(false);
        this.LLILLJJLI.setBackgroundRadius(4);
        if (C722510SVt.LIZIZ()) {
            C197039127h c197039127h = this.LLILLJJLI;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ze);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c197039127h.setBackground(c384050F3z.LIZ(this.LLILLJJLI.getContext()));
        }
        this.LLILLJJLI.setMinHeight(0);
        this.LLILLJJLI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))));
        this.LLILLJJLI.setButtonStartIcon(Integer.valueOf(c722380SVg.LIZ.LIZIZ));
        this.LLILLJJLI.setText(c722380SVg.LIZIZ);
        ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(this.LL, EnumC700430Rdh.POSITIVE);
        Function1<View, Unit> function1 = c722380SVg.LIZJ;
        if (function1 != null) {
            C786410Ut5.I7(new ACListenerS54S1200000_11(interfaceC722440SVm, "scm_tag", function1, 2), this.LL);
            C2271391DvN.LIZ(this.LL, (C1A5L) C2271381DvM.LLLZZIL.getValue());
            return;
        }
        C786410Ut5.I7(null, this.LL);
    }

    public C722370SVf(Context context, C722380SVg c722380SVg, InterfaceC722440SVm<C722380SVg> interfaceC722440SVm) {
        super(context, null);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i3g, this, true);
        this.LL = viewTd;
        this.LLILLJJLI = (C197039127h) viewTd.findViewById(R.id.u1m);
        viewTd.setId(R.id.u1p);
        LLLLZLLLI(c722380SVg, interfaceC722440SVm);
    }
}
