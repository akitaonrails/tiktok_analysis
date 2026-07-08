package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: renamed from: X.0n6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422020n6m extends AbstractC2255721DQs<InterfaceC1422030n6n> implements InterfaceC1422030n6n, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC332260D0u<Boolean> LLILLL = C1BNE.LIZ(Boolean.valueOf(C1430550nKX.LIZ(o2())));
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1422020n6m.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1422020n6m.class, "legacyToolbarApi", "getLegacyToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZLL = 8;
    }

    public InterfaceC1422030n6n X1() {
        return this;
    }

    private final InterfaceC1460000o62 Z1() {
        return (InterfaceC1460000o62) this.LLILZ.getValue(this, LLILZIL[1]);
    }

    private final VideoPublishEditModel o2() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLILZIL[0]);
    }

    @Override // X.InterfaceC1422030n6n
    public void P3() {
        this.LLILLL.setValue(Boolean.valueOf(C1430550nKX.LIZ(o2())));
        InterfaceC1460000o62 interfaceC1460000o62Z1 = Z1();
        if (interfaceC1460000o62Z1 != null) {
            interfaceC1460000o62Z1.refresh();
        }
    }

    private final void W1() {
        Cut2EditTransferModel cut2EditTransferModel;
        List<AVMusic> musicList;
        AVMusic aVMusic;
        Cut2EditTransferModel cut2EditTransferModel2 = o2().getCut2EditTransferModel();
        if (cut2EditTransferModel2 == null || !cut2EditTransferModel2.getMusicSyncMode() || MusicBeanUtilKt.extractAVMusic(o2().creativeModel.musicBuzModel) != null || (cut2EditTransferModel = o2().getCut2EditTransferModel()) == null || (musicList = cut2EditTransferModel.getMusicList()) == null || (aVMusic = (AVMusic) C13LP.LJJJLZIJ(0, musicList)) == null) {
            return;
        }
        C1452640nuA.LJII(aVMusic, false, o2().creativeModel.musicBuzModel);
        this.LLILLL.setValue(Boolean.valueOf(C1430550nKX.LIZ(o2())));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        W1();
        try {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1453200nv4.class, new AwS388S0200000_22(this, this, 49));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
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

    public final InterfaceC332260D0u<Boolean> w2() {
        return this.LLILLL;
    }

    public C1422020n6m(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
