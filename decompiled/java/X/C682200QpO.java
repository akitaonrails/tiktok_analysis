package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.AnimationConfig;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.BackGround;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntities;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0QpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682200QpO implements Serializable {
    public static final int $stable = 8;
    public final AnimationConfig animationConfig;
    public final List<Aweme> awemeList;
    public final BackGround backGround;
    public final transient Rect cardRectOnScreen;
    public final Integer contentViewTopOnScreenInitState;
    public final Integer contentViewTopOnScreenOutResult;
    public final String docId;
    public final C682270QpV interactionModel;
    public final C682250QpT labelModel;
    public final Integer multiSummaryIndex;
    public final Function1<Integer, Unit> onLandingPageDismiss;
    public final Function2<View, String, Unit> onLandingPageShow;
    public final InterfaceC1631630sYr<Integer, CharSequence, Map<String, ? extends Object>, Context, Unit> onSpanClick;
    public final EnumC682700QqC pageType;
    public final List<RefSource> refSourceList;
    public final C0H47 rsModel;
    public final SearchMixFeed searchMixFeed;
    public final SourceFromEntities sourceFromEntities;
    public final String text;
    public final String title;
    public final List<Object> webDocList;

    public C682200QpO() {
        this("", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C682200QpO(String str, String str2, String str3, InterfaceC1631630sYr<? super Integer, ? super CharSequence, ? super Map<String, ? extends Object>, ? super Context, Unit> interfaceC1631630sYr, Function2<? super View, ? super String, Unit> function2, Function1<? super Integer, Unit> function1, C682250QpT c682250QpT, C682270QpV c682270QpV, C0H47 c0h47, List<Object> list, List<? extends Aweme> list2, List<RefSource> list3, SourceFromEntities sourceFromEntities, SearchMixFeed searchMixFeed, Integer num, Integer num2, Integer num3, EnumC682700QqC enumC682700QqC, Rect rect, AnimationConfig animationConfig, BackGround backGround) {
        this.title = str;
        this.text = str2;
        this.docId = str3;
        this.onSpanClick = interfaceC1631630sYr;
        this.onLandingPageShow = function2;
        this.onLandingPageDismiss = function1;
        this.labelModel = c682250QpT;
        this.interactionModel = c682270QpV;
        this.rsModel = c0h47;
        this.webDocList = list;
        this.awemeList = list2;
        this.refSourceList = list3;
        this.sourceFromEntities = sourceFromEntities;
        this.searchMixFeed = searchMixFeed;
        this.multiSummaryIndex = num;
        this.contentViewTopOnScreenOutResult = num2;
        this.contentViewTopOnScreenInitState = num3;
        this.pageType = enumC682700QqC;
        this.cardRectOnScreen = rect;
        this.animationConfig = animationConfig;
        this.backGround = backGround;
    }
}
