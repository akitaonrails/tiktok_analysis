package X;

import Y.ACListenerS81S0300000_15;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0b7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961370b7n extends C0J8P<C961360b7m, C961540b84> {
    public final InterfaceC961740b8O LIZIZ;

    public C961370b7n(InterfaceC961740b8O interfaceC961740b8O) {
        this.LIZIZ = interfaceC961740b8O;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C961360b7m c961360b7m) {
        C961540b84 c961540b84 = (C961540b84) viewHolder;
        C961360b7m c961360b7m2 = c961360b7m;
        int i = C961250b7b.LIZ[c961360b7m2.LJFF.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LJIIIZ(c961540b84, c961360b7m2);
            } else {
                throw new C1954807lC();
            }
        } else {
            LJIIJ(c961540b84, c961360b7m2);
        }
        C960940b76.LIZIZ(c961540b84, c961360b7m2);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C961540b84(C786410Ut5.Td(layoutInflater, R.layout.gw4, viewGroup, false));
    }

    public final void LJIIIIZZ(C961540b84 c961540b84, C961360b7m c961360b7m) {
        EnumC961260b7c enumC961260b7c;
        int i = C961250b7b.LIZ[c961360b7m.LJFF.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LJIIJ(c961540b84, c961360b7m);
                enumC961260b7c = EnumC961260b7c.SHRINK;
            } else {
                throw new C1954807lC();
            }
        } else {
            LJIIIZ(c961540b84, c961360b7m);
            enumC961260b7c = EnumC961260b7c.EXTENSION;
        }
        c961360b7m.LJFF = enumC961260b7c;
    }

    public final void LJIIIZ(C961540b84 c961540b84, C961360b7m c961360b7m) {
        ((TextView) c961540b84.LL.getValue()).setText(C497740JfY.LJIJI(2131842211));
        ((LiveIconView) c961540b84.LLILLJJLI.getValue()).setIconAttr(R.attr.d3r);
        ((LiveIconView) c961540b84.LLILLJJLI.getValue()).setIconTint(C497740JfY.LJFF(R.color.di));
        C786410Ut5.I7(new ACListenerS81S0300000_15(this, c961360b7m, c961540b84, 9), c961540b84.itemView);
    }

    public final void LJIIJ(C961540b84 c961540b84, C961360b7m c961360b7m) {
        ((TextView) c961540b84.LL.getValue()).setText(C497740JfY.LJIJI(2131842212));
        ((LiveIconView) c961540b84.LLILLJJLI.getValue()).setIconAttr(R.attr.d2o);
        ((LiveIconView) c961540b84.LLILLJJLI.getValue()).setIconTint(C497740JfY.LJFF(R.color.di));
        C786410Ut5.I7(new ACListenerS81S0300000_15(this, c961360b7m, c961540b84, 10), c961540b84.itemView);
    }
}
