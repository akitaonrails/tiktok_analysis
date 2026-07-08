package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.effect.StoryUseThisEffectComponent;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rjs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704260Rjs extends C09AY implements Function1<Aweme, List<? extends AbstractC325730Cpn>> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C704260Rjs(boolean z, boolean z2, boolean z3) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends AbstractC325730Cpn> invoke(Aweme aweme) {
        StoryHighlightInfo storyHighlightInfo;
        StoryHighlightCollection storyHighlightCollection;
        UrlModel urlModel;
        List<String> urlList;
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct anchorCommonStruct;
        UrlModel thumbnail;
        List<String> urlList2;
        Aweme aweme2 = aweme;
        boolean z = this.LL;
        boolean z2 = this.LLILLJJLI;
        boolean z3 = this.LLILLL;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.add(new C325720Cpm(aweme2));
        if (z) {
            int i = StoryUseThisEffectComponent.LLLFZ;
            if (C0S21.LIZ(aweme2) && (anchors = aweme2.getAnchors()) != null && (anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLL(anchors)) != null && (thumbnail = anchorCommonStruct.getThumbnail()) != null && (urlList2 = thumbnail.getUrlList()) != null) {
                c13dvLIZIZ.add(new C325760Cpq(urlList2, null, EnumC325870Cq1.LOAD_BITMAP_ASYNC, null, 10));
            }
        }
        if (z2 && z3 && C694840RNi.LIZIZ(aweme2) && (storyHighlightInfo = aweme2.storyHighlightInfo) != null && (storyHighlightCollection = storyHighlightInfo.containerCollectionInfo) != null && (urlModel = storyHighlightCollection.collectionCoverUrl) != null && (urlList = urlModel.getUrlList()) != null) {
            c13dvLIZIZ.add(new C325760Cpq(urlList, null, EnumC325870Cq1.LOAD_BITMAP_ASYNC, null, 10));
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }
}
