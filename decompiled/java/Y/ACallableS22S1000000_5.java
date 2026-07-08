package Y;

import X.C1403010mc7;
import X.C1C7U;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public class ACallableS22S1000000_5 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS22S1000000_5 aCallableS22S1000000_5) {
        C1C7U.LIZ("ImageEditRootScene@a14e.fetchAndAutoAttachMusic$1$1");
        AVMusic aVMusicVk = C1403010mc7.LIZ.getMusicService().Vk(aCallableS22S1000000_5.s0);
        C1C7U.LIZIZ("ImageEditRootScene@a14e.fetchAndAutoAttachMusic$1$1");
        return aVMusicVk;
    }

    public static final Object call$1(ACallableS22S1000000_5 aCallableS22S1000000_5) {
        C1C7U.LIZ("SocialVideoEditContainerScene@5a77.fetchAiselfMusic$1");
        AVMusic aVMusicVk = C1403010mc7.LIZ.getMusicService().Vk(aCallableS22S1000000_5.s0);
        C1C7U.LIZIZ("SocialVideoEditContainerScene@5a77.fetchAiselfMusic$1");
        return aVMusicVk;
    }

    public static final Object call$2(ACallableS22S1000000_5 aCallableS22S1000000_5) {
        C1C7U.LIZ("SocialVideoEditContainerScene@5a77.fetchAndAutoAttachMusic$1");
        AVMusic aVMusicVk = C1403010mc7.LIZ.getMusicService().Vk(aCallableS22S1000000_5.s0);
        C1C7U.LIZIZ("SocialVideoEditContainerScene@5a77.fetchAndAutoAttachMusic$1");
        return aVMusicVk;
    }

    public ACallableS22S1000000_5(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
