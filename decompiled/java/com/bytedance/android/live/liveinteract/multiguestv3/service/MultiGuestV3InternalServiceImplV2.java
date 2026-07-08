package com.bytedance.android.live.liveinteract.multiguestv3.service;

import X.C01GW;
import X.C0IK5;
import X.C1161920gLG;
import X.C20441214yg;
import X.C2097808Js;
import X.C2181461AZc;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C776370Uct;
import X.C915980Zwa;
import X.C917810ZzX;
import X.C923330a8R;
import X.C923340a8S;
import X.C923970a9T;
import X.C927760aFa;
import X.C931800aM6;
import X.C940770aaZ;
import X.C943630afB;
import X.C945150ahd;
import X.C945170ahf;
import X.C945320ahu;
import X.C945380ai0;
import X.C946320ajW;
import X.C948450amx;
import X.C949390aoT;
import X.C949400aoU;
import X.EnumC945180ahg;
import X.EnumC945310aht;
import X.EnumC965730bEp;
import X.InterfaceC1273910jFt;
import X.InterfaceC754220TiG;
import X.InterfaceC923350a8T;
import X.InterfaceC925030aBB;
import X.InterfaceC925040aBC;
import X.InterfaceC937900aVw;
import X.InterfaceC945140ahc;
import X.InterfaceC954180awC;
import X.InterfaceC958970b3v;
import X.InterfaceC964770bDH;
import X.InterfaceC965060bDk;
import X.InterfaceC968210bIp;
import Y.ARunnableS115S0100000_15;
import android.content.Context;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixInfo;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEnableMixModeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestExpandGuestCountVersionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestExpandGuestCountVersionV2Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestExp24q3OptLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestFloatLayoutStyleMapSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSlideFluencyOptSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.VoiceChatSeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
public class MultiGuestV3InternalServiceImplV2 implements IMultiGuestV3InternalServiceV2, InterfaceC968210bIp, InterfaceC923350a8T {
    public Room LL;
    public InterfaceC945140ahc LLILLJJLI;
    public InterfaceC954180awC LLILLL;
    public DataChannel LLILZ;
    public InterfaceC937900aVw LLIZ;
    public final ArrayList<InterfaceC964770bDH> LLILZIL = new ArrayList<>();
    public final ArrayList<InterfaceC958970b3v> LLILZLL = new ArrayList<>();
    public final C946320ajW<C945150ahd, InterfaceC937900aVw> LLIZLLLIL = new C946320ajW<>(5);

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void LJI() {
        C20441214yg.LJIIIZ("MultiGuestV3InternalServiceImplV2", "detach");
        InterfaceC954180awC interfaceC954180awC = this.LLILLL;
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ() && interfaceC954180awC != null) {
            LLLLLLLZIL(interfaceC954180awC);
        }
        this.LLILZ = null;
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIILJJIL(this);
        if (LiveSlideFluencyOptSetting.enableReleaseLinkOpt()) {
            C0IK5.LIZJ(new ARunnableS115S0100000_15(this, 62));
        } else {
            LIZJ(this.LLILLL, "dispose_MultiGuestV3InternalService_detach", false);
            this.LLILLL = null;
            synchronized (this.LLILZIL) {
                try {
                    this.LLILZIL.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            synchronized (this.LLILZLL) {
                try {
                    this.LLILZLL.clear();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        if (C931800aM6.LIZIZ()) {
            return;
        }
        InterfaceC945140ahc interfaceC945140ahc = this.LLILLJJLI;
        if (interfaceC945140ahc != null) {
            interfaceC945140ahc.LJ(this);
        }
        InterfaceC945140ahc interfaceC945140ahc2 = this.LLILLJJLI;
        if (interfaceC945140ahc2 != null) {
            interfaceC945140ahc2.dispose();
        }
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final InterfaceC954180awC LLJLL() {
        C931800aM6.LIZ.getClass();
        return C931800aM6.LIZIZ() ? this.LLILLL : LiveSdkMultiGuestEnableMixModeSetting.isEnable() ? C917810ZzX.LJIIIIZZ() ? C915980Zwa.LJII().LJIIIZ() : C917810ZzX.LJIIIZ() ? this.LLILLL : this.LLILLL : this.LLILLL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void R5() {
        C20441214yg.LJIIIZ("MultiGuestV3InternalServiceImplV2", "disposeLinkMicManager");
        InterfaceC945140ahc interfaceC945140ahc = this.LLILLJJLI;
        if (interfaceC945140ahc != null) {
            interfaceC945140ahc.LJ(this);
        }
        InterfaceC945140ahc interfaceC945140ahc2 = this.LLILLJJLI;
        if (interfaceC945140ahc2 != null) {
            interfaceC945140ahc2.dispose();
        }
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final InterfaceC925030aBB ag() {
        InterfaceC945140ahc interfaceC945140ahc = this.LLILLJJLI;
        if (interfaceC945140ahc != null) {
            return interfaceC945140ahc.ag();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final int ln1() {
        MultiGuestExp24q3OptLayoutSetting multiGuestExp24q3OptLayoutSetting = MultiGuestExp24q3OptLayoutSetting.INSTANCE;
        if (multiGuestExp24q3OptLayoutSetting.getValue() > 0) {
            return multiGuestExp24q3OptLayoutSetting.getValue();
        }
        LiveSdkMultiguestExpandGuestCountVersionV2Setting liveSdkMultiguestExpandGuestCountVersionV2Setting = LiveSdkMultiguestExpandGuestCountVersionV2Setting.INSTANCE;
        return liveSdkMultiguestExpandGuestCountVersionV2Setting.getValue() >= 4 ? liveSdkMultiguestExpandGuestCountVersionV2Setting.getValue() : LiveSdkMultiguestExpandGuestCountVersionSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final InterfaceC954180awC UU1() {
        return this.LLILLL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void Bm2(C927760aFa c927760aFa) {
        InterfaceC945140ahc interfaceC945140ahc = this.LLILLJJLI;
        if (interfaceC945140ahc != null) {
            interfaceC945140ahc.LJ(c927760aFa);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final InterfaceC937900aVw Ci(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLayoutManager, context: ");
        sbLIZ.append(context);
        C20441214yg.LJIIIZ("MultiGuestV3InternalServiceImplV2", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC954180awC interfaceC954180awCLLJLL = LLJLL();
        if (interfaceC954180awCLLJLL != null && interfaceC954180awCLLJLL.LLIIJLIL() != null && !C500260Jjc.LJJIL()) {
            InterfaceC954180awC interfaceC954180awCLLJLL2 = LLJLL();
            if (interfaceC954180awCLLJLL2 == null) {
                return null;
            }
            return interfaceC954180awCLLJLL2.LLIIJLIL();
        }
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZ;
        if (interfaceC937900aVw != null) {
            if (context == null) {
                return interfaceC937900aVw;
            }
        } else if (context == null) {
            C20441214yg.LJ("MultiGuestV3InternalServiceImplV2", "getLayoutManager fail. reason: context is null");
            return null;
        }
        C2181461AZc c2181461AZcL31 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).l31(context, 0L, 0L, "live_voice", EnumC945310aht.PREVIEW_LIVE, true);
        this.LLIZ = c2181461AZcL31;
        return c2181461AZcL31;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void Fe(InterfaceC964770bDH interfaceC964770bDH) {
        synchronized (this.LLILZIL) {
            try {
                if (!this.LLILZIL.contains(interfaceC964770bDH)) {
                    this.LLILZIL.add(interfaceC964770bDH);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJZZIII(interfaceC964770bDH);
        }
    }

    @Override // X.InterfaceC923350a8T
    public final void LIZ(boolean z) {
        Boolean bool;
        InterfaceC954180awC interfaceC954180awC = this.LLILLL;
        if (interfaceC954180awC != null) {
            DataChannel dataChannel = this.LLILZ;
            if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null && bool.booleanValue()) {
                if (C923340a8S.LIZ() != 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            interfaceC954180awC.LJJIFFI(z);
        }
    }

    public final void LIZIZ(InterfaceC954180awC interfaceC954180awC) {
        String strU3;
        boolean zBooleanValue;
        String strLIZLLL;
        Boolean bool;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initLinkMicSession, channelId = ");
        List<String> list = null;
        if (interfaceC954180awC != null) {
            strU3 = interfaceC954180awC.U3();
        } else {
            strU3 = null;
        }
        sbLIZ.append(strU3);
        C20441214yg.LJIIIZ("MultiGuestV3InternalServiceImplV2", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.LLILZIL) {
            try {
                for (InterfaceC964770bDH interfaceC964770bDH : this.LLILZIL) {
                    if (interfaceC954180awC != null) {
                        interfaceC954180awC.LJJZZIII(interfaceC964770bDH);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        synchronized (this.LLILZLL) {
            try {
                for (InterfaceC958970b3v interfaceC958970b3v : this.LLILZLL) {
                    if (interfaceC954180awC != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awC.LLIIJLIL()) != null) {
                        interfaceC937900aVwLLIIJLIL.LJJJJJL(interfaceC958970b3v);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        MixInfo.Builder builder = new MixInfo.Builder();
        Room room = this.LL;
        if (room == null) {
            room = null;
        }
        StreamUrl streamUrl = room.getStreamUrl();
        if (streamUrl != null) {
            strLIZLLL = streamUrl.LIZLLL();
        } else {
            strLIZLLL = null;
        }
        builder.setStreamUrl(strLIZLLL);
        builder.setStreamMixer(null);
        MixInfo mixInfoBuild = builder.build();
        InterfaceC965060bDk interfaceC965060bDk = new InterfaceC965060bDk() { // from class: X.0ahe
            @Override // X.InterfaceC965060bDk
            public final InterfaceC754220TiG create() {
                Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("LIVE_VIDEO_CLIENT_FACTORY");
                if (objLJIIIZ instanceof InterfaceC754220TiG) {
                    return (InterfaceC754220TiG) objLJIIIZ;
                }
                return null;
            }
        };
        C776370Uct c776370Uct = new C776370Uct(this);
        Room room2 = this.LL;
        if (room2 == null) {
            room2 = null;
        }
        StreamUrl streamUrl2 = room2.getStreamUrl();
        if (streamUrl2 != null) {
            list = streamUrl2.pushUrlList;
        }
        C01GW<C949390aoT> c01gw = C949390aoT.LIZJ;
        C949400aoU c949400aoU = new C949400aoU(zBooleanValue, mixInfoBuild, interfaceC965060bDk, false, false, "#000000", c776370Uct, true, null, null, list, C923970a9T.LIZ(), 1816);
        if (interfaceC954180awC != null) {
            interfaceC954180awC.LJLJL(new C945380ai0(AFwS203S0000000_15.get$arr$(130), AFwS203S0000000_15.get$arr$(131), AFwS203S0000000_15.get$arr$(132), this.LLILZ, 2));
            interfaceC954180awC.b9(c949400aoU);
        }
    }

    @Override // X.InterfaceC968210bIp
    public final void LLLLIIL(InterfaceC954180awC interfaceC954180awC) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSessionCreate, ");
        sbLIZ.append(interfaceC954180awC.U3());
        C20441214yg.LJIIIZ("MultiGuestV3InternalServiceImplV2", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(this.LLILLL, interfaceC954180awC) && interfaceC954180awC.LJLIIIL()) {
            this.LLILLL = interfaceC954180awC;
            LIZIZ(interfaceC954180awC);
        }
    }

    @Override // X.InterfaceC968210bIp
    public final void LLLLLLLZIL(InterfaceC954180awC interfaceC954180awC) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSessionDestroy, ");
        sbLIZ.append(interfaceC954180awC.U3());
        C20441214yg.LJIIIZ("MultiGuestV3InternalServiceImplV2", C2188811AlT.LIZIZ(sbLIZ));
        LIZJ(interfaceC954180awC, "dispose_on_session_destroy", false);
        if (Intrinsics.LJFF(this.LLILLL, interfaceC954180awC)) {
            this.LLILLL = null;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final InterfaceC937900aVw PG2(long j) {
        Object next;
        if (C943630afB.LIZ().useInjectedLayoutManager) {
            return null;
        }
        Iterator it2 = C2097808Js.LJIL(this.LLIZLLLIL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C945150ahd) ((Pair) next).getFirst()).LIZ == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Pair pair = (Pair) next;
        if (pair == null) {
            return null;
        }
        return (InterfaceC937900aVw) pair.getSecond();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void VE2(InterfaceC958970b3v interfaceC958970b3v) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        synchronized (this.LLILZLL) {
            try {
                if (!this.LLILZLL.contains(interfaceC958970b3v)) {
                    this.LLILZLL.add(interfaceC958970b3v);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        InterfaceC954180awC interfaceC954180awC = this.LLILLL;
        if (interfaceC954180awC != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awC.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LJJJJJL(interfaceC958970b3v);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void a9(InterfaceC964770bDH interfaceC964770bDH) {
        synchronized (this.LLILZIL) {
            try {
                this.LLILZIL.remove(interfaceC964770bDH);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        InterfaceC954180awC interfaceC954180awC = this.LLILLL;
        if (interfaceC954180awC != null) {
            interfaceC954180awC.LLIFFJFJJ(interfaceC964770bDH);
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null) {
            interfaceC954180awCLJIIIZ.LLIFFJFJJ(interfaceC964770bDH);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void iN2(C927760aFa c927760aFa) {
        InterfaceC945140ahc interfaceC945140ahc = this.LLILLJJLI;
        if (interfaceC945140ahc != null) {
            interfaceC945140ahc.LJII(c927760aFa);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void pn0(String str) {
        C940770aaZ.LIZ().getDataSource().LJIILL();
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZ;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.LJIJ(str);
        }
        this.LLIZ = null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void vq0(InterfaceC958970b3v interfaceC958970b3v) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        synchronized (this.LLILZLL) {
            try {
                this.LLILZLL.remove(interfaceC958970b3v);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        InterfaceC954180awC interfaceC954180awC = this.LLILLL;
        if (interfaceC954180awC != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awC.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LJLJLJ(interfaceC958970b3v);
        }
    }

    public final void LIZJ(InterfaceC954180awC interfaceC954180awC, String str, boolean z) {
        String strU3;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseLinkMicSession, channelId = ");
        if (interfaceC954180awC != null) {
            strU3 = interfaceC954180awC.U3();
        } else {
            strU3 = null;
        }
        sbLIZ.append(strU3);
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("MultiGuestV3InternalServiceImplV2", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.LLILZIL) {
            try {
                for (InterfaceC964770bDH interfaceC964770bDH : this.LLILZIL) {
                    if (interfaceC954180awC != null) {
                        interfaceC954180awC.LLIFFJFJJ(interfaceC964770bDH);
                    }
                }
                if (z) {
                    this.LLILZIL.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        synchronized (this.LLILZLL) {
            try {
                for (InterfaceC958970b3v interfaceC958970b3v : this.LLILZLL) {
                    if (interfaceC954180awC != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awC.LLIIJLIL()) != null) {
                        interfaceC937900aVwLLIIJLIL.LJLJLJ(interfaceC958970b3v);
                    }
                }
                if (z) {
                    this.LLILZLL.clear();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (interfaceC954180awC != null) {
            interfaceC954180awC.LJLJI(str, EnumC965730bEp.INNER);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void Vs1(long j, EnumC945310aht enumC945310aht, String str) {
        if (C943630afB.LIZ().useInjectedLayoutManager) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("releaseLayoutManagerByRoomId skip cache release roomId:");
            sbLIZ.append(j);
            sbLIZ.append(" pageType:");
            sbLIZ.append(enumC945310aht);
            sbLIZ.append(" reason:");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ("MultiGuestV3InternalServiceImplV2", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Set<C945150ahd> setKeySet = this.LLIZLLLIL.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            C945150ahd c945150ahd = (C945150ahd) obj;
            if (c945150ahd.LIZ == j && c945150ahd.LIZIZ == enumC945310aht) {
                arrayList.add(obj);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("releaseLayoutManagerByRoomId roomId:");
        sbLIZ2.append(j);
        sbLIZ2.append(" pageType:");
        sbLIZ2.append(enumC945310aht);
        sbLIZ2.append(" reason:");
        sbLIZ2.append(str);
        sbLIZ2.append(" keysToRemove:");
        sbLIZ2.append(arrayList);
        C20441214yg.LJ("MultiGuestV3InternalServiceImplV2", C2188811AlT.LIZIZ(sbLIZ2));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InterfaceC937900aVw interfaceC937900aVwRemove = this.LLIZLLLIL.remove(it2.next());
            if (interfaceC937900aVwRemove != null) {
                interfaceC937900aVwRemove.LJIJ(str);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void YL2(Context context, Room room, DataChannel dataChannel, String str) {
        boolean zBooleanValue;
        InterfaceC754220TiG interfaceC754220TiG;
        InterfaceC1273910jFt liveCore;
        Boolean bool;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, roomId = ");
        sbLIZ.append(room.getId());
        sbLIZ.append(", channelId = ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("MultiGuestV3InternalServiceImplV2", C2188811AlT.LIZIZ(sbLIZ));
        this.LL = room;
        this.LLILZ = dataChannel;
        InterfaceC925040aBC interfaceC925040aBCBuilder = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).builder();
        if (interfaceC925040aBCBuilder == null) {
            return;
        }
        int i = 0;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        interfaceC925040aBCBuilder.LIZLLL(room);
        interfaceC925040aBCBuilder.LJ(zBooleanValue);
        interfaceC925040aBCBuilder.LIZIZ(dataChannel);
        interfaceC925040aBCBuilder.LIZJ(this.LLIZ);
        this.LLILLJJLI = interfaceC925040aBCBuilder.LIZ(context);
        InterfaceC954180awC interfaceC954180awCLJFF = null;
        this.LLIZ = null;
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            InterfaceC945140ahc interfaceC945140ahc = this.LLILLJJLI;
            if (interfaceC945140ahc != null) {
                interfaceC954180awCLJFF = interfaceC945140ahc.LJIIIZ();
            }
        } else {
            InterfaceC945140ahc interfaceC945140ahc2 = this.LLILLJJLI;
            if (interfaceC945140ahc2 != null) {
                interfaceC954180awCLJFF = interfaceC945140ahc2.LJFF(4, str);
            }
        }
        this.LLILLL = interfaceC954180awCLJFF;
        LIZIZ(interfaceC954180awCLJFF);
        InterfaceC945140ahc interfaceC945140ahc3 = this.LLILLJJLI;
        if (interfaceC945140ahc3 != null) {
            interfaceC945140ahc3.LJII(this);
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LIZ(this);
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("LIVE_VIDEO_CLIENT_FACTORY");
        if ((objLJIIIZ instanceof InterfaceC754220TiG) && (interfaceC754220TiG = (InterfaceC754220TiG) objLJIIIZ) != null && (liveCore = interfaceC754220TiG.getLiveCore()) != null) {
            EnumC945180ahg enumC945180ahg = liveCore.LJJJJL().LJ;
            if (enumC945180ahg != null && C945170ahf.LIZ[enumC945180ahg.ordinal()] == 1) {
                i = 1;
            }
            MultiGuestFloatLayoutStyleMapSettings.INSTANCE.setTTLHStreamRatio(i);
        }
        if (C931800aM6.LIZIZ() && interfaceC954180awCLJFF != null) {
            LLLLIIL(interfaceC954180awCLJFF);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final <T> void kc0(C945320ahu c945320ahu, Class<T> cls, Function1<? super T, Unit> function1, Function2<? super String, ? super C945320ahu, Unit> function2) {
        InterfaceC945140ahc interfaceC945140ahc;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC954180awC interfaceC954180awCLLJLL = LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LLFZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, "MultiGuestV3InternalServiceImplV2#onSeiReceived");
        }
        if (Intrinsics.LJFF(cls, SeiAppData.class)) {
            InterfaceC945140ahc interfaceC945140ahc2 = this.LLILLJJLI;
            if (interfaceC945140ahc2 != null) {
                interfaceC945140ahc2.LIZLLL(c945320ahu, new AwS594S0100000_15(function1, (Function1<? super PosIdentity, Unit>) 464), function2);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(cls, VoiceChatSeiAppData.class) || (interfaceC945140ahc = this.LLILLJJLI) == null) {
            return;
        }
        interfaceC945140ahc.LJI(c945320ahu, new AwS594S0100000_15(function1, (Function1<? super PosIdentity, Unit>) 465), new AwS381S0200000_15(c945320ahu, function2, 60));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final InterfaceC937900aVw yU1(long j, long j2, Context context, EnumC945310aht enumC945310aht, String str, boolean z) {
        C945150ahd c945150ahd = new C945150ahd(j2, enumC945310aht, str);
        boolean z2 = C943630afB.LIZ().useInjectedLayoutManager;
        if (!z2 && this.LLIZLLLIL.containsKey(c945150ahd) && !z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createLayoutManagerV2 use cache roomId:");
            sbLIZ.append(j2);
            sbLIZ.append(", pageType:");
            sbLIZ.append(enumC945310aht);
            sbLIZ.append(", liveType:");
            sbLIZ.append(str);
            sbLIZ.append(", isRoomOwner:");
            sbLIZ.append(false);
            C20441214yg.LJIIIZ("MultiGuestV3InternalServiceImplV2", C2188811AlT.LIZIZ(sbLIZ));
            return this.LLIZLLLIL.get(c945150ahd);
        }
        C2181461AZc c2181461AZcL31 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).l31(context, j, j2, str, enumC945310aht, false);
        if (c2181461AZcL31 != null && !z2) {
            this.LLIZLLLIL.put(c945150ahd, c2181461AZcL31);
        }
        return c2181461AZcL31;
    }
}
