package X;

import androidx.fragment.app.Fragment;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAssem;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618600sDq extends C09AY implements Function0<C1618510sDh> {
    public final /* synthetic */ NoticeAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1618600sDq(NoticeAssem noticeAssem) {
        super(0);
        this.LL = noticeAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1618510sDh invoke() {
        Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
        if (fragmentLJI instanceof InterfaceC1618570sDn) {
            return new C1618510sDh((AbsFragment) fragmentLJI, (TabChangeManager) this.LL.LLJI.getValue(), (ScrollSwitchStateManager) this.LL.LLJIJIL.getValue());
        }
        return null;
    }
}
