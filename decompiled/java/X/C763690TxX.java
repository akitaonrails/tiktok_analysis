package X;

import android.view.View;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C763690TxX implements InterfaceC20485215Du {
    public final DataChannel LIZ;
    public final KaraokeViewModel LIZIZ;

    @Override // X.InterfaceC20485215Du
    public final void LIZ() {
    }

    @Override // X.InterfaceC20485215Du
    public void LIZIZ(C763970Txz c763970Txz) {
    }

    @Override // X.InterfaceC20485215Du
    public final void LIZLLL(C763970Txz c763970Txz) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View view = c763970Txz.LJI;
        if (view != null && (viewFindViewById3 = view.findViewById(R.id.wyg)) != null) {
            C786410Ut5.T4(viewFindViewById3, 0.5f);
        }
        View view2 = c763970Txz.LJI;
        if (view2 != null && (viewFindViewById2 = view2.findViewById(R.id.wxw)) != null) {
            viewFindViewById2.setSelected(false);
        }
        View view3 = c763970Txz.LJI;
        if (view3 != null) {
            viewFindViewById = view3.findViewById(R.id.wxy);
        } else {
            viewFindViewById = null;
        }
        C500260Jjc.LJIILLIIL(viewFindViewById);
    }

    public C763690TxX(DataChannel dataChannel, KaraokeViewModel karaokeViewModel) {
        this.LIZ = dataChannel;
        this.LIZIZ = karaokeViewModel;
    }
}
