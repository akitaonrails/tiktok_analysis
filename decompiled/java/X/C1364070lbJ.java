package X;

import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelHeadPowerCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1364070lbJ extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1364070lbJ(Object obj) {
        super(1, obj, SharePanelHeadPowerCell.class, "onStreakBadgeViewVisibilityChanged", "onStreakBadgeViewVisibilityChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((SharePanelHeadPowerCell) this.receiver).b6(bool.booleanValue());
        return Unit.LIZ;
    }
}
