package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveParallelPullCostOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.PullSceneConfig;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1ACH, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACH extends C09AY implements Function1<C1306060k5k, Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ LivePreviewPlayerWidget LLILLJJLI;
    public final /* synthetic */ C238400w2 LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ PullSceneConfig LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ACH(C238400w2 c238400w2, LivePreviewPlayerWidget livePreviewPlayerWidget, C238400w2 c238400w22, C118300cf c118300cf, int i, String str, PullSceneConfig pullSceneConfig) {
        super(1);
        this.LL = c238400w2;
        this.LLILLJJLI = livePreviewPlayerWidget;
        this.LLILLL = c238400w22;
        this.LLILZ = c118300cf;
        this.LLILZIL = i;
        this.LLILZLL = str;
        this.LLIZ = pullSceneConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.bytedance.android.livesdk.livesetting.linkmic.PullSceneConfig] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1306060k5k c1306060k5k) {
        int iIntValue;
        Object obj;
        boolean z;
        PullSceneConfig multidimensionalConfig;
        C1306060k5k c1306060k5k2 = c1306060k5k;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C118300cf c118300cf = new C118300cf();
        Object obj2 = c1306060k5k2.LIZ;
        T t = 0;
        if (obj2 == null) {
            obj2 = null;
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c118300cf.element = iIntValue;
        Map<String, ? extends Object> map = c1306060k5k2.LIZJ;
        if (map != null) {
            obj = map.get("traffic_tag");
        } else {
            obj = null;
        }
        long j = jUptimeMillis - this.LL.element;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result: ");
        sbLIZ.append(obj);
        sbLIZ.append("   ");
        sbLIZ.append(c118300cf.element);
        sbLIZ.append("  ,duration:");
        sbLIZ.append(j);
        C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (obj == null) {
            C1AC7 c1ac7 = C1AC7.LIZ;
            C1ACA c1acaZ1 = this.LLILLJJLI.z1();
            EnumC1488280ope enumC1488280ope = EnumC1488280ope.ERR_STARSHIP_STRATEGY;
            long j2 = this.LLILLL.element;
            int i = this.LLILZ.element;
            int i2 = c118300cf.element;
            c1ac7.getClass();
            C1AC7.LJII(c1acaZ1, enumC1488280ope, j2, j, i, i2, null);
            this.LLILLJJLI.P1();
        } else {
            if (this.LLILZIL == 1) {
                z = true;
            } else {
                z = false;
            }
            C259800zU c259800zU = new C259800zU();
            LiveParallelPullCostOpt liveParallelPullCostOpt = LiveParallelPullCostOpt.INSTANCE;
            ?? pullSceneConfig = liveParallelPullCostOpt.getPullSceneConfig(z, c118300cf.element, obj.toString());
            c259800zU.element = pullSceneConfig;
            if (pullSceneConfig != 0) {
                multidimensionalConfig = liveParallelPullCostOpt.getMultidimensionalConfig(pullSceneConfig, this.LLILZLL);
            } else {
                multidimensionalConfig = null;
            }
            PullSceneConfig pullSceneConfig2 = this.LLIZ;
            if (pullSceneConfig2 == null || pullSceneConfig2.getTrafficControl() != 1 || c259800zU.element != 0) {
                if (multidimensionalConfig == null) {
                    PullSceneConfig pullSceneConfig3 = this.LLIZ;
                    t = pullSceneConfig3;
                    if (pullSceneConfig3 == null) {
                        t = c259800zU.element;
                    }
                } else {
                    t = multidimensionalConfig;
                }
            }
            c259800zU.element = t;
            FeedLiveViewHolderVM feedLiveViewHolderVMP1 = this.LLILLJJLI.P1();
            if (feedLiveViewHolderVMP1 != null) {
                feedLiveViewHolderVMP1.LLLFF = C1ACS.TRAFFIC_CONTROL;
            }
            PullSceneConfig pullSceneConfig4 = (PullSceneConfig) c259800zU.element;
            if (pullSceneConfig4 != null && pullSceneConfig4.getEnable() == 1) {
                C0CNO.LIZLLL(0L, new C1ACP(this.LLILLJJLI, this.LLILLL, j, this.LLILZ, c118300cf, obj, c259800zU));
            } else {
                C1AC7 c1ac72 = C1AC7.LIZ;
                C1ACA c1acaZ12 = this.LLILLJJLI.z1();
                EnumC1488280ope enumC1488280ope2 = EnumC1488280ope.ERR_NO_CONFIG;
                long j3 = this.LLILLL.element;
                int i3 = this.LLILZ.element;
                int i4 = c118300cf.element;
                String string = obj.toString();
                c1ac72.getClass();
                C1AC7.LJII(c1acaZ12, enumC1488280ope2, j3, j, i3, i4, string);
                this.LLILLJJLI.P1();
            }
        }
        return Unit.LIZ;
    }
}
