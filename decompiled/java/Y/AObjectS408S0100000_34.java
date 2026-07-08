package Y;

import X.C098200Yq;
import X.C09KV;
import X.C09KW;
import X.C13LP;
import X.C15438062q;
import X.C1782370wTz;
import X.C189200o6;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2216431Bov;
import X.C2217561Bqk;
import X.C2219681BuA;
import X.C2220051Bul;
import X.C2220081Buo;
import X.C2220251Bv5;
import X.C2221081BwQ;
import X.C2221091BwR;
import X.C2229261CMy;
import X.C2239211CkZ;
import X.EnumC2221171BwZ;
import X.EnumC2221181Bwa;
import com.bytedance.ies.nle.editor_jni.DynamicLightWaveUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailPageFragment;
import com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AiVideoViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS408S0100000_34 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS408S0100000_34 aObjectS408S0100000_34) {
        ((C2219681BuA) aObjectS408S0100000_34.l0).LJLILLLLZI();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS408S0100000_34 aObjectS408S0100000_34) {
        ((C2219681BuA) aObjectS408S0100000_34.l0).LJLILLLLZI();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS408S0100000_34 aObjectS408S0100000_34) {
        C2216431Bov c2216431Bov = (C2216431Bov) aObjectS408S0100000_34.l0;
        if (c2216431Bov.LJFF) {
            return c2216431Bov.LJ;
        }
        return c2216431Bov.LIZ;
    }

    public static final Object invoke$11(AObjectS408S0100000_34 aObjectS408S0100000_34) {
        C2217561Bqk c2217561Bqk = (C2217561Bqk) aObjectS408S0100000_34.l0;
        Function0<Unit> function0 = c2217561Bqk.LIZ;
        if (function0 != null) {
            function0.invoke();
        }
        c2217561Bqk.LIZ = null;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS408S0100000_34 aObjectS408S0100000_34) {
        ((C2219681BuA) aObjectS408S0100000_34.l0).LJLILLLLZI();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS408S0100000_34 aObjectS408S0100000_34) {
        Object c098200Yq;
        C2221081BwQ c2221081BwQ = (C2221081BwQ) aObjectS408S0100000_34.l0;
        c2221081BwQ.getClass();
        try {
            C09KV c09kv = c2221081BwQ.LJI;
            if (c09kv == null) {
                c09kv = null;
            }
            List<C09KW> listLJLLLL = C13LP.LJLLLL(new AComparatorS22S0000000_3(2), c09kv.LIZ(new AObjectS376S0100000_34(c2221081BwQ, 1)));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
            for (C09KW c09kw : listLJLLLL) {
                arrayList.add(C2097608Jq.LJII(new Pair("filePath", c09kw.LIZ), new Pair("size", Long.valueOf(c2221081BwQ.LJLILLLLZI(c09kw.LIZ, EnumC2221181Bwa.LL).length())), new Pair("createTime", Long.valueOf(c09kw.LIZIZ))));
            }
            c098200Yq = C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("fileList", arrayList)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            return C2221081BwQ.LJLJL(thM5exceptionOrNullimpl, null);
        }
        return c098200Yq;
    }

    public static final Object invoke$4(AObjectS408S0100000_34 aObjectS408S0100000_34) {
        Object c098200Yq;
        C2221091BwR c2221091BwR = (C2221091BwR) aObjectS408S0100000_34.l0;
        c2221091BwR.getClass();
        try {
            C09KV c09kv = c2221091BwR.LJI;
            if (c09kv == null) {
                c09kv = null;
            }
            List<C09KW> listLJLLLL = C13LP.LJLLLL(new AComparatorS22S0000000_3(1), c09kv.LIZ(new AObjectS376S0100000_34(c2221091BwR, 0)));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
            for (C09KW c09kw : listLJLLLL) {
                arrayList.add(C2097608Jq.LJII(new Pair("filePath", c09kw.LIZ), new Pair("size", Long.valueOf(c2221091BwR.LJLIIIL(c09kw.LIZ, EnumC2221171BwZ.LL).length())), new Pair("createTime", Long.valueOf(c09kw.LIZIZ))));
            }
            c098200Yq = C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("fileList", arrayList)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            return C2221091BwR.LJLJJI(thM5exceptionOrNullimpl, null);
        }
        return c098200Yq;
    }

    public static final Object invoke$5(AObjectS408S0100000_34 aObjectS408S0100000_34) {
        ((Function0) aObjectS408S0100000_34.l0).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS408S0100000_34 aObjectS408S0100000_34) {
        return new C2220051Bul(((C2220081Buo) aObjectS408S0100000_34.l0).LIZ);
    }

    public static final Object invoke$7(AObjectS408S0100000_34 aObjectS408S0100000_34) {
        return new AiVideoViewModel(((TakoAiVideoDetailPageFragment) aObjectS408S0100000_34.l0).LLJJ);
    }

    public static final Object invoke$8(AObjectS408S0100000_34 aObjectS408S0100000_34) {
        C2239211CkZ c2239211CkZ = (C2239211CkZ) aObjectS408S0100000_34.l0;
        Pair pairLIZJ = C2229261CMy.LIZJ(c2239211CkZ.LIZJ.LIZIZ);
        float fIntValue = ((Number) pairLIZJ.getFirst()).intValue();
        float f = 1080.0f / fIntValue;
        float fIntValue2 = ((Number) pairLIZJ.getSecond()).intValue();
        float f2 = 1080.0f / fIntValue2;
        if (f > f2) {
            f = f2;
        }
        Pair pair = new Pair(Integer.valueOf((int) (fIntValue * f)), Integer.valueOf((int) (fIntValue2 * f)));
        long jIntValue = ((Number) pair.getFirst()).intValue();
        long jIntValue2 = ((Number) pair.getSecond()).intValue();
        C1782370wTz c1782370wTz = c2239211CkZ.LIZJ;
        return new DynamicLightWaveUtil(jIntValue, jIntValue2, ((long) LSPassThroughRecordSizeConfig.DEFAULT) * ((long) c1782370wTz.LIZIZ.LJ), c1782370wTz.LIZ, c2239211CkZ.LIZIZ);
    }

    public static final Object invoke$9(AObjectS408S0100000_34 aObjectS408S0100000_34) {
        C2216431Bov c2216431Bov = (C2216431Bov) aObjectS408S0100000_34.l0;
        if (c2216431Bov.LJFF) {
            return c2216431Bov.LJ;
        }
        return c2216431Bov.LIZ;
    }

    public AObjectS408S0100000_34(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
