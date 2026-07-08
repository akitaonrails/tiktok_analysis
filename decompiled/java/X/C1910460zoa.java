package X;

import Y.ARunnableS39S0101000_28;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zoa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910460zoa {
    public Aweme LIZIZ;
    public String LIZJ;
    public boolean LJ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public String LJIIJJI;
    public final String LIZ = "general_search";
    public int LIZLLL = -1;
    public int LJFF = -1;
    public final C1868430yin LJI = new C1868430yin();
    public final Set<Integer> LJII = new LinkedHashSet();
    public final BPEAHandler LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());

    public final boolean LIZJ() {
        return Intrinsics.LJFF(this.LIZ, "general_search");
    }

    public final void LJ() {
        InterfaceC21663319qJ interfaceC21663319qJLJLJI;
        int i;
        int i2;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        this.LJIIJ++;
        C1868430yin c1868430yin = this.LJI;
        c1868430yin.getClass();
        Unit unit = null;
        if (C0BUF.LIZ() && !c1868430yin.LIZ) {
            Collection collectionValues = ((LinkedHashMap) c1868430yin.LIZJ).values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = collectionValues.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((C1868420yim) it2.next()).LIZLLL && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            Collection collectionValues2 = ((LinkedHashMap) c1868430yin.LIZJ).values();
            if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it3 = collectionValues2.iterator();
                i2 = 0;
                while (it3.hasNext()) {
                    if (((C1868420yim) it3.next()).LIZJ && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            Map<Integer, C1868420yim> map = c1868430yin.LIZJ;
            Integer num = c1868430yin.LJ;
            C1868420yim c1868420yim = (C1868420yim) ((LinkedHashMap) map).get(Integer.valueOf(num != null ? num.intValue() : 0));
            int size = c1868430yin.LIZLLL.size();
            String strLJJLIIIJ = c1868430yin.LIZLLL.isEmpty() ? "" : C13LP.LJJLIIIJ(((LinkedHashMap) c1868430yin.LIZLLL).keySet(), ",", null, null, 0, null, null, 62);
            Aweme aweme = c1868430yin.LIZIZ;
            int size2 = (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null) ? 0 : imageList.size();
            C2344009Gk c2344009Gk = new C2344009Gk();
            Aweme aweme2 = c1868430yin.LIZIZ;
            c2344009Gk.LJIIIIZZ("group_id", aweme2 != null ? aweme2.getAid() : null);
            c2344009Gk.LJIIIIZZ("enter_from", "general_search");
            c2344009Gk.LIZJ(i, "loaded_image_cnt");
            c2344009Gk.LIZJ(size2, "image_cnt");
            c2344009Gk.LIZJ((c1868420yim == null || !c1868420yim.LIZJ) ? 0 : 1, "first_image_preload");
            c2344009Gk.LIZJ((c1868420yim == null || !c1868420yim.LIZLLL) ? 0 : 1, "first_image_loaded");
            c2344009Gk.LIZJ(i2, "preload_image_cnt");
            c2344009Gk.LIZJ(size, "black_screen_cnt");
            c2344009Gk.LJIIIIZZ("black_screen_idx_list", strLJJLIIIJ);
            c2344009Gk.LIZJ(c1868430yin.LJFF + 1, "slides_cnt");
            C20684815ws.LJIILLIIL("search_image_play_end", c2344009Gk.LIZ);
            c1868430yin.LIZ = true;
        }
        C1868430yin c1868430yin2 = this.LJI;
        c1868430yin2.LJ = null;
        c1868430yin2.LIZ = false;
        c1868430yin2.LJFF = 0;
        ((LinkedHashMap) c1868430yin2.LIZLLL).clear();
        ((LinkedHashMap) c1868430yin2.LIZJ).clear();
        this.LJII.clear();
        this.LJIIIZ = false;
        this.LJ = false;
        this.LJFF = -1;
        this.LJIIJJI = null;
        this.LJIIIIZZ.removeCallbacksAndMessages(null);
        try {
            ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
            if (iSearchService != null && (interfaceC21663319qJLJLJI = iSearchService.LJLJI(this.LIZ)) != null) {
                interfaceC21663319qJLJLJI.reset();
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ(C1331670kl3 c1331670kl3) {
        Aweme aweme;
        if (LIZJ() && ((Number) C296160BjC.LIZ.getValue()).intValue() >= 1) {
            c1331670kl3.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3.LJJJJJ = "search_cache";
        } else {
            if (!C1335190kqj.LIZIZ() || !C1335190kqj.LIZ().includeGeneralSearch || (aweme = this.LIZIZ) == null || AwemeBizOptExtKt.getAwemeCacheType(aweme) != 1) {
                return;
            }
            c1331670kl3.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3.LJJJJJ = "photomode_image_cache_v2";
        }
    }

    public final void LIZLLL(int i) {
        if (!this.LJIIIZ) {
            this.LJIIIZ = true;
            this.LJI.LJ = Integer.valueOf(i);
        }
        C1868430yin c1868430yin = this.LJI;
        c1868430yin.LJFF = Math.max(c1868430yin.LJFF, i);
        C786410Ut5.LJLIIL(200L, this.LJIIIIZZ, new ARunnableS39S0101000_28(i, this, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1331670kl3 r22, final android.view.View r23, final com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r24, final int r25, final X.EnumC1338240kve r26, final com.ss.android.ugc.aweme.base.model.UrlModel r27, final java.util.List<? extends X.InterfaceC661730PxT> r28) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1910460zoa.LIZIZ(X.0kl3, android.view.View, com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel, int, X.0kve, com.ss.android.ugc.aweme.base.model.UrlModel, java.util.List):void");
    }
}
