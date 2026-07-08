package X;

import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0bSG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974060bSG {
    public InterfaceC974170bSR LIZ;
    public final LiveWidget LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final EnumC974070bSH LJFF;
    public final EnumC919170a1j LJI;
    public final Integer LJII;
    public final C979690bbL LJIIIIZZ;
    public final AbstractC963510bBF LJIIIZ;
    public final boolean LJIIJ;

    public final String toString() {
        return "ClickEntranceParams(launcherCallback=" + this.LIZ + ", ownerWidget=" + this.LIZIZ + ", clickFrom=" + this.LIZJ + ", bizType=null, noticeType=" + this.LIZLLL + ", isGuide=" + this.LJ + ", matchCreatedSource=" + this.LJFF + ", clickMatchType=" + this.LJI + ", guideNoticeType=" + this.LJII + ", interactCallbackInfo=" + this.LJIIIIZZ + ", competitionInitAction=" + this.LJIIIZ + ", skipModeSelectionForDirectInvite=" + this.LJIIJ + ')';
    }

    public C974060bSG(LiveWidget liveWidget, String str, int i, boolean z, EnumC974070bSH enumC974070bSH, EnumC919170a1j enumC919170a1j, Integer num, C979690bbL c979690bbL, AbstractC963510bBF abstractC963510bBF, boolean z2, int i2) {
        num = (i2 & 256) != 0 ? null : num;
        c979690bbL = (i2 & 512) != 0 ? null : c979690bbL;
        abstractC963510bBF = (i2 & 1024) != 0 ? null : abstractC963510bBF;
        z2 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2;
        this.LIZ = null;
        this.LIZIZ = liveWidget;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = enumC974070bSH;
        this.LJI = enumC919170a1j;
        this.LJII = num;
        this.LJIIIIZZ = c979690bbL;
        this.LJIIIZ = abstractC963510bBF;
        this.LJIIJ = z2;
    }
}
