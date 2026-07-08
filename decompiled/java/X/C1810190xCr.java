package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810190xCr extends AbstractC485930J3v<C1809960xCU, C1810200xCs> {
    public final DataChannel LIZLLL;

    public C1810190xCr(DataChannel dataChannel) {
        super(R.layout.guf, Boolean.FALSE);
        this.LIZLLL = dataChannel;
    }

    @Override // X.AbstractC485930J3v, X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        C1810200xCs c1810200xCs = (C1810200xCs) viewHolder;
        C786410Ut5.LLIL(c1810200xCs.LL, 0);
        C786410Ut5.LLIL(c1810200xCs.LLILLJJLI, 0);
        if (((C1809960xCU) obj).LIZ.LIZIZ.group_type == EnumC1811400xEo.E_COMMERCE.getType()) {
            c1810200xCs.LL.setText(C497740JfY.LJIJI(2131844075));
            c1810200xCs.LLILLJJLI.setText(C497740JfY.LJIJI(2131844076));
        } else {
            c1810200xCs.LL.setText(C497740JfY.LJIJI(2131844559));
            c1810200xCs.LLILLJJLI.setText(C497740JfY.LJIJI(2131844592));
        }
    }

    @Override // X.AbstractC485930J3v
    public final RecyclerView.ViewHolder LJIIIIZZ(View view, ViewGroup viewGroup) {
        Boolean bool;
        DataChannel dataChannel = this.LIZLLL;
        if ((dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) && viewGroup != null) {
            view.getLayoutParams().height = viewGroup.getHeight();
        }
        return new C1810200xCs(view);
    }
}
