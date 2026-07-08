package Y;

import X.AbstractC857240Xk2;
import X.C1390380mHk;
import X.C19EG;
import X.C1C7U;
import X.C857230Xk1;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public class ACallableS421S0100000_14 implements Callable {
    public final int $t;
    public Object l0;

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

    public static final Object call$0(ACallableS421S0100000_14 aCallableS421S0100000_14) {
        C1C7U.LIZ("Checker@1856.start$1$2$1");
        AbstractC857240Xk2 abstractC857240Xk2 = (AbstractC857240Xk2) aCallableS421S0100000_14.l0;
        C857230Xk1 c857230Xk1 = abstractC857240Xk2.LL;
        if (c857230Xk1 == null) {
            c857230Xk1 = null;
        }
        c857230Xk1.LJ(new AwS558S0100000_14(abstractC857240Xk2, (AbstractC857240Xk2<Object>) 1249));
        abstractC857240Xk2.LLILLJJLI.postValue(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Checker@1856.start$1$2$1");
        return unit;
    }

    public static final Object call$1(ACallableS421S0100000_14 aCallableS421S0100000_14) {
        C1C7U.LIZ("SavePhotoStickerResultProcessorImpl@cdc0.onResult$2");
        C19EG c19eg = (C19EG) aCallableS421S0100000_14.l0;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131833530);
        creativeToastBuilder.isTuxToastLegacy(true);
        C1390380mHk.LIZ(c19eg, 2045, creativeToastBuilder);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SavePhotoStickerResultProcessorImpl@cdc0.onResult$2");
        return unit;
    }

    public ACallableS421S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
