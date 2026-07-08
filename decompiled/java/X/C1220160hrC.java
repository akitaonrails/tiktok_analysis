package X;

import com.ss.android.ugc.aweme.compose.MentionFavoriteComposeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1220160hrC extends C2217421BqW implements Function0<Unit> {
    public C1220160hrC(MentionFavoriteComposeFragment mentionFavoriteComposeFragment) {
        super(0, mentionFavoriteComposeFragment, MentionFavoriteComposeFragment.class, "manualRetry", "manualRetry()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MentionFavoriteComposeFragment mentionFavoriteComposeFragment = (MentionFavoriteComposeFragment) this.receiver;
        mentionFavoriteComposeFragment.VR().xQ2(false);
        mentionFavoriteComposeFragment.VR().manualListRefresh();
        return Unit.LIZ;
    }
}
