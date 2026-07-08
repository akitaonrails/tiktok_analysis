package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.google.gson.internal.bind.a;
import com.google.gson.internal.q;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09CU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C09CU implements Closeable {
    public static final char[] LLJJI = ")]}'\n".toCharArray();
    public final Reader LL;
    public boolean LLILLJJLI;
    public final char[] LLILLL = new char[1024];
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public long LLJ;
    public int LLJI;
    public String LLJIJIL;
    public int[] LLJILJIL;
    public int LLJILJILJ;
    public String[] LLJILLL;
    public int[] LLJJ;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
    
        LIZLLL();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJL() throws X.C2329809Ay {
        /*
            r6 = this;
            r2 = 0
            r3 = 0
        L2:
            r4 = 0
        L3:
            int r5 = r6.LLILZ
            int r1 = r5 + r4
            int r0 = r6.LLILZIL
            if (r1 >= r0) goto L4a
            char[] r0 = r6.LLILLL
            int r5 = r5 + r4
            char r1 = r0[r5]
            r0 = 9
            if (r1 == r0) goto L87
            r0 = 10
            if (r1 == r0) goto L87
            r0 = 12
            if (r1 == r0) goto L87
            r0 = 13
            if (r1 == r0) goto L87
            r0 = 32
            if (r1 == r0) goto L87
            r0 = 35
            if (r1 == r0) goto L84
            r0 = 44
            if (r1 == r0) goto L87
            r0 = 47
            if (r1 == r0) goto L84
            r0 = 61
            if (r1 == r0) goto L84
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L87
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L87
            r0 = 58
            if (r1 == r0) goto L87
            r0 = 59
            if (r1 == r0) goto L84
            switch(r1) {
                case 91: goto L87;
                case 92: goto L84;
                case 93: goto L87;
                default: goto L47;
            }
        L47:
            int r4 = r4 + 1
            goto L3
        L4a:
            char[] r0 = r6.LLILLL
            int r0 = r0.length
            if (r4 >= r0) goto L58
            int r0 = r4 + 1
            boolean r0 = r6.LJIILL(r0)
            if (r0 == 0) goto L87
            goto L3
        L58:
            if (r2 != 0) goto L65
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r0 = 16
            int r0 = java.lang.Math.max(r4, r0)
            r2.<init>(r0)
        L65:
            char[] r1 = r6.LLILLL
            int r0 = r6.LLILZ
            r2.append(r1, r0, r4)
            int r0 = r6.LLILZ
            int r0 = r0 + r4
            r6.LLILZ = r0
            r0 = 1
            boolean r0 = r6.LJIILL(r0)
            if (r0 != 0) goto L2
        L78:
            char[] r1 = r6.LLILLL
            int r0 = r6.LLILZ
            r2.append(r1, r0, r3)
            java.lang.String r2 = r2.toString()
            goto L93
        L84:
            r6.LIZLLL()
        L87:
            r3 = r4
            if (r2 != 0) goto L78
            java.lang.String r2 = new java.lang.String
            char[] r1 = r6.LLILLL
            int r0 = r6.LLILZ
            r2.<init>(r1, r0, r3)
        L93:
            int r0 = r6.LLILZ
            int r0 = r0 + r3
            r6.LLILZ = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09CU.LJJL():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bd, code lost:
    
        LIZLLL();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x00ad. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJZ() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09CU.LJJZ():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.LLIZLLLIL = 0;
        this.LLJILJIL[0] = 8;
        this.LLJILJILJ = 1;
        this.LL.close();
    }

    static {
        q.LIZ = new q() { // from class: X.09CP
            @Override // com.google.gson.internal.q
            public final void LIZ(C09CU c09cu) throws IOException {
                if (c09cu instanceof a) {
                    a aVar = (a) c09cu;
                    aVar.getClass();
                    aVar.LJLIIIL(C09D6.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) aVar.LJLJI()).next();
                    aVar.LJLJL(entry.getValue());
                    aVar.LJLJL(new com.google.gson.q((String) entry.getKey()));
                    return;
                }
                int iLJFF = c09cu.LLIZLLLIL;
                if (iLJFF == 0) {
                    iLJFF = c09cu.LJFF();
                }
                if (iLJFF == 13) {
                    c09cu.LLIZLLLIL = 9;
                    return;
                }
                if (iLJFF == 12) {
                    c09cu.LLIZLLLIL = 8;
                    return;
                }
                if (iLJFF == 14) {
                    c09cu.LLIZLLLIL = 10;
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected a name but was ");
                sbLIZ.append(c09cu.LJJLIIIJ());
                sbLIZ.append(c09cu.LJIJJLI());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    public void LIZ() {
        int iLJFF = this.LLIZLLLIL;
        if (iLJFF == 0) {
            iLJFF = LJFF();
        }
        if (iLJFF == 3) {
            LJJLIIIJL(1);
            this.LLJJ[this.LLJILJILJ - 1] = 0;
            this.LLIZLLLIL = 0;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected BEGIN_ARRAY but was ");
            sbLIZ.append(LJJLIIIJ());
            sbLIZ.append(LJIJJLI());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void LIZIZ() {
        int iLJFF = this.LLIZLLLIL;
        if (iLJFF == 0) {
            iLJFF = LJFF();
        }
        if (iLJFF == 1) {
            LJJLIIIJL(3);
            this.LLIZLLLIL = 0;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected BEGIN_OBJECT but was ");
            sbLIZ.append(LJJLIIIJ());
            sbLIZ.append(LJIJJLI());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZLLL() throws C2329809Ay {
        if (this.LLILLJJLI) {
            return;
        }
        LJL("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0203, code lost:
    
        if (LJIJJ(r1) != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0205, code lost:
    
        if (r3 != 2) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0207, code lost:
    
        if (r16 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x020d, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x020f, code lost:
    
        if (r15 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0213, code lost:
    
        if (r8 != 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0215, code lost:
    
        if (r15 != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0217, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0218, code lost:
    
        r19.LLJ = r8;
        r19.LLILZ += r6;
        r19.LLIZLLLIL = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0223, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0224, code lost:
    
        if (r15 == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0227, code lost:
    
        if (r3 == 2) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x022a, code lost:
    
        if (r3 == 4) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x022d, code lost:
    
        if (r3 != 7) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x022f, code lost:
    
        r19.LLJI = r6;
        r19.LLIZLLLIL = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0235, code lost:
    
        return 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJFF() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09CU.LJFF():int");
    }

    public void LJI() {
        int iLJFF = this.LLIZLLLIL;
        if (iLJFF == 0) {
            iLJFF = LJFF();
        }
        if (iLJFF != 4) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected END_ARRAY but was ");
            sbLIZ.append(LJJLIIIJ());
            sbLIZ.append(LJIJJLI());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i = this.LLJILJILJ - 1;
        this.LLJILJILJ = i;
        int[] iArr = this.LLJJ;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.LLIZLLLIL = 0;
    }

    public void LJII() {
        int iLJFF = this.LLIZLLLIL;
        if (iLJFF == 0) {
            iLJFF = LJFF();
        }
        if (iLJFF != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected END_OBJECT but was ");
            sbLIZ.append(LJJLIIIJ());
            sbLIZ.append(LJIJJLI());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i = this.LLJILJILJ - 1;
        this.LLJILJILJ = i;
        this.LLJILLL[i] = null;
        int[] iArr = this.LLJJ;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.LLIZLLLIL = 0;
    }

    public String LJIILLIIL() {
        StringBuilder sb = new StringBuilder(e3.c);
        int i = this.LLJILJILJ;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.LLJILJIL[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.LLJJ[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.LLJILLL[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean LJIIZILJ() throws IOException {
        int iLJFF = this.LLIZLLLIL;
        if (iLJFF == 0) {
            iLJFF = LJFF();
        }
        return (iLJFF == 2 || iLJFF == 4) ? false : true;
    }

    public final String LJIJJLI() {
        int i = this.LLILZLL + 1;
        int i2 = (this.LLILZ - this.LLIZ) + 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" at line ");
        sbLIZ.append(i);
        sbLIZ.append(" column ");
        sbLIZ.append(i2);
        sbLIZ.append(" path ");
        sbLIZ.append(LJIILLIIL());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean LJJ() throws IOException {
        int iLJFF = this.LLIZLLLIL;
        if (iLJFF == 0) {
            iLJFF = LJFF();
        }
        if (iLJFF == 5) {
            this.LLIZLLLIL = 0;
            int[] iArr = this.LLJJ;
            int i = this.LLJILJILJ - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iLJFF == 6) {
            this.LLIZLLLIL = 0;
            int[] iArr2 = this.LLJJ;
            int i2 = this.LLJILJILJ - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected a boolean but was ");
        sbLIZ.append(LJJLIIIJ());
        sbLIZ.append(LJIJJLI());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public double LJJIL() throws IOException {
        char c;
        int iLJFF = this.LLIZLLLIL;
        if (iLJFF == 0) {
            iLJFF = LJFF();
        }
        if (iLJFF == 15) {
            this.LLIZLLLIL = 0;
            int[] iArr = this.LLJJ;
            int i = this.LLJILJILJ - 1;
            iArr[i] = iArr[i] + 1;
            return this.LLJ;
        }
        if (iLJFF == 16) {
            this.LLJIJIL = new String(this.LLILLL, this.LLILZ, this.LLJI);
            this.LLILZ += this.LLJI;
        } else {
            if (iLJFF == 8) {
                c = '\'';
            } else if (iLJFF == 9) {
                c = '\"';
            } else if (iLJFF == 10) {
                this.LLJIJIL = LJJL();
            } else if (iLJFF != 11) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected a double but was ");
                sbLIZ.append(LJJLIIIJ());
                sbLIZ.append(LJIJJLI());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LLJIJIL = LJJJLL(c);
        }
        this.LLIZLLLIL = 11;
        double d = Double.parseDouble(this.LLJIJIL);
        if (!this.LLILLJJLI && (Double.isNaN(d) || Double.isInfinite(d))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("JSON forbids NaN and infinities: ");
            sbLIZ2.append(d);
            sbLIZ2.append(LJIJJLI());
            throw new C2329809Ay(C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LLJIJIL = null;
        this.LLIZLLLIL = 0;
        int[] iArr2 = this.LLJJ;
        int i2 = this.LLJILJILJ - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:20|(4:(2:22|(1:(16:25|65|29|57|30|55|31|61|32|59|33|63|34|67|35|54)(2:52|53))(1:27))(1:26)|67|35|54)|28|65|29|57|30|55|31|61|32|59|33|63|34) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int LJJIZ() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09CU.LJJIZ():int");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:16|(4:(2:18|(1:(16:21|53|25|51|26|57|27|55|28|61|29|59|30|63|31|50)(2:48|49))(1:23))(1:22)|63|31|50)|24|53|25|51|26|57|27|55|28|61|29|59|30) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long LJJJ() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09CU.LJJJ():long");
    }

    public String LJJJJ() {
        String strLJJJLL;
        int iLJFF = this.LLIZLLLIL;
        if (iLJFF == 0) {
            iLJFF = LJFF();
        }
        if (iLJFF == 14) {
            strLJJJLL = LJJL();
        } else if (iLJFF == 12) {
            strLJJJLL = LJJJLL('\'');
        } else {
            if (iLJFF != 13) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected a name but was ");
                sbLIZ.append(LJJLIIIJ());
                sbLIZ.append(LJIJJLI());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            strLJJJLL = LJJJLL('\"');
        }
        this.LLIZLLLIL = 0;
        this.LLJILLL[this.LLJILJILJ - 1] = strLJJJLL;
        return strLJJJLL;
    }

    public void LJJJJJL() {
        int iLJFF = this.LLIZLLLIL;
        if (iLJFF == 0) {
            iLJFF = LJFF();
        }
        if (iLJFF == 7) {
            this.LLIZLLLIL = 0;
            int[] iArr = this.LLJJ;
            int i = this.LLJILJILJ - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected null but was ");
        sbLIZ.append(LJJLIIIJ());
        sbLIZ.append(LJIJJLI());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public String LJJJZ() {
        String str;
        int iLJFF = this.LLIZLLLIL;
        if (iLJFF == 0) {
            iLJFF = LJFF();
        }
        if (iLJFF == 10) {
            str = LJJL();
        } else if (iLJFF == 8) {
            str = LJJJLL('\'');
        } else if (iLJFF == 9) {
            str = LJJJLL('\"');
        } else if (iLJFF == 11) {
            str = this.LLJIJIL;
            this.LLJIJIL = null;
        } else if (iLJFF == 15) {
            str = Long.toString(this.LLJ);
        } else {
            if (iLJFF != 16) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected a string but was ");
                sbLIZ.append(LJJLIIIJ());
                sbLIZ.append(LJIJJLI());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            str = new String(this.LLILLL, this.LLILZ, this.LLJI);
            this.LLILZ += this.LLJI;
        }
        this.LLIZLLLIL = 0;
        int[] iArr = this.LLJJ;
        int i = this.LLJILJILJ - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public C09D6 LJJLIIIJ() {
        int iLJFF = this.LLIZLLLIL;
        if (iLJFF == 0) {
            iLJFF = LJFF();
        }
        switch (iLJFF) {
            case 1:
                return C09D6.BEGIN_OBJECT;
            case 2:
                return C09D6.END_OBJECT;
            case 3:
                return C09D6.BEGIN_ARRAY;
            case 4:
                return C09D6.END_ARRAY;
            case 5:
            case 6:
                return C09D6.BOOLEAN;
            case 7:
                return C09D6.NULL;
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                return C09D6.STRING;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
                return C09D6.NAME;
            case 15:
            case 16:
                return C09D6.NUMBER;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return C09D6.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final char LJJLIIJ() throws C2329809Ay {
        int i;
        int i2;
        if (this.LLILZ == this.LLILZIL && !LJIILL(1)) {
            LJL("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.LLILLL;
        int i3 = this.LLILZ;
        int i4 = i3 + 1;
        this.LLILZ = i4;
        char c = cArr[i3];
        if (c == '\n') {
            this.LLILZLL++;
            this.LLIZ = i4;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c != 'u') {
                LJL("Invalid escape sequence");
                throw null;
            }
            if (i4 + 4 > this.LLILZIL && !LJIILL(4)) {
                LJL("Unterminated escape sequence");
                throw null;
            }
            int i5 = this.LLILZ;
            int i6 = i5 + 4;
            char c2 = 0;
            while (i5 < i6) {
                char c3 = this.LLILLL[i5];
                char c4 = (char) (c2 << 4);
                if (c3 >= '0') {
                    if (c3 <= '9') {
                        i2 = c3 - '0';
                    } else if (c3 >= 'a') {
                        if (c3 <= 'f') {
                            i = c3 - 'a';
                            i2 = i + 10;
                        }
                    } else if (c3 >= 'A' && c3 <= 'F') {
                        i = c3 - 'A';
                        i2 = i + 10;
                    }
                    c2 = (char) (c4 + i2);
                    i5++;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\\u");
                sbLIZ.append(new String(this.LLILLL, this.LLILZ, 4));
                throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LLILZ += 4;
            return c2;
        }
        return c;
    }

    public final void LJJLL() {
        char c;
        do {
            if (this.LLILZ >= this.LLILZIL && !LJIILL(1)) {
                return;
            }
            char[] cArr = this.LLILLL;
            int i = this.LLILZ;
            int i2 = i + 1;
            this.LLILZ = i2;
            c = cArr[i];
            if (c == '\n') {
                this.LLILZLL++;
                this.LLIZ = i2;
                return;
            }
        } while (c != '\r');
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(LJIJJLI());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C09CU(Reader reader) {
        int[] iArr = new int[32];
        this.LLJILJIL = iArr;
        int i = this.LLJILJILJ;
        this.LLJILJILJ = i + 1;
        iArr[i] = 6;
        this.LLJILLL = new String[32];
        this.LLJJ = new int[32];
        if (reader != null) {
            this.LL = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    public final boolean LJIILL(int i) throws IOException {
        int i2;
        char[] cArr = this.LLILLL;
        int i3 = this.LLIZ;
        int i4 = this.LLILZ;
        this.LLIZ = i3 - i4;
        int i5 = this.LLILZIL;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.LLILZIL = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.LLILZIL = 0;
        }
        this.LLILZ = 0;
        do {
            Reader reader = this.LL;
            int i7 = this.LLILZIL;
            int i8 = reader.read(cArr, i7, cArr.length - i7);
            if (i8 == -1) {
                return false;
            }
            i2 = this.LLILZIL + i8;
            this.LLILZIL = i2;
            if (this.LLILZLL == 0 && this.LLIZ == 0 && i2 > 0 && cArr[0] == 65279) {
                this.LLILZ++;
                this.LLIZ = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final boolean LJIJJ(char c) throws C2329809Ay {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            LIZLLL();
            return false;
        }
        return false;
    }

    public final int LJJJJJ(boolean z) throws IOException {
        char[] cArr = this.LLILLL;
        int i = this.LLILZ;
        int i2 = this.LLILZIL;
        while (true) {
            if (i == i2) {
                this.LLILZ = i;
                if (!LJIILL(1)) {
                    if (!z) {
                        return -1;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("End of input");
                    sbLIZ.append(LJIJJLI());
                    throw new EOFException(C2188811AlT.LIZIZ(sbLIZ));
                }
                i = this.LLILZ;
                i2 = this.LLILZIL;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.LLILZLL++;
                this.LLIZ = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.LLILZ = i3;
                    if (i3 == i2) {
                        this.LLILZ = i3 - 1;
                        boolean zLJIILL = LJIILL(2);
                        this.LLILZ++;
                        if (!zLJIILL) {
                            return c;
                        }
                    }
                    LIZLLL();
                    int i4 = this.LLILZ;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            return c;
                        }
                        this.LLILZ = i4 + 1;
                        LJJLL();
                        i = this.LLILZ;
                        i2 = this.LLILZIL;
                    } else {
                        this.LLILZ = i4 + 1;
                        while (true) {
                            int i5 = 0;
                            if (this.LLILZ + 2 > this.LLILZIL && !LJIILL(2)) {
                                LJL("Unterminated comment");
                                throw null;
                            }
                            char[] cArr2 = this.LLILLL;
                            int i6 = this.LLILZ;
                            if (cArr2[i6] == '\n') {
                                this.LLILZLL++;
                                this.LLIZ = i6 + 1;
                            } else {
                                while (this.LLILLL[this.LLILZ + i5] == "*/".charAt(i5)) {
                                    i5++;
                                    if (i5 >= 2) {
                                        i = this.LLILZ + 2;
                                        i2 = this.LLILZIL;
                                        break;
                                    }
                                }
                            }
                            this.LLILZ++;
                        }
                    }
                } else if (c == '#') {
                    this.LLILZ = i3;
                    LIZLLL();
                    LJJLL();
                    i = this.LLILZ;
                    i2 = this.LLILZIL;
                } else {
                    this.LLILZ = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r4 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        r1.append(r2, r3, r4 - r3);
        r10.LLILZ = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJJLL(char r11) throws X.C2329809Ay {
        /*
            r10 = this;
            char[] r2 = r10.LLILLL
            r9 = 0
            r1 = r9
        L4:
            int r3 = r10.LLILZ
            int r8 = r10.LLILZIL
        L8:
            r4 = r3
        L9:
            r7 = 1
            r6 = 16
            if (r4 >= r8) goto L54
            int r5 = r4 + 1
            char r4 = r2[r4]
            if (r4 != r11) goto L20
            r10.LLILZ = r5
            int r5 = r5 - r3
            int r5 = r5 - r7
            if (r1 != 0) goto L76
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r3, r5)
            return r0
        L20:
            r0 = 92
            if (r4 != r0) goto L46
            r10.LLILZ = r5
            int r5 = r5 - r3
            int r5 = r5 - r7
            if (r1 != 0) goto L37
            int r0 = r5 + 1
            int r0 = r0 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = java.lang.Math.max(r0, r6)
            r1.<init>(r0)
        L37:
            r1.append(r2, r3, r5)
            char r0 = r10.LJJLIIJ()
            r1.append(r0)
            int r3 = r10.LLILZ
            int r8 = r10.LLILZIL
            goto L8
        L46:
            r0 = 10
            if (r4 != r0) goto L52
            int r0 = r10.LLILZLL
            int r0 = r0 + 1
            r10.LLILZLL = r0
            r10.LLIZ = r5
        L52:
            r4 = r5
            goto L9
        L54:
            if (r1 != 0) goto L63
            int r0 = r4 - r3
            int r0 = r0 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = java.lang.Math.max(r0, r6)
            r1.<init>(r0)
        L63:
            int r0 = r4 - r3
            r1.append(r2, r3, r0)
            r10.LLILZ = r4
            boolean r0 = r10.LJIILL(r7)
            if (r0 != 0) goto L4
            java.lang.String r0 = "Unterminated string"
            r10.LJL(r0)
            throw r9
        L76:
            r1.append(r2, r3, r5)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09CU.LJJJLL(char):java.lang.String");
    }

    public final void LJJLIIIJL(int i) {
        int i2 = this.LLJILJILJ;
        int[] iArr = this.LLJILJIL;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            int[] iArr3 = new int[i2 * 2];
            String[] strArr = new String[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.LLJJ, 0, iArr3, 0, this.LLJILJILJ);
            System.arraycopy(this.LLJILLL, 0, strArr, 0, this.LLJILJILJ);
            this.LLJILJIL = iArr2;
            this.LLJJ = iArr3;
            this.LLJILLL = strArr;
        }
        int[] iArr4 = this.LLJILJIL;
        int i3 = this.LLJILJILJ;
        this.LLJILJILJ = i3 + 1;
        iArr4[i3] = i;
    }

    public final void LJJLIL(char c) throws C2329809Ay {
        char[] cArr = this.LLILLL;
        do {
            int i = this.LLILZ;
            int i2 = this.LLILZIL;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.LLILZ = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.LLILZ = i3;
                    LJJLIIJ();
                    i = this.LLILZ;
                    i2 = this.LLILZIL;
                } else {
                    if (c2 == '\n') {
                        this.LLILZLL++;
                        this.LLIZ = i3;
                    }
                    i = i3;
                }
            }
            this.LLILZ = i;
        } while (LJIILL(1));
        LJL("Unterminated string");
        throw null;
    }

    public final void LJL(String str) throws C2329809Ay {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(LJIJJLI());
        throw new C2329809Ay(C2188811AlT.LIZIZ(sbLIZ));
    }
}
