package X;

import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0m7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1384270m7t extends C2217421BqW implements Function2<Integer, Float, Unit> {
    public C1384270m7t(DanmakuViewModel danmakuViewModel) {
        super(2, danmakuViewModel, DanmakuViewModel.class, "computeCostCallback", "computeCostCallback(IF)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Float f) {
        int iIntValue = num.intValue();
        ((DanmakuViewModel) this.receiver).wQ2(f.floatValue(), iIntValue);
        return Unit.LIZ;
    }
}
