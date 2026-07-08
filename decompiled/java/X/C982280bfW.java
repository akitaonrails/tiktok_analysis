package X;

import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.util.Log;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortAniEndEvent;
import com.bytedance.android.live.liveinteract.competition.core.timer.CompetitionCountTimeEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostWindowViewWindowInfoChangeEvent;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostWindowViewStateChangeEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageFinalCallAnimEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveTakeTheStageColor;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveTakeTheStageColorItem;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveTakeTheStageColorListConfigSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982280bfW extends AbstractC982270bfV {
    public final BPEAHandler LLIZLLLIL;
    public MatchBaseWidget LLJ;
    public List<C954460awe> LLJI;
    public List<C954460awe> LLJIJIL;
    public List<C982390bfh> LLJILJIL;
    public boolean LLJILJILJ;
    public final Set<Integer> LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final Map<Integer, RunnableC982290bfX> LLJJIII;
    public C741720T7q LLJJIJI;
    public MatchBaseWidget LLJJIJIIJIL;
    public final ARunnableS115S0100000_15 LLJJIJIL;

    @Override // X.AbstractC982270bfV
    public final String LJIIL() {
        return "TakeTheStageWindowComponent";
    }

    @Override // X.AbstractC982270bfV
    public final boolean LJIJ() {
        return !this.LL;
    }

    public final void LJJ() {
        C981500beG c981500beG;
        if (this.LLJJI) {
            LJIILJJIL("init return");
            return;
        }
        this.LLJJI = true;
        C981480beE c981480beE = this.LLILZIL;
        this.LLJJ = C500260Jjc.LJJJI((c981480beE == null || (c981500beG = c981480beE.LJJIJIIJI) == null) ? null : Boolean.valueOf(c981500beG.LJ()));
        DataChannel dataChannel = this.LLILLJJLI;
        this.LLJJIJI = new C741720T7q(dataChannel);
        if (dataChannel != null) {
            dataChannel.CQ2(CoHostWindowViewWindowInfoChangeEvent.class, this, new AwS594S0100000_15(this, 977));
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(MultiCoHostWindowViewStateChangeEvent.class, this, new AwS594S0100000_15(this, 978));
        }
        DataChannel dataChannel3 = this.LLILLJJLI;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(CompetitionCountTimeEvent.class, this, new AwS594S0100000_15(this, 979));
        }
    }

    public final boolean LJJI() {
        C981500beG c981500beG;
        C981480beE c981480beE = this.LLILZIL;
        if (c981480beE != null && (c981500beG = c981480beE.LJJIJIIJI) != null) {
            return c981500beG.LIZJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("latestModel=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", bizTTSModel=");
        C981480beE c981480beE2 = this.LLILZIL;
        sbLIZ.append(c981480beE2 != null ? c981480beE2.LJJIJIIJI : null);
        LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    @Override // X.AbstractC982270bfV
    public final void LJIIJ() {
        MultiCoHostWindowManager multiCoHostWindowManager;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlLJ;
        super.LJIIJ();
        C741720T7q c741720T7q = this.LLJJIJI;
        if (c741720T7q != null) {
            c741720T7q.LIZ(0, "commonReset");
        }
        LJJII(false);
        this.LLIZLLLIL.removeCallbacks(this.LLJJIJIL);
        Iterator it2 = ((LinkedHashMap) this.LLJJIII).values().iterator();
        while (it2.hasNext()) {
            this.LLIZLLLIL.removeCallbacks((RunnableC982290bfX) it2.next());
        }
        ((LinkedHashMap) this.LLJJIII).clear();
        List<C954460awe> list = this.LLJIJIL;
        if (list != null) {
            for (C954460awe c954460awe : list) {
                MatchBaseWidget matchBaseWidget = this.LLJ;
                if (matchBaseWidget != null && (multiCoHostWindowManager = matchBaseWidget.LLILLJJLI) != null && (viewOnClickListenerC986770bmlLJ = multiCoHostWindowManager.LJ(c954460awe.LJIIJJI)) != null) {
                    viewOnClickListenerC986770bmlLJ.h1();
                }
            }
        }
        this.LLJILLL.clear();
        this.LLJJI = false;
    }

    @Override // X.AbstractC982270bfV
    public final void LJIIZILJ() {
        super.LJIIZILJ();
        LJJ();
        if (this.LL) {
            C954660awy.LJIIIZ = "";
        }
        LJJII(false);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.FQ2(MatchCutShortAniEndEvent.class);
        }
    }

    @Override // X.AbstractC982270bfV, X.InterfaceC977410bXf
    public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
        super.LIZ(abstractC982800bgM);
        if (abstractC982800bgM instanceof C982570bfz) {
            List<C982390bfh> list = ((C982570bfz) abstractC982800bgM).LJFF;
            this.LLJILJIL = list;
            C982430bfl.LIZ("CompetitionScoreChangeMessage", list);
            LJJIII("CompetitionScoreChangeMessage");
        }
    }

    @Override // X.AbstractC982270bfV, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        super.LIZLLL(matchBaseWidget);
        this.LLJ = matchBaseWidget;
        this.LLJJIJIIJIL = matchBaseWidget;
    }

    @Override // X.AbstractC982270bfV
    public final void LJIILL(boolean z) {
        super.LJIILL(z);
        C741720T7q c741720T7q = this.LLJJIJI;
        if (c741720T7q != null) {
            c741720T7q.LIZ(C439101nJ.LIZ(5) + C983390bhJ.LIZ(), "onFinalCallStart");
        }
        LJJII(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFinalCallStart. anim=");
        sbLIZ.append(z);
        LJJIII(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LL && this.LLILLL.invoke() != EnumC974260bSa.PUNISH) {
            C766270U4b.LIZLLL(2131851683);
        }
    }

    public final void LJJII(boolean z) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
        if (!this.LL) {
            return;
        }
        if (z) {
            if (!this.LLJILJILJ) {
                this.LLJILJILJ = true;
                LJIILIIL("updateContainerOffsetY down to 40");
                InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                if (interfaceC954180awCLJIIIZ != null && (interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLJIIIZ.LLIIJLIL()) != null) {
                    interfaceC937900aVwLLIIJLIL2.LJLLLLLL(40.0f, 1, LiveCoHostTakeTheStageFinalCallAnimEnableSetting.INSTANCE.isEnable());
                }
                String str = C954660awy.LJFF;
                C954660awy.LJIIIZ = "";
                return;
            }
            return;
        }
        if (!this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = false;
        LJIILIIL("updateContainerOffsetY set to 0");
        InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ2 == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ2.LLIIJLIL()) == null) {
            return;
        }
        interfaceC937900aVwLLIIJLIL.LJLLLLLL(0.0f, 0, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C982280bfW.LJJIII(java.lang.String):void");
    }

    public static Pair LJIL(long j, List list) {
        C954460awe next;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C982390bfh c982390bfh = (C982390bfh) it2.next();
            Iterator<C954460awe> it3 = listLLILZLL.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    C954460awe c954460awe = next;
                    Iterator<C982710bgD> it4 = c982390bfh.LJI.iterator();
                    int i = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        if (it4.next().LIZ == c954460awe.LJ) {
                            if (i >= 0) {
                                break;
                            }
                        } else {
                            i++;
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C954460awe c954460awe2 = next;
            if (c954460awe2 != null) {
                linkedHashMap.put(Long.valueOf(c954460awe2.LJ), new Pair(Long.valueOf(c982390bfh.LIZJ), Long.valueOf(c982390bfh.LIZIZ)));
            }
        }
        Pair pair = (Pair) linkedHashMap.get(Long.valueOf(j));
        if (pair == null) {
            return new Pair(0L, 0L);
        }
        return pair;
    }

    @Override // X.AbstractC982270bfV, X.InterfaceC977410bXf
    public final void LJ(EnumC974260bSa enumC974260bSa, C981480beE c981480beE) {
        List<C982390bfh> list;
        super.LJ(enumC974260bSa, c981480beE);
        if (enumC974260bSa.compareTo(EnumC974260bSa.START) >= 0 && enumC974260bSa.compareTo(EnumC974260bSa.DRAW) <= 0) {
            if (c981480beE == null || (list = c981480beE.LJIILJJIL) == null) {
                list = C13BV.INSTANCE;
            }
            this.LLJILJIL = list;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStatusChange. curStatus=");
            sbLIZ.append(enumC974260bSa.getStatusName());
            C982430bfl.LIZ(C2188811AlT.LIZIZ(sbLIZ), list);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onStatusChange. curStatus=");
            sbLIZ2.append(enumC974260bSa.getStatusName());
            LJJIII(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.AbstractC982270bfV
    public final void LJIILLIIL(EnumC982500bfs enumC982500bfs, long j) {
        super.LJIILLIIL(enumC982500bfs, j);
        LJJ();
    }

    public C982280bfW(boolean z, DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15, List list) {
        super(z, dataChannel, awS559S0100000_15, list);
        this.LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJIL = C13BV.INSTANCE;
        this.LLJILLL = new LinkedHashSet();
        this.LLJJIII = new LinkedHashMap();
        this.LLJJIJIL = new ARunnableS115S0100000_15(this, 178);
    }

    public final int LJIJJLI(Context context, long j, long j2, boolean z) {
        String str;
        LiveTakeTheStageColor liveTakeTheStageColor;
        C981500beG c981500beG;
        long jLIZJ = 0;
        if (this.LLJJ) {
            if (j2 == 1) {
                return C20736316Cj.LIZIZ(R.attr.er2, context);
            }
            if (j2 == 0) {
                return C20736316Cj.LIZIZ(R.attr.er5, context);
            }
            if (z) {
                return C20736316Cj.LIZIZ(R.attr.ept, context);
            }
            return C20736316Cj.LIZIZ(R.attr.er5, context);
        }
        C981480beE c981480beE = this.LLILZIL;
        if (c981480beE != null && (c981500beG = c981480beE.LJJIJIIJI) != null) {
            jLIZJ = c981500beG.LIZJ(j);
        }
        int i = (int) jLIZJ;
        LiveTakeTheStageColorItem liveTakeTheStageColorItemLIZ = C983930biB.LIZ(LiveTakeTheStageColorListConfigSetting.INSTANCE.getValue(), i);
        if (liveTakeTheStageColorItemLIZ == null || (liveTakeTheStageColor = liveTakeTheStageColorItemLIZ.rankComponentColor) == null || (str = liveTakeTheStageColor.hexStr) == null) {
            str = "";
        }
        int color = 0;
        try {
            color = Color.parseColor(str);
            return color;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return ColorProtector.parseColor("#FF3969");
                        }
                        return color;
                    }
                    return ColorProtector.parseColor("#22A9F2");
                }
                return ColorProtector.parseColor("#F28430");
            }
            return ColorProtector.parseColor("#8B38FF");
        }
    }

    @Override // X.InterfaceC977410bXf
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPerformListChanged stack: ");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLL.invoke() != EnumC974260bSa.START) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onPerformListChanged, curLinkMicSequence=");
            sbLIZ2.append(list);
            sbLIZ2.append(", curPerformSequence=");
            sbLIZ2.append(list2);
            sbLIZ2.append(", curPerformerLinkMicIndex=");
            sbLIZ2.append(i);
            sbLIZ2.append(", newLinkMicSequence=");
            sbLIZ2.append(list3);
            sbLIZ2.append(", newPerformSequence=");
            sbLIZ2.append(list4);
            sbLIZ2.append(", newPerformerLinkMicIndex=");
            sbLIZ2.append(i2);
            LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        this.LLJI = list4;
        this.LLJIJIL = list3;
        LJIILIIL("onPerformListChanged");
        LJJIII("onPerformListChanged");
    }

    public final void LJJIFFI(ViewOnClickListenerC986770bml viewOnClickListenerC986770bml, int i, boolean z, boolean z2, boolean z3, String str) {
        int iHashCode = viewOnClickListenerC986770bml.hashCode();
        RunnableC982290bfX runnableC982290bfX = (RunnableC982290bfX) ((LinkedHashMap) this.LLJJIII).get(Integer.valueOf(iHashCode));
        if (runnableC982290bfX == null) {
            runnableC982290bfX = new RunnableC982290bfX(viewOnClickListenerC986770bml);
        }
        this.LLIZLLLIL.removeCallbacks(runnableC982290bfX, Integer.valueOf(iHashCode));
        boolean z4 = this.LLJJ;
        runnableC982290bfX.LLILLJJLI = i;
        runnableC982290bfX.LLILLL = z;
        runnableC982290bfX.LLILZ = z3;
        runnableC982290bfX.LLILZIL = z2;
        runnableC982290bfX.LLILZLL = z4;
        runnableC982290bfX.LLIZ = str;
        this.LLJJIII.put(Integer.valueOf(iHashCode), runnableC982290bfX);
        C08D5.LIZIZ(this.LLIZLLLIL, runnableC982290bfX, Integer.valueOf(iHashCode), 80L);
    }
}
