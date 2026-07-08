package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0s0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610540s0q extends C09AY implements Function2<FeedAvatarDefaultAssem, C291001Au<? extends Integer>, Unit> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1610540s0q(boolean z) {
        super(2);
        this.LL = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FeedAvatarDefaultAssem feedAvatarDefaultAssem, C291001Au<? extends Integer> c291001Au) {
        FeedAvatarDefaultAssem feedAvatarDefaultAssem2 = feedAvatarDefaultAssem;
        if (c291001Au != null && !this.LL) {
            feedAvatarDefaultAssem2.Ap(C1AV3.LIZ(3, "Feed", null, "avatar"));
        }
        return Unit.LIZ;
    }
}
