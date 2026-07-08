package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.163C, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163C extends AnonymousClass1636<C207134163o, C163B> {
    public final EnumC207101162h LIZ;

    @Override // X.AnonymousClass1636
    /* JADX INFO: renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    public final C163B LIZIZ() {
        C164C c164c = C163B.LJI;
        EnumC207101162h enumC207101162h = this.LIZ;
        C163B c163b = C163B.LJII;
        if (c163b == null) {
            synchronized (c164c) {
                try {
                    c163b = C163B.LJII;
                    if (c163b == null) {
                        c163b = new C163B(enumC207101162h);
                        C163B.LJII = c163b;
                        C163B.LJIIIIZZ = new C163J(enumC207101162h);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c163b;
    }

    @Override // X.AnonymousClass1636
    public final EnumC207101162h LIZJ() {
        return this.LIZ;
    }

    public C163C(EnumC207101162h enumC207101162h) {
        this.LIZ = enumC207101162h;
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIIZ(C207134163o c207134163o) {
        return C161N.LIZIZ.LJJLJLI(c207134163o);
    }

    @Override // X.AnonymousClass1636
    public final void LJI(C207134163o c207134163o, C207131163l c207131163l) {
        C207129163j c207129163j = new C207129163j(false, c207131163l.LJFF);
        LJIILIIL(c207134163o, c207129163j);
        c207131163l.LJII = c207129163j.LIZ();
    }

    @Override // X.AnonymousClass1636
    public final void LJIIIIZZ(C207134163o c207134163o, AnonymousClass1643 anonymousClass1643) {
        C207129163j c207129163j = new C207129163j(true, anonymousClass1643.LIZJ);
        LJIILIIL(c207134163o, c207129163j);
        anonymousClass1643.LIZLLL = c207129163j.LIZ();
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIJ(C207134163o c207134163o, EnumC715680S5m enumC715680S5m) {
        return C161N.LIZIZ.LJJIL(c207134163o, enumC715680S5m);
    }

    public final void LJIILIIL(C207134163o c207134163o, C207129163j c207129163j) {
        EnumC715680S5m enumC715680S5m = c207129163j.LIZIZ;
        C161N c161n = C161N.LIZIZ;
        boolean zLJJIL = c161n.LJJIL(c207134163o, enumC715680S5m);
        if (c207129163j.LIZ && zLJJIL) {
            C1869610ykh c1869610ykhLJI = LIZIZ().LJI(c207134163o, c161n.LLIIZ());
            if (c1869610ykhLJI != null) {
                c207129163j.LIZLLL = c1869610ykhLJI.LIZJ;
                c207129163j.LJ = c1869610ykhLJI.LIZLLL;
                c207129163j.LJFF = c207134163o.LJII;
                c207129163j.LJI = true;
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setData: getCache data not found, originalText=");
            sbLIZ.append(c207134163o.LIZLLL);
            sbLIZ.append(", originalLang=");
            sbLIZ.append(c207134163o.LJ);
            sbLIZ.append(", translationType=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(", groupId=");
            sbLIZ.append(c207134163o.LIZIZ);
            sbLIZ.append(", id=");
            sbLIZ.append(c207134163o.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        c207129163j.LIZLLL = c207134163o.LIZLLL;
        c207129163j.LJ = c207134163o.LJ;
        c207129163j.LJFF = c207134163o.LJII;
        c207129163j.LJI = false;
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJFF(Aweme aweme, AnonymousClass1648 anonymousClass1648) {
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJII(Aweme aweme, C207127163h c207127163h) {
    }

    @Override // X.AnonymousClass1636
    public final void LIZLLL(C207134163o c207134163o, C162U c162u, boolean z, boolean z2) {
        EnumC207100162g enumC207100162g;
        EnumC1782690wUV enumC1782690wUV;
        C207134163o c207134163o2 = c207134163o;
        if (c162u != null) {
            if (C0SCD.LIZ[this.LIZ.ordinal()] == 1) {
                enumC207100162g = EnumC207100162g.DIRECT_MESSAGE;
            } else {
                enumC207100162g = EnumC207100162g.UNKNOWN;
            }
            String str = c207134163o2.LIZJ;
            if (str == null) {
                enumC1782690wUV = EnumC1782690wUV.NOT_EXIST;
            } else if (!z) {
                enumC1782690wUV = EnumC1782690wUV.NOT_TRANSLATABLE;
            } else if (!z2) {
                enumC1782690wUV = EnumC1782690wUV.TRANSLATION_NOT_TRIGGERED;
            } else {
                enumC1782690wUV = EnumC1782690wUV.TO_BE_TRANSLATED;
            }
            c162u.LIZJ(enumC207100162g, enumC1782690wUV, c207134163o2.LJ, null, str, null);
        }
    }
}
