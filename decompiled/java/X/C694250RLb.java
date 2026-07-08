package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694250RLb extends C09AY implements Function0<String> {
    public final /* synthetic */ FeedAvatarDefaultAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C694250RLb(FeedAvatarDefaultAssem feedAvatarDefaultAssem) {
        super(0);
        this.LL = feedAvatarDefaultAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        FeedAvatarDefaultAssem.LLLJIL.getClass();
        sbLIZ.append(FeedAvatarDefaultAssem.LLLL);
        sbLIZ.append('_');
        sbLIZ.append(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme().getAid());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
