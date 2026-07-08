package X;

import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.data.EventModel;
import com.bytedance.hybrid.spark.raven.data.Features;
import com.bytedance.hybrid.spark.raven.data.RavenEvent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gK0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161140gK0 {
    public final String LIZ;
    public C1161180gK4 LIZIZ;
    public final EnumC1161160gK2 LIZJ;
    public BaseComponentData LIZLLL;
    public Map<String, EventModel> LJ;
    public List<RavenEvent> LJFF;
    public Features LJI;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1161140gK0)) {
            return false;
        }
        C1161140gK0 c1161140gK0 = (C1161140gK0) obj;
        if (!Intrinsics.LJFF(this.LIZ, c1161140gK0.LIZ) || !Intrinsics.LJFF(this.LIZIZ, c1161140gK0.LIZIZ) || !Intrinsics.LJFF(this.LJ, c1161140gK0.LJ)) {
            return false;
        }
        BaseComponentData baseComponentData = this.LIZLLL;
        if ((baseComponentData == null || !baseComponentData.areContentsTheSame(c1161140gK0.LIZLLL)) && (this.LIZLLL != null || c1161140gK0.LIZLLL != null)) {
            return false;
        }
        return true;
    }

    public C1161140gK0(String str, C1161180gK4 c1161180gK4, EnumC1161160gK2 enumC1161160gK2, BaseComponentData baseComponentData, Map<String, EventModel> map, List<RavenEvent> list, Features features) {
        this.LIZ = str;
        this.LIZIZ = c1161180gK4;
        this.LIZJ = enumC1161160gK2;
        this.LIZLLL = baseComponentData;
        this.LJ = map;
        this.LJFF = list;
        this.LJI = features;
    }
}
