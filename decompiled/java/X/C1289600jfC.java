package X;

import Y.ARunnableS120S0100000_20;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289600jfC extends C1291820jim {
    public final WeakReference<s> LIZLLL;

    @Override // X.C1291820jim, X.AbstractC1291220jho
    public final void process(Bitmap bitmap) {
        try {
            super.process(bitmap);
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            C1289620jfE.LIZJ(new ARunnableS120S0100000_20(this, 198));
        }
    }

    public C1289600jfC(int i, s sVar) {
        super(i);
        this.LIZLLL = new WeakReference<>(sVar);
    }
}
