package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508700JxE extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ AbsPrivilegeDetailBaseFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508700JxE(AbsPrivilegeDetailBaseFragment absPrivilegeDetailBaseFragment) {
        super(1);
        this.LL = absPrivilegeDetailBaseFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C16FS c16fs;
        String str2 = this.LL.LLILZIL;
        if (str2 == null) {
            str2 = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_privilege_sub_page_click");
        c474500IjALIZ.LJJII(str, "page_type");
        c474500IjALIZ.LJJII(str2, "show_entrance");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        AbsPrivilegeDetailBaseFragment absPrivilegeDetailBaseFragment = this.LL;
        if (absPrivilegeDetailBaseFragment.LLILLL == EnumC507490JvH.POPUP) {
            c16fs = absPrivilegeDetailBaseFragment.LLJJLIIIJLLLLLLLZ;
        } else {
            c16fs = absPrivilegeDetailBaseFragment.LLJLIL;
        }
        if (c16fs != null) {
            c16fs.performClick();
        }
        return Unit.LIZ;
    }
}
