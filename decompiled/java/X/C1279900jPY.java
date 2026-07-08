package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jPY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279900jPY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;
    public final /* synthetic */ C1283480jVK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1279900jPY(C1276910jKj c1276910jKj, C1283480jVK c1283480jVK) {
        super(0);
        this.LL = c1276910jKj;
        this.LLILLJJLI = c1283480jVK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LinkMicRtcDispatcher linkMicRtcDispatcher = this.LL.LLJJLIIIJLLLLLLLZ;
        if (linkMicRtcDispatcher != null) {
            linkMicRtcDispatcher.LJJJJJL(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
