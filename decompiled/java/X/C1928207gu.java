package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.top.cell.ManagePostsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1928207gu extends C2217421BqW implements Function1<InterfaceC1874807Vy, Unit> {
    public C1928207gu(Object obj) {
        super(1, obj, ManagePostsVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/top/cell/ManagePostsCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1874807Vy interfaceC1874807Vy) {
        InterfaceC1874807Vy interfaceC1874807Vy2 = interfaceC1874807Vy;
        ManagePostsVM managePostsVM = (ManagePostsVM) this.receiver;
        managePostsVM.getClass();
        if (interfaceC1874807Vy2 instanceof C1874707Vx) {
            managePostsVM.vQ2(((C1874707Vx) interfaceC1874807Vy2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
