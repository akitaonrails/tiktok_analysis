package X;

import Y.ACListenerS118S0200000_15;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C929750aIn extends AbstractC960470b6L<C929760aIo> {
    public final View LL;
    public final InterfaceC929180aHs LLILLJJLI;
    public final LiveIconView LLILLL;
    public final C20743416Fc LLILZ;
    public final View LLILZIL;

    public final void L5(C929760aIo c929760aIo) {
        this.LLILLL.setIconAttr(c929760aIo.LIZ);
        this.LLILZ.setText(c929760aIo.LIZIZ);
        C20743416Fc c20743416Fc = this.LLILZ;
        c20743416Fc.setTextColor(C20736316Cj.LIZJ(R.attr.ezq, c20743416Fc));
        if (c929760aIo.LIZJ) {
            C786410Ut5.i5(this.LLILLL, 1.0f);
            C786410Ut5.m5(this.LLILZ, 1.0f);
        } else {
            C786410Ut5.i5(this.LLILLL, 0.34f);
            C786410Ut5.m5(this.LLILZ, 0.34f);
        }
        C500260Jjc.LJLJLJ(this.LLILZIL, c929760aIo.LIZLLL);
        C786410Ut5.I7(new ACListenerS118S0200000_15(this, c929760aIo, 33), this.LL);
    }

    public C929750aIn(View view, InterfaceC929180aHs interfaceC929180aHs) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = interfaceC929180aHs;
        this.LLILLL = (LiveIconView) view.findViewById(R.id.wut);
        this.LLILZ = (C20743416Fc) view.findViewById(R.id.wuw);
        this.LLILZIL = view.findViewById(R.id.wuv);
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C929760aIo) obj);
    }
}
