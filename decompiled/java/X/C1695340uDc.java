package X;

import android.text.Layout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0uDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695340uDc {
    public final Layout LIZ;
    public final List<Integer> LIZIZ;
    public final List<Bidi> LIZJ;
    public final boolean[] LIZLLL;
    public char[] LJ;

    public C1695340uDc(Layout layout) {
        this.LIZ = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iLJJIZ = a0.LJJIZ(this.LIZ.getText(), '\n', length, false, 4);
            if (iLJJIZ < 0) {
                length = this.LIZ.getText().length();
            } else {
                length = iLJJIZ + 1;
            }
            arrayList.add(Integer.valueOf(length));
        } while (length < this.LIZ.getText().length());
        this.LIZIZ = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.LIZJ = arrayList2;
        this.LIZLLL = new boolean[((ArrayList) this.LIZIZ).size()];
        ((ArrayList) this.LIZIZ).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi LIZ(int r11) {
        /*
            r10 = this;
            boolean[] r0 = r10.LIZLLL
            boolean r0 = r0[r11]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r10.LIZJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r11)
            java.text.Bidi r0 = (java.text.Bidi) r0
            return r0
        Lf:
            r3 = 0
            if (r11 != 0) goto L74
            r2 = 0
        L13:
            java.util.List<java.lang.Integer> r0 = r10.LIZIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r11)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r8 = r1 - r2
            char[] r4 = r10.LJ
            if (r4 == 0) goto L28
            int r0 = r4.length
            if (r0 >= r8) goto L2a
        L28:
            char[] r4 = new char[r8]
        L2a:
            android.text.Layout r0 = r10.LIZ
            java.lang.CharSequence r0 = r0.getText()
            android.text.TextUtils.getChars(r0, r2, r1, r4, r3)
            boolean r0 = java.text.Bidi.requiresBidi(r4, r3, r8)
            r2 = 1
            r6 = 0
            if (r0 == 0) goto L5c
            android.text.Layout r1 = r10.LIZ
            int r0 = r10.LJ(r11)
            int r1 = r1.getLineForOffset(r0)
            android.text.Layout r0 = r10.LIZ
            int r1 = r0.getParagraphDirection(r1)
            r0 = -1
            if (r1 != r0) goto L72
            r9 = 1
        L4f:
            java.text.Bidi r3 = new java.text.Bidi
            r5 = 0
            r7 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r0 = r3.getRunCount()
            if (r0 != r2) goto L5d
        L5c:
            r3 = r6
        L5d:
            java.util.List<java.text.Bidi> r0 = r10.LIZJ
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r0, r11, r3)
            boolean[] r0 = r10.LIZLLL
            r0[r11] = r2
            if (r3 == 0) goto L6d
            char[] r0 = r10.LJ
            if (r4 != r0) goto L70
            r4 = r6
        L6d:
            r10.LJ = r4
            return r3
        L70:
            r4 = r0
            goto L6d
        L72:
            r9 = 0
            goto L4f
        L74:
            java.util.List<java.lang.Integer> r1 = r10.LIZIZ
            int r0 = r11 + (-1)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1695340uDc.LIZ(int):java.text.Bidi");
    }

    public final int LJ(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ListProtector.get(this.LIZIZ, i - 1)).intValue();
    }

    public final float LIZIZ(int i, boolean z) {
        int lineEnd = this.LIZ.getLineEnd(this.LIZ.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        if (z) {
            return this.LIZ.getPrimaryHorizontal(i);
        }
        return this.LIZ.getSecondaryHorizontal(i);
    }

    public final int LIZLLL(int i, boolean z) {
        int i2;
        int iLJI = C1697810uHb.LJI(this.LIZIZ, Integer.valueOf(i));
        if (iLJI < 0) {
            i2 = -(iLJI + 1);
        } else {
            i2 = iLJI + 1;
        }
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) ListProtector.get(this.LIZIZ, i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int LJFF(int i, int i2) {
        while (i > i2) {
            char cCharAt = this.LIZ.getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760) {
                if (Intrinsics.LJI(cCharAt, 8192) >= 0 && Intrinsics.LJI(cCharAt, 8202) <= 0) {
                    if (cCharAt == 8199) {
                        break;
                    }
                } else if (cCharAt != 8287 && cCharAt != 12288) {
                    break;
                }
            }
            i--;
        }
        return i;
    }

    public final float LIZJ(int i, boolean z, boolean z2) {
        boolean z3;
        Bidi bidiCreateLineBidi;
        boolean z4;
        int iLJFF = i;
        if (!z2) {
            return LIZIZ(iLJFF, z);
        }
        int iLIZ = C1695420uDk.LIZ(this.LIZ, iLJFF, z2);
        int lineStart = this.LIZ.getLineStart(iLIZ);
        int lineEnd = this.LIZ.getLineEnd(iLIZ);
        if (iLJFF != lineStart && iLJFF != lineEnd) {
            return LIZIZ(iLJFF, z);
        }
        if (iLJFF != 0 && iLJFF != this.LIZ.getText().length()) {
            int iLIZLLL = LIZLLL(iLJFF, z2);
            boolean z5 = false;
            if (this.LIZ.getParagraphDirection(this.LIZ.getLineForOffset(LJ(iLIZLLL))) == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            int iLJFF2 = LJFF(lineEnd, lineStart);
            int iLJ = LJ(iLIZLLL);
            int i2 = lineStart - iLJ;
            int i3 = iLJFF2 - iLJ;
            Bidi bidiLIZ = LIZ(iLIZLLL);
            if (bidiLIZ != null && (bidiCreateLineBidi = bidiLIZ.createLineBidi(i2, i3)) != null && bidiCreateLineBidi.getRunCount() != 1) {
                int runCount = bidiCreateLineBidi.getRunCount();
                C1695580uE0[] c1695580uE0Arr = new C1695580uE0[runCount];
                for (int i4 = 0; i4 < runCount; i4++) {
                    int runStart = bidiCreateLineBidi.getRunStart(i4) + lineStart;
                    int runLimit = bidiCreateLineBidi.getRunLimit(i4) + lineStart;
                    if (bidiCreateLineBidi.getRunLevel(i4) % 2 == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c1695580uE0Arr[i4] = new C1695580uE0(runStart, runLimit, z4);
                }
                int runCount2 = bidiCreateLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i5 = 0; i5 < runCount2; i5++) {
                    bArr[i5] = (byte) bidiCreateLineBidi.getRunLevel(i5);
                }
                Bidi.reorderVisually(bArr, 0, c1695580uE0Arr, 0, runCount);
                if (iLJFF == lineStart) {
                    int i6 = 0;
                    while (true) {
                        if (i6 < runCount) {
                            if (c1695580uE0Arr[i6].LIZ == iLJFF) {
                                break;
                            }
                            i6++;
                        } else {
                            i6 = -1;
                            break;
                        }
                    }
                    C1695580uE0 c1695580uE0 = c1695580uE0Arr[i6];
                    if (!z && z3 != c1695580uE0.LIZJ) {
                        z5 = z3;
                    } else if (!z3) {
                        z5 = true;
                    }
                    if (i6 == 0 && z5) {
                        return this.LIZ.getLineLeft(iLIZ);
                    }
                    if (i6 == runCount - 1) {
                        if (!z5) {
                            return this.LIZ.getLineRight(iLIZ);
                        }
                    } else if (!z5) {
                        return this.LIZ.getPrimaryHorizontal(c1695580uE0Arr[i6 + 1].LIZ);
                    }
                    return this.LIZ.getPrimaryHorizontal(c1695580uE0Arr[i6 - 1].LIZ);
                }
                if (iLJFF > iLJFF2) {
                    iLJFF = LJFF(iLJFF, lineStart);
                }
                int i7 = 0;
                while (true) {
                    if (i7 < runCount) {
                        if (c1695580uE0Arr[i7].LIZIZ == iLJFF) {
                            break;
                        }
                        i7++;
                    } else {
                        i7 = -1;
                        break;
                    }
                }
                C1695580uE0 c1695580uE02 = c1695580uE0Arr[i7];
                if (!z && z3 != c1695580uE02.LIZJ) {
                    if (!z3) {
                        z5 = true;
                    }
                } else {
                    z5 = z3;
                }
                if (i7 == 0 && z5) {
                    return this.LIZ.getLineLeft(iLIZ);
                }
                if (i7 == runCount - 1) {
                    if (!z5) {
                        return this.LIZ.getLineRight(iLIZ);
                    }
                } else if (!z5) {
                    return this.LIZ.getPrimaryHorizontal(c1695580uE0Arr[i7 + 1].LIZIZ);
                }
                return this.LIZ.getPrimaryHorizontal(c1695580uE0Arr[i7 - 1].LIZIZ);
            }
            boolean zIsRtlCharAt = this.LIZ.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                if (!z3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (iLJFF == lineStart) {
                z5 = z3;
            } else if (!z3) {
                z5 = true;
            }
            Layout layout = this.LIZ;
            if (z5) {
                return layout.getLineLeft(iLIZ);
            }
            return layout.getLineRight(iLIZ);
        }
        return LIZIZ(iLJFF, z);
    }
}
