package X;

import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RAX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RAX extends C09AY implements Function0<FeedCollectionViewPagerAbility> {
    public final /* synthetic */ CellStickerManagerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RAX(CellStickerManagerComponent cellStickerManagerComponent) {
        super(0);
        this.LL = cellStickerManagerComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedCollectionViewPagerAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), FeedCollectionViewPagerAbility.class, null);
    }
}
