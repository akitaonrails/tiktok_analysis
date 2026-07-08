package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0sZ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631780sZ6 extends C11T3<Unit, C1631790sZ7, C1631790sZ7, List<? extends String>> {
    public final String LIZ;
    public final InterfaceC1635390sev LIZIZ;

    @Override // X.C11T3, X.C11T4
    public final /* bridge */ /* synthetic */ Object convertKeyActual(Object obj) {
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    @Override // X.C11T3
    public final C11NZ<List<? extends String>> requestActual(C1631790sZ7 c1631790sZ7) {
        final C1631790sZ7 c1631790sZ72 = c1631790sZ7;
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = c1631790sZ72.LIZ.getEffectId();
        if (C1624570sNT.LJIILLIIL(c1631790sZ72.LIZ)) {
            c259800zU.element = String.valueOf(c1631790sZ72.LIZ.getEffect_source_id());
        }
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0sZ8
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<List<String>> c09aj) {
                C1C7U.LIZ("FavoriteModifyFetcher@1186.requestActual$1");
                C1631780sZ6 c1631780sZ6 = this.LIZ;
                c1631780sZ6.LIZIZ.qg(new C1631880sZG((C19482611Ke) c09aj), c1631780sZ6.LIZ, Collections.singletonList(c259800zU.element), c1631790sZ72.LIZIZ);
                C1C7U.LIZIZ("FavoriteModifyFetcher@1186.requestActual$1");
            }
        });
    }

    public C1631780sZ6(String str, InterfaceC1635390sev interfaceC1635390sev) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1635390sev;
    }

    @Override // X.C11T3, X.C11T4
    public final Object convertValActual(Object obj, Object obj2) {
        return obj;
    }
}
