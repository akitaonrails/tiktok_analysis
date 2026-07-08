package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.ClearCacheVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.07v9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2016507v9 extends C2217421BqW implements Function1<InterfaceC1871407Uq, Unit> {
    public C2016507v9(Object obj) {
        super(1, obj, ClearCacheVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/cache/cell/ClearCacheCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1871407Uq interfaceC1871407Uq) {
        InterfaceC1871407Uq interfaceC1871407Uq2 = interfaceC1871407Uq;
        ClearCacheVM clearCacheVM = (ClearCacheVM) this.receiver;
        clearCacheVM.getClass();
        if (interfaceC1871407Uq2 instanceof C1871307Up) {
            Context context = ((C1871307Up) interfaceC1871407Uq2).LIZ;
            clearCacheVM.withState(new AwS582S0100000_3(clearCacheVM, 152));
            SmartRouter.buildRoute(context, "//setting/diskmanager_compose").open();
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
