package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.CheckUpdateSettingsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1926807gg extends C2217421BqW implements Function1<InterfaceC1871207Uo, Unit> {
    public C1926807gg(Object obj) {
        super(1, obj, CheckUpdateSettingsVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/cache/cell/CheckUpdateCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1871207Uo interfaceC1871207Uo) {
        InterfaceC1871207Uo interfaceC1871207Uo2 = interfaceC1871207Uo;
        CheckUpdateSettingsVM checkUpdateSettingsVM = (CheckUpdateSettingsVM) this.receiver;
        checkUpdateSettingsVM.getClass();
        if (interfaceC1871207Uo2 instanceof C1871107Un) {
            checkUpdateSettingsVM.vQ2(((C1871107Un) interfaceC1871207Uo2).LIZ);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
