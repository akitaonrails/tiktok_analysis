package X;

import com.ss.android.ugc.tools.net.WeakNetSortRule;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15OW, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15OW implements InterfaceC20510115Nj {
    public static final C15OW LIZ = new C15OW();
    public static final HashMap<Function2<EnumC1641500som, EnumC1641500som, Unit>, C0H62> LIZIZ = new HashMap<>();

    @Override // X.InterfaceC20510115Nj
    public final WeakNetSortRule LIZ() {
        return (WeakNetSortRule) C15OY.LIZIZ.getValue();
    }

    @Override // X.InterfaceC20510115Nj
    public final boolean LIZIZ() {
        C844470XAv.LIZ.getClass();
        return C0XF1.LIZIZ(C844470XAv.LIZ());
    }

    @Override // X.InterfaceC20510115Nj
    public final long LIZLLL() {
        return ((Number) C0ATP.LIZ.getValue()).longValue();
    }

    @Override // X.InterfaceC20510115Nj
    public final long LJ() {
        return ((Number) C0ATH.LIZ.getValue()).longValue();
    }

    @Override // X.InterfaceC20510115Nj
    public final boolean LJFF() {
        return ((Boolean) C306910C1h.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC20510115Nj
    public final EnumC1641500som LJI() {
        return LJIIIIZZ(C036E.LIZ.LIZJ);
    }

    public static EnumC1641500som LJIIIIZZ(C0O0L c0o0l) {
        int i = C0O0D.LIZ[c0o0l.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return EnumC1641500som.UNKNOWN;
                }
                return EnumC1641500som.FAKE;
            }
            return EnumC1641500som.NOT_AVAILABLE;
        }
        return EnumC1641500som.AVAILABLE;
    }

    @Override // X.InterfaceC20510115Nj
    public final void LIZJ(Function2<? super EnumC1641500som, ? super EnumC1641500som, Unit> function2) {
        HashMap<Function2<EnumC1641500som, EnumC1641500som, Unit>, C0H62> map = LIZIZ;
        if (map.containsKey(function2)) {
            C036E.LIZ.LIZLLL(map.remove(function2));
        }
    }

    @Override // X.InterfaceC20510115Nj
    public final void LJII(final Function2<? super EnumC1641500som, ? super EnumC1641500som, Unit> function2) {
        HashMap<Function2<EnumC1641500som, EnumC1641500som, Unit>, C0H62> map = LIZIZ;
        if (map.containsKey(function2)) {
            return;
        }
        C0H62 c0h62 = new C0H62() { // from class: X.15OX
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                function2.invoke(C15OW.LJIIIIZZ(c0o0l), C15OW.LJIIIIZZ(c0o0l2));
            }
        };
        map.put(function2, c0h62);
        C036E.LIZ.LIZ(c0h62);
    }
}
