package X;

import Y.ARunnableS115S0100000_15;
import android.view.View;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayInitEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayStateEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchOppGiftTrayAnchor;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchOppGiftTrayAudience;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.IndexedValue;

/* JADX INFO: renamed from: X.0blL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@InterfaceC1294060jmO
public final class C985890blL implements InterfaceC975560bUg {
    public MatchBaseWidget LL;
    public DataChannel LLILLJJLI;
    public boolean LLILLL;
    public EnumC976730bWZ LLILZ;

    @Override // X.InterfaceC975560bUg
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJI(EnumC919170a1j enumC919170a1j) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void onDestroy() {
        this.LL = null;
        this.LLILLJJLI = null;
    }

    public C985890blL() {
        EnumSet.noneOf(EnumC963560bBK.class);
        this.LLILZ = EnumC976730bWZ.P1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
        C754570Tip c754570Tip;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        boolean z = listLLILZLL.size() == 2 || (this.LLILLL ? LiveMatchOppGiftTrayAnchor.INSTANCE.getValue() : LiveMatchOppGiftTrayAudience.INSTANCE.getValue());
        C717620SCy c717620SCyLLIIL = C13LP.LLIIL(C915980Zwa.LJII().LJJLI());
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        Iterator it2 = c717620SCyLLIIL.iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
            Pair pair = new Pair(Long.valueOf(((C954460awe) indexedValue.LIZIZ).LJ), Integer.valueOf(indexedValue.LIZ));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        C954460awe c954460aweLIZ = C950190apl.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initMatchGiftEvent, windowPosMap = ");
        sbLIZ.append(linkedHashMap);
        sbLIZ.append("; bottomLeftUser = ");
        sbLIZ.append((c954460aweLIZ == null || (c754570Tip = c954460aweLIZ.LJIJJ) == null) ? null : c754570Tip.LIZIZ);
        sbLIZ.append("; legacyTrayEnabled = ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MatchGiftTrayComponent", C2188811AlT.LIZIZ(sbLIZ));
        int size = listLLILZLL.size();
        for (int i = 0; i < size; i++) {
            long j = ((C954460awe) ListProtector.get(listLLILZLL, i)).LJ;
            MatchBaseWidget matchBaseWidget = this.LL;
            View viewFindViewById = (matchBaseWidget == null || (viewOnClickListenerC986770bmlX1 = matchBaseWidget.x1(j)) == null) ? null : viewOnClickListenerC986770bmlX1.findViewById(R.id.dvs);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cl_container_root = ");
            sbLIZ2.append(viewFindViewById);
            sbLIZ2.append("; isHostRoomOwner = ");
            Long lLJIIZILJ = C930540aK4.LJIIZILJ();
            sbLIZ2.append(lLJIIZILJ != null && j == lLJIIZILJ.longValue());
            C20441214yg.LIZIZ("MatchGiftTrayComponent", C2188811AlT.LIZIZ(sbLIZ2));
            WeakReference weakReference = new WeakReference(viewFindViewById);
            Long lValueOf = c954460aweLIZ != null ? Long.valueOf(c954460aweLIZ.LJ) : null;
            boolean z2 = listLLILZLL.size() == 2;
            Long lLJIIZILJ2 = C930540aK4.LJIIZILJ();
            C1133400fbG c1133400fbG = new C1133400fbG(weakReference, j, linkedHashMap, lValueOf, z2, lLJIIZILJ2 != null && j == lLJIIZILJ2.longValue());
            c1133400fbG.LJII = z;
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.LC0(MatchGiftTrayInitEvent.class, c1133400fbG);
            }
        }
    }

    @Override // X.InterfaceC975560bUg
    public final EnumC976730bWZ getPriority() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
        View view;
        MatchBaseWidget matchBaseWidget = this.LL;
        if (matchBaseWidget != null && (view = matchBaseWidget.contentView) != null) {
            HandlerHook.viewPost(view, new ARunnableS115S0100000_15(this, 95));
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        boolean zLJIIZILJ;
        this.LL = matchBaseWidget;
        DataChannel dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        this.LLILLJJLI = dataChannelProvideDataChannel;
        if (dataChannelProvideDataChannel != null) {
            zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannelProvideDataChannel);
        } else {
            zLJIIZILJ = false;
        }
        this.LLILLL = zLJIIZILJ;
    }

    @Override // X.InterfaceC975560bUg
    public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.LC0(MatchGiftTrayStateEvent.class, new C985920blO(EnumC985900blM.PUNISH));
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.LC0(MatchGiftTrayStateEvent.class, new C985920blO(EnumC985900blM.END));
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
        LIZ();
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.LC0(MatchGiftTrayStateEvent.class, new C985920blO(EnumC985900blM.START));
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
        BattleSetting battleSetting;
        MatchBaseWidget matchBaseWidget;
        View view;
        if (!this.LLILLL && (battleSetting = battleInfoResponse.setting) != null) {
            if ((battleSetting.status == 1 || battleSetting.status == 3) && (matchBaseWidget = this.LL) != null && (view = matchBaseWidget.contentView) != null) {
                HandlerHook.viewPost(view, new ARunnableS115S0100000_15(this, 94));
            }
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void vc(List<C954460awe> list, List<C954460awe> list2) {
        MatchBaseWidget matchBaseWidget;
        View view;
        if ((list2 != null && list.size() == ((ArrayList) list2).size()) || (matchBaseWidget = this.LL) == null || (view = matchBaseWidget.contentView) == null) {
            return;
        }
        HandlerHook.viewPost(view, new ARunnableS115S0100000_15(this, 93));
    }
}
