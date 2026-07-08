package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.0aNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932750aNd extends AbstractC960470b6L<C932770aNf> {
    public final InterfaceC932780aNg LL;
    public final LiveIconView LLILLJJLI;
    public final C16F5 LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;

    public final void L5(C932770aNf c932770aNf) {
        View view = this.itemView;
        view.setId(c932770aNf.LIZ);
        view.getLayoutParams().width = ((this.LLILZ - (this.LLILZIL * 2)) - (this.LLILZLL * 3)) / 4;
        view.setClickable(c932770aNf.LJII);
        Function1<View, Unit> function1 = c932770aNf.LJIIJJI;
        if (function1 == null) {
            C500260Jjc.LJLIIIL(500L, view, new AwS381S0200000_15(this, c932770aNf, 130));
        } else {
            function1.invoke(view);
        }
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            liveIconView.setId(c932770aNf.LJ);
            liveIconView.setIcon(c932770aNf.LJFF);
            Drawable drawable = liveIconView.getDrawable();
            if (drawable != null) {
                drawable.setAlpha((int) (c932770aNf.LJI * 255));
            }
        }
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            c16f5.setGravity(1);
            c16f5.setId(c932770aNf.LIZIZ);
            c16f5.setText(c932770aNf.LIZJ);
            C786410Ut5.k5(c16f5, c932770aNf.LIZLLL);
        }
    }

    public C932750aNd(InterfaceC932780aNg interfaceC932780aNg, View view) {
        super(view);
        this.LL = interfaceC932780aNg;
        this.LLILLJJLI = (LiveIconView) view.findViewById(R.id.jxe);
        this.LLILLL = (C16F5) view.findViewById(R.id.text);
        this.LLILZ = C497740JfY.LJIIZILJ();
        this.LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        L5((C932770aNf) obj);
    }
}
