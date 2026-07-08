package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0fng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141100fng {
    public final float LIZ;
    public final InterfaceC1140870fnJ LIZIZ;
    public final C1141710fof LIZJ;
    public final Map<Class<?>, Object> LIZLLL;
    public List<String> LJ;
    public List<? extends C1141870fov> LJFF;

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public C1141100fng(float f, C1140850fnH c1140850fnH, C1141710fof c1141710fof, Map map) {
        this.LIZ = f;
        this.LIZIZ = c1140850fnH;
        this.LIZJ = c1141710fof;
        this.LIZLLL = map;
    }
}
