package X;

import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11n0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19604411n0 extends C2217421BqW implements Function1<SocialEmoji, Unit> {
    public C19604411n0(Object obj) {
        super(1, obj, C19604911n5.class, "selectEmojiCallback", "selectEmojiCallback(Lcom/ss/android/ugc/aweme/social/sticker/model/SocialEmoji;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SocialEmoji socialEmoji) {
        ((C19604911n5) this.receiver).LIZ(socialEmoji);
        return Unit.LIZ;
    }
}
