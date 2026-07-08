package X;

import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zKo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1892000zKo extends C2217421BqW implements Function1<SocialEmoji, Unit> {
    public C1892000zKo(Object obj) {
        super(1, obj, C1891990zKn.class, "emojiSelected", "emojiSelected(Lcom/ss/android/ugc/aweme/social/sticker/model/SocialEmoji;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SocialEmoji socialEmoji) {
        SocialEmoji socialEmoji2 = socialEmoji;
        ((C1891990zKn) this.receiver).LIZJ.invoke(socialEmoji2);
        Intrinsics.LJFF(socialEmoji2.emoji, "😍");
        return Unit.LIZ;
    }
}
