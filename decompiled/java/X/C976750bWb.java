package X;

import Y.AfS184S0100000_15;
import android.os.Handler;
import com.bytedance.android.live.liveinteract.match.business.event.BattleResultAnimationEndEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxAudioStatusChangedChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxBattleInfoUpdatedChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxFollowStatusChangedChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxInteractiveStatusChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxLinkedListChangedChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxMatchStartAnimationEnd;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxMatchStartAnimationShow;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxOpenContributorListChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxVideoStatusChangedChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: renamed from: X.0bWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976750bWb implements InterfaceC975560bUg {
    public MatchBaseWidget LLILZ;
    public C11JF LLIZ;
    public SparkContext LLIZLLLIL;
    public final boolean LL = true;
    public EnumC976730bWZ LLILLJJLI = EnumC976730bWZ.P1;
    public final C01GW<? extends Handler> LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(380));
    public EnumC919170a1j LLILZIL = EnumC919170a1j.UNKNOWN;
    public EnumC964170bCJ LLILZLL = EnumC964170bCJ.NONE;
    public final AwS629S0100000_15 LLJ = new AwS629S0100000_15(this, 59);
    public final AwS629S0100000_15 LLJI = new AwS629S0100000_15(this, 60);

    @Override // X.InterfaceC975560bUg
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void onDestroy() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        DataChannel dataChannelProvideDataChannel;
        DataChannel dataChannelProvideDataChannel2;
        C20441214yg.LIZIZ("InteractionLynxProxyComponent", "onDestroy");
        MatchBaseWidget matchBaseWidget = this.LLILZ;
        if (matchBaseWidget != null && (dataChannelProvideDataChannel2 = matchBaseWidget.provideDataChannel()) != null) {
            dataChannelProvideDataChannel2.zW(LynxInteractiveStatusChannel.class, EnumC976700bWW.NONE);
        }
        MatchBaseWidget matchBaseWidget2 = this.LLILZ;
        if (matchBaseWidget2 != null && (dataChannelProvideDataChannel = matchBaseWidget2.provideDataChannel()) != null) {
            dataChannelProvideDataChannel.zQ2(this);
        }
        C915980Zwa.LJII().LJJLIIIJL(C956640b0A.class, this.LLJ);
        C915980Zwa.LJII().LJJLIIIJL(C956660b0C.class, this.LLJI);
        C11JF c11jf = this.LLIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLIZ = null;
        if (this.LLILLL.isInitialized()) {
            this.LLILLL.getValue().removeCallbacksAndMessages(null);
        }
        SparkContext sparkContext = this.LLIZLLLIL;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        this.LLIZLLLIL = null;
        this.LLILZ = null;
    }

    public C976750bWb() {
        EnumSet.noneOf(EnumC963560bBK.class);
    }

    @Override // X.InterfaceC975560bUg
    public final EnumC976730bWZ getPriority() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        EnumC964170bCJ enumC964170bCJ;
        this.LLILZ = matchBaseWidget;
        DataChannel dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        if (!this.LL && this.LLILZIL.isMatch()) {
            if (dataChannelProvideDataChannel != null) {
                enumC964170bCJ = (EnumC964170bCJ) dataChannelProvideDataChannel.gg0(BattleStateChannel.class);
            } else {
                enumC964170bCJ = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can't transit from ");
            sbLIZ.append(this.LLILZLL);
            sbLIZ.append(" to ");
            sbLIZ.append(enumC964170bCJ);
            C20441214yg.LJ("InteractionLynxProxyComponent", C2188811AlT.LIZIZ(sbLIZ));
            if (enumC964170bCJ == null) {
                enumC964170bCJ = EnumC964170bCJ.NONE;
            }
            LJIILIIL(enumC964170bCJ);
            if (dataChannelProvideDataChannel != null) {
                dataChannelProvideDataChannel.CQ2(BattleStateChannel.class, this, new AwS594S0100000_15(this, 621));
                dataChannelProvideDataChannel.CQ2(LynxMatchStartAnimationShow.class, this, new AwS594S0100000_15(this, 622));
                dataChannelProvideDataChannel.CQ2(LynxMatchStartAnimationEnd.class, this, new AwS594S0100000_15(this, 623));
                dataChannelProvideDataChannel.CQ2(BattleResultAnimationEndEvent.class, this, new AwS594S0100000_15(this, 624));
                dataChannelProvideDataChannel.CQ2(LynxOpenContributorListChannel.class, this, new AwS594S0100000_15(this, 625));
            }
        } else if (dataChannelProvideDataChannel != null) {
            dataChannelProvideDataChannel.CQ2(LynxMatchStartAnimationShow.class, this, new AwS594S0100000_15(this, 622));
            dataChannelProvideDataChannel.CQ2(LynxMatchStartAnimationEnd.class, this, new AwS594S0100000_15(this, 623));
            dataChannelProvideDataChannel.CQ2(BattleResultAnimationEndEvent.class, this, new AwS594S0100000_15(this, 624));
            dataChannelProvideDataChannel.CQ2(LynxOpenContributorListChannel.class, this, new AwS594S0100000_15(this, 625));
        }
        C915980Zwa.LJII().LLLJIL(C956640b0A.class, this.LLJ);
        C915980Zwa.LJII().LLLJIL(C956660b0C.class, this.LLJI);
        this.LLIZ = (C11JF) C784440Upu.LIZ().LJ(C257100z3.class).LJJLL(new AfS184S0100000_15(this, 94), new C09JN() { // from class: X.00RD
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("InteractionLynxProxyComponent@6d33.subscribeUserDeltaSources$2");
                C20441214yg.LJIILIIL("InteractionLynxProxyComponent", "FollowStateChangeEvent error", (Throwable) obj);
                C1C7U.LIZIZ("InteractionLynxProxyComponent@6d33.subscribeUserDeltaSources$2");
            }
        });
    }

    @Override // X.InterfaceC975560bUg
    public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
        DataChannel dataChannelProvideDataChannel;
        MatchBaseWidget matchBaseWidget = this.LLILZ;
        if (matchBaseWidget != null && (dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel()) != null) {
            dataChannelProvideDataChannel.zW(LynxInteractiveStatusChannel.class, EnumC976700bWW.DRAW);
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
        DataChannel dataChannelProvideDataChannel;
        MatchBaseWidget matchBaseWidget = this.LLILZ;
        if (matchBaseWidget != null && (dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel()) != null) {
            dataChannelProvideDataChannel.zW(LynxInteractiveStatusChannel.class, EnumC976700bWW.PUNISH);
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJI(EnumC919170a1j enumC919170a1j) {
        this.LLILZIL = enumC919170a1j;
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
        DataChannel dataChannelProvideDataChannel;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkContext sparkContext = this.LLIZLLLIL;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        this.LLIZLLLIL = null;
        MatchBaseWidget matchBaseWidget = this.LLILZ;
        if (matchBaseWidget != null && (dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel()) != null) {
            dataChannelProvideDataChannel.zW(LynxInteractiveStatusChannel.class, EnumC976700bWW.FINISH);
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
        DataChannel dataChannelProvideDataChannel;
        MatchBaseWidget matchBaseWidget = this.LLILZ;
        if (matchBaseWidget != null && (dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel()) != null) {
            dataChannelProvideDataChannel.zW(LynxInteractiveStatusChannel.class, EnumC976700bWW.SETTLE);
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
        DataChannel dataChannelProvideDataChannel;
        MatchBaseWidget matchBaseWidget = this.LLILZ;
        if (matchBaseWidget != null && (dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel()) != null) {
            dataChannelProvideDataChannel.zW(LynxInteractiveStatusChannel.class, EnumC976700bWW.START);
        }
    }

    public final void LJIILIIL(EnumC964170bCJ enumC964170bCJ) {
        if (C20489615Fm.LIZ(this.LLILZLL, enumC964170bCJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can't transit from ");
            sbLIZ.append(this.LLILZLL);
            sbLIZ.append(" to ");
            sbLIZ.append(enumC964170bCJ);
            C20441214yg.LJ("InteractionLynxProxyComponent", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LLILZLL = enumC964170bCJ;
        int i = C963840bBm.LIZ[enumC964170bCJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        LJIIIIZZ(null);
                        return;
                    }
                    return;
                }
                LJIIIZ(null);
                return;
            }
            LJFF(null);
            return;
        }
        LJIIJJI(null);
    }

    public final void LIZ(LynxCommonData.LinkedUser linkedUser, String str) {
        GenericDeclaration genericDeclaration;
        DataChannel dataChannelProvideDataChannel;
        int iHashCode = str.hashCode();
        if (iHashCode != -1618048163) {
            if (iHashCode != -1268958287) {
                if (iHashCode == 1549165794 && str.equals("audio_mute")) {
                    genericDeclaration = LynxAudioStatusChangedChannel.class;
                } else {
                    return;
                }
            } else if (str.equals("follow")) {
                genericDeclaration = LynxFollowStatusChangedChannel.class;
            } else {
                return;
            }
        } else if (str.equals("video_mute")) {
            genericDeclaration = LynxVideoStatusChangedChannel.class;
        } else {
            return;
        }
        MatchBaseWidget matchBaseWidget = this.LLILZ;
        if (matchBaseWidget != null && (dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel()) != null) {
            dataChannelProvideDataChannel.zW(genericDeclaration, new C978490bZP(linkedUser, str));
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
        DataChannel dataChannelProvideDataChannel;
        MatchBaseWidget matchBaseWidget = this.LLILZ;
        if (matchBaseWidget != null && (dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel()) != null) {
            dataChannelProvideDataChannel.zW(LynxBattleInfoUpdatedChannel.class, battleInfoResponse);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC975560bUg
    public final void vc(List<C954460awe> list, List<C954460awe> list2) {
        ?? arrayList;
        MatchBaseWidget matchBaseWidget;
        DataChannel dataChannelProvideDataChannel;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C954460awe> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(String.valueOf(it2.next().LJ));
        }
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it3 = ((ArrayList) list2).iterator();
            while (it3.hasNext()) {
                arrayList.add(String.valueOf(((C954460awe) it3.next()).LJ));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList2);
        HashSet hashSetLLIFFJFJJ2 = C13LP.LLIFFJFJJ(arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!hashSetLLIFFJFJJ2.contains(obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!hashSetLLIFFJFJJ.contains(obj2)) {
                arrayList4.add(obj2);
            }
        }
        if ((!arrayList3.isEmpty() || !arrayList4.isEmpty()) && (matchBaseWidget = this.LLILZ) != null && (dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel()) != null) {
            dataChannelProvideDataChannel.zW(LynxLinkedListChangedChannel.class, new AnonymousClass0041(arrayList3, arrayList4));
        }
    }
}
