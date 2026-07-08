package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0bba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979840bba {
    public static final void LIZ(RunnableC781530UlD runnableC781530UlD, int i) {
        RecyclerView.LayoutManager layoutManager = runnableC781530UlD.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
            final Context context = runnableC781530UlD.getContext();
            C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0fRF
                public final /* synthetic */ int LJIILL = 0;

                @Override // X.C21674119s3
                public final int LJIILL() {
                    return -1;
                }

                @Override // X.C21674119s3
                public final int LJIIJ(int i2, View view) {
                    return super.LJIIJ(i2, view) + this.LJIILL;
                }
            };
            c21674119s3.LIZ = i;
            layoutManager.startSmoothScroll(c21674119s3);
        }
    }
}
