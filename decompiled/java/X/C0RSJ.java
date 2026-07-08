package X;

import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RSJ extends C09AY implements Function0<C690870R8b> {
    public final /* synthetic */ EmojiAnimAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RSJ(EmojiAnimAssem emojiAnimAssem) {
        super(0);
        this.LL = emojiAnimAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C690870R8b invoke() {
        EmojiAnimAssem emojiAnimAssem = this.LL;
        return ((C690430R6j) new C1559260qg8(new C723590SZx(emojiAnimAssem, C690430R6j.class, null), emojiAnimAssem.checkSupervisorPrepared()).getValue()).LL;
    }
}
