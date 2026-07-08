package X;

import com.larus.business.markdown.api.model.CustomSpaceScene;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689290R1z {
    public final CustomSpaceScene LIZ;
    public final Map<C14S3, Integer> LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C689290R1z)) {
            return false;
        }
        C689290R1z c689290R1z = (C689290R1z) obj;
        return this.LIZ == c689290R1z.LIZ && Intrinsics.LJFF(this.LIZIZ, c689290R1z.LIZIZ) && Float.compare(this.LIZJ, c689290R1z.LIZJ) == 0;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C689290R1z(CustomSpaceScene customSpaceScene, Map map, int i) {
        float f;
        customSpaceScene = (i & 1) != 0 ? CustomSpaceScene.V1 : customSpaceScene;
        if ((i & 4) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this(customSpaceScene, (Map<C14S3, Integer>) map, f);
    }

    public C689290R1z(CustomSpaceScene customSpaceScene, Map<C14S3, Integer> map, float f) {
        this.LIZ = customSpaceScene;
        this.LIZIZ = map;
        this.LIZJ = f;
    }
}
