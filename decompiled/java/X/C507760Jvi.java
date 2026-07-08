package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jvi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507760Jvi extends C09AY implements Function0<C507660JvY> {
    public final /* synthetic */ PrivilegeDetailViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507760Jvi(PrivilegeDetailViewModel privilegeDetailViewModel) {
        super(0);
        this.LL = privilegeDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C507660JvY invoke() {
        return new C507660JvY(this.LL);
    }
}
