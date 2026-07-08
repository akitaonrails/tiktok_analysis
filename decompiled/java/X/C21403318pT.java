package X;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.18pT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21403318pT {
    public final InterfaceC21405018pk LIZ;
    public final C21403618pW LIZIZ;
    public final C14IQ LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.text.Editable r8, android.view.KeyEvent r9, boolean r10) {
        /*
            int r0 = r9.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            r7 = 1
            r0 = r0 ^ 1
            r6 = 0
            if (r0 == 0) goto Lf
            return r6
        Lf:
            int r5 = android.text.Selection.getSelectionStart(r8)
            int r1 = android.text.Selection.getSelectionEnd(r8)
            r0 = -1
            if (r5 == r0) goto L4c
            if (r1 == r0) goto L4c
            if (r5 != r1) goto L4c
            java.lang.Class<X.18pU> r0 = X.AbstractC21403418pU.class
            java.lang.Object[] r4 = r8.getSpans(r5, r1, r0)
            X.18pU[] r4 = (X.AbstractC21403418pU[]) r4
            if (r4 == 0) goto L4b
            int r0 = r4.length
            if (r0 <= 0) goto L4b
            int r3 = r4.length
            r2 = 0
        L2d:
            if (r2 >= r3) goto L4b
            r0 = r4[r2]
            int r1 = r8.getSpanStart(r0)
            int r0 = r8.getSpanEnd(r0)
            if (r10 == 0) goto L48
            if (r1 == r5) goto L41
        L3d:
            if (r5 <= r1) goto L45
            if (r5 >= r0) goto L45
        L41:
            r8.delete(r1, r0)
            return r7
        L45:
            int r2 = r2 + 1
            goto L2d
        L48:
            if (r0 == r5) goto L41
            goto L3d
        L4b:
            return r6
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21403318pT.LIZ(android.text.Editable, android.view.KeyEvent, boolean):boolean");
    }

    public C21403318pT(C21403618pW c21403618pW, C21404318pd c21404318pd, C14IP c14ip, Set set) {
        this.LIZ = c21404318pd;
        this.LIZIZ = c21403618pW;
        this.LIZJ = c14ip;
        if (!set.isEmpty()) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                int[] iArr = (int[]) it2.next();
                final String str = new String(iArr, 0, iArr.length);
                LIZJ(str, 0, str.length(), 1, true, new InterfaceC21404018pa<C21403218pS>(str) { // from class: X.18pS
                    public final String LIZ;

                    @Override // X.InterfaceC21404018pa
                    public final C21403218pS getResult() {
                        return this;
                    }

                    {
                        this.LIZ = str;
                    }

                    @Override // X.InterfaceC21404018pa
                    public final boolean LIZ(CharSequence charSequence, int i, int i2, C21403818pY c21403818pY) {
                        if (TextUtils.equals(charSequence.subSequence(i, i2), this.LIZ)) {
                            c21403818pY.LIZJ = (c21403818pY.LIZJ & 3) | 4;
                            return false;
                        }
                        return true;
                    }
                });
            }
        }
    }

    public final boolean LIZIZ(CharSequence charSequence, int i, int i2, C21403818pY c21403818pY) {
        int i3;
        if ((c21403818pY.LIZJ & 3) == 0) {
            C14IQ c14iq = this.LIZJ;
            C21404718ph c21404718phLIZJ = c21403818pY.LIZJ();
            int iLIZ = c21404718phLIZJ.LIZ(8);
            if (iLIZ != 0) {
                c21404718phLIZJ.LIZIZ.getShort(iLIZ + c21404718phLIZJ.LIZ);
            }
            C14IP c14ip = (C14IP) c14iq;
            c14ip.getClass();
            ThreadLocal<StringBuilder> threadLocal = C14IP.LIZIZ;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zLIZ = C21404618pg.LIZ(c14ip.LIZ, sb.toString());
            int i4 = c21403818pY.LIZJ & 4;
            if (zLIZ) {
                i3 = i4 | 2;
            } else {
                i3 = i4 | 1;
            }
            c21403818pY.LIZJ = i3;
        }
        if ((c21403818pY.LIZJ & 3) != 2) {
            return false;
        }
        return true;
    }

    public final <T> T LIZJ(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC21404018pa<T> interfaceC21404018pa) {
        int i4;
        char c;
        C21403918pZ c21403918pZ = null;
        C21403518pV c21403518pV = new C21403518pV(this.LIZIZ.LIZJ, false, null);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zLIZ = true;
        loop0: while (true) {
            i4 = i;
            while (i < i2 && i5 < i3 && zLIZ) {
                SparseArray<C21403918pZ> sparseArray = c21403518pV.LIZJ.LIZ;
                if (sparseArray != null) {
                    c21403918pZ = sparseArray.get(iCodePointAt);
                }
                if (c21403518pV.LIZ != 2) {
                    if (c21403918pZ == null) {
                        c21403518pV.LIZ();
                        c = 1;
                    } else {
                        c21403518pV.LIZ = 2;
                        c21403518pV.LIZJ = c21403918pZ;
                        c21403518pV.LJFF = 1;
                        c = 2;
                    }
                } else {
                    if (c21403918pZ != null) {
                        c21403518pV.LIZJ = c21403918pZ;
                        c21403518pV.LJFF++;
                    } else {
                        if (iCodePointAt == 65038) {
                            c21403518pV.LIZ();
                        } else if (iCodePointAt != 65039) {
                            C21403918pZ c21403918pZ2 = c21403518pV.LIZJ;
                            if (c21403918pZ2.LIZIZ != null) {
                                if (c21403518pV.LJFF == 1) {
                                    if (c21403518pV.LIZIZ()) {
                                        c21403518pV.LIZLLL = c21403518pV.LIZJ;
                                        c21403518pV.LIZ();
                                    } else {
                                        c21403518pV.LIZ();
                                    }
                                } else {
                                    c21403518pV.LIZLLL = c21403918pZ2;
                                    c21403518pV.LIZ();
                                }
                                c = 3;
                            } else {
                                c21403518pV.LIZ();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                }
                c21403518pV.LJ = iCodePointAt;
                if (c != 1) {
                    if (c != 2) {
                        if (z || !LIZIZ(charSequence, i4, i, c21403518pV.LIZLLL.LIZIZ)) {
                            zLIZ = interfaceC21404018pa.LIZ(charSequence, i4, i, c21403518pV.LIZLLL.LIZIZ);
                            i5++;
                        }
                        i4 = i;
                    } else {
                        i += Character.charCount(iCodePointAt);
                        if (i < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, i);
                        }
                    }
                    c21403918pZ = null;
                } else {
                    i = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, i);
                    }
                    c21403918pZ = null;
                }
            }
            break loop0;
        }
        if (c21403518pV.LIZ == 2 && c21403518pV.LIZJ.LIZIZ != null && ((c21403518pV.LJFF > 1 || c21403518pV.LIZIZ()) && i5 < i3 && zLIZ && (z || !LIZIZ(charSequence, i4, i, c21403518pV.LIZJ.LIZIZ)))) {
            interfaceC21404018pa.LIZ(charSequence, i4, i, c21403518pV.LIZJ.LIZIZ);
        }
        return interfaceC21404018pa.getResult();
    }
}
