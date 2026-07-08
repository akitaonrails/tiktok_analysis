package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.GetModeratorPinInfoResponse;

/* JADX INFO: renamed from: X.0Jws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508480Jws extends C09AY implements Function1<GetModeratorPinInfoResponse.Data, Unit> {
    public final /* synthetic */ PrivilegeDetailViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508480Jws(PrivilegeDetailViewModel privilegeDetailViewModel) {
        super(1);
        this.LL = privilegeDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GetModeratorPinInfoResponse.Data data) {
        this.LL.LLJJJJJIL.setValue(data.tip);
        return Unit.LIZ;
    }
}
