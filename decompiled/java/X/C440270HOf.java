package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440270HOf implements InterfaceC0148002o {
    public final InterfaceC440230HOb<? extends List<C440440HOw>> LL;
    public final InterfaceC440230HOb<? extends List<C440440HOw>> LLILLJJLI;
    public final InterfaceC440230HOb<? extends List<C440440HOw>> LLILLL;
    public final InterfaceC440230HOb<? extends List<C440440HOw>> LLILZ;
    public final C0HOC LLILZIL;
    public final C0HZV<? extends InterfaceC440050HNj> LLILZLL;
    public final C0HZV<InterfaceC440050HNj> LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final C291001Au<Boolean> LLJI;
    public final String LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440270HOf)) {
            return false;
        }
        C440270HOf c440270HOf = (C440270HOf) obj;
        return Intrinsics.LJFF(this.LL, c440270HOf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c440270HOf.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c440270HOf.LLILLL) && Intrinsics.LJFF(this.LLILZ, c440270HOf.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c440270HOf.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c440270HOf.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c440270HOf.LLIZ) && this.LLIZLLLIL == c440270HOf.LLIZLLLIL && this.LLJ == c440270HOf.LLJ && Intrinsics.LJFF(this.LLJI, c440270HOf.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c440270HOf.LLJIJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        C0HOC c0hoc = this.LLILZIL;
        int iHashCode2 = (((((((((((iHashCode + (c0hoc == null ? 0 : c0hoc.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI.hashCode()) * 31;
        String str = this.LLJIJIL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MixStudioHomePageState(mixId=" + this.LL + ", userId=" + this.LLILLJJLI + ", friendsId=" + this.LLILLL + ", defaultId=" + this.LLILZ + ", mixElement=" + this.LLILZIL + ", firstRow=" + this.LLILZLL + ", secondRow=" + this.LLIZ + ", hasHistory=" + this.LLIZLLLIL + ", displayDropdown=" + this.LLJ + ", displayMenu=" + this.LLJI + ", randomTextPromptResId=" + this.LLJIJIL + ')';
    }

    public static C440270HOf LIZ(C440270HOf c440270HOf, InterfaceC440230HOb interfaceC440230HOb, InterfaceC440230HOb interfaceC440230HOb2, C0HOC c0hoc, C0HZV c0hzv, boolean z, boolean z2, C291001Au c291001Au, int i) {
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb3;
        InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb4;
        C0HZV<? extends InterfaceC440050HNj> c0hzv2;
        C291001Au c291001Au2 = c291001Au;
        boolean z3 = z2;
        InterfaceC440230HOb interfaceC440230HOb5 = interfaceC440230HOb;
        boolean z4 = z;
        C0HZV c0hzv3 = c0hzv;
        C0HOC c0hoc2 = c0hoc;
        InterfaceC440230HOb interfaceC440230HOb6 = interfaceC440230HOb2;
        if ((i & 1) != 0) {
            interfaceC440230HOb5 = c440270HOf.LL;
        }
        String str = null;
        if ((i & 2) != 0) {
            interfaceC440230HOb3 = c440270HOf.LLILLJJLI;
        } else {
            interfaceC440230HOb3 = null;
        }
        if ((i & 4) != 0) {
            interfaceC440230HOb4 = c440270HOf.LLILLL;
        } else {
            interfaceC440230HOb4 = null;
        }
        if ((i & 8) != 0) {
            interfaceC440230HOb6 = c440270HOf.LLILZ;
        }
        if ((i & 16) != 0) {
            c0hoc2 = c440270HOf.LLILZIL;
        }
        if ((i & 32) != 0) {
            c0hzv2 = c440270HOf.LLILZLL;
        } else {
            c0hzv2 = null;
        }
        if ((i & 64) != 0) {
            c0hzv3 = c440270HOf.LLIZ;
        }
        if ((i & 128) != 0) {
            z4 = c440270HOf.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            z3 = c440270HOf.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au2 = c440270HOf.LLJI;
        }
        if ((i & 1024) != 0) {
            str = c440270HOf.LLJIJIL;
        }
        c440270HOf.getClass();
        return new C440270HOf(interfaceC440230HOb5, interfaceC440230HOb3, interfaceC440230HOb4, interfaceC440230HOb6, c0hoc2, c0hzv2, c0hzv3, z4, z3, c291001Au2, str);
    }

    public C440270HOf(InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb2, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb3, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb4, C0HOC c0hoc, C0HZV<? extends InterfaceC440050HNj> c0hzv, C0HZV<InterfaceC440050HNj> c0hzv2, boolean z, boolean z2, C291001Au<Boolean> c291001Au, String str) {
        this.LL = interfaceC440230HOb;
        this.LLILLJJLI = interfaceC440230HOb2;
        this.LLILLL = interfaceC440230HOb3;
        this.LLILZ = interfaceC440230HOb4;
        this.LLILZIL = c0hoc;
        this.LLILZLL = c0hzv;
        this.LLIZ = c0hzv2;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = c291001Au;
        this.LLJIJIL = str;
    }
}
