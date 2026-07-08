package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18Ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21268218Ky {
    public static final Map<String, InterfaceC21243018Bg<?>> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ = linkedHashMap;
        AbstractC21243918Bp<C18C6> abstractC21243918Bp = new AbstractC21243918Bp<C18C6>() { // from class: X.18Kz
            @Override // X.InterfaceC21243018Bg
            public final String id() {
                return "raw";
            }
        };
        AbstractC21243918Bp<C18C6> abstractC21243918Bp2 = new AbstractC21243918Bp<C18C6>() { // from class: X.18Kx
            @Override // X.InterfaceC21243018Bg
            public final String id() {
                return "exist";
            }
        };
        AbstractC21243918Bp<C18C6> abstractC21243918Bp3 = new AbstractC21243918Bp<C18C6>() { // from class: X.18L0
            @Override // X.InterfaceC21243018Bg
            public final String id() {
                return "reverse";
            }
        };
        linkedHashMap.put("raw", abstractC21243918Bp);
        linkedHashMap.put("exist", abstractC21243918Bp2);
        linkedHashMap.put("reverse", abstractC21243918Bp3);
    }
}
