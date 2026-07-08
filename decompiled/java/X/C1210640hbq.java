package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS127S0101000_19;

/* JADX INFO: renamed from: X.0hbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210640hbq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C1211030hcT LLILLJJLI;
    public final /* synthetic */ InterfaceC1219340hps LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1210640hbq(int i, int i2, InterfaceC1219340hps interfaceC1219340hps, C1211030hcT c1211030hcT, String str) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = c1211030hcT;
        this.LLILLL = interfaceC1219340hps;
        this.LLILZ = str;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Pair pair = (Pair) ((LinkedHashMap) C052400Ha.LIZ).get(Integer.valueOf(this.LL));
        if (pair != null) {
            this.LLILLJJLI.LIZ(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), Mp4ScreenVideoLoadTimeout.CONTROL, new AwS127S0101000_19(this.LLILLL, this.LLILZ, this.LLILZIL, 10));
        }
        return Unit.LIZ;
    }
}
