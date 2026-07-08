package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect;

import X.C001A;
import X.C01JX;
import X.C01NB;
import X.C0HZU;
import X.C0IJT;
import X.C11NJ;
import X.C11NZ;
import X.C11PQ;
import X.C11S5;
import X.C158B;
import X.C1701940uOG;
import X.C19475711Hn;
import X.C19487311Lz;
import X.C20441214yg;
import X.C2188811AlT;
import X.C404301hh;
import X.C474500IjA;
import X.C480460Ism;
import X.C517101zt;
import X.C776250Uch;
import X.C917070ZyL;
import X.C924620aAW;
import X.C931610aLn;
import X.C931630aLp;
import X.C940770aaZ;
import X.C954140aw8;
import X.C956820b0S;
import X.C987100bnI;
import X.EnumC931540aLg;
import X.InterfaceC0148002o;
import X.InterfaceC420801kM;
import X.InterfaceC626120Oh8;
import X.InterfaceC665370Q7z;
import X.InterfaceC931620aLo;
import X.InterfaceC938950aXd;
import X.InterfaceC940760aaY;
import Y.AfS175S0100000_6;
import Y.AfS181S0100000_12;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAnchorQuickConnectTipsEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestShowQuickConnectIconAnimationEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestAnchorQuickConnectViewModel;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.android.live.liveinteract.multilive.model.SetQuickCallAutoApproveParams;
import com.bytedance.android.live.liveinteract.multilive.model.SetQuickCallAutoApproveResponse;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestAnchorQuickConnectSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS129S1100000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAnchorQuickConnectViewModel extends AssemViewModel<C931630aLp> implements InterfaceC938950aXd, InterfaceC931620aLo {
    public DataChannel LL;
    public final C11PQ<EnumC931540aLg> LLILLJJLI;
    public final C11PQ<Long> LLILLL;
    public final C11NJ LLILZ;
    public InterfaceC420801kM LLILZIL;
    public C931610aLn LLILZLL;
    public final C19475711Hn LLIZ;
    public final C19475711Hn LLIZLLLIL;
    public boolean LLJ;
    public Long LLJI;
    public final C917070ZyL LLJIJIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0aLp
        };
    }

    public final void wQ2() {
        C11NJ c11nj;
        InterfaceC420801kM interfaceC420801kM = this.LLILZIL;
        if (interfaceC420801kM != null && (c11nj = this.LLILZ) != null) {
            c11nj.LIZJ(interfaceC420801kM);
        }
        this.LLILZIL = null;
    }

    public final EnumC931540aLg yQ2() {
        EnumC931540aLg enumC931540aLgLJLZ = this.LLILLJJLI.LJLZ();
        return enumC931540aLgLJLZ == null ? EnumC931540aLg.IDLE : enumC931540aLgLJLZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ZyL] */
    public MultiGuestAnchorQuickConnectViewModel() {
        C11PQ<EnumC931540aLg> c11pq = new C11PQ<>();
        c11pq.onNext(EnumC931540aLg.IDLE);
        this.LLILLJJLI = c11pq;
        C11PQ<Long> c11pq2 = new C11PQ<>();
        this.LLILLL = c11pq2;
        this.LLILZ = new C11NJ();
        this.LLIZ = new C19475711Hn(c11pq);
        this.LLIZLLLIL = new C19475711Hn(c11pq2);
        this.LLJ = true;
        this.LLJIJIL = new InterfaceC940760aaY() { // from class: X.0ZyL
            @Override // X.InterfaceC940760aaY
            public final void LJFF(int i, String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJI(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJII(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIII(List<C957020b0m> list) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJ(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJIIJIL(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIIJZLJL(C942080acg c942080acg) {
                if (this.LIZ.LLJ && C940770aaZ.LIZ().getDataSource().LJIIIZ().size() > 1) {
                    DataChannel dataChannel = this.LIZ.LL;
                    if (dataChannel != null) {
                        dataChannel.FQ2(MultiGuestAnchorQuickConnectTipsEvent.class);
                    }
                    C20441214yg.LJIIIZ("MultiGuestAnchorQuickConnectViewModel", "postEvent, MultiGuestAnchorQuickConnectTipsEvent");
                }
                this.LIZ.LLJ = false;
            }
        };
    }

    public static void CQ2(MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel) {
        C20441214yg.LJIIIZ("MultiGuestAnchorQuickConnectViewModel", "startQuickConnect");
        if (multiGuestAnchorQuickConnectViewModel.LLILLJJLI.LJLZ() != EnumC931540aLg.CALLING) {
            multiGuestAnchorQuickConnectViewModel.BQ2(1, new AwS381S0200000_15(multiGuestAnchorQuickConnectViewModel, (MultiGuestAnchorQuickConnectViewModel) null, (Function0<Unit>) 0), AFwS245S0000000_12.get$arr$(3));
        }
    }

    public final void AQ2(Long l) {
        if (l == null) {
            DataChannel dataChannel = this.LL;
            if (dataChannel != null) {
                l = (Long) dataChannel.gg0(C956820b0S.class);
            } else {
                l = null;
            }
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.SX0(C956820b0S.class, 0L);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resumeLive, finalQuickConnectionStartTs=");
        sbLIZ.append(l);
        C20441214yg.LJIIIZ("MultiGuestAnchorQuickConnectViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (l != null && l.longValue() != 0) {
            zQ2(l.longValue());
        }
    }

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        IMessageManager iMessageManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy, quickConnectStatus = ");
        sbLIZ.append(yQ2());
        C20441214yg.LJIIIZ("MultiGuestAnchorQuickConnectViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (yQ2() == EnumC931540aLg.CALLING) {
            xQ2("live_end");
        }
        C940770aaZ.LIZ().LJJ(this.LLJIJIL);
        wQ2();
        C931610aLn c931610aLn = this.LLILZLL;
        if (c931610aLn != null) {
            C20441214yg.LIZIZ("QuickConnectMessageChannel", "destroy");
            try {
                DataChannel dataChannel = c931610aLn.LIZ;
                if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
                    iMessageManager.removeMessageListener((OnIMMessageListener) c931610aLn.LIZJ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("QuickConnectMessageChannel", e);
            }
        }
        this.LLILZ.LJ();
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        Long l;
        IMessageManager iMessageManager;
        C20441214yg.LJIIIZ("MultiGuestAnchorQuickConnectViewModel", "onCreate");
        C940770aaZ.LIZ().LJIIZILJ(this.LLJIJIL);
        DataChannel dataChannel = this.LL;
        C931610aLn c931610aLn = new C931610aLn(dataChannel, this);
        C20441214yg.LIZIZ("QuickConnectMessageChannel", "create");
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.M_G_QUICK_CALL_AUTO_APPROVE_MESSAGE.getIntType(), (OnIMMessageListener) c931610aLn.LIZJ);
        }
        this.LLILZLL = c931610aLn;
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(PauseLiveChannel.class, this, new AwS591S0100000_12(this, 31));
        }
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 != null && (l = (Long) dataChannel3.gg0(C956820b0S.class)) != null) {
            AQ2(Long.valueOf(l.longValue()));
        }
        DataChannel dataChannel4 = this.LL;
        if (dataChannel4 != null) {
            dataChannel4.CQ2(MultiCoHostStateChannel.class, this, new AwS594S0100000_15(this, 4));
        }
    }

    public final void vQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelQuickConnect, ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("MultiGuestAnchorQuickConnectViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLJJLI.LJLZ() == EnumC931540aLg.IDLE) {
            return;
        }
        Xr1(null, str);
        BQ2(0, new AwS129S1100000_15(this, str, 4), AFwS245S0000000_12.get$arr$(28));
    }

    public final void xQ2(String str) {
        if (this.LLJI != null) {
            HashMap map = new HashMap();
            C404301hh.LIZIZ(map);
            C924620aAW.LJIIJJI(map);
            map.put("quick_connect_over_reason", str);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_quick_connect_over");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
            this.LLJI = null;
        }
    }

    public final void zQ2(long j) {
        this.LLJI = Long.valueOf(j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onQuickConnectStatusToCalling, startTimeStamp=");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("MultiGuestAnchorQuickConnectViewModel", C2188811AlT.LIZIZ(sbLIZ));
        MultiGuestAnchorQuickConnectSetting multiGuestAnchorQuickConnectSetting = MultiGuestAnchorQuickConnectSetting.INSTANCE;
        if (multiGuestAnchorQuickConnectSetting.isEnableAndLimitTime()) {
            long timeInSecond = multiGuestAnchorQuickConnectSetting.getTimeInSecond() - ((C158B.LIZ() - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("quickCallAutoApproveStartMs=");
            sbLIZ2.append(j);
            sbLIZ2.append(", LiveNtpUtil.currentTimeMillis() = ");
            sbLIZ2.append(C158B.LIZ());
            C20441214yg.LJIIIZ("MultiGuestAnchorQuickConnectViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            if (timeInSecond < 0) {
                timeInSecond = 0;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handleCallingEventWithStartTs remain second: ");
            sbLIZ3.append(timeInSecond);
            C20441214yg.LJIIIZ("MultiGuestAnchorQuickConnectViewModel", C2188811AlT.LIZIZ(sbLIZ3));
            if (timeInSecond > 0) {
                this.LLILLJJLI.onNext(EnumC931540aLg.CALLING);
                wQ2();
                C11NZ.LJJJJJL(0L, 1L, TimeUnit.SECONDS).LJLIIL(1 + timeInSecond).LJJJJZI(new C517101zt(timeInSecond, 0)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS175S0100000_6(this, 0)).LJJIIJZLJL(new C987100bnI(this, 0)).LIZIZ(new InterfaceC626120Oh8<Long>() { // from class: X.0aLl
                    @Override // X.InterfaceC626120Oh8
                    public final void onComplete() {
                        this.LL.wQ2();
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onError(Throwable th) {
                        this.LL.wQ2();
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final /* bridge */ /* synthetic */ void onNext(Long l) {
                        l.longValue();
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                        MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel = this.LL;
                        multiGuestAnchorQuickConnectViewModel.LLILZIL = interfaceC420801kM;
                        C11NJ c11nj = multiGuestAnchorQuickConnectViewModel.LLILZ;
                        if (c11nj != null) {
                            c11nj.LIZ(interfaceC420801kM);
                        }
                    }
                });
                DataChannel dataChannel = this.LL;
                if (dataChannel != null) {
                    dataChannel.LC0(MultiGuestShowQuickConnectIconAnimationEvent.class, new C0HZU(true, null));
                    return;
                }
                return;
            }
            return;
        }
        if (!multiGuestAnchorQuickConnectSetting.isEnableAndNoLimitTime()) {
            return;
        }
        this.LLILLJJLI.onNext(EnumC931540aLg.CALLING);
    }

    @Override // X.InterfaceC931620aLo
    public final void Xr1(Long l, String str) {
        if (l != null && !Intrinsics.LJFF(l, this.LLJI)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("end IM startTs(");
            sbLIZ.append(l);
            sbLIZ.append(")is not equal to currentGoingQuickConnectStartTs(");
            sbLIZ.append(this.LLJI);
            sbLIZ.append("), ignore");
            C20441214yg.LJ("MultiGuestAnchorQuickConnectViewModel", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        xQ2(str);
        this.LLILLJJLI.onNext(EnumC931540aLg.IDLE);
        wQ2();
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.LC0(MultiGuestShowQuickConnectIconAnimationEvent.class, new C0HZU(false, str));
        }
    }

    public final void BQ2(int i, Function1<? super SetQuickCallAutoApproveResponse.ResponseData, Unit> function1, Function1<? super Throwable, Unit> function12) {
        SetQuickCallAutoApproveParams setQuickCallAutoApproveParams = new SetQuickCallAutoApproveParams();
        setQuickCallAutoApproveParams.roomId = C01JX.LJII();
        setQuickCallAutoApproveParams.channelId = C954140aw8.LIZIZ();
        setQuickCallAutoApproveParams.quickCallAutoApprove = i;
        setQuickCallAutoApproveParams.quickCallAutoApproveDurationMs = MultiGuestAnchorQuickConnectSetting.INSTANCE.getTimeInSecond() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZJ(C01NB.LIZ(((IQuickConnectAPI) C480460Ism.LIZLLL(IQuickConnectAPI.class)).setQuickConnect(setQuickCallAutoApproveParams).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new AfS181S0100000_12(function1, 44)).LJIIL(new AfS181S0100000_12(function12, 45))), this.LLILZ, null, null, 30);
    }
}
