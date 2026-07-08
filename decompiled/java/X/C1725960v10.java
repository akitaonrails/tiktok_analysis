package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0v10, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725960v10 {
    public final EnumC1725940v0y LIZ;
    public final Map<String, Object> LIZIZ;
    public final String LIZJ;
    public final C09AE LIZLLL;

    public C1725960v10() {
        this(null, null, null, null, 31);
    }

    public C1725960v10(EnumC1725940v0y enumC1725940v0y, Map map, String str, AnonymousClass0956 anonymousClass0956, int i) {
        enumC1725940v0y = (i & 1) != 0 ? EnumC1725940v0y.NONE : enumC1725940v0y;
        map = (i & 2) != 0 ? null : map;
        str = (i & 4) != 0 ? null : str;
        anonymousClass0956 = (i & 16) != 0 ? null : anonymousClass0956;
        this.LIZ = enumC1725940v0y;
        this.LIZIZ = map;
        this.LIZJ = str;
        this.LIZLLL = anonymousClass0956;
    }
}
