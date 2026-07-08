package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0IEB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0IEB {
    void attach(Context context, InterfaceC463820IGu interfaceC463820IGu, InterfaceC480570Isx interfaceC480570Isx, boolean z);

    void bindSurface(C0IF5 c0if5, String str);

    void changeLowLatencyMode(boolean z);

    void changeLowLatencyMode(boolean z, String str, String str2);

    void changeSRSupportScene(boolean z);

    void dynamicOpenTextureRender();

    void enableSeiFilter(boolean z);

    boolean getAndClearResumeFromAbovePage();

    int getAudioDuckingDurationForLive(int i);

    String getCurrentResolution();

    int getDecodeStatus();

    String getFirstFrameBlockInfo();

    boolean getIfPreviewUsingPlayer();

    boolean getIsPreparePlayer();

    C1281010jRL getLiveNetworkState();

    InterfaceC463840IGw getLogger();

    String getMediaErrorMessage();

    boolean getPlayerHasLogPrePlayerHitCache();

    String getPlayerTag();

    C1699430uKD getPlayerThreadBlockStatus();

    long getStartTime();

    void getVideoSize(int[] iArr);

    void getVideoSizeNoCache(int[] iArr);

    void initialize(C0IMA c0ima, C465140ILw c465140ILw);

    boolean isHadGamePreviewLiveVideoRotated();

    boolean isPlaying();

    boolean isPullParallel();

    boolean isVideoHorizontal();

    boolean isWidevineDrmStream();

    void onAppBackground(boolean z);

    void onBackground();

    void onForeground();

    boolean pipResumePlay();

    void preparePlayer(C0IMA c0ima);

    void preparePlayerWithConfig(C0IM2 c0im2, boolean z);

    void recycle();

    void registerMuteFilter(C1APY c1apy);

    void release();

    void restoreAudioStatus();

    void saveAudioStatus();

    void setAnchorInteractMode(boolean z);

    void setAudioRespondDisableForQuiz(boolean z);

    void setEnterMethodSubtag(String str, boolean z);

    void setEnterRoomScene(String str);

    void setHadGamePreviewLiveVideoRotated(boolean z);

    void setIsPreparePlayer(boolean z);

    void setIsPrivate(Long l);

    void setLiveRoomLogger(InterfaceC467750IVx interfaceC467750IVx);

    void setMute(boolean z, String str);

    void setMuteNew(boolean z, String str);

    void setPlayerHashLogPrePlayerHitCache(boolean z);

    void setPrePullStream(boolean z);

    void setPullParallel(boolean z);

    void setRenderRotation(C0IIZ c0iiz);

    void setReusePlayer(boolean z, String str, boolean z2);

    void setScreenOrientation(boolean z);

    void setSeiOpen(boolean z);

    void setSessionIdFromFullLinkContext(String str);

    boolean start();

    boolean start(boolean z);

    int startAuxAudioDucking(C1300320jwU c1300320jwU, InterfaceC1699390uK9 interfaceC1699390uK9);

    void startPreIo(long j);

    boolean startWithNewLivePlayer();

    void stop(boolean z);

    int stopAuxAudioDucking(int i);

    void stopUseTextureRender();

    void stopWhenJoinInteract();

    void stopWhenPlayingOther();

    void switchNextPullStream(String str);

    void switchResolution(String str);

    void switchResolution(String str, InterfaceC1699420uKC interfaceC1699420uKC);

    boolean tryResumePlay();

    void tryToStartAudioDevice();

    void tryToUploadFirstScreenTime();

    void unRegisterMuteFilter(C1APY c1apy);

    boolean warmUp();

    int writeAuxAudioDuckingPCM(byte[] bArr, int i);
}
