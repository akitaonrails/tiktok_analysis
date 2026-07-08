package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.09Qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2369409Qe {
    public final MutableLiveData<Integer> LIZ = new MutableLiveData<>(0);

    public abstract C1206540hVE LIZ();

    public void LIZJ(boolean z) {
    }

    public void LIZIZ(Lifecycle.Event event) {
        int i = C2024107wN.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            EventBus.LIZLLL().LJJI(this);
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }
}
