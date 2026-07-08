package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.AnalyticsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07hq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1934007hq extends C2217421BqW implements Function1<C07W5, Unit> {
    public C1934007hq(Object obj) {
        super(1, obj, AnalyticsVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/account/cell/AnalyticsCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07W5 c07w5) {
        C07W5 c07w52 = c07w5;
        AnalyticsVM analyticsVM = (AnalyticsVM) this.receiver;
        analyticsVM.getClass();
        if (c07w52 instanceof C07W4) {
            analyticsVM.vQ2(((C07W4) c07w52).LIZ);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
