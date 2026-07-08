package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0N3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587830N3t {
    public final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();

    public final boolean LIZ(EnumC587870N3x enumC587870N3x) {
        if (this.LIZ.get(enumC587870N3x.getName()) != null && this.LIZ.get(enumC587870N3x.getName()).booleanValue()) {
            return false;
        }
        this.LIZ.put(enumC587870N3x.getName(), Boolean.TRUE);
        return true;
    }
}
