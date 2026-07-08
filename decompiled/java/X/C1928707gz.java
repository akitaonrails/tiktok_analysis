package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LiveVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1928707gz extends C2217421BqW implements Function1<C07V4, Unit> {
    public C1928707gz(Object obj) {
        super(1, obj, LiveVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/LiveCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07V4 c07v4) {
        C07V4 c07v42 = c07v4;
        LiveVM liveVM = (LiveVM) this.receiver;
        liveVM.getClass();
        if (c07v42 instanceof C07V3) {
            liveVM.vQ2(((C07V3) c07v42).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
