package X;

import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0m7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1384280m7u extends C2217421BqW implements InterfaceC1631620sYq<Integer, Float, Float, Unit> {
    public C1384280m7u(DanmakuViewModel danmakuViewModel) {
        super(3, danmakuViewModel, DanmakuViewModel.class, "onDrawCostCallback", "onDrawCostCallback(IFF)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Float f, Float f2) {
        int iIntValue = num.intValue();
        ((DanmakuViewModel) this.receiver).GQ2(f.floatValue(), f2.floatValue(), iIntValue);
        return Unit.LIZ;
    }
}
