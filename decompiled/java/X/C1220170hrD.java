package X;

import com.ss.android.ugc.aweme.compose.MentionFavoriteComposeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1220170hrD extends C2217421BqW implements Function0<Unit> {
    public C1220170hrD(MentionFavoriteComposeFragment mentionFavoriteComposeFragment) {
        super(0, mentionFavoriteComposeFragment, MentionFavoriteComposeFragment.class, "releaseAutoRetry", "releaseAutoRetry()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MentionFavoriteComposeFragment mentionFavoriteComposeFragment = (MentionFavoriteComposeFragment) this.receiver;
        C20509915Nh c20509915Nh = mentionFavoriteComposeFragment.LLJJJJJIL;
        if (c20509915Nh != null) {
            c20509915Nh.LIZIZ();
        }
        mentionFavoriteComposeFragment.LLJJJJJIL = null;
        return Unit.LIZ;
    }
}
