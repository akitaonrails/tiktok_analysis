package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lo5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553990Lo5 implements C0DV5<C553990Lo5> {
    public boolean LL;
    public List<MentionDataItem> LLILLJJLI;
    public List<MentionDataItem> LLILLL;
    public InterfaceC554050LoB LLILZ;
    public boolean LLJIJIL;
    public Function1<? super Function0<Unit>, Unit> LLJJI;
    public InterfaceC554250LoV LLJJIJI;
    public List<MentionDataItem> LLJJIJIIJIL;
    public C555080Lpq LLJJIJIL;
    public boolean LLILZIL = true;
    public int LLILZLL = 10;
    public int LLIZ = 3;
    public boolean LLIZLLLIL = true;
    public float LLJ = 0.4f;
    public float LLJI = 1.0f;
    public boolean LLJILJIL = true;
    public int LLJILJILJ = 2;
    public boolean LLJILLL = true;
    public long LLJJ = 300;
    public int LLJJIII = 2;

    public final C553990Lo5 cellStyleProvider(InterfaceC554000Lo6 interfaceC554000Lo6) {
        return this;
    }

    public final InterfaceC554000Lo6 getCellStyleProvider$tools_ai_uikit_df_release() {
        return null;
    }

    public final void setCellStyleProvider$tools_ai_uikit_df_release(InterfaceC554000Lo6 interfaceC554000Lo6) {
    }

    @Override // X.C0DV5
    public C553990Lo5 build() {
        List<MentionDataItem> list;
        if (this.LL && ((list = this.LLILLJJLI) == null || list.isEmpty())) {
            throw new IllegalArgumentException("followPathMode requires non-empty followPathUserInfos");
        }
        float f = this.LLJ;
        if (0.0f <= f && f <= 1.0f) {
            float f2 = this.LLJI;
            if (0.0f <= f2 && f2 <= 1.0f) {
                if (this.LLILZLL <= 0 || this.LLIZ <= 0) {
                    throw new IllegalArgumentException("skeletonCount and preloadCount must be positive");
                }
                return this;
            }
        }
        throw new IllegalArgumentException("Alpha values must be in range [0, 1]");
    }

    public final boolean getAutoRefresh$tools_ai_uikit_df_release() {
        return this.LLIZLLLIL;
    }

    public final long getDebounceClickInterval$tools_ai_uikit_df_release() {
        return this.LLJJ;
    }

    public final float getDisabledAlpha$tools_ai_uikit_df_release() {
        return this.LLJ;
    }

    public final boolean getEnableDebounceClick$tools_ai_uikit_df_release() {
        return this.LLJILLL;
    }

    public final boolean getEnableItemAnimator$tools_ai_uikit_df_release() {
        return this.LLJIJIL;
    }

    public final float getEnabledAlpha$tools_ai_uikit_df_release() {
        return this.LLJI;
    }

    public final List<MentionDataItem> getFollowPathCurrentUserInfos$tools_ai_uikit_df_release() {
        return this.LLILLL;
    }

    public final List<MentionDataItem> getFollowPathOriginUserInfos$tools_ai_uikit_df_release() {
        return this.LLILLJJLI;
    }

    public final List<MentionDataItem> getInsertItemList$tools_ai_uikit_df_release() {
        return this.LLJJIJIIJIL;
    }

    public final Function1<Function0<Unit>, Unit> getLifecycleOwnerSetter$tools_ai_uikit_df_release() {
        return this.LLJJI;
    }

    public final int getMaxMentionCount$tools_ai_uikit_df_release() {
        return this.LLJILJILJ;
    }

    public final int getMentionLimit$tools_ai_uikit_df_release() {
        return this.LLJJIII;
    }

    public final int getPreloadCount$tools_ai_uikit_df_release() {
        return this.LLIZ;
    }

    public final InterfaceC554050LoB getRecommendDataSource$tools_ai_uikit_df_release() {
        return this.LLILZ;
    }

    public final boolean getShowSkeleton$tools_ai_uikit_df_release() {
        return this.LLILZIL;
    }

    public final int getSkeletonCount$tools_ai_uikit_df_release() {
        return this.LLILZLL;
    }

    public final C555080Lpq getTextConfig$tools_ai_uikit_df_release() {
        return this.LLJJIJIL;
    }

    public final InterfaceC554250LoV getToolTipOperator$tools_ai_uikit_df_release() {
        return this.LLJJIJI;
    }

    public final boolean isFollowPathMode$tools_ai_uikit_df_release() {
        return this.LL;
    }

    public final boolean isHorizontalScroll$tools_ai_uikit_df_release() {
        return this.LLJILJIL;
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final C553990Lo5 autoRefresh(boolean z) {
        this.LLIZLLLIL = z;
        return this;
    }

    public final C553990Lo5 dataSource(InterfaceC554050LoB interfaceC554050LoB) {
        this.LLILZ = interfaceC554050LoB;
        return this;
    }

    public final C553990Lo5 debounceClickInterval(long j) {
        if (j > 0) {
            this.LLJJ = j;
        }
        return this;
    }

    public final C553990Lo5 disabledAlpha(float f) {
        if (0.0f <= f && f <= 1.0f) {
            this.LLJ = f;
        }
        return this;
    }

    public final C553990Lo5 enableDebounceClick(boolean z) {
        this.LLJILLL = z;
        return this;
    }

    public final C553990Lo5 enableItemAnimator(boolean z) {
        this.LLJIJIL = z;
        return this;
    }

    public final C553990Lo5 enabledAlpha(float f) {
        if (0.0f <= f && f <= 1.0f) {
            this.LLJI = f;
        }
        return this;
    }

    public final C553990Lo5 forceInsertRecommendItem(List<MentionDataItem> list) {
        this.LLJJIJIIJIL = list;
        return this;
    }

    public final C553990Lo5 lifecycleOwnerSetter(Function1<? super Function0<Unit>, Unit> function1) {
        this.LLJJI = function1;
        return this;
    }

    public final C553990Lo5 maxMentionCount(int i) {
        if (i > 0) {
            this.LLJILJILJ = i;
        }
        return this;
    }

    public final C553990Lo5 mentionLimit(int i) {
        this.LLJJIII = i;
        return this;
    }

    public final C553990Lo5 mentionTextConfig(C555080Lpq c555080Lpq) {
        this.LLJJIJIL = c555080Lpq;
        return this;
    }

    public final C553990Lo5 preloadCount(int i) {
        if (i > 0) {
            this.LLIZ = i;
        }
        return this;
    }

    public final C553990Lo5 scrollDirection(boolean z) {
        this.LLJILJIL = z;
        return this;
    }

    public final void setAutoRefresh$tools_ai_uikit_df_release(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setDebounceClickInterval$tools_ai_uikit_df_release(long j) {
        this.LLJJ = j;
    }

    public final void setDisabledAlpha$tools_ai_uikit_df_release(float f) {
        this.LLJ = f;
    }

    public final void setEnableDebounceClick$tools_ai_uikit_df_release(boolean z) {
        this.LLJILLL = z;
    }

    public final void setEnableItemAnimator$tools_ai_uikit_df_release(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setEnabledAlpha$tools_ai_uikit_df_release(float f) {
        this.LLJI = f;
    }

    public final void setFollowPathCurrentUserInfos$tools_ai_uikit_df_release(List<MentionDataItem> list) {
        this.LLILLL = list;
    }

    public final void setFollowPathMode$tools_ai_uikit_df_release(boolean z) {
        this.LL = z;
    }

    public final void setFollowPathOriginUserInfos$tools_ai_uikit_df_release(List<MentionDataItem> list) {
        this.LLILLJJLI = list;
    }

    public final void setHorizontalScroll$tools_ai_uikit_df_release(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setInsertItemList$tools_ai_uikit_df_release(List<MentionDataItem> list) {
        this.LLJJIJIIJIL = list;
    }

    public final void setLifecycleOwnerSetter$tools_ai_uikit_df_release(Function1<? super Function0<Unit>, Unit> function1) {
        this.LLJJI = function1;
    }

    public final void setMaxMentionCount$tools_ai_uikit_df_release(int i) {
        this.LLJILJILJ = i;
    }

    public final void setMentionLimit$tools_ai_uikit_df_release(int i) {
        this.LLJJIII = i;
    }

    public final void setPreloadCount$tools_ai_uikit_df_release(int i) {
        this.LLIZ = i;
    }

    public final void setRecommendDataSource$tools_ai_uikit_df_release(InterfaceC554050LoB interfaceC554050LoB) {
        this.LLILZ = interfaceC554050LoB;
    }

    public final void setShowSkeleton$tools_ai_uikit_df_release(boolean z) {
        this.LLILZIL = z;
    }

    public final void setSkeletonCount$tools_ai_uikit_df_release(int i) {
        this.LLILZLL = i;
    }

    public final void setTextConfig$tools_ai_uikit_df_release(C555080Lpq c555080Lpq) {
        this.LLJJIJIL = c555080Lpq;
    }

    public final void setToolTipOperator$tools_ai_uikit_df_release(InterfaceC554250LoV interfaceC554250LoV) {
        this.LLJJIJI = interfaceC554250LoV;
    }

    public final C553990Lo5 showSkeleton(boolean z) {
        this.LLILZIL = z;
        return this;
    }

    public final C553990Lo5 skeletonCount(int i) {
        if (i > 0) {
            this.LLILZLL = i;
        }
        return this;
    }

    public final C553990Lo5 toolTipOperator(InterfaceC554250LoV interfaceC554250LoV) {
        this.LLJJIJI = interfaceC554250LoV;
        return this;
    }

    public final C553990Lo5 followPathMode(List<MentionDataItem> list, Map<MentionDataItem, MentionDataItem> map) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        this.LL = true ^ z;
        this.LLILLJJLI = list;
        if (map != null && list != null) {
            ArrayList arrayList = new ArrayList(list);
            for (Map.Entry<MentionDataItem, MentionDataItem> entry : map.entrySet()) {
                if (list.contains(entry.getKey())) {
                    int iIndexOf = arrayList.indexOf(entry.getKey());
                    ListProtector.remove(arrayList, iIndexOf);
                    ListProtector.add(arrayList, iIndexOf, entry.getValue());
                }
            }
            list = arrayList;
        }
        this.LLILLL = list;
        return this;
    }
}
