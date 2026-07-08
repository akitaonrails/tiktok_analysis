package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.WhatsNewCellVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1927107gj extends C2217421BqW implements Function1<InterfaceC1874607Vw, Unit> {
    public C1927107gj(Object obj) {
        super(1, obj, WhatsNewCellVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/support/cells/WhatsNewCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1874607Vw interfaceC1874607Vw) {
        InterfaceC1874607Vw interfaceC1874607Vw2 = interfaceC1874607Vw;
        WhatsNewCellVM whatsNewCellVM = (WhatsNewCellVM) this.receiver;
        whatsNewCellVM.getClass();
        if (interfaceC1874607Vw2 instanceof C1874507Vv) {
            whatsNewCellVM.vQ2(((C1874507Vv) interfaceC1874607Vw2).LIZ);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
