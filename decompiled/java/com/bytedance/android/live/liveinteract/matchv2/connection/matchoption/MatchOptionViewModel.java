package com.bytedance.android.live.liveinteract.matchv2.connection.matchoption;

import X.AnonymousClass0951;
import X.C09IC;
import X.C11JF;
import X.C1776540wKa;
import X.C1BNE;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C497740JfY;
import X.C766270U4b;
import X.C915980Zwa;
import X.C973660bRc;
import X.C978520bZS;
import X.C980380bcS;
import X.C980430bcX;
import X.EnumC980440bcY;
import X.InterfaceC21506019Ek;
import X.InterfaceC963450bB9;
import X.InterfaceC975810bV5;
import X.InterfaceC978510bZR;
import Y.AObserverS219S0100000_15;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchSettingRepositorySetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchSettingsInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS67S0210000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchOptionViewModel extends ViewModel implements InterfaceC21506019Ek {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final InterfaceC963450bB9 LLILLL;
    public final DataChannel LLILZ;
    public final boolean LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final C2252321DDq LLIZ;
    public final AnonymousClass0951 LLIZLLLIL;
    public final C980380bcS LLJ;
    public final InterfaceC975810bV5 LLJI;
    public final InterfaceC978510bZR LLJIJIL;
    public final AObserverS219S0100000_15 LLJILJIL;
    public AwS594S0100000_15 LLJILJILJ;

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeCancelled() {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeProgressed(C1776540wKa c1776540wKa) {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x017c, code lost:
    
        if (1 != 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2() {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.MatchOptionViewModel.yQ2():void");
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        LiveData<GiftMode> liveDataLJI;
        super.onCleared();
        this.LLJILJILJ = null;
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            this.LLJIJIL.LJI().removeObserver(this.LLJILJIL);
        } else {
            InterfaceC975810bV5 interfaceC975810bV5 = this.LLJI;
            if (interfaceC975810bV5 != null && (liveDataLJI = interfaceC975810bV5.LJI()) != null) {
                liveDataLJI.removeObserver(this.LLJILJIL);
            }
        }
        C980380bcS c980380bcS = this.LLJ;
        C11JF c11jf = c980380bcS.LIZIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        c980380bcS.LIZ.LJ();
        C973660bRc.LIZ.LJJZZIII(this.LLILZ, "match_option", this.LL);
        int iLJIIIZ = C978520bZS.LJIIIZ();
        if (iLJIIIZ == 1) {
            GiftMode giftModeLJII = C978520bZS.LJII();
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131856488, giftModeLJII != null ? giftModeLJII.giftName : null));
        } else if (iLJIIIZ == 2) {
            C766270U4b.LIZLLL(2131853058);
        }
    }

    @Override // X.InterfaceC21506019Ek
    public final void onBackStackChanged() {
        yQ2();
    }

    public final void wQ2(int i) {
        Object value;
        Map<Long, MultiMatchPrepareResponse.MatchGameplayPermission> mapLJIJI;
        MultiMatchPrepareResponse.MatchGameplayPermission matchGameplayPermission;
        int i2 = i;
        if (i2 == ((C980430bcX) this.LLIZLLLIL.getValue()).LIZ) {
            i2 = 0;
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null && (mapLJIJI = interfaceC975810bV5LIZLLL.LJIJI()) != null && (matchGameplayPermission = mapLJIJI.get(Long.valueOf(i2))) != null && matchGameplayPermission.blockReason != 0) {
            C766270U4b.LJIIJJI(matchGameplayPermission.blockMessage);
            return;
        }
        C2252321DDq c2252321DDq = this.LLIZ;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C980430bcX.LIZ((C980430bcX) value, i2, false, false, false, null, false, 62)));
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            this.LLJIJIL.LJIIJJI(i2);
        } else {
            InterfaceC975810bV5 interfaceC975810bV5 = this.LLJI;
            if (interfaceC975810bV5 != null) {
                interfaceC975810bV5.LJIIJJI(i2, true);
            }
        }
        yQ2();
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL2 = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL2 != null) {
            interfaceC975810bV5LIZLLL2.LJJI();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vQ2(boolean z, EnumC980440bcY enumC980440bcY) {
        boolean zBooleanValue = ((Boolean) enumC980440bcY.getOriginState().invoke(this.LLIZ.getValue())).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFeatureSwitch: ");
        sbLIZ.append(enumC980440bcY.name());
        sbLIZ.append(", enable=");
        sbLIZ.append(z);
        sbLIZ.append(", originEnable=");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LJIIIZ("MatchOptionViewModel", C2188811AlT.LIZIZ(sbLIZ));
        xQ2(z, enumC980440bcY.getUiUpdater(), enumC980440bcY.getRepoUpdater());
        this.LLJ.LIZ(enumC980440bcY.getSwitchType(), z ? 1 : 0, new AwS67S0210000_15(enumC980440bcY, this, z, 1), new AwS67S0210000_15(enumC980440bcY, this, zBooleanValue, 2));
    }

    public final void xQ2(boolean z, Function2<? super C980430bcX, ? super Boolean, C980430bcX> function2, Function2<? super MatchSettingsInfo, ? super Boolean, Unit> function22) {
        Object value;
        MatchSettingsInfo matchSettingsInfoLJJ;
        C2252321DDq c2252321DDq = this.LLIZ;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, function2.invoke(value, Boolean.valueOf(z))));
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null && (matchSettingsInfoLJJ = interfaceC975810bV5LIZLLL.LJJ()) != null) {
            function22.invoke(matchSettingsInfoLJJ, Boolean.valueOf(z));
        }
    }

    public MatchOptionViewModel(boolean z, boolean z2, InterfaceC963450bB9 interfaceC963450bB9, DataChannel dataChannel, boolean z3, AwS559S0100000_15 awS559S0100000_15) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = interfaceC963450bB9;
        this.LLILZ = dataChannel;
        this.LLILZIL = z3;
        this.LLILZLL = awS559S0100000_15;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C980430bcX(0));
        this.LLIZ = c2252321DDqLIZ;
        this.LLIZLLLIL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLJ = new C980380bcS();
        this.LLJI = C915980Zwa.LJI().LIZLLL();
        this.LLJIJIL = C915980Zwa.LJI().LJI();
        this.LLJILJIL = new AObserverS219S0100000_15(this, 62);
    }
}
