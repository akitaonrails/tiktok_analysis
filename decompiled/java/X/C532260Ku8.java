package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Ku8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532260Ku8 {
    public final Map<String, InterfaceC532390KuL<Object>> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C532260Ku8(Map<String, ? extends InterfaceC532390KuL<? extends Object>> map) {
        this.LIZ = map;
    }

    public final boolean LIZ(C532290KuB c532290KuB) {
        return this.LIZ.get(c532290KuB.LIZ) instanceof C532420KuO;
    }
}
