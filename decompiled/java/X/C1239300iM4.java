package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iM4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239300iM4 {
    public static final C1222020huC LIZ = new C1222020huC();
    public static final C1234390iE9 LIZIZ = new C1234390iE9();
    public static final C1239320iM6 LIZJ = new C1239320iM6();

    public static final <T> C09JN<T> LIZ(Function1<? super T, Unit> function1) {
        if (function1 == LIZ) {
            return C19487811Me.LIZLLL;
        }
        if (function1 != null) {
            function1 = (Function1<? super T, Unit>) new C1239310iM5(function1);
        }
        return (C09JN) function1;
    }

    public static final InterfaceC781210Ukh LIZIZ(Function0<Unit> function0) {
        Object c1266060j3E = function0;
        if (function0 == LIZJ) {
            return C19487811Me.LIZJ;
        }
        if (function0 != null) {
            c1266060j3E = new C1266060j3E(function0, (Function0<Unit>) 10);
        }
        return (InterfaceC781210Ukh) c1266060j3E;
    }

    public static final C09JN<Throwable> LIZJ(Function1<? super Throwable, Unit> function1) {
        Object c1239310iM5 = function1;
        if (function1 == LIZIZ) {
            return C19487811Me.LJFF;
        }
        if (function1 != null) {
            c1239310iM5 = new C1239310iM5(function1);
        }
        return (C09JN) c1239310iM5;
    }

    public static InterfaceC420801kM LJFF(C19486411Lq c19486411Lq, Function1 function1) {
        C1234390iE9 c1234390iE9 = LIZIZ;
        if (function1 == c1234390iE9) {
            return c19486411Lq.LJIIZILJ();
        }
        C1239320iM6 c1239320iM6 = LIZJ;
        if (function1 == c1234390iE9) {
            return c19486411Lq.LJIJ(new C1266060j3E(c1239320iM6, (Function0<Unit>) 10));
        }
        return c19486411Lq.LJIJI(new C1239310iM5(function1), LIZIZ(c1239320iM6));
    }

    public static final C11JL LIZLLL(AbstractC19484711Kz abstractC19484711Kz, Function1 function1, Function1 function12) {
        return (C11JL) abstractC19484711Kz.LJJIIZ(LIZ(function12), LIZJ(function1));
    }

    public static final C11JF LJ(C11NZ c11nz, Function1 function1, Function0 function0, Function1 function12) {
        return (C11JF) c11nz.LJJZ(LIZ(function12), LIZJ(function1), LIZIZ(function0));
    }
}
