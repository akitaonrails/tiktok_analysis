package X;

import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.MusicVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07j2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1941407j2 extends C2217421BqW implements Function1<C07V8, Unit> {
    public C1941407j2(Object obj) {
        super(1, obj, MusicVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/MusicCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07V8 c07v8) {
        C07V8 c07v82 = c07v8;
        this.receiver.getClass();
        if (c07v82 instanceof C07V7) {
            SmartRouter.buildRoute(((C07V7) c07v82).LIZ, "//settings/music").open();
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
