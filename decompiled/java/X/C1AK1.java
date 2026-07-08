package X;

import Y.ACListenerS135S0200000_33;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1AK1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AK1 extends C0J8P<C960790b6r, C1AK2> {
    public final InterfaceC963420bB6 LIZIZ;

    public C1AK1(InterfaceC963420bB6 interfaceC963420bB6) {
        this.LIZIZ = interfaceC963420bB6;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C960790b6r c960790b6r) {
        C1AK2 c1ak2 = (C1AK2) viewHolder;
        c1ak2.LLILZIL = EnumC963730bBb.SHRINK;
        C786410Ut5.LJLZ(0, (ViewGroup) c1ak2.LLILLL.getValue());
        C786410Ut5.LLLIZZ((C16FZ) c1ak2.LLILZ.getValue(), 8);
        ((TextView) c1ak2.LL.getValue()).setText(C497740JfY.LJIJI(2131842212));
        ((LiveIconView) c1ak2.LLILLJJLI.getValue()).setIconAttr(R.attr.d2o);
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            ((LiveIconView) c1ak2.LLILLJJLI.getValue()).setIconTint(C497740JfY.LIZLLL(R.attr.a1k, contextLIZ));
        }
        C786410Ut5.I7(new ACListenerS135S0200000_33(c1ak2, this, 11), c1ak2.itemView);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C1AK2(C786410Ut5.Td(layoutInflater, R.layout.gur, viewGroup, false));
    }
}
