package X;

import com.ss.android.ugc.aweme.compose.MentionFavoriteComposeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0hrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1220150hrB extends C2217421BqW implements Function0<Unit> {
    public C1220150hrB(MentionFavoriteComposeFragment mentionFavoriteComposeFragment) {
        super(0, mentionFavoriteComposeFragment, MentionFavoriteComposeFragment.class, "setupAutoRetry", "setupAutoRetry()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MentionFavoriteComposeFragment mentionFavoriteComposeFragment = (MentionFavoriteComposeFragment) this.receiver;
        if (mentionFavoriteComposeFragment.LLJJJJJIL == null) {
            mentionFavoriteComposeFragment.LLJJJJJIL = new C20509915Nh(new AwS563S0100000_19(mentionFavoriteComposeFragment, 3357), new AwS563S0100000_19(mentionFavoriteComposeFragment, 3358), false);
        }
        C20509915Nh c20509915Nh = mentionFavoriteComposeFragment.LLJJJJJIL;
        if (c20509915Nh != null) {
            c20509915Nh.LIZ();
        }
        return Unit.LIZ;
    }
}
