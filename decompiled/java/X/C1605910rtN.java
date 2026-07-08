package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1605910rtN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ FeedAvatarSocialPublishAssem LLILLJJLI;
    public final /* synthetic */ InterfaceC1398730mVD LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605910rtN(long j, FeedAvatarSocialPublishAssem feedAvatarSocialPublishAssem, InterfaceC1398730mVD interfaceC1398730mVD) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = feedAvatarSocialPublishAssem;
        this.LLILLL = interfaceC1398730mVD;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C054G c054g = C336601Si.LIZ;
        C336601Si.LIZ("preload_start", this.LL, ((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).getAweme(), null, null, null, 56);
        this.LLILLL.LJIIZILJ();
        return Unit.LIZ;
    }
}
