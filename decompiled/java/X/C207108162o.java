package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.162o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207108162o extends C163Z<AnonymousClass1624> {
    @Override // X.AnonymousClass1636
    public final C163A LIZIZ() {
        return AnonymousClass1624.LJ;
    }

    @Override // X.AnonymousClass1636
    public final EnumC207101162h LIZJ() {
        return EnumC207101162h.CAPTION;
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIIZ(Aweme aweme) {
        return C20702515zj.LIZIZ(aweme);
    }

    @Override // X.AnonymousClass1636
    public final void LJFF(Aweme aweme, AnonymousClass1648 anonymousClass1648) {
        aweme.getAid();
        C207138163s c207138163s = new C207138163s(false);
        LJIIL(aweme, c207138163s);
        anonymousClass1648.LIZIZ = c207138163s.LIZ();
    }

    @Override // X.AnonymousClass1636
    public final void LJII(Aweme aweme, C207127163h c207127163h) {
        aweme.getAid();
        C207138163s c207138163s = new C207138163s(true);
        LJIIL(aweme, c207138163s);
        c207127163h.LJ = c207138163s.LIZ();
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIJ(Aweme aweme, EnumC715680S5m enumC715680S5m) {
        return C161N.LIZIZ.LJIILL(aweme, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIL(Aweme aweme, C164H c164h) {
        int i;
        C207138163s c207138163s = (C207138163s) c164h;
        if (c207138163s.LIZ && LJIIJ(aweme, EnumC715680S5m.NOT_OVERWRITTEN)) {
            AnonymousClass1624 anonymousClass1624 = AnonymousClass1624.LJ;
            C161N c161n = C161N.LIZIZ;
            C1869640ykk c1869640ykk = (C1869640ykk) anonymousClass1624.LJI(aweme, c161n.LLIIZ());
            if (c1869640ykk != null) {
                c207138163s.LIZIZ = c1869640ykk.LIZ;
                c207138163s.LJ = c1869640ykk.LIZLLL;
                c207138163s.LIZLLL = c1869640ykk.LIZIZ;
                c207138163s.LIZJ = c161n.LLIIZ();
                c207138163s.LJFF = true;
                return true;
            }
        }
        if (aweme != null) {
            CaptionItemModel captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme);
            if (captionItemModelLJIIIIZZ != null) {
                i = captionItemModelLJIIIIZZ.subId;
            }
            c207138163s.LIZIZ = i;
            c207138163s.LIZJ = C20703515zt.LJIIIZ(aweme);
            c207138163s.LJFF = false;
            c207138163s.LIZLLL = null;
            c207138163s.LJ = false;
            return true;
        }
        C20703515zt c20703515zt = C20703515zt.LIZ;
        i = 0;
        c207138163s.LIZIZ = i;
        c207138163s.LIZJ = C20703515zt.LJIIIZ(aweme);
        c207138163s.LJFF = false;
        c207138163s.LIZLLL = null;
        c207138163s.LJ = false;
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
        EnumC1782690wUV enumC1782690wUV;
        String str;
        boolean zLJFF;
        EnumC1782690wUV enumC1782690wUV2;
        String str2;
        CaptionModel captionModel;
        CaptionLanguage captionLanguage;
        Aweme aweme2 = aweme;
        if (c162u != null) {
            CaptionItemModel captionItemModelLIZJ = C20702515zj.LIZJ(aweme2, C161N.LIZIZ.LLIIZ());
            EnumC207100162g enumC207100162g = EnumC207100162g.OFFLINE_CAPTIONS;
            if (captionItemModelLIZJ == null) {
                enumC1782690wUV = EnumC1782690wUV.NOT_EXIST;
            } else if (!z) {
                enumC1782690wUV = EnumC1782690wUV.NOT_TRANSLATABLE;
            } else if (!z2) {
                enumC1782690wUV = EnumC1782690wUV.TRANSLATION_NOT_TRIGGERED;
            } else {
                enumC1782690wUV = EnumC1782690wUV.TO_BE_TRANSLATED;
            }
            if (captionItemModelLIZJ != null) {
                str = captionItemModelLIZJ.languageCode;
            } else {
                str = null;
            }
            c162u.LIZJ(enumC207100162g, enumC1782690wUV, str, null, null, null);
            CaptionItemModel captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme2);
            Video video = aweme2.getVideo();
            if (video != null && (captionModel = video.getCaptionModel()) != null && (captionLanguage = captionModel.originalCaptionLanguage) != null) {
                zLJFF = Intrinsics.LJFF(captionLanguage.canTranslateRealtimeSkipTranslationLangCheck, Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            EnumC207100162g enumC207100162g2 = EnumC207100162g.RT_CAPTIONS;
            if (captionItemModelLJIIIIZZ != null && zLJFF) {
                if (!z) {
                    enumC1782690wUV2 = EnumC1782690wUV.NOT_TRANSLATABLE;
                } else if (z2 && captionItemModelLIZJ == null) {
                    enumC1782690wUV2 = EnumC1782690wUV.TO_BE_TRANSLATED;
                } else {
                    enumC1782690wUV2 = EnumC1782690wUV.TRANSLATION_NOT_TRIGGERED;
                }
            } else {
                enumC1782690wUV2 = EnumC1782690wUV.NOT_EXIST;
            }
            if (captionItemModelLJIIIIZZ != null) {
                str2 = captionItemModelLJIIIIZZ.languageCode;
            } else {
                str2 = null;
            }
            c162u.LIZJ(enumC207100162g2, enumC1782690wUV2, str2, null, null, null);
        }
    }
}
