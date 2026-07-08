package X;

import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C725650SdH extends C2217421BqW implements Function0<Unit> {
    public C725650SdH(C725580SdA c725580SdA) {
        super(0, c725580SdA, C725580SdA.class, "switchToNextStory", "switchToNextStory()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityInvoke = ((C725580SdA) this.receiver).LIZLLL.invoke();
        if (feedCollectionViewPagerAbilityInvoke != null) {
            feedCollectionViewPagerAbilityInvoke.E30("click");
        }
        return Unit.LIZ;
    }
}
