package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WR6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WR6 {
    public final EnumC823400WRu LIZ;
    public Object LIZIZ;

    public abstract Object LIZIZ();

    public final Object LIZ() {
        Object obj = this.LIZIZ;
        if (obj != null) {
            return obj;
        }
        try {
            return LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C823280WRi.LIZLLL(e);
            return null;
        }
    }

    public C0WR6(EnumC823400WRu enumC823400WRu) {
        this.LIZ = enumC823400WRu;
    }
}
