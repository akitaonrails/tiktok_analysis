package X;

import X.InterfaceC204700qb;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0yyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878410yyt<T extends InterfaceC204700qb> {
    public final Class<T> LIZ;
    public final T LIZIZ = null;

    public final InterfaceC204700qb LIZ() {
        InterfaceC204700qb interfaceC204700qb;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap;
        C1878420yyu c1878420yyu = (C1878420yyu) DataChannelGlobal.LLILZ.gg0(C168K.class);
        Object obj = null;
        if (c1878420yyu != null && (concurrentHashMap = c1878420yyu.LIZ) != null) {
            obj = concurrentHashMap.get(this.LIZ);
        }
        return (!(obj instanceof InterfaceC204700qb) || (interfaceC204700qb = (InterfaceC204700qb) obj) == null) ? this.LIZIZ : interfaceC204700qb;
    }

    public C1878410yyt(Class cls) {
        this.LIZ = cls;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZIZ(InterfaceC204700qb interfaceC204700qb) {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C1878420yyu c1878420yyu = (C1878420yyu) dataChannelGlobal.gg0(C168K.class);
        if (c1878420yyu == null) {
            c1878420yyu = new C1878420yyu(null);
            dataChannelGlobal.JQ2(C168K.class, c1878420yyu);
        }
        if (interfaceC204700qb == null) {
            c1878420yyu.LIZ.remove(this.LIZ);
        } else {
            c1878420yyu.LIZ.put((Class<?>) this.LIZ, interfaceC204700qb);
        }
    }
}
