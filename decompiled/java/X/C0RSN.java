package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.longpressanim.LongPressEmojiAnimAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RSN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RSN extends C09AY implements Function0<IVideoCommentAbility> {
    public final /* synthetic */ LongPressEmojiAnimAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RSN(LongPressEmojiAnimAssem longPressEmojiAnimAssem) {
        super(0);
        this.LL = longPressEmojiAnimAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IVideoCommentAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IVideoCommentAbility.class, null);
    }
}
