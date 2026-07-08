package X;

import com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioSrc;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.1ARF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ARF extends C1ARJ implements InterfaceC2179311AQv, C1AR5, C1ARY {
    public final C1ARM LLILLJJLI;
    public final AwS577S0100000_33 LLILLL = new AwS577S0100000_33(this, 4182);

    @Override // X.InterfaceC2179311AQv
    public final boolean LIZ() {
        return false;
    }

    @Override // X.C1AR5
    public final InterfaceC2179131AQd LIZJ(InterfaceC2179131AQd interfaceC2179131AQd) {
        return interfaceC2179131AQd;
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LIZLLL(C0NIR c0nir) {
        return false;
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LJIIIIZZ(C0NIR c0nir) {
        return false;
    }

    @Override // X.C1AR5
    public final C1AQY LJIILL(C1AQY c1aqy) {
        return c1aqy;
    }

    @Override // X.InterfaceC2179311AQv
    public final C2179231AQn LJIJJ(C2179231AQn c2179231AQn) {
        return c2179231AQn;
    }

    @Override // X.C1ARY
    public final void onAppForeground() {
    }

    @Override // X.C1ARY
    public final void onAppBackground() {
        C1ARK c1ark;
        C1ANF c1anfLIZJ;
        C1ARL c1arl;
        C1ARK c1ark2;
        C1ARI c1ari;
        C1ARL c1arl2 = this.LL;
        if (!LJIL((c1arl2 == null || (c1ari = c1arl2.LIZLLL) == null) ? null : c1ari.LIZ())) {
            C1ARL c1arl3 = this.LL;
            if (c1arl3 == null || (c1ark = c1arl3.LIZJ) == null || (c1anfLIZJ = c1ark.LIZJ()) == null || !c1anfLIZJ.isPlayingState()) {
                LJJ(this);
            } else {
                if (!LJJ(this) || (c1arl = this.LL) == null || (c1ark2 = c1arl.LIZJ) == null) {
                    return;
                }
                c1ark2.LJII(null);
            }
        }
    }

    @Override // X.C1ARN
    public final void onDetach() {
        C1ARL c1arl = this.LL;
        if (c1arl != null) {
            c1arl.LIZ.LJIIZILJ(this);
            c1arl.LIZIZ.LJIILLIIL(this);
        }
        C1ARM c1arm = this.LLILLJJLI;
        if (c1arm != null) {
            c1arm.removeAppVisibilityChangeListener(this);
        }
    }

    public C1ARF(C1ARM c1arm) {
        this.LLILLJJLI = c1arm;
    }

    public static boolean LJIL(InterfaceC2179261AQq interfaceC2179261AQq) {
        XAudioSrc xAudioSrc;
        Boolean mCanBackgroundPlay;
        if (interfaceC2179261AQq instanceof XAudioSrc) {
            xAudioSrc = (XAudioSrc) interfaceC2179261AQq;
        } else {
            xAudioSrc = null;
        }
        if (xAudioSrc == null || (mCanBackgroundPlay = xAudioSrc.getMCanBackgroundPlay()) == null) {
            return true;
        }
        return mCanBackgroundPlay.booleanValue();
    }

    public static boolean LJJ(C1ARF c1arf) {
        InterfaceC2179261AQq interfaceC2179261AQqLIZ;
        C1ARI c1ari;
        C1ARI c1ari2;
        AwS577S0100000_33 awS577S0100000_33 = c1arf.LLILLL;
        C1ARL c1arl = c1arf.LL;
        if (c1arl != null && (c1ari2 = c1arl.LIZLLL) != null) {
            interfaceC2179261AQqLIZ = c1ari2.LIZ();
        } else {
            interfaceC2179261AQqLIZ = null;
        }
        InterfaceC2179261AQq interfaceC2179261AQqLJIJJLI = c1arf.LJIJJLI(interfaceC2179261AQqLIZ, false);
        if (interfaceC2179261AQqLJIJJLI == null) {
            awS577S0100000_33.invoke();
            return false;
        }
        C1ARL c1arl2 = c1arf.LL;
        if (c1arl2 != null && (c1ari = c1arl2.LIZLLL) != null) {
            c1ari.LJIJI(interfaceC2179261AQqLJIJJLI, null);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LJII(C0NIR c0nir) {
        InterfaceC2179261AQq interfaceC2179261AQqLIZ;
        C1ARI c1ari;
        C1ARL c1arl = this.LL;
        if (c1arl != null && (c1ari = c1arl.LIZLLL) != null) {
            interfaceC2179261AQqLIZ = c1ari.LIZ();
        } else {
            interfaceC2179261AQqLIZ = null;
        }
        C1ARM c1arm = this.LLILLJJLI;
        if (c1arm == null || !c1arm.isAppBackground() || !(!LJIL(interfaceC2179261AQqLIZ))) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("This song ");
        sbLIZ.append(interfaceC2179261AQqLIZ);
        sbLIZ.append(" not support playing background.");
        C2188811AlT.LIZIZ(sbLIZ);
        return true;
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LJIIJ(C0NIR c0nir) {
        return LJII(null);
    }

    @Override // X.C1ARJ, X.C1ARN
    public final void LJIJI(C1ARL c1arl) {
        this.LL = c1arl;
        c1arl.LIZ.LJIILIIL(this);
        c1arl.LIZIZ.LJIIJJI(this);
        C1ARM c1arm = this.LLILLJJLI;
        if (c1arm != null) {
            c1arm.addAppVisibilityChangeListener(this);
        }
    }

    @Override // X.C1AR5
    public final InterfaceC2179261AQq LIZIZ(InterfaceC2179261AQq interfaceC2179261AQq, C0NIR c0nir) {
        String str;
        C1ARM c1arm = this.LLILLJJLI;
        if (c1arm != null && c1arm.isAppBackground() && (!LJIL(interfaceC2179261AQq))) {
            if (c0nir != null) {
                str = c0nir.LIZ;
            } else {
                str = null;
            }
            return LJIJJLI(interfaceC2179261AQq, Intrinsics.LJFF(str, "operation_from_media_session_skip_to_prev"));
        }
        return interfaceC2179261AQq;
    }

    public final InterfaceC2179261AQq LJIJJLI(InterfaceC2179261AQq interfaceC2179261AQq, boolean z) {
        C1ARI c1ari;
        InterfaceC2179131AQd interfaceC2179131AQdLJIJJLI;
        String id;
        C1ARL c1arl = this.LL;
        if (c1arl != null && (c1ari = c1arl.LIZLLL) != null && (interfaceC2179131AQdLJIJJLI = c1ari.LJIJJLI()) != null) {
            List<InterfaceC2179261AQq> listLIZIZ = interfaceC2179131AQdLJIJJLI.LIZIZ();
            Iterator<InterfaceC2179261AQq> it2 = listLIZIZ.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    String id2 = it2.next().getId();
                    if (interfaceC2179261AQq != null) {
                        id = interfaceC2179261AQq.getId();
                    } else {
                        id = null;
                    }
                    if (Intrinsics.LJFF(id2, id)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (z) {
                C1846520y9S c1846520y9SLJIIIZ = C13LZ.LJIIIZ(i - 1, 0);
                int i2 = c1846520y9SLJIIIZ.LL;
                int i3 = c1846520y9SLJIIIZ.LLILLJJLI;
                int i4 = c1846520y9SLJIIIZ.LLILLL;
                if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
                    while (true) {
                        InterfaceC2179261AQq interfaceC2179261AQq2 = (InterfaceC2179261AQq) C13LP.LJJJLZIJ(i2, listLIZIZ);
                        if (LJIL(interfaceC2179261AQq2)) {
                            return interfaceC2179261AQq2;
                        }
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    }
                }
                C1846520y9S c1846520y9SLJIIIZ2 = C13LZ.LJIIIZ(listLIZIZ.size() - 1, i + 1);
                int i5 = c1846520y9SLJIIIZ2.LL;
                int i6 = c1846520y9SLJIIIZ2.LLILLJJLI;
                int i7 = c1846520y9SLJIIIZ2.LLILLL;
                if (i7 > 0) {
                    if (i5 > i6) {
                        return null;
                    }
                } else if (i7 < 0 && i6 <= i5) {
                }
                while (true) {
                    InterfaceC2179261AQq interfaceC2179261AQq3 = (InterfaceC2179261AQq) C13LP.LJJJLZIJ(i5, listLIZIZ);
                    if (LJIL(interfaceC2179261AQq3)) {
                        return interfaceC2179261AQq3;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            } else {
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(i + 1, listLIZIZ.size());
                int i8 = intRangeLJIILJJIL.LL;
                int i9 = intRangeLJIILJJIL.LLILLJJLI;
                if (i8 <= i9) {
                    while (true) {
                        InterfaceC2179261AQq interfaceC2179261AQq4 = (InterfaceC2179261AQq) C13LP.LJJJLZIJ(i8, listLIZIZ);
                        if (LJIL(interfaceC2179261AQq4)) {
                            return interfaceC2179261AQq4;
                        }
                        if (i8 == i9) {
                            break;
                        }
                        i8++;
                    }
                }
                IntRange intRangeLJIILJJIL2 = C13LZ.LJIILJJIL(0, i);
                int i10 = intRangeLJIILJJIL2.LL;
                int i11 = intRangeLJIILJJIL2.LLILLJJLI;
                if (i10 <= i11) {
                    while (true) {
                        InterfaceC2179261AQq interfaceC2179261AQq5 = (InterfaceC2179261AQq) C13LP.LJJJLZIJ(i10, listLIZIZ);
                        if (LJIL(interfaceC2179261AQq5)) {
                            return interfaceC2179261AQq5;
                        }
                        if (i10 == i11) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return null;
    }
}
