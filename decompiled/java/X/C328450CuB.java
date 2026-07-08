package X;

import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0CuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C328450CuB extends AbstractC751190TdN {
    public final boolean LIZIZ;
    public final DataChannel LIZJ;
    public final LifecycleOwner LIZLLL;

    @Override // X.AbstractC751190TdN
    public final boolean LIZIZ() {
        return this.LIZIZ;
    }

    public C328450CuB(LifecycleOwner lifecycleOwner, DataChannel dataChannel, boolean z) {
        this.LIZIZ = z;
        this.LIZJ = dataChannel;
        this.LIZLLL = lifecycleOwner;
    }

    public final void LIZLLL(boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, Observer<Unit> observer) {
        HashMap map = new HashMap();
        Boolean bool = Boolean.TRUE;
        map.put(8, bool);
        map.put(9, bool);
        C500260Jjc.LJJJJJ(this.LIZLLL, null, new C328440CuA(this, map, observer, null), 3);
    }
}
