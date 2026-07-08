package Y;

import X.C013C;
import X.C1161140gK0;
import X.C1180920gpu;
import X.C2188811AlT;
import X.C259800zU;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class AObserverS22S0310000_12 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.bytedance.hybrid.spark.raven.component.BaseComponentData] */
    public static final void onChanged$0(AObserverS22S0310000_12 aObserverS22S0310000_12, Object obj) {
        T t;
        int iHashCode;
        C1161140gK0 c1161140gK0 = (C1161140gK0) obj;
        T value = ((MediatorLiveData) aObserverS22S0310000_12.l0).getValue();
        if (aObserverS22S0310000_12.z3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("distinctUntilChanged start,previousValue:");
            if (value != 0) {
                iHashCode = value.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(",currentValue:");
            sbLIZ.append(c1161140gK0.hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (((C013C) aObserverS22S0310000_12.l1).element || ((value == 0 && c1161140gK0 != null) || ((t = ((C259800zU) aObserverS22S0310000_12.l2).element) != 0 ? !((BaseComponentData) t).areContentsTheSame(c1161140gK0.LIZLLL) : c1161140gK0.LIZLLL != null) || (value != 0 && !Intrinsics.LJFF(value, c1161140gK0)))) {
            ((C013C) aObserverS22S0310000_12.l1).element = false;
            ((C259800zU) aObserverS22S0310000_12.l2).element = c1161140gK0.LIZLLL;
            ((MediatorLiveData) aObserverS22S0310000_12.l0).setValue(c1161140gK0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.ss.android.ugc.aweme.slash.component.BaseComponentData] */
    public static final void onChanged$1(AObserverS22S0310000_12 aObserverS22S0310000_12, Object obj) {
        T t;
        int iHashCode;
        C1180920gpu c1180920gpu = (C1180920gpu) obj;
        T value = ((MediatorLiveData) aObserverS22S0310000_12.l0).getValue();
        if (aObserverS22S0310000_12.z3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("distinctUntilChanged start,previousValue:");
            if (value != 0) {
                iHashCode = value.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(",currentValue:");
            sbLIZ.append(c1180920gpu.hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (((C013C) aObserverS22S0310000_12.l1).element || ((value == 0 && c1180920gpu != null) || ((t = ((C259800zU) aObserverS22S0310000_12.l2).element) != 0 ? !((com.ss.android.ugc.aweme.slash.component.BaseComponentData) t).areContentsTheSame(c1180920gpu.LIZLLL) : c1180920gpu.LIZLLL != null) || (value != 0 && !Intrinsics.LJFF(value, c1180920gpu)))) {
            ((C013C) aObserverS22S0310000_12.l1).element = false;
            ((C259800zU) aObserverS22S0310000_12.l2).element = c1180920gpu.LIZLLL;
            ((MediatorLiveData) aObserverS22S0310000_12.l0).setValue(c1180920gpu);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS22S0310000_12(MediatorLiveData mediatorLiveData, MediatorLiveData<C1161140gK0> mediatorLiveData2, boolean z, C013C c013c, C259800zU<BaseComponentData> c259800zU) {
        this.$t = c259800zU;
        this.l0 = mediatorLiveData;
        this.z3 = mediatorLiveData2;
        this.l1 = z;
        this.l2 = c013c;
    }
}
