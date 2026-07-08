package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0jx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300670jx3 extends C09AY implements Function1<C838040WuA, Boolean> {
    public final /* synthetic */ SensorManager LL;
    public final /* synthetic */ SensorEventListener LLILLJJLI;
    public final /* synthetic */ Sensor LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1300670jx3(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i) {
        super(1);
        this.LL = sensorManager;
        this.LLILLJJLI = sensorEventListener;
        this.LLILLL = sensor;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C838040WuA c838040WuA) {
        return Boolean.valueOf(C2204961BRm.LJJLIIIJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8J0V7e9qgMGxsaWRQe4rC+V3hU=", null)));
    }
}
