package X;

import X.C161R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.162n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207107162n<DATA extends C161R> extends C163Z<C207099162f<DATA>> {
    public final EnumC207101162h LIZ;
    public final C161Q<DATA> LIZIZ;
    public final C207099162f<DATA> LIZJ;

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJFF(Aweme aweme, AnonymousClass1648 anonymousClass1648) {
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ C163A LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AnonymousClass1636
    public final EnumC207101162h LIZJ() {
        return this.LIZ;
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIIZ(Aweme aweme) {
        return C161N.LIZIZ.LJLJJL(aweme, this.LIZIZ);
    }

    public C207107162n(EnumC207101162h enumC207101162h, C161Q<DATA> c161q) {
        this.LIZ = enumC207101162h;
        this.LIZIZ = c161q;
        this.LIZJ = new C207099162f<>(enumC207101162h, c161q);
    }

    @Override // X.AnonymousClass1636
    public final void LJII(Aweme aweme, C207127163h c207127163h) {
        aweme.getAid();
        AnonymousClass1644 anonymousClass1644 = new AnonymousClass1644(true);
        LJIIL(aweme, anonymousClass1644);
        C161R c161r = anonymousClass1644.LIZIZ;
        if (c161r != null) {
            Map<EnumC207101162h, C164G> linkedHashMap = c207127163h.LJI;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            c207127163h.LJI = linkedHashMap;
            linkedHashMap.put(this.LIZ, c161r);
        }
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIJ(Aweme aweme, EnumC715680S5m enumC715680S5m) {
        return C161N.LIZIZ.LJJLL(aweme, this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIL(Aweme aweme, C164H c164h) {
        C1869650ykl c1869650ykl;
        AnonymousClass1644 anonymousClass1644 = (AnonymousClass1644) c164h;
        if (anonymousClass1644.LIZ && LJIIJ(aweme, EnumC715680S5m.NOT_OVERWRITTEN) && (c1869650ykl = (C1869650ykl) this.LIZJ.LJI(aweme, C161N.LIZIZ.LLIIZ())) != null) {
            DATA data = c1869650ykl.LIZ;
            if (!(data instanceof C161R)) {
                data = null;
            }
            anonymousClass1644.LIZIZ = data;
            return true;
        }
        return true;
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJI(C207134163o c207134163o, C207131163l c207131163l) {
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJIIIIZZ(C207134163o c207134163o, AnonymousClass1643 anonymousClass1643) {
    }

    @Override // X.AnonymousClass1636
    public final void LIZLLL(Aweme aweme, C162U c162u, boolean z, boolean z2) {
        EnumC207100162g enumC207100162g;
        EnumC1782690wUV enumC1782690wUV;
        String strValueOf;
        String strLIZ;
        Aweme aweme2 = aweme;
        if (c162u != null) {
            boolean zContains = C161C.LIZ.contains(this.LIZ);
            int i = C715780S5w.LIZ[this.LIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    enumC207100162g = EnumC207100162g.UNKNOWN;
                } else {
                    enumC207100162g = EnumC207100162g.COMMERCE;
                }
            } else {
                enumC207100162g = EnumC207100162g.ADS_PRIMARY_STICKER;
            }
            if (!this.LIZIZ.LJI(aweme2)) {
                enumC1782690wUV = EnumC1782690wUV.NOT_EXIST;
            } else if (!z) {
                enumC1782690wUV = EnumC1782690wUV.NOT_TRANSLATABLE;
            } else if (!z2) {
                enumC1782690wUV = EnumC1782690wUV.TRANSLATION_NOT_TRIGGERED;
            } else {
                enumC1782690wUV = EnumC1782690wUV.TO_BE_TRANSLATED;
            }
            String strLIZJ = C161C.LIZJ(aweme2, this.LIZIZ);
            if (zContains) {
                strValueOf = String.valueOf(C161C.LIZIZ(aweme2));
                strLIZ = C161C.LIZ(aweme2);
            } else {
                strValueOf = null;
                strLIZ = null;
            }
            c162u.LIZJ(enumC207100162g, enumC1782690wUV, strLIZJ, null, strValueOf, strLIZ);
        }
    }
}
