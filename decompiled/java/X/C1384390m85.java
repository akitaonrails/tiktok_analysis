package X;

import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0m85, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1384390m85 extends C2217421BqW implements Function1<Float, Unit> {
    public C1384390m85(DanmakuViewModel danmakuViewModel) {
        super(1, danmakuViewModel, DanmakuViewModel.class, "frameIntervalCallback", "frameIntervalCallback(F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        ((DanmakuViewModel) this.receiver).yQ2(f.floatValue());
        return Unit.LIZ;
    }
}
