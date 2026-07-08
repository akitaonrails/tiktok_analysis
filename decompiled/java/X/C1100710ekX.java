package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveHostPerfAutoAdaptiveConfig;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostPerfAutoAdaptiveSetting;
import com.bytedance.android.livesdk.livesetting.performance.Metrics2BizMapping;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ekX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100710ekX implements InterfaceC381401e0<Unit, List<? extends AbstractC405501ht>> {
    public static final Map<Integer, String> LJIILL = C2097608Jq.LJIIIIZZ(new Pair(1, "host_normal"), new Pair(2, "multi_guest"), new Pair(3, "effect_insert"), new Pair(4, "guide_animation"), new Pair(5, "like_boom"), new Pair(6, "self_like_bottom"), new Pair(8, "self_like_avatar"), new Pair(10, "consume_normal"), new Pair(11, "publish_screen_refresh"), new Pair(12, "publish_screen_animation"), new Pair(13, "alog"), new Pair(14, "apm_log"), new Pair(16, "audience_rank_refresh"));
    public final C1100730ekZ LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Function1<Unit, List<AbstractC405501ht>> LIZLLL;
    public final LiveHostPerfAutoAdaptiveConfig LJ;
    public final int LJFF;
    public final int LJI;
    public List<Metrics2BizMapping> LJII;
    public List<Metrics2BizMapping> LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public String LJIILIIL;
    public long LJIILJJIL;

    @Override // X.InterfaceC381401e0
    public final String getContext() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC381401e0
    public final int getType() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List LIZIZ(List list) {
        if (((Number) C13LP.LJJJJZI(list)).intValue() >= ((Number) C13LP.LJJLIIIJJI(list)).intValue()) {
            return C1697810uHb.LJIIJJI(C13LP.LJJLIIIJJI(list), C13LP.LJJJJZI(list));
        }
        return list;
    }

    /* JADX WARN: Path cross not found for [B:213:0x03b9, B:238:0x0454], limit reached: 328 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0537  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0074 -> B:11:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn r16) {
        /*
            Method dump skipped, instruction units count: 1505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1100710ekX.LIZJ(X.05Vn):java.lang.Object");
    }

    public C1100710ekX(C1100730ekZ c1100730ekZ, C5183020f c5183020f) {
        int iOrdinal = EnumC405401hs.TRIGGER_ALGORITHM.ordinal();
        this.LIZ = c1100730ekZ;
        this.LIZIZ = iOrdinal;
        this.LIZJ = "IO";
        this.LIZLLL = c5183020f;
        LiveHostPerfAutoAdaptiveConfig value = LiveHostPerfAutoAdaptiveSetting.getValue();
        this.LJ = value;
        int i = value.continuousCollectMetricsCount;
        this.LJFF = value.upgradeThreshold * i;
        this.LJI = i * value.downgradeThreshold;
        this.LJIIIZ = 1;
        this.LJIIJ = 100;
        this.LJIILIIL = "start";
    }

    @Override // X.InterfaceC381401e0
    public final /* bridge */ /* synthetic */ Object LIZ(Unit unit, InterfaceC1364105Vn<? super List<? extends AbstractC405501ht>> interfaceC1364105Vn) {
        return LIZJ(interfaceC1364105Vn);
    }
}
