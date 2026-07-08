package X;

import java.util.Map;

/* JADX INFO: renamed from: X.06ex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1661306ex implements InterfaceC111300bX {
    public final Map<EnumC1660606eq, Boolean> LL;

    public C1661306ex(Map<EnumC1660606eq, Boolean> map) {
        this.LL = map;
    }

    public final boolean LIZ(EnumC1660606eq enumC1660606eq) {
        Boolean bool = this.LL.get(enumC1660606eq);
        if (bool != null) {
            return bool.booleanValue();
        }
        return enumC1660606eq.getDefaultEnable();
    }
}
