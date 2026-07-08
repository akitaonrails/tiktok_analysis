package com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service;

import X.C214831195p;
import X.C915980Zwa;
import X.C950220apo;
import X.C950840aqo;
import X.C956340azg;
import X.C959600b4w;
import X.C960260b60;
import X.EnumC958840b3i;
import X.EnumC958900b3o;
import X.EnumC959580b4u;
import X.EnumC959750b5B;
import X.InterfaceC914930Zut;
import X.InterfaceC962210b99;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.livesetting.linkmic.RandomLinkMicOptimiseQuickInviteCountdownTimeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;

/* JADX INFO: loaded from: classes16.dex */
public class QuickCoHostService implements IQuickCoHostService {
    public InterfaceC962210b99 LL;
    public RecyclableWidgetManager LLILLJJLI;

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.IQuickCoHostService
    public final void LJI() {
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC954810axD
    public final long LIZLLL() {
        return ((long) RandomLinkMicOptimiseQuickInviteCountdownTimeSetting.INSTANCE.getValue()) - LJII();
    }

    @Override // X.InterfaceC954810axD
    public final EnumC958840b3i LJFF() {
        EnumC958840b3i enumC958840b3iD0;
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        return (interfaceC962210b99 == null || (enumC958840b3iD0 = interfaceC962210b99.d0()) == null) ? EnumC958840b3i.UNKNOWN : enumC958840b3iD0;
    }

    @Override // X.InterfaceC954810axD
    public final long LJII() {
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 != null) {
            return interfaceC962210b99.n0(C950220apo.LJFF());
        }
        return 0L;
    }

    @Override // X.InterfaceC954810axD
    public final boolean LJIIIIZZ() {
        C959600b4w c959600b4wC0;
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 == null || (c959600b4wC0 = interfaceC962210b99.c0()) == null) {
            return false;
        }
        return c959600b4wC0.LJIILIIL;
    }

    @Override // X.InterfaceC954810axD
    public final boolean a0() {
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 != null) {
            return interfaceC962210b99.a0();
        }
        return false;
    }

    @Override // X.InterfaceC954810axD
    public final C959600b4w c0() {
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 != null) {
            return interfaceC962210b99.c0();
        }
        return null;
    }

    @Override // X.InterfaceC954810axD
    public final C956340azg f0() {
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 != null) {
            return interfaceC962210b99.f0();
        }
        return null;
    }

    @Override // X.InterfaceC954810axD
    public final EnumC958900b3o k0() {
        EnumC958900b3o enumC958900b3oK0;
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        return (interfaceC962210b99 == null || (enumC958900b3oK0 = interfaceC962210b99.k0()) == null) ? EnumC958900b3o.NONE : enumC958900b3oK0;
    }

    @Override // X.InterfaceC954810axD
    public final C214831195p m0() {
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 != null) {
            return interfaceC962210b99.m0();
        }
        return null;
    }

    @Override // X.InterfaceC954810axD
    public final boolean Jf() {
        return k0() != EnumC958900b3o.NONE;
    }

    @Override // X.InterfaceC954810axD
    public final int LIZJ() {
        return LJFF() == EnumC958840b3i.QUICK_RECOMMEND_DURING_COHOST ? C915980Zwa.LJII().LJJIJIL().size() : k0() != EnumC958900b3o.NONE ? 1 : 0;
    }

    @Override // X.InterfaceC954810axD
    public final long LJ(long j) {
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 != null) {
            return interfaceC962210b99.n0(j);
        }
        return 0L;
    }

    @Override // X.InterfaceC954810axD
    public final void e0(RecyclableWidgetManager recyclableWidgetManager) {
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 != null) {
            interfaceC962210b99.e0(recyclableWidgetManager);
        } else {
            this.LLILLJJLI = recyclableWidgetManager;
        }
    }

    @Override // X.InterfaceC954810axD
    public final void h0(C956340azg c956340azg) {
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 != null) {
            interfaceC962210b99.h0(c956340azg);
        }
    }

    @Override // X.InterfaceC954810axD
    public final long j0(long j) {
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 != null) {
            return interfaceC962210b99.j0(j);
        }
        return 0L;
    }

    @Override // X.InterfaceC954810axD
    public final void l0(JoinGroupDirectIMModel joinGroupDirectIMModel) {
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 != null) {
            interfaceC962210b99.l0(joinGroupDirectIMModel);
        }
    }

    @Override // X.InterfaceC959950b5V
    public final void LIZ(EnumC959580b4u enumC959580b4u, InterfaceC914930Zut<C960260b60> interfaceC914930Zut) {
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 != null) {
            interfaceC962210b99.LIZ(enumC959580b4u, interfaceC914930Zut);
        }
    }

    @Override // X.InterfaceC959950b5V
    public final void LIZIZ(EnumC959750b5B enumC959750b5B, C950840aqo c950840aqo) {
        InterfaceC962210b99 interfaceC962210b99 = this.LL;
        if (interfaceC962210b99 != null) {
            interfaceC962210b99.LIZIZ(enumC959750b5B, c950840aqo);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.IQuickCoHostService
    public final void b61(Room room, InterfaceC962210b99 interfaceC962210b99) {
        if (room == null) {
            return;
        }
        this.LL = interfaceC962210b99;
        RecyclableWidgetManager recyclableWidgetManager = this.LLILLJJLI;
        if (interfaceC962210b99 != null && recyclableWidgetManager != null) {
            interfaceC962210b99.e0(recyclableWidgetManager);
            this.LLILLJJLI = null;
        }
    }
}
