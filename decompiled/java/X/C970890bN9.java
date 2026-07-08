package X;

import Y.ARunnableS115S0100000_15;
import android.os.Looper;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostWindowViewStateChangeEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bN9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970890bN9 implements InterfaceC975560bUg {
    public MatchBaseWidget LL;
    public DataChannel LLILLJJLI;
    public final Set<Integer> LLILLL = new LinkedHashSet();
    public List<C954460awe> LLILZ;
    public C11JF LLILZIL;
    public long LLILZLL;
    public String LLIZ;
    public EnumC976730bWZ LLIZLLLIL;
    public final ARunnableS115S0100000_15 LLJ;

    @Override // X.InterfaceC975560bUg
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJI(EnumC919170a1j enumC919170a1j) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void onDestroy() {
        DataChannel dataChannel;
        if (this.LL != null && (dataChannel = this.LLILLJJLI) != null) {
            dataChannel.zQ2(this);
        }
        C11JF c11jf = this.LLILZIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public C970890bN9() {
        new BPEAHandler(Looper.getMainLooper());
        this.LLIZ = "";
        EnumSet.of(EnumC963560bBK.AUDIENCE);
        this.LLIZLLLIL = EnumC976730bWZ.P1;
        this.LLJ = new ARunnableS115S0100000_15(this, 96);
    }

    @Override // X.InterfaceC975560bUg
    public final EnumC976730bWZ getPriority() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        this.LL = matchBaseWidget;
        this.LLILLJJLI = matchBaseWidget.dataChannel;
        this.LLILZ = C915980Zwa.LJII().LLILZLL(true);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.CQ2(MultiCoHostWindowViewStateChangeEvent.class, this, new AwS594S0100000_15(this, 629));
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
        String layoutId;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || (layoutId = interfaceC937820aVoLJJJJZ.getLayoutId()) == null) {
            layoutId = "";
        }
        this.LLIZ = layoutId;
    }

    @Override // X.InterfaceC975560bUg
    public final void vc(List<C954460awe> list, List<C954460awe> list2) {
        if (list.isEmpty()) {
            return;
        }
        this.LLILZ = list;
    }
}
