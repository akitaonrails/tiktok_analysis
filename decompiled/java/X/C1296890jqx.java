package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.EOFException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0jqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296890jqx {
    public static final C1296900jqy LIZ = new InterfaceC1296930jr1() { // from class: X.0jqy
        @Override // X.InterfaceC1296930jr1
        public final AbstractC1296960jr4<?> LIZ(Type type, Set<? extends Annotation> set, final C1297080jrG c1297080jrG) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C1296890jqx.LIZIZ;
            }
            if (type == Byte.TYPE) {
                return C1296890jqx.LIZJ;
            }
            if (type == Character.TYPE) {
                return C1296890jqx.LIZLLL;
            }
            if (type == Double.TYPE) {
                return C1296890jqx.LJ;
            }
            if (type == Float.TYPE) {
                return C1296890jqx.LJFF;
            }
            if (type == Integer.TYPE) {
                return C1296890jqx.LJI;
            }
            if (type == Long.TYPE) {
                return C1296890jqx.LJII;
            }
            if (type == Short.TYPE) {
                return C1296890jqx.LJIIIIZZ;
            }
            if (type == Boolean.class) {
                C1297060jrE c1297060jrE = C1296890jqx.LIZIZ;
                c1297060jrE.getClass();
                return new C1296940jr2(c1297060jrE);
            }
            if (type == Byte.class) {
                C1296910jqz c1296910jqz = C1296890jqx.LIZJ;
                c1296910jqz.getClass();
                return new C1296940jr2(c1296910jqz);
            }
            if (type == Character.class) {
                C1296500jqK c1296500jqK = C1296890jqx.LIZLLL;
                c1296500jqK.getClass();
                return new C1296940jr2(c1296500jqK);
            }
            if (type == Double.class) {
                C1297040jrC c1297040jrC = C1296890jqx.LJ;
                c1297040jrC.getClass();
                return new C1296940jr2(c1297040jrC);
            }
            if (type == Float.class) {
                C1297010jr9 c1297010jr9 = C1296890jqx.LJFF;
                c1297010jr9.getClass();
                return new C1296940jr2(c1297010jr9);
            }
            if (type == Integer.class) {
                C1296480jqI c1296480jqI = C1296890jqx.LJI;
                c1296480jqI.getClass();
                return new C1296940jr2(c1296480jqI);
            }
            if (type == Long.class) {
                C1296440jqE c1296440jqE = C1296890jqx.LJII;
                c1296440jqE.getClass();
                return new C1296940jr2(c1296440jqE);
            }
            if (type == Short.class) {
                C1296920jr0 c1296920jr0 = C1296890jqx.LJIIIIZZ;
                c1296920jr0.getClass();
                return new C1296940jr2(c1296920jr0);
            }
            if (type == String.class) {
                C1296490jqJ c1296490jqJ = C1296890jqx.LJIIIZ;
                c1296490jqJ.getClass();
                return new C1296940jr2(c1296490jqJ);
            }
            if (type == Object.class) {
                return new C1296940jr2(new AbstractC1296960jr4<Object>(c1297080jrG) { // from class: X.0jrD
                    public final C1297080jrG LIZ;

                    public final String toString() {
                        return "JsonAdapter(Object)";
                    }

                    {
                        this.LIZ = c1297080jrG;
                    }

                    @Override // X.AbstractC1296960jr4
                    public final Object LIZ(AbstractC1296450jqF abstractC1296450jqF) {
                        return abstractC1296450jqF.LJJJ();
                    }

                    @Override // X.AbstractC1296960jr4
                    public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Object obj) {
                        Class<?> cls = obj.getClass();
                        if (cls == Object.class) {
                            C1297030jrB c1297030jrB = (C1297030jrB) abstractC1297000jr8;
                            c1297030jrB.LJIJJ();
                            c1297030jrB.LJIILL();
                            c1297030jrB.LJFF(3);
                            c1297030jrB.LLILZ[c1297030jrB.LL - 1] = 0;
                            c1297030jrB.LLIZLLLIL.LJLLILLLL("{");
                            C1297030jrB c1297030jrB2 = (C1297030jrB) abstractC1297000jr8;
                            c1297030jrB2.LLIZ = false;
                            c1297030jrB2.LJIILLIIL(3, 5, "}");
                            return;
                        }
                        C1297080jrG c1297080jrG2 = this.LIZ;
                        if (Map.class.isAssignableFrom(cls)) {
                            cls = Map.class;
                        } else if (Collection.class.isAssignableFrom(cls)) {
                            cls = Collection.class;
                        }
                        c1297080jrG2.LIZ(cls, C1297180jrQ.LIZ).LIZIZ(abstractC1297000jr8, obj);
                    }
                });
            }
            final Class<?> clsLJFF = C1297410jrn.LJFF(type);
            if (!clsLJFF.isEnum()) {
                return null;
            }
            return new C1296940jr2(new AbstractC1296960jr4<T>(clsLJFF) { // from class: X.0jqG
                public final Class<T> LIZ;
                public final String[] LIZIZ;
                public final T[] LIZJ;
                public final C1296760jqk LIZLLL;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("JsonAdapter(");
                    sbLIZ.append(this.LIZ.getName());
                    sbLIZ.append(")");
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    String strName;
                    this.LIZ = clsLJFF;
                    try {
                        T[] enumConstants = clsLJFF.getEnumConstants();
                        this.LIZJ = enumConstants;
                        this.LIZIZ = new String[enumConstants.length];
                        int i = 0;
                        while (true) {
                            T[] tArr = this.LIZJ;
                            if (i < tArr.length) {
                                T t = tArr[i];
                                InterfaceC1296470jqH interfaceC1296470jqH = (InterfaceC1296470jqH) clsLJFF.getField(t.name()).getAnnotation(InterfaceC1296470jqH.class);
                                if (interfaceC1296470jqH != null) {
                                    strName = interfaceC1296470jqH.name();
                                } else {
                                    strName = t.name();
                                }
                                this.LIZIZ[i] = strName;
                                i++;
                            } else {
                                this.LIZLLL = C1296760jqk.LIZ(this.LIZIZ);
                                return;
                            }
                        }
                    } catch (NoSuchFieldException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Missing field in ");
                        sbLIZ.append(clsLJFF.getName());
                        throw new AssertionError(C2188811AlT.LIZIZ(sbLIZ), e);
                    }
                }

                @Override // X.AbstractC1296960jr4
                public final Object LIZ(AbstractC1296450jqF abstractC1296450jqF) throws C1296430jqD, EOFException {
                    int iLJJJJZ;
                    C1296760jqk c1296760jqk = this.LIZLLL;
                    C1296390jq9 c1296390jq9 = (C1296390jq9) abstractC1296450jqF;
                    int iLJJJZ = c1296390jq9.LLJ;
                    if (iLJJJZ == 0) {
                        iLJJJZ = c1296390jq9.LJJJZ();
                    }
                    if (iLJJJZ >= 8 && iLJJJZ <= 11) {
                        if (iLJJJZ == 11) {
                            iLJJJJZ = c1296390jq9.LJJLIIIJ(c1296390jq9.LLJILJIL, c1296760jqk);
                        } else {
                            iLJJJJZ = c1296390jq9.LLIZ.LJJJJZ(c1296760jqk.LIZIZ);
                            if (iLJJJJZ != -1) {
                                c1296390jq9.LLJ = 0;
                                int[] iArr = c1296390jq9.LLILZ;
                                int i = c1296390jq9.LL - 1;
                                iArr[i] = iArr[i] + 1;
                            } else {
                                String strLJJ = c1296390jq9.LJJ();
                                iLJJJJZ = c1296390jq9.LJJLIIIJ(strLJJ, c1296760jqk);
                                if (iLJJJJZ == -1) {
                                    c1296390jq9.LLJ = 11;
                                    c1296390jq9.LLJILJIL = strLJJ;
                                    c1296390jq9.LLILZ[c1296390jq9.LL - 1] = r2[r1] - 1;
                                }
                            }
                        }
                        if (iLJJJJZ != -1) {
                            return this.LIZJ[iLJJJJZ];
                        }
                    }
                    String strLJJ2 = abstractC1296450jqF.LJJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expected one of ");
                    sbLIZ.append(Arrays.asList(this.LIZIZ));
                    sbLIZ.append(" but was ");
                    sbLIZ.append(strLJJ2);
                    sbLIZ.append(" at path ");
                    sbLIZ.append(abstractC1296450jqF.LJI());
                    throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.AbstractC1296960jr4
                public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Object obj) {
                    abstractC1297000jr8.LJII(this.LIZIZ[((Enum) obj).ordinal()]);
                }
            });
        }
    };
    public static final C1297060jrE LIZIZ = new AbstractC1296960jr4<Boolean>() { // from class: X.0jrE
        public final String toString() {
            return "JsonAdapter(Boolean)";
        }

        @Override // X.AbstractC1296960jr4
        public final Boolean LIZ(AbstractC1296450jqF abstractC1296450jqF) {
            return Boolean.valueOf(abstractC1296450jqF.LJIILL());
        }

        @Override // X.AbstractC1296960jr4
        public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Boolean bool) {
            String str;
            boolean zBooleanValue = bool.booleanValue();
            C1297030jrB c1297030jrB = (C1297030jrB) abstractC1297000jr8;
            c1297030jrB.LJIJJ();
            c1297030jrB.LJIILL();
            InterfaceC1496780p3M interfaceC1496780p3M = c1297030jrB.LLIZLLLIL;
            if (zBooleanValue) {
                str = "true";
            } else {
                str = "false";
            }
            interfaceC1496780p3M.LJLLILLLL(str);
            int[] iArr = c1297030jrB.LLILZ;
            int i = c1297030jrB.LL - 1;
            iArr[i] = iArr[i] + 1;
        }
    };
    public static final C1296910jqz LIZJ = new AbstractC1296960jr4<Byte>() { // from class: X.0jqz
        public final String toString() {
            return "JsonAdapter(Byte)";
        }

        @Override // X.AbstractC1296960jr4
        public final Byte LIZ(AbstractC1296450jqF abstractC1296450jqF) {
            return Byte.valueOf((byte) C1296890jqx.LIZ(abstractC1296450jqF, "a byte", -128, 255));
        }

        @Override // X.AbstractC1296960jr4
        public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Byte b) {
            abstractC1297000jr8.LJI(b.intValue() & 255);
        }
    };
    public static final C1296500jqK LIZLLL = new AbstractC1296960jr4<Character>() { // from class: X.0jqK
        public final String toString() {
            return "JsonAdapter(Character)";
        }

        @Override // X.AbstractC1296960jr4
        public final Character LIZ(AbstractC1296450jqF abstractC1296450jqF) {
            String strLJJ = abstractC1296450jqF.LJJ();
            if (strLJJ.length() <= 1) {
                return Character.valueOf(strLJJ.charAt(0));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\"');
            sbLIZ.append(strLJJ);
            sbLIZ.append('\"');
            throw new C1296420jqC(C786410Ut5.j4("Expected %s but was %s at path %s", new Object[]{"a char", C2188811AlT.LIZIZ(sbLIZ), abstractC1296450jqF.LJI()}));
        }

        @Override // X.AbstractC1296960jr4
        public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Character ch) {
            abstractC1297000jr8.LJII(ch.toString());
        }
    };
    public static final C1297040jrC LJ = new AbstractC1296960jr4<Double>() { // from class: X.0jrC
        public final String toString() {
            return "JsonAdapter(Double)";
        }

        @Override // X.AbstractC1296960jr4
        public final Double LIZ(AbstractC1296450jqF abstractC1296450jqF) {
            return Double.valueOf(abstractC1296450jqF.LJIILLIIL());
        }

        @Override // X.AbstractC1296960jr4
        public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Double d) {
            double dDoubleValue = d.doubleValue();
            C1297030jrB c1297030jrB = (C1297030jrB) abstractC1297000jr8;
            if (c1297030jrB.LLILZIL || (!Double.isNaN(dDoubleValue) && !Double.isInfinite(dDoubleValue))) {
                if (c1297030jrB.LLIZ) {
                    c1297030jrB.LIZ(Double.toString(dDoubleValue));
                    return;
                }
                c1297030jrB.LJIJJ();
                c1297030jrB.LJIILL();
                c1297030jrB.LLIZLLLIL.LJLLILLLL(Double.toString(dDoubleValue));
                int[] iArr = c1297030jrB.LLILZ;
                int i = c1297030jrB.LL - 1;
                iArr[i] = iArr[i] + 1;
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Numeric values must be finite, but was ");
            sbLIZ.append(dDoubleValue);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    };
    public static final C1297010jr9 LJFF = new AbstractC1296960jr4<Float>() { // from class: X.0jr9
        public final String toString() {
            return "JsonAdapter(Float)";
        }

        @Override // X.AbstractC1296960jr4
        public final Float LIZ(AbstractC1296450jqF abstractC1296450jqF) {
            float fLJIILLIIL = (float) abstractC1296450jqF.LJIILLIIL();
            if (!abstractC1296450jqF.LLILZIL && Float.isInfinite(fLJIILLIIL)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("JSON forbids NaN and infinities: ");
                sbLIZ.append(fLJIILLIIL);
                sbLIZ.append(" at path ");
                sbLIZ.append(abstractC1296450jqF.LJI());
                throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
            }
            return Float.valueOf(fLJIILLIIL);
        }

        @Override // X.AbstractC1296960jr4
        public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Float f) {
            Float f2 = f;
            f2.getClass();
            C1297030jrB c1297030jrB = (C1297030jrB) abstractC1297000jr8;
            c1297030jrB.getClass();
            String string = f2.toString();
            if (c1297030jrB.LLILZIL || (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN"))) {
                if (c1297030jrB.LLIZ) {
                    c1297030jrB.LIZ(string);
                    return;
                }
                c1297030jrB.LJIJJ();
                c1297030jrB.LJIILL();
                c1297030jrB.LLIZLLLIL.LJLLILLLL(string);
                int[] iArr = c1297030jrB.LLILZ;
                int i = c1297030jrB.LL - 1;
                iArr[i] = iArr[i] + 1;
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Numeric values must be finite, but was ");
            sbLIZ.append(f2);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    };
    public static final C1296480jqI LJI = new AbstractC1296960jr4<Integer>() { // from class: X.0jqI
        public final String toString() {
            return "JsonAdapter(Integer)";
        }

        @Override // X.AbstractC1296960jr4
        public final Integer LIZ(AbstractC1296450jqF abstractC1296450jqF) {
            return Integer.valueOf(abstractC1296450jqF.LJIIZILJ());
        }

        @Override // X.AbstractC1296960jr4
        public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Integer num) {
            abstractC1297000jr8.LJI(num.intValue());
        }
    };
    public static final C1296440jqE LJII = new AbstractC1296960jr4<Long>() { // from class: X.0jqE
        public final String toString() {
            return "JsonAdapter(Long)";
        }

        @Override // X.AbstractC1296960jr4
        public final Long LIZ(AbstractC1296450jqF abstractC1296450jqF) throws C1296430jqD, EOFException {
            String strLJJLIL;
            long jLongValueExact;
            C1296390jq9 c1296390jq9 = (C1296390jq9) abstractC1296450jqF;
            int iLJJJZ = c1296390jq9.LLJ;
            if (iLJJJZ == 0) {
                iLJJJZ = c1296390jq9.LJJJZ();
            }
            if (iLJJJZ == 16) {
                c1296390jq9.LLJ = 0;
                int[] iArr = c1296390jq9.LLILZ;
                int i = c1296390jq9.LL - 1;
                iArr[i] = iArr[i] + 1;
                jLongValueExact = c1296390jq9.LLJI;
            } else {
                if (iLJJJZ == 17) {
                    c1296390jq9.LLJILJIL = c1296390jq9.LLIZLLLIL.LJJIIJ(c1296390jq9.LLJIJIL);
                } else if (iLJJJZ != 9 && iLJJJZ != 8) {
                    if (iLJJJZ != 11) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Expected a long but was ");
                        sbLIZ.append(c1296390jq9.LJJIL());
                        sbLIZ.append(" at path ");
                        sbLIZ.append(c1296390jq9.LJI());
                        throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    if (iLJJJZ == 9) {
                        strLJJLIL = c1296390jq9.LJJLIL(C1296390jq9.LLJILLL);
                    } else {
                        strLJJLIL = c1296390jq9.LJJLIL(C1296390jq9.LLJILJILJ);
                    }
                    c1296390jq9.LLJILJIL = strLJJLIL;
                    try {
                        jLongValueExact = CastLongProtector.parseLong(strLJJLIL);
                        c1296390jq9.LLJ = 0;
                        int[] iArr2 = c1296390jq9.LLILZ;
                        int i2 = c1296390jq9.LL - 1;
                        iArr2[i2] = iArr2[i2] + 1;
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1296390jq9.LLJ = 11;
                        jLongValueExact = new BigDecimal(c1296390jq9.LLJILJIL).longValueExact();
                        c1296390jq9.LLJILJIL = null;
                        c1296390jq9.LLJ = 0;
                        int[] iArr3 = c1296390jq9.LLILZ;
                        int i3 = c1296390jq9.LL - 1;
                        iArr3[i3] = iArr3[i3] + 1;
                    }
                }
                c1296390jq9.LLJ = 11;
                try {
                    jLongValueExact = new BigDecimal(c1296390jq9.LLJILJIL).longValueExact();
                    c1296390jq9.LLJILJIL = null;
                    c1296390jq9.LLJ = 0;
                    int[] iArr32 = c1296390jq9.LLILZ;
                    int i32 = c1296390jq9.LL - 1;
                    iArr32[i32] = iArr32[i32] + 1;
                } catch (ArithmeticException | NumberFormatException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new C1296420jqC("Expected a long but was " + c1296390jq9.LLJILJIL + " at path " + c1296390jq9.LJI());
                }
            }
            return Long.valueOf(jLongValueExact);
        }

        @Override // X.AbstractC1296960jr4
        public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Long l) {
            abstractC1297000jr8.LJI(l.longValue());
        }
    };
    public static final C1296920jr0 LJIIIIZZ = new AbstractC1296960jr4<Short>() { // from class: X.0jr0
        public final String toString() {
            return "JsonAdapter(Short)";
        }

        @Override // X.AbstractC1296960jr4
        public final Short LIZ(AbstractC1296450jqF abstractC1296450jqF) {
            return Short.valueOf((short) C1296890jqx.LIZ(abstractC1296450jqF, "a short", -32768, 32767));
        }

        @Override // X.AbstractC1296960jr4
        public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Short sh) {
            abstractC1297000jr8.LJI(sh.intValue());
        }
    };
    public static final C1296490jqJ LJIIIZ = new AbstractC1296960jr4<String>() { // from class: X.0jqJ
        public final String toString() {
            return "JsonAdapter(String)";
        }

        @Override // X.AbstractC1296960jr4
        public final String LIZ(AbstractC1296450jqF abstractC1296450jqF) {
            return abstractC1296450jqF.LJJ();
        }

        @Override // X.AbstractC1296960jr4
        public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, String str) {
            abstractC1297000jr8.LJII(str);
        }
    };

    public static int LIZ(AbstractC1296450jqF abstractC1296450jqF, String str, int i, int i2) {
        int iLJIIZILJ = abstractC1296450jqF.LJIIZILJ();
        if (iLJIIZILJ >= i && iLJIIZILJ <= i2) {
            return iLJIIZILJ;
        }
        throw new C1296420jqC(C786410Ut5.j4("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(iLJIIZILJ), abstractC1296450jqF.LJI()}));
    }
}
