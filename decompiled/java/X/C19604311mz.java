package X;

import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19604311mz extends C2217421BqW implements Function1<SocialEmoji, Unit> {
    public C19604311mz(Object obj) {
        super(1, obj, C19604211my.class, "selectEmojiCallback", "selectEmojiCallback(Lcom/ss/android/ugc/aweme/social/sticker/model/SocialEmoji;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SocialEmoji socialEmoji) {
        ((C19604211my) this.receiver).LIZ(socialEmoji);
        return Unit.LIZ;
    }
}
