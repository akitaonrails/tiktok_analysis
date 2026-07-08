package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512420K7s extends C09AY implements Function1<C495520Jby, C495520Jby> {
    public final /* synthetic */ SubPrivilegeDetailFullPage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512420K7s(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage) {
        super(1);
        this.LL = subPrivilegeDetailFullPage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C495520Jby invoke(C495520Jby c495520Jby) {
        C495520Jby c495520Jby2 = c495520Jby;
        c495520Jby2.LIZJ("sec_anchor_id", this.LL.LLJJIJIIJIL);
        return c495520Jby2;
    }
}
