package X;

import X.InterfaceC682670Qq9;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.AiStreamParam;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.AnimationConfig;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.BackGround;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntities;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntity;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SummaryFooter;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.Top1LoadMoreStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0Qq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC682650Qq7<T extends InterfaceC682670Qq9> {
    InterfaceC682650Qq7<T> copyFromFusionBlockList(List<? extends InterfaceC682670Qq9> list);

    String findLabelText();

    AnimationConfig getAnimationConfig();

    BackGround getBackGround();

    Boolean getEnableEnterDetail();

    List<Aweme> getFlattenAwemeList();

    SummaryFooter getFooter();

    List<T> getFusionBlockList();

    Boolean getFusionCardDisableShowTitle();

    boolean getHasNimbleCardInSearchResult();

    EnumC682700QqC getJumpPageType();

    List<T> getLandingPageBlockList();

    List<Aweme> getLandingVisibleAwemeList();

    Top1LoadMoreStruct getLoadMoreStruct();

    Double getMaxHeight();

    Integer getMoreDetailAction();

    String getMoreDetailText();

    InterfaceC1120204Zs getOnlineDisplayInfo();

    InterfaceC1771006we getOnlineLoadingConfig();

    List<Double> getPreviewIndexes();

    String getProcessedLabelText();

    List<RefSource> getRefSourceList();

    List<Aweme> getResultVisibleAwemeList();

    List<SourceFromEntity> getSearchingSources();

    Integer getSeeMoreArrowType();

    Boolean getSeeMoreOptimize();

    SourceFromEntities getSourceFromEntities();

    Integer getSourceStyle();

    AiStreamParam getStreamParam();

    void injectResources(boolean z);

    boolean isAiRefactor();

    boolean isExpandStyle();

    Boolean isMixTop1();

    Boolean isRejectedAnswer();

    boolean isShortAnswer(EnumC682700QqC enumC682700QqC);

    Boolean isStream();

    Boolean isTako();

    void processAwemeList(String str);

    void setLoadMoreStruct(Top1LoadMoreStruct top1LoadMoreStruct);
}
