package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.trace.BasePerfData;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.trace.BasePerfRecorder;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DhF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262631DhF extends C09AY implements Function0<BasePerfData> {
    public final /* synthetic */ BasePerfRecorder LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262631DhF(BasePerfRecorder basePerfRecorder) {
        super(0);
        this.LL = basePerfRecorder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BasePerfData invoke() {
        return new BasePerfData(this.LL.LIZ, BasePerfRecorder.LJIIJJI.getValue().intValue(), BasePerfRecorder.LJIIL.getValue().intValue());
    }
}
