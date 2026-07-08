package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS216S0300000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0IqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479010IqR extends C0J8P<C478900IqG, C479020IqS> {
    public final Function1<C478900IqG, Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public int LIZLLL;
    public boolean LJ = true;

    @Override // X.C0J8P
    public final void LJFF(RecyclerView.ViewHolder viewHolder) {
        C1117360fBO c1117360fBO;
        List<?> list;
        Object obj;
        if (!TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = viewHolder.getBindingAdapter();
            int layoutPosition = viewHolder.getLayoutPosition();
            if (layoutPosition != -1 && (bindingAdapter instanceof C1117360fBO) && (c1117360fBO = (C1117360fBO) bindingAdapter) != null && (list = c1117360fBO.LL) != null && (obj = ListProtector.get(list, layoutPosition)) != null && (obj instanceof C478900IqG)) {
                String strLJJIFFI = u.LJJIFFI(((C478900IqG) obj).LIZ.name, "hangout_live_cell_", "", false);
                C477860Ioa.LJIIJ(new C477870Iob("play_module", "playlabel_tab", strLJJIFFI, null, null, null, null, null, null, strLJJIFFI, strLJJIFFI, null, Integer.valueOf(viewHolder.getLayoutPosition() + 1), "PlayTabViewBinder#onViewAttachedToWindow", null, 16384), null);
            }
        }
    }

    public C479010IqR(AwS586S0100000_7 awS586S0100000_7, AwS551S0100000_7 awS551S0100000_7) {
        this.LIZIZ = awS586S0100000_7;
        this.LIZJ = awS551S0100000_7;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C478900IqG c478900IqG) {
        boolean z;
        C479020IqS c479020IqS = (C479020IqS) viewHolder;
        C478900IqG c478900IqG2 = c478900IqG;
        ((TextView) c479020IqS.LL.getValue()).setText(c478900IqG2.LIZ.title);
        TextView textView = (TextView) c479020IqS.LL.getValue();
        if (this.LIZLLL == c479020IqS.getLayoutPosition()) {
            z = true;
        } else {
            z = false;
        }
        textView.setSelected(z);
        c479020IqS.itemView.setClickable(c478900IqG2.LIZIZ);
        C500260Jjc.LJLIIIL(500L, c479020IqS.itemView, new AwS216S0300000_7(this, c478900IqG2, c479020IqS, 11));
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C479020IqS(viewGroup);
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, C478900IqG c478900IqG, List list) {
        C479020IqS c479020IqS = (C479020IqS) viewHolder;
        if (list.isEmpty()) {
            LIZJ(c479020IqS, c478900IqG);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof Boolean) {
                ((TextView) c479020IqS.LL.getValue()).setSelected(((Boolean) obj).booleanValue());
            }
        }
    }
}
