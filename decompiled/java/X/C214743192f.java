package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.192f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214743192f {
    public static final C214743192f LIZ = new C214743192f();

    public static void LIZ(AnonymousClass1931 anonymousClass1931, final C192U c192u, C193X c193x, C1664690tQB c1664690tQB, C10J2 c10j2) {
        anonymousClass1931.LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192h
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((InterfaceC214754192q) obj).getVisibility());
            }
        }), c192u, Lifecycle.State.STARTED, new AwS611S0100000_32(c192u, 270));
        anonymousClass1931.LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((InterfaceC214754192q) obj).isEnabled());
            }
        }), c192u, Lifecycle.State.STARTED, new AwS611S0100000_32(c192u, 272));
        anonymousClass1931.LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((InterfaceC214754192q) obj).LJ());
            }
        }), c192u, Lifecycle.State.STARTED, new AwS611S0100000_32(c192u, 274));
        anonymousClass1931.LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((InterfaceC214754192q) obj).LIZIZ());
            }
        }), c192u, Lifecycle.State.STARTED, new AwS611S0100000_32(c192u, 276));
        AnonymousClass1931.LIZJ(anonymousClass1931, c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC214754192q) obj).LIZ();
            }
        }), c192u, new AwS611S0100000_32(c192u, 259));
        anonymousClass1931.LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192s
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC214754192q) obj).LJFF();
            }
        }), c192u, Lifecycle.State.STARTED, new AwS611S0100000_32(c192u, 260));
        AnonymousClass1931.LIZJ(anonymousClass1931, c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC214754192q) obj).LIZLLL();
            }
        }), c192u, new AwS611S0100000_32(c192u, 262));
        anonymousClass1931.LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC214754192q) obj).LIZJ();
            }
        }), c192u, Lifecycle.State.STARTED, new AwS611S0100000_32(c192u, 264));
        anonymousClass1931.LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192r
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC214754192q) obj).getLabel();
            }
        }), c192u, Lifecycle.State.STARTED, new AwS611S0100000_32(c192u, 266));
        AnonymousClass1931.LIZJ(anonymousClass1931, c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC214754192q) obj).LJI();
            }
        }), c192u, new AwS611S0100000_32(c192u, 269));
        final AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c193x, 501);
        final Function1<Boolean, Unit> function1LJIILJJIL = c10j2.LJIILJJIL();
        if (function1LJIILJJIL != null) {
            c192u.L5().LJIILL(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.192g
                @Override // X.AbstractViewOnClickListenerC1173120gdK
                public final void LIZ(View view) {
                    awS576S0100000_32.invoke();
                    function1LJIILJJIL.invoke(Boolean.valueOf(c192u.LL.getCellEnabled()));
                }
            });
            c192u.L5().LJI(new AwS429S0200000_28(awS576S0100000_32, function1LJIILJJIL, 83));
        }
    }
}
