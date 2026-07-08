package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Byn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305830Byn<T> implements InterfaceC2215491BnP<T> {
    public final ConcurrentHashMap<String, T> LIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC2215491BnP
    public final T LIZ(String str) {
        return this.LIZ.get(str);
    }

    @Override // X.InterfaceC2215491BnP
    public final boolean hasCache(String str) {
        return this.LIZ.contains(str);
    }

    @Override // X.InterfaceC2215491BnP
    public final void LIZIZ(Object obj, String str) {
        if (((Number) C278860AwO.LIZ.getValue()).intValue() == 1) {
            this.LIZ.put(str, obj);
        }
    }

    @Override // X.InterfaceC2215491BnP
    public final void LIZJ(Object obj, String str) {
        C01GW c01gw = C278860AwO.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 1 && ((Number) c01gw.getValue()).intValue() != 2) {
            return;
        }
        this.LIZ.put(str, obj);
    }
}
