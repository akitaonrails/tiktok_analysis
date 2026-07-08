package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: renamed from: X.0yI5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851870yI5 implements C0DV5<C1851870yI5> {
    public float LL = 80.0f;
    public CharSequence LLILLJJLI = "Pause";
    public CharSequence LLILLL = "Send";
    public String LLILZ = "vs_ai_remix";
    public String LLILZIL = "wss://speech.tiktokv.com";
    public String LLILZLL = "/api/v1/sauc";
    public String LLIZ = "vs_tt_tako_all_in_one";
    public String LLIZLLLIL = "";
    public int LLJ = LivePreCreateNextRoomPlayer.ENABLE;
    public int LLJI = LivePreCreateNextRoomPlayer.ENABLE;
    public int LLJIJIL = C538540LAe.LLJJJIL;
    public C18SL LLJILJIL;

    @Override // X.C0DV5
    public C1851870yI5 build() {
        return this;
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final String getAppId$tools_ai_uikit_df_release() {
        return this.LLILZ;
    }

    public final String getAsrAddress$tools_ai_uikit_df_release() {
        return this.LLILZIL;
    }

    public final String getAsrCluster$tools_ai_uikit_df_release() {
        return this.LLIZ;
    }

    public final int getAsrConnectionTimeoutIntervalMs$tools_ai_uikit_df_release() {
        return this.LLJ;
    }

    public final String getAsrLanguage$tools_ai_uikit_df_release() {
        return this.LLIZLLLIL;
    }

    public final int getAsrMaxSpeechDurationLimitMs$tools_ai_uikit_df_release() {
        return this.LLJIJIL;
    }

    public final int getAsrReceivingTimeoutIntervalMs$tools_ai_uikit_df_release() {
        return this.LLJI;
    }

    public final String getAsrUri$tools_ai_uikit_df_release() {
        return this.LLILZLL;
    }

    public final C18SL getEventHandler$tools_ai_uikit_df_release() {
        return this.LLJILJIL;
    }

    public final CharSequence getLeftButtonText$tools_ai_uikit_df_release() {
        return this.LLILLJJLI;
    }

    public final CharSequence getRightButtonText$tools_ai_uikit_df_release() {
        return this.LLILLL;
    }

    public final float getSlideUpCancelThresholdDp$tools_ai_uikit_df_release() {
        return this.LL;
    }

    public final C1851870yI5 asrAddress(String str) {
        this.LLILZIL = str;
        return this;
    }

    public final C1851870yI5 asrAppId(String str) {
        this.LLILZ = str;
        return this;
    }

    public final C1851870yI5 asrCluster(String str) {
        this.LLIZ = str;
        return this;
    }

    public final C1851870yI5 asrConnectionTimeoutIntervalMs(int i) {
        this.LLJ = i;
        return this;
    }

    public final C1851870yI5 asrLanguage(String str) {
        this.LLIZLLLIL = str;
        return this;
    }

    public final C1851870yI5 asrMaxSpeechDurationLimitMs(int i) {
        this.LLJIJIL = i;
        return this;
    }

    public final C1851870yI5 asrReceivingTimeoutIntervalMs(int i) {
        this.LLJI = i;
        return this;
    }

    public final C1851870yI5 asrUri(String str) {
        this.LLILZLL = str;
        return this;
    }

    public final C1851870yI5 eventHandler(C18SL c18sl) {
        this.LLJILJIL = c18sl;
        return this;
    }

    public final C1851870yI5 leftButtonText(CharSequence charSequence) {
        this.LLILLJJLI = charSequence;
        return this;
    }

    public final C1851870yI5 rightButtonText(CharSequence charSequence) {
        this.LLILLL = charSequence;
        return this;
    }

    public final void setAppId$tools_ai_uikit_df_release(String str) {
        this.LLILZ = str;
    }

    public final void setAsrAddress$tools_ai_uikit_df_release(String str) {
        this.LLILZIL = str;
    }

    public final void setAsrCluster$tools_ai_uikit_df_release(String str) {
        this.LLIZ = str;
    }

    public final void setAsrConnectionTimeoutIntervalMs$tools_ai_uikit_df_release(int i) {
        this.LLJ = i;
    }

    public final void setAsrLanguage$tools_ai_uikit_df_release(String str) {
        this.LLIZLLLIL = str;
    }

    public final void setAsrMaxSpeechDurationLimitMs$tools_ai_uikit_df_release(int i) {
        this.LLJIJIL = i;
    }

    public final void setAsrReceivingTimeoutIntervalMs$tools_ai_uikit_df_release(int i) {
        this.LLJI = i;
    }

    public final void setAsrUri$tools_ai_uikit_df_release(String str) {
        this.LLILZLL = str;
    }

    public final void setEventHandler$tools_ai_uikit_df_release(C18SL c18sl) {
        this.LLJILJIL = c18sl;
    }

    public final void setLeftButtonText$tools_ai_uikit_df_release(CharSequence charSequence) {
        this.LLILLJJLI = charSequence;
    }

    public final void setRightButtonText$tools_ai_uikit_df_release(CharSequence charSequence) {
        this.LLILLL = charSequence;
    }

    public final void setSlideUpCancelThresholdDp$tools_ai_uikit_df_release(float f) {
        this.LL = f;
    }

    public final C1851870yI5 slideUpCancelThresholdDp(float f) {
        this.LL = f;
        return this;
    }
}
