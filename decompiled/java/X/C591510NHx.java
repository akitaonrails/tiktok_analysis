package X;

import Y.ARunnableS106S0100000_6;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0NHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591510NHx {
    public static final Set<String> LIZ = Collections.synchronizedSet(new HashSet());

    public static void LIZ(int i, Aweme aweme) {
        Video video;
        UrlModel originCover;
        List<String> urlList;
        List<BitRate> listLLD;
        List<BitRate> bitRate;
        if (aweme == null) {
            return;
        }
        try {
            if (aweme.getVideo() != null) {
                Video video2 = aweme.getVideo();
                Video video3 = aweme.getVideo();
                if (video3 != null && (bitRate = video3.getBitRate()) != null) {
                    listLLD = C13LP.LLD(1, bitRate);
                } else {
                    listLLD = null;
                }
                video2.setBitRate(listLLD);
            }
            C1483340ohg.LIZJ(aweme, new C0NI4(i, EnumC591520NHy.PRELOAD_TASK_PRIORITY_DEFAULT, new C0NIL(C0NKA.Normal, "homepage_explore"), new InterfaceC1475420oUu() { // from class: X.0OHx
                @Override // X.InterfaceC1475420oUu
                public final /* synthetic */ void LIZIZ(int i2, long j, String str, String str2) {
                }

                @Override // X.InterfaceC1475420oUu
                public final void LIZ(int i2, long j, long j2, String str) {
                    C2213981Bky.LIZIZ.isOffline();
                }
            }));
            if (!AwemeExtKt.isPhotoMode(aweme) && (video = aweme.getVideo()) != null && (originCover = video.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null && !urlList.isEmpty()) {
                C823050WQl.LIZLLL().submit(new ARunnableS106S0100000_6(UriProtector.parse((String) ListProtector.get(originCover.getUrlList(), 0)), 301));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public static final void LIZIZ(int i, Aweme aweme) {
        String aid;
        if (aweme == null || aweme.getVideo() == null) {
            return;
        }
        if ((AwemeExtKt.isPhotoMode(aweme) && aweme.getMusic() == null) || (aid = aweme.getAid()) == null || i <= 0 || !LIZ.add(aid)) {
            return;
        }
        LIZ(i * 1024, aweme);
    }
}
