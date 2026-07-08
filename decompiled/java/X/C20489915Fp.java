package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;

/* JADX INFO: renamed from: X.15Fp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20489915Fp<V extends View> {
    public C20489915Fp<V> LIZ;
    public final C15G1 LIZIZ;
    public final DataChannel LIZJ;
    public final V LIZLLL;
    public LifecycleOwner LJ;
    public C15G3<V> LJFF;
    public C20490215Fs LJI;

    public final <T> C20489915Fp<V> LIZ(Class<? extends NextLiveData> cls, C15G2<V, T> c15g2) {
        this.LJI = new C20490215Fs(cls, c15g2);
        C20489915Fp<V> c20489915Fp = new C20489915Fp<>(this.LIZJ, this.LIZLLL, this.LIZIZ);
        c20489915Fp.LJ = this.LJ;
        c20489915Fp.LIZ = this;
        c20489915Fp.LJFF = this.LJFF;
        return c20489915Fp;
    }

    public C20489915Fp(DataChannel dataChannel, V v, C15G1 c15g1) {
        this.LIZJ = dataChannel;
        this.LIZLLL = v;
        this.LIZIZ = c15g1;
    }
}
