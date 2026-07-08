package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.DisplayVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07j1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1941307j1 extends C2217421BqW implements Function1<C07VS, Unit> {
    public C1941307j1(Object obj) {
        super(1, obj, DisplayVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/DisplayCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VS c07vs) {
        C07VS c07vs2 = c07vs;
        this.receiver.getClass();
        if (c07vs2 instanceof C07VR) {
            Context context = ((C07VR) c07vs2).LIZ;
            if (context != null) {
                SmartRouter.buildRoute(context, "aweme://setting/theme").open();
            }
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
