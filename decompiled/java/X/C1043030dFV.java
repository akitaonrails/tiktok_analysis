package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dFV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043030dFV extends AbstractC1067810dtT {
    public final Context LIZ;
    public C427480GpW LIZIZ;

    public C1043030dFV(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC1542250qEh
    public final void LIZ(boolean z) {
        int i;
        C427480GpW c427480GpW = this.LIZIZ;
        if (c427480GpW != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLZIL(c427480GpW, i);
        }
    }

    @Override // X.InterfaceC1542250qEh
    public final View LIZIZ(Context context) {
        C427480GpW c427480GpW = (C427480GpW) C786410Ut5.Sd(R.layout.e9g, C786410Ut5.ne(this.LIZ), null).findViewById(R.id.rdz);
        this.LIZIZ = c427480GpW;
        return c427480GpW;
    }

    @Override // X.InterfaceC1542250qEh
    public final void setProgress(int i) {
        C427480GpW c427480GpW = this.LIZIZ;
        if (c427480GpW != null) {
            c427480GpW.setProgress(i);
        }
    }
}
