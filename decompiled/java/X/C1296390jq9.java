package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.EOFException;
import okio.ByteString;

/* JADX INFO: renamed from: X.0jq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296390jq9 extends AbstractC1296450jqF {
    public static final ByteString LLJILJILJ = ByteString.encodeUtf8("'\\");
    public static final ByteString LLJILLL = ByteString.encodeUtf8("\"\\");
    public static final ByteString LLJJ = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    public static final ByteString LLJJI = ByteString.encodeUtf8("\n\r");
    public final InterfaceC1496620p36 LLIZ;
    public final C1496690p3D LLIZLLLIL;
    public int LLJ;
    public long LLJI;
    public int LLJIJIL;
    public String LLJILJIL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LLJ = 0;
        this.LLILLJJLI[0] = 8;
        this.LL = 1;
        this.LLIZLLLIL.LIZ();
        this.LLIZ.close();
    }

    @Override // X.AbstractC1296450jqF
    public final void LIZ() throws C1296430jqD, EOFException {
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        if (iLJJJZ == 3) {
            LJJIZ(1);
            this.LLILZ[this.LL - 1] = 0;
            this.LLJ = 0;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected BEGIN_ARRAY but was ");
            sbLIZ.append(LJJIL());
            sbLIZ.append(" at path ");
            sbLIZ.append(LJI());
            throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.AbstractC1296450jqF
    public final void LIZIZ() throws C1296430jqD, EOFException {
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        if (iLJJJZ == 1) {
            LJJIZ(3);
            this.LLJ = 0;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected BEGIN_OBJECT but was ");
        sbLIZ.append(LJJIL());
        sbLIZ.append(" at path ");
        sbLIZ.append(LJI());
        throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1296450jqF
    public final void LIZLLL() throws C1296430jqD, EOFException {
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        if (iLJJJZ != 4) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected END_ARRAY but was ");
            sbLIZ.append(LJJIL());
            sbLIZ.append(" at path ");
            sbLIZ.append(LJI());
            throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i = this.LL - 1;
        this.LL = i;
        int[] iArr = this.LLILZ;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.LLJ = 0;
    }

    @Override // X.AbstractC1296450jqF
    public final void LJFF() throws C1296430jqD, EOFException {
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        if (iLJJJZ != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected END_OBJECT but was ");
            sbLIZ.append(LJJIL());
            sbLIZ.append(" at path ");
            sbLIZ.append(LJI());
            throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i = this.LL - 1;
        this.LL = i;
        this.LLILLL[i] = null;
        int[] iArr = this.LLILZ;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.LLJ = 0;
    }

    @Override // X.AbstractC1296450jqF
    public final boolean LJII() throws C1296430jqD, EOFException {
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        return (iLJJJZ == 2 || iLJJJZ == 4) ? false : true;
    }

    @Override // X.AbstractC1296450jqF
    public final boolean LJIILL() throws C1296430jqD, EOFException {
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        if (iLJJJZ == 5) {
            this.LLJ = 0;
            int[] iArr = this.LLILZ;
            int i = this.LL - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iLJJJZ == 6) {
            this.LLJ = 0;
            int[] iArr2 = this.LLILZ;
            int i2 = this.LL - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected a boolean but was ");
        sbLIZ.append(LJJIL());
        sbLIZ.append(" at path ");
        sbLIZ.append(LJI());
        throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1296450jqF
    public final double LJIILLIIL() throws C1296430jqD, EOFException {
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        if (iLJJJZ == 16) {
            this.LLJ = 0;
            int[] iArr = this.LLILZ;
            int i = this.LL - 1;
            iArr[i] = iArr[i] + 1;
            return this.LLJI;
        }
        if (iLJJJZ == 17) {
            this.LLJILJIL = this.LLIZLLLIL.LJJIIJ(this.LLJIJIL);
        } else if (iLJJJZ == 9) {
            this.LLJILJIL = LJJLIL(LLJILLL);
        } else if (iLJJJZ == 8) {
            this.LLJILJIL = LJJLIL(LLJILJILJ);
        } else if (iLJJJZ == 10) {
            this.LLJILJIL = LJJLL();
        } else if (iLJJJZ != 11) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected a double but was ");
            sbLIZ.append(LJJIL());
            sbLIZ.append(" at path ");
            sbLIZ.append(LJI());
            throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJ = 11;
        try {
            double d = CastDoubleProtector.parseDouble(this.LLJILJIL);
            if (this.LLILZIL || !(Double.isNaN(d) || Double.isInfinite(d))) {
                this.LLJILJIL = null;
                this.LLJ = 0;
                int[] iArr2 = this.LLILZ;
                int i2 = this.LL - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return d;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("JSON forbids NaN and infinities: ");
            sbLIZ2.append(d);
            sbLIZ2.append(" at path ");
            sbLIZ2.append(LJI());
            throw new C1296430jqD(C2188811AlT.LIZIZ(sbLIZ2));
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Expected a double but was ");
            sbLIZ3.append(this.LLJILJIL);
            sbLIZ3.append(" at path ");
            sbLIZ3.append(LJI());
            throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    @Override // X.AbstractC1296450jqF
    public final int LJIIZILJ() throws C1296430jqD, EOFException {
        String strLJJLIL;
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        if (iLJJJZ == 16) {
            long j = this.LLJI;
            int i = (int) j;
            if (j == i) {
                this.LLJ = 0;
                int[] iArr = this.LLILZ;
                int i2 = this.LL - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected an int but was ");
            sbLIZ.append(this.LLJI);
            sbLIZ.append(" at path ");
            sbLIZ.append(LJI());
            throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (iLJJJZ == 17) {
            this.LLJILJIL = this.LLIZLLLIL.LJJIIJ(this.LLJIJIL);
        } else {
            if (iLJJJZ == 9) {
                strLJJLIL = LJJLIL(LLJILLL);
            } else if (iLJJJZ == 8) {
                strLJJLIL = LJJLIL(LLJILJILJ);
            } else if (iLJJJZ != 11) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Expected an int but was ");
                sbLIZ2.append(LJJIL());
                sbLIZ2.append(" at path ");
                sbLIZ2.append(LJI());
                throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ2));
            }
            this.LLJILJIL = strLJJLIL;
            try {
                int i3 = CastIntegerProtector.parseInt(strLJJLIL);
                this.LLJ = 0;
                int[] iArr2 = this.LLILZ;
                int i4 = this.LL - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLJ = 11;
        try {
            double d = CastDoubleProtector.parseDouble(this.LLJILJIL);
            int i5 = (int) d;
            if (i5 == d) {
                this.LLJILJIL = null;
                this.LLJ = 0;
                int[] iArr3 = this.LLILZ;
                int i6 = this.LL - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Expected an int but was ");
            sbLIZ3.append(this.LLJILJIL);
            sbLIZ3.append(" at path ");
            sbLIZ3.append(LJI());
            throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ3));
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new C1296420jqC("Expected an int but was " + this.LLJILJIL + " at path " + LJI());
        }
    }

    @Override // X.AbstractC1296450jqF
    public final String LJIJJ() throws C1296430jqD, EOFException {
        String strLJJLIL;
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        if (iLJJJZ == 14) {
            strLJJLIL = LJJLL();
        } else if (iLJJJZ == 13) {
            strLJJLIL = LJJLIL(LLJILLL);
        } else if (iLJJJZ == 12) {
            strLJJLIL = LJJLIL(LLJILJILJ);
        } else {
            if (iLJJJZ != 15) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected a name but was ");
                sbLIZ.append(LJJIL());
                sbLIZ.append(" at path ");
                sbLIZ.append(LJI());
                throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
            }
            strLJJLIL = this.LLJILJIL;
        }
        this.LLJ = 0;
        this.LLILLL[this.LL - 1] = strLJJLIL;
        return strLJJLIL;
    }

    @Override // X.AbstractC1296450jqF
    public final void LJIJJLI() throws C1296430jqD, EOFException {
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        if (iLJJJZ == 7) {
            this.LLJ = 0;
            int[] iArr = this.LLILZ;
            int i = this.LL - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected null but was ");
        sbLIZ.append(LJJIL());
        sbLIZ.append(" at path ");
        sbLIZ.append(LJI());
        throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1296450jqF
    public final String LJJ() throws C1296430jqD, EOFException {
        String strLJJIIJ;
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        if (iLJJJZ == 10) {
            strLJJIIJ = LJJLL();
        } else if (iLJJJZ == 9) {
            strLJJIIJ = LJJLIL(LLJILLL);
        } else if (iLJJJZ == 8) {
            strLJJIIJ = LJJLIL(LLJILJILJ);
        } else if (iLJJJZ == 11) {
            strLJJIIJ = this.LLJILJIL;
            this.LLJILJIL = null;
        } else if (iLJJJZ == 16) {
            strLJJIIJ = Long.toString(this.LLJI);
        } else {
            if (iLJJJZ != 17) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected a string but was ");
                sbLIZ.append(LJJIL());
                sbLIZ.append(" at path ");
                sbLIZ.append(LJI());
                throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
            }
            strLJJIIJ = this.LLIZLLLIL.LJJIIJ(this.LLJIJIL);
        }
        this.LLJ = 0;
        int[] iArr = this.LLILZ;
        int i = this.LL - 1;
        iArr[i] = iArr[i] + 1;
        return strLJJIIJ;
    }

    @Override // X.AbstractC1296450jqF
    public final EnumC1296400jqA LJJIL() throws C1296430jqD, EOFException {
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        switch (iLJJJZ) {
            case 1:
                return EnumC1296400jqA.BEGIN_OBJECT;
            case 2:
                return EnumC1296400jqA.END_OBJECT;
            case 3:
                return EnumC1296400jqA.BEGIN_ARRAY;
            case 4:
                return EnumC1296400jqA.END_ARRAY;
            case 5:
            case 6:
                return EnumC1296400jqA.BOOLEAN;
            case 7:
                return EnumC1296400jqA.NULL;
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC1296400jqA.STRING;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
                return EnumC1296400jqA.NAME;
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return EnumC1296400jqA.NUMBER;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return EnumC1296400jqA.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // X.AbstractC1296450jqF
    public final void LJJJJJ() throws C1296430jqD, EOFException {
        if (this.LLILZLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot skip unexpected ");
            sbLIZ.append(LJJIL());
            sbLIZ.append(" at ");
            sbLIZ.append(LJI());
            throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i = 0;
        do {
            int iLJJJZ = this.LLJ;
            if (iLJJJZ == 0) {
                iLJJJZ = LJJJZ();
            }
            if (iLJJJZ == 3) {
                LJJIZ(1);
            } else if (iLJJJZ == 1) {
                LJJIZ(3);
            } else if (iLJJJZ == 4 || iLJJJZ == 2) {
                this.LL--;
                i--;
                this.LLJ = 0;
            } else {
                if (iLJJJZ == 14 || iLJJJZ == 10) {
                    long jLJLIIL = this.LLIZ.LJLIIL(LLJJ);
                    C1496690p3D c1496690p3D = this.LLIZLLLIL;
                    if (jLJLIIL == -1) {
                        jLJLIIL = c1496690p3D.LLILLJJLI;
                    }
                    c1496690p3D.skip(jLJLIIL);
                } else if (iLJJJZ == 9 || iLJJJZ == 13) {
                    LJL(LLJILLL);
                } else if (iLJJJZ == 8 || iLJJJZ == 12) {
                    LJL(LLJILJILJ);
                } else if (iLJJJZ == 17) {
                    this.LLIZLLLIL.skip(this.LLJIJIL);
                }
                this.LLJ = 0;
            }
            i++;
            this.LLJ = 0;
        } while (i != 0);
        int[] iArr = this.LLILZ;
        int i2 = this.LL;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.LLILLL[i2 - 1] = "null";
    }

    public final void LJJJLL() throws C1296430jqD {
        if (this.LLILZIL) {
            return;
        }
        LJJJJJL("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01ba, code lost:
    
        if (LJJLIIIJL(r1) != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01bd, code lost:
    
        if (r10 != 2) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01bf, code lost:
    
        if (r13 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01c5, code lost:
    
        if (r7 != Long.MIN_VALUE) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01c7, code lost:
    
        if (r14 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01cb, code lost:
    
        if (r7 != 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01cd, code lost:
    
        if (r14 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01cf, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01d0, code lost:
    
        r15.LLJI = r7;
        r15.LLIZLLLIL.skip(r11);
        r15.LLJ = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01dc, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01dd, code lost:
    
        if (r14 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01e0, code lost:
    
        if (r10 == 2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01e3, code lost:
    
        if (r10 == 4) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01e6, code lost:
    
        if (r10 != 7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01e8, code lost:
    
        r15.LLJIJIL = r11;
        r15.LLJ = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ee, code lost:
    
        return 17;
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
    public final int LJJJZ() throws X.C1296430jqD, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1296390jq9.LJJJZ():int");
    }

    public final String LJJLL() {
        long jLJLIIL = this.LLIZ.LJLIIL(LLJJ);
        return jLJLIIL != -1 ? this.LLIZLLLIL.LJJIIJ(jLJLIIL) : this.LLIZLLLIL.LJJIZ();
    }

    public final char LJJZ() throws C1296430jqD, EOFException {
        int i;
        int i2;
        if (!this.LLIZ.request(1L)) {
            LJJJJJL("Unterminated escape sequence");
            throw null;
        }
        byte b = this.LLIZLLLIL.readByte();
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
            if (this.LLILZIL) {
                return (char) b;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid escape sequence: \\");
            sbLIZ.append((char) b);
            LJJJJJL(C2188811AlT.LIZIZ(sbLIZ));
            throw null;
        }
        if (!this.LLIZ.request(4L)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Unterminated escape sequence at path ");
            sbLIZ2.append(LJI());
            throw new EOFException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        int i3 = 0;
        char c = 0;
        do {
            byte bLJI = this.LLIZLLLIL.LJI(i3);
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
            sbLIZ3.append(this.LLIZLLLIL.LJJIIJ(4L));
            LJJJJJL(C2188811AlT.LIZIZ(sbLIZ3));
            throw null;
        } while (i3 < 4);
        this.LLIZLLLIL.skip(4L);
        return c;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonReader(");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1296390jq9(InterfaceC1496620p36 interfaceC1496620p36) {
        this.LLIZ = interfaceC1496620p36;
        this.LLIZLLLIL = interfaceC1496620p36.buffer();
        LJJIZ(6);
    }

    @Override // X.AbstractC1296450jqF
    public final int LJJJJ(C1296760jqk c1296760jqk) throws C1296430jqD, EOFException {
        int iLJJJZ = this.LLJ;
        if (iLJJJZ == 0) {
            iLJJJZ = LJJJZ();
        }
        if (iLJJJZ < 12 || iLJJJZ > 15) {
            return -1;
        }
        if (iLJJJZ == 15) {
            return LJJL(this.LLJILJIL, c1296760jqk);
        }
        int iLJJJJZ = this.LLIZ.LJJJJZ(c1296760jqk.LIZIZ);
        if (iLJJJJZ != -1) {
            this.LLJ = 0;
            this.LLILLL[this.LL - 1] = c1296760jqk.LIZ[iLJJJJZ];
            return iLJJJJZ;
        }
        String str = this.LLILLL[this.LL - 1];
        String strLJIJJ = LJIJJ();
        int iLJJL = LJJL(strLJIJJ, c1296760jqk);
        if (iLJJL == -1) {
            this.LLJ = 15;
            this.LLJILJIL = strLJIJJ;
            this.LLILLL[this.LL - 1] = str;
        }
        return iLJJL;
    }

    public final boolean LJJLIIIJL(int i) throws C1296430jqD {
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
            LJJJLL();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r9.LLIZLLLIL.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r8 != 47) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r9.LLIZ.request(2) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        LJJJLL();
        r1 = r9.LLIZLLLIL.LJI(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r1 == 42) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r1 == 47) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r9.LLIZLLLIL.readByte();
        r9.LLIZLLLIL.readByte();
        r1 = r9.LLIZ.LJLIIL(X.C1296390jq9.LLJJI);
        r5 = r9.LLIZLLLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r1 == (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r5.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        r1 = r5.LLILLJJLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r9.LLIZLLLIL.readByte();
        r9.LLIZLLLIL.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r9.LLIZ.request(2) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (r9.LLIZLLLIL.LJI(r3) == "*\/".charAt(r3)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        r9.LLIZLLLIL.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        if (r3 < 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        r9.LLIZLLLIL.readByte();
        r9.LLIZLLLIL.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (r8 != 35) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        LJJJLL();
        r1 = r9.LLIZ.LJLIIL(X.C1296390jq9.LLJJI);
        r5 = r9.LLIZLLLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r1 == (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        r5.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        r1 = r5.LLILLJJLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        LJJJJJL("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJLIIJ(boolean r10) throws X.C1296430jqD, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1296390jq9.LJJLIIJ(boolean):int");
    }

    public final String LJJLIL(ByteString byteString) throws C1296430jqD {
        StringBuilder sb = null;
        while (true) {
            long jLJLIIL = this.LLIZ.LJLIIL(byteString);
            if (jLJLIIL != -1) {
                if (this.LLIZLLLIL.LJI(jLJLIIL) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.LLIZLLLIL.LJJIIJ(jLJLIIL));
                    this.LLIZLLLIL.readByte();
                    sb.append(LJJZ());
                } else {
                    if (sb == null) {
                        String strLJJIIJ = this.LLIZLLLIL.LJJIIJ(jLJLIIL);
                        this.LLIZLLLIL.readByte();
                        return strLJJIIJ;
                    }
                    sb.append(this.LLIZLLLIL.LJJIIJ(jLJLIIL));
                    this.LLIZLLLIL.readByte();
                    return sb.toString();
                }
            } else {
                LJJJJJL("Unterminated string");
                throw null;
            }
        }
    }

    public final void LJL(ByteString byteString) throws C1296430jqD, EOFException {
        while (true) {
            long jLJLIIL = this.LLIZ.LJLIIL(byteString);
            if (jLJLIIL != -1) {
                if (this.LLIZLLLIL.LJI(jLJLIIL) == 92) {
                    this.LLIZLLLIL.skip(jLJLIIL + 1);
                    LJJZ();
                } else {
                    this.LLIZLLLIL.skip(jLJLIIL + 1);
                    return;
                }
            } else {
                LJJJJJL("Unterminated string");
                throw null;
            }
        }
    }

    public final int LJJL(String str, C1296760jqk c1296760jqk) {
        int length = c1296760jqk.LIZ.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c1296760jqk.LIZ[i])) {
                this.LLJ = 0;
                this.LLILLL[this.LL - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final int LJJLIIIJ(String str, C1296760jqk c1296760jqk) {
        int length = c1296760jqk.LIZ.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c1296760jqk.LIZ[i])) {
                this.LLJ = 0;
                int[] iArr = this.LLILZ;
                int i2 = this.LL - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }
}
