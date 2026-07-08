package X;

import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ShortcutManagerVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07j0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1941207j0 extends C2217421BqW implements Function1<C07VO, Unit> {
    public C1941207j0(Object obj) {
        super(1, obj, ShortcutManagerVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/ShortcutManagerCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VO c07vo) {
        C07VO c07vo2 = c07vo;
        this.receiver.getClass();
        if (c07vo2 instanceof C07VN) {
            SmartRouter.buildRoute(((C07VN) c07vo2).LIZ, "aweme://setting/shortcut").open();
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
