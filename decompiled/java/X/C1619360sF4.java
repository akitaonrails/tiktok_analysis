package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0sF4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619360sF4 extends C1906460zi8 {
    public final C0P0T LJIIIZ;
    public final Map<String, String> LJIIJ;

    public C1619360sF4() {
        throw null;
    }

    @Override // X.C1906460zi8
    public final Map<String, String> LIZ() {
        return this.LJIIJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1619360sF4(String str, String str2, EnumC1584360rKc enumC1584360rKc, boolean z, long j, EnumC1619300sEy enumC1619300sEy, C0P0T c0p0t, Map map, int i) {
        Map map2 = map;
        EnumC1619300sEy enumC1619300sEy2 = (i & 32) != 0 ? EnumC1619300sEy.NO_OPERATION : enumC1619300sEy;
        map2 = (i & 128) != 0 ? null : map2;
        super(str, enumC1584360rKc, z, j, enumC1619300sEy2, map2);
        this.LJIIIZ = c0p0t;
        this.LJIIJ = map2;
    }
}
