package X;

import Y.AkS106S1100000_21;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cla.et.newet.PhotoTextTranslationRequestedEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.TranslationInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.translation.model.PhotoImageTranslationResult;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.162y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207118162y extends C164O<C0S5P, AbstractC207157164l> implements AnonymousClass1645, C0SBA {
    public boolean LIZLLL;
    public EnumC715590S5d LJ;
    public C162V LJFF;
    public VideoItemParams LJI;
    public boolean LJII;
    public final C11NJ LJIIIIZZ = new C11NJ();
    public final C207113162t LJIIIZ;
    public final C207111162r LJIIJ;
    public final C207114162u LJIIJJI;
    public final C207115162v LJIIL;
    public final C207108162o LJIILIIL;
    public final C207110162q LJIILJJIL;
    public final C207119162z LJIILL;
    public final AnonymousClass1630 LJIILLIIL;
    public final AnonymousClass1631 LJIIZILJ;
    public final AnonymousClass1632 LJIJ;
    public final AnonymousClass1633 LJIJI;
    public final C163P LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LJJ;
    public C162U LJJI;
    public final C161D LJJIFFI;
    public final C2252321DDq LJJII;
    public final C2252321DDq LJJIII;
    public final C2252321DDq LJJIIJ;
    public final C2252321DDq LJJIIJZLJL;
    public final C2252321DDq LJJIIZ;
    public final C2252321DDq LJJIIZI;
    public final C2252321DDq LJJIJ;
    public final C2252321DDq LJJIJIIJI;
    public final C2252321DDq LJJIJIIJIL;
    public final C2252321DDq LJJIJIL;

    @Override // X.C164P
    public final String getTag() {
        return "TranslationStateMachine";
    }

    @Override // X.C0SBA
    public final void LJFF() {
        LJIJJLI(EnumC715590S5d.CLICK);
    }

    public final Map<EnumC207101162h, AnonymousClass1634<?>> LJIJ() {
        return (Map) this.LJIJJLI.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0S5K] */
    public final C0S5K LJIJI() {
        Aweme aweme;
        AnonymousClass1648 anonymousClass1648 = new AnonymousClass1648(C161N.LIZIZ.LLIIZ());
        VideoItemParams videoItemParams = this.LJI;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            Iterator it2 = LJIJJ().LIZ.iterator();
            while (it2.hasNext()) {
                ((AnonymousClass1636) it2.next()).LJFF(aweme, anonymousClass1648);
            }
        }
        final String str = anonymousClass1648.LIZ;
        final C207047160f c207047160f = anonymousClass1648.LIZIZ;
        final C0S5O c0s5o = anonymousClass1648.LIZJ;
        return new C0S5P(str, c207047160f, c0s5o) { // from class: X.0S5K
            public final String LIZIZ;
            public final C207047160f LIZJ;
            public final C0S5O LIZLLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0S5K)) {
                    return false;
                }
                C0S5K c0s5k = (C0S5K) obj;
                return Intrinsics.LJFF(this.LIZIZ, c0s5k.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0s5k.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0s5k.LIZLLL);
            }

            public final int hashCode() {
                int iHashCode = this.LIZIZ.hashCode() * 31;
                C207047160f c207047160f2 = this.LIZJ;
                int iHashCode2 = (iHashCode + (c207047160f2 == null ? 0 : c207047160f2.hashCode())) * 31;
                C0S5O c0s5o2 = this.LIZLLL;
                return iHashCode2 + (c0s5o2 != null ? c0s5o2.hashCode() : 0);
            }

            @Override // X.C0S5P
            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Original(translationLang=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", captionData=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", dubbingData=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                super(C0SKK.ORIGINAL);
                this.LIZIZ = str;
                this.LIZJ = c207047160f;
                this.LIZLLL = c0s5o;
            }
        };
    }

    public final C207136163q LJIJJ() {
        return (C207136163q) this.LJJ.getValue();
    }

    public final void LJIL() {
        Aweme aweme;
        LJJI(this.LJ);
        if (Intrinsics.LJFF(this.LJJIIZ.getValue(), C709290Rrz.LIZIZ)) {
            VideoItemParams videoItemParams = this.LJI;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && LJIJJ().LIZJ(aweme)) {
                onEvent(C207163164r.LIZIZ);
            }
        } else {
            onEvent(C207158164m.LIZIZ);
        }
        EnumC715590S5d enumC715590S5d = this.LJ;
        if ((enumC715590S5d == EnumC715590S5d.DO_NOT_TRANSLATE_CHANGED || enumC715590S5d == EnumC715590S5d.TARGET_LANGUAGE_CHANGED) && this.LJII) {
            C161N c161n = C161N.LIZIZ;
            VideoItemParams videoItemParams2 = this.LJI;
            if (c161n.LJJIJIL(videoItemParams2 != null ? videoItemParams2.getAweme() : null)) {
                return;
            }
            LJJ(true);
        }
    }

    @Override // X.C0SBA
    public final void translate() {
        LJIIIIZZ(EnumC715590S5d.CLICK, false);
    }

    @Override // X.C0SBA
    public final /* bridge */ /* synthetic */ C05YD LIZ() {
        return this.LJJIIZI;
    }

    @Override // X.C0SBA
    public final C05YD<C0S5R> LIZIZ() {
        return this.LJJIJ;
    }

    @Override // X.C0SBA
    public final C05YD<C0S5N> LJIIIZ() {
        return this.LJJIJIL;
    }

    @Override // X.C0SBA
    public final C2252321DDq LJIIJ() {
        return this.LJJIJIIJIL;
    }

    @Override // X.C0SBA
    public final C2252321DDq LJIILJJIL() {
        return this.LJJIIJZLJL;
    }

    @Override // X.C164O
    public final InterfaceC332260D0u<C0S5P> LJIIZILJ() {
        return this.LJJIIZ;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.163P] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1633, X.1637] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.1632, X.1637] */
    public C207118162y(InterfaceC497601wk interfaceC497601wk) {
        C2252321DDq c2252321DDq;
        C207113162t c207113162t = new C207113162t();
        this.LJIIIZ = c207113162t;
        C207111162r c207111162r = new C207111162r();
        this.LJIIJ = c207111162r;
        final C207114162u c207114162u = new C207114162u();
        this.LJIIJJI = c207114162u;
        final C207115162v c207115162v = new C207115162v();
        this.LJIIL = c207115162v;
        C207108162o c207108162o = new C207108162o();
        this.LJIILIIL = c207108162o;
        final C207110162q c207110162q = new C207110162q();
        this.LJIILJJIL = c207110162q;
        C054G c054gLIZ = C2296808zG.LIZ(interfaceC497601wk.getCoroutineContext().plus(C164O.LIZJ));
        C207119162z c207119162z = new C207119162z(c207113162t);
        this.LJIILL = c207119162z;
        AnonymousClass1630 anonymousClass1630 = new AnonymousClass1630(c207111162r);
        this.LJIILLIIL = anonymousClass1630;
        AnonymousClass1631 anonymousClass1631 = new AnonymousClass1631(c207108162o);
        this.LJIIZILJ = anonymousClass1631;
        ?? r4 = new AnonymousClass1635<C207114162u, C0S5S>(c207114162u) { // from class: X.1632
            @Override // X.AnonymousClass1637
            public final C164G LIZJ() {
                return new C0S5S(null, false, null);
            }

            {
                C1055510dZd c1055510dZd = new C1055510dZd();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
            @Override // X.AnonymousClass1637
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C164G LIZIZ(X.C0S5Q r6, X.C0S5Q r7, com.ss.android.ugc.aweme.feed.model.Aweme r8, X.EnumC715680S5m r9) {
                /*
                    r5 = this;
                    X.0S5P r6 = (X.C0S5P) r6
                    X.0S5P r7 = (X.C0S5P) r7
                    com.ss.android.ugc.aweme.feed.model.Aweme r8 = (com.ss.android.ugc.aweme.feed.model.Aweme) r8
                    r3 = 0
                    if (r8 == 0) goto L36
                    X.0SKK r0 = r6.LIZ
                    int[] r1 = X.C0SBJ.LIZ
                    int r0 = r0.ordinal()
                    r1 = r1[r0]
                    r4 = 1
                    if (r1 == r4) goto L3d
                    r0 = 2
                    if (r1 == r0) goto L3d
                    r0 = 3
                    if (r1 == r0) goto L36
                    r0 = 4
                    if (r1 != r0) goto L37
                    X.164A r3 = new X.164A
                    java.lang.String r0 = r8.getAid()
                    r3.<init>(r4, r0)
                    X.C207114162u.LJIIL(r8, r3)
                    boolean r2 = r3.LIZLLL
                    java.lang.String r1 = r3.LIZJ
                    java.lang.String r0 = r3.LIZIZ
                    X.0S5S r3 = new X.0S5S
                    r3.<init>(r1, r2, r0)
                L36:
                    return r3
                L37:
                    X.07lC r0 = new X.07lC
                    r0.<init>()
                    throw r0
                L3d:
                    if (r7 == 0) goto L89
                    X.0SKK r1 = r7.LIZ
                L41:
                    boolean r0 = X.C292360Bd4.LIZ
                    if (r0 == 0) goto L87
                    java.lang.String r0 = r5.LJ
                    boolean r0 = X.C0SKF.LIZLLL(r0)
                    if (r0 == 0) goto L87
                    X.0SKK r0 = X.C0SKK.TRANSLATED
                    if (r1 == r0) goto L87
                    X.161N r2 = X.C161N.LIZIZ
                    boolean r0 = r2.LLFII(r8, r3)
                    if (r0 == 0) goto L87
                    X.162X r1 = X.C162X.LJ
                    java.lang.String r0 = r2.LLIIZ()
                    X.164B r0 = r1.LJI(r8, r0)
                    X.0ykj r0 = (X.C1869630ykj) r0
                    if (r0 == 0) goto L69
                    java.lang.String r3 = r0.LIZIZ
                L69:
                    boolean r0 = X.C123100dR.LIZ(r3)
                    if (r0 == 0) goto L87
                L6f:
                    X.164A r3 = new X.164A
                    java.lang.String r0 = r8.getAid()
                    r3.<init>(r4, r0)
                    X.C207114162u.LJIIL(r8, r3)
                    boolean r2 = r3.LIZLLL
                    java.lang.String r1 = r3.LIZJ
                    java.lang.String r0 = r3.LIZIZ
                    X.0S5S r3 = new X.0S5S
                    r3.<init>(r1, r2, r0)
                    return r3
                L87:
                    r4 = 0
                    goto L6f
                L89:
                    r1 = r3
                    goto L41
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1632.LIZIZ(X.0S5Q, X.0S5Q, java.lang.Object, X.0S5m):X.164G");
            }
        };
        this.LJIJ = r4;
        ?? r1 = new AnonymousClass1635<C207115162v, C0S5N>(c207115162v) { // from class: X.1633
            @Override // X.AnonymousClass1637
            public final C164G LIZJ() {
                return new C0S5N(null, false, null);
            }

            {
                C1055510dZd c1055510dZd = new C1055510dZd();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
            /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List<X.0SME>] */
            /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
            @Override // X.AnonymousClass1637
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C164G LIZIZ(X.C0S5Q r11, X.C0S5Q r12, com.ss.android.ugc.aweme.feed.model.Aweme r13, X.EnumC715680S5m r14) {
                /*
                    r10 = this;
                    com.ss.android.ugc.aweme.feed.model.Aweme r13 = (com.ss.android.ugc.aweme.feed.model.Aweme) r13
                    r4 = 0
                    if (r13 == 0) goto L95
                    com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService r0 = X.C0SQQ.LIZ
                    java.util.List r0 = r0.LJIIIIZZ(r13, r4)
                    X.163n r5 = new X.163n
                    r13.getAid()
                    r5.<init>(r0)
                    USECASE extends X.1636<ITEM, ? extends X.163A<ITEM, ? extends X.164B, ? extends X.0lXB<ITEM, ? extends X.164B>>> r0 = r10.LIZ
                    r0.getClass()
                    r5.LIZJ = r13
                    java.util.List<java.lang.Integer> r7 = r5.LIZ
                    com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r13.getPhotoModeImageInfo()
                    if (r0 == 0) goto L7f
                    java.util.List r1 = r0.getImageList()
                    if (r1 == 0) goto L7f
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r0 = 10
                    int r0 = X.C15438062q.LJIJJ(r1, r0)
                    r8.<init>(r0)
                    java.util.Iterator r9 = r1.iterator()
                    r1 = 0
                L38:
                    boolean r0 = r9.hasNext()
                    if (r0 == 0) goto L81
                    java.lang.Object r6 = r9.next()
                    int r3 = r1 + 1
                    if (r1 < 0) goto L7b
                    com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r6 = (com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel) r6
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                    boolean r0 = r7.contains(r0)
                    r2 = r0 ^ 1
                    X.0SME r1 = new X.0SME
                    if (r2 == 0) goto L66
                    com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.displayImageNoWatermark
                    if (r0 == 0) goto L79
                    java.lang.String r0 = r0.getUri()
                L5e:
                    r1.<init>(r0, r2)
                    r8.add(r1)
                    r1 = r3
                    goto L38
                L66:
                    com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.translatedDisplayImage
                    if (r0 == 0) goto L70
                    java.lang.String r0 = r0.getUri()
                    if (r0 != 0) goto L5e
                L70:
                    com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.displayImageNoWatermark
                    if (r0 == 0) goto L79
                    java.lang.String r0 = r0.getUri()
                    goto L5e
                L79:
                    r0 = r4
                    goto L5e
                L7b:
                    X.C1697810uHb.LJIJI()
                    throw r4
                L7f:
                    X.13BV r8 = X.C13BV.INSTANCE
                L81:
                    r5.LIZLLL = r8
                    X.0S5N r2 = new X.0S5N
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LIZJ
                    if (r0 == 0) goto L8d
                    java.lang.String r4 = r0.getAid()
                L8d:
                    java.util.List<X.0SME> r1 = r5.LIZLLL
                    boolean r0 = r5.LIZIZ
                    r2.<init>(r4, r0, r1)
                    return r2
                L95:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1633.LIZIZ(X.0S5Q, X.0S5Q, java.lang.Object, X.0S5m):X.164G");
            }
        };
        this.LJIJI = r1;
        this.LJIJJ = new AnonymousClass1635<C207110162q, C0S5O>(c207110162q) { // from class: X.163P
            @Override // X.AnonymousClass1637
            public final C164G LIZJ() {
                return new C0S5O("", false, null, null);
            }

            {
                C1055510dZd c1055510dZd = new C1055510dZd();
            }

            @Override // X.AnonymousClass1637
            public final C164G LIZIZ(C0S5Q c0s5q, C0S5Q c0s5q2, Aweme aweme, EnumC715680S5m enumC715680S5m) {
                C0S5P c0s5p = (C0S5P) c0s5q;
                Aweme aweme2 = aweme;
                if (aweme2 != null) {
                    int i = C0SBE.LIZ[c0s5p.LIZ.ordinal()];
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                aweme2.getAid();
                                C207142163w c207142163w = new C207142163w(true);
                                ((C207110162q) this.LIZ).LJIIL(aweme2, c207142163w);
                                return c207142163w.LIZ();
                            }
                            throw new C1954807lC();
                        }
                        return null;
                    }
                    aweme2.getAid();
                    C207142163w c207142163w2 = new C207142163w(false);
                    ((C207110162q) this.LIZ).LJIIL(aweme2, c207142163w2);
                    return c207142163w2.LIZ();
                }
                return null;
            }
        };
        this.LJIJJLI = C452501pT.LIZIZ(new C207141163v());
        this.LJIL = C452501pT.LIZIZ(new C207130163k());
        String.valueOf(hashCode());
        new LinkedHashSet();
        this.LJJ = C452501pT.LIZIZ(new C207117162x(this));
        this.LJJIFFI = C161D.LIZ;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LJJII = c2252321DDqLIZ;
        this.LJJIII = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(null);
        this.LJJIIJ = c2252321DDqLIZ2;
        this.LJJIIJZLJL = c2252321DDqLIZ2;
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(C709290Rrz.LIZIZ);
        this.LJJIIZ = c2252321DDqLIZ3;
        this.LJJIIZI = c2252321DDqLIZ3;
        if (C294320BgE.LIZ()) {
            c2252321DDq = anonymousClass1630.LJI;
        } else {
            c2252321DDq = c207119162z.LJI;
        }
        this.LJJIJ = c2252321DDq;
        this.LJJIJIIJI = anonymousClass1631.LJI;
        this.LJJIJIIJIL = r4.LJI;
        this.LJJIJIL = r1.LJI;
        C23250099c.LIZLLL(c054gLIZ, null, null, new C708640Rqw(this, null), 3);
        C23250099c.LIZLLL(c054gLIZ, null, null, new C708620Rqu(this, null), 3);
        if (C299170Bo3.LIZJ()) {
            C23250099c.LIZLLL(c054gLIZ, null, null, new C708680Rr0(this, null), 3);
        }
        C23250099c.LIZLLL(c054gLIZ, null, null, new C708650Rqx(this, null), 3);
        C23250099c.LIZLLL(c054gLIZ, null, null, new C708630Rqv(this, null), 3);
        new C207140163u(this).invoke(this);
    }

    public final void LJIJJLI(EnumC715590S5d enumC715590S5d) {
        this.LIZLLL = false;
        LJJIIJZLJL(enumC715590S5d, false);
        LJJ(false);
        onEvent(C207162164q.LIZIZ);
    }

    public final void LJJ(boolean z) {
        Aweme aweme;
        CaptionItemModel captionItemModelLJIIIIZZ;
        C0S5L c0s5l;
        C207047160f c207047160f;
        C0S5P c0s5p = (C0S5P) this.LJJIIZ.getValue();
        if (!z) {
            if ((c0s5p instanceof C0S5K) || this.LJ == EnumC715590S5d.LAND_ON_ITEM) {
                return;
            }
            if ((c0s5p instanceof C0S5L) && (c0s5l = (C0S5L) c0s5p) != null && (c207047160f = c0s5l.LJFF) != null && !c207047160f.LIZIZ) {
                return;
            }
        }
        VideoItemParams videoItemParams = this.LJI;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme)) == null) {
            return;
        }
        ICLAPerfETService iCLAPerfETServiceLIZ = C1485670olR.LIZ();
        String strValueOf = String.valueOf(captionItemModelLJIIIIZZ.subId);
        String strValueOf2 = String.valueOf(captionItemModelLJIIIIZZ.claSubtitleId);
        if (strValueOf2 == null) {
            strValueOf2 = "";
        }
        String str = captionItemModelLJIIIIZZ.languageCode;
        iCLAPerfETServiceLIZ.LJIILL(aweme, strValueOf, strValueOf2, str, str, EnumC20038913at.OFFLINE, AnonymousClass1629.SWITCH_LANGUAGE, C1485670olR.LIZIZ(captionItemModelLJIIIIZZ), true, false, true, false);
    }

    public final void LJJI(EnumC715590S5d enumC715590S5d) {
        String strLIZ;
        Aweme aweme;
        String str;
        C11NZ<PhotoImageTranslationResult> c11nzLIZLLL;
        String str2;
        TranslationInfo translationInfo;
        if (!this.LJII) {
            return;
        }
        if (enumC715590S5d == null) {
            strLIZ = "";
        } else {
            strLIZ = C0S61.LIZ(enumC715590S5d);
        }
        VideoItemParams videoItemParams = this.LJI;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            C161N c161n = C161N.LIZIZ;
            String strLLIIZ = c161n.LLIIZ();
            if (c161n.LIZJ(aweme, strLLIIZ, strLIZ)) {
                C207115162v c207115162v = this.LJIIL;
                VideoItemParams videoItemParams2 = this.LJI;
                if (videoItemParams2 == null || (str = videoItemParams2.mEventType) == null) {
                    str = "";
                }
                c207115162v.getClass();
                C207097162d.LJ.getClass();
                String aid = aweme.getAid();
                String strLLIIZ2 = c161n.LLIIZ();
                try {
                    C161O c161oLIZ = C1236630iHl.LIZ();
                    if (c161oLIZ == null || (c11nzLIZLLL = c161oLIZ.LIZLLL(aid, str, strLLIIZ2)) == null) {
                        c11nzLIZLLL = C11IR.LL;
                    }
                } catch (ExecutionException e) {
                    TryCatchGuardChecker.doCheck(e);
                    AbstractC2126608Uu.getCompatibleException(e);
                    c11nzLIZLLL = C11IR.LL;
                }
                c11nzLIZLLL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS106S1100000_21(aweme, strLLIIZ, 0)).LJL(C11S5.LIZ()).LJJLJ();
                AnonymousClass0175 anonymousClass0175 = new AnonymousClass0175();
                String groupId = aweme.getGroupId();
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (translationInfo = photoModeImageInfo.getTranslationInfo()) != null) {
                    str2 = translationInfo.iamgeMajorLanguage;
                } else {
                    str2 = null;
                }
                C207069161b.LIZJ(PhotoTextTranslationRequestedEvent.class, null, anonymousClass0175, Collections.singletonList(new C0260006w(groupId, strLIZ, str, strLLIIZ, str2)));
            }
        }
    }

    public final void LJJIFFI(C0S5P c0s5p) {
        LJ(c0s5p, EnumC715680S5m.NOT_OVERWRITTEN);
        if (C294320BgE.LIZ()) {
            this.LJIILLIIL.LJ(c0s5p, EnumC715680S5m.NOT_OVERWRITTEN);
        } else {
            this.LJIILL.LJ(c0s5p, EnumC715680S5m.NOT_OVERWRITTEN);
        }
        this.LJIIZILJ.LJ(c0s5p, EnumC715680S5m.NOT_OVERWRITTEN);
        LJ(c0s5p, EnumC715680S5m.NOT_OVERWRITTEN);
        if (C299170Bo3.LIZJ()) {
            LJ(c0s5p, EnumC715680S5m.NOT_OVERWRITTEN);
        }
        Iterator<Map.Entry<EnumC207101162h, AnonymousClass1634<?>>> it2 = LJIJ().entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LJ(c0s5p, EnumC715680S5m.NOT_OVERWRITTEN);
        }
        if (C281430B1h.LIZ()) {
            this.LJJII.setValue(new C0S64((C0S5R) this.LJJIJ.getValue(), (C0S5S) this.LJJIJIIJIL.getValue()));
        }
        this.LJJIIZ.setValue(c0s5p);
    }

    public final void LJJII(String str) {
        C19EG activity;
        Aweme aweme;
        String str2;
        Fragment fragment;
        Fragment fragment2;
        C19EG activity2;
        this.LJII = true;
        Aweme aweme2 = null;
        this.LJFF = null;
        VideoItemParams videoItemParams = this.LJI;
        if (videoItemParams == null || (fragment2 = videoItemParams.fragment) == null || (activity2 = fragment2.getActivity()) == null || !C0SXG.LIZ(activity2)) {
            C20703515zt.LIZ.getClass();
            C20703515zt.LIZIZ.LJJJJZI(EnumC715680S5m.NOT_OVERWRITTEN, null);
        }
        if (this.LJJIIZ.getValue() instanceof C0S5K) {
            C161N c161n = C161N.LIZIZ;
            VideoItemParams videoItemParams2 = this.LJI;
            if (videoItemParams2 != null) {
                aweme2 = videoItemParams2.getAweme();
            }
            if (c161n.LJJIJIL(aweme2)) {
                C161T.LIZ().LJIIIIZZ(true);
                this.LIZLLL = true;
                this.LJ = EnumC715590S5d.LAND_ON_ITEM;
                onEvent(C207164164s.LIZIZ);
            }
        } else if (this.LJJIIZ.getValue() instanceof C0S5L) {
            C161N c161n2 = C161N.LIZIZ;
            String strLLIIZ = c161n2.LLIIZ();
            ICLAPerfETService iCLAPerfETServiceLIZ = C1485670olR.LIZ();
            VideoItemParams videoItemParams3 = this.LJI;
            if (videoItemParams3 != null && (fragment = videoItemParams3.fragment) != null) {
                activity = fragment.getActivity();
            } else {
                activity = null;
            }
            WeakReference<Context> weakReference = new WeakReference<>(activity);
            VideoItemParams videoItemParams4 = this.LJI;
            if (videoItemParams4 != null) {
                aweme = videoItemParams4.getAweme();
            } else {
                aweme = null;
            }
            VideoItemParams videoItemParams5 = this.LJI;
            if (videoItemParams5 == null || (str2 = videoItemParams5.mEventType) == null) {
                str2 = "";
            }
            C2807016v c2807016vLIZLLL = iCLAPerfETServiceLIZ.LIZLLL(c161n2.LJJIJIIJIL(weakReference, aweme, str2), strLLIIZ, C0S61.LIZ(EnumC715590S5d.LAND_ON_ITEM), null, new AwS590S0100000_11(this, 406));
            C207136163q c207136163qLJIJJ = LJIJJ();
            VideoItemParams videoItemParams6 = this.LJI;
            if (videoItemParams6 != null) {
                aweme2 = videoItemParams6.getAweme();
            }
            c207136163qLJIJJ.LIZIZ(aweme2, strLLIIZ, c2807016vLIZLLL);
        }
        if (C294320BgE.LIZ()) {
            this.LJIILLIIL.LJIIIIZZ(str);
        } else {
            this.LJIILL.LJIIIIZZ(str);
        }
        this.LJIIZILJ.LJIIIIZZ(str);
        if (C299170Bo3.LIZJ()) {
            LJIIIIZZ(str);
        }
        Iterator<Map.Entry<EnumC207101162h, AnonymousClass1634<?>>> it2 = LJIJ().entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LJIIIIZZ(str);
        }
        LJJI(EnumC715590S5d.LAND_ON_ITEM);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(X.EnumC715590S5d r24) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207118162y.LJJIII(X.0S5d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    @Override // X.AnonymousClass1645
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.EnumC715590S5d r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.LJII
            if (r0 != 0) goto L5
            return
        L5:
            r5.LIZLLL = r7
            r5.LJ = r6
            X.0S5d r0 = X.EnumC715590S5d.COMBINE_ENTRANCE_STICKER_TRANSLATION_TOGGLE
            r4 = 0
            r3 = 1
            if (r6 != r0) goto L3b
            X.161N r2 = X.C161N.LIZIZ
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r5.LJI
            r1 = 0
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
        L1a:
            boolean r0 = r2.LJJJ(r0)
            if (r0 != 0) goto L3b
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r5.LJI
            if (r0 == 0) goto L28
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.getAweme()
        L28:
            boolean r0 = r2.LLFFF(r1, r4)
            if (r0 != 0) goto L3b
            r5.LJIL()
        L31:
            X.0S5d r0 = X.EnumC715590S5d.CLICK
            if (r6 != r0) goto L38
            r5.LJJI(r6)
        L38:
            return
        L39:
            r0 = r1
            goto L1a
        L3b:
            r5.LJJIIJZLJL(r6, r3)
            X.164s r0 = X.C207164164s.LIZIZ
            r5.onEvent(r0)
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207118162y.LJIIIIZZ(X.0S5d, boolean):void");
    }

    public final void LJJIIJZLJL(EnumC715590S5d enumC715590S5d, boolean z) {
        EnumC715680S5m enumC715680S5m;
        String aid;
        Aweme aweme;
        if (enumC715590S5d != null) {
            switch (C715610S5f.LIZ[enumC715590S5d.ordinal()]) {
                case -1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    return;
                case 0:
                default:
                    throw new C1954807lC();
                case 1:
                    if (z) {
                        enumC715680S5m = EnumC715680S5m.OVERRIDE_TO_TRANSLATED;
                    } else {
                        enumC715680S5m = EnumC715680S5m.OVERRIDE_TO_ORIGINAL;
                    }
                    break;
                case 2:
                    enumC715680S5m = EnumC715680S5m.NOT_OVERWRITTEN;
                    break;
            }
            C161N c161n = C161N.LIZIZ;
            VideoItemParams videoItemParams = this.LJI;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            c161n.LJJJJZI(enumC715680S5m, aid);
        }
    }

    @Override // X.C164P
    public final void LIZLLL(C0S5Q c0s5q, C13IQ c13iq, InterfaceC710780RuO interfaceC710780RuO) {
        boolean z;
        C0S5P c0s5l;
        Aweme aweme;
        Aweme aweme2;
        C0S5P c0s5p = (C0S5P) c0s5q;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("from: ");
        sbLIZ.append(c0s5p.LIZ.getId());
        sbLIZ.append(" to: ");
        sbLIZ.append(c13iq.LJI());
        sbLIZ.append(", event = ");
        sbLIZ.append(interfaceC710780RuO);
        sbLIZ.append(", thread = ");
        sbLIZ.append(C786410Ut5.u3());
        C2344809Gs.LIZLLL(4, "TranslationStateMachine", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C709290Rrz.class))) {
            c0s5l = C709290Rrz.LIZIZ;
        } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C0S5K.class))) {
            c0s5l = LJIJI();
        } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C710270RtZ.class))) {
            c0s5l = new C710270RtZ(this.LIZLLL);
        } else {
            if (!Intrinsics.LJFF(c13iq, C13LE.LIZ(C0S5L.class))) {
                return;
            }
            if (c0s5p instanceof C710270RtZ) {
                z = ((C710270RtZ) c0s5p).LIZIZ;
            } else {
                z = this.LIZLLL;
            }
            C207127163h c207127163h = new C207127163h(C161N.LIZIZ.LLIIZ(), z);
            VideoItemParams videoItemParams = this.LJI;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                Iterator it2 = LJIJJ().LIZ.iterator();
                while (it2.hasNext()) {
                    ((AnonymousClass1636) it2.next()).LJII(aweme, c207127163h);
                }
            }
            c0s5l = new C0S5L(c207127163h.LIZ, c207127163h.LIZIZ, c207127163h.LIZJ, c207127163h.LIZLLL, c207127163h.LJ, c207127163h.LJI, c207127163h.LJFF);
        }
        VideoItemParams videoItemParams2 = this.LJI;
        if (videoItemParams2 != null && (aweme2 = videoItemParams2.getAweme()) != null) {
            aweme2.getAid();
        }
        Objects.toString(c0s5l);
        LJJIFFI(c0s5l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final C0S5Q LJJIIJ(Object obj, C0S5Q c0s5q, String str) {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        C0S5P c0s5pLJIJI = (C0S5P) c0s5q;
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJIL.getValue()).entrySet()) {
            LJIJJ().LIZ.add((AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>>) ((Pair) entry.getValue()).getFirst());
            LJIJ().put(entry.getKey(), ((Pair) entry.getValue()).getSecond());
        }
        ((ConcurrentHashMap) this.LJIL.getValue()).clear();
        this.LJI = videoItemParams;
        if (C294320BgE.LIZ()) {
            this.LJIILLIIL.LJIIIZ(videoItemParams.getAweme(), videoItemParams.mEventType);
        } else {
            this.LJIILL.LJIIIZ(videoItemParams.getAweme(), videoItemParams.mEventType);
        }
        LJIIIZ(videoItemParams.getAweme(), videoItemParams.mEventType);
        LJIIIZ(videoItemParams.getAweme(), videoItemParams.mEventType);
        this.LJIIZILJ.LJIIIZ(videoItemParams.getAweme(), videoItemParams.mEventType);
        if (C299170Bo3.LIZJ()) {
            LJIIIZ(videoItemParams.getAweme(), videoItemParams.mEventType);
        }
        Iterator<Map.Entry<EnumC207101162h, AnonymousClass1634<?>>> it2 = LJIJ().entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LJIIIZ(videoItemParams.getAweme(), videoItemParams.mEventType);
        }
        if (c0s5pLJIJI == null) {
            VideoItemParams videoItemParams2 = this.LJI;
            if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null && LJIJJ().LIZJ(aweme)) {
                c0s5pLJIJI = LJIJI();
            } else {
                c0s5pLJIJI = C709290Rrz.LIZIZ;
            }
        }
        LJJIFFI(c0s5pLJIJI);
        return c0s5pLJIJI;
    }
}
