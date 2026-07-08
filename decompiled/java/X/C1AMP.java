package X;

import com.bytedance.lynx.media.AbsMediaEngineView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AMP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AMP extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbsMediaEngineView<C1AML> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AMP(AbsMediaEngineView<C1AML> absMediaEngineView) {
        super(0);
        this.LL = absMediaEngineView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.sendEvent("error", C2097608Jq.LJI(new Pair("errorMsg", "success convert resource url error"), new Pair("errorCode", -1)));
        return Unit.LIZ;
    }
}
