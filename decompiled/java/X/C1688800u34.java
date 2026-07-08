package X;

import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0u34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688800u34 {
    public final AbstractC2255721DQs<?> LIZ;
    public final HashMap<EnumC1910370zoR, Long> LIZIZ = new HashMap<>();
    public long LIZJ;

    public C1688800u34(AbstractC2255721DQs<?> abstractC2255721DQs) {
        this.LIZ = abstractC2255721DQs;
    }

    public final void LIZ(AbstractC2255721DQs<?> abstractC2255721DQs, EnumC1910370zoR enumC1910370zoR, long j) {
        if (this.LIZIZ.get(enumC1910370zoR) == null) {
            this.LIZIZ.put(enumC1910370zoR, Long.valueOf(j));
        }
        InterfaceC1631620sYq<? super AbstractC2255721DQs<?>, ? super EnumC1910370zoR, ? super Long, Unit> interfaceC1631620sYq = C1688750u2z.LIZ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(abstractC2255721DQs, enumC1910370zoR, Long.valueOf(j));
        }
    }
}
