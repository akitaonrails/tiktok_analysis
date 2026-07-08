package X;

import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCatchBeanHighBitrateSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC983420bhM implements InterfaceC977410bXf {
    public final boolean LL;
    public final DataChannel LLILLJJLI;
    public final Function0<EnumC974260bSa> LLILLL;
    public final List<C954460awe> LLILZ;

    @Override // X.InterfaceC977410bXf
    public void LIZ(AbstractC982800bgM abstractC982800bgM) {
    }

    @Override // X.InterfaceC977410bXf
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.InterfaceC977410bXf
    public final void LJIIIZ(C982460bfo c982460bfo) {
    }

    public abstract String LJIIJ();

    public void LJIIIIZZ() {
        AbstractC1273900jFs abstractC1273900jFs;
        LJIIJJI("commonReset");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C983690bhn.LIZ.getClass();
        InterfaceC774130UYh interfaceC774130UYh = C983690bhn.LIZIZ;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.stop();
            C20441214yg.LIZIZ("GameAudioPlayer", "avplayer play stop");
        } else {
            TTVideoEngine tTVideoEngine = C983690bhn.LIZJ;
            if (tTVideoEngine != null) {
                tTVideoEngine.stop();
            }
            C20441214yg.LIZIZ("GameAudioPlayer", "mEngine play stop");
        }
        LJIIL("stop game live core player in commonReset");
        if (this.LL && LiveMatchCatchBeanHighBitrateSetting.INSTANCE.isEnable() && (abstractC1273900jFs = C983690bhn.LIZLLL) != null) {
            abstractC1273900jFs.LJLJLJ(false);
        }
    }

    public void LJIILIIL() {
        LJIIJJI("onCatchBeansStart");
    }

    public void LJIILL() {
        LJIIJJI("onSettleStart");
    }

    @Override // X.InterfaceC977430bXh
    public void dismiss() {
        LJIIJJI("dismiss");
        LJIIIIZZ();
    }

    @Override // X.InterfaceC977430bXh
    public void onUnload() {
        LJIIJJI("onUnload");
        LJIIIIZZ();
    }

    @Override // X.InterfaceC977430bXh
    public void LIZLLL(MatchBaseWidget matchBaseWidget) {
        LJIIJJI("onLoad");
    }

    public final void LJIIJJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("catch_beans_bar_");
        sbLIZ.append(LJIIJ());
        C20441214yg.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    public final void LJIIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("catch_beans_bar_");
        sbLIZ.append(LJIIJ());
        C20441214yg.LJ(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    public void LJIILJJIL(EnumC982500bfs enumC982500bfs) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSettleResult resultType:");
        sbLIZ.append(enumC982500bfs);
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC977410bXf
    public void LJ(EnumC974260bSa enumC974260bSa, C981480beE c981480beE) {
        List<C982390bfh> list;
        EnumC982500bfs enumC982500bfs;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show curStatus:");
        sbLIZ.append(enumC974260bSa);
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        int i = C970870bN7.LIZ[enumC974260bSa.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        LJIILJJIL(EnumC982500bfs.DRAW);
                        return;
                    }
                    return;
                }
                if (c981480beE != null) {
                    list = c981480beE.LJIILJJIL;
                } else {
                    list = null;
                }
                C982390bfh c982390bfhLIZ = C975230bU9.LIZ(C950220apo.LJ(), list);
                if (c982390bfhLIZ == null || (enumC982500bfs = c982390bfhLIZ.LJ) == null) {
                    enumC982500bfs = EnumC982500bfs.UNKNOWN;
                }
                EnumC982500bfs enumC982500bfs2 = EnumC982500bfs.WIN;
                if (enumC982500bfs == enumC982500bfs2) {
                    LJIILJJIL(enumC982500bfs2);
                    return;
                } else {
                    LJIILJJIL(EnumC982500bfs.LOSE);
                    return;
                }
            }
            LJIILL();
            return;
        }
        LJIILIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC983420bhM(boolean z, DataChannel dataChannel, Function0<? extends EnumC974260bSa> function0, List<C954460awe> list) {
        this.LL = z;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = function0;
        this.LLILZ = list;
    }
}
