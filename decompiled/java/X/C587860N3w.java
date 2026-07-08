package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587860N3w {
    public static boolean LIZ;
    public static volatile Boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;

    public static void LIZ(FeedItemList feedItemList) {
        if (feedItemList != null && feedItemList.getItems() != null && feedItemList.getItems().size() > 0) {
            if (C0CD2.LIZ()) {
                if (!LIZJ) {
                    return;
                }
            } else if (!Intrinsics.LJFF(LIZIZ, Boolean.TRUE)) {
                return;
            }
            ICommonFeedAppDiffProtocol.LIZ.getClass();
            C1865480ye2.LIZ().LJIIJJI();
            final Aweme aweme = (Aweme) ListProtector.get(feedItemList.getItems(), 0);
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0N3v
                public final void LIZ() {
                    Aweme aweme2 = aweme;
                    EnumC587690N3f enumC587690N3f = EnumC587690N3f.COLD_CACHE;
                    if (aweme2 != null && C582980Mtk.LIZIZ(aweme2) && C587840N3u.LIZ.LIZ(EnumC587870N3x.FEED_FIRST_IMAGE_PRELOAD)) {
                        C0N3Z.LIZ(aweme2, enumC587690N3f);
                    }
                    Aweme aweme3 = aweme;
                    if (aweme3 == null || aweme3.getVideo() == null || C587860N3w.LIZ) {
                        return;
                    }
                    if ((!C2515309tP.LIZ || C1150504el.LIZ().LJII) && C587840N3u.LIZ.LIZ(EnumC587870N3x.PLAYER_FIRST_VIDEO_PREPARED)) {
                        if (((Boolean) C1867770yhj.LIZLLL.getValue()).booleanValue()) {
                            C1483410ohn.LJLJJI().LJJLIIIJLLLLLLLZ(aweme3, "cold_start_cache");
                        } else {
                            boolean z = false;
                            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "force_first_video_soft_decode", true) == 1 && !C581900Ms0.LJI) {
                                C0NET.LIZ.getClass();
                                if (C0NET.LJIIZILJ(true)) {
                                    z = true;
                                }
                            }
                            C1483410ohn.LJLJJI().LJJJJLI(aweme3, z);
                        }
                        C797930VRv.LIZIZ("preloadCacheReal, prerender aid " + aweme3.getAid());
                        C587860N3w.LIZLLL = true;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FeedCachePrepareVideoHelper@8363.prepareVideo$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedCachePrepareVideoHelper@8363.prepareVideo$1");
                }
            });
        }
    }
}
