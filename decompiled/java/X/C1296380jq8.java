package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: renamed from: X.0jq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296380jq8 extends AbstractC1295900jpM {
    public static final ByteString LLJILJIL = ByteString.encodeUtf8("'\\");
    public static final ByteString LLJILJILJ = ByteString.encodeUtf8("\"\\");
    public static final ByteString LLJILLL = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    public final InterfaceC1496620p36 LLILZLL;
    public final C1496690p3D LLIZ;
    public int LLIZLLLIL;
    public long LLJ;
    public int LLJI;
    public String LLJIJIL;

    @Override // X.AbstractC1295900jpM
    public final void LJJJ() throws C1295920jpO, EOFException {
        int i = 0;
        do {
            int iLJJJJJL = this.LLIZLLLIL;
            if (iLJJJJJL == 0) {
                iLJJJJJL = LJJJJJL();
            }
            if (iLJJJJJL == 3) {
                LJJ(1);
            } else if (iLJJJJJL == 1) {
                LJJ(3);
            } else {
                if (iLJJJJJL == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Expected a value but was ");
                        sbLIZ.append(LJIJJLI());
                        sbLIZ.append(" at path ");
                        sbLIZ.append(LJI());
                        throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    this.LL--;
                } else if (iLJJJJJL == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Expected a value but was ");
                        sbLIZ2.append(LJIJJLI());
                        sbLIZ2.append(" at path ");
                        sbLIZ2.append(LJI());
                        throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    this.LL--;
                } else if (iLJJJJJL == 14 || iLJJJJJL == 10) {
                    long jLJLIIL = this.LLILZLL.LJLIIL(LLJILLL);
                    C1496690p3D c1496690p3D = this.LLIZ;
                    if (jLJLIIL == -1) {
                        jLJLIIL = c1496690p3D.LLILLJJLI;
                    }
                    c1496690p3D.skip(jLJLIIL);
                } else if (iLJJJJJL == 9 || iLJJJJJL == 13) {
                    LJJLL(LLJILJILJ);
                } else if (iLJJJJJL == 8 || iLJJJJJL == 12) {
                    LJJLL(LLJILJIL);
                } else if (iLJJJJJL == 17) {
                    this.LLIZ.skip(this.LLJI);
                } else if (iLJJJJJL == 18) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Expected a value but was ");
                    sbLIZ3.append(LJIJJLI());
                    sbLIZ3.append(" at path ");
                    sbLIZ3.append(LJI());
                    throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ3));
                }
                this.LLIZLLLIL = 0;
            }
            i++;
            this.LLIZLLLIL = 0;
        } while (i != 0);
        int[] iArr = this.LLILZ;
        int i2 = this.LL;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.LLILLL[i2 - 1] = "null";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LLIZLLLIL = 0;
        this.LLILLJJLI[0] = 8;
        this.LL = 1;
        this.LLIZ.LIZ();
        this.LLILZLL.close();
    }

    static {
        ByteString.encodeUtf8("\n\r");
        ByteString.encodeUtf8("*/");
    }

    @Override // X.AbstractC1295900jpM
    public final void LIZ() throws C1295920jpO, EOFException {
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        if (iLJJJJJL == 3) {
            LJJ(1);
            this.LLILZ[this.LL - 1] = 0;
            this.LLIZLLLIL = 0;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected BEGIN_ARRAY but was ");
            sbLIZ.append(LJIJJLI());
            sbLIZ.append(" at path ");
            sbLIZ.append(LJI());
            throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.AbstractC1295900jpM
    public final void LIZIZ() throws C1295920jpO, EOFException {
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        if (iLJJJJJL == 1) {
            LJJ(3);
            this.LLIZLLLIL = 0;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected BEGIN_OBJECT but was ");
        sbLIZ.append(LJIJJLI());
        sbLIZ.append(" at path ");
        sbLIZ.append(LJI());
        throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1295900jpM
    public final void LIZLLL() throws C1295920jpO, EOFException {
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        if (iLJJJJJL != 4) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected END_ARRAY but was ");
            sbLIZ.append(LJIJJLI());
            sbLIZ.append(" at path ");
            sbLIZ.append(LJI());
            throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i = this.LL - 1;
        this.LL = i;
        int[] iArr = this.LLILZ;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.LLIZLLLIL = 0;
    }

    @Override // X.AbstractC1295900jpM
    public final void LJFF() throws C1295920jpO, EOFException {
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        if (iLJJJJJL != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected END_OBJECT but was ");
            sbLIZ.append(LJIJJLI());
            sbLIZ.append(" at path ");
            sbLIZ.append(LJI());
            throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i = this.LL - 1;
        this.LL = i;
        this.LLILLL[i] = null;
        int[] iArr = this.LLILZ;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.LLIZLLLIL = 0;
    }

    @Override // X.AbstractC1295900jpM
    public final boolean LJII() throws C1295920jpO, EOFException {
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        return (iLJJJJJL == 2 || iLJJJJJL == 4 || iLJJJJJL == 18) ? false : true;
    }

    @Override // X.AbstractC1295900jpM
    public final boolean LJIILL() throws C1295920jpO, EOFException {
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        if (iLJJJJJL == 5) {
            this.LLIZLLLIL = 0;
            int[] iArr = this.LLILZ;
            int i = this.LL - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iLJJJJJL == 6) {
            this.LLIZLLLIL = 0;
            int[] iArr2 = this.LLILZ;
            int i2 = this.LL - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected a boolean but was ");
        sbLIZ.append(LJIJJLI());
        sbLIZ.append(" at path ");
        sbLIZ.append(LJI());
        throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1295900jpM
    public final double LJIILLIIL() throws C1295920jpO, EOFException {
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        if (iLJJJJJL == 16) {
            this.LLIZLLLIL = 0;
            int[] iArr = this.LLILZ;
            int i = this.LL - 1;
            iArr[i] = iArr[i] + 1;
            return this.LLJ;
        }
        if (iLJJJJJL == 17) {
            this.LLJIJIL = this.LLIZ.LJJIIJ(this.LLJI);
        } else if (iLJJJJJL == 9) {
            this.LLJIJIL = LJJLIIIJL(LLJILJILJ);
        } else if (iLJJJJJL == 8) {
            this.LLJIJIL = LJJLIIIJL(LLJILJIL);
        } else if (iLJJJJJL == 10) {
            this.LLJIJIL = LJJLIIJ();
        } else if (iLJJJJJL != 11) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected a double but was ");
            sbLIZ.append(LJIJJLI());
            sbLIZ.append(" at path ");
            sbLIZ.append(LJI());
            throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLIZLLLIL = 11;
        try {
            double d = CastDoubleProtector.parseDouble(this.LLJIJIL);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("JSON forbids NaN and infinities: ");
                sbLIZ2.append(d);
                sbLIZ2.append(" at path ");
                sbLIZ2.append(LJI());
                throw new C1295920jpO(C2188811AlT.LIZIZ(sbLIZ2));
            }
            this.LLJIJIL = null;
            this.LLIZLLLIL = 0;
            int[] iArr2 = this.LLILZ;
            int i2 = this.LL - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Expected a double but was ");
            sbLIZ3.append(this.LLJIJIL);
            sbLIZ3.append(" at path ");
            sbLIZ3.append(LJI());
            throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    @Override // X.AbstractC1295900jpM
    public final int LJIIZILJ() throws C1295920jpO, EOFException {
        String strLJJLIIIJL;
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        if (iLJJJJJL == 16) {
            long j = this.LLJ;
            int i = (int) j;
            if (j == i) {
                this.LLIZLLLIL = 0;
                int[] iArr = this.LLILZ;
                int i2 = this.LL - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected an int but was ");
            sbLIZ.append(this.LLJ);
            sbLIZ.append(" at path ");
            sbLIZ.append(LJI());
            throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (iLJJJJJL == 17) {
            this.LLJIJIL = this.LLIZ.LJJIIJ(this.LLJI);
        } else {
            if (iLJJJJJL == 9) {
                strLJJLIIIJL = LJJLIIIJL(LLJILJILJ);
            } else if (iLJJJJJL == 8) {
                strLJJLIIIJL = LJJLIIIJL(LLJILJIL);
            } else if (iLJJJJJL != 11) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Expected an int but was ");
                sbLIZ2.append(LJIJJLI());
                sbLIZ2.append(" at path ");
                sbLIZ2.append(LJI());
                throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ2));
            }
            this.LLJIJIL = strLJJLIIIJL;
            try {
                int i3 = CastIntegerProtector.parseInt(strLJJLIIIJL);
                this.LLIZLLLIL = 0;
                int[] iArr2 = this.LLILZ;
                int i4 = this.LL - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLIZLLLIL = 11;
        try {
            double d = CastDoubleProtector.parseDouble(this.LLJIJIL);
            int i5 = (int) d;
            if (i5 == d) {
                this.LLJIJIL = null;
                this.LLIZLLLIL = 0;
                int[] iArr3 = this.LLILZ;
                int i6 = this.LL - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Expected an int but was ");
            sbLIZ3.append(this.LLJIJIL);
            sbLIZ3.append(" at path ");
            sbLIZ3.append(LJI());
            throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ3));
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new C1295910jpN("Expected an int but was " + this.LLJIJIL + " at path " + LJI());
        }
    }

    @Override // X.AbstractC1295900jpM
    public final String LJIJJ() throws C1295920jpO, EOFException {
        String strLJJIIJ;
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        if (iLJJJJJL == 10) {
            strLJJIIJ = LJJLIIJ();
        } else if (iLJJJJJL == 9) {
            strLJJIIJ = LJJLIIIJL(LLJILJILJ);
        } else if (iLJJJJJL == 8) {
            strLJJIIJ = LJJLIIIJL(LLJILJIL);
        } else if (iLJJJJJL == 11) {
            strLJJIIJ = this.LLJIJIL;
            this.LLJIJIL = null;
        } else if (iLJJJJJL == 16) {
            strLJJIIJ = Long.toString(this.LLJ);
        } else {
            if (iLJJJJJL != 17) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected a string but was ");
                sbLIZ.append(LJIJJLI());
                sbLIZ.append(" at path ");
                sbLIZ.append(LJI());
                throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ));
            }
            strLJJIIJ = this.LLIZ.LJJIIJ(this.LLJI);
        }
        this.LLIZLLLIL = 0;
        int[] iArr = this.LLILZ;
        int i = this.LL - 1;
        iArr[i] = iArr[i] + 1;
        return strLJJIIJ;
    }

    @Override // X.AbstractC1295900jpM
    public final EnumC1295540jom LJIJJLI() throws C1295920jpO, EOFException {
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        switch (iLJJJJJL) {
            case 1:
                return EnumC1295540jom.BEGIN_OBJECT;
            case 2:
                return EnumC1295540jom.END_OBJECT;
            case 3:
                return EnumC1295540jom.BEGIN_ARRAY;
            case 4:
                return EnumC1295540jom.END_ARRAY;
            case 5:
            case 6:
                return EnumC1295540jom.BOOLEAN;
            case 7:
                return EnumC1295540jom.NULL;
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC1295540jom.STRING;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
                return EnumC1295540jom.NAME;
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return EnumC1295540jom.NUMBER;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return EnumC1295540jom.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // X.AbstractC1295900jpM
    public final void LJJIZ() throws C1295920jpO, EOFException {
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        if (iLJJJJJL == 14) {
            long jLJLIIL = this.LLILZLL.LJLIIL(LLJILLL);
            C1496690p3D c1496690p3D = this.LLIZ;
            if (jLJLIIL == -1) {
                jLJLIIL = c1496690p3D.LLILLJJLI;
            }
            c1496690p3D.skip(jLJLIIL);
        } else if (iLJJJJJL == 13) {
            LJJLL(LLJILJILJ);
        } else if (iLJJJJJL == 12) {
            LJJLL(LLJILJIL);
        } else if (iLJJJJJL != 15) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected a name but was ");
            sbLIZ.append(LJIJJLI());
            sbLIZ.append(" at path ");
            sbLIZ.append(LJI());
            throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLIZLLLIL = 0;
        this.LLILLL[this.LL - 1] = "null";
    }

    public final void LJJJJJ() throws C1295920jpO {
        LJJJJ("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0133, code lost:
    
        if (LJJJZ(r11) != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0135, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b8, code lost:
    
        if (r8 == r0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01bb, code lost:
    
        if (r8 == 4) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01be, code lost:
    
        if (r8 != 7) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01c0, code lost:
    
        r15.LLJI = r9;
        r15.LLIZLLLIL = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r8 != r0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (r1 != Long.MIN_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        if (r12 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        if (r1 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
    
        if (r12 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
    
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        r15.LLJ = r1;
        r15.LLIZ.skip(r9);
        r15.LLIZLLLIL = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b3, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (r12 == false) goto L49;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJJJJL() throws X.C1295920jpO, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1296380jq8.LJJJJJL():int");
    }

    public final String LJJL() throws C1295920jpO, EOFException {
        String strLJJLIIIJL;
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        if (iLJJJJJL == 14) {
            strLJJLIIIJL = LJJLIIJ();
        } else if (iLJJJJJL == 13) {
            strLJJLIIIJL = LJJLIIIJL(LLJILJILJ);
        } else if (iLJJJJJL == 12) {
            strLJJLIIIJL = LJJLIIIJL(LLJILJIL);
        } else {
            if (iLJJJJJL != 15) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected a name but was ");
                sbLIZ.append(LJIJJLI());
                sbLIZ.append(" at path ");
                sbLIZ.append(LJI());
                throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ));
            }
            strLJJLIIIJL = this.LLJIJIL;
        }
        this.LLIZLLLIL = 0;
        this.LLILLL[this.LL - 1] = strLJJLIIIJL;
        return strLJJLIIIJL;
    }

    public final String LJJLIIJ() {
        long jLJLIIL = this.LLILZLL.LJLIIL(LLJILLL);
        return jLJLIIL != -1 ? this.LLIZ.LJJIIJ(jLJLIIL) : this.LLIZ.LJJIZ();
    }

    public final char LJJLIL() throws C1295920jpO, EOFException {
        int i;
        int i2;
        if (!this.LLILZLL.request(1L)) {
            LJJJJ("Unterminated escape sequence");
            throw null;
        }
        byte b = this.LLIZ.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid escape sequence: \\");
            sbLIZ.append((char) b);
            LJJJJ(C2188811AlT.LIZIZ(sbLIZ));
            throw null;
        }
        if (!this.LLILZLL.request(4L)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Unterminated escape sequence at path ");
            sbLIZ2.append(LJI());
            throw new EOFException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        int i3 = 0;
        char c = 0;
        do {
            byte bLJI = this.LLIZ.LJI(i3);
            char c2 = (char) (c << 4);
            if (bLJI >= 48) {
                if (bLJI <= 57) {
                    i2 = bLJI - 48;
                } else if (bLJI >= 97) {
                    if (bLJI <= 102) {
                        i = bLJI - 97;
                        i2 = i + 10;
                    }
                } else if (bLJI >= 65 && bLJI <= 70) {
                    i = bLJI - 65;
                    i2 = i + 10;
                }
                c = (char) (c2 + i2);
                i3++;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("\\u");
            sbLIZ3.append(this.LLIZ.LJJIIJ(4L));
            LJJJJ(C2188811AlT.LIZIZ(sbLIZ3));
            throw null;
        } while (i3 < 4);
        this.LLIZ.skip(4L);
        return c;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonReader(");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1296380jq8(C1496670p3B c1496670p3B) {
        this.LLILZLL = c1496670p3B;
        this.LLIZ = c1496670p3B.LL;
        LJJ(6);
    }

    @Override // X.AbstractC1295900jpM
    public final int LJJIL(C1296750jqj c1296750jqj) throws C1295920jpO, EOFException {
        int iLJJJJJL = this.LLIZLLLIL;
        if (iLJJJJJL == 0) {
            iLJJJJJL = LJJJJJL();
        }
        if (iLJJJJJL < 12 || iLJJJJJL > 15) {
            return -1;
        }
        if (iLJJJJJL == 15) {
            return LJJJLL(this.LLJIJIL, c1296750jqj);
        }
        int iLJJJJZ = this.LLILZLL.LJJJJZ(c1296750jqj.LIZIZ);
        if (iLJJJJZ != -1) {
            this.LLIZLLLIL = 0;
            this.LLILLL[this.LL - 1] = c1296750jqj.LIZ[iLJJJJZ];
            return iLJJJJZ;
        }
        String str = this.LLILLL[this.LL - 1];
        String strLJJL = LJJL();
        int iLJJJLL = LJJJLL(strLJJL, c1296750jqj);
        if (iLJJJLL == -1) {
            this.LLIZLLLIL = 15;
            this.LLJIJIL = strLJJL;
            this.LLILLL[this.LL - 1] = str;
        }
        return iLJJJLL;
    }

    public final boolean LJJJZ(int i) throws C1295920jpO {
        if (i != 9 && i != 10 && i != 12 && i != 13 && i != 32) {
            if (i != 35) {
                if (i != 44) {
                    if (i != 47 && i != 61) {
                        if (i != 123 && i != 125 && i != 58) {
                            if (i != 59) {
                                switch (i) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
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
            LJJJJJ();
            throw null;
        }
        return false;
    }

    public final int LJJLIIIJ(boolean z) throws C1295920jpO, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (this.LLILZLL.request(i2)) {
                byte bLJI = this.LLIZ.LJI(i);
                if (bLJI != 10 && bLJI != 32 && bLJI != 13 && bLJI != 9) {
                    this.LLIZ.skip(i2 - 1);
                    if (bLJI == 47) {
                        if (!this.LLILZLL.request(2L)) {
                            return bLJI;
                        }
                        LJJJJJ();
                        throw null;
                    }
                    if (bLJI != 35) {
                        return bLJI;
                    }
                    LJJJJJ();
                    throw null;
                }
                i = i2;
            } else {
                if (!z) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }

    public final String LJJLIIIJL(ByteString byteString) throws C1295920jpO {
        StringBuilder sb = null;
        while (true) {
            long jLJLIIL = this.LLILZLL.LJLIIL(byteString);
            if (jLJLIIL != -1) {
                if (this.LLIZ.LJI(jLJLIIL) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.LLIZ.LJJIIJ(jLJLIIL));
                    this.LLIZ.readByte();
                    sb.append(LJJLIL());
                } else {
                    if (sb == null) {
                        String strLJJIIJ = this.LLIZ.LJJIIJ(jLJLIIL);
                        this.LLIZ.readByte();
                        return strLJJIIJ;
                    }
                    sb.append(this.LLIZ.LJJIIJ(jLJLIIL));
                    this.LLIZ.readByte();
                    return sb.toString();
                }
            } else {
                LJJJJ("Unterminated string");
                throw null;
            }
        }
    }

    public final void LJJLL(ByteString byteString) throws C1295920jpO, EOFException {
        while (true) {
            long jLJLIIL = this.LLILZLL.LJLIIL(byteString);
            if (jLJLIIL != -1) {
                if (this.LLIZ.LJI(jLJLIIL) == 92) {
                    this.LLIZ.skip(jLJLIIL + 1);
                    LJJLIL();
                } else {
                    this.LLIZ.skip(jLJLIIL + 1);
                    return;
                }
            } else {
                LJJJJ("Unterminated string");
                throw null;
            }
        }
    }

    public final int LJJJLL(String str, C1296750jqj c1296750jqj) {
        int length = c1296750jqj.LIZ.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c1296750jqj.LIZ[i])) {
                this.LLIZLLLIL = 0;
                this.LLILLL[this.LL - 1] = str;
                return i;
            }
        }
        return -1;
    }
}
