package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.DataSaverVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1928507gx extends C2217421BqW implements Function1<InterfaceC1871607Us, Unit> {
    public C1928507gx(Object obj) {
        super(1, obj, DataSaverVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/cache/cell/DataSaverCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1871607Us interfaceC1871607Us) {
        InterfaceC1871607Us interfaceC1871607Us2 = interfaceC1871607Us;
        DataSaverVM dataSaverVM = (DataSaverVM) this.receiver;
        dataSaverVM.getClass();
        if (interfaceC1871607Us2 instanceof C1871507Ur) {
            dataSaverVM.vQ2(((C1871507Ur) interfaceC1871607Us2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
