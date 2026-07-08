package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.163L, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163L extends AnonymousClass1636<Comment, C1361410lX1> {
    @Override // X.AnonymousClass1636
    public final C163A LIZIZ() {
        return C1361410lX1.LJ;
    }

    @Override // X.AnonymousClass1636
    public final EnumC207101162h LIZJ() {
        return EnumC207101162h.COMMENT;
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIIZ(Comment comment) {
        return C161N.LIZIZ.LJIILIIL(comment);
    }

    public static void LJIIL(Comment comment, C207135163p c207135163p) {
        C1361470lX7 c1361470lX7LJI;
        if (c207135163p.LIZ) {
            EnumC715680S5m enumC715680S5m = c207135163p.LIZIZ;
            C161N c161n = C161N.LIZIZ;
            if (c161n.LJIILLIIL(comment, enumC715680S5m) && (c1361470lX7LJI = C1361410lX1.LJ.LJI(comment, c161n.LLIIZ())) != null) {
                c207135163p.LIZLLL = c161n.LLIIZ();
                c207135163p.LJFF = true;
                c207135163p.LIZJ = c1361470lX7LJI.LIZIZ;
                c207135163p.LJ = c1361470lX7LJI.LIZLLL;
                return;
            }
        }
        c207135163p.LIZLLL = comment.getCommentLanguage();
        c207135163p.LJFF = false;
        c207135163p.LIZJ = comment.getText();
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIJ(Comment comment, EnumC715680S5m enumC715680S5m) {
        return C161N.LIZIZ.LJIILLIIL(comment, enumC715680S5m);
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJFF(Aweme aweme, AnonymousClass1648 anonymousClass1648) {
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJI(C207134163o c207134163o, C207131163l c207131163l) {
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJII(Aweme aweme, C207127163h c207127163h) {
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJIIIIZZ(C207134163o c207134163o, AnonymousClass1643 anonymousClass1643) {
    }

    @Override // X.AnonymousClass1636
    public final void LIZLLL(Comment comment, C162U c162u, boolean z, boolean z2) {
        EnumC1782690wUV enumC1782690wUV;
        Comment comment2 = comment;
        if (c162u != null) {
            EnumC207100162g enumC207100162g = EnumC207100162g.COMMENT;
            String commentLanguage = comment2.getCommentLanguage();
            String text = comment2.getText();
            int length = 0;
            if (text != null && text.length() != 0) {
                if (!z) {
                    enumC1782690wUV = EnumC1782690wUV.NOT_TRANSLATABLE;
                } else if (!z2) {
                    enumC1782690wUV = EnumC1782690wUV.TRANSLATION_NOT_TRIGGERED;
                } else {
                    enumC1782690wUV = EnumC1782690wUV.TO_BE_TRANSLATED;
                }
            } else {
                enumC1782690wUV = EnumC1782690wUV.NOT_EXIST;
            }
            String text2 = comment2.getText();
            if (text2 != null) {
                length = text2.length();
            }
            c162u.LIZJ(enumC207100162g, enumC1782690wUV, commentLanguage, Integer.valueOf(length), null, null);
        }
    }
}
