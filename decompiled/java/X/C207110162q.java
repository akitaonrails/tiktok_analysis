package X;

import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import java.util.List;

/* JADX INFO: renamed from: X.162q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207110162q extends C163Z<AnonymousClass1625> {
    @Override // X.AnonymousClass1636
    public final C163A LIZIZ() {
        return AnonymousClass1625.LJ;
    }

    @Override // X.AnonymousClass1636
    public final EnumC207101162h LIZJ() {
        return EnumC207101162h.DUBBING;
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIIZ(Aweme aweme) {
        C20702715zl.LIZ.getClass();
        return C20702715zl.LIZ(aweme, true);
    }

    @Override // X.AnonymousClass1636
    public final void LJFF(Aweme aweme, AnonymousClass1648 anonymousClass1648) {
        aweme.getAid();
        C207142163w c207142163w = new C207142163w(false);
        LJIIL(aweme, c207142163w);
        anonymousClass1648.LIZJ = c207142163w.LIZ();
    }

    @Override // X.AnonymousClass1636
    public final void LJII(Aweme aweme, C207127163h c207127163h) {
        aweme.getAid();
        C207142163w c207142163w = new C207142163w(true);
        LJIIL(aweme, c207142163w);
        c207127163h.LJFF = c207142163w.LIZ();
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIJ(Aweme aweme, EnumC715680S5m enumC715680S5m) {
        Aweme aweme2 = aweme;
        int[] iArr = C715750S5t.LIZ;
        if (iArr[enumC715680S5m.ordinal()] == 1) {
            enumC715680S5m = C161N.LIZIZ.LJJZZI(aweme2.getAid());
        }
        int i = iArr[enumC715680S5m.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return false;
                }
                throw new C1954807lC();
            }
            C20702715zl.LIZ.getClass();
            return C20702715zl.LIZ(aweme2, true);
        }
        C20702715zl.LIZ.getClass();
        return C20702715zl.LIZ(aweme2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIL(Aweme aweme, C164H c164h) {
        C207142163w c207142163w = (C207142163w) c164h;
        if (c207142163w.LIZ && LJIIJ(aweme, EnumC715680S5m.NOT_OVERWRITTEN)) {
            C0SA3 c0sa3 = (C0SA3) AnonymousClass1625.LJ.LJI(aweme, C161N.LIZIZ.LLIIZ());
            if (c0sa3 != null) {
                c207142163w.LIZIZ = c0sa3.LIZ;
                c207142163w.LIZJ = c0sa3.LIZIZ;
                c207142163w.LIZLLL = c0sa3.LIZJ;
                c207142163w.LJ = true;
                return true;
            }
        }
        c207142163w.LIZIZ = C20703515zt.LJIIIZ(aweme);
        c207142163w.LIZJ = null;
        c207142163w.LIZLLL = null;
        c207142163w.LJ = false;
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
        boolean z3;
        EnumC1782690wUV enumC1782690wUV;
        List<TtsInfos> ttsInfos;
        Aweme aweme2 = aweme;
        if (c162u != null) {
            Audio audio = aweme2.getAudio();
            if (audio != null && (ttsInfos = audio.getTtsInfos()) != null && !ttsInfos.isEmpty()) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z4 = !z3;
            EnumC207100162g enumC207100162g = EnumC207100162g.DUBBING;
            if (!z4) {
                enumC1782690wUV = EnumC1782690wUV.NOT_EXIST;
            } else if (!z) {
                enumC1782690wUV = EnumC1782690wUV.NOT_TRANSLATABLE;
            } else if (!z2) {
                enumC1782690wUV = EnumC1782690wUV.TRANSLATION_NOT_TRIGGERED;
            } else {
                enumC1782690wUV = EnumC1782690wUV.TO_BE_TRANSLATED;
            }
            c162u.LIZJ(enumC207100162g, enumC1782690wUV, C20703515zt.LJIIIZ(aweme2), null, null, null);
        }
    }
}
