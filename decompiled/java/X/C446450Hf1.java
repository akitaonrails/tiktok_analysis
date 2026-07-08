package X;

import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryStickerComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Hf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C446450Hf1 extends C2217421BqW implements Function0<String> {
    public C446450Hf1(StoryStickerComponent storyStickerComponent) {
        super(0, storyStickerComponent, StoryStickerComponent.class, "getStoryFeedEnterPosition", "getStoryFeedEnterPosition()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        C0RF0 c0rf0 = ((BaseCellContentComponent) this.receiver).jm().LIZLLL;
        return (c0rf0 == null || (baseFeedPageParams = c0rf0.LJ) == null || (c2189821An6 = baseFeedPageParams.param) == null) ? "" : C1609930rzr.LJIL(c2189821An6);
    }
}
