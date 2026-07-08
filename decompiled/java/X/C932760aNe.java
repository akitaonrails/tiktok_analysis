package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.0aNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932760aNe extends AbstractC960470b6L<C932770aNf> {
    public final InterfaceC932780aNg LL;
    public final LiveIconView LLILLJJLI;
    public final C16F5 LLILLL;
    public final View LLILZ;

    public final void L5(C932770aNf c932770aNf) {
        this.itemView.setId(c932770aNf.LIZ);
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            liveIconView.setId(c932770aNf.LJ);
            liveIconView.setIcon(c932770aNf.LJFF);
            Drawable drawable = liveIconView.getDrawable();
            if (drawable != null) {
                drawable.setAlpha((int) (c932770aNf.LJI * 255));
            }
            liveIconView.setClickable(c932770aNf.LJII);
            Function1<View, Unit> function1 = c932770aNf.LJIIJJI;
            if (function1 == null) {
                C500260Jjc.LJLIIIL(500L, liveIconView, new AwS381S0200000_15(this, liveIconView, 129));
            } else {
                function1.invoke(liveIconView);
            }
        }
        View view = this.LLILZ;
        if (view != null) {
            if (c932770aNf.LJIIIIZZ) {
                C0UX6 c0ux6 = c932770aNf.LJIIIZ;
                if (c0ux6 != null) {
                    RedDotExtensionKt.LJI(view, null, null, c0ux6, null);
                }
                C12ES.LJIILL(0, this.LLILZ);
            } else {
                C439101nJ.LJI(view);
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

    public C932760aNe(InterfaceC932780aNg interfaceC932780aNg, View view) {
        super(view);
        this.LL = interfaceC932780aNg;
        this.LLILLJJLI = (LiveIconView) view.findViewById(R.id.jxe);
        this.LLILLL = (C16F5) view.findViewById(R.id.text);
        this.LLILZ = view.findViewById(R.id.k38);
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        L5((C932770aNf) obj);
    }
}
