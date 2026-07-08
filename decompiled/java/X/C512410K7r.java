package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0K7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512410K7r extends C09AY implements Function2<String, String, Unit> {
    public final /* synthetic */ SubPrivilegeDetailFullPage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512410K7r(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage) {
        super(2);
        this.LL = subPrivilegeDetailFullPage;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage = this.LL;
        subPrivilegeDetailFullPage.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_privilege_share");
        c474500IjALIZ.LJJII(subPrivilegeDetailFullPage.LLJJIII, "show_entrance");
        c474500IjALIZ.LJJII(str, "share_platform");
        c474500IjALIZ.LJJII(str2, "to_user_id");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
