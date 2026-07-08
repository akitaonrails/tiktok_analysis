package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.AnchorLayoutStyleSetting;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestLayoutNonSeiExtra;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SocialGameUserSpotExtra;

/* JADX INFO: renamed from: X.0acs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942200acs {
    public static final float LIZ;
    public static final C098J<String, MultiGuestLayoutExtra> LIZIZ;
    public static final C098J<String, MultiGuestLayoutNonSeiExtra> LIZJ;

    static {
        C1546210qL5.LIZ.getClass();
        C1546210qL5.LIZ(999);
        C1546210qL5.LIZ(100);
        LIZ = C1546210qL5.LIZ(0);
        C1546210qL5.LIZ(100);
        C1546210qL5.LIZ(999);
        LIZIZ = new C098J<>();
        LIZJ = new C098J<>();
    }

    public static Pair LIZIZ(int i) {
        AnchorLayoutStyleSetting next;
        Iterator<AnchorLayoutStyleSetting> it2 = C940770aaZ.LIZ().getDataSource().LIZLLL().layoutStyleSettings.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.layoutStyle == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AnchorLayoutStyleSetting anchorLayoutStyleSetting = next;
        if (anchorLayoutStyleSetting != null) {
            int i2 = anchorLayoutStyleSetting.maxPosition;
            if (i2 != 0) {
                int i3 = i2 - 1;
                if (i == 2 ? i3 == 4 || i3 == 6 || i3 == 8 : i == 4 && (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 8)) {
                    Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getAnchorLayoutSetting, ");
                    sbLIZ.append(pair);
                    C20441214yg.LIZIZ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ));
                    return pair;
                }
            }
            return LIZJ(i);
        }
        return LIZJ(i);
    }

    public static Pair LIZJ(int i) {
        Pair pair;
        int i2 = 7;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        pair = new Pair(Integer.valueOf(i), 0);
                    } else {
                        pair = new Pair(4, 9);
                    }
                } else {
                    pair = new Pair(3, 9);
                }
            } else {
                if (C917910Zzh.LIZ(C930540aK4.LIZJ())) {
                    i2 = 9;
                }
                pair = new Pair(2, Integer.valueOf(i2));
            }
        } else {
            if (C917910Zzh.LIZ(C930540aK4.LIZJ())) {
                i2 = 9;
            }
            pair = new Pair(1, Integer.valueOf(i2));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getDefaultLayoutSetting, ");
        sbLIZ.append(pair);
        C20441214yg.LIZIZ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ));
        return pair;
    }

    public static int LIZLLL(PosIdentity posIdentity) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC940060aZQ interfaceC940060aZQ;
        C942080acg c942080acgLJLJI;
        C947470alN c947470alN;
        List<C957020b0m> list;
        if (posIdentity == null) {
            return -1;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        C957020b0m c957020b0m = null;
        if (interfaceC954180awCLLJLL != null) {
            interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
        } else {
            interfaceC937900aVwLLIIJLIL = null;
        }
        if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null || (c942080acgLJLJI = interfaceC940060aZQ.LJLJI()) == null || (c947470alN = c942080acgLJLJI.LIZ) == null || (list = c947470alN.LIZLLL) == null) {
            return -1;
        }
        Iterator<C957020b0m> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C957020b0m next = it2.next();
            if (Intrinsics.LJFF(next.getPosIdentity(), posIdentity)) {
                c957020b0m = next;
                break;
            }
        }
        C957020b0m c957020b0m2 = c957020b0m;
        if (c957020b0m2 == null) {
            return -1;
        }
        return (int) c957020b0m2.getSpotId();
    }

    public static final MultiGuestLayoutExtra LJFF(String str) {
        MultiGuestLayoutExtra multiGuestLayoutExtra;
        try {
            C098J<String, MultiGuestLayoutExtra> c098j = LIZIZ;
            MultiGuestLayoutExtra multiGuestLayoutExtra2 = c098j.get(str);
            if (multiGuestLayoutExtra2 == null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                if (bArrDecode == null || (multiGuestLayoutExtra = (MultiGuestLayoutExtra) LIZ(bArrDecode, MultiGuestLayoutExtra.class)) == null) {
                    return null;
                }
                c098j.put(str, multiGuestLayoutExtra);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[toLayoutExtra] ");
                sbLIZ.append(str);
                sbLIZ.append(" => cache miss");
                C20441214yg.LIZIZ("MultiGuestLayoutUtils", C2188811AlT.LIZIZ(sbLIZ));
                return multiGuestLayoutExtra;
            }
            return multiGuestLayoutExtra2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[toLayoutExtra] ");
                sbLIZ2.append(str);
                sbLIZ2.append(" => exception ");
                sbLIZ2.append(thM5exceptionOrNullimpl);
                C20441214yg.LJ("MultiGuestLayoutUtils", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return null;
        }
    }

    public static final MultiGuestLayoutNonSeiExtra LJI(String str) {
        MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra;
        try {
            C098J<String, MultiGuestLayoutNonSeiExtra> c098j = LIZJ;
            MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra2 = c098j.get(str);
            if (multiGuestLayoutNonSeiExtra2 == null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                if (bArrDecode == null || (multiGuestLayoutNonSeiExtra = (MultiGuestLayoutNonSeiExtra) LIZ(bArrDecode, MultiGuestLayoutNonSeiExtra.class)) == null) {
                    return null;
                }
                c098j.put(str, multiGuestLayoutNonSeiExtra);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[toLayoutNonSeiExtra] ");
                sbLIZ.append(str);
                sbLIZ.append(" => cache miss");
                C20441214yg.LIZIZ("MultiGuestLayoutUtils", C2188811AlT.LIZIZ(sbLIZ));
                return multiGuestLayoutNonSeiExtra;
            }
            return multiGuestLayoutNonSeiExtra2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[toLayoutExtra] ");
                sbLIZ2.append(str);
                sbLIZ2.append(" => exception ");
                sbLIZ2.append(thM5exceptionOrNullimpl);
                C20441214yg.LJ("MultiGuestLayoutUtils", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return null;
        }
    }

    public static C947590alZ LJII(C957020b0m c957020b0m) {
        String str;
        EnumC947600ala enumC947600ala;
        int i;
        EnumC942260acy next;
        SocialGameUserSpotExtra socialGameUserSpotExtra;
        PosIdentity posIdentity = c957020b0m.getPosIdentity();
        if (posIdentity == null || (str = posIdentity.value) == null) {
            str = "";
        }
        if (c957020b0m.LLJIJIL) {
            enumC947600ala = EnumC947600ala.HOST;
        } else {
            enumC947600ala = EnumC947600ala.GUEST;
        }
        C942250acx c942250acx = EnumC942260acy.Companion;
        MultiGuestSpotExtra multiGuestExtra = c957020b0m.getMultiGuestExtra();
        if (multiGuestExtra != null && (socialGameUserSpotExtra = multiGuestExtra.socialGameUser) != null) {
            i = socialGameUserSpotExtra.gameJustDanceUserStatus;
        } else {
            i = 0;
        }
        c942250acx.getClass();
        Iterator<EnumC942260acy> it2 = EnumC942260acy.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC942260acy enumC942260acy = next;
        if (enumC942260acy == null) {
            enumC942260acy = EnumC942260acy.IDLE;
        }
        return new C947590alZ(str, enumC947600ala, enumC942260acy);
    }

    public static Object LIZ(byte[] bArr, Class cls) {
        boolean z;
        Object c098200Yq;
        if (bArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            C1516680pZS c1516680pZS = new C1516680pZS();
            c1516680pZS.LJIIL(new C1506330pIl(bArr));
            C1515210pX5.LIZLLL().getClass();
            C0IMD c0imdLJI = C1515210pX5.LJI(cls);
            if (c0imdLJI != null) {
                c098200Yq = c0imdLJI.LIZJ(c1516680pZS);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on rust network callback decode failed. \t ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C20441214yg.LJ("MultiGuestLayoutUtils", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(tikcast.linkmic.common.LayoutState r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C942200acs.LJ(tikcast.linkmic.common.LayoutState, java.lang.String):void");
    }
}
