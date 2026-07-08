package X;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2272911Dxp implements InterfaceC1775460wIq {
    public boolean LL;
    public volatile InterfaceC2272941Dxs LLILLJJLI;
    public boolean LLILLL;
    public Integer LLILZ;
    public Integer LLILZIL;
    public CopyOnWriteArrayList<InterfaceC2272941Dxs> LLILZLL;

    public final void LJII() {
        CopyOnWriteArrayList<InterfaceC2272941Dxs> copyOnWriteArrayList = this.LLILZLL;
        if (copyOnWriteArrayList != null) {
            for (InterfaceC2272941Dxs interfaceC2272941Dxs : copyOnWriteArrayList) {
                if (interfaceC2272941Dxs != null) {
                    interfaceC2272941Dxs.setPlayEnd(false);
                }
            }
        }
    }

    private final boolean LJIJJ(InterfaceC2272941Dxs interfaceC2272941Dxs) {
        String strLLLLLLL;
        String strLLLLLJLJLL;
        if (interfaceC2272941Dxs == null) {
            return false;
        }
        if (!interfaceC2272941Dxs.LLLLLL()) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZIZ();
            return false;
        }
        if (interfaceC2272941Dxs.LLLLLLLLL()) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZIZ();
            return false;
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryPlay play: ");
        sbLIZ.append(interfaceC2272941Dxs);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MixMallPlayer_PlayStrategy", strLIZIZ);
        String strLLLLLLL2 = interfaceC2272941Dxs.LLLLLLL();
        InterfaceC2272941Dxs interfaceC2272941Dxs2 = this.LLILLJJLI;
        if (interfaceC2272941Dxs2 != null) {
            strLLLLLLL = interfaceC2272941Dxs2.LLLLLLL();
        } else {
            strLLLLLLL = null;
        }
        if (!Intrinsics.LJFF(strLLLLLLL2, strLLLLLLL)) {
            C599820Nfo.LIZ("MixMallPlayer_PlayStrategy", "play: pauseMedia force!");
            LJIJ(this.LLILLJJLI, EnumC2176021AEe.TYPE_SWITCH, true);
        } else if (!Intrinsics.LJFF(interfaceC2272941Dxs, this.LLILLJJLI)) {
            InterfaceC2272941Dxs interfaceC2272941Dxs3 = this.LLILLJJLI;
            if (interfaceC2272941Dxs3 != null) {
                strLLLLLJLJLL = interfaceC2272941Dxs3.LLLLLJLJLL();
            } else {
                strLLLLLJLJLL = null;
            }
            if (!interfaceC2272941Dxs.LLLF(strLLLLLJLJLL)) {
                LJIJ(this.LLILLJJLI, EnumC2176021AEe.PLAY_SELECTION, false);
            }
        }
        this.LLILLJJLI = interfaceC2272941Dxs;
        if (!interfaceC2272941Dxs.LLLLLLLLLL()) {
            C1774130wGh.LIZ.getClass();
            if (C1774130wGh.LIZ().enableAsyncPlay) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0CU8(interfaceC2272941Dxs, null), 2);
                return true;
            }
            interfaceC2272941Dxs.LLLLLIL();
            return true;
        }
        C599820Nfo.LIZ("MixMallPlayer", "play: skip: isPlaying");
        return true;
    }

    @Override // X.InterfaceC1775460wIq
    public final synchronized void LIZIZ(InterfaceC2272941Dxs interfaceC2272941Dxs) {
        CopyOnWriteArrayList<InterfaceC2272941Dxs> copyOnWriteArrayList;
        String strLLLLLLL;
        String strLLLLLLL2;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixMallPlayer MMKLive ");
        sbLIZ.append(hashCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ(strLIZIZ, "unregisterItem");
        if (interfaceC2272941Dxs == null) {
            return;
        }
        CopyOnWriteArrayList<InterfaceC2272941Dxs> copyOnWriteArrayList2 = this.LLILZLL;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.remove(interfaceC2272941Dxs);
        }
        if (C1771440wCM.LIZJ() && this.LLILLJJLI != null) {
            CopyOnWriteArrayList<InterfaceC2272941Dxs> copyOnWriteArrayList3 = this.LLILZLL;
            if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0 && (copyOnWriteArrayList = this.LLILZLL) != null) {
                for (InterfaceC2272941Dxs interfaceC2272941Dxs2 : copyOnWriteArrayList) {
                    if (interfaceC2272941Dxs2 != null) {
                        strLLLLLLL = interfaceC2272941Dxs2.LLLLLLL();
                    } else {
                        strLLLLLLL = null;
                    }
                    InterfaceC2272941Dxs interfaceC2272941Dxs3 = this.LLILLJJLI;
                    if (interfaceC2272941Dxs3 != null) {
                        strLLLLLLL2 = interfaceC2272941Dxs3.LLLLLLL();
                    } else {
                        strLLLLLLL2 = null;
                    }
                    if (Intrinsics.LJFF(strLLLLLLL, strLLLLLLL2)) {
                        break;
                    }
                }
                LJIJ(this.LLILLJJLI, EnumC2176021AEe.VIEW_DETACH, true);
                C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MixMallPlayer MMKLive ");
                sbLIZ2.append(hashCode());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c599820Nfo2.getClass();
                C599820Nfo.LIZ(strLIZIZ2, "pauseMedia");
                this.LLILLJJLI = null;
            } else {
                LJIJ(this.LLILLJJLI, EnumC2176021AEe.VIEW_DETACH, true);
                C599820Nfo c599820Nfo22 = C599820Nfo.LIZ;
                StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                sbLIZ22.append("MixMallPlayer MMKLive ");
                sbLIZ22.append(hashCode());
                String strLIZIZ22 = C2188811AlT.LIZIZ(sbLIZ22);
                c599820Nfo22.getClass();
                C599820Nfo.LIZ(strLIZIZ22, "pauseMedia");
                this.LLILLJJLI = null;
            }
        }
        if (((C2272931Dxr) this).LLJILJIL) {
            C599820Nfo c599820Nfo3 = C599820Nfo.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("MixMallPlayer MMKLive ");
            sbLIZ3.append(hashCode());
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            c599820Nfo3.getClass();
            C599820Nfo.LIZ(strLIZIZ3, "triggerPlay  before scroll");
            LJIIJJI(true, false);
        }
    }

    @Override // X.InterfaceC1775460wIq
    public final void LJI(InterfaceC2272941Dxs interfaceC2272941Dxs) {
        String mediaSrc;
        C1768420w7U config;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerItem: ");
        sbLIZ.append(interfaceC2272941Dxs);
        sbLIZ.append(", src:");
        Boolean boolValueOf = null;
        if (interfaceC2272941Dxs != null) {
            mediaSrc = interfaceC2272941Dxs.getMediaSrc();
        } else {
            mediaSrc = null;
        }
        sbLIZ.append(mediaSrc);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MixMallPlayer", strLIZIZ);
        if (interfaceC2272941Dxs == null) {
            return;
        }
        if (this.LLILZLL == null) {
            this.LLILZLL = new CopyOnWriteArrayList<>();
        }
        CopyOnWriteArrayList<InterfaceC2272941Dxs> copyOnWriteArrayList = this.LLILZLL;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.addIfAbsent(interfaceC2272941Dxs);
        }
        if (((C2272931Dxr) this).LLJILJIL) {
            C599820Nfo.LIZ("MixMallPlayer", "registerItem: triggerPlay before scroll");
            LJIIJJI(true, false);
        }
        if (!this.LLILLL && C1771440wCM.LJ() && (config = interfaceC2272941Dxs.getConfig()) != null && config.LJII == 1) {
            C599820Nfo.LIZ("MixMallPlayer", "register inertia scroll...");
            InterfaceC1775450wIp<?> containerCallback = interfaceC2272941Dxs.getContainerCallback();
            if (containerCallback != null) {
                boolValueOf = Boolean.valueOf(containerCallback.LIZIZ(new AwS614S0100000_35(this, 142)));
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                this.LLILLL = true;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register inertia scroll res: ");
            sbLIZ2.append(boolValueOf);
            C599820Nfo.LIZ("MixMallPlayer", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0135  */
    @Override // X.InterfaceC1775460wIq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2272911Dxp.LJIIJJI(boolean, boolean):void");
    }

    public final void LJIJI(EnumC2176021AEe enumC2176021AEe, boolean z) {
        this.LL = false;
        if (z) {
            LJIJ(this.LLILLJJLI, enumC2176021AEe, true);
            if (C1771440wCM.LIZJ()) {
                this.LLILLJJLI = null;
            }
        }
    }

    public static void LJIJ(InterfaceC2272941Dxs interfaceC2272941Dxs, EnumC2176021AEe enumC2176021AEe, boolean z) {
        InterfaceC2272961Dxu interfaceC2272961Dxu;
        if ((interfaceC2272941Dxs instanceof InterfaceC2272961Dxu) && (interfaceC2272961Dxu = (InterfaceC2272961Dxu) interfaceC2272941Dxs) != null) {
            interfaceC2272961Dxu.LJJII(enumC2176021AEe, z);
        } else {
            if (interfaceC2272941Dxs == null) {
                return;
            }
            interfaceC2272941Dxs.LLLLLLIL(z);
        }
    }
}
