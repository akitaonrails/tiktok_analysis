package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.ShareProfileVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1927707gp extends C2217421BqW implements Function1<InterfaceC1870807Uk, Unit> {
    public C1927707gp(Object obj) {
        super(1, obj, ShareProfileVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/account/cell/ShareProfileCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1870807Uk interfaceC1870807Uk) {
        InterfaceC1870807Uk interfaceC1870807Uk2 = interfaceC1870807Uk;
        ShareProfileVM shareProfileVM = (ShareProfileVM) this.receiver;
        shareProfileVM.getClass();
        if (interfaceC1870807Uk2 instanceof C1870707Uj) {
            shareProfileVM.vQ2(((C1870707Uj) interfaceC1870807Uk2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
