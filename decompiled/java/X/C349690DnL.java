package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.data.Word;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS90S1000000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349690DnL extends C349710DnN {
    public final InterfaceC349700DnM LIZIZ;
    public final boolean LIZJ;

    public final C349720DnO LIZJ() {
        InterfaceC349700DnM interfaceC349700DnM = this.LIZIZ;
        C349720DnO c349720DnO = new C349720DnO();
        Word word = (Word) C13LP.LJJJLL(interfaceC349700DnM.LIZIZ());
        long startTime = word != null ? word.getStartTime() : 0L;
        Word word2 = (Word) C13LP.LJJLIIIJL(interfaceC349700DnM.LIZIZ());
        long endTime = word2 != null ? word2.getEndTime() : 0L;
        c349720DnO.LIZ = C352310DrZ.LIZ(interfaceC349700DnM.getClipStart());
        c349720DnO.LIZIZ = C352310DrZ.LIZ(interfaceC349700DnM.LJFF()) - ((int) (endTime - startTime));
        return c349720DnO;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0DnU] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0DnT] */
    public final List<C349800DnW> LIZLLL() {
        try {
            List<Word> listLIZIZ = this.LIZIZ.LIZIZ();
            final String strLJIIIIZZ = this.LIZIZ.LJIIIIZZ();
            if (strLJIIIIZZ == null) {
                return C13BV.INSTANCE;
            }
            LIZ(AFwS191S0000000_5.get$arr$(437));
            C349720DnO c349720DnOLIZJ = LIZJ();
            Word word = (Word) C13LP.LJJJLL(listLIZIZ);
            long startTime = word != null ? word.getStartTime() : 0L;
            final ArrayList arrayList = new ArrayList();
            for (Word word2 : listLIZIZ) {
                C349800DnW c349800DnW = new C349800DnW();
                c349800DnW.LIZ = word2.getText();
                c349800DnW.LIZIZ = (int) (word2.getStartTime() - startTime);
                c349800DnW.LIZJ = (int) (word2.getEndTime() - startTime);
                arrayList.add(c349800DnW);
            }
            LIZ(new AwS549S0100000_5(arrayList, (List<C349800DnW>) 1704));
            final List arrayList2 = new ArrayList(new Object(arrayList, strLJIIIIZZ) { // from class: X.0DnU
                public final String LIZ;
                public final List<C349800DnW> LIZIZ;
                public final int LIZJ;
                public final int LIZLLL;
                public final int[][] LJ;
                public final int[][] LJFF;
                public final boolean LJI;
                public String LJII;

                public final void LIZJ() {
                    int i;
                    int i2 = this.LIZLLL;
                    int length = i2 - 1;
                    int i3 = this.LIZJ;
                    int i4 = i3 - 1;
                    int i5 = i2 + i3;
                    int i6 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        if (i6 > i5 || length < 0 || i4 < 0 || (i = this.LJ[length][i4]) == 0) {
                            return;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    length--;
                                }
                            }
                            i6 = i7;
                        } else {
                            C349800DnW c349800DnW2 = (C349800DnW) ListProtector.get(this.LIZIZ, i4);
                            c349800DnW2.LJFF = true;
                            c349800DnW2.LJ = length;
                            c349800DnW2.LIZLLL = (length - c349800DnW2.LIZ.length()) + 1;
                            length -= ((C349800DnW) ListProtector.get(this.LIZIZ, i4)).LIZ.length();
                        }
                        i4--;
                        i6 = i7;
                    }
                }

                public final void LJ() {
                    if (this.LJI) {
                        this.LJII = "\t\t";
                        int i = this.LIZJ;
                        for (int i2 = 0; i2 < i; i2++) {
                            String str = ((C349800DnW) ListProtector.get(this.LIZIZ, i2)).LIZ;
                            if (a0.LJJJIL(str)) {
                                str = "_";
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(this.LJII);
                            sbLIZ.append(str);
                            this.LJII = C2188811AlT.LIZIZ(sbLIZ);
                            int length = (2 - (str.length() / 4)) - 1;
                            if (length >= 0) {
                                while (true) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(this.LJII);
                                    sbLIZ2.append('\t');
                                    this.LJII = C2188811AlT.LIZIZ(sbLIZ2);
                                    int i3 = i3 != length ? i3 + 1 : 0;
                                }
                            }
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(this.LJII);
                        sbLIZ3.append('\n');
                        this.LJII = C2188811AlT.LIZIZ(sbLIZ3);
                        int i4 = this.LIZLLL;
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = this.LIZJ;
                            String strLIZIZ = "";
                            for (int i7 = 0; i7 < i6; i7++) {
                                int i8 = this.LJFF[i5][i7];
                                int i9 = this.LJ[i5][i7];
                                String str2 = i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? "" : "⬆" : "⬅" : "↖️" : "⭕️";
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(strLIZIZ);
                                sbLIZ4.append("\t\t");
                                sbLIZ4.append(i8);
                                sbLIZ4.append(str2);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                if (i7 == this.LIZJ - 1) {
                                    char cCharAt = this.LIZ.charAt(i5);
                                    if (a0.LJJJIL(String.valueOf(cCharAt))) {
                                        cCharAt = '_';
                                    }
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append(cCharAt);
                                    sbLIZ5.append(strLIZIZ);
                                    sbLIZ5.append('\n');
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append(this.LJII);
                                    sbLIZ6.append(strLIZIZ);
                                    this.LJII = C2188811AlT.LIZIZ(sbLIZ6);
                                }
                            }
                        }
                    }
                }

                public final List<C349800DnW> LJFF() {
                    try {
                        LIZ(this.LIZ, this.LIZIZ);
                        LJ();
                        LIZJ();
                        List<C349800DnW> listLIZ = new C349790DnV(LIZIZ(this.LIZ, this.LIZIZ)).LIZ();
                        LIZLLL(this.LIZ, listLIZ);
                        C349800DnW c349800DnW2 = (C349800DnW) C13LP.LJJLIIIJL(listLIZ);
                        if (c349800DnW2 != null) {
                            C349800DnW c349800DnW3 = (C349800DnW) C13LP.LJJLIIIJL(this.LIZIZ);
                            c349800DnW2.LIZJ = c349800DnW3 != null ? c349800DnW3.LIZJ : 0;
                        }
                        if (!listLIZ.isEmpty()) {
                            return listLIZ;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        C349800DnW c349800DnW4 = new C349800DnW();
                        c349800DnW4.LIZIZ = 0;
                        C349800DnW c349800DnW5 = (C349800DnW) C13LP.LJJLIIIJL(this.LIZIZ);
                        c349800DnW4.LIZJ = c349800DnW5 != null ? c349800DnW5.LIZJ : 0;
                        c349800DnW4.LIZ = this.LIZ;
                        arrayList3.add(c349800DnW4);
                        return arrayList3;
                    } catch (StringIndexOutOfBoundsException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return C13BV.INSTANCE;
                    } catch (IndexOutOfBoundsException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return C13BV.INSTANCE;
                    } catch (NoSuchElementException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        return C13BV.INSTANCE;
                    }
                }

                {
                    this.LIZ = strLJIIIIZZ;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : (ArrayList) arrayList) {
                        if (((C349800DnW) obj).LIZ.length() > 0) {
                            arrayList3.add(obj);
                        }
                    }
                    this.LIZIZ = arrayList3;
                    this.LIZJ = arrayList3.size();
                    int length = this.LIZ.length();
                    this.LIZLLL = length;
                    int[][] iArr = new int[length][];
                    for (int i = 0; i < length; i++) {
                        int i2 = this.LIZJ;
                        int[] iArr2 = new int[i2];
                        for (int i3 = 0; i3 < i2; i3++) {
                            iArr2[i3] = 0;
                        }
                        iArr[i] = iArr2;
                    }
                    this.LJ = iArr;
                    int i4 = this.LIZLLL;
                    int[][] iArr3 = new int[i4][];
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = this.LIZJ;
                        int[] iArr4 = new int[i6];
                        for (int i7 = 0; i7 < i6; i7++) {
                            iArr4[i7] = 0;
                        }
                        iArr3[i5] = iArr4;
                    }
                    this.LJFF = iArr3;
                    this.LJI = true;
                    this.LJII = "";
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public static java.util.List LIZIZ(java.lang.String r8, java.util.List r9) {
                    /*
                        java.util.ArrayList r9 = (java.util.ArrayList) r9
                        int r6 = r9.size()
                        int r5 = r8.length()
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        r8 = 0
                        r3 = 0
                    L11:
                        if (r8 >= r5) goto La1
                        if (r3 >= r6) goto La1
                        java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r3)
                        X.0DnW r2 = (X.C349800DnW) r2
                        java.lang.Object r7 = X.C13LP.LJJLIIIJL(r4)
                        X.0DnW r7 = (X.C349800DnW) r7
                        boolean r0 = r2.LJFF
                        if (r0 == 0) goto L6a
                        if (r7 == 0) goto L5a
                        boolean r0 = r2.LIZ()
                        if (r0 == 0) goto L4b
                        int r0 = r9.size()
                        int r0 = r0 + (-1)
                        if (r3 == r0) goto L4b
                        int r1 = r2.LIZLLL
                        r2.LJI = r1
                        int r0 = r2.LJ
                        r2.LJII = r0
                        int r0 = r1 + (-1)
                        r7.LJII = r0
                    L41:
                        int r0 = r2.LJII
                        int r8 = r0 + 1
                        int r3 = r3 + 1
                        r4.add(r2)
                        goto L11
                    L4b:
                        boolean r0 = r7.LIZ()
                        if (r0 != 0) goto L5a
                        int r0 = r2.LIZLLL
                        r2.LJI = r0
                        int r0 = r0 + (-1)
                        r7.LJII = r0
                        goto L5c
                    L5a:
                        r2.LJI = r8
                    L5c:
                        int r0 = r6 + (-1)
                        if (r3 < r0) goto L65
                        int r0 = r5 + (-1)
                        r2.LJII = r0
                        goto L41
                    L65:
                        int r0 = r2.LJ
                        r2.LJII = r0
                        goto L41
                    L6a:
                        boolean r0 = r2.LIZ()
                        if (r0 == 0) goto L73
                        int r3 = r3 + 1
                        goto L11
                    L73:
                        int r0 = r6 + (-1)
                        if (r3 < r0) goto L84
                        r2.LJI = r8
                        int r0 = r5 + (-1)
                        r2.LJII = r0
                        r4.add(r2)
                        int r3 = r3 + 1
                        r8 = r5
                        goto L11
                    L84:
                        int r3 = r3 + 1
                        java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r3)
                        X.0DnW r1 = (X.C349800DnW) r1
                        boolean r0 = r1.LJFF
                        if (r0 == 0) goto L11
                        int r0 = r1.LIZLLL
                        if (r0 <= r8) goto L11
                        r2.LJI = r8
                        int r0 = r0 + (-1)
                        r2.LJII = r0
                        r4.add(r2)
                        int r8 = r1.LIZLLL
                        goto L11
                    La1:
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C349780DnU.LIZIZ(java.lang.String, java.util.List):java.util.List");
                }

                public static void LIZLLL(String str, List list) {
                    int size = list.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        C349800DnW c349800DnW2 = (C349800DnW) ListProtector.get(list, i2);
                        c349800DnW2.LIZIZ = i;
                        c349800DnW2.LIZ = str.substring(c349800DnW2.LJI, c349800DnW2.LJII + 1);
                        if (i2 != list.size() - 1) {
                            C349800DnW c349800DnW3 = (C349800DnW) ListProtector.get(list, i2 + 1);
                            if (!c349800DnW2.LIZ() && a0.LJJJIL(c349800DnW2.LIZ)) {
                                c349800DnW2.LIZJ = c349800DnW3.LIZIZ;
                            }
                        }
                        i = c349800DnW2.LIZJ;
                    }
                }

                public final void LIZ(String str, List list) {
                    int i;
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    Iterator it2 = list.iterator();
                    char c = 0;
                    int i2 = 0;
                    while (it2.hasNext()) {
                        int i3 = i2 + 1;
                        String lowerCase2 = ((C349800DnW) it2.next()).LIZ.toLowerCase(Locale.ROOT);
                        int length = lowerCase2.length();
                        int length2 = lowerCase.length();
                        int i4 = 0;
                        while (i4 < length2) {
                            lowerCase.charAt(i4);
                            int i5 = length - 1;
                            int i6 = 1;
                            if (i4 < i5) {
                                i = 0;
                                break;
                            }
                            while (-1 < i5) {
                                if (lowerCase2.charAt(i5) != lowerCase.charAt((i4 - length) + 1 + i5)) {
                                    i = 0;
                                    break;
                                }
                                i5--;
                            }
                            i = 1;
                            if (i4 == 0 && i2 == 0) {
                                i6 = i;
                            } else if (i4 < length) {
                                if (i == 0) {
                                    i6 = 2;
                                }
                            } else if (i2 == 0) {
                                if (i != 0) {
                                    i = 1;
                                } else {
                                    i = this.LJFF[i4 - 1][c];
                                    i6 = 3;
                                }
                            } else {
                                int[][] iArr = this.LJFF;
                                int i7 = i2 - 1;
                                int i8 = iArr[i4 - length][i7] + 1;
                                int i9 = iArr[i4][i7];
                                int i10 = iArr[i4 - 1][i2];
                                if (i != 0 && i9 <= i8) {
                                    i = i8;
                                } else {
                                    i = i9;
                                    i6 = 2;
                                }
                                if (i10 > i) {
                                    i6 = 3;
                                    i = i10;
                                }
                            }
                            this.LJFF[i4][i2] = i;
                            this.LJ[i4][i2] = i6;
                            i4++;
                            c = 0;
                        }
                        i2 = i3;
                    }
                }
            }.LJFF());
            LIZ(new AwS549S0100000_5(arrayList2, (List<C349800DnW>) 1705));
            String strLJII = this.LIZIZ.LJII();
            if (!this.LIZIZ.LJ() && C123100dR.LIZ(strLJII)) {
                arrayList2 = new Object(arrayList2) { // from class: X.0DnT
                    public final List<C349800DnW> LIZ;

                    {
                        this.LIZ = arrayList2;
                    }

                    public final List<C349800DnW> LIZ(String str, String str2) {
                        int i;
                        int i2;
                        int i3;
                        int i4;
                        Character chLJLLJ;
                        ArrayList arrayList3 = new ArrayList();
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < str.length() && i6 < str2.length()) {
                            if (str2.charAt(i6) == '\n' && ((chLJLLJ = C13LN.LJLLJ(i5, str)) == null || chLJLLJ.charValue() != '\n')) {
                                arrayList3.add(Integer.valueOf(i6));
                            } else {
                                str2.charAt(i6);
                                str.charAt(i5);
                                i5++;
                            }
                            i6++;
                        }
                        while (i6 < str2.length()) {
                            if (str2.charAt(i6) == '\n') {
                                arrayList3.add(Integer.valueOf(i6));
                            }
                            i6++;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        int i7 = 0;
                        for (C349800DnW c349800DnW2 : this.LIZ) {
                            StringBuilder sb = new StringBuilder();
                            int length = c349800DnW2.LIZ.length() + i7;
                            while (true) {
                                if (!(!arrayList3.isEmpty()) || ((Number) C13LP.LJJJJZI(arrayList3)).intValue() < i7 || ((Number) C13LP.LJJJJZI(arrayList3)).intValue() >= length) {
                                    break;
                                }
                                int iIntValue = ((Number) ListProtector.remove(arrayList3, 0)).intValue();
                                int i8 = iIntValue - i7;
                                if (i8 == 0) {
                                    C349800DnW c349800DnW3 = (C349800DnW) C13LP.LJJLIIIJL(arrayList4);
                                    C349800DnW c349800DnW4 = new C349800DnW();
                                    c349800DnW4.LIZ = "\n";
                                    if (c349800DnW3 != null) {
                                        i3 = c349800DnW3.LIZJ;
                                    } else {
                                        i3 = -1;
                                    }
                                    c349800DnW4.LIZIZ = i3;
                                    if (c349800DnW3 != null) {
                                        i4 = c349800DnW3.LIZJ;
                                    } else {
                                        i4 = -1;
                                    }
                                    c349800DnW4.LIZJ = i4;
                                    arrayList4.add(c349800DnW4);
                                } else {
                                    if (i8 == c349800DnW2.LIZ.length()) {
                                        sb.append(c349800DnW2);
                                        C349800DnW c349800DnW5 = new C349800DnW();
                                        c349800DnW5.LIZ = sb.toString();
                                        c349800DnW5.LIZIZ = c349800DnW2.LIZIZ;
                                        c349800DnW5.LIZJ = c349800DnW2.LIZJ;
                                        arrayList4.add(c349800DnW5);
                                        C349800DnW c349800DnW6 = new C349800DnW();
                                        c349800DnW6.LIZ = "\n";
                                        int i9 = c349800DnW2.LIZJ;
                                        c349800DnW6.LIZIZ = i9;
                                        c349800DnW6.LIZJ = i9;
                                        arrayList4.add(c349800DnW6);
                                        break;
                                    }
                                    sb.append(c349800DnW2.LIZ.substring(0, i8));
                                    sb.append('\n');
                                    sb.append(c349800DnW2.LIZ.substring(i8));
                                }
                                i7 = iIntValue + 1;
                            }
                            if (sb.length() == 0) {
                                arrayList4.add(c349800DnW2);
                            } else if (sb.length() > 0 && !a0.LJJIJIIJIL(sb, '\n')) {
                                C349800DnW c349800DnW7 = new C349800DnW();
                                c349800DnW7.LIZ = sb.toString();
                                c349800DnW7.LIZIZ = c349800DnW2.LIZIZ;
                                c349800DnW7.LIZJ = c349800DnW2.LIZJ;
                                arrayList4.add(c349800DnW7);
                            }
                            i7 = length;
                        }
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            int iIntValue2 = ((Number) it2.next()).intValue();
                            if (iIntValue2 > i7) {
                                C349800DnW c349800DnW8 = (C349800DnW) C13LP.LJJLIIIJL(arrayList4);
                                C349800DnW c349800DnW9 = new C349800DnW();
                                c349800DnW9.LIZ = "\n";
                                if (c349800DnW8 != null) {
                                    i = c349800DnW8.LIZJ;
                                } else {
                                    i = -1;
                                }
                                c349800DnW9.LIZIZ = i;
                                if (c349800DnW8 != null) {
                                    i2 = c349800DnW8.LIZJ;
                                } else {
                                    i2 = -1;
                                }
                                c349800DnW9.LIZJ = i2;
                                arrayList4.add(c349800DnW9);
                                i7 = iIntValue2 + 1;
                            }
                        }
                        return arrayList4;
                    }
                }.LIZ(strLJIIIIZZ, strLJII);
                LIZ(new AwS90S1000000_5(strLJIIIIZZ, 1));
                LIZ(new AwS90S1000000_5(strLJII, 2));
                LIZ(new AwS549S0100000_5(arrayList2, (List<C349800DnW>) 1706));
            }
            ArrayList arrayList3 = new ArrayList(LIZIZ(c349720DnOLIZJ.LIZ, c349720DnOLIZJ.LIZIZ, arrayList2));
            LIZ(new AwS406S0200000_5(c349720DnOLIZJ, (C349720DnO) arrayList3, (List<C349800DnW>) 169));
            LIZ(AFwS191S0000000_5.get$arr$(438));
            return arrayList3;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    public C349690DnL(InterfaceC349700DnM interfaceC349700DnM, boolean z) {
        super(interfaceC349700DnM);
        this.LIZIZ = interfaceC349700DnM;
        this.LIZJ = z;
    }

    public final List LIZIZ(int i, int i2, List list) {
        C349800DnW c349800DnW;
        int i3;
        ArrayList arrayList = new ArrayList();
        if (this.LIZJ && i2 < 0) {
            C349800DnW c349800DnW2 = (C349800DnW) C13LP.LJJLIIIJL(list);
            if (c349800DnW2 != null) {
                i3 = c349800DnW2.LIZJ + i2;
            } else {
                i3 = 0;
            }
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C349800DnW c349800DnW3 = (C349800DnW) obj;
                    if (c349800DnW3.LIZJ <= i3) {
                        arrayList.add(c349800DnW3);
                    } else if (c349800DnW3.LIZIZ <= i3) {
                        c349800DnW3.LIZJ = i3;
                        arrayList.add(c349800DnW3);
                    }
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            arrayList.addAll(list);
            if (i2 >= 0 && (c349800DnW = (C349800DnW) C13LP.LJJLIIIJL(arrayList)) != null) {
                c349800DnW.LIZJ += i2;
            }
        }
        if (i < 0) {
            int iAbs = Math.abs(i);
            int i6 = 0;
            for (Object obj2 : arrayList) {
                int i7 = i6 + 1;
                if (i6 >= 0) {
                    C349800DnW c349800DnW4 = (C349800DnW) obj2;
                    if (i6 == 0) {
                        c349800DnW4.LIZJ += iAbs;
                    } else {
                        c349800DnW4.LIZIZ += iAbs;
                        c349800DnW4.LIZJ += iAbs;
                    }
                    i6 = i7;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            int i8 = 0;
            for (Object obj3 : arrayList) {
                int i9 = i8 + 1;
                if (i8 >= 0) {
                    C349800DnW c349800DnW5 = (C349800DnW) obj3;
                    int i10 = c349800DnW5.LIZIZ;
                    if (i10 <= i) {
                        c349800DnW5.LIZIZ = 0;
                    } else {
                        c349800DnW5.LIZIZ = i10 - i;
                    }
                    int i11 = c349800DnW5.LIZJ;
                    if (i11 <= i) {
                        c349800DnW5.LIZJ = 0;
                    } else {
                        c349800DnW5.LIZJ = i11 - i;
                    }
                    i8 = i9;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
