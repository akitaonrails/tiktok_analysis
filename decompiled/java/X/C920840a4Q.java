package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920840a4Q implements InterfaceC922070a6P {
    public final Map<String, Integer> LL;
    public final Map<String, Integer> LLILLJJLI;
    public final Map<String, Integer> LLILLL;
    public final Map<String, Integer> LLILZ;
    public final Map<String, EnumC920860a4S> LLILZIL;
    public final Map<String, C922100a6S> LLILZLL;
    public final boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    public C920840a4Q() {
        throw null;
    }

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LIZJ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C920840a4Q)) {
            return false;
        }
        C920840a4Q c920840a4Q = (C920840a4Q) obj;
        return Intrinsics.LJFF(this.LL, c920840a4Q.LL) && Intrinsics.LJFF(this.LLILLJJLI, c920840a4Q.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c920840a4Q.LLILLL) && Intrinsics.LJFF(this.LLILZ, c920840a4Q.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c920840a4Q.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c920840a4Q.LLILZLL) && this.LLIZ == c920840a4Q.LLIZ;
    }

    public final int hashCode() {
        return (((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceInfoKeeperImpl(mediaStateMap=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onLineStateMap=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", rtcConnectionStateMap=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", talkVolumeMap=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", networkStateMap=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", fanTicketMap=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isShowFanTicket=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC922070a6P
    public final Map<String, Integer> LJJIJIIJIL() {
        return C2097608Jq.LJIIZILJ(this.LLILLJJLI);
    }

    @Override // X.InterfaceC922070a6P
    public final Map<String, Integer> LJJIJL() {
        return C2097608Jq.LJIIZILJ(this.LL);
    }

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LJIIIIZZ() {
        return InterfaceC922070a6P.class;
    }

    @Override // X.InterfaceC922070a6P
    public final boolean LJIJ() {
        return this.LLIZ;
    }

    public C920840a4Q(boolean z) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap5 = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap6 = new ConcurrentHashMap();
        this.LL = concurrentHashMap;
        this.LLILLJJLI = concurrentHashMap2;
        this.LLILLL = concurrentHashMap3;
        this.LLILZ = concurrentHashMap4;
        this.LLILZIL = concurrentHashMap5;
        this.LLILZLL = concurrentHashMap6;
        this.LLIZ = z;
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1333));
        this.LLJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(369));
    }

    public final void LIZ(String str) {
        Iterator it2 = ((ArrayList) this.LLIZLLLIL.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC920850a4R) it2.next()).LIZ(this, str);
        }
    }

    @Override // X.InterfaceC922070a6P
    public final void LJ(InterfaceC920850a4R interfaceC920850a4R) {
        ((ArrayList) this.LLIZLLLIL.getValue()).remove(interfaceC920850a4R);
    }

    @Override // X.InterfaceC922070a6P
    public final EnumC920860a4S LJII(String str) {
        EnumC920860a4S enumC920860a4S = this.LLILZIL.get(str);
        if (enumC920860a4S == null) {
            return EnumC920860a4S.UNKNOWN;
        }
        return enumC920860a4S;
    }

    @Override // X.InterfaceC922070a6P
    public final int LJIIJ(String str) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        Integer num = this.LL.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num2 = this.LLILLJJLI.get(str);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        Integer num3 = this.LLILLL.get(str);
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        if (iIntValue3 == 2) {
            return 2;
        }
        if (iIntValue2 == 2) {
            if (iIntValue != 2 && iIntValue != 3 && iIntValue != 4) {
                return 2;
            }
            return 3;
        }
        if (iIntValue != 2 && iIntValue != 3 && iIntValue != 4) {
            return 0;
        }
        return 1;
    }

    @Override // X.InterfaceC922070a6P
    public final int LJIIZILJ(String str) {
        Integer num = this.LLILZ.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC922070a6P
    public final boolean LJIJI(String str) {
        Integer num = this.LL.get(str);
        if ((num == null || num.intValue() != 0) && (num == null || num.intValue() != 1)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC922070a6P
    public final boolean LJIJJLI(String str) {
        Integer num = this.LLILLJJLI.get(str);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC922070a6P
    public final void LJJI(InterfaceC920850a4R interfaceC920850a4R) {
        ((ArrayList) this.LLIZLLLIL.getValue()).add(interfaceC920850a4R);
        interfaceC920850a4R.LIZJ(this);
    }

    @Override // X.InterfaceC922070a6P
    public final boolean LJJIIJZLJL(String str) {
        Integer num = this.LL.get(str);
        if (num == null || num.intValue() != 3) {
            Integer num2 = this.LL.get(str);
            if (num2 != null && num2.intValue() == 4) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC922070a6P
    public final int LJJIIZI(String str) {
        Integer num = this.LL.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC922070a6P
    public final void LJJJ(Set<String> set) {
        C933980aPc.LJIIL(this.LL, set);
        C933980aPc.LJIIL(this.LLILLJJLI, set);
        C933980aPc.LJIIL(this.LLILLL, set);
        C933980aPc.LJIIL(this.LLILZ, set);
        C933980aPc.LJIIL(this.LLILZIL, set);
    }

    @Override // X.InterfaceC922070a6P
    public final void remove(String str) {
        this.LL.remove(str);
        this.LLILLJJLI.remove(str);
        this.LLILLL.remove(str);
        this.LLILZ.remove(str);
        this.LLILZIL.remove(str);
    }

    @Override // X.InterfaceC922070a6P
    public final void LJIILL(int i, String str) {
        this.LLILLJJLI.put(str, Integer.valueOf(i));
        LIZ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    @Override // X.InterfaceC922070a6P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(int r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.LL
            r0.put(r4, r1)
            if (r3 == 0) goto L1f
            r1 = 1
            if (r3 == r1) goto L1f
        Le:
            X.01GW r0 = r2.LLJ
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder) r0
            if (r0 == 0) goto L1b
            r0.LJIJ(r4, r1)
        L1b:
            r2.LIZ(r4)
            return
        L1f:
            r1 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C920840a4Q.LJJII(int, java.lang.String):void");
    }

    @Override // X.InterfaceC922070a6P
    public final void LJJIII(int i, String str) {
        this.LLILLL.put(str, Integer.valueOf(i));
        LIZ(str);
    }

    @Override // X.InterfaceC922070a6P
    public final void LJJIIZ(String str, C922100a6S c922100a6S) {
        this.LLILZLL.put(str, c922100a6S);
    }

    @Override // X.InterfaceC922070a6P
    public final void LJJIJIIJI(int i, String str) {
        this.LLILZ.put(str, Integer.valueOf(i));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("VoiceInfoKeeper", C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = ((ArrayList) this.LLIZLLLIL.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC920850a4R) it2.next()).LIZIZ(this, str);
        }
    }

    @Override // X.InterfaceC922070a6P
    public final void LJJIZ(int i, String str) {
        this.LLILZIL.put(str, C920900a4W.LIZ(i));
        Iterator it2 = ((ArrayList) this.LLIZLLLIL.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC920850a4R) it2.next()).LIZLLL(this, str);
        }
    }

    @Override // X.InterfaceC922070a6P
    public final void LJIIL(String str, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                i = 3;
            } else {
                i = 1;
            }
        } else if (z2) {
            i = 4;
        } else {
            i = 2;
        }
        LJJII(i, str);
    }
}
