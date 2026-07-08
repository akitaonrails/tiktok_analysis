package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.AboutCellVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1928007gs extends C2217421BqW implements Function1<InterfaceC1873007Vg, Unit> {
    public C1928007gs(Object obj) {
        super(1, obj, AboutCellVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/support/cells/AboutCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1873007Vg interfaceC1873007Vg) {
        InterfaceC1873007Vg interfaceC1873007Vg2 = interfaceC1873007Vg;
        AboutCellVM aboutCellVM = (AboutCellVM) this.receiver;
        aboutCellVM.getClass();
        if (interfaceC1873007Vg2 instanceof C1872907Vf) {
            aboutCellVM.vQ2(((C1872907Vf) interfaceC1873007Vg2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
