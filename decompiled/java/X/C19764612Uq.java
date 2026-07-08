package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19764612Uq extends AbstractC2255721DQs<InterfaceC19668811xO> implements InterfaceC19668811xO, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final C12PU LLILLJJLI;
    public final InterfaceC19668811xO LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final C19764712Ur LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19764612Uq.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = 8;
    }

    private final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLILZ.getValue(this, LLILZLL[0]);
    }

    @Override // X.InterfaceC19668811xO
    public int getDuration() {
        C19764712Ur c19764712Ur = this.LLILZIL;
        if (c19764712Ur != null) {
            return (int) (c19764712Ur.LIZ.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        return 0;
    }

    @Override // X.InterfaceC19668811xO
    public int ip2() {
        C19764712Ur c19764712Ur = this.LLILZIL;
        if (c19764712Ur != null) {
            return (int) (c19764712Ur.LIZ.getCurrentPosition() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        return 0;
    }

    @Override // X.InterfaceC19668811xO
    public boolean isPlaying() {
        C19764712Ur c19764712Ur = this.LLILZIL;
        return c19764712Ur != null && c19764712Ur.LIZ.state() == NLEPlayerState.STARTED;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILLJJLI.LIZ(new C12PR() { // from class: X.12Us
            @Override // X.C12PR
            public final void LIZJ() {
            }

            @Override // X.C12PR
            public final void LIZ(String str) {
                if (Intrinsics.LJFF(str, "ae_voiceChange")) {
                    C19764712Ur c19764712Ur = this.LIZ.LLILZIL;
                    if (c19764712Ur != null) {
                        c19764712Ur.LIZIZ.clear();
                        c19764712Ur.LIZ.removePlayerInfoListener((C19764912Ut) c19764712Ur.LIZLLL.getValue());
                    }
                    C19764712Ur c19764712Ur2 = this.LIZ.LLILZIL;
                    if (c19764712Ur2 != null) {
                        c19764712Ur2.LIZ("");
                    }
                }
            }

            @Override // X.C12PR
            public final void LIZIZ(String str) {
                C19764712Ur c19764712Ur;
                if (Intrinsics.LJFF(str, "ae_voiceChange") && (c19764712Ur = this.LIZ.LLILZIL) != null) {
                    c19764712Ur.LIZ.addPlayerInfoListener((C19764912Ut) c19764712Ur.LIZLLL.getValue());
                }
            }
        });
    }

    public InterfaceC19668811xO W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC19668811xO
    public void HK0(boolean z) {
        C19764712Ur c19764712Ur = this.LLILZIL;
        if (c19764712Ur != null) {
            c19764712Ur.LIZJ = z;
        }
    }

    @Override // X.InterfaceC19668811xO
    public void LQ1(InterfaceC19765012Uu interfaceC19765012Uu) {
        C19764712Ur c19764712Ur = this.LLILZIL;
        if (c19764712Ur != null && !c19764712Ur.LIZIZ.contains(interfaceC19765012Uu)) {
            c19764712Ur.LIZIZ.add(interfaceC19765012Uu);
        }
    }

    @Override // X.InterfaceC19668811xO
    public boolean Lf(String str) {
        C19764712Ur c19764712Ur = this.LLILZIL;
        if (c19764712Ur != null) {
            C19758912Sl c19758912Sl = new C19758912Sl(str, "play");
            c19764712Ur.LIZLLL(c19758912Sl);
            Iterator<InterfaceC19765012Uu> it2 = c19764712Ur.LIZIZ.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZIZ(c19758912Sl)) {
                    return false;
                }
            }
            C19765312Ux c19765312Ux = new C19765312Ux();
            c19764712Ur.LIZLLL(c19765312Ux);
            C1524705y1.LIZJ(new AwS573S0100000_29(c19764712Ur, c19765312Ux, 231));
            if (c19764712Ur.LIZ.play() != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC19668811xO
    public void i81(InterfaceC19765012Uu interfaceC19765012Uu) {
        C19764712Ur c19764712Ur = this.LLILZIL;
        if (c19764712Ur != null && c19764712Ur.LIZIZ.contains(interfaceC19765012Uu)) {
            c19764712Ur.LIZIZ.remove(interfaceC19765012Uu);
        }
    }

    @Override // X.InterfaceC19668811xO
    public boolean kI0(String str) {
        C19764712Ur c19764712Ur = this.LLILZIL;
        if (c19764712Ur == null || c19764712Ur.LIZIZ(str) != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC19668811xO
    public boolean pause(String str) {
        C19764712Ur c19764712Ur = this.LLILZIL;
        if (c19764712Ur == null || c19764712Ur.LIZ(str) != 0) {
            return false;
        }
        return true;
    }

    public C19764612Uq(C1DRG c1drg, C12PU c12pu) {
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        this.LL = c1drg;
        this.LLILLJJLI = c12pu;
        C19764712Ur c19764712Ur = null;
        InterfaceC1452170ntP value = X1().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            c19764712Ur = new C19764712Ur(playerApi);
        }
        this.LLILZIL = c19764712Ur;
    }

    @Override // X.InterfaceC19668811xO
    public void GM(long j, String str) {
        C19764712Ur c19764712Ur = this.LLILZIL;
        if (c19764712Ur != null) {
            c19764712Ur.LIZJ(j, str, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    @Override // X.InterfaceC19668811xO
    public void bd0(long j, String str) {
        C19764712Ur c19764712Ur = this.LLILZIL;
        if (c19764712Ur != null) {
            c19764712Ur.LIZJ(j, str, NLESeekFlag.EDITOR_SEEK_FLAG_OnGoing);
        }
    }

    @Override // X.InterfaceC19668811xO
    public void pu0(float f, String str) {
        C19764712Ur c19764712Ur = this.LLILZIL;
        if (c19764712Ur != null) {
            long duration = c19764712Ur.LIZ.getDuration();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            c19764712Ur.LIZJ((long) ((duration / j) * j * f), str, NLESeekFlag.EDITOR_SEEK_FLAG_OnGoing);
        }
    }

    @Override // X.InterfaceC19668811xO
    public void xT(float f, String str) {
        C19764712Ur c19764712Ur = this.LLILZIL;
        if (c19764712Ur != null) {
            long duration = c19764712Ur.LIZ.getDuration();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            c19764712Ur.LIZJ((long) ((duration / j) * j * f), str, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
        }
    }
}
