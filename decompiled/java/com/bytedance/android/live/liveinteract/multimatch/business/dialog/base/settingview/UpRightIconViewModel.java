package com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.settingview;

import X.AnonymousClass0951;
import X.C09IC;
import X.C0UX6;
import X.C15438062q;
import X.C156900it;
import X.C158B;
import X.C163000js;
import X.C1669660tYC;
import X.C1672250tcN;
import X.C1672260tcO;
import X.C1720506oV;
import X.C1BNE;
import X.C20337914i1;
import X.C2252321DDq;
import X.C748880TZe;
import X.C766270U4b;
import X.C915980Zwa;
import X.C973660bRc;
import X.C975140bU0;
import X.C977650bY3;
import X.C977790bYH;
import X.C978520bZS;
import X.C980020bbs;
import X.EnumC977660bY4;
import X.EnumC979710bbN;
import X.InterfaceC934710aQn;
import X.InterfaceC963450bB9;
import X.InterfaceC975810bV5;
import X.InterfaceC978510bZR;
import X.InterfaceC980390bcT;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchSettingEntranceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchSettingRepositorySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS100S0201000_15;
import kotlin.jvm.internal.AwS30S0010000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class UpRightIconViewModel extends ViewModel {
    public final LifecycleOwner LL;
    public final DataChannel LLILLJJLI;
    public final boolean LLILLL;
    public boolean LLILZ;
    public final Function0<Unit> LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final InterfaceC963450bB9 LLIZ;
    public final LiveSheetFragment LLIZLLLIL;
    public final Function0<Unit> LLJ;
    public final C2252321DDq LLJI;
    public final AnonymousClass0951 LLJIJIL;
    public final InterfaceC975810bV5 LLJILJIL;
    public final InterfaceC978510bZR LLJILJILJ;

    public static boolean vQ2() {
        return LiveMatchTeamPairSetting.INSTANCE.isEnable() || LiveCoHostIcyClashMatchSetting.INSTANCE.isEnable() || C163000js.LIZ();
    }

    public static boolean xQ2() {
        if (InterfaceC980390bcT.Wa.LIZIZ().booleanValue() || !C156900it.LJIIJ()) {
            return false;
        }
        Long lLIZIZ = InterfaceC980390bcT.Va.LIZIZ();
        if (lLIZIZ != null && lLIZIZ.longValue() == 0) {
            return true;
        }
        long jLIZ = C158B.LIZ() - lLIZIZ.longValue();
        return 0 <= jLIZ && jLIZ < 259200000;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        MutableLiveData mutableLiveDataLJIILLIIL;
        if (C163000js.LIZ()) {
            RedDotExtensionKt.LJFF(C0UX6.MATCH_SETTING_AI_COMMENTARY_REDDOT);
        }
        if (xQ2()) {
            RedDotExtensionKt.LJFF(C0UX6.MATCH_SPECIFIC_COMMUNITY_GIFT);
        }
        super.onCleared();
        this.LLJILJILJ.LJIIIIZZ().removeObservers(this.LL);
        InterfaceC975810bV5 interfaceC975810bV5 = this.LLJILJIL;
        if (interfaceC975810bV5 == null || (mutableLiveDataLJIILLIIL = interfaceC975810bV5.LJIILLIIL()) == null) {
            return;
        }
        mutableLiveDataLJIILLIIL.removeObservers(this.LL);
    }

    public final void wQ2() {
        C1672250tcN next;
        if (xQ2()) {
            RedDotExtensionKt.LIZ(C0UX6.MATCH_SPECIFIC_COMMUNITY_GIFT);
            InterfaceC980390bcT.Wa.LJFF(Boolean.TRUE);
        }
        if (LiveMatchSettingEntranceOptSetting.INSTANCE.isEnable() && (C975140bU0.LJII() || C975140bU0.LJFF())) {
            if (C975140bU0.LJII()) {
                C766270U4b.LIZLLL(2131853718);
            } else if (C975140bU0.LJFF()) {
                C766270U4b.LIZLLL(2131853717);
            }
        } else if (LiveCoHostIcyClashMatchSetting.INSTANCE.isEnable()) {
            RedDotExtensionKt.LIZ(C0UX6.MATCH_SETTING_AI_COMMENTARY_REDDOT);
            Iterator<C1672250tcN> it2 = ((C980020bbs) this.LLJI.getValue()).LIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (next.LIZ == EnumC979710bbN.SETTING) {
                        break;
                    }
                }
            }
            C1672250tcN c1672250tcN = next;
            InterfaceC963450bB9 interfaceC963450bB9 = this.LLIZ;
            if (interfaceC963450bB9 != null) {
                interfaceC963450bB9.Rn(EnumC977660bY4.MATCH_OPTION_SETTING, C977790bYH.LIZ(this.LLILLL, c1672250tcN != null ? c1672250tcN.LJIIIIZZ : false, this.LLILLJJLI, AFwS203S0000000_15.get$arr$(150)));
            } else if (this.LLIZLLLIL != null) {
                LinkDialog linkDialogLIZ = C977650bY3.LIZ(this.LL, this.LLILLL, false, this.LLILLJJLI, new AwS559S0100000_15(this, 527));
                DataChannel dataChannel = this.LLILLJJLI;
                linkDialogLIZ.show(dataChannel != null ? (FragmentManager) dataChannel.gg0(C748880TZe.class) : null, "UpRightIconViewModel");
                this.LLILZIL.invoke();
                this.LLIZLLLIL.close();
            }
        } else {
            Function0<Unit> function0 = this.LLJ;
            if (function0 != null) {
                function0.invoke();
            }
            if (LiveMatchTeamPairSetting.INSTANCE.isEnable()) {
                C20337914i1<Integer> c20337914i1 = InterfaceC934710aQn.Bb;
                if (c20337914i1.LIZIZ().intValue() > 0) {
                    c20337914i1.LJFF(3);
                }
            }
        }
        C973660bRc.LIZ.LJJLIIIJLLLLLLLZ(this.LLILLJJLI, this.LLILLL);
    }

    public final void zQ2(boolean z) {
        yQ2(EnumC979710bbN.SETTING, new AwS30S0010000_15(z, 2));
        this.LLILZ = z;
    }

    public final void yQ2(EnumC979710bbN enumC979710bbN, Function1<? super C1672250tcN, C1672250tcN> function1) {
        Object value;
        ArrayList arrayList;
        C2252321DDq c2252321DDq = this.LLJI;
        do {
            value = c2252321DDq.getValue();
            List<C1672250tcN> list = ((C980020bbs) value).LIZ;
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C1672250tcN c1672250tcNInvoke : list) {
                if (c1672250tcNInvoke.LIZ == enumC979710bbN) {
                    c1672250tcNInvoke = function1.invoke(c1672250tcNInvoke);
                }
                arrayList.add(c1672250tcNInvoke);
            }
        } while (!c2252321DDq.compareAndSet(value, new C980020bbs(arrayList)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpRightIconViewModel(LifecycleOwner lifecycleOwner, DataChannel dataChannel, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, InterfaceC963450bB9 interfaceC963450bB9, LiveSheetFragment liveSheetFragment, boolean z3, Function0<Unit> function03) {
        float f;
        this.LL = lifecycleOwner;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
        this.LLIZ = interfaceC963450bB9;
        this.LLIZLLLIL = liveSheetFragment;
        this.LLJ = function03;
        ArrayList arrayList = new ArrayList();
        EnumC979710bbN enumC979710bbN = EnumC979710bbN.SETTING;
        C1672260tcO c1672260tcO = new C1672260tcO(null, C1669660tYC.LLIIIILZ, false, 5);
        float f2 = 1;
        AwS629S0100000_15 awS629S0100000_15 = new AwS629S0100000_15(this, 61);
        if (LiveMatchSettingEntranceOptSetting.INSTANCE.isEnable() && (C975140bU0.LJII() || C975140bU0.LJFF())) {
            f = 0.4f;
        } else {
            f = 1.0f;
        }
        arrayList.add(new C1672250tcN(enumC979710bbN, c1672260tcO, f2, true, awS629S0100000_15, f, 360));
        arrayList.add(new C1672250tcN(EnumC979710bbN.FAQ, new C1672260tcO(null, C1669660tYC.LLZLLLL, false, 5), 0.0f, false, new AwS629S0100000_15(this, 62), 0.0f, 892));
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C980020bbs(arrayList));
        this.LLJI = c2252321DDqLIZ;
        this.LLJIJIL = C09IC.LIZIZ(c2252321DDqLIZ);
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        this.LLJILJIL = interfaceC975810bV5LIZLLL;
        InterfaceC978510bZR interfaceC978510bZRLJI = C915980Zwa.LJI().LJI();
        this.LLJILJILJ = interfaceC978510bZRLJI;
        if (vQ2()) {
            AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(this, 634);
            AwS594S0100000_15 awS594S0100000_152 = new AwS594S0100000_15(this, 635);
            if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
                yQ2(enumC979710bbN, new AwS100S0201000_15(this, C978520bZS.LJIIIZ(), C978520bZS.LJII(), 3));
                interfaceC978510bZRLJI.LJIIIIZZ().observe(this.LL, new C1720506oV(awS594S0100000_15));
                interfaceC978510bZRLJI.LJI().observe(this.LL, new C1720506oV(awS594S0100000_152));
            } else if (interfaceC975810bV5LIZLLL != null) {
                Integer num = (Integer) interfaceC975810bV5LIZLLL.LJIILLIIL().getValue();
                int iIntValue = num != null ? num.intValue() : 0;
                interfaceC975810bV5LIZLLL.LJJIII(iIntValue);
                yQ2(enumC979710bbN, new AwS100S0201000_15(this, iIntValue, interfaceC975810bV5LIZLLL.LJI().getValue(), 3));
                MutableLiveData mutableLiveDataLJIILLIIL = interfaceC975810bV5LIZLLL.LJIILLIIL();
                if (mutableLiveDataLJIILLIIL != null) {
                    mutableLiveDataLJIILLIIL.observe(this.LL, new C1720506oV(awS594S0100000_15));
                }
                LiveData<GiftMode> liveDataLJI = interfaceC975810bV5LIZLLL.LJI();
                if (liveDataLJI != null) {
                    liveDataLJI.observe(this.LL, new C1720506oV(awS594S0100000_152));
                }
            }
        }
        if (C163000js.LIZ()) {
            RedDotExtensionKt.LJI(null, lifecycleOwner, null, C0UX6.MATCH_SETTING_AI_COMMENTARY_REDDOT, new AwS594S0100000_15(this, 513));
        }
        if (xQ2()) {
            RedDotExtensionKt.LJI(null, lifecycleOwner, null, C0UX6.MATCH_SPECIFIC_COMMUNITY_GIFT, new AwS594S0100000_15(this, 514));
        }
        if (z3) {
            AwS594S0100000_15 awS594S0100000_153 = new AwS594S0100000_15(this, 636);
            if (z) {
                if (dataChannel != null) {
                    dataChannel.BQ2(lifecycleOwner, BattleReMatchStateChannel.class, awS594S0100000_153);
                }
            } else {
                if (dataChannel == null) {
                    return;
                }
                dataChannel.BQ2(lifecycleOwner, BattleStateChannel.class, awS594S0100000_153);
            }
        }
    }
}
