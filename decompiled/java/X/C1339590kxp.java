package X;

import Y.AObserverS224S0100000_21;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0kxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339590kxp {
    public final C1340290kyx LIZ;
    public final C1353650lKV LIZIZ;
    public final C1339500kxg LIZJ;
    public String LIZLLL;
    public int LJ;
    public Comment LJFF;
    public Aweme LJI;
    public AwS600S0100000_21 LJII;
    public AwS635S0100000_21 LJIIIIZZ;
    public final C1339570kxn LJIIIZ = new InterfaceC1340280kyw() { // from class: X.0kxn
        @Override // X.InterfaceC1340280kyw
        public final void LIZ(boolean z) {
            C1339590kxp c1339590kxp = this.LIZ;
            Comment comment = c1339590kxp.LJFF;
            if (comment == null) {
                return;
            }
            c1339590kxp.LIZ(z);
            comment.setTransBtnStyle(2);
            AwS635S0100000_21 awS635S0100000_21 = this.LIZ.LJIIIIZZ;
            if (awS635S0100000_21 != null) {
                awS635S0100000_21.invoke(comment, Boolean.valueOf(z));
            }
        }
    };
    public final C1339620kxs LJIIJ = new InterfaceC1340280kyw() { // from class: X.0kxs
        @Override // X.InterfaceC1340280kyw
        public final void LIZ(boolean z) {
            String cid;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("asrPiggybackTranslate translate:");
            sbLIZ.append(z);
            sbLIZ.append(", cid:");
            Comment comment = this.LIZ.LJFF;
            if (comment != null) {
                cid = comment.getCid();
            } else {
                cid = null;
            }
            sbLIZ.append(cid);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LIZ.LIZ(z);
        }
    };
    public final AObserverS224S0100000_21 LJIIJJI = new AObserverS224S0100000_21(this, 96);

    public final void LIZ(boolean z) {
        C1339610kxr c1339610kxr;
        C1339610kxr c1339610kxr2;
        Comment comment = this.LJFF;
        if (comment == null) {
            return;
        }
        String aid = null;
        if (z) {
            C746760TRa.LIZ().LJLLJ(comment.getAwemeId(), comment.getCid());
            C1339500kxg c1339500kxg = this.LIZJ;
            if (c1339500kxg != null && (c1339610kxr2 = c1339500kxg.LJI) != null) {
                c1339610kxr2.translate();
            } else {
                C1343710l4T.LIZ.getClass();
                C1343710l4T.LJFF(Collections.singletonList(comment), null);
            }
            C1343710l4T.LIZ.getClass();
            if (C1343710l4T.LIZJ(comment)) {
                LIZLLL(C1340030kyX.LIZIZ);
                return;
            }
            return;
        }
        C1339500kxg c1339500kxg2 = this.LIZJ;
        if (c1339500kxg2 != null && (c1339610kxr = c1339500kxg2.LJI) != null) {
            c1339610kxr.resetTranslate();
        } else {
            C1343710l4T.LIZ.getClass();
            C1343710l4T.LIZLLL(comment);
        }
        Aweme aweme = this.LJI;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        LIZLLL(new C1340020kyW(true, false, aid));
    }

    public final AbstractC1340120kyg LIZIZ(Comment comment) {
        String aid;
        C1343710l4T.LIZ.getClass();
        boolean zLIZJ = C1343710l4T.LIZJ(comment);
        boolean zIsAudioTextIsTranslated = comment.isAudioTextIsTranslated();
        if (zLIZJ) {
            return C1340030kyX.LIZIZ;
        }
        if (zIsAudioTextIsTranslated) {
            return C1340130kyh.LIZIZ;
        }
        Aweme aweme = this.LJI;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return new C1340020kyW(true, false, aid);
    }

    public final boolean LIZJ(Comment comment) {
        Comment comment2;
        String cid;
        Comment comment3;
        C1343710l4T c1343710l4T = C1343710l4T.LIZ;
        String cid2 = comment.getCid();
        c1343710l4T.getClass();
        String asrText = null;
        if (cid2 == null) {
            comment2 = null;
        } else {
            comment2 = C1343710l4T.LIZJ.get(cid2);
        }
        if (!comment.isAudioTextIsTranslated() && comment2 != null) {
            comment.setAudioTextIsTranslated(true);
            CmtAudioStruct audioStruct = comment.getAudioStruct();
            if (audioStruct != null) {
                CmtAudioStruct audioStruct2 = comment2.getAudioStruct();
                if (audioStruct2 != null) {
                    asrText = audioStruct2.getAsrText();
                }
                audioStruct.setAsrText(asrText);
            }
            AwS600S0100000_21 awS600S0100000_21 = this.LJII;
            if (awS600S0100000_21 != null) {
                awS600S0100000_21.invoke(Boolean.TRUE);
            }
            return true;
        }
        if (!comment.isAudioTextIsTranslated() || comment2 != null || (cid = comment.getCid()) == null || (comment3 = C1343710l4T.LIZLLL.get(cid)) == null) {
            return false;
        }
        comment.setAudioTextIsTranslated(false);
        CmtAudioStruct audioStruct3 = comment.getAudioStruct();
        if (audioStruct3 != null) {
            CmtAudioStruct audioStruct4 = comment3.getAudioStruct();
            if (audioStruct4 != null) {
                asrText = audioStruct4.getAsrText();
            }
            audioStruct3.setAsrText(asrText);
        }
        AwS600S0100000_21 awS600S0100000_212 = this.LJII;
        if (awS600S0100000_212 != null) {
            awS600S0100000_212.invoke(Boolean.FALSE);
        }
        return true;
    }

    public final void LIZLLL(AbstractC1340120kyg abstractC1340120kyg) {
        String cid;
        C1353650lKV c1353650lKV;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAsrTranslationState state:");
        sbLIZ.append(abstractC1340120kyg);
        sbLIZ.append(", scenario:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cid:");
        Comment comment = this.LJFF;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        sbLIZ.append(cid);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = this.LJ;
        if (i != 1) {
            if (i == 2 && (c1353650lKV = this.LIZIZ) != null) {
                c1353650lKV.setAsrTranslationState(abstractC1340120kyg);
                return;
            }
            return;
        }
        C1340290kyx c1340290kyx = this.LIZ;
        if (c1340290kyx == null) {
            return;
        }
        c1340290kyx.setTranslationState(abstractC1340120kyg);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0kxn] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0kxs] */
    public C1339590kxp(C1340290kyx c1340290kyx, C1353360lK2 c1353360lK2, C1339500kxg c1339500kxg) {
        this.LIZ = c1340290kyx;
        this.LIZIZ = c1353360lK2;
        this.LIZJ = c1339500kxg;
    }
}
