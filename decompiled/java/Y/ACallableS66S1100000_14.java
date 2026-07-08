package Y;

import X.C1390380mHk;
import X.C19EG;
import X.C1C7U;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes15.dex */
public class ACallableS66S1100000_14 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

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

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$0(Y.ACallableS66S1100000_14 r12) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS66S1100000_14.call$0(Y.ACallableS66S1100000_14):java.lang.Object");
    }

    public static final Object call$1(ACallableS66S1100000_14 aCallableS66S1100000_14) {
        C1C7U.LIZ("SavePhotoStickerResultProcessorImpl@cdc0.onResult$1");
        C19EG c19eg = (C19EG) aCallableS66S1100000_14.l1;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(aCallableS66S1100000_14.s0);
        creativeToastBuilder.isTuxToastLegacy(true);
        C1390380mHk.LIZ(c19eg, 2044, creativeToastBuilder);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SavePhotoStickerResultProcessorImpl@cdc0.onResult$1");
        return unit;
    }

    public ACallableS66S1100000_14(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
