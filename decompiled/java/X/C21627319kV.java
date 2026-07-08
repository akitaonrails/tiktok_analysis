package X;

import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.19kV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21627319kV {
    public static final C21626719kP LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final C21627319kV LJI;
    public static final C21627319kV LJII;
    public final boolean LIZ;
    public final int LIZIZ;
    public final InterfaceC21543319St LIZJ;

    static {
        C21626719kP c21626719kP = C21626919kR.LIZJ;
        LIZLLL = c21626719kP;
        LJ = Character.toString((char) 8206);
        LJFF = Character.toString((char) 8207);
        LJI = new C21627319kV(false, 2, c21626719kP);
        LJII = new C21627319kV(true, 2, c21626719kP);
    }

    public static C21627319kV LIZJ() {
        return new C1086340eNM().LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r8 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r4.LIZJ <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        switch(r4.LIZ()) {
            case 14: goto L64;
            case 15: goto L64;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L66;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (r3 != r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r3 != r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(java.lang.CharSequence r8) {
        /*
            X.19kW r4 = new X.19kW
            r4.<init>(r8)
            r5 = 0
            r4.LIZJ = r5
            r3 = 0
            r8 = 0
            r2 = 0
        Lb:
            int r1 = r4.LIZJ
            int r0 = r4.LIZIZ
            r7 = 1
            if (r1 >= r0) goto L69
            if (r3 != 0) goto L6c
            java.lang.CharSequence r0 = r4.LIZ
            char r0 = r0.charAt(r1)
            r4.LIZLLL = r0
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 == 0) goto L53
            java.lang.CharSequence r1 = r4.LIZ
            int r0 = r4.LIZJ
            int r6 = java.lang.Character.codePointAt(r1, r0)
            int r1 = r4.LIZJ
            int r0 = java.lang.Character.charCount(r6)
            int r1 = r1 + r0
            r4.LIZJ = r1
            byte r1 = java.lang.Character.getDirectionality(r6)
        L37:
            if (r1 == 0) goto L87
            if (r1 == r7) goto L8b
            r0 = 2
            if (r1 == r0) goto L8b
            r0 = 9
            if (r1 == r0) goto Lb
            switch(r1) {
                case 14: goto L47;
                case 15: goto L47;
                case 16: goto L4b;
                case 17: goto L4b;
                case 18: goto L4f;
                default: goto L45;
            }
        L45:
            r3 = r2
            goto Lb
        L47:
            int r2 = r2 + 1
            r8 = -1
            goto Lb
        L4b:
            int r2 = r2 + 1
            r8 = 1
            goto Lb
        L4f:
            int r2 = r2 + (-1)
            r8 = 0
            goto Lb
        L53:
            int r0 = r4.LIZJ
            int r0 = r0 + 1
            r4.LIZJ = r0
            char r1 = r4.LIZLLL
            r0 = 1792(0x700, float:2.511E-42)
            if (r1 >= r0) goto L64
            byte[] r0 = X.C21627419kW.LJ
            r1 = r0[r1]
            goto L37
        L64:
            byte r1 = java.lang.Character.getDirectionality(r1)
            goto L37
        L69:
            if (r3 != 0) goto L6c
        L6b:
            return r5
        L6c:
            if (r8 == 0) goto L6f
            return r8
        L6f:
            int r0 = r4.LIZJ
            if (r0 <= 0) goto L6b
            byte r0 = r4.LIZ()
            switch(r0) {
                case 14: goto L7b;
                case 15: goto L7b;
                case 16: goto L7e;
                case 17: goto L7e;
                case 18: goto L84;
                default: goto L7a;
            }
        L7a:
            goto L6f
        L7b:
            if (r3 != r2) goto L81
            goto L89
        L7e:
            if (r3 != r2) goto L81
            goto L8d
        L81:
            int r2 = r2 + (-1)
            goto L6f
        L84:
            int r2 = r2 + 1
            goto L6f
        L87:
            if (r2 != 0) goto L45
        L89:
            r5 = -1
            return r5
        L8b:
            if (r2 != 0) goto L45
        L8d:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21627319kV.LIZ(java.lang.CharSequence):int");
    }

    public static int LIZIZ(CharSequence charSequence) {
        C21627419kW c21627419kW = new C21627419kW(charSequence);
        c21627419kW.LIZJ = c21627419kW.LIZIZ;
        int i = 0;
        while (true) {
            int i2 = i;
            while (c21627419kW.LIZJ > 0) {
                byte bLIZ = c21627419kW.LIZ();
                if (bLIZ != 0) {
                    if (bLIZ != 1 && bLIZ != 2) {
                        if (bLIZ != 9) {
                            switch (bLIZ) {
                                case 14:
                                case 15:
                                    if (i == i2) {
                                    }
                                    i2--;
                                    break;
                                case 16:
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    if (i == i2) {
                                        return 1;
                                    }
                                    i2--;
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                    i2++;
                                    break;
                                default:
                                    if (i != 0) {
                                    }
                                    break;
                            }
                        } else {
                            continue;
                        }
                    } else if (i2 != 0) {
                        if (i == 0) {
                            break;
                        }
                    } else {
                        return 1;
                    }
                } else if (i2 != 0) {
                    if (i == 0) {
                        break;
                    }
                }
            }
            return 0;
            i = i2;
        }
        return -1;
    }

    public final boolean LIZLLL(CharSequence charSequence) {
        return this.LIZJ.LIZ(charSequence.length(), charSequence);
    }

    public final String LJFF(String str) {
        return LJI(str, this.LIZJ);
    }

    public final CharSequence LJ(CharSequence charSequence, InterfaceC21543319St interfaceC21543319St) {
        boolean z;
        C21626719kP c21626719kP;
        char c;
        C21626719kP c21626719kP2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zLIZ = interfaceC21543319St.LIZ(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.LIZIZ & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (z) {
            if (zLIZ) {
                c21626719kP2 = C21626919kR.LIZIZ;
            } else {
                c21626719kP2 = C21626919kR.LIZ;
            }
            boolean zLIZ2 = c21626719kP2.LIZ(charSequence.length(), charSequence);
            if (!this.LIZ && (zLIZ2 || LIZ(charSequence) == 1)) {
                str = LJ;
            } else if (!this.LIZ || (zLIZ2 && LIZ(charSequence) != -1)) {
                str = "";
            } else {
                str = LJFF;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zLIZ != this.LIZ) {
            if (zLIZ) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (zLIZ) {
            c21626719kP = C21626919kR.LIZIZ;
        } else {
            c21626719kP = C21626919kR.LIZ;
        }
        boolean zLIZ3 = c21626719kP.LIZ(charSequence.length(), charSequence);
        if (!this.LIZ && (zLIZ3 || LIZIZ(charSequence) == 1)) {
            str2 = LJ;
        } else if (this.LIZ && (!zLIZ3 || LIZIZ(charSequence) == -1)) {
            str2 = LJFF;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    public final String LJI(String str, InterfaceC21543319St interfaceC21543319St) {
        if (str == null) {
            return null;
        }
        return ((SpannableStringBuilder) LJ(str, interfaceC21543319St)).toString();
    }

    public C21627319kV(boolean z, int i, C21626719kP c21626719kP) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = c21626719kP;
    }
}
