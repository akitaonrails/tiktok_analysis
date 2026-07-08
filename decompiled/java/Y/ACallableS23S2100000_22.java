package Y;

import X.C0MH8;
import X.C1C7U;
import X.C214848196g;
import X.C2354709Kn;
import X.C493401w4;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes23.dex */
public class ACallableS23S2100000_22 implements Callable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS23S2100000_22 aCallableS23S2100000_22) {
        boolean zLIZLLL;
        C1C7U.LIZ("ImageHeaderModule@1844.updateCoverAfterBackFromAlbum$1");
        if (C493401w4.LIZ()) {
            C0MH8 c0mh8 = C0MH8.LIZ;
            VideoPublishEditModel videoPublishEditModel = ((C214848196g) aCallableS23S2100000_22.l2).LIZ;
            String str = aCallableS23S2100000_22.s0;
            String str2 = aCallableS23S2100000_22.s1;
            c0mh8.getClass();
            zLIZLLL = C0MH8.LIZLLL(videoPublishEditModel, str, str2);
        } else {
            zLIZLLL = C2354709Kn.LIZLLL(aCallableS23S2100000_22.s0, aCallableS23S2100000_22.s1);
        }
        Boolean boolValueOf = Boolean.valueOf(zLIZLLL);
        C1C7U.LIZIZ("ImageHeaderModule@1844.updateCoverAfterBackFromAlbum$1");
        return boolValueOf;
    }

    public static final Object call$1(ACallableS23S2100000_22 aCallableS23S2100000_22) {
        boolean zLIZLLL;
        C1C7U.LIZ("ImageHeaderModule@1844.updateCoverWithCoverText$4");
        if (C493401w4.LIZ()) {
            C0MH8 c0mh8 = C0MH8.LIZ;
            VideoPublishEditModel videoPublishEditModel = ((C214848196g) aCallableS23S2100000_22.l2).LIZ;
            String str = aCallableS23S2100000_22.s0;
            String str2 = aCallableS23S2100000_22.s1;
            c0mh8.getClass();
            zLIZLLL = C0MH8.LIZLLL(videoPublishEditModel, str, str2);
        } else {
            zLIZLLL = C2354709Kn.LIZLLL(aCallableS23S2100000_22.s0, aCallableS23S2100000_22.s1);
        }
        Boolean boolValueOf = Boolean.valueOf(zLIZLLL);
        C1C7U.LIZIZ("ImageHeaderModule@1844.updateCoverWithCoverText$4");
        return boolValueOf;
    }

    public ACallableS23S2100000_22(C214848196g c214848196g, String str, String str2, int i) {
        this.$t = i;
        this.l2 = c214848196g;
        this.s0 = str;
        this.s1 = str2;
    }
}
