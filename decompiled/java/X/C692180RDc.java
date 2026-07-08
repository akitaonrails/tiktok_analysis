package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692180RDc extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ FeedAvatarAssemWrap LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C692180RDc(FeedAvatarAssemWrap feedAvatarAssemWrap) {
        super(1);
        this.LL = feedAvatarAssemWrap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        if (this.LL.Ep()) {
            c0rta2.LLJI = R.id.bj1;
        } else {
            c0rta2.LLJILJIL = this.LL.getContentView();
        }
        c0rta2.LLILLL = C13LE.LIZ(FeedAvatarSocialPublishAssem.class);
        c0rta2.LLILZIL = C694070RKj.LIZIZ;
        return Unit.LIZ;
    }
}
