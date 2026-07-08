package X;

import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.LiteModeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1941107iz extends C2217421BqW implements Function1<InterfaceC1871807Uu, Unit> {
    public C1941107iz(Object obj) {
        super(1, obj, LiteModeVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/cache/cell/LiteModeCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1871807Uu interfaceC1871807Uu) {
        InterfaceC1871807Uu interfaceC1871807Uu2 = interfaceC1871807Uu;
        this.receiver.getClass();
        if (interfaceC1871807Uu2 instanceof C1871707Ut) {
            SmartRouter.buildRoute(((C1871707Ut) interfaceC1871807Uu2).LIZ, "aweme://settings/lite_mode?enter_from=settings").open();
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
