package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0s0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610510s0n extends C09AY implements Function2<FeedAvatarDefaultAssem, C291001Au<? extends Integer>, Unit> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1610510s0n(boolean z) {
        super(2);
        this.LL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FeedAvatarDefaultAssem feedAvatarDefaultAssem, C291001Au<? extends Integer> c291001Au) {
        FeedAvatarDefaultAssem feedAvatarDefaultAssem2 = feedAvatarDefaultAssem;
        int iIntValue = ((Number) c291001Au.LIZ).intValue();
        if (!this.LL) {
            feedAvatarDefaultAssem2.up(iIntValue);
            if (C0BKH.LIZ()) {
                feedAvatarDefaultAssem2.Ap(C1AV3.LIZ(6, "Feed", null, "avatar"));
            }
        }
        return Unit.LIZ;
    }
}
