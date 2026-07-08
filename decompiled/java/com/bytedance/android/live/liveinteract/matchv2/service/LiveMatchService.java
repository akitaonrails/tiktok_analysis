package com.bytedance.android.live.liveinteract.matchv2.service;

import X.C20441214yg;
import X.C915980Zwa;
import X.C917350Zyn;
import X.C955010axX;
import X.C962900bAG;
import X.C970370bMJ;
import X.C973660bRc;
import X.C973800bRq;
import X.C973890bRz;
import X.C974450bSt;
import X.C975500bUa;
import X.C975680bUs;
import X.C975960bVK;
import X.C976480bWA;
import X.C976800bWg;
import X.C978520bZS;
import X.EnumC919170a1j;
import X.EnumC964170bCJ;
import X.InterfaceC973730bRj;
import X.InterfaceC975520bUc;
import X.InterfaceC975770bV1;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes16.dex */
public class LiveMatchService implements ILiveMatchService {
    public C975500bUa LL;
    public long LLILLJJLI;
    public volatile boolean LLILLL;
    public volatile boolean LLILZ;

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean Nt() {
        return RY(false) == EnumC964170bCJ.MATCH_START;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final long Nt0() {
        InterfaceC973730bRj interfaceC973730bRjYf2 = yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            return interfaceC973730bRjYf2.LJJJJ();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean Wo1() {
        EnigmaBattleSetting enigmaBattleSettingLJJIIJZLJL;
        InterfaceC973730bRj interfaceC973730bRjYf2 = yf2(false);
        return (interfaceC973730bRjYf2 == null || (enigmaBattleSettingLJJIIJZLJL = interfaceC973730bRjYf2.LJJIIJZLJL()) == null || !enigmaBattleSettingLJJIIJZLJL.isStartable) ? false : true;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean co0() {
        return RY(false).compareTo(EnumC964170bCJ.MATCH_START) >= 0 && RY(false).compareTo(EnumC964170bCJ.MATCH_END) < 0;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean fA2() {
        EnumC964170bCJ enumC964170bCJRY = RY(false);
        EnumC964170bCJ enumC964170bCJ = EnumC964170bCJ.INVITED;
        return enumC964170bCJRY == enumC964170bCJ || RY(true) == enumC964170bCJ;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean gm1() {
        return RY(false) == EnumC964170bCJ.PUNISH_START;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean mz1() {
        return RY(false).compareTo(EnumC964170bCJ.INVITED) >= 0 && RY(false).compareTo(EnumC964170bCJ.MATCH_END) < 0;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean vb2() {
        EnumC964170bCJ enumC964170bCJ;
        EnumC964170bCJ enumC964170bCJRY = RY(false);
        EnumC964170bCJ enumC964170bCJRY2 = RY(true);
        EnumC964170bCJ enumC964170bCJ2 = EnumC964170bCJ.RECEIVED;
        return enumC964170bCJRY == enumC964170bCJ2 || enumC964170bCJRY == (enumC964170bCJ = EnumC964170bCJ.ACCEPTED) || enumC964170bCJRY2 == enumC964170bCJ2 || enumC964170bCJRY2 == enumC964170bCJ;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final long y90() {
        InterfaceC973730bRj interfaceC973730bRjYf2 = yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            return interfaceC973730bRjYf2.LJIJJ();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean Mt1() {
        return this.LL != null;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean QS0() {
        return C955010axX.LJIIL && C955010axX.LJIIJJI && C955010axX.LJIIJ && co0();
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final String my() {
        CharSequence charSequence = (CharSequence) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
        if (charSequence != null && !a0.LJJJIL(charSequence)) {
            String str = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
            return str == null ? "" : str;
        }
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jXB0 = xB0();
        int size = C915980Zwa.LJII().LJIJJ().size();
        c917350Zyn.getClass();
        return C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final Map<String, String> oA0() {
        C973660bRc c973660bRc = C973660bRc.LIZ;
        return C973660bRc.LJLJLLL;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean r82() {
        return C955010axX.LJIIL && C955010axX.LJIIJJI && C955010axX.LJIIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean ry2() {
        return this.LL != null;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final void tj2() {
        C20441214yg.LIZIZ("LiveMatchService", "detachNewArch");
        this.LL = null;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final EnumC919170a1j xB0() {
        EnumC919170a1j enumC919170a1jLJIIIZ;
        C975500bUa c975500bUa = this.LL;
        if (c975500bUa != null) {
            InterfaceC975520bUc interfaceC975520bUc = c975500bUa.LJ;
            if (interfaceC975520bUc != null && (enumC919170a1jLJIIIZ = interfaceC975520bUc.LJIIIZ()) != null) {
                return enumC919170a1jLJIIIZ;
            }
            EnumC919170a1j enumC919170a1j = EnumC919170a1j.UNKNOWN;
            if (enumC919170a1j != null) {
                return enumC919170a1j;
            }
        }
        C974450bSt c974450bSt = C973890bRz.LIZ;
        return C973890bRz.LJIIIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final C973800bRq z8() {
        C975960bVK c975960bVKM3;
        C973800bRq c973800bRq;
        C975960bVK c975960bVK;
        C973800bRq c973800bRq2;
        C975500bUa c975500bUa = this.LL;
        if (c975500bUa != null) {
            C975680bUs c975680bUs = c975500bUa.LJFF;
            if (c975680bUs != null && (c975960bVK = c975680bUs.LJIIIZ) != null && (c973800bRq2 = c975960bVK.LJJLJLI) != null) {
                return c973800bRq2;
            }
            InterfaceC975520bUc interfaceC975520bUc = c975500bUa.LJ;
            if (interfaceC975520bUc != null && (c975960bVKM3 = interfaceC975520bUc.m3()) != null && (c973800bRq = c975960bVKM3.LJJLJLI) != null) {
                return c973800bRq;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean BS0() {
        InterfaceC973730bRj interfaceC973730bRjYf2;
        if (!GU() || (interfaceC973730bRjYf2 = yf2(false)) == null) {
            return false;
        }
        return C978520bZS.LJIIJ(interfaceC973730bRjYf2);
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean GU() {
        return LinkCoreModelKt.currentUserIsAnchor() ? LiveCoHostIcyClashMatchSetting.INSTANCE.isEnable() : LiveCoHostIcyClashMatchAudienceSetting.INSTANCE.isEnable();
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean Zx() {
        return C970370bMJ.LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k31() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.service.LiveMatchService.k31():boolean");
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final String sy0() {
        return C970370bMJ.LJII() ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean lh1() {
        return this.LLILLL;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final long xd2() {
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final void Cg(String str) {
        C975680bUs c975680bUs;
        C975500bUa c975500bUa = this.LL;
        if (c975500bUa != null && (c975680bUs = c975500bUa.LJFF) != null) {
            c975680bUs.LIZIZ(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final EnumC964170bCJ RY(boolean z) {
        C974450bSt c974450bSt;
        EnumC964170bCJ enumC964170bCJ;
        EnumC964170bCJ enumC964170bCJ2;
        EnumC964170bCJ enumC964170bCJY2;
        C975500bUa c975500bUa = this.LL;
        if (c975500bUa != null) {
            if (!z) {
                InterfaceC975520bUc interfaceC975520bUc = c975500bUa.LJ;
                if (interfaceC975520bUc == null || (enumC964170bCJY2 = interfaceC975520bUc.Y2()) == null) {
                    enumC964170bCJ = EnumC964170bCJ.NONE;
                } else {
                    return enumC964170bCJY2;
                }
            } else {
                C975680bUs c975680bUs = c975500bUa.LJFF;
                if (c975680bUs != null && (enumC964170bCJ2 = c975680bUs.LJIIJJI) != null) {
                    return enumC964170bCJ2;
                }
                enumC964170bCJ = EnumC964170bCJ.NONE;
            }
            if (enumC964170bCJ == null) {
                return EnumC964170bCJ.NONE;
            }
            return enumC964170bCJ;
        }
        if (!z) {
            c974450bSt = C973890bRz.LIZ;
        } else {
            c974450bSt = C973890bRz.LIZIZ;
        }
        return c974450bSt.LJLIL();
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final void S6(Function0<Unit> function0) {
        InterfaceC975520bUc interfaceC975520bUc;
        C975500bUa c975500bUa = this.LL;
        if (c975500bUa != null && (interfaceC975520bUc = c975500bUa.LJ) != null) {
            interfaceC975520bUc.b3(function0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final void V22(long j) {
        this.LLILLJJLI = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[PHI: r3
      0x0017: PHI (r3v3 X.0bCJ) = (r3v1 X.0bCJ), (r3v4 X.0bCJ) binds: [B:10:0x0015, B:8:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Long, java.lang.Integer> ZO2(boolean r7) {
        /*
            r6 = this;
            X.0bUa r0 = r6.LL
            r4 = 0
            r1 = 0
            if (r0 == 0) goto L7b
            if (r7 == 0) goto L78
            X.0bUs r5 = r0.LJFF
        Lb:
            if (r5 == 0) goto L13
            X.0bCJ r3 = r5.Y2()
            if (r3 != 0) goto L17
        L13:
            X.0bCJ r3 = X.EnumC964170bCJ.NONE
            if (r5 == 0) goto L45
        L17:
            X.0bCJ r0 = X.EnumC964170bCJ.INVITED
            int r0 = r3.compareTo(r0)
            if (r0 < 0) goto L45
            X.0bVK r0 = r5.m3()
            if (r0 == 0) goto L27
            int r4 = r0.LJIILLIIL
        L27:
            X.0bVK r0 = r5.m3()
            if (r0 == 0) goto L33
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r0 = r0.LJIILL
            if (r0 == 0) goto L33
            long r1 = r0.giftId
        L33:
            long r0 = X.C975070bTt.LIZ(r4, r1)
        L37:
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.<init>(r1, r0)
            return r3
        L45:
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0bZR r0 = r0.LJI()
            androidx.lifecycle.LiveData r0 = r0.LJIIIIZZ()
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L5d
            int r4 = r0.intValue()
        L5d:
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0bZR r0 = r0.LJI()
            androidx.lifecycle.LiveData r0 = r0.LJI()
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode) r0
            if (r0 == 0) goto L73
            long r1 = r0.giftId
        L73:
            long r0 = X.C975070bTt.LIZ(r4, r1)
            goto L37
        L78:
            X.0bUc r5 = r0.LJ
            goto Lb
        L7b:
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.service.LiveMatchService.ZO2(boolean):kotlin.Pair");
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean fI2(DataChannel dataChannel) {
        C962900bAG c962900bAG;
        if (dataChannel != null && (c962900bAG = (C962900bAG) dataChannel.gg0(BattleIsInTeamPairing.class)) != null && c962900bAG.LIZ) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final InterfaceC973730bRj yf2(boolean z) {
        C975500bUa c975500bUa = this.LL;
        if (c975500bUa != null) {
            return c975500bUa.LJIIJ(z);
        }
        if (!z) {
            C974450bSt c974450bSt = C973890bRz.LIZ;
            return C973890bRz.LIZ;
        }
        C974450bSt c974450bSt2 = C973890bRz.LIZ;
        return C973890bRz.LIZIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final boolean hI0(long j, long j2) {
        InterfaceC973730bRj interfaceC973730bRjYf2;
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        if (C970370bMJ.LJIIIIZZ() && (interfaceC973730bRjYf2 = yf2(false)) != null && (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) != null && (value = mutableLiveDataLJJJJIZL.getValue()) != null) {
            Iterator<C976480bWA> it2 = value.iterator();
            while (it2.hasNext()) {
                List<C976800bWg> list = it2.next().LJFF;
                if (list != null) {
                    Iterator it3 = ((ArrayList) list).iterator();
                    int i = 0;
                    while (it3.hasNext()) {
                        long j3 = ((C976800bWg) it3.next()).LIZ;
                        if (j3 == j || j3 == j2) {
                            i++;
                        }
                    }
                    if (i == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.match.service.ILiveMatchService
    public final void mC1(Room room, InterfaceC975770bV1 interfaceC975770bV1) {
        C975500bUa c975500bUa;
        if (room == null) {
            return;
        }
        if (interfaceC975770bV1 instanceof C975500bUa) {
            c975500bUa = (C975500bUa) interfaceC975770bV1;
        } else {
            c975500bUa = null;
        }
        this.LL = c975500bUa;
    }
}
