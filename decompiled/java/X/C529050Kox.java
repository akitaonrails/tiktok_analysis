package X;

import Y.ARunnableS15S0201000_8;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.AlbumDeferLoadMoreConfig;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0Kox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C529050Kox {
    public final /* synthetic */ C529030Kov LIZ;

    public /* synthetic */ C529050Kox(C529030Kov c529030Kov) {
        this.LIZ = c529030Kov;
    }

    public final void LIZ(int i, AbstractC530360Kr4 abstractC530360Kr4) {
        C529030Kov c529030Kov = this.LIZ;
        c529030Kov.getClass();
        ARunnableS15S0201000_8 aRunnableS15S0201000_8 = new ARunnableS15S0201000_8(c529030Kov, abstractC530360Kr4, i, 1);
        if (c529030Kov.LLLIIII && !c529030Kov.LLLII && abstractC530360Kr4 == C530350Kr3.LIZ) {
            if (((HashSet) c529030Kov.LLLFZ).add(Integer.valueOf(i))) {
                ((ArrayList) c529030Kov.LLLFFI).add(aRunnableS15S0201000_8);
                C07KU.LIZ.getClass();
                AlbumDeferLoadMoreConfig albumDeferLoadMoreConfig = (AlbumDeferLoadMoreConfig) C07KU.LIZIZ.getValue();
                if (albumDeferLoadMoreConfig == null) {
                    albumDeferLoadMoreConfig = new AlbumDeferLoadMoreConfig(false, 4000L);
                }
                long fallbackMs = albumDeferLoadMoreConfig.getFallbackMs();
                C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[*]onSetDataFinish: defer loadMore until ACTIVITY_ENTER_ANIMATION_END, costMs=");
                sbLIZ.append(c529030Kov.LLLLIILL());
                sbLIZ.append(" mediaType=");
                sbLIZ.append(i);
                sbLIZ.append(" pendingCount=");
                sbLIZ.append(((ArrayList) c529030Kov.LLLFFI).size());
                sbLIZ.append(" fallbackMs=");
                sbLIZ.append(fallbackMs);
                C201955140j.LJIILL(c533790Kwb, "MvChooseAlbumFragment", C2188811AlT.LIZIZ(sbLIZ));
                if (!c529030Kov.LLLI) {
                    c529030Kov.LLLI = true;
                    c529030Kov.LLLIIIIL.postDelayed(c529030Kov.LLLIIIL, fallbackMs);
                    return;
                }
                return;
            }
        }
        aRunnableS15S0201000_8.run();
    }
}
