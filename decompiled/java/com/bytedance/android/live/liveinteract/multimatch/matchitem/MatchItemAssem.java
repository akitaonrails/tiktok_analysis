package com.bytedance.android.live.liveinteract.multimatch.matchitem;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C001A;
import X.C01CC;
import X.C09R3;
import X.C0QSJ;
import X.C1144390fsz;
import X.C1144530ftD;
import X.C1144600ftK;
import X.C1144720ftW;
import X.C1144730ftX;
import X.C1144750ftZ;
import X.C1144930ftr;
import X.C1144940fts;
import X.C1145010ftz;
import X.C1145050fu3;
import X.C1145790fvF;
import X.C1161920gLG;
import X.C11JF;
import X.C13LE;
import X.C13LP;
import X.C1548820qPI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C158B;
import X.C19719912Dl;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C389001fE;
import X.C452070Ho5;
import X.C500260Jjc;
import X.C673150Qan;
import X.C687700QyG;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C776250Uch;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C948770anT;
import X.C950220apo;
import X.C970370bMJ;
import X.C973660bRc;
import X.C974800bTS;
import X.C986810bmp;
import X.C986820bmq;
import X.C987150bnN;
import X.EnumC1101860emO;
import X.EnumC1144700ftU;
import X.EnumC919030a1V;
import X.EnumC964170bCJ;
import X.InterfaceC1085330eLj;
import X.InterfaceC1087010eOR;
import X.InterfaceC1144560ftG;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC973730bRj;
import Y.AComparatorS36S0000000_17;
import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleArmiesTop1to3ChangeChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleEnigmaShortTouchEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemCoHostWindowIconsPredictedOrder;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemCriticalDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemExtraTimeDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemSmokeDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateCriticalEffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateExtraTimeEffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateSmokeEffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateTop2EffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateTop3EffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTop2DebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTop3DebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePowerupsUseGuideSendItemEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTeamArmiesTop1to3ChangeChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTerminatedEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop2CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop3CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleVaultBoostingGloveCardEffectChannel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.awardcard.MatchItemAwardCardViewModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.enteranim.IMatchItemEnterAnimAbility;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.smokeanim.ISmokeAnimationAbility;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveMatchEnigmaShortTouchSchemaSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTop2Top3CardSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchItemCardLynxUrlSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class MatchItemAssem extends UISlotAssem implements InterfaceC1144560ftG, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public DataChannel LLJJIJI;
    public boolean LLJJIJIIJIL;
    public Room LLJJIJIL;
    public BattleItem4FEModel LLJJJ;
    public BattleItem4FEModel LLJJJIL;
    public BattleItem4FEModel LLJJJJ;
    public BattleItem4FEModel LLJJJJJIL;
    public BattleItem4FEModel LLJJJJLIIL;
    public BattleItem4FEModel LLJJL;
    public C1144940fts LLJJLIIIJLLLLLLLZ;
    public C1144940fts LLJL;
    public C1144940fts LLJLIL;
    public C1144940fts LLJLILLLLZIIL;
    public C1144940fts LLJLL;
    public C1144940fts LLJLLIL;
    public C1144940fts LLJLLL;
    public C1144940fts LLJZ;
    public C1144940fts LLJZIJLIL;
    public C1144940fts LLL;
    public final String LLLF;
    public final String LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public final AssemVMLazy LLLIIII;
    public C1144390fsz LLLIIIIL;
    public final C987150bnN LLLIIIL;
    public AnonymousClass0956 LLLIIL;
    public long LLLIILIL;
    public final BPEAHandler LLLIL;
    public long LLLILZ;
    public long LLLILZJ;
    public long LLLILZLLLI;
    public long LLLIZZ;
    public long LLLJ;
    public long LLLJIL;
    public final BitSet LLLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MatchItemAssem.class, "vm", "getVm()Lcom/bytedance/android/live/liveinteract/multimatch/matchitem/viewmodel/MatchItemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MatchItemAssem.class, "awardPowerUpViewModel", "getAwardPowerUpViewModel()Lcom/bytedance/android/live/liveinteract/multimatch/matchitem/component/awardcard/MatchItemAwardCardViewModel;", 0);
        c09r3.getClass();
        LLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public static int Tp(long j) {
        if (j == 10000) {
            return 1;
        }
        if (j == 20000) {
            return 2;
        }
        if (j == 30000) {
            return 3;
        }
        if (j == 40000) {
            return 4;
        }
        if (j == 70000) {
            return 7;
        }
        if (j == 80000) {
            return 8;
        }
        return j == 90000 ? 9 : 0;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.h2p;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MatchPowerUpScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MatchPowerUpScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MatchPowerUpScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 2142927800) {
            return null;
        }
        return Vp();
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void Ap() {
        this.LLLJL.clear();
    }

    public final void Ep() {
        List<ItemInfo4FE> list;
        List<ItemInfo4FE> list2;
        BattleItem4FEModel battleItem4FEModel = this.LLJJJIL;
        if (battleItem4FEModel != null && (list = battleItem4FEModel.itemList) != null && !list.isEmpty() && this.LLJJIJIIJIL) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            DataChannel dataChannel = this.LLJJIJI;
            BattleItem4FEModel battleItem4FEModel2 = this.LLJJJIL;
            ItemInfo4FE itemInfo4FE = (battleItem4FEModel2 == null || (list2 = battleItem4FEModel2.itemList) == null) ? null : (ItemInfo4FE) C13LP.LJJLIIIJL(list2);
            C973660bRc c973660bRc2 = C973660bRc.LIZ;
            C1144530ftD.LIZLLL(dataChannel, 2, itemInfo4FE, true, false, false);
        }
        this.LLJJJIL = null;
    }

    public final void Fp() {
        List<ItemInfo4FE> list;
        List<ItemInfo4FE> list2;
        BattleItem4FEModel battleItem4FEModel = this.LLJJJJLIIL;
        if (battleItem4FEModel != null && (list = battleItem4FEModel.itemList) != null && !list.isEmpty() && this.LLJJIJIIJIL) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            DataChannel dataChannel = this.LLJJIJI;
            BattleItem4FEModel battleItem4FEModel2 = this.LLJJJJLIIL;
            ItemInfo4FE itemInfo4FE = (battleItem4FEModel2 == null || (list2 = battleItem4FEModel2.itemList) == null) ? null : (ItemInfo4FE) C13LP.LJJLIIIJL(list2);
            C973660bRc c973660bRc2 = C973660bRc.LIZ;
            C1144530ftD.LIZLLL(dataChannel, 7, itemInfo4FE, true, false, false);
        }
        this.LLJJJJLIIL = null;
    }

    public final void Gp() {
        List<ItemInfo4FE> list;
        List<ItemInfo4FE> list2;
        BattleItem4FEModel battleItem4FEModel = this.LLJJL;
        if (battleItem4FEModel != null && (list = battleItem4FEModel.itemList) != null && !list.isEmpty() && this.LLJJIJIIJIL) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            DataChannel dataChannel = this.LLJJIJI;
            BattleItem4FEModel battleItem4FEModel2 = this.LLJJL;
            ItemInfo4FE itemInfo4FE = (battleItem4FEModel2 == null || (list2 = battleItem4FEModel2.itemList) == null) ? null : (ItemInfo4FE) C13LP.LJJLIIIJL(list2);
            C973660bRc c973660bRc2 = C973660bRc.LIZ;
            C1144530ftD.LIZLLL(dataChannel, 8, itemInfo4FE, true, false, false);
        }
        this.LLJJL = null;
    }

    public final void Ip() {
        List<ItemInfo4FE> list;
        DataChannel dataChannel;
        BattleItem4FEModel battleItem4FEModel = this.LLJJJ;
        if (battleItem4FEModel == null || (list = battleItem4FEModel.itemList) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ItemInfo4FE itemInfo4FE : list) {
            if (itemInfo4FE.itemType == 9) {
                arrayList.add(itemInfo4FE);
            }
        }
        ItemInfo4FE itemInfo4FE2 = (ItemInfo4FE) C13LP.LJJJLL(arrayList);
        this.LLLILZ = itemInfo4FE2 != null ? itemInfo4FE2.itemMultiple : 6L;
        long jLIZ = C158B.LIZ() / 1000;
        ItemInfo4FE itemInfo4FE3 = (ItemInfo4FE) C13LP.LJJJLL(arrayList);
        if (itemInfo4FE3 != null) {
            long j = itemInfo4FE3.effectStartTimeSec;
            ItemInfo4FE itemInfo4FE4 = (ItemInfo4FE) C13LP.LJJJLL(arrayList);
            if (itemInfo4FE4 != null) {
                long j2 = itemInfo4FE4.endAt;
                ItemInfo4FE itemInfo4FE5 = (ItemInfo4FE) C13LP.LJJLIIIJL(arrayList);
                if (itemInfo4FE5 != null) {
                    long j3 = itemInfo4FE5.endAt;
                    this.LLLIL.removeCallbacksAndMessages(null);
                    if (j <= jLIZ || j2 > jLIZ) {
                        DataChannel dataChannel2 = this.LLJJIJI;
                        Object objGg0 = dataChannel2 != null ? dataChannel2.gg0(BattleVaultBoostingGloveCardEffectChannel.class) : null;
                        EnumC919030a1V enumC919030a1V = EnumC919030a1V.EFFECTING;
                        if (objGg0 != enumC919030a1V && (dataChannel = this.LLJJIJI) != null) {
                            dataChannel.zW(BattleVaultBoostingGloveCardEffectChannel.class, enumC919030a1V);
                        }
                    }
                    if (j2 > jLIZ) {
                        C786410Ut5.LJLIIL((j2 - jLIZ) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), this.LLLIL, new ARunnableS115S0100000_15(this, 76));
                    }
                    if (j3 > jLIZ) {
                        C786410Ut5.LJLIIL((j3 - jLIZ) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), this.LLLIL, new ARunnableS115S0100000_15(this, 77));
                    }
                }
            }
        }
    }

    public final MatchItemViewModel Vp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLL;
        return (MatchItemViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C20441214yg.LJ("MatchItemAssem", "onDestory");
        this.LLJJLIIIJLLLLLLLZ = new C1144940fts();
        this.LLJL = new C1144940fts();
        this.LLJLIL = new C1144940fts();
        this.LLJLILLLLZIIL = new C1144940fts();
        this.LLJLL = new C1144940fts();
        this.LLJLLIL = new C1144940fts();
        this.LLJLLL = new C1144940fts();
        this.LLJZ = new C1144940fts();
        this.LLJZIJLIL = new C1144940fts();
        this.LLL = new C1144940fts();
        up();
        Ep();
        yp();
        zp();
        Fp();
        Gp();
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLLIILIL = 0L;
        AnonymousClass0956 anonymousClass0956 = this.LLLIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLIIL = null;
        Bp(true);
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLLIL.removeCallbacksAndMessages(null);
        C1144390fsz c1144390fsz = this.LLLIIIIL;
        if (c1144390fsz != null) {
            C11JF c11jf = c1144390fsz.LIZIZ;
            if (C500260Jjc.LJJIJIIJIL(c11jf != null ? Boolean.valueOf(c11jf.isDisposed()) : null)) {
                C11JF c11jf2 = c1144390fsz.LIZIZ;
                if (c11jf2 != null) {
                    c11jf2.dispose();
                }
                c1144390fsz.LIZIZ = null;
            }
            c1144390fsz.LIZJ = null;
            c1144390fsz.LIZLLL = null;
            C1145050fu3.LIZIZ(c1144390fsz);
        }
        this.LLLIIIIL = null;
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1558520qew.LJIIJJI(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), IMatchItemAbility.class, null);
    }

    public final void up() {
        List<ItemInfo4FE> list;
        List<ItemInfo4FE> list2;
        BattleItem4FEModel battleItem4FEModel = this.LLJJJ;
        if (battleItem4FEModel != null && (list = battleItem4FEModel.itemList) != null && !list.isEmpty() && this.LLJJIJIIJIL) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            DataChannel dataChannel = this.LLJJIJI;
            BattleItem4FEModel battleItem4FEModel2 = this.LLJJJ;
            ItemInfo4FE itemInfo4FE = (battleItem4FEModel2 == null || (list2 = battleItem4FEModel2.itemList) == null) ? null : (ItemInfo4FE) C13LP.LJJLIIIJL(list2);
            C973660bRc c973660bRc2 = C973660bRc.LIZ;
            C1144530ftD.LIZLLL(dataChannel, 1, itemInfo4FE, true, false, false);
        }
        this.LLJJJ = null;
    }

    public final void yp() {
        List<ItemInfo4FE> list;
        List<ItemInfo4FE> list2;
        BattleItem4FEModel battleItem4FEModel = this.LLJJJJ;
        if (battleItem4FEModel != null && (list = battleItem4FEModel.itemList) != null && !list.isEmpty() && this.LLJJIJIIJIL) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            DataChannel dataChannel = this.LLJJIJI;
            BattleItem4FEModel battleItem4FEModel2 = this.LLJJJJ;
            ItemInfo4FE itemInfo4FE = (battleItem4FEModel2 == null || (list2 = battleItem4FEModel2.itemList) == null) ? null : (ItemInfo4FE) C13LP.LJJLIIIJL(list2);
            C973660bRc c973660bRc2 = C973660bRc.LIZ;
            C1144530ftD.LIZLLL(dataChannel, 3, itemInfo4FE, true, false, false);
        }
        this.LLJJJJ = null;
    }

    public final void zp() {
        List<ItemInfo4FE> list;
        List<ItemInfo4FE> list2;
        BattleItem4FEModel battleItem4FEModel = this.LLJJJJJIL;
        if (battleItem4FEModel != null && (list = battleItem4FEModel.itemList) != null && !list.isEmpty() && this.LLJJIJIIJIL) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            DataChannel dataChannel = this.LLJJIJI;
            BattleItem4FEModel battleItem4FEModel2 = this.LLJJJJJIL;
            ItemInfo4FE itemInfo4FE = (battleItem4FEModel2 == null || (list2 = battleItem4FEModel2.itemList) == null) ? null : (ItemInfo4FE) C13LP.LJJLIIIJL(list2);
            C973660bRc c973660bRc2 = C973660bRc.LIZ;
            C1144530ftD.LIZLLL(dataChannel, 4, itemInfo4FE, true, false, false);
        }
        this.LLJJJJJIL = null;
    }

    public MatchItemAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MatchItemViewModel.class);
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(c19719912DlLIZ, 56);
        AFwS254S0000000_17 aFwS254S0000000_17 = AFwS254S0000000_17.get$arr$(28);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS561S0100000_17, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS561S0100000_17((AbstractC738140SxQ) this, 57), aFwS254S0000000_17, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJI = assemVMLazy;
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, C1144600ftK.class, null), checkSupervisorPrepared());
        this.LLJJLIIIJLLLLLLLZ = new C1144940fts();
        this.LLJL = new C1144940fts();
        this.LLJLIL = new C1144940fts();
        this.LLJLILLLLZIIL = new C1144940fts();
        this.LLJLL = new C1144940fts();
        this.LLJLLIL = new C1144940fts();
        this.LLJLLL = new C1144940fts();
        this.LLJZ = new C1144940fts();
        this.LLJZIJLIL = new C1144940fts();
        this.LLL = new C1144940fts();
        this.LLLF = MatchItemCardLynxUrlSetting.INSTANCE.getMatchItemsShortTouch();
        this.LLLFF = LiveMatchEnigmaShortTouchSchemaSetting.INSTANCE.getValue();
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MatchItemAwardCardViewModel.class);
        AwS561S0100000_17 awS561S0100000_172 = new AwS561S0100000_17(c19719912DlLIZ2, 58);
        AFwS254S0000000_17 aFwS254S0000000_172 = AFwS254S0000000_17.get$arr$(29);
        Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(this, c19719912DlLIZ2);
        AssemVMLazy assemVMLazy2 = new AssemVMLazy(function0LJIIJ2, awS561S0100000_172, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS561S0100000_17((AbstractC738140SxQ) this, 59), aFwS254S0000000_172, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ2, assemVMLazy2);
        this.LLLIIII = assemVMLazy2;
        this.LLLIIIL = new C987150bnN(this, 0);
        this.LLLIL = new BPEAHandler(Looper.getMainLooper());
        this.LLLILZJ = -1L;
        this.LLLILZLLLI = -1L;
        this.LLLIZZ = -1L;
        this.LLLJ = -1L;
        this.LLLJIL = -1L;
        this.LLLJL = new BitSet();
    }

    public final IMatchItemEnterAnimAbility Qp() {
        return (IMatchItemEnterAnimAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMatchItemEnterAnimAbility.class, null);
    }

    public final ISmokeAnimationAbility Up() {
        return (ISmokeAnimationAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISmokeAnimationAbility.class, null);
    }

    @Override // X.InterfaceC1144560ftG
    public final Context X8() {
        return getContext();
    }

    @Override // X.InterfaceC1144560ftG
    public final DataChannel getDataChannel() {
        return this.LLJJIJI;
    }

    public static long Jp(ItemInfo4FE itemInfo4FE) {
        return C1144730ftX.LIZJ(itemInfo4FE.effectStartTimeSec, itemInfo4FE.effectLastDuration);
    }

    public static boolean hp(C1144720ftW c1144720ftW) {
        List<ItemInfo4FE> list = c1144720ftW.LL.itemList;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        List<ItemInfo4FE> list2 = c1144720ftW.LLILLJJLI.itemList;
        if (list2 != null && !list2.isEmpty()) {
            return false;
        }
        List<ItemInfo4FE> list3 = c1144720ftW.LLIZ.itemList;
        if (list3 != null && !list3.isEmpty()) {
            return false;
        }
        List<ItemInfo4FE> list4 = c1144720ftW.LLIZLLLIL.itemList;
        if (list4 != null && !list4.isEmpty()) {
            return false;
        }
        List<ItemInfo4FE> list5 = c1144720ftW.LLILLL.itemList;
        if (list5 != null && !list5.isEmpty()) {
            return false;
        }
        List<ItemInfo4FE> list6 = c1144720ftW.LLJ.itemList;
        if (list6 != null && !list6.isEmpty()) {
            return false;
        }
        List<ItemInfo4FE> list7 = c1144720ftW.LLILZ.itemList;
        if (list7 != null && !list7.isEmpty()) {
            return false;
        }
        List<ItemInfo4FE> list8 = c1144720ftW.LLJI.itemList;
        if (list8 != null && !list8.isEmpty()) {
            return false;
        }
        List<ItemInfo4FE> list9 = c1144720ftW.LLILZIL.itemList;
        if (list9 != null && !list9.isEmpty()) {
            return false;
        }
        List<ItemInfo4FE> list10 = c1144720ftW.LLJIJIL.itemList;
        if (list10 != null && !list10.isEmpty()) {
            return false;
        }
        List<ItemInfo4FE> list11 = c1144720ftW.LLILZLL.itemList;
        if (list11 != null && !list11.isEmpty()) {
            return false;
        }
        List<ItemInfo4FE> list12 = c1144720ftW.LLJILJIL.itemList;
        if (list12 != null && !list12.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void Bp(boolean z) {
        InterfaceC1087010eOR interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
        if (interfaceC1087010eOR != null) {
            EnumC1101860emO enumC1101860emO = EnumC1101860emO.NAME;
            interfaceC1087010eOR.Ud(enumC1101860emO, "shortTouchMatchItemsStrike");
            interfaceC1087010eOR.Ud(enumC1101860emO, "shortTouchMatchItemsSmoke");
            interfaceC1087010eOR.Ud(enumC1101860emO, "shortTouchMatchItemsExtraTime");
            if (LiveMatchTop2Top3CardSettings.INSTANCE.getValue()) {
                interfaceC1087010eOR.Ud(enumC1101860emO, "shortTouchMatchItemsTop2");
                interfaceC1087010eOR.Ud(enumC1101860emO, "shortTouchMatchItemsTop3");
            }
            interfaceC1087010eOR.Ud(enumC1101860emO, "shortTouchMatchEnigma");
            C1548820qPI.LJIIIIZZ("ENIGMA_MATCH_SHORT_TOUCH_CLICK", this.LLLIIIL);
            if (z) {
                interfaceC1087010eOR.Ud(enumC1101860emO, "shortTouchMatchItemsHammer");
            }
        }
    }

    public final void dq(C1144720ftW c1144720ftW) {
        C974800bTS c974800bTS;
        ItemInfo4FE itemInfo4FE;
        ItemInfo4FE itemInfo4FE2;
        ItemInfo4FE itemInfo4FE3;
        ItemInfo4FE itemInfo4FE4;
        ItemInfo4FE itemInfo4FE5;
        ItemInfo4FE itemInfo4FE6;
        ItemInfo4FE itemInfo4FE7;
        ItemInfo4FE itemInfo4FE8;
        ItemInfo4FE itemInfo4FE9;
        ItemInfo4FE itemInfo4FE10;
        ItemInfo4FE itemInfo4FE11;
        ItemInfo4FE itemInfo4FE12;
        ItemInfo4FE itemInfo4FE13;
        ItemInfo4FE itemInfo4FE14;
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel == null || (c974800bTS = (C974800bTS) dataChannel.gg0(BattleTimeLeftChannel.class)) == null || c974800bTS.LIZ < 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<ItemInfo4FE> list = c1144720ftW.LL.itemList;
        if (list != null && (itemInfo4FE14 = (ItemInfo4FE) C13LP.LJJJLL(list)) != null) {
            fq(this, arrayList, itemInfo4FE14);
        }
        List<ItemInfo4FE> list2 = c1144720ftW.LLILLJJLI.itemList;
        if (list2 != null && (itemInfo4FE13 = (ItemInfo4FE) C13LP.LJJJLL(list2)) != null) {
            fq(this, arrayList, itemInfo4FE13);
        }
        List<ItemInfo4FE> list3 = c1144720ftW.LLILLL.itemList;
        if (list3 != null && (itemInfo4FE12 = (ItemInfo4FE) C13LP.LJJJLL(list3)) != null) {
            fq(this, arrayList, itemInfo4FE12);
        }
        List<ItemInfo4FE> list4 = c1144720ftW.LLILZ.itemList;
        if (list4 != null && (itemInfo4FE11 = (ItemInfo4FE) C13LP.LJJJLL(list4)) != null) {
            fq(this, arrayList, itemInfo4FE11);
        }
        List<ItemInfo4FE> list5 = c1144720ftW.LLILZIL.itemList;
        if (list5 != null && (itemInfo4FE10 = (ItemInfo4FE) C13LP.LJJJLL(list5)) != null) {
            fq(this, arrayList, itemInfo4FE10);
        }
        List<ItemInfo4FE> list6 = c1144720ftW.LLILZLL.itemList;
        if (list6 != null && (itemInfo4FE9 = (ItemInfo4FE) C13LP.LJJJLL(list6)) != null) {
            fq(this, arrayList, itemInfo4FE9);
        }
        ArrayList arrayList2 = new ArrayList();
        List<ItemInfo4FE> list7 = c1144720ftW.LLIZ.itemList;
        if (list7 != null && (itemInfo4FE8 = (ItemInfo4FE) C13LP.LJJJLL(list7)) != null) {
            fq(this, arrayList2, itemInfo4FE8);
        }
        List<ItemInfo4FE> list8 = c1144720ftW.LLIZLLLIL.itemList;
        if (list8 != null && (itemInfo4FE7 = (ItemInfo4FE) C13LP.LJJJLL(list8)) != null) {
            fq(this, arrayList2, itemInfo4FE7);
        }
        List<ItemInfo4FE> list9 = c1144720ftW.LLJ.itemList;
        if (list9 != null && (itemInfo4FE6 = (ItemInfo4FE) C13LP.LJJJLL(list9)) != null) {
            fq(this, arrayList2, itemInfo4FE6);
        }
        List<ItemInfo4FE> list10 = c1144720ftW.LLJI.itemList;
        if (list10 != null && (itemInfo4FE5 = (ItemInfo4FE) C13LP.LJJJLL(list10)) != null) {
            fq(this, arrayList2, itemInfo4FE5);
        }
        List<ItemInfo4FE> list11 = c1144720ftW.LLJIJIL.itemList;
        if (list11 != null && (itemInfo4FE4 = (ItemInfo4FE) C13LP.LJJJLL(list11)) != null) {
            fq(this, arrayList2, itemInfo4FE4);
        }
        List<ItemInfo4FE> list12 = c1144720ftW.LLJILJIL.itemList;
        if (list12 != null && (itemInfo4FE3 = (ItemInfo4FE) C13LP.LJJJLL(list12)) != null) {
            fq(this, arrayList2, itemInfo4FE3);
        }
        List<ItemInfo4FE> list13 = c1144720ftW.LLJIJIL.itemList;
        if (list13 != null && (itemInfo4FE2 = (ItemInfo4FE) C13LP.LJJJLL(list13)) != null) {
            fq(this, arrayList2, itemInfo4FE2);
        }
        List<ItemInfo4FE> list14 = c1144720ftW.LLJILJIL.itemList;
        if (list14 != null && (itemInfo4FE = (ItemInfo4FE) C13LP.LJJJLL(list14)) != null) {
            fq(this, arrayList2, itemInfo4FE);
        }
        DataChannel dataChannel2 = this.LLJJIJI;
        if (dataChannel2 != null) {
            dataChannel2.zW(BattleItemCoHostWindowIconsPredictedOrder.class, new C986820bmq(arrayList, arrayList2));
        }
    }

    public final void ip(long j) {
        long j2;
        long j3;
        if (j < 0) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLLIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j4 = this.LLLIILIL;
        if (j4 <= jCurrentTimeMillis) {
            j2 = j * 1000;
        } else {
            Long.signum(j);
            j2 = ((j * 1000) + j4) - jCurrentTimeMillis;
        }
        long j5 = j * 1000;
        if (j4 <= jCurrentTimeMillis) {
            j3 = jCurrentTimeMillis + j5;
        } else {
            j3 = j4 + j5;
        }
        this.LLLIILIL = j3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rival special effect delay ");
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLIIL = C500260Jjc.LJJJJJ(this, null, new C1144930ftr(j2, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jq(int r26) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem.jq(int):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        Room room;
        IMessageManager iMessageManager;
        User owner;
        super.onViewCreated(view);
        C20441214yg.LIZIZ("MatchItemAssem", "onViewCreated");
        C20441214yg.LJ("MatchItemAssem", "bind Ability");
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            interfaceC665370Q7zLJIIL = C1558360qeg.LJFF(fragmentLJI, null);
        } else {
            interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        }
        C1558520qew.LJII(interfaceC665370Q7zLJIIL, Vp(), IMatchItemAbility.class, null, null);
        this.LLJJIJI = ((C1144600ftK) this.LLJJIII.getValue()).LLILLJJLI;
        this.LLJJIJIIJIL = ((C1144600ftK) this.LLJJIII.getValue()).LL;
        DataChannel dataChannel = ((C1144600ftK) this.LLJJIII.getValue()).LLILLJJLI;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLJJIJIL = room;
        if (room != null && (owner = room.getOwner()) != null) {
            owner.getId();
        }
        C20441214yg.LIZIZ("MatchItemAssem", "doRefactorLogic");
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 593));
        AssemVMLazy assemVMLazy = this.LLLIIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLL;
        new C1145790fvF(this, this, (MatchItemAwardCardViewModel) assemVMLazy.getValue());
        C1144390fsz c1144390fsz = new C1144390fsz();
        this.LLLIIIIL = c1144390fsz;
        DataChannel dataChannel2 = this.LLJJIJI;
        c1144390fsz.LIZ = dataChannel2;
        C1145050fu3.LIZ(c1144390fsz);
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.GIFT_GUIDE_MESSAGE.getIntType(), c1144390fsz.LJ);
        }
        DataChannel dataChannel3 = this.LLJJIJI;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, BattleTimeLeftChannel.class, new AwS596S0100000_17(this, 36));
            dataChannel3.BQ2(this, BattleStateChannel.class, new AwS596S0100000_17(this, 37));
            dataChannel3.BQ2(this, BattlePowerupsUseGuideSendItemEvent.class, new AwS596S0100000_17(this, 38));
            dataChannel3.CQ2(BattleTerminatedEvent.class, this, new AwS596S0100000_17(this, 39));
            dataChannel3.DQ2(BattleArmiesTop1to3ChangeChannel.class, this, new AwS594S0100000_15(this, 517));
            dataChannel3.DQ2(BattleTeamArmiesTop1to3ChangeChannel.class, this, new AwS594S0100000_15(this, 518));
            dataChannel3.DQ2(BattleTop2CardEffectChannel.class, this, new AwS596S0100000_17(this, 40));
            dataChannel3.DQ2(BattleTop3CardEffectChannel.class, this, new AwS596S0100000_17(this, 41));
            dataChannel3.DQ2(BattleEnigmaShortTouchEvent.class, this, new AwS596S0100000_17(this, 42));
        }
        MatchItemViewModel matchItemViewModelVp = Vp();
        subscribe(matchItemViewModelVp, C736820SvI.LIZIZ(matchItemViewModelVp.usedInReusedScene), null, new AwS631S0100000_17(this, 1));
    }

    public final void sp(List<String> list) {
        List<ItemInfo4FE> list2;
        List<ItemInfo4FE> list3;
        ItemInfo4FE itemInfo4FE;
        ItemInfo4FE itemInfo4FE2;
        List<ItemInfo4FE> list4;
        List<ItemInfo4FE> list5;
        ItemInfo4FE itemInfo4FE3;
        ItemInfo4FE itemInfo4FE4;
        if (!LiveMatchTop2Top3CardSettings.INSTANCE.getValue()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("armyUsers.size = ");
        ArrayList arrayList = (ArrayList) list;
        sbLIZ.append(arrayList.size());
        sbLIZ.append("; currentUserId().toString() = ");
        sbLIZ.append(C950220apo.LJFF());
        C20441214yg.LIZIZ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (arrayList.size() > 1 && Intrinsics.LJFF(ListProtector.get(list, 1), String.valueOf(C950220apo.LJFF())) && (list4 = Vp().getState().LLILZIL.itemList) != null && (!list4.isEmpty()) && (list5 = Vp().getState().LLILZIL.itemList) != null && (itemInfo4FE3 = (ItemInfo4FE) C13LP.LJJJJZI(list5)) != null && !itemInfo4FE3.isTop2cardShown) {
            jq(2);
            List<ItemInfo4FE> list6 = Vp().getState().LLILZIL.itemList;
            if (list6 != null && (itemInfo4FE4 = (ItemInfo4FE) C13LP.LJJJJZI(list6)) != null) {
                itemInfo4FE4.isTop2cardShown = true;
                return;
            }
            return;
        }
        if (arrayList.size() <= 2 || !Intrinsics.LJFF(ListProtector.get(list, 2), String.valueOf(C950220apo.LJFF())) || (list2 = Vp().getState().LLILZLL.itemList) == null || !(!list2.isEmpty()) || (list3 = Vp().getState().LLILZLL.itemList) == null || (itemInfo4FE = (ItemInfo4FE) C13LP.LJJJJZI(list3)) == null || itemInfo4FE.isTop3cardShown) {
            return;
        }
        jq(3);
        List<ItemInfo4FE> list7 = Vp().getState().LLILZIL.itemList;
        if (list7 == null || (itemInfo4FE2 = (ItemInfo4FE) C13LP.LJJJJZI(list7)) == null) {
            return;
        }
        itemInfo4FE2.isTop3cardShown = true;
    }

    public static void aq(int i, EnumC919030a1V enumC919030a1V) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_match_in_battling", C915980Zwa.LJFF().Nt());
        jSONObject.put("team_id", "1");
        jSONObject.put("card_type", i);
        jSONObject.put("card_effect_state", enumC919030a1V.ordinal());
        C389001fE.LIZ("USING_MATCH_POWER_UPS_CARD", jSONObject, System.currentTimeMillis(), false);
    }

    public static void tp(BattleItem4FEModel battleItem4FEModel, String str) {
        InterfaceC1087010eOR interfaceC1087010eOR;
        List<ItemInfo4FE> list;
        if ((battleItem4FEModel == null || (list = battleItem4FEModel.itemList) == null || list.size() <= 1) && (interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)) != null) {
            interfaceC1087010eOR.Ud(EnumC1101860emO.NAME, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Wp(int r17, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel r18) {
        /*
            r16 = this;
            r7 = r16
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.LLJJIJI
            if (r1 == 0) goto L16
            java.lang.Class<com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel> r0 = com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel.class
            java.lang.Object r1 = r1.gg0(r0)
        Lc:
            X.0bCJ r0 = X.EnumC964170bCJ.MATCH_START
            r6 = 4
            r5 = r17
            if (r1 == r0) goto L18
            if (r5 == r6) goto L18
            return
        L16:
            r1 = 0
            goto Lc
        L18:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "initalizeShortTouch short Touch "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = "  & cardModel Json = "
            r2.append(r0)
            com.google.gson.Gson r1 = X.C19748512Ol.LIZIZ
            r3 = r18
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r1, r3)
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r4 = "MatchItemAssem"
            X.C20441214yg.LIZIZ(r4, r0)
            r0 = 1
            java.lang.String r2 = ""
            if (r5 == r0) goto L66
            r0 = 2
            if (r5 == r0) goto L63
            r0 = 3
            if (r5 == r0) goto L60
            if (r5 == r6) goto L5d
            r0 = 7
            if (r5 == r0) goto L5a
            r0 = 8
            if (r5 == r0) goto L57
            r0 = 9
            if (r5 == r0) goto L66
            r9 = r2
            goto L68
        L57:
            java.lang.String r9 = "shortTouchMatchItemsTop3"
            goto L68
        L5a:
            java.lang.String r9 = "shortTouchMatchItemsTop2"
            goto L68
        L5d:
            java.lang.String r9 = "shortTouchMatchItemsHammer"
            goto L68
        L60:
            java.lang.String r9 = "shortTouchMatchItemsExtraTime"
            goto L68
        L63:
            java.lang.String r9 = "shortTouchMatchItemsSmoke"
            goto L68
        L66:
            java.lang.String r9 = "shortTouchMatchItemsStrike"
        L68:
            java.lang.String r10 = r1.LJIILL(r3)     // Catch: java.lang.Exception -> L6f
            if (r10 != 0) goto L79
            goto L78
        L6f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "initalizeShortTouch toJson failed, fallback to empty"
            X.C20441214yg.LJFF(r4, r0, r1)
        L78:
            r10 = r2
        L79:
            java.lang.String r8 = r7.LLLF
            r11 = 0
            java.util.List<com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE> r0 = r3.itemList
            if (r0 == 0) goto L91
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r0 = (com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE) r0
            if (r0 == 0) goto L91
            long r13 = r0.anchorCommunityLevel
        L8b:
            r15 = 8
            Xp(r7, r8, r9, r10, r11, r13, r15)
            return
        L91:
            r13 = 0
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem.Wp(int, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel):void");
    }

    public final void iq(C1144940fts c1144940fts, boolean z) {
        IMatchItemAbility iMatchItemAbility = (IMatchItemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMatchItemAbility.class, null);
        if (iMatchItemAbility != null) {
            iMatchItemAbility.lX0(c1144940fts.LIZ, z, EnumC1144700ftU.ITEM_TIME_EXPIRED);
        }
    }

    public final void kp(int i, BattleItem4FEModel battleItem4FEModel) {
        C974800bTS c974800bTS;
        List<ItemInfo4FE> list;
        ItemInfo4FE itemInfo4FE;
        long j;
        UUID uuidLIZ;
        UUID uuidLIZ2;
        UUID uuidLIZ3;
        UUID uuidLIZ4;
        UUID uuidLIZ5;
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel != null && (c974800bTS = (C974800bTS) dataChannel.gg0(BattleTimeLeftChannel.class)) != null) {
            long j2 = c974800bTS.LIZ - c974800bTS.LIZIZ;
            List<ItemInfo4FE> list2 = battleItem4FEModel.itemList;
            if (list2 != null && !list2.isEmpty() && (list = battleItem4FEModel.itemList) != null && (itemInfo4FE = (ItemInfo4FE) C13LP.LJJJLL(list)) != null) {
                long j3 = itemInfo4FE.effectStartTimeSec;
                if (itemInfo4FE != null) {
                    j = itemInfo4FE.effectLastDuration;
                } else {
                    j = 30;
                }
                long j4 = j3 + j;
                if (j4 > 30 && C158B.LIZIZ() / 1000 <= j4) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 7) {
                                    if (i != 8) {
                                        if (i != 9) {
                                            return;
                                        }
                                    } else {
                                        if (!Intrinsics.LJFF(this.LLL.LIZ, C1145010ftz.LIZ())) {
                                            return;
                                        }
                                        if (itemInfo4FE != null) {
                                            uuidLIZ5 = itemInfo4FE.itemId;
                                        } else {
                                            uuidLIZ5 = C1145010ftz.LIZ();
                                        }
                                        this.LLL = new C1144940fts(uuidLIZ5, j2 - (j4 - (C158B.LIZIZ() / 1000)));
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("calculateBuffCountDownSecond ---->>>topThreeBuffEndInMatchTime = ");
                                        sbLIZ.append(this.LLL);
                                        C20441214yg.LJ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ));
                                        return;
                                    }
                                } else {
                                    if (!Intrinsics.LJFF(this.LLJZIJLIL.LIZ, C1145010ftz.LIZ())) {
                                        return;
                                    }
                                    if (itemInfo4FE != null) {
                                        uuidLIZ4 = itemInfo4FE.itemId;
                                    } else {
                                        uuidLIZ4 = C1145010ftz.LIZ();
                                    }
                                    this.LLJZIJLIL = new C1144940fts(uuidLIZ4, j2 - (j4 - (C158B.LIZIZ() / 1000)));
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("calculateBuffCountDownSecond ---->>>topTwoBuffEndInMatchTime = ");
                                    sbLIZ2.append(this.LLJZIJLIL);
                                    C20441214yg.LJ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ2));
                                    return;
                                }
                            } else {
                                if (!Intrinsics.LJFF(this.LLJZ.LIZ, C1145010ftz.LIZ())) {
                                    return;
                                }
                                if (itemInfo4FE != null) {
                                    uuidLIZ3 = itemInfo4FE.itemId;
                                } else {
                                    uuidLIZ3 = C1145010ftz.LIZ();
                                }
                                this.LLJZ = new C1144940fts(uuidLIZ3, j2 - (j4 - (C158B.LIZIZ() / 1000)));
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("calculateBuffCountDownSecond ---->>>extraBuffEndInMatchTime = ");
                                sbLIZ3.append(this.LLJZ);
                                C20441214yg.LJ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ3));
                                return;
                            }
                        } else {
                            if (!Intrinsics.LJFF(this.LLJLLIL.LIZ, C1145010ftz.LIZ())) {
                                return;
                            }
                            if (itemInfo4FE != null) {
                                uuidLIZ2 = itemInfo4FE.itemId;
                            } else {
                                uuidLIZ2 = C1145010ftz.LIZ();
                            }
                            this.LLJLLIL = new C1144940fts(uuidLIZ2, j2 - (j4 - (C158B.LIZIZ() / 1000)));
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("calculateBuffCountDownSecond ---->>>smokeBuffEndInMatchTime = ");
                            sbLIZ4.append(this.LLJLLIL);
                            C20441214yg.LJ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ4));
                            return;
                        }
                    }
                    if (!Intrinsics.LJFF(this.LLJLLL.LIZ, C1145010ftz.LIZ())) {
                        return;
                    }
                    if (itemInfo4FE != null) {
                        uuidLIZ = itemInfo4FE.itemId;
                    } else {
                        uuidLIZ = C1145010ftz.LIZ();
                    }
                    this.LLJLLL = new C1144940fts(uuidLIZ, j2 - (j4 - (C158B.LIZIZ() / 1000)));
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("calculateBuffCountDownSecond ---->>>criticalBuffEndInMatchTime = ");
                    sbLIZ5.append(this.LLJLLL);
                    C20441214yg.LJ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
        }
    }

    public final void kq(int i, BattleItem4FEModel battleItem4FEModel) {
        Object objGg0;
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(BattleStateChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 != EnumC964170bCJ.MATCH_START && i != 4) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update short Touch ");
        sbLIZ.append(i);
        sbLIZ.append("  & cardModel Json = ");
        Gson gson = C19748512Ol.LIZIZ;
        sbLIZ.append(GsonProtectorUtils.toJson(gson, battleItem4FEModel));
        C20441214yg.LIZIZ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ));
        C389001fE.LIZ("EVENT_MATCH_ITEM_UPDATE", new JSONObject(GsonProtectorUtils.toJson(gson, battleItem4FEModel)), System.currentTimeMillis(), false);
    }

    public static final void fq(MatchItemAssem matchItemAssem, List<ItemInfo4FE> list, ItemInfo4FE itemInfo4FE) {
        matchItemAssem.getClass();
        if (C1144730ftX.LIZJ(itemInfo4FE.effectStartTimeSec, itemInfo4FE.effectLastDuration) <= 1) {
            return;
        }
        int iBinarySearch = Collections.binarySearch(list, itemInfo4FE, new AComparatorS36S0000000_17(3));
        if (iBinarySearch < 0) {
            ListProtector.add(list, (-iBinarySearch) - 1, itemInfo4FE);
        } else {
            ListProtector.add(list, iBinarySearch, itemInfo4FE);
        }
    }

    public final void op(int i, ItemInfo4FE itemInfo4FE, boolean z) {
        C974800bTS c974800bTS;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel != null && (c974800bTS = (C974800bTS) dataChannel.gg0(BattleTimeLeftChannel.class)) != null) {
            long j6 = c974800bTS.LIZIZ;
            long j7 = c974800bTS.LIZ;
            long j8 = j7 - j6;
            if (j7 < 1) {
                C20441214yg.LJ("MatchItemAssem", "PK left time too late");
                return;
            }
            long jLIZJ = C1144730ftX.LIZJ(itemInfo4FE.effectStartTimeSec, itemInfo4FE.effectLastDuration);
            if (jLIZJ <= 1) {
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i != 9) {
                                    return;
                                }
                            } else {
                                long j9 = this.LLLJIL;
                                if (j9 < 0) {
                                    j5 = j8 - jLIZJ;
                                } else {
                                    j5 = j9 - jLIZJ;
                                }
                                this.LLLJIL = j5;
                                DataChannel dataChannel2 = this.LLJJIJI;
                                if (dataChannel2 != null) {
                                    dataChannel2.zW(BattleItemTeamMateTop3EffectTimeLeft.class, new C986810bmp(jLIZJ, itemInfo4FE, z, (C1144750ftZ) null, 24));
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("calculateBuffCountDownSecond ---->>>top3TeamMateBuffEndInMatchTime = ");
                                sbLIZ.append(this.LLLJIL);
                                sbLIZ.append(" countDownSecond = ");
                                sbLIZ.append(jLIZJ);
                                C20441214yg.LJ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ));
                                return;
                            }
                        } else {
                            long j10 = this.LLLJ;
                            if (j10 < 0) {
                                j4 = j8 - jLIZJ;
                            } else {
                                j4 = j10 - jLIZJ;
                            }
                            this.LLLJ = j4;
                            DataChannel dataChannel3 = this.LLJJIJI;
                            if (dataChannel3 != null) {
                                dataChannel3.zW(BattleItemTeamMateTop2EffectTimeLeft.class, new C986810bmp(jLIZJ, itemInfo4FE, z, (C1144750ftZ) null, 24));
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("calculateBuffCountDownSecond ---->>>top2TeamMateBuffEndInMatchTime = ");
                            sbLIZ2.append(this.LLLJ);
                            sbLIZ2.append(" countDownSecond = ");
                            sbLIZ2.append(jLIZJ);
                            C20441214yg.LJ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ2));
                            return;
                        }
                    } else {
                        long j11 = this.LLLIZZ;
                        if (j11 < 0) {
                            j3 = j8 - jLIZJ;
                        } else {
                            j3 = j11 - jLIZJ;
                        }
                        this.LLLIZZ = j3;
                        DataChannel dataChannel4 = this.LLJJIJI;
                        if (dataChannel4 != null) {
                            dataChannel4.zW(BattleItemTeamMateExtraTimeEffectTimeLeft.class, new C986810bmp(jLIZJ, itemInfo4FE, z, (C1144750ftZ) null, 24));
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("calculateBuffCountDownSecond ---->>>extratimeTeamMateEndInMatchTime = ");
                        sbLIZ3.append(this.LLLIZZ);
                        sbLIZ3.append(" countDownSecond = ");
                        sbLIZ3.append(jLIZJ);
                        C20441214yg.LJ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ3));
                        return;
                    }
                } else {
                    long j12 = this.LLLILZJ;
                    if (j12 < 0) {
                        j2 = j8 - jLIZJ;
                    } else {
                        j2 = j12 - jLIZJ;
                    }
                    this.LLLILZJ = j2;
                    DataChannel dataChannel5 = this.LLJJIJI;
                    if (dataChannel5 != null) {
                        dataChannel5.zW(BattleItemTeamMateSmokeEffectTimeLeft.class, new C986810bmp(jLIZJ, itemInfo4FE, z, (C1144750ftZ) null, 24));
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("calculateBuffCountDownSecond ---->>>smokeDebuffEndInMatchTime = ");
                    sbLIZ4.append(this.LLLILZJ);
                    sbLIZ4.append(" countDownSecond = ");
                    sbLIZ4.append(jLIZJ);
                    sbLIZ4.append(", datachannel = ");
                    sbLIZ4.append(this.LLJJIJI);
                    C20441214yg.LJ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ4));
                    return;
                }
            }
            long j13 = this.LLLILZLLLI;
            if (j13 < 0) {
                j = j8 - jLIZJ;
            } else {
                j = j13 - jLIZJ;
            }
            this.LLLILZLLLI = j;
            DataChannel dataChannel6 = this.LLJJIJI;
            if (dataChannel6 != null) {
                dataChannel6.zW(BattleItemTeamMateCriticalEffectTimeLeft.class, new C986810bmp(jLIZJ, itemInfo4FE, z, (C1144750ftZ) null, 24));
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("calculateBuffCountDownSecond ---->>>criticalTeamMateEndInMatchTime = ");
            sbLIZ5.append(this.LLLILZLLLI);
            sbLIZ5.append(" countDownSecond = ");
            sbLIZ5.append(jLIZJ);
            C20441214yg.LJ("MatchItemAssem", C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    public final void lp(int i, long j, ItemInfo4FE itemInfo4FE, boolean z) {
        C974800bTS c974800bTS;
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel != null && (c974800bTS = (C974800bTS) dataChannel.gg0(BattleTimeLeftChannel.class)) != null) {
            long j2 = c974800bTS.LIZIZ;
            long j3 = c974800bTS.LIZ;
            long j4 = j3 - j2;
            if (j3 < 1 && itemInfo4FE.itemType != 4) {
                C20441214yg.LJ("MatchItemAssem", "PK left time too late");
                return;
            }
            C1144750ftZ c1144750ftZYk2 = null;
            IMatchItemAbility iMatchItemAbility = (IMatchItemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMatchItemAbility.class, null);
            if (iMatchItemAbility != null) {
                c1144750ftZYk2 = iMatchItemAbility.yk2(itemInfo4FE.itemId);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i != 9) {
                                    return;
                                }
                            } else {
                                C1144940fts c1144940fts = this.LLJLL;
                                long j5 = c1144940fts.LIZIZ;
                                if (j5 < 0) {
                                    this.LLJLL = new C1144940fts(itemInfo4FE.itemId, j4 - j);
                                } else {
                                    c1144940fts.LIZIZ = j5 - j;
                                }
                                DataChannel dataChannel2 = this.LLJJIJI;
                                if (dataChannel2 != null) {
                                    dataChannel2.zW(BattleItemTop3DebuffTimeLeft.class, new C986810bmp(j, itemInfo4FE, true, c1144750ftZYk2, z));
                                }
                                C20441214yg.LJ("MatchItemAssem", "calculateBuffCountDownSecond ---->>>topThreeDebuffEndInMatchTime = " + this.LLJLL + " countDownSecond = " + j);
                                return;
                            }
                        } else {
                            C1144940fts c1144940fts2 = this.LLJLILLLLZIIL;
                            long j6 = c1144940fts2.LIZIZ;
                            if (j6 < 0) {
                                this.LLJLILLLLZIIL = new C1144940fts(itemInfo4FE.itemId, j4 - j);
                            } else {
                                c1144940fts2.LIZIZ = j6 - j;
                            }
                            DataChannel dataChannel3 = this.LLJJIJI;
                            if (dataChannel3 != null) {
                                dataChannel3.zW(BattleItemTop2DebuffTimeLeft.class, new C986810bmp(j, itemInfo4FE, true, c1144750ftZYk2, z));
                            }
                            C20441214yg.LJ("MatchItemAssem", "calculateBuffCountDownSecond ---->>>topTwoDebuffEndInMatchTime = " + this.LLJLILLLLZIIL + " countDownSecond = " + j);
                            return;
                        }
                    } else {
                        C1144940fts c1144940fts3 = this.LLJLIL;
                        long j7 = c1144940fts3.LIZIZ;
                        if (j7 < 0) {
                            this.LLJLIL = new C1144940fts(itemInfo4FE.itemId, j4 - j);
                        } else {
                            c1144940fts3.LIZIZ = j7 - j;
                        }
                        DataChannel dataChannel4 = this.LLJJIJI;
                        if (dataChannel4 != null) {
                            dataChannel4.zW(BattleItemExtraTimeDebuffTimeLeft.class, new C986810bmp(j, itemInfo4FE, true, c1144750ftZYk2, z));
                        }
                        C20441214yg.LJ("MatchItemAssem", "calculateBuffCountDownSecond ---->>>criticalDebuffEndInMatchTime = " + this.LLJLIL + " countDownSecond = " + j);
                        return;
                    }
                } else {
                    C1144940fts c1144940fts4 = this.LLJJLIIIJLLLLLLLZ;
                    long j8 = c1144940fts4.LIZIZ;
                    if (j8 == -1000) {
                        this.LLJJLIIIJLLLLLLLZ = new C1144940fts(itemInfo4FE.itemId, j4 - j);
                    } else {
                        c1144940fts4.LIZIZ = j8 - j;
                    }
                    DataChannel dataChannel5 = this.LLJJIJI;
                    if (dataChannel5 != null) {
                        dataChannel5.zW(BattleItemSmokeDebuffTimeLeft.class, new C986810bmp(j, itemInfo4FE, true, c1144750ftZYk2, z));
                    }
                    C20441214yg.LJ("MatchItemAssem", "calculateBuffCountDownSecond ---->>>smokeDebuffEndInMatchTime = " + this.LLJJLIIIJLLLLLLLZ + " countDownSecond = " + j + ", dataChannel = " + this.LLJJIJI);
                    return;
                }
            }
            C1144940fts c1144940fts5 = this.LLJL;
            long j9 = c1144940fts5.LIZIZ;
            if (j9 < 0) {
                this.LLJL = new C1144940fts(itemInfo4FE.itemId, j4 - j);
            } else {
                c1144940fts5.LIZIZ = j9 - j;
            }
            DataChannel dataChannel6 = this.LLJJIJI;
            if (dataChannel6 != null) {
                dataChannel6.zW(BattleItemCriticalDebuffTimeLeft.class, new C986810bmp(j, itemInfo4FE, true, c1144750ftZYk2, z));
            }
            C20441214yg.LJ("MatchItemAssem", "calculateBuffCountDownSecond ---->>>criticalDebuffEndInMatchTime = " + this.LLJL + " countDownSecond = " + j);
        }
    }

    public static void Xp(MatchItemAssem matchItemAssem, String str, String str2, String str3, long j, long j2, int i) {
        Object objGg0;
        Long lValueOf;
        Long lValueOf2;
        String str4;
        String str5;
        String str6;
        String strValueOf;
        String strValueOf2;
        User owner;
        String string;
        String str7 = str3;
        String str8 = "";
        if ((i & 4) != 0) {
            str7 = "";
        }
        long j3 = 0;
        if ((i & 8) != 0) {
            j = 0;
        }
        if ((i & 16) == 0) {
            j3 = j2;
        }
        DataChannel dataChannel = matchItemAssem.LLJJIJI;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(BattleStateChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 != EnumC964170bCJ.MATCH_START && !Intrinsics.LJFF(str2, "shortTouchMatchItemsHammer")) {
            return;
        }
        InterfaceC1087010eOR interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
        Context context = matchItemAssem.getContext();
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(str).buildUpon().appendQueryParameter("initial_data", str7);
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
        } else {
            lValueOf = null;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("pk_id", String.valueOf(lValueOf));
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            lValueOf2 = Long.valueOf(interfaceC973730bRjYf22.LJJL());
        } else {
            lValueOf2 = null;
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("channel_id", String.valueOf(lValueOf2));
        Room room = matchItemAssem.LLJJIJIL;
        if (room != null && (owner = room.getOwner()) != null && (string = Long.valueOf(owner.getId()).toString()) != null) {
            str8 = string;
        }
        Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("anchor_id", str8);
        if (matchItemAssem.LLJJIJIIJIL) {
            str4 = "anchor";
        } else {
            str4 = "user";
        }
        Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("user_type", str4);
        String str9 = "1";
        if (matchItemAssem.LLJJIJIIJIL) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter5.appendQueryParameter("is_anchor", str5);
        if (C970370bMJ.LJIIIIZZ()) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter7 = builderAppendQueryParameter6.appendQueryParameter("is_team_match", str6).appendQueryParameter("battle_type", String.valueOf(C970370bMJ.LIZIZ())).appendQueryParameter("sub_match_type", C915980Zwa.LJFF().my());
        C973660bRc c973660bRc = C973660bRc.LIZ;
        String str10 = C973660bRc.LJIIIZ;
        Uri.Builder builderAppendQueryParameter8 = builderAppendQueryParameter7.appendQueryParameter(str10, (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get(str10));
        String str11 = C973660bRc.LJIIJ;
        Uri.Builder builderAppendQueryParameter9 = builderAppendQueryParameter8.appendQueryParameter(str11, (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get(str11));
        if (C948770anT.LJ()) {
            strValueOf = String.valueOf(C915980Zwa.LJII().LJJIIJZLJL().size());
        } else {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter10 = builderAppendQueryParameter9.appendQueryParameter("both_guest_cnt", strValueOf);
        if (C948770anT.LJ()) {
            strValueOf2 = String.valueOf(C915980Zwa.LJII().Uh());
        } else {
            strValueOf2 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter11 = builderAppendQueryParameter10.appendQueryParameter("linker_mode", strValueOf2);
        User.EnigmaInfo enigmaInfo = UserService.getInstance().user().LJIJJLI().enigmaInfo;
        if (enigmaInfo == null || !enigmaInfo.isEnigmaMaskOn) {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        InterfaceC1085330eLj interfaceC1085330eLjVd = interfaceC1087010eOR.Vd(context, builderAppendQueryParameter11.appendQueryParameter("is_enigma", str9).appendQueryParameter("to_user_id", String.valueOf(j)).appendQueryParameter("self_type", C01CC.LIZ(String.valueOf(j))).appendQueryParameter("enigma_count", String.valueOf(C915980Zwa.LJFF().Nt0())).appendQueryParameter("enigma_total_points", String.valueOf(C915980Zwa.LJFF().y90())).appendQueryParameter("fans_club_level", String.valueOf(C973660bRc.LJLLILLLL())).appendQueryParameter("fans_club_status", String.valueOf(C973660bRc.LJLLJ())).appendQueryParameter("anchor_community_level", String.valueOf(j3)).build(), null, str2, null, true);
        if (interfaceC1085330eLjVd == null) {
            return;
        }
        interfaceC1087010eOR.Yd(interfaceC1085330eLjVd, null);
    }
}
