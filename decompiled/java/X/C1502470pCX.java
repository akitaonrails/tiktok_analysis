package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0pCX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502470pCX {
    public final EnumC1502480pCY LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1502470pCX() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    public C1502470pCX(EnumC1502480pCY enumC1502480pCY, String str, Map<String, ? extends Object> map) {
        this.LIZ = enumC1502480pCY;
        this.LIZIZ = str;
        this.LIZJ = map;
    }

    public /* synthetic */ C1502470pCX(EnumC1502480pCY enumC1502480pCY, String str, Map map, int i) {
        this((i & 1) != 0 ? EnumC1502480pCY.SUCCESS : enumC1502480pCY, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : map);
    }
}
