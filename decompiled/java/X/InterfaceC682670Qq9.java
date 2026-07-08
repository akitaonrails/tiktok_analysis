package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.BottomQuoteSources;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.FavorAndFeedback;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.QuoteBlock;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.ShortAnswerFormat;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntities;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Qq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC682670Qq9 {
    InterfaceC682670Qq9 copyFromConcat(List<? extends Aweme> list, List<ImageData> list2, String str, Integer num, Aweme aweme);

    AnonymousClass0529 getAnimInfo();

    String getBizUniqueKey();

    Integer getBlockId();

    BottomQuoteSources getBottomSources();

    String getButtonText();

    Boolean getDefaultOpen();

    String getDetailLayoutName();

    Integer getDisplayLine();

    List<Double> getDisplayLines();

    DynamicPatch getDynamicPatch();

    FavorAndFeedback getFavorAndFeedback();

    Integer getFlattenAwemeListSize();

    String getFoldFromId();

    String getFoldId();

    String getFoldTitle();

    Map<C1172204iG, Map<String, Object>> getFusionBlockMap();

    ShortAnswerFormat getLandingPageShortAnswerFormat();

    String getLayoutName();

    Integer getLayoutType();

    String getMixedText();

    Boolean getNeedPlaceHolder();

    Integer getPlaceholderType();

    List<Double> getPointToOtherBlockIdList();

    List<Double> getPointToOtherTextBlockIdList();

    String getProcessedSummary();

    Map<String, QuoteBlock> getQuoteBlockMap();

    LinkedHashMap<String, RefSource> getRefSourceMap();

    List<Object> getRelatedWordList();

    EnumC488230JCr getRequestStatus();

    ShortAnswerFormat getShortAnswerFormat();

    ShortAnswerFormat getShortAnswerFormatByPage(boolean z);

    String getSnippet();

    List<String> getSnippets();

    List<ImageData> getSubImages();

    String getSubTitle();

    List<Aweme> getSubVideos();

    List<String> getSummaries();

    SourceFromEntities getSummarySource();

    Aweme getSurroundedVideo();

    Integer getSurroundedVideoIndex();

    List<String> getTagList();

    List<String> getTakoSugList();

    String getTakoSummary();

    List<String> getTexts();

    Integer getType();

    void setFusionBlockMap(Map<C1172204iG, Map<String, Object>> map);
}
