package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ActivityCenterVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07h3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1929107h3 extends C2217421BqW implements Function1<C07V2, Unit> {
    public C1929107h3(Object obj) {
        super(1, obj, ActivityCenterVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/ActivityCenterCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07V2 c07v2) {
        C07V2 c07v22 = c07v2;
        ActivityCenterVM activityCenterVM = (ActivityCenterVM) this.receiver;
        activityCenterVM.getClass();
        if (c07v22 instanceof C07V1) {
            activityCenterVM.vQ2(((C07V1) c07v22).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
