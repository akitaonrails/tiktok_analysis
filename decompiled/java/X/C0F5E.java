package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0F5E, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F5E {
    public final C0F5K LIZ;
    public final C0F5L LIZIZ;

    public final int LIZ() {
        C0F5L c0f5l = this.LIZIZ;
        C425240Glu c425240Glu = c0f5l.LJII;
        C384570F5z c384570F5z = c0f5l.LJJIJIIJIL;
        int i = -1;
        if (c384570F5z == null || c425240Glu.getAdapter() == null) {
            return -1;
        }
        ArrayList<CaptionUtterance> arrayList = c384570F5z.LL;
        CaptionUtterance captionUtterance = (CaptionUtterance) C13LP.LJJJLZIJ(c384570F5z.LLLFZ(), arrayList);
        C0F5P c0f5p = this.LIZ.LJI;
        long j = c0f5p.LJI;
        int i2 = c0f5p.LJII;
        int i3 = 0;
        if (captionUtterance != null) {
            long jLIZJ = captionUtterance.LIZJ();
            if (j <= captionUtterance.LIZ() && jLIZJ <= j && captionUtterance.LJ().length() > 0) {
                return c384570F5z.LLLFZ();
            }
        }
        int i4 = 0;
        for (CaptionUtterance captionUtterance2 : arrayList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            CaptionUtterance captionUtterance3 = captionUtterance2;
            if (((int) captionUtterance3.LIZJ()) != 0 || ((int) captionUtterance3.LIZ()) != i2) {
                long jLIZJ2 = captionUtterance3.LIZJ();
                if (j <= captionUtterance3.LIZ() && jLIZJ2 <= j && captionUtterance3.LJ().length() > 0) {
                    return i4;
                }
            }
            i4 = i5;
        }
        long j2 = Long.MAX_VALUE;
        for (CaptionUtterance captionUtterance4 : arrayList) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            CaptionUtterance captionUtterance5 = captionUtterance4;
            if (((int) captionUtterance5.LIZJ()) != 0 || ((int) captionUtterance5.LIZ()) != i2) {
                long jLIZJ3 = captionUtterance5.LIZJ();
                long jLIZ = captionUtterance5.LIZ();
                long j3 = j < jLIZJ3 ? jLIZJ3 - j : j > jLIZ ? j - jLIZ : 0L;
                if (j3 < j2) {
                    i = i3;
                    j2 = j3;
                }
            }
            i3 = i6;
        }
        return i;
    }

    public final void LIZIZ() {
        C384570F5z c384570F5z;
        C0F5L c0f5l = this.LIZIZ;
        C425240Glu c425240Glu = c0f5l.LJII;
        EditCaptionScene.HighLightLayoutManager highLightLayoutManager = c0f5l.LJJIJIL;
        if (highLightLayoutManager == null || (c384570F5z = c0f5l.LJJIJIIJIL) == null || !c425240Glu.isShown() || c425240Glu.getAdapter() == null) {
            return;
        }
        int iFindFirstCompletelyVisibleItemPosition = highLightLayoutManager.findFirstCompletelyVisibleItemPosition();
        int iMin = iFindFirstCompletelyVisibleItemPosition != -1 ? Math.min(iFindFirstCompletelyVisibleItemPosition, highLightLayoutManager.getItemCount() - 1) : highLightLayoutManager.getItemCount() - 1;
        if (c384570F5z.LLLFZ() != iMin) {
            c384570F5z.LLLI(iMin);
        }
    }

    public C0F5E(C0F5K c0f5k, C0F5L c0f5l) {
        this.LIZ = c0f5k;
        this.LIZIZ = c0f5l;
    }

    public final void LIZJ(int i, boolean z) {
        C0F5L c0f5l;
        EditCaptionScene.HighLightLayoutManager highLightLayoutManager;
        Long lValueOf;
        C0E55 player;
        long jLIZJ;
        if (i == -1 || (highLightLayoutManager = (c0f5l = this.LIZIZ).LJJIJIL) == null) {
            return;
        }
        C425240Glu c425240Glu = c0f5l.LJII;
        C384570F5z c384570F5z = c0f5l.LJJIJIIJIL;
        if (c384570F5z == null) {
            return;
        }
        this.LIZ.LJI.getClass();
        highLightLayoutManager.LLILLL = 400.0f;
        highLightLayoutManager.smoothScrollToPosition(c425240Glu, new C21673919s1(), i);
        if (z) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scrollToPosition, position = ");
            sbLIZ.append(i);
            sbLIZ.append(", seekPosition = ");
            CaptionUtterance captionUtterance = (CaptionUtterance) C13LP.LJJJLZIJ(i, c384570F5z.LL);
            if (captionUtterance != null) {
                lValueOf = Long.valueOf(captionUtterance.LIZJ());
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            C201955140j.LIZLLL(c563650M8t, "InlineCaptionFragment", C2188811AlT.LIZIZ(sbLIZ));
            C0E48 c0e48 = this.LIZ.LIZIZ;
            if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
                CaptionUtterance captionUtterance2 = (CaptionUtterance) C13LP.LJJJLZIJ(i, c384570F5z.LL);
                if (captionUtterance2 != null) {
                    jLIZJ = captionUtterance2.LIZJ();
                } else {
                    jLIZJ = 0;
                }
                player.LJIJI(((long) 30000) + (jLIZJ * ((long) LSPassThroughRecordSizeConfig.DEFAULT)), C351110Dpd.LIZ);
            }
        }
    }
}
