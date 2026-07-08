package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0eNF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086270eNF extends AbstractC1086230eNB {
    public final C11NJ LLJJL;

    @Override // X.AbstractC1086230eNB
    public final Map<String, String> LJ() {
        String str;
        View view = this.LLILZIL;
        boolean zLJJJI = C500260Jjc.LJJJI(view != null ? Boolean.valueOf(C500260Jjc.LJJJJIZL(view)) : null);
        DataChannel dataChannel = this.LLJJIJIIJIL;
        if (dataChannel == null || !C500260Jjc.LJIIZILJ(dataChannel)) {
            DataChannel dataChannel2 = this.LLJJIJIIJIL;
            str = (dataChannel2 == null || !C01C5.LIZ(dataChannel2)) ? "viewer" : "admin";
        } else {
            str = "anchor";
        }
        C1086240eNC.LIZ(str, zLJJJI);
        HashMap map = new HashMap();
        C1086250eND c1086250eND = C1086280eNG.LIZIZ;
        map.put("boost_status", c1086250eND.LJFF ? "2" : c1086250eND.LJI ? "1" : CardStruct.IStatusCode.DEFAULT);
        map.put("boost_amount", String.valueOf(C1086280eNG.LIZIZ.LJII));
        map.put("boost_countdown", String.valueOf(C1086280eNG.LIZIZ.LIZIZ));
        map.put("boost_icon", C1086280eNG.LIZIZ.LIZ);
        return map;
    }

    @Override // X.AbstractC1086230eNB
    public final void LJI() {
        super.LJI();
        this.LLJJL.LJ();
    }

    @Override // X.AbstractC1086230eNB
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJL.LJ();
    }

    public C1086270eNF(C1105400es6 c1105400es6) {
        super(c1105400es6);
        this.LLJJL = new C11NJ();
    }

    @Override // X.AbstractC1086230eNB
    public final void LJII(boolean z) {
        super.LJII(z);
        this.LLJJL.LIZ(C11NZ.LJJJJLI(1L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C516201zk(this, 125)));
    }
}
