package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ScreenTimeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.07uW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2012607uW extends C2217421BqW implements Function1<C07VK, Unit> {
    public C2012607uW(Object obj) {
        super(1, obj, ScreenTimeVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/ScreenTimeCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VK c07vk) {
        C07VK c07vk2 = c07vk;
        ScreenTimeVM screenTimeVM = (ScreenTimeVM) this.receiver;
        screenTimeVM.getClass();
        if (c07vk2 instanceof C07VJ) {
            screenTimeVM.vQ2(((C07VJ) c07vk2).LIZ, "settings_page");
            screenTimeVM.setState(new AwS582S0100000_3(screenTimeVM, 161));
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
