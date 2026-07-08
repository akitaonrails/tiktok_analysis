package X;

import Y.ARunnableS44S0300000_11;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.FrescoDraweeViewNPEChecker;

/* JADX INFO: renamed from: X.0STV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0STV extends C1331070kk5 {
    public C0STW LJII;

    public C0STV(C1331090kk7 c1331090kk7) {
        super(c1331090kk7);
    }

    @Override // X.C1331070kk5
    public final void LJJIFFI(Drawable drawable, InterfaceC1320380kSq interfaceC1320380kSq) {
        if (drawable == null) {
            try {
                FrescoDraweeViewNPEChecker.recordDrawableNullPoint();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C0STY.LIZ.execute(new ARunnableS44S0300000_11(interfaceC1320380kSq, this, drawable, 21));
    }
}
