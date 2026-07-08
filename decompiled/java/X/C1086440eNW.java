package X;

import Y.ALAdapterS13S0100000_17;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eNW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086440eNW {
    public final C1295960jpS LIZ;
    public String LIZIZ = "flowers_lottie.zip";

    public C1086440eNW(View view) {
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2 = (C1295960jpS) view.findViewById(R.id.idd);
        this.LIZ = c1295960jpS2;
        if (C500260Jjc.LJJII(C497740JfY.LIZ) && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            if (c1295960jpS2 == null) {
                c1295960jpS = null;
            } else {
                c1295960jpS = c1295960jpS2;
            }
            c1295960jpS.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        (c1295960jpS2 == null ? null : c1295960jpS2).addAnimatorListener(new ALAdapterS13S0100000_17(this, 98));
    }
}
