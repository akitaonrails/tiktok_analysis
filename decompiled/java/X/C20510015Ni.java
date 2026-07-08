package X;

import com.ss.android.ugc.tools.net.WeakNetSortRule;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15Ni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20510015Ni implements InterfaceC20510115Nj {
    public static final C20510015Ni LIZ = new C20510015Ni();
    public static InterfaceC20510115Nj LIZIZ = new InterfaceC20510115Nj() { // from class: X.15Nk
        @Override // X.InterfaceC20510115Nj
        public final boolean LIZIZ() {
            return false;
        }

        @Override // X.InterfaceC20510115Nj
        public final void LIZJ(Function2<? super EnumC1641500som, ? super EnumC1641500som, Unit> function2) {
        }

        @Override // X.InterfaceC20510115Nj
        public final long LIZLLL() {
            return 60000L;
        }

        @Override // X.InterfaceC20510115Nj
        public final long LJ() {
            return 2000L;
        }

        @Override // X.InterfaceC20510115Nj
        public final boolean LJFF() {
            return false;
        }

        @Override // X.InterfaceC20510115Nj
        public final void LJII(Function2<? super EnumC1641500som, ? super EnumC1641500som, Unit> function2) {
        }

        @Override // X.InterfaceC20510115Nj
        public final WeakNetSortRule LIZ() {
            return new WeakNetSortRule(0, 0, 0, false);
        }

        @Override // X.InterfaceC20510115Nj
        public final EnumC1641500som LJI() {
            return EnumC1641500som.UNKNOWN;
        }
    };

    @Override // X.InterfaceC20510115Nj
    public final WeakNetSortRule LIZ() {
        return LIZIZ.LIZ();
    }

    @Override // X.InterfaceC20510115Nj
    public final boolean LIZIZ() {
        return LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC20510115Nj
    public final long LIZLLL() {
        return LIZIZ.LIZLLL();
    }

    @Override // X.InterfaceC20510115Nj
    public final long LJ() {
        return LIZIZ.LJ();
    }

    @Override // X.InterfaceC20510115Nj
    public final boolean LJFF() {
        return LIZIZ.LJFF();
    }

    @Override // X.InterfaceC20510115Nj
    public final EnumC1641500som LJI() {
        return LIZIZ.LJI();
    }

    public final boolean LJIIIIZZ() {
        return LJI() == EnumC1641500som.AVAILABLE;
    }

    @Override // X.InterfaceC20510115Nj
    public final void LIZJ(Function2<? super EnumC1641500som, ? super EnumC1641500som, Unit> function2) {
        LIZIZ.LIZJ(function2);
    }

    @Override // X.InterfaceC20510115Nj
    public final void LJII(Function2<? super EnumC1641500som, ? super EnumC1641500som, Unit> function2) {
        LIZIZ.LJII(function2);
    }
}
