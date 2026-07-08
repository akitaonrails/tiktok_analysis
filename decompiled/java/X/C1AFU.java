package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AFU, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AFU extends C09AY implements Function0<String> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AFU(C1AXM c1axm) {
        super(0);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str;
        LinkUser linkUserLJIIJJI = this.LL.LJJZ().LJIIJJI(UserService.getInstance().user().getCurrentUserId());
        return (linkUserLJIIJJI == null || (str = linkUserLJIIJJI.linkMicId) == null) ? "" : str;
    }
}
