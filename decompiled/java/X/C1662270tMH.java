package X;

import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.ShootMusicStreamWithoutRecording;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS174S1100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0tMH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662270tMH extends AbstractC2255721DQs<InterfaceC1646930sxX> implements InterfaceC1646930sxX, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final C1662300tMK LLILLL = new C1662300tMK();
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(274));
    public final C1662280tMI LLILZIL = new AbstractC20187113yn() { // from class: X.0tMI
        @Override // X.InterfaceC20187013ym
        public final void LIZIZ(String str, int i, int i2, String str2) {
        }

        @Override // X.InterfaceC20187013ym
        public final void LIZJ(String str) {
        }

        @Override // X.InterfaceC20187013ym
        public final void LIZLLL(String str, boolean z) {
        }

        @Override // X.AbstractC20187113yn
        public final void LJ(String str, int i, int i2, float f, String str2) {
        }

        @Override // X.InterfaceC20187013ym
        public final void LJJJLL(String str, float f) {
        }

        @Override // X.InterfaceC20187013ym
        public final void LIZ(String str) {
            C1662270tMH c1662270tMH = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFinished : url: ");
            sbLIZ.append(str);
            sbLIZ.append(", musicPath: ");
            sbLIZ.append(this.LIZ.getShortVideoContext().creativeModel.musicBuzModel.musicPath);
            sbLIZ.append(", path: ");
            sbLIZ.append(this.LIZ.getShortVideoContext().creativeModel.musicBuzModel.path);
            c1662270tMH.w2(C2188811AlT.LIZIZ(sbLIZ));
            C371410EhH.LIZJ(new AwS174S1100000_25(this.LIZ, str, 8));
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1662270tMH.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InterfaceC1646930sxX X1() {
        return this;
    }

    public final InterfaceC1662290tMJ Z1() {
        return (InterfaceC1662290tMJ) this.LLILZ.getValue();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC1662290tMJ interfaceC1662290tMJZ1 = Z1();
        if (interfaceC1662290tMJZ1 != null) {
            interfaceC1662290tMJZ1.LJII(this.LLILZIL);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC1662290tMJ interfaceC1662290tMJZ1 = Z1();
        if (interfaceC1662290tMJZ1 != null) {
            interfaceC1662290tMJZ1.LIZJ(this.LLILZIL);
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0tMI] */
    public C1662270tMH(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final boolean W1(int i) {
        C01GW c01gw = ShootMusicStreamWithoutRecording.LIZIZ;
        if (((ShootMusicStreamWithoutRecording.ShootMusicStreamWithoutRecordingConfig) c01gw.getValue()).strategy == 1) {
            C1661300tKi.LIZ.getClass();
            int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
            if (((ShootMusicStreamWithoutRecording.ShootMusicStreamWithoutRecordingConfig) c01gw.getValue()).strategy != 1 || effectiveConnectionType <= ((ShootMusicStreamWithoutRecording.ShootMusicStreamWithoutRecordingConfig) c01gw.getValue()).netLevelThreshold) {
                return false;
            }
        } else if (((ShootMusicStreamWithoutRecording.ShootMusicStreamWithoutRecordingConfig) c01gw.getValue()).strategy == 2) {
            if (((ShootMusicStreamWithoutRecording.ShootMusicStreamWithoutRecordingConfig) c01gw.getValue()).strategy != 2 || i <= ((ShootMusicStreamWithoutRecording.ShootMusicStreamWithoutRecordingConfig) c01gw.getValue()).cacheProgressThreshold) {
                return false;
            }
        } else if (((ShootMusicStreamWithoutRecording.ShootMusicStreamWithoutRecordingConfig) c01gw.getValue()).strategy == 3) {
            C1661300tKi.LIZ.getClass();
            int effectiveConnectionType2 = TTNetInit.getEffectiveConnectionType();
            if (((ShootMusicStreamWithoutRecording.ShootMusicStreamWithoutRecordingConfig) c01gw.getValue()).strategy != 3 || ((ShootMusicStreamWithoutRecording.ShootMusicStreamWithoutRecordingConfig) c01gw.getValue()).strategy != 2 || i <= ((ShootMusicStreamWithoutRecording.ShootMusicStreamWithoutRecordingConfig) c01gw.getValue()).cacheProgressThreshold || ((ShootMusicStreamWithoutRecording.ShootMusicStreamWithoutRecordingConfig) c01gw.getValue()).strategy != 1 || effectiveConnectionType2 <= ((ShootMusicStreamWithoutRecording.ShootMusicStreamWithoutRecordingConfig) c01gw.getValue()).netLevelThreshold) {
                return false;
            }
        }
        return true;
    }

    public final boolean o2(String str) {
        String str2;
        if (str == null || a0.LJJJIL(str) || (str2 = getShortVideoContext().creativeModel.musicBuzModel.path) == null) {
            return false;
        }
        return Intrinsics.LJFF(str, str2);
    }

    public final void w2(String str) {
        C201955140j.LIZLLL(C201962140q.LIZIZ, "RecordMusicStreamPlayback", str);
    }

    private final void G2(String str, float f, boolean z) {
        if (str != null && !a0.LJJJIL(str) && o2(str)) {
            if (!Intrinsics.LJFF(str, this.LLILLL.LIZ)) {
                C1662300tMK c1662300tMK = this.LLILLL;
                c1662300tMK.LIZ = str;
                c1662300tMK.LIZIZ = f;
                return;
            }
            if (z) {
                C1662300tMK c1662300tMK2 = this.LLILLL;
                c1662300tMK2.getClass();
                c1662300tMK2.LIZIZ = 100.0f;
            }
            C1662300tMK c1662300tMK3 = this.LLILLL;
            if (c1662300tMK3.LIZIZ >= f) {
                return;
            }
            c1662300tMK3.LIZIZ = f;
        }
    }
}
