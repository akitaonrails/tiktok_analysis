package X;

import Y.ARunnableS109S0100000_9;
import Y.ARunnableS11S0210000_9;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0N44, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N44 {
    public static boolean LIZJ;
    public static final C0N44 LIZ = new C0N44();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1786806zC());
    public static volatile boolean LIZLLL = true;

    public static void LIZIZ(Aweme aweme) {
        Video video;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video.getOriginCover()));
        c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJIIIIZZ.LJIILIIL();
    }

    public static void LIZ(FeedItemList feedItemList, final int i, final boolean z, final boolean z2) {
        if (C2277711EDh.LIZIZ.LJJJJJ()) {
            return;
        }
        if (((Boolean) C1786606zA.LIZIZ.getValue()).booleanValue()) {
            C1832307Fp.LIZ.getClass();
            if (C1832307Fp.LIZIZ() && LIZLLL) {
                LIZLLL = false;
                return;
            }
        }
        LIZLLL = false;
        if (!C1150504el.LIZ().LJIIIZ("feed_parse_end_to_video_preload")) {
            C1150504el.LIZ().LJI("feed_parse_end_to_video_preload", false);
        }
        if (!C1150504el.LIZ().LJIIIIZZ("feed_video_preload_method_duration")) {
            C1150504el.LIZ().LIZLLL("feed_video_preload_method_duration", false);
        }
        final ArrayList arrayList = new ArrayList();
        List<Aweme> items = feedItemList.getItems();
        if (items != null) {
            arrayList.addAll(items);
        }
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0N40
            public final void LIZ() {
                boolean z3;
                boolean zLIZ;
                C0N44 c0n44 = C0N44.LIZ;
                List<Aweme> list = arrayList;
                int i2 = i;
                boolean z4 = z;
                boolean z5 = z2;
                c0n44.getClass();
                C1832307Fp.LIZ.getClass();
                if (C1832307Fp.LIZIZ() || C1832307Fp.LIZ() || C1832307Fp.LIZJ(false) || ((Boolean) C10VV.LIZIZ.getValue()).booleanValue() || ((Boolean) C0N41.LIZ.getValue()).booleanValue()) {
                    z3 = true;
                    zLIZ = true;
                } else {
                    z3 = false;
                    zLIZ = C587840N3u.LIZ.LIZ(EnumC587870N3x.FEED_FIRST_VIDEO_PRELOAD);
                }
                if (list != null && !C086I.LIZIZ(list) && zLIZ) {
                    if (!C07JG.LIZ()) {
                        C1483340ohg.LJJI(0, list);
                        if (((Boolean) C0N41.LIZ.getValue()).booleanValue()) {
                            for (int i3 = 1; i3 < list.size() && i3 < ((Number) C0N44.LIZIZ.getValue()).intValue(); i3++) {
                                C1483340ohg.LJJI(i3, list);
                            }
                        }
                    }
                    boolean zLIZ2 = z3 ? true : C587840N3u.LIZ.LIZ(EnumC587870N3x.PLAYER_FIRST_VIDEO_PREPARED);
                    boolean zLIZ3 = C587840N3u.LIZ.LIZ(EnumC587870N3x.FEED_FIRST_VIDEO_PRELOAD);
                    C1832307Fp.LIZ.getClass();
                    if (C1832307Fp.LIZJ(false) && C0N44.LIZJ) {
                        zLIZ2 = false;
                    }
                    if (z5 && zLIZ2) {
                        final Aweme aweme = (Aweme) ListProtector.get(list, 0);
                        OnPlayerPreparedListener onPlayerPreparedListener = new OnPlayerPreparedListener() { // from class: X.0ztM
                            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener
                            public final void onPreparedReady(String str) {
                                C1913090zsp c1913090zsp = C1913090zsp.LIZ;
                                Pair pair = new Pair(Boolean.valueOf(AwemeBizExtKt.isDidZero(aweme)), Boolean.valueOf(AwemeBizExtKt.isUidZero(aweme)));
                                c1913090zsp.getClass();
                                C1913090zsp.LIZIZ(pair);
                            }
                        };
                        if (aweme.getVideo() != null) {
                            if (i2 == 4 || ((Boolean) C10VV.LIZIZ.getValue()).booleanValue()) {
                                if (!z4) {
                                    return;
                                }
                                if (C104100aN.LIZ().isNewUser()) {
                                    C1483410ohn.LJLJJI().LJJJLZIJ(aweme.getAid());
                                }
                                if (zLIZ3) {
                                    C823050WQl.LIZLLL().execute(new ARunnableS109S0100000_9(aweme, 214));
                                }
                                C0VY3.LIZ(new ARunnableS11S0210000_9(aweme, onPlayerPreparedListener, z3, 4));
                            } else {
                                C0NET.LIZ.getClass();
                                if (C0NET.LJIIIZ()) {
                                    C1483410ohn.LJLJJI().LJJJJLI(aweme, false);
                                    if (zLIZ3) {
                                        C823050WQl.LIZLLL().execute(new ARunnableS109S0100000_9(aweme, 215));
                                    }
                                }
                            }
                        }
                    }
                }
                if (!C1150504el.LIZ().LJIIIZ("feed_video_preload_method_duration")) {
                    C1150504el.LIZ().LJI("feed_video_preload_method_duration", false);
                }
                if (C1150504el.LIZ().LJIIIIZZ("feed_video_preload_method_end_to_prepare")) {
                    return;
                }
                C1150504el.LIZ().LIZLLL("feed_video_preload_method_end_to_prepare", false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PreloadHelper@3004.preloadVideo$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PreloadHelper@3004.preloadVideo$2");
            }
        });
    }
}
