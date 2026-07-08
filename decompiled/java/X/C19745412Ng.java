package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.12Ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19745412Ng {
    public static final C19745412Ng LIZ = new C19745412Ng();

    public static String LJII() {
        IntRange intRange = new IntRange(1, 16);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRange, 10));
        C531650Kt9 it2 = intRange.iterator();
        while (it2.LLILLL) {
            it2.nextInt();
            arrayList.add(Character.valueOf(C13LN.LJLLLLLL("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", AbstractC19994813Le.Default)));
        }
        return C13LP.LJJLIIIJ(arrayList, "", null, null, 0, null, null, 62);
    }

    public static C19746412Nq LIZIZ(float f, float f2) {
        return new C19746412Nq(LJII(), new C0HUY(f, f2));
    }

    public static C19746412Nq LIZLLL(float f, float f2) {
        return new C19746412Nq(LJII(), new C0HIW(f, f2));
    }

    public static C19746412Nq LJ(float f, float f2) {
        return new C19746412Nq(LJII(), new C0HIX(f, f2));
    }

    public static C19746412Nq LJFF(float f, float f2) {
        return new C19746412Nq(LJII(), new C082N(f, f2));
    }

    public static C19746412Nq LJI(float f, float f2) {
        return new C19746412Nq(LJII(), new C0HV5(f, f2));
    }

    public static C19746412Nq LIZJ(int i, int i2, View view) {
        return new C19746412Nq(LJII(), new C19745612Ni(i, i2, new AwS595S0100000_16(view, 243)));
    }

    public static void LJIIIZ(View view, InterfaceC19745512Nh interfaceC19745512Nh, C19746412Nq... c19746412NqArr) {
        C19746412Nq[] c19746412NqArr2 = (C19746412Nq[]) Arrays.copyOf(c19746412NqArr, c19746412NqArr.length);
        LJIIIIZZ(view, interfaceC19745512Nh, 0L, AFwS218S0000000_29.get$arr$(335), AFwS218S0000000_29.get$arr$(336), (C19746412Nq[]) Arrays.copyOf(c19746412NqArr2, c19746412NqArr2.length));
    }

    public static C1776900wLA LIZ(float f, float f2, float f3, long j) {
        return new C1776900wLA(new C1342130l1v(f), new C1342130l1v(f2), new C1342130l1v(f3), new C1342130l1v(1.0f), j);
    }

    public static void LJIIIIZZ(View view, InterfaceC19745512Nh interfaceC19745512Nh, long j, final Function0 function0, final Function0 function02, C19746412Nq... c19746412NqArr) {
        C19746312Np c19746312Np;
        if (interfaceC19745512Nh instanceof C1776900wLA) {
            c19746312Np = new C19746312Np(EnumC19746112Nn.BEZIER, interfaceC19745512Nh, C13LQ.LJJLL(c19746412NqArr));
        } else if (interfaceC19745512Nh instanceof C621560OZm) {
            c19746312Np = new C19746312Np(EnumC19746112Nn.POP, interfaceC19745512Nh, C13LQ.LJJLL(c19746412NqArr));
        } else if ((interfaceC19745512Nh instanceof C08LP) || (interfaceC19745512Nh instanceof C0HU6)) {
            c19746312Np = new C19746312Np(EnumC19746112Nn.SPRING, interfaceC19745512Nh, C13LQ.LJJLL(c19746412NqArr));
        } else {
            throw new C1954807lC();
        }
        C21647019ng c21647019ng = new C21647019ng(view.getContext(), view, c19746312Np, false);
        c21647019ng.LIZLLL(j);
        final C013C c013c = new C013C();
        C19746412Nq c19746412Nq = (C19746412Nq) C13LQ.LJJIFFI(c19746412NqArr);
        if (c19746412Nq != null) {
            c21647019ng.LIZJ(c19746412Nq.LIZ, new InterfaceC21641019mi() { // from class: X.12Ms
                @Override // X.InterfaceC21641019mi
                public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                    function02.invoke();
                }

                @Override // X.InterfaceC21641019mi
                public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                    if (!c013c.element) {
                        function0.invoke();
                        c013c.element = true;
                    }
                }
            });
        }
        c21647019ng.LJI(true);
    }
}
