package X;

import com.ss.android.ugc.aweme.video.preload.experiment.VideoCoverPreloadConfig;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0onv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487210onv {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ony] */
    public static void LIZ() {
        C1483390ohl.LIZ().LIZJ().LJFF(new C0NAT() { // from class: X.0ony
            @Override // X.C0NAT
            public final int LIZ() {
                return ((VideoCoverPreloadConfig) C1487260oo0.LIZIZ.getValue()).preloadCoverCnt;
            }

            @Override // X.C0NAT
            public final boolean LIZIZ() {
                return ((VideoCoverPreloadConfig) C1487260oo0.LIZIZ.getValue()).preloadWhenPreloadNextVideoDown;
            }

            @Override // X.C0NAT
            public final boolean LIZJ() {
                return ((VideoCoverPreloadConfig) C1487260oo0.LIZIZ.getValue()).enablePreload;
            }

            @Override // X.C0NAT
            public final boolean LIZLLL() {
                return ((VideoCoverPreloadConfig) C1487260oo0.LIZIZ.getValue()).preloadWhenDownloadComplete;
            }

            @Override // X.C0NAT
            public final boolean LJFF() {
                return C2551509zF.LIZ;
            }

            @Override // X.C0NAT
            public final boolean LJ(String str) {
                if (str == null || !a0.LJJIIZI(str, "scene_home_pageStoryMixedFeedDetailPanel", false)) {
                    return true;
                }
                return C287410BOh.LIZ();
            }
        });
    }
}
