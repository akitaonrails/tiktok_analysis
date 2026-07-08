package X;

import android.text.TextPaint;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Ct4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327760Ct4 {
    public final TextPaint LIZ;
    public final float LIZIZ;
    public HashMap<String, Float> LIZJ = new HashMap<>();
    public ArrayList<C327770Ct5> LIZLLL = new ArrayList<>();
    public float LJ;

    public final float LIZLLL(String str) {
        if (this.LIZJ.containsKey(str)) {
            Float f = this.LIZJ.get(str);
            if (f != null) {
                return f.floatValue();
            }
            return 0.0f;
        }
        float[] fArr = new float[1];
        this.LIZ.breakText(str, true, this.LIZIZ, fArr);
        this.LIZJ.put(str, Float.valueOf(fArr[0]));
        return fArr[0];
    }

    public C327760Ct4(TextPaint textPaint, float f) {
        this.LIZ = textPaint;
        this.LIZIZ = f;
    }

    public final void LIZ(int i, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (i >= arrayList.size()) {
            return;
        }
        int size = arrayList.size();
        float f = 0.0f;
        float fLIZLLL = 0.0f;
        for (int i2 = i; i2 < size; i2++) {
            fLIZLLL += LIZLLL((String) ListProtector.get(list, i2));
        }
        if (fLIZLLL > this.LIZIZ) {
            int i3 = 0;
            int i4 = i;
            do {
                int iLIZIZ = LIZIZ(i4, list);
                if (iLIZIZ != -1) {
                    i4 = iLIZIZ + 1;
                    i3++;
                } else {
                    float f2 = fLIZLLL / 2;
                    int size2 = arrayList.size();
                    int i5 = i;
                    while (i5 < size2) {
                        float fLIZLLL2 = LIZLLL((String) ListProtector.get(list, i5)) + f;
                        if (fLIZLLL2 >= f2) {
                            if (f2 - f < fLIZLLL2 - f2) {
                                i5--;
                            }
                            C327770Ct5 c327770Ct5LJ = LJ(i, i5, list);
                            if (c327770Ct5LJ != null) {
                                this.LIZLLL.add(c327770Ct5LJ);
                            }
                            C327770Ct5 c327770Ct5LJ2 = LJ(i5 + 1, arrayList.size() - 1, list);
                            if (c327770Ct5LJ2 != null) {
                                this.LIZLLL.add(c327770Ct5LJ2);
                                return;
                            }
                            return;
                        }
                        i5++;
                        f = fLIZLLL2;
                    }
                    return;
                }
            } while (i3 <= 2);
            while (true) {
                int iLIZIZ2 = LIZIZ(i, list);
                if (iLIZIZ2 != -1) {
                    C327770Ct5 c327770Ct5LJ3 = LJ(i, iLIZIZ2, list);
                    if (c327770Ct5LJ3 != null) {
                        this.LIZLLL.add(c327770Ct5LJ3);
                    }
                    if (this.LIZLLL.size() < 2) {
                        i = iLIZIZ2 + 1;
                    } else {
                        if (iLIZIZ2 != -1 && iLIZIZ2 < arrayList.size() - 1) {
                            LIZ(iLIZIZ2 + 1, list);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            C327770Ct5 c327770Ct5LJ4 = LJ(i, arrayList.size() - 1, list);
            if (c327770Ct5LJ4 != null) {
                this.LIZLLL.add(c327770Ct5LJ4);
            }
        }
    }

    public final int LIZIZ(int i, List list) {
        int size = ((ArrayList) list).size();
        float fLIZLLL = 0.0f;
        while (i < size) {
            fLIZLLL += LIZLLL((String) ListProtector.get(list, i));
            if (fLIZLLL > this.LIZIZ) {
                return i - 1;
            }
            if (i == r4.size() - 1 && fLIZLLL > 0.0f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r7, X.InterfaceC1364105Vn<? super java.util.ArrayList<X.C327770Ct5>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C327750Ct3
            if (r0 == 0) goto L5c
            r5 = r8
            X.0Ct3 r5 = (X.C327750Ct3) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L3c
            if (r0 != r3) goto L7f
            X.C155000ia.LIZIZ(r1)
        L22:
            java.util.ArrayList<X.0Ct5> r0 = r6.LIZLLL
            java.util.Iterator r2 = r0.iterator()
        L28:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r2.next()
            X.0Ct5 r0 = (X.C327770Ct5) r0
            float r1 = r6.LJ
            float r0 = r0.LIZIZ
            float r1 = r1 + r0
            r6.LJ = r1
            goto L28
        L3c:
            X.C155000ia.LIZIZ(r1)
            int r0 = r7.length()
            if (r0 != 0) goto L4b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L4b:
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0Ct2 r1 = new X.0Ct2
            r0 = 0
            r1.<init>(r6, r7, r0)
            r5.LLILLL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r5, r2, r1)
            if (r0 != r4) goto L22
            return r4
        L5c:
            X.0Ct3 r5 = new X.0Ct3
            r5.<init>(r6, r8)
            goto L12
        L62:
            java.util.ArrayList<X.0Ct5> r0 = r6.LIZLLL
            java.util.Iterator r3 = r0.iterator()
        L68:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r2 = r3.next()
            X.0Ct5 r2 = (X.C327770Ct5) r2
            float r1 = r2.LIZIZ
            float r0 = r6.LJ
            float r1 = r1 / r0
            r2.LIZIZ = r1
            goto L68
        L7c:
            java.util.ArrayList<X.0Ct5> r0 = r6.LIZLLL
            return r0
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327760Ct4.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final C327770Ct5 LJ(int i, int i2, List<String> list) {
        if (i2 >= i && i >= 0 && i2 < ((ArrayList) list).size()) {
            StringBuilder sb = new StringBuilder();
            float fLIZLLL = 0.0f;
            if (i <= i2) {
                while (true) {
                    sb.append((String) ListProtector.get(list, i));
                    fLIZLLL += LIZLLL((String) ListProtector.get(list, i));
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
            return new C327770Ct5(sb.toString(), fLIZLLL);
        }
        return null;
    }
}
