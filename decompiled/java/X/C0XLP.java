package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import ttpobfuscated.e3;
import xlp.c;

/* JADX INFO: renamed from: X.0XLP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XLP {
    public String LIZ;
    public String LIZLLL;
    public final List<String> LJFF;
    public List<String> LJI;
    public String LJII;
    public String LIZIZ = "";
    public String LIZJ = "";
    public int LJ = -1;

    public final C0XLQ LIZLLL() {
        if (this.LIZ == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.LIZLLL != null) {
            return new C0XLQ(this);
        }
        throw new IllegalStateException("host == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r7.LIZ != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[LOOP:0: B:29:0x007f->B:30:0x0081, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XLP.toString():java.lang.String");
    }

    public C0XLP() {
        ArrayList arrayList = new ArrayList();
        this.LJFF = arrayList;
        arrayList.add("");
    }

    public final void LIZIZ(String str) {
        if (str != null) {
            LJIIIIZZ(0, str.length(), str, false, false);
            return;
        }
        throw new NullPointerException("pathSegment == null");
    }

    public final void LJ(String str) {
        if (str != null) {
            if (str.startsWith("/")) {
                LJIIJ(0, str.length(), str);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unexpected encodedPath: ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new NullPointerException("encodedPath == null");
    }

    public final void LJFF(String str) {
        if (str != null) {
            String strLIZJ = c.LIZJ(C0XLQ.LJIILIIL(0, str.length(), str, false));
            if (strLIZJ != null) {
                this.LIZLLL = strLIZJ;
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unexpected host: ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new NullPointerException("host == null");
    }

    public final void LJII(int i) {
        if (i > 0 && i <= 65535) {
            this.LJ = i;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unexpected port: ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIIZ(String str) {
        if (str != null) {
            if (this.LJI == null) {
                return;
            }
            String strLIZJ = C0XLQ.LIZJ(str, false, false, true, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", true);
            int size = this.LJI.size();
            while (true) {
                size -= 2;
                if (size >= 0) {
                    if (strLIZJ.equals(ListProtector.get(this.LJI, size))) {
                        ListProtector.remove(this.LJI, size + 1);
                        ListProtector.remove(this.LJI, size);
                        if (this.LJI.isEmpty()) {
                            this.LJI = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new NullPointerException("name == null");
        }
    }

    public final void LJIIJJI(String str) {
        if (str != null) {
            if (str.equalsIgnoreCase("http")) {
                this.LIZ = "http";
                return;
            } else {
                if (str.equalsIgnoreCase("https")) {
                    this.LIZ = "https";
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unexpected scheme: ");
                sbLIZ.append(str);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        throw new NullPointerException("scheme == null");
    }

    public final void LIZ(String str, String str2) {
        String strLIZJ;
        if (str != null) {
            if (this.LJI == null) {
                this.LJI = new ArrayList();
            }
            this.LJI.add(C0XLQ.LIZJ(str, true, false, true, " \"'<>#&=", true));
            List<String> list = this.LJI;
            if (str2 != null) {
                strLIZJ = C0XLQ.LIZJ(str2, true, false, true, " \"'<>#&=", true);
            } else {
                strLIZJ = null;
            }
            list.add(strLIZJ);
            return;
        }
        throw new NullPointerException("encodedName == null");
    }

    public final void LIZJ(String str, String str2) {
        String strLIZJ;
        if (str != null) {
            if (this.LJI == null) {
                this.LJI = new ArrayList();
            }
            this.LJI.add(C0XLQ.LIZJ(str, false, false, true, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", true));
            List<String> list = this.LJI;
            if (str2 != null) {
                strLIZJ = C0XLQ.LIZJ(str2, false, false, true, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", true);
            } else {
                strLIZJ = null;
            }
            list.add(strLIZJ);
            return;
        }
        throw new NullPointerException("name == null");
    }

    public final void LJIIL(String str, String str2) {
        LJIIIZ(str);
        LIZJ(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f A[EDGE_INSN: B:152:0x002f->B:7:0x002f BREAK  A[LOOP:0: B:20:0x0050->B:165:0x0050], EDGE_INSN: B:154:0x002f->B:7:0x002f BREAK  A[LOOP:0: B:20:0x0050->B:165:0x0050], EDGE_INSN: B:157:0x002f->B:7:0x002f BREAK  A[LOOP:0: B:20:0x0050->B:165:0x0050]] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C0XLQ r26, java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XLP.LJI(X.0XLQ, java.lang.String, boolean):void");
    }

    public final void LJIIJ(int i, int i2, String str) {
        boolean z;
        int iLJIIIIZZ = i;
        if (iLJIIIIZZ == i2) {
            return;
        }
        char cCharAt = str.charAt(iLJIIIIZZ);
        if (cCharAt != '/' && cCharAt != '\\') {
            List<String> list = this.LJFF;
            ListProtector.set(list, ((ArrayList) list).size() - 1, "");
        } else {
            ((ArrayList) this.LJFF).clear();
            ((ArrayList) this.LJFF).add("");
            iLJIIIIZZ++;
        }
        while (true) {
            int i3 = iLJIIIIZZ;
            if (iLJIIIIZZ < i2) {
                iLJIIIIZZ = c.LJIIIIZZ(i3, i2, str, "/\\");
                if (iLJIIIIZZ < i2) {
                    z = true;
                } else {
                    z = false;
                }
                LJIIIIZZ(i3, iLJIIIIZZ, str, z, true);
                if (z) {
                    iLJIIIIZZ++;
                }
            } else {
                return;
            }
        }
    }

    public final void LJIIIIZZ(int i, int i2, String str, boolean z, boolean z2) {
        String strLIZ = C0XLQ.LIZ(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
        boolean z3 = false;
        if (!strLIZ.equals(e3.d) && !strLIZ.equalsIgnoreCase("%2e")) {
            if (strLIZ.equals("..") || strLIZ.equalsIgnoreCase("%2e.") || strLIZ.equalsIgnoreCase(".%2e") || strLIZ.equalsIgnoreCase("%2e%2e")) {
                z3 = true;
            }
            if (z3) {
                if (((String) ListProtector.remove(this.LJFF, ((ArrayList) r1).size() - 1)).isEmpty() && !((ArrayList) this.LJFF).isEmpty()) {
                    ListProtector.set(this.LJFF, ((ArrayList) r1).size() - 1, "");
                    return;
                } else {
                    ((ArrayList) this.LJFF).add("");
                    return;
                }
            }
            List<String> list = this.LJFF;
            if (((String) ListProtector.get(list, ((ArrayList) list).size() - 1)).isEmpty()) {
                List<String> list2 = this.LJFF;
                ListProtector.set(list2, ((ArrayList) list2).size() - 1, strLIZ);
            } else {
                ((ArrayList) this.LJFF).add(strLIZ);
            }
            if (z) {
                ((ArrayList) this.LJFF).add("");
            }
        }
    }
}
