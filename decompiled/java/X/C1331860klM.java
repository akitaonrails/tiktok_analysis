package X;

import Y.ARunnableS53S0300000_20;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.FrescoDraweeViewNPEChecker;

/* JADX INFO: renamed from: X.0klM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331860klM extends C1331070kk5 {
    public InterfaceC1332050klf LJII;

    public C1331860klM(C1331090kk7 c1331090kk7) {
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
        if (!LJIILJJIL()) {
            C0STY.LIZ.execute(new ARunnableS53S0300000_20(this, drawable, interfaceC1320380kSq, 65));
        }
    }
}
