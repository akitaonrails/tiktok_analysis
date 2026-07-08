package X;

import Y.ALAdapterS13S0100000_17;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086050eMt {
    public final C1295960jpS LIZ;
    public String LIZIZ = "full_progress_bubbles_lottie.zip";

    public C1086050eMt(View view) {
        C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.cxt);
        this.LIZ = c1295960jpS;
        (c1295960jpS == null ? null : c1295960jpS).addAnimatorListener(new ALAdapterS13S0100000_17(this, 97));
    }
}
