package com.bytedance.android.live.liveinteract.competition.service;

import X.C973800bRq;
import X.C976020bVQ;
import X.C976640bWQ;
import X.C976850bWl;
import X.C981480beE;
import X.EnumC962960bAM;
import X.EnumC974260bSa;
import X.InterfaceC976620bWO;
import X.InterfaceC978010bYd;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS55S0310000_15;

/* JADX INFO: loaded from: classes16.dex */
public class LiveCompetitionInternalServiceImpl implements ILiveCompetitionInternalService {
    public C976020bVQ LL;

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService
    public final void LJI() {
        this.LL = null;
        C976850bWl.LIZIZ = null;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService
    public final EnumC962960bAM Dn0() {
        EnumC962960bAM enumC962960bAM;
        C976020bVQ c976020bVQ = this.LL;
        return (c976020bVQ == null || (enumC962960bAM = c976020bVQ.LJIIJ.LJIIIIZZ) == null) ? EnumC962960bAM.UNKNOWN : enumC962960bAM;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService
    public final C973800bRq z8() {
        C981480beE c981480beELJI;
        C973800bRq c973800bRq;
        C981480beE c981480beE;
        C973800bRq c973800bRq2;
        C976020bVQ c976020bVQ = this.LL;
        if (c976020bVQ != null) {
            C976640bWQ c976640bWQ = c976020bVQ.LJIIL;
            if (c976640bWQ != null && (c981480beE = c976640bWQ.LJII) != null && (c973800bRq2 = c981480beE.LJJIIJ) != null) {
                return c973800bRq2;
            }
            InterfaceC976620bWO interfaceC976620bWO = c976020bVQ.LJIIJJI;
            if (interfaceC976620bWO != null && (c981480beELJI = interfaceC976620bWO.LJI()) != null && (c973800bRq = c981480beELJI.LJJIIJ) != null) {
                return c973800bRq;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService
    public final void Af1() {
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService
    public final void Cg(String str) {
        C976020bVQ c976020bVQ = this.LL;
        if (c976020bVQ != null) {
            c976020bVQ.LJFF(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService
    public final EnumC974260bSa JV1(boolean z) {
        EnumC974260bSa enumC974260bSaLIZ;
        C976020bVQ c976020bVQ = this.LL;
        if (c976020bVQ == null || (enumC974260bSaLIZ = c976020bVQ.LIZ(z)) == null) {
            return EnumC974260bSa.NONE;
        }
        return enumC974260bSaLIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService
    public final C981480beE M91(boolean z) {
        C976020bVQ c976020bVQ = this.LL;
        if (c976020bVQ != null) {
            return c976020bVQ.LIZIZ(z);
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService
    public final void S6(Function0<Unit> function0) {
        InterfaceC976620bWO interfaceC976620bWO;
        C976020bVQ c976020bVQ = this.LL;
        if (c976020bVQ != null && (interfaceC976620bWO = c976020bVQ.LJIIJJI) != null) {
            interfaceC976620bWO.LIZLLL((AwS55S0310000_15) function0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService
    public final void Zs0(Room room, InterfaceC978010bYd interfaceC978010bYd) {
        C976020bVQ c976020bVQ;
        if (room == null) {
            return;
        }
        boolean z = interfaceC978010bYd instanceof C976020bVQ;
        C976020bVQ c976020bVQ2 = null;
        if (z) {
            c976020bVQ = (C976020bVQ) interfaceC978010bYd;
        } else {
            c976020bVQ = null;
        }
        this.LL = c976020bVQ;
        if (z) {
            c976020bVQ2 = (C976020bVQ) interfaceC978010bYd;
        }
        C976850bWl.LIZIZ = c976020bVQ2;
    }
}
