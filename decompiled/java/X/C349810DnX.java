package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0DnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349810DnX extends C349710DnN {
    public final InterfaceC349700DnM LIZIZ;

    public C349810DnX(C363700ENs c363700ENs) {
        super(c363700ENs);
        this.LIZIZ = c363700ENs;
    }

    public final Pair<List<C349800DnW>, List<C349800DnW>> LIZIZ(int i) {
        C349690DnL c349690DnL = new C349690DnL(this.LIZIZ, false);
        LIZ(AFwS191S0000000_5.get$arr$(440));
        List<C349800DnW> listLIZLLL = c349690DnL.LIZLLL();
        LIZ(new AwS549S0100000_5(listLIZLLL, (List<C349800DnW>) 1710));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        int length = 0;
        for (C349800DnW c349800DnW : listLIZLLL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C349800DnW c349800DnW2 = c349800DnW;
                if ((c349800DnW2.LIZ.length() + length) - 1 < i) {
                    arrayList.add(c349800DnW2);
                } else if (length > i) {
                    arrayList2.add(c349800DnW2);
                } else {
                    int i4 = i - length;
                    String strSubstring = c349800DnW2.LIZ.substring(0, i4);
                    C349800DnW c349800DnW3 = new C349800DnW();
                    c349800DnW3.LIZ = strSubstring;
                    int i5 = c349800DnW2.LIZIZ;
                    c349800DnW3.LIZIZ = i5;
                    int length2 = (int) ((i4 / c349800DnW2.LIZ.length()) * (c349800DnW2.LIZJ - c349800DnW2.LIZIZ));
                    c349800DnW3.LIZJ = i5 + length2;
                    arrayList.add(c349800DnW3);
                    String strSubstring2 = c349800DnW2.LIZ.substring(i4);
                    C349800DnW c349800DnW4 = new C349800DnW();
                    c349800DnW4.LIZ = strSubstring2;
                    c349800DnW4.LIZIZ = c349800DnW2.LIZIZ + length2;
                    c349800DnW4.LIZJ = c349800DnW2.LIZJ;
                    arrayList2.add(c349800DnW4);
                }
                length += c349800DnW2.LIZ.length();
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Pair<List<C349800DnW>, List<C349800DnW>> pair = new Pair<>(new C349790DnV(arrayList).LIZ(), new C349790DnV(arrayList2).LIZ());
        LIZ(new AwS549S0100000_5(pair, (Pair<? extends List<C349800DnW>, ? extends List<C349800DnW>>) 1711));
        LIZ(new AwS549S0100000_5(pair, (Pair<? extends List<C349800DnW>, ? extends List<C349800DnW>>) 1712));
        return pair;
    }
}
