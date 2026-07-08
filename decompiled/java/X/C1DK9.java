package X;

import com.ss.android.ugc.asve.context.PreviewSize;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.1DK9, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DK9<KEY extends Enum<KEY>> implements InterfaceC2252951DGb<KEY> {
    public final boolean LIZ;
    public final Map<InterfaceC2217241BqE<C1DKA, Object>, Object> LIZIZ;
    public final Set<InterfaceC2217241BqE<C1DKA, Object>> LIZJ;

    public C1DK9(boolean z) {
        this.LIZ = z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.put(new C2217381BqS() { // from class: X.1DKL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LJ;
                }
            }, EnumC1403300mca.RATIO_9_TO_16);
            linkedHashMap.put(new C2217381BqS() { // from class: X.1DKD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LIZJ;
                }
            }, new PreviewSize(720, 1280));
            linkedHashMap.put(new C2217381BqS() { // from class: X.1DKH
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LIZLLL;
                }
            }, new PreviewSize(720, 1280));
            linkedHashMap.put(new C2217381BqS() { // from class: X.1DK5
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LIZIZ;
                }
            }, new PreviewSize(720, 1280));
            linkedHashMap.put(new C2217381BqS() { // from class: X.1DKO
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LJFF;
                }
            }, EnumC1778840wOI.SCALE_MODE_CENTER_CROP);
        }
        this.LIZIZ = linkedHashMap;
        this.LIZJ = new LinkedHashSet();
    }

    @Override // X.InterfaceC2252951DGb
    public final void LIZJ(Integer num) {
        C1DKR c1dkr = new C2217381BqS() { // from class: X.1DKR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1DKA) obj).LIZ;
            }
        };
        if (num != null) {
            this.LIZIZ.put(c1dkr, num);
        }
    }

    public final void LJI(Object obj) {
        if (obj != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("value could be null only when useDefaultParams is false, yet it is ");
        sbLIZ.append(this.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // X.InterfaceC2252951DGb
    public final void LIZ(int i, int i2) {
        this.LIZIZ.put(new C2217381BqS() { // from class: X.1DKE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1DKA) obj).LIZJ;
            }
        }, new PreviewSize(i, i2));
    }

    @Override // X.InterfaceC2252951DGb
    public final void LIZIZ(int i, int i2) {
        this.LIZIZ.put(new C2217381BqS() { // from class: X.1DKI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1DKA) obj).LIZLLL;
            }
        }, new PreviewSize(i, i2));
    }

    @Override // X.InterfaceC2252951DGb
    public final void LIZLLL(int i, int i2) {
        this.LIZIZ.put(new C2217381BqS() { // from class: X.1DK8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1DKA) obj).LIZIZ;
            }
        }, new PreviewSize(i, i2));
    }

    public final C1DKA LJ(C1DKA c1dka, C1DKA c1dka2, Set<? extends InterfaceC2217241BqE<C1DKA, ? extends Object>> set) {
        if (c1dka != null) {
            PreviewSize previewSize = (PreviewSize) LJFF(new C2217381BqS() { // from class: X.1DK6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LIZIZ;
                }
            }, c1dka2, set);
            if (previewSize == null) {
                previewSize = c1dka.LIZIZ;
            }
            PreviewSize previewSize2 = (PreviewSize) LJFF(new C2217381BqS() { // from class: X.1DKC
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LIZJ;
                }
            }, c1dka2, set);
            if (previewSize2 == null) {
                previewSize2 = c1dka.LIZJ;
            }
            PreviewSize previewSize3 = (PreviewSize) LJFF(new C2217381BqS() { // from class: X.1DKG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LIZLLL;
                }
            }, c1dka2, set);
            if (previewSize3 == null) {
                previewSize3 = c1dka.LIZLLL;
            }
            EnumC1403300mca enumC1403300mca = (EnumC1403300mca) LJFF(new C2217381BqS() { // from class: X.1DKK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LJ;
                }
            }, c1dka2, set);
            if (enumC1403300mca == null) {
                enumC1403300mca = c1dka.LJ;
            }
            EnumC1778840wOI enumC1778840wOI = (EnumC1778840wOI) LJFF(new C2217381BqS() { // from class: X.1DKN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LJFF;
                }
            }, c1dka2, set);
            if (enumC1778840wOI == null) {
                enumC1778840wOI = c1dka.LJFF;
            }
            Integer num = (Integer) LJFF(new C2217381BqS() { // from class: X.1DKQ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LIZ;
                }
            }, c1dka2, set);
            if (num == null) {
                num = c1dka.LIZ;
            }
            Integer num2 = (Integer) LJFF(new C2217381BqS() { // from class: X.1DJw
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LJI;
                }
            }, c1dka2, set);
            if (num2 == null) {
                num2 = c1dka.LJI;
            }
            Integer num3 = (Integer) LJFF(new C2217381BqS() { // from class: X.1DJz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1DKA) obj).LJII;
                }
            }, c1dka2, set);
            if (num3 == null) {
                num3 = c1dka.LJII;
            }
            return new C1DKA(num, previewSize, previewSize2, previewSize3, enumC1403300mca, enumC1778840wOI, num2, num3, c1dka.LJIIIIZZ, c1dka.LJIIIZ, c1dka.LJIIJ);
        }
        Object objLJFF = LJFF(new C2217381BqS() { // from class: X.1DK7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1DKA) obj).LIZIZ;
            }
        }, null, null);
        LJI(objLJFF);
        Object objLJFF2 = LJFF(new C2217381BqS() { // from class: X.1DKB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1DKA) obj).LIZJ;
            }
        }, null, null);
        LJI(objLJFF2);
        Object objLJFF3 = LJFF(new C2217381BqS() { // from class: X.1DKF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1DKA) obj).LIZLLL;
            }
        }, null, null);
        LJI(objLJFF3);
        Object objLJFF4 = LJFF(new C2217381BqS() { // from class: X.1DKJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1DKA) obj).LJ;
            }
        }, null, null);
        LJI(objLJFF4);
        Object objLJFF5 = LJFF(new C2217381BqS() { // from class: X.1DKM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1DKA) obj).LJFF;
            }
        }, null, null);
        LJI(objLJFF5);
        return new C1DKA((Integer) LJFF(new C2217381BqS() { // from class: X.1DKP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1DKA) obj).LIZ;
            }
        }, null, null), (PreviewSize) objLJFF, (PreviewSize) objLJFF2, (PreviewSize) objLJFF3, (EnumC1403300mca) objLJFF4, (EnumC1778840wOI) objLJFF5, (Integer) LJFF(new C2217381BqS() { // from class: X.1DJv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1DKA) obj).LJI;
            }
        }, null, null), (Integer) LJFF(new C2217381BqS() { // from class: X.1DJy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1DKA) obj).LJII;
            }
        }, null, null), null, null, null);
    }

    public final Object LJFF(C2217381BqS c2217381BqS, C1DKA c1dka, Set set) {
        Object obj;
        if (c1dka != null) {
            if (set != null && set.contains(c2217381BqS)) {
                obj = c2217381BqS.get(c1dka);
            }
            return null;
        }
        obj = ((LinkedHashMap) this.LIZIZ).get(c2217381BqS);
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
