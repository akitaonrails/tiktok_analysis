package com.bytedance.android.live.liveinteract.multiguestv3.main.zoom;

import X.AbstractC19486711Lt;
import X.C01HE;
import X.C11QJ;
import X.C304201Fw;
import X.C334801Rq;
import X.C919850a2p;
import X.C930480aJy;
import X.C940770aaZ;
import X.EnumC919910a2v;
import X.EnumC920250a3T;
import X.InterfaceC2217461Bqa;
import X.InterfaceC920110a3F;
import X.InterfaceC920220a3Q;
import X.InterfaceC923120a86;
import X.InterfaceC927510aFB;
import X.InterfaceC948500an2;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "ZOOM_SERVICE")
public final class ZoomServiceV2 implements InterfaceC927510aFB {
    public final C919850a2p LIZ;
    public final Set<String> LIZIZ;

    public ZoomServiceV2() {
        this(null);
    }

    @Override // X.InterfaceC927510aFB
    public final void LIZLLL(String str, boolean z) {
    }

    @Override // X.InterfaceC927510aFB
    public final void LJ(int i, Function1 function1, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC927510aFB
    public final void LJII(SeiAppData seiAppData) {
    }

    @Override // X.InterfaceC927510aFB
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC927510aFB
    public final void LJIIL() {
    }

    @Override // X.InterfaceC927510aFB
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC927510aFB
    public final Layout LJIIZILJ() {
        return null;
    }

    @Override // X.InterfaceC927510aFB
    public final void LJIJI(String str, boolean z) {
        throw null;
    }

    @Override // X.InterfaceC927510aFB
    public final void destroy() {
        this.LIZIZ.clear();
        C919850a2p c919850a2p = this.LIZ;
        C304201Fw c304201Fw = c919850a2p.LIZIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C919850a2p.LJI;
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) c304201Fw.LIZ();
        if (linkMessageCenter != null) {
            linkMessageCenter.LJ(c919850a2p.LJFF);
        }
    }

    @Override // X.InterfaceC927510aFB
    public final List<PosIdentity> LIZIZ() {
        return C940770aaZ.LIZ().getDataSource().LJIIL();
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJFF() {
        Iterator<PosIdentity> it2 = C940770aaZ.LIZ().getDataSource().LJIIL().iterator();
        while (it2.hasNext()) {
            PosIdentity next = it2.next();
            if (LJIJJ(next.value)) {
                return next != null;
            }
        }
        return false;
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJIIIIZZ() {
        return !C940770aaZ.LIZ().getDataSource().LJIIL().isEmpty();
    }

    @Override // X.InterfaceC927510aFB
    public final String LJIILIIL() {
        InterfaceC920220a3Q dataSource;
        List<PosIdentity> listLJIIL;
        PosIdentity next;
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        if (interfaceC923120a86LIZ == null || (dataSource = interfaceC923120a86LIZ.getDataSource()) == null || (listLJIIL = dataSource.LJIIL()) == null) {
            return null;
        }
        Iterator<PosIdentity> it2 = listLJIIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.type == 1) {
                break;
            }
        }
        PosIdentity posIdentity = next;
        if (posIdentity != null) {
            return posIdentity.value;
        }
        return null;
    }

    @Override // X.InterfaceC927510aFB
    public final String LJIILL() {
        return C01HE.LIZLLL(UserService.getInstance().user().getCurrentUserId());
    }

    @Override // X.InterfaceC927510aFB
    public final EnumC920250a3T LJIJJLI() {
        return LJIL(LJIILL());
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJJ() {
        Iterator<PosIdentity> it2 = C940770aaZ.LIZ().getDataSource().LJIIL().iterator();
        while (it2.hasNext()) {
            PosIdentity next = it2.next();
            PosIdentity posIdentity = next;
            if (!LJIJJ(posIdentity.value) && posIdentity.type == 1) {
                return next != null;
            }
        }
        return false;
    }

    public ZoomServiceV2(DataChannel dataChannel) {
        this.LIZ = new C919850a2p(dataChannel);
        this.LIZIZ = new LinkedHashSet();
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LIZJ(String str) {
        List<PosIdentity> listLJIIL = C940770aaZ.LIZ().getDataSource().LJIIL();
        if ((listLJIIL instanceof Collection) && listLJIIL.isEmpty()) {
            return false;
        }
        Iterator<PosIdentity> it2 = listLJIIL.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(it2.next().value, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC927510aFB
    public final void LJIIJ(List<String> list) {
        this.LIZIZ.clear();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            this.LIZIZ.add(it2.next());
        }
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJIJ(String str) {
        InterfaceC920220a3Q dataSource = C940770aaZ.LIZ().getDataSource();
        if (str == null) {
            str = "";
        }
        return dataSource.LJIJJLI(str);
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJIJJ(String str) {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        if (str == null) {
            str = "";
        }
        Long lValueOf = Long.valueOf(C01HE.LJI(str));
        c930480aJy.getClass();
        return C930480aJy.LJIJJ(lValueOf);
    }

    @Override // X.InterfaceC927510aFB
    public final EnumC920250a3T LJIL(String str) {
        if (C940770aaZ.LIZ().getDataSource().LJIIIIZZ(str) && !this.LIZIZ.contains(str)) {
            if (C940770aaZ.LIZ().getDataSource().LJIJJLI(str)) {
                return EnumC920250a3T.CAN_ZOOM_TO_MIN;
            }
            return EnumC920250a3T.CAN_ZOOM_TO_MAX;
        }
        return EnumC920250a3T.ZOOM_DISABLED;
    }

    @Override // X.InterfaceC927510aFB
    public final void LJIIJJI(InterfaceC920110a3F interfaceC920110a3F, String str) {
        C940770aaZ.LIZ().getAction().LJ(interfaceC920110a3F);
    }

    @Override // X.InterfaceC927510aFB
    public final AbstractC19486711Lt LJIILLIIL(int i, boolean z) {
        return C11QJ.LL;
    }

    @Override // X.InterfaceC927510aFB
    public final void LIZ(PosIdentity posIdentity, boolean z, boolean z2, InterfaceC920110a3F interfaceC920110a3F) {
        C940770aaZ.LIZ().getAction().LIZ(posIdentity, z, z2, interfaceC920110a3F);
    }

    @Override // X.InterfaceC927510aFB
    public final void LJI(String str, InterfaceC920110a3F interfaceC920110a3F, boolean z, boolean z2, boolean z3, boolean z4, EnumC919910a2v enumC919910a2v, C334801Rq c334801Rq) {
        C940770aaZ.LIZ().getAction().LJI(str, z2, z4, interfaceC920110a3F, c334801Rq);
    }
}
