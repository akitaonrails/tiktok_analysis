package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0f0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1110820f0q extends C2217421BqW implements Function1<BadgeStruct, Unit> {
    public C1110820f0q(AbstractC1110800f0o abstractC1110800f0o) {
        super(1, abstractC1110800f0o, AbstractC1110790f0n.class, "onBadgeShow", "onBadgeShow(Lcom/bytedance/android/live/base/model/user/BadgeStruct;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BadgeStruct badgeStruct) {
        ((AbstractC1110790f0n) this.receiver).LLILZ(badgeStruct);
        return Unit.LIZ;
    }
}
