package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AY0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AY0 extends C09AY implements Function1<PosIdentity, Boolean> {
    public final /* synthetic */ LinkUser LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AY0(LinkUser linkUser) {
        super(1);
        this.LL = linkUser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(PosIdentity posIdentity) {
        return Boolean.valueOf(posIdentity.LIZJ(this.LL.getActualLinkMicId()));
    }
}
