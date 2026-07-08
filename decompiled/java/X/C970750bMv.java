package X;

import Y.ARunnableS115S0100000_15;
import Y.ARunnableS26S0101000_15;
import com.bytedance.android.live.liveinteract.multimatch.event.MultiMatchAudienceWindowDidChangedEvent;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchAudienceWidgetV2;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceCheckBattleInfoSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: renamed from: X.0bMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970750bMv extends AbstractC945390ai1<InterfaceC970770bMx> {
    public final boolean LL;
    public Room LLILLJJLI;
    public int LLILLL = 1;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public BPEAHandler LLIZ;
    public InterfaceC970770bMx LLIZLLLIL;
    public final C987070bnF LLJ;
    public final AwS629S0100000_15 LLJI;
    public final ARunnableS115S0100000_15 LLJIJIL;

    public static boolean LJJJZ() {
        return C915980Zwa.LJII().LLILZLL(true).size() > 2;
    }

    @Override // X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        IMessageManager iMessageManager;
        C915980Zwa.LJII().LJJLIIIJL(C956620b08.class, this.LLJI);
        this.dataChannel.zQ2(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(this.LLJ);
        }
        BPEAHandler bPEAHandler = this.LLIZ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(this.LLJIJIL);
        }
        this.LLILLJJLI = null;
        this.LLILZ = 0;
        super.detachView();
    }

    public C970750bMv(boolean z) {
        this.LL = z;
        new C098J(2);
        this.LLILZLL = -1;
        this.LLJ = new C987070bnF(this, 5);
        this.LLJI = new AwS629S0100000_15(this, 70);
        this.LLJIJIL = new ARunnableS115S0100000_15(this, 115);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104 A[EDGE_INSN: B:95:0x0104->B:60:0x0104 BREAK  A[LOOP:0: B:55:0x00ef->B:97:?]] */
    @Override // X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attachView(X.InterfaceC970770bMx r7) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C970750bMv.attachView(X.0bMx):void");
    }

    public final void LJJJJLL(int i) {
        boolean zLJI = MethodIDManager.LJI(202136);
        if (this.mView != 0 && getLifeLifecycleOwner() != null && (this.mView instanceof MatchAudienceWidgetV2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkBattleInfo, type = ");
            sbLIZ.append(i);
            sbLIZ.append(", RetryDuration = ");
            LiveMatchAudienceCheckBattleInfoSetting liveMatchAudienceCheckBattleInfoSetting = LiveMatchAudienceCheckBattleInfoSetting.INSTANCE;
            sbLIZ.append(((long) liveMatchAudienceCheckBattleInfoSetting.getEnterRetryDuration()) * 2000);
            sbLIZ.append(", retryCount = ");
            sbLIZ.append(this.LLILZIL);
            C20441214yg.LJIIIZ("MultiMatchAudiencePrese", C2188811AlT.LIZIZ(sbLIZ));
            int i2 = this.LLILZIL;
            if (i2 == 0) {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            } else {
                this.LLILZIL = i2 - 1;
                C473410IhP.LIZJ(new ARunnableS26S0101000_15(i, this, 2), ((long) liveMatchAudienceCheckBattleInfoSetting.getEnterRetryDuration()) * 2000);
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJJJJZI(int i) {
        long jLJJJJJL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request Compensate isNotEmpty ");
        Map<String, List<C974600bT8>> map = C974540bT2.LJJIII;
        sbLIZ.append(!map.isEmpty());
        sbLIZ.append(" scene = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MatchCompensate", C2188811AlT.LIZIZ(sbLIZ));
        if ((!map.isEmpty()) && C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_2V2) {
            C480460Ism.LIZ().getClass();
            MultiMatchApi multiMatchApi = (MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class);
            long channelId = C915980Zwa.LJII().getChannelId();
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                jLJJJJJL = interfaceC973730bRjYf2.LJJJJJL();
            } else {
                jLJJJJJL = 0;
            }
            multiMatchApi.recentContribution(channelId, jLJJJJJL).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0bN1
                /* JADX WARN: Removed duplicated region for block: B:166:0x0331  */
                /* JADX WARN: Removed duplicated region for block: B:170:0x035c  */
                /* JADX WARN: Removed duplicated region for block: B:177:0x0395  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r22) {
                    /*
                        Method dump skipped, instruction units count: 980
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C970810bN1.accept(java.lang.Object):void");
                }
            }, new C09JN() { // from class: X.0bLW
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("MultiMatchAudiencePresenter@edb8.checkBattleScoreCompensation$dispose$2");
                    C20441214yg.LJII((Throwable) obj);
                    C1C7U.LIZIZ("MultiMatchAudiencePresenter@edb8.checkBattleScoreCompensation$dispose$2");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLIIL(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C970750bMv.LJJJLIIL(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJL(List<BattleTeamUser> list, boolean z) {
        MatchBaseWidget matchBaseWidget;
        long jLongValue;
        if ((this.mView instanceof MatchAudienceWidgetV2) && list != null) {
            for (BattleTeamUser battleTeamUser : list) {
                T t = this.mView;
                ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1 = null;
                if (t instanceof MatchAudienceWidgetV2) {
                    matchBaseWidget = (MatchBaseWidget) t;
                } else {
                    matchBaseWidget = null;
                }
                long jLongValue2 = 0;
                if (matchBaseWidget != null) {
                    Long l = battleTeamUser.userId;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    viewOnClickListenerC986770bmlX1 = matchBaseWidget.x1(jLongValue);
                }
                if (viewOnClickListenerC986770bmlX1 == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("showHostsArmies widget is null! teamUsers = ");
                    sbLIZ.append(list);
                    C20441214yg.LJ("MultiMatchAudiencePrese", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    Long l2 = battleTeamUser.score;
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    }
                    viewOnClickListenerC986770bmlX1.t2(jLongValue2, z, 0L, C915980Zwa.LJFF().xB0(), battleTeamUser.enigmaScore);
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            C974450bSt c974450bSt = C973890bRz.LIZ;
            C973890bRz.LJIIJ.put(boolValueOf, list);
        }
    }

    public final void LJJJLZIJ(EnumC918810a19 enumC918810a19, int i, int i2, boolean z) {
        int i3;
        if (enumC918810a19 == EnumC918810a19.StateLinked) {
            int size = C915980Zwa.LJII().LJIJJ().size();
            if (size >= 3) {
                i3 = size - 1;
            } else {
                i3 = 1;
            }
            this.LLILLL = i3;
            this.LLILZ++;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("windowStateChangeMessageSubscriber, currentCallBackCount = ");
            sbLIZ.append(this.LLILZ);
            sbLIZ.append(", enterRoomInitLimit = ");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(", lastChangedWindowPos = ");
            sbLIZ.append(this.LLILZLL);
            sbLIZ.append(" , allUserCount = ");
            sbLIZ.append(i2);
            C20441214yg.LIZIZ("MultiMatchAudiencePrese", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLILZLL == -1) {
                C974540bT2 c974540bT2 = C974540bT2.LIZ;
                C974540bT2.LJIILL = C158B.LIZ();
            }
            int i4 = this.LLILLL;
            if (i4 == 1) {
                if (this.LLILZ == i4) {
                    LJJJLIIL("enterLimit == 1");
                }
            } else if (i2 >= i4 + 1 && z) {
                C473410IhP.LIZIZ(new ARunnableS115S0100000_15(this, 114));
            }
            this.LLILZLL = i;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("currentCallbackCount = ");
            sbLIZ2.append(this.LLILZ);
            sbLIZ2.append(" and windowSize = ");
            sbLIZ2.append(i2);
            C20441214yg.LIZIZ("MultiMatchAudiencePrese", C2188811AlT.LIZIZ(sbLIZ2));
            if (this.LLILZ == i2) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.FQ2(MultiMatchAudienceWindowDidChangedEvent.class);
                }
                this.LLILZ = 0;
            }
        }
    }
}
