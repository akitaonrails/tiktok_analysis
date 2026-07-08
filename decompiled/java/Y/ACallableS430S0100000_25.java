package Y;

import X.C11PQ;
import X.C1403010mc7;
import X.C1449210nod;
import X.C1622840sKg;
import X.C1638390sjl;
import X.C1638410sjn;
import X.C1641990spZ;
import X.C19475711Hn;
import X.C1C7U;
import X.C259800zU;
import X.C346430Di5;
import X.InterfaceC1648570t0B;
import android.util.Pair;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public class ACallableS430S0100000_25 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS430S0100000_25 aCallableS430S0100000_25) {
        C1C7U.LIZ("RecommendMusicLogicComponent@cd97.getRecommendMusicByEffect$2");
        AVMusic aVMusicVk = C1403010mc7.LIZ.getMusicService().Vk((String) ((Pair) aCallableS430S0100000_25.l0).first);
        C1C7U.LIZIZ("RecommendMusicLogicComponent@cd97.getRecommendMusicByEffect$2");
        return aVMusicVk;
    }

    public static final Object call$1(ACallableS430S0100000_25 aCallableS430S0100000_25) {
        C1C7U.LIZ("RecordDockBarScene@443f.initStickerModule$2$1");
        C1449210nod c1449210nod = C1449210nod.LIZ;
        ShortVideoContext shortVideoContextLLLLIIIILLL = ((C1641990spZ) aCallableS430S0100000_25.l0).LLLLIIIILLL();
        q qVarLLLLIILL = ((C1641990spZ) aCallableS430S0100000_25.l0).LLLLIILL();
        C1641990spZ c1641990spZ = (C1641990spZ) aCallableS430S0100000_25.l0;
        boolean zLJFF = Intrinsics.LJFF(((InterfaceC1648570t0B) c1641990spZ.LLJJLIIIJLLLLLLLZ.getValue(c1641990spZ, C1641990spZ.LLLIIIIL[3])).ec().LIZJ(), Boolean.TRUE);
        c1449210nod.getClass();
        C1449210nod.LIZ(shortVideoContextLLLLIIIILLL, qVarLLLLIILL, zLJFF, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordDockBarScene@443f.initStickerModule$2$1");
        return unit;
    }

    public static final Object call$2(ACallableS430S0100000_25 aCallableS430S0100000_25) {
        C1C7U.LIZ("EffectConfigPresenter@ba9f.initObservable$1$1");
        Boolean boolValueOf = Boolean.valueOf(((C1622840sKg) aCallableS430S0100000_25.l0).LIZIZ());
        C1C7U.LIZIZ("EffectConfigPresenter@ba9f.initObservable$1$1");
        return boolValueOf;
    }

    public static final Object call$3(ACallableS430S0100000_25 aCallableS430S0100000_25) {
        C1C7U.LIZ("EffectConfigPresenter@ba9f.initObservable$2$1");
        Boolean boolValueOf = Boolean.valueOf(((C1622840sKg) aCallableS430S0100000_25.l0).LIZIZ());
        C1C7U.LIZIZ("EffectConfigPresenter@ba9f.initObservable$2$1");
        return boolValueOf;
    }

    public static final Object call$4(ACallableS430S0100000_25 aCallableS430S0100000_25) {
        Object c19475711Hn;
        C1C7U.LIZ("EffectPlatformFilterDataFetcher@30b2.requestActual$1");
        C1638410sjn c1638410sjn = (C1638410sjn) aCallableS430S0100000_25.l0;
        c1638410sjn.getClass();
        C11PQ c11pq = new C11PQ();
        if (!c1638410sjn.LIZLLL.invoke().booleanValue()) {
            c11pq.onError(new RuntimeException("network not available"));
            c11pq.onComplete();
            c19475711Hn = c11pq;
        } else {
            C259800zU c259800zU = new C259800zU();
            c1638410sjn.LIZ.get().LJJIII(c1638410sjn.LIZIZ.get(), new C1638390sjl(c259800zU, c1638410sjn, c11pq));
            c19475711Hn = new C19475711Hn(c11pq.LJJIIZ(new C346430Di5(c259800zU, 3)));
        }
        C1C7U.LIZIZ("EffectPlatformFilterDataFetcher@30b2.requestActual$1");
        return c19475711Hn;
    }

    public static final Object call$5(ACallableS430S0100000_25 aCallableS430S0100000_25) {
        C1C7U.LIZ("EffectWithMusicDownloadListener@4175.callTaskInMain$1");
        ((Function0) aCallableS430S0100000_25.l0).invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectWithMusicDownloadListener@4175.callTaskInMain$1");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS430S0100000_25(Object obj, Pair<String, Double> pair) {
        this.$t = pair;
        this.l0 = obj;
    }
}
