package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ajg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946420ajg extends AbstractC960430b6H<C01HM, C946390ajd> {
    public final InterfaceC946440aji LIZIZ;
    public final DataChannel LIZJ;

    public C946420ajg(InterfaceC946440aji interfaceC946440aji, DataChannel dataChannel) {
        this.LIZIZ = interfaceC946440aji;
        this.LIZJ = dataChannel;
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C946390ajd(C786410Ut5.Td(layoutInflater, R.layout.h_7, viewGroup, false), this.LIZIZ, this.LIZJ);
    }
}
