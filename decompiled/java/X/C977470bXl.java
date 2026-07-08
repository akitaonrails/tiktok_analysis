package X;

import Y.ARunnableS115S0100000_15;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostWindowViewStateChangeEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977470bXl implements InterfaceC977420bXg {
    public final Function0<Unit> LL;
    public MatchBaseWidget LLILLJJLI;
    public DataChannel LLILLL;
    public final Set<Integer> LLILZ = new LinkedHashSet();
    public List<C954460awe> LLILZIL;
    public final ARunnableS115S0100000_15 LLILZLL;

    @Override // X.InterfaceC977420bXg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
    }

    @Override // X.InterfaceC977420bXg
    public final void LJII(BattleInfoResponse battleInfoResponse) {
    }

    @Override // X.InterfaceC977420bXg
    public final void reset() {
    }

    @Override // X.InterfaceC977430bXh
    public final void dismiss() {
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
        DataChannel dataChannel;
        if (this.LLILLJJLI != null && (dataChannel = this.LLILLL) != null) {
            dataChannel.zQ2(this);
        }
        for (C954460awe c954460awe : C915980Zwa.LJII().LJIJJ()) {
            MatchBaseWidget matchBaseWidget = this.LLILLJJLI;
            if (matchBaseWidget != null && (viewOnClickListenerC986770bmlX1 = matchBaseWidget.x1(c954460awe.LJ)) != null) {
                viewOnClickListenerC986770bmlX1.j0();
            }
        }
    }

    @Override // X.InterfaceC977430bXh
    public final void onUnload() {
        DataChannel dataChannel;
        if (this.LLILLJJLI == null || (dataChannel = this.LLILLL) == null) {
            return;
        }
        dataChannel.zQ2(this);
    }

    public final void LJI() {
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
        if (C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.MATCH_START) < 0) {
            return;
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        long jLJJJJJ = interfaceC973730bRjYf2 != null ? interfaceC973730bRjYf2.LJJJJJ() : 0L;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 == null || (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf22.LJJJJIZL()) == null || (value = mutableLiveDataLJJJJIZL.getValue()) == null) {
            return;
        }
        for (C976480bWA c976480bWA : value) {
            List<C976800bWg> list = c976480bWA.LJFF;
            if (list != null) {
                for (C976800bWg c976800bWg : list) {
                    long j = c976800bWg.LIZ;
                    long j2 = c976800bWg.LJ;
                    long j3 = C915980Zwa.LJFF().Nt() ? c976800bWg.LJI : c976800bWg.LJFF;
                    long j4 = c976800bWg.LJII;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("matchWidget.findWindowById(uid) = null! uid = ");
                    sbLIZ.append(j);
                    sbLIZ.append(" , currentMatchType = ");
                    sbLIZ.append(enumC919170a1jXB0);
                    C20441214yg.LIZIZ("MatchPersonalScoreComponent", C2188811AlT.LIZIZ(sbLIZ));
                    MatchBaseWidget matchBaseWidget = this.LLILLJJLI;
                    if (matchBaseWidget != null && (viewOnClickListenerC986770bmlX1 = matchBaseWidget.x1(j)) != null) {
                        viewOnClickListenerC986770bmlX1.t2(j2, c976480bWA.LIZ == jLJJJJJ, j3, enumC919170a1jXB0, j4);
                    }
                }
            }
        }
    }

    public C977470bXl(AwS559S0100000_15 awS559S0100000_15) {
        this.LL = awS559S0100000_15;
        new BPEAHandler(Looper.getMainLooper());
        this.LLILZLL = new ARunnableS115S0100000_15(this, 89);
    }

    @Override // X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        this.LLILLJJLI = matchBaseWidget;
        this.LLILLL = matchBaseWidget.dataChannel;
        this.LLILZIL = C915980Zwa.LJII().LLILZLL(true);
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null) {
            dataChannel.CQ2(MultiCoHostWindowViewStateChangeEvent.class, this, new C977480bXm(this));
        }
    }

    @Override // X.InterfaceC977420bXg
    public final void LJFF(C975960bVK c975960bVK) {
        this.LLILZIL = C915980Zwa.LJII().LLILZLL(true);
    }
}
