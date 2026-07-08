package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1639, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1639 extends C164O<AbstractC1340120kyg, AbstractC207157164l> implements AnonymousClass1645<Comment, AbstractC1340120kyg>, InterfaceC1339640kxu {
    public Comment LIZLLL;
    public String LJ;
    public EnumC715590S5d LJFF;
    public final C11NJ LJI = new C11NJ();
    public boolean LJII;
    public final C054G LJIIIIZZ;
    public final C163L LJIIIZ;
    public final C163R LJIIJ;
    public final AnonymousClass1638<Comment> LJIIJJI;
    public final C2252321DDq LJIIL;
    public final C2252321DDq LJIILIIL;
    public final C2252321DDq LJIILJJIL;
    public final List<C09AE> LJIILL;

    @Override // X.InterfaceC1339640kxu
    public final void LJI() {
        this.LJII = true;
        getClass();
        ((ArrayList) this.LJIILL).add(C23250099c.LIZLLL(this.LJIIIIZZ, null, null, new C708300RqO(this, null), 3));
        ((ArrayList) this.LJIILL).add(C23250099c.LIZLLL(this.LJIIIIZZ, null, null, new C708290RqN(this, null), 3));
        ((ArrayList) this.LJIILL).add(C23250099c.LIZLLL(this.LJIIIIZZ, null, null, new C708280RqM(this, null), 3));
        ((ArrayList) this.LJIILL).add(C23250099c.LIZLLL(this.LJIIIIZZ, null, null, new C708310RqP(this, null), 3));
        LJIJJLI();
    }

    @Override // X.InterfaceC1339640kxu
    public final void LJII() {
        this.LJII = false;
        this.LJFF = null;
        Iterator it2 = ((ArrayList) this.LJIILL).iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
        ((ArrayList) this.LJIILL).clear();
        if (this.LJIIL.getValue() instanceof C1340030kyX) {
            onEvent(C207158164m.LIZIZ);
        }
        this.LJI.LJ();
    }

    @Override // X.C164P
    public final String getTag() {
        return "CommentTranslationStateMachine";
    }

    @Override // X.InterfaceC1339640kxu
    public final void LIZJ() {
        LJIJJ(EnumC715590S5d.CLICK);
    }

    public final EnumC715680S5m LJIJ() {
        C161N c161n = C161N.LIZIZ;
        Comment comment = this.LIZLLL;
        EnumC715680S5m enumC715680S5mLJZ = c161n.LJZ(comment != null ? comment.getCid() : null);
        return enumC715680S5mLJZ == null ? EnumC715680S5m.NOT_OVERWRITTEN : enumC715680S5mLJZ;
    }

    public final AbstractC1340120kyg LJIJI() {
        Comment comment;
        if (C0S62.LIZ[EnumC207101162h.COMMENT.ordinal()] == 1 && (comment = this.LIZLLL) != null && this.LJIIIZ.LIZ(comment) && (!C0BJB.LIZ() || LJIJ() != EnumC715680S5m.OVERRIDE_TO_ORIGINAL)) {
            return C1340130kyh.LIZIZ;
        }
        boolean zLIZJ = this.LJIIJJI.LIZJ(this.LIZLLL);
        Comment comment2 = this.LIZLLL;
        return new C1340020kyW(zLIZJ, false, comment2 != null ? comment2.getAwemeId() : null);
    }

    public final void LJIJJLI() {
        Comment comment = this.LIZLLL;
        if (comment != null && this.LJII) {
            boolean zLJ = this.LJIIJJI.LJ(comment, LJIJ());
            if (C0BJB.LIZ()) {
                zLJ = zLJ && LJIJ() != EnumC715680S5m.OVERRIDE_TO_ORIGINAL;
            }
            String strLLIIJI = C161N.LIZIZ.LLIIJI(this.LIZLLL, LJIJ());
            C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OverallCommentTranslationStateMachine reEvaluateTranslationState currentState:");
            sbLIZ.append(this.LJIIL.getValue());
            sbLIZ.append(", requestType:");
            sbLIZ.append(this.LJFF);
            sbLIZ.append(", shouldTranslate:");
            sbLIZ.append(zLJ);
            sbLIZ.append(", overrideStatus:");
            sbLIZ.append(LJIJ());
            sbLIZ.append(", cid:");
            Comment comment2 = this.LIZLLL;
            sbLIZ.append(comment2 != null ? comment2.getCid() : null);
            sbLIZ.append(", aid:");
            Comment comment3 = this.LIZLLL;
            sbLIZ.append(comment3 != null ? comment3.getAwemeId() : null);
            sbLIZ.append(", shouldTranslateDiagnosis:");
            sbLIZ.append(strLLIIJI);
            C0SZC.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (zLJ) {
                if (this.LJIIL.getValue() instanceof C1340020kyW) {
                    if (this.LJFF == EnumC715590S5d.CLICK) {
                        onEvent(C207164164s.LIZIZ);
                        return;
                    } else {
                        onEvent(C207159164n.LIZIZ);
                        return;
                    }
                }
                return;
            }
            if (this.LJIIL.getValue() instanceof C1340130kyh) {
                onEvent(C207162164q.LIZIZ);
                return;
            }
            if (this.LJIIL.getValue() instanceof C1340030kyX) {
                onEvent(C207158164m.LIZIZ);
                return;
            }
            if (this.LJIIL.getValue() instanceof C1340020kyW) {
                AbstractC1340120kyg abstractC1340120kygLJIJI = LJIJI();
                if (Intrinsics.LJFF(abstractC1340120kygLJIJI, this.LJIIL.getValue()) || Intrinsics.LJFF(abstractC1340120kygLJIJI, C1340130kyh.LIZIZ)) {
                    return;
                }
                LJIL(abstractC1340120kygLJIJI);
            }
        }
    }

    @Override // X.InterfaceC1339640kxu
    public final void translate() {
        LJIIIIZZ(EnumC715590S5d.CLICK, false);
    }

    @Override // X.InterfaceC1339640kxu
    public final C05YD<AbstractC1340120kyg> LIZ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1339640kxu
    public final C2252321DDq LJ() {
        return this.LJIILJJIL;
    }

    @Override // X.C164O
    public final InterfaceC332260D0u<AbstractC1340120kyg> LJIIZILJ() {
        return this.LJIIL;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1637, X.163R] */
    public AnonymousClass1639(LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LJIIIIZZ = C2296808zG.LIZ(lifecycleCoroutineScope.getCoroutineContext().plus(C164O.LIZJ));
        final C163L c163l = new C163L();
        this.LJIIIZ = c163l;
        ?? r3 = new AnonymousClass1637<Comment, C163L, C912690ZrH, AbstractC1340120kyg>(c163l) { // from class: X.163R
            @Override // X.AnonymousClass1637
            public final C164G LIZJ() {
                return new C912690ZrH(null, null, false, null, null);
            }

            {
                C1055510dZd c1055510dZd = new C1055510dZd();
            }

            @Override // X.AnonymousClass1637
            public final C164G LIZIZ(C0S5Q c0s5q, C0S5Q c0s5q2, Comment comment, EnumC715680S5m enumC715680S5m) {
                Comment comment2 = comment;
                if (comment2 != null) {
                    if (c0s5q instanceof C1340020kyW) {
                        String cid = comment2.getCid();
                        C207135163p c207135163p = new C207135163p(enumC715680S5m, cid, false);
                        this.LIZ.getClass();
                        C163L.LJIIL(comment2, c207135163p);
                        return new C912690ZrH(c207135163p.LIZJ, cid, c207135163p.LJFF, c207135163p.LIZLLL, c207135163p.LJ);
                    }
                    if (!(c0s5q instanceof C1340030kyX)) {
                        if (c0s5q instanceof C1340130kyh) {
                            String cid2 = comment2.getCid();
                            C207135163p c207135163p2 = new C207135163p(enumC715680S5m, cid2, true);
                            this.LIZ.getClass();
                            C163L.LJIIL(comment2, c207135163p2);
                            return new C912690ZrH(c207135163p2.LIZJ, cid2, c207135163p2.LJFF, c207135163p2.LIZLLL, c207135163p2.LJ);
                        }
                        throw new C1954807lC();
                    }
                    return null;
                }
                return null;
            }
        };
        this.LJIIJ = r3;
        this.LJIIJJI = new AnonymousClass1638<>(C1697810uHb.LJIILJJIL(c163l));
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(LJIJI());
        this.LJIIL = c2252321DDqLIZ;
        this.LJIILIIL = c2252321DDqLIZ;
        this.LJIILJJIL = r3.LJI;
        this.LJIILL = new ArrayList();
        new AwS610S0100000_31(this, 341).invoke(this);
    }

    @Override // X.InterfaceC1339640kxu
    public final boolean LJIIJJI(Comment comment) {
        return this.LJIIJJI.LIZJ(comment);
    }

    public final void LJIJJ(EnumC715590S5d enumC715590S5d) {
        String cid;
        this.LJFF = enumC715590S5d;
        if (enumC715590S5d == EnumC715590S5d.CLICK && (this.LJIIL.getValue() instanceof C1340130kyh)) {
            EnumC715680S5m enumC715680S5m = EnumC715680S5m.OVERRIDE_TO_ORIGINAL;
            C161N c161n = C161N.LIZIZ;
            Comment comment = this.LIZLLL;
            if (comment != null) {
                cid = comment.getCid();
            } else {
                cid = null;
            }
            c161n.LJIIIZ(enumC715680S5m, cid);
            LJIJJLI();
        }
    }

    public final void LJIL(AbstractC1340120kyg abstractC1340120kyg) {
        String awemeId;
        Comment comment;
        String cid;
        LJ(abstractC1340120kyg, LJIJ());
        this.LJIIL.getValue();
        Comment comment2 = this.LIZLLL;
        if (comment2 != null && (awemeId = comment2.getAwemeId()) != null && (comment = this.LIZLLL) != null && (cid = comment.getCid()) != null && !(abstractC1340120kyg instanceof C1340020kyW)) {
            C746760TRa.LIZ().LJLLJ(awemeId, cid);
        }
        this.LJIIL.setValue(abstractC1340120kyg);
    }

    @Override // X.AnonymousClass1645
    public final void LJIIIIZZ(EnumC715590S5d enumC715590S5d, boolean z) {
        String cid;
        this.LJFF = enumC715590S5d;
        if (this.LJII && enumC715590S5d == EnumC715590S5d.CLICK && (this.LJIIL.getValue() instanceof C1340020kyW)) {
            EnumC715680S5m enumC715680S5m = EnumC715680S5m.OVERRIDE_TO_TRANSLATED;
            C161N c161n = C161N.LIZIZ;
            Comment comment = this.LIZLLL;
            if (comment != null) {
                cid = comment.getCid();
            } else {
                cid = null;
            }
            c161n.LJIIIZ(enumC715680S5m, cid);
            LJIJJLI();
        }
    }

    @Override // X.C164P
    public final void LIZLLL(C0S5Q c0s5q, C13IQ c13iq, InterfaceC710780RuO interfaceC710780RuO) {
        AbstractC1340120kyg c1340020kyW;
        String awemeId;
        AbstractC1340120kyg abstractC1340120kyg = (AbstractC1340120kyg) c0s5q;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("from: ");
        sbLIZ.append(abstractC1340120kyg.LIZ.getId());
        sbLIZ.append(" to: ");
        sbLIZ.append(c13iq.LJI());
        sbLIZ.append(", event = ");
        sbLIZ.append(interfaceC710780RuO);
        sbLIZ.append(", thread = ");
        sbLIZ.append(C786410Ut5.u3());
        C2344809Gs.LIZLLL(4, "CommentTranslationStateMachine", C2188811AlT.LIZIZ(sbLIZ));
        String cid = null;
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1340020kyW.class))) {
            boolean zLIZJ = this.LJIIJJI.LIZJ(this.LIZLLL);
            boolean zLJFF = Intrinsics.LJFF(abstractC1340120kyg, C1340030kyX.LIZIZ);
            Comment comment = this.LIZLLL;
            if (comment != null) {
                awemeId = comment.getAwemeId();
            } else {
                awemeId = null;
            }
            c1340020kyW = new C1340020kyW(zLIZJ, zLJFF, awemeId);
        } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1340030kyX.class))) {
            c1340020kyW = C1340030kyX.LIZIZ;
        } else if (!Intrinsics.LJFF(c13iq, C13LE.LIZ(C1340130kyh.class))) {
            return;
        } else {
            c1340020kyW = C1340130kyh.LIZIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Cid ");
        Comment comment2 = this.LIZLLL;
        if (comment2 != null) {
            cid = comment2.getCid();
        }
        sbLIZ2.append(cid);
        sbLIZ2.append(" New state ");
        sbLIZ2.append(c1340020kyW);
        sbLIZ2.append(' ');
        C2188811AlT.LIZIZ(sbLIZ2);
        LJIL(c1340020kyW);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1339640kxu
    public final void LJIIL(Comment comment, Aweme aweme, String str) {
        if (this.LJIIL.getValue() instanceof C1340030kyX) {
            onEvent(C207158164m.LIZIZ);
        }
        this.LJI.LJ();
        this.LIZLLL = comment;
        this.LJ = str;
        C163R c163r = this.LJIIJ;
        c163r.LIZLLL = comment;
        c163r.LJ = str;
        c163r.LJFF = null;
        LJIL(LJIJI());
        C1361410lX1.LJ.getClass();
        C1361410lX1.LJII = aweme;
    }
}
