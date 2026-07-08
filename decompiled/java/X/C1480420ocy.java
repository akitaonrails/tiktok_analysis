package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0ocy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480420ocy implements Serializable {
    public String LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public long LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public int LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public String actionType;
    public boolean hasSetToken;
    public boolean isFirstFrame;
    public boolean prePull;
    public String subTag;

    public boolean isBytevc1() {
        return 1 == this.LLILLJJLI;
    }

    public boolean isPlayerSdkEventTrackingDisabled() {
        return !this.LLJJIJIL;
    }

    public int getAccertSessionPrepareType() {
        return this.LLIZLLLIL;
    }

    public int getCodecName() {
        return this.LLILLL;
    }

    public int getCodecType() {
        return this.LLILLJJLI;
    }

    public long getCurrentTimeMillis() {
        return this.LLJJIJI;
    }

    public long getElapsedRealtime() {
        return this.LLJJIII;
    }

    public int getEngineState() {
        return this.LLILZIL;
    }

    public int getHwDecErrReason() {
        return this.LLILZ;
    }

    public int getMediaThreadReuseMark() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public long getOnRenderTime() {
        return this.LLJJI;
    }

    public int getPlayJavaThreadPriority() {
        return this.LLJILJIL;
    }

    public int getPlayerArchVersion() {
        return this.LLJJ;
    }

    public int getPlayerSessionCnt() {
        return this.LLJJJ;
    }

    public int getPrerenderJavaThreadPriority() {
        return this.LLJIJIL;
    }

    public int getRecyclerType() {
        return this.LLJILJILJ;
    }

    public boolean getRenderDisplayed() {
        return this.LLIZ;
    }

    public int getSessionStatus() {
        return this.LLJILLL;
    }

    public String getSourceId() {
        return this.LL;
    }

    public long getTid() {
        return this.LLILZLL;
    }

    public long getUpTimeMills() {
        return this.LLJJIJIIJIL;
    }

    public int getUrlProtocolType() {
        return this.LLJJJJ;
    }

    public boolean isCodecTypeChanged() {
        return this.LLJ;
    }

    public boolean isFirstFrame() {
        return this.isFirstFrame;
    }

    public boolean isHdr() {
        return this.LLJJJJLIIL;
    }

    public boolean isMediaBox() {
        return this.LLJJL;
    }

    public boolean isMute() {
        return this.LLJJJIL;
    }

    public boolean isPlayerSdkEventTrackingEnabled() {
        return this.LLJJIJIL;
    }

    public boolean isSurfaceview() {
        return this.LLJJJJJIL;
    }

    public boolean isTextureRender() {
        return this.LLJI;
    }

    public C1480420ocy(String str) {
        this.LLILZIL = -1;
        this.LLILZLL = -1L;
        this.LLJJI = -1L;
        this.LLJJIII = -1L;
        this.LLJJIJI = -1L;
        this.LLJJIJIIJIL = -1L;
        this.LLJJJJ = -1;
        this.actionType = "";
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LL = str;
    }

    public void setAccertSessionPrepareType(int i) {
        this.LLIZLLLIL = i;
    }

    public void setBytevc1(boolean z) {
        this.LLILLJJLI = z ? 1 : 0;
    }

    public void setCodecName(int i) {
        this.LLILLL = i;
    }

    public void setCodecType(int i) {
        this.LLILLJJLI = i;
    }

    public void setCodecTypeChanged(boolean z) {
        this.LLJ = z;
    }

    public void setCurrentTimeMillis(long j) {
        this.LLJJIJI = j;
    }

    public void setElapsedRealtime(long j) {
        this.LLJJIII = j;
    }

    public void setEnablePlayerSdkEventTracking(boolean z) {
        this.LLJJIJIL = z;
    }

    public void setEngineState(int i) {
        this.LLILZIL = i;
    }

    public void setFirstFrame(boolean z) {
        this.isFirstFrame = z;
    }

    public void setHwDecErrReason(int i) {
        this.LLILZ = i;
    }

    public void setIsHdr(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public void setMediaBox(boolean z) {
        this.LLJJL = z;
    }

    public void setMediaThreadReuseMark(int i) {
        if (this.LLJJLIIIJLLLLLLLZ == -1) {
            this.LLJJLIIIJLLLLLLLZ = i;
        }
    }

    public void setMute(boolean z) {
        this.LLJJJIL = z;
    }

    public void setOnRenderTime(long j) {
        this.LLJJI = j;
    }

    public void setPlayJavaThreadPriority(int i) {
        this.LLJILJIL = i;
    }

    public void setPlayerArchVersion(int i) {
        this.LLJJ = i;
    }

    public void setPlayerSessionCnt(int i) {
        this.LLJJJ = i;
    }

    public void setPrerenderJavaThreadPriority(int i) {
        this.LLJIJIL = i;
    }

    public void setRecyclerType(int i) {
        this.LLJILJILJ = i;
    }

    public void setRenderDisplayed(boolean z) {
        this.LLIZ = z;
    }

    public void setSessionStatus(int i) {
        this.LLJILLL = i;
    }

    public void setSourceId(String str) {
        this.LL = str;
    }

    public void setSurfaceview(boolean z) {
        this.LLJJJJJIL = z;
    }

    public void setTextureRender(boolean z) {
        this.LLJI = z;
    }

    public void setTid(long j) {
        this.LLILZLL = j;
    }

    public void setUpTimeMills(long j) {
        this.LLJJIJIIJIL = j;
    }

    public void setUrlProtocolType(int i) {
        this.LLJJJJ = Math.max(i, -1);
    }

    public C1480420ocy(String str, int i, boolean z) {
        this.LLILZIL = -1;
        this.LLILZLL = -1L;
        this.LLJJI = -1L;
        this.LLJJIII = -1L;
        this.LLJJIJI = -1L;
        this.LLJJIJIIJIL = -1L;
        this.LLJJJJ = -1;
        this.actionType = "";
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLIZ = z;
    }

    public C1480420ocy(String str, boolean z, boolean z2) {
        this(str, z ? 1 : 0, z2);
    }
}
