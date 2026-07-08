package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Lnq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553840Lnq implements C0DV5<C553840Lnq> {
    public InterfaceC553790Lnl LL;
    public InterfaceC555170Lpz LLILLJJLI;
    public Function0<? extends Drawable> LLILLL;
    public InterfaceC554250LoV LLILZ;
    public int LLILZIL = 2;
    public int LLILZLL = 500;
    public boolean LLIZ = true;
    public boolean LLIZLLLIL = true;
    public C0GYU LLJ;
    public boolean LLJI;
    public C1851870yI5 LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public C555080Lpq LLJILLL;
    public Function0<Integer> LLJJ;

    @Override // X.C0DV5
    public C553840Lnq build() {
        return this;
    }

    public C553840Lnq() {
        C1851870yI5 c1851870yI5 = new C1851870yI5();
        c1851870yI5.build();
        this.LLJIJIL = c1851870yI5;
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final boolean getAutoShowSoftInput$tools_ai_uikit_df_release() {
        return this.LLIZ;
    }

    public final C0GYU getCircleLoadingViewConfig$tools_ai_uikit_df_release() {
        return this.LLJ;
    }

    public final boolean getEnableDynamicInputBoxHeight$tools_ai_uikit_df_release() {
        return this.LLJILJIL;
    }

    public final boolean getEnableMentionPanelBlur$tools_ai_uikit_df_release() {
        return this.LLIZLLLIL;
    }

    public final boolean getEnableMyselfRefreshInSearchState$tools_ai_uikit_df_release() {
        return this.LLJILJILJ;
    }

    public final Function0<Drawable> getInputBoxBackgroundDrawableCreator$tools_ai_uikit_df_release() {
        return this.LLILLL;
    }

    public final InterfaceC555170Lpz getInputBoxEventHandler$tools_ai_uikit_df_release() {
        return this.LLILLJJLI;
    }

    public final int getMaxInputCharCount$tools_ai_uikit_df_release() {
        return this.LLILZLL;
    }

    public final int getMentionLimit$tools_ai_uikit_df_release() {
        return this.LLILZIL;
    }

    public final InterfaceC553790Lnl getMentionPanelSearchHandler$tools_ai_uikit_df_release() {
        return this.LL;
    }

    public final Function0<Integer> getPanelTopY$tools_ai_uikit_df_release() {
        return this.LLJJ;
    }

    public final InterfaceC554250LoV getTooltipOperator$tools_ai_uikit_df_release() {
        return this.LLILZ;
    }

    public final C555080Lpq getUiTextConfig$tools_ai_uikit_df_release() {
        return this.LLJILLL;
    }

    public final boolean getUseVoiceInputBox$tools_ai_uikit_df_release() {
        return this.LLJI;
    }

    public final C1851870yI5 getVoiceBoxConfig$tools_ai_uikit_df_release() {
        return this.LLJIJIL;
    }

    public final C553840Lnq autoShowSoftInput(boolean z) {
        this.LLIZ = z;
        return this;
    }

    public final C553840Lnq circleLoadingViewConfig(C0GYU c0gyu) {
        this.LLJ = c0gyu;
        return this;
    }

    public final C553840Lnq enableDynamicInputBoxHeight(boolean z) {
        this.LLJILJIL = z;
        return this;
    }

    public final C553840Lnq enableMentionPanelBlur(boolean z) {
        this.LLIZLLLIL = z;
        return this;
    }

    public final C553840Lnq enableMyselfRefreshInSearchState(boolean z) {
        this.LLJILJILJ = z;
        return this;
    }

    public final C553840Lnq from(C553840Lnq c553840Lnq) {
        this.LL = c553840Lnq.LL;
        this.LLILLJJLI = c553840Lnq.LLILLJJLI;
        this.LLILLL = c553840Lnq.LLILLL;
        this.LLILZ = c553840Lnq.LLILZ;
        this.LLILZIL = c553840Lnq.LLILZIL;
        this.LLILZLL = c553840Lnq.LLILZLL;
        this.LLIZ = c553840Lnq.LLIZ;
        this.LLIZLLLIL = c553840Lnq.LLIZLLLIL;
        this.LLJ = c553840Lnq.LLJ;
        this.LLJI = c553840Lnq.LLJI;
        this.LLJIJIL = c553840Lnq.LLJIJIL;
        this.LLJILJIL = c553840Lnq.LLJILJIL;
        this.LLJILJILJ = c553840Lnq.LLJILJILJ;
        this.LLJILLL = c553840Lnq.LLJILLL;
        this.LLJJ = c553840Lnq.LLJJ;
        return this;
    }

    public final C553840Lnq inputBoxBackgroundDrawableCreator(Function0<? extends Drawable> function0) {
        this.LLILLL = function0;
        return this;
    }

    public final C553840Lnq inputBoxEventHandler(InterfaceC555170Lpz interfaceC555170Lpz) {
        this.LLILLJJLI = interfaceC555170Lpz;
        return this;
    }

    public final C553840Lnq maxInputCharCount(int i) {
        this.LLILZLL = i;
        return this;
    }

    public final C553840Lnq mentionLimit(int i) {
        this.LLILZIL = i;
        return this;
    }

    public final C553840Lnq mentionPanelSearchHandler(InterfaceC553790Lnl interfaceC553790Lnl) {
        this.LL = interfaceC553790Lnl;
        return this;
    }

    public final C553840Lnq panelTopY(Function0<Integer> function0) {
        this.LLJJ = function0;
        return this;
    }

    public final void setAutoShowSoftInput$tools_ai_uikit_df_release(boolean z) {
        this.LLIZ = z;
    }

    public final void setCircleLoadingViewConfig$tools_ai_uikit_df_release(C0GYU c0gyu) {
        this.LLJ = c0gyu;
    }

    public final void setEnableDynamicInputBoxHeight$tools_ai_uikit_df_release(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setEnableMentionPanelBlur$tools_ai_uikit_df_release(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setEnableMyselfRefreshInSearchState$tools_ai_uikit_df_release(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setInputBoxBackgroundDrawableCreator$tools_ai_uikit_df_release(Function0<? extends Drawable> function0) {
        this.LLILLL = function0;
    }

    public final void setInputBoxEventHandler$tools_ai_uikit_df_release(InterfaceC555170Lpz interfaceC555170Lpz) {
        this.LLILLJJLI = interfaceC555170Lpz;
    }

    public final void setMaxInputCharCount$tools_ai_uikit_df_release(int i) {
        this.LLILZLL = i;
    }

    public final void setMentionLimit$tools_ai_uikit_df_release(int i) {
        this.LLILZIL = i;
    }

    public final void setMentionPanelSearchHandler$tools_ai_uikit_df_release(InterfaceC553790Lnl interfaceC553790Lnl) {
        this.LL = interfaceC553790Lnl;
    }

    public final void setPanelTopY$tools_ai_uikit_df_release(Function0<Integer> function0) {
        this.LLJJ = function0;
    }

    public final void setTooltipOperator$tools_ai_uikit_df_release(InterfaceC554250LoV interfaceC554250LoV) {
        this.LLILZ = interfaceC554250LoV;
    }

    public final void setUiTextConfig$tools_ai_uikit_df_release(C555080Lpq c555080Lpq) {
        this.LLJILLL = c555080Lpq;
    }

    public final void setUseVoiceInputBox$tools_ai_uikit_df_release(boolean z) {
        this.LLJI = z;
    }

    public final void setVoiceBoxConfig$tools_ai_uikit_df_release(C1851870yI5 c1851870yI5) {
        this.LLJIJIL = c1851870yI5;
    }

    public final C553840Lnq tooltipOperator(InterfaceC554250LoV interfaceC554250LoV) {
        this.LLILZ = interfaceC554250LoV;
        return this;
    }

    public final C553840Lnq uiTextConfig(C555080Lpq c555080Lpq) {
        this.LLJILLL = c555080Lpq;
        return this;
    }

    public final C553840Lnq useVoiceInputBox(boolean z) {
        this.LLJI = z;
        return this;
    }

    public final C553840Lnq voiceBoxConfig(C1851870yI5 c1851870yI5) {
        c1851870yI5.build();
        this.LLJIJIL = c1851870yI5;
        return this;
    }
}
