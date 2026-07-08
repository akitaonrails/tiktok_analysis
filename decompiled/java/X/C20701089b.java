package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.089b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20701089b {
    public static final InterfaceC20712089m LJ;
    public final InterfaceC20712089m LIZ;
    public InterfaceC1979907pF LIZIZ;
    public Deque<InterfaceC1979907pF> LIZJ;
    public final String LIZLLL;

    static {
        InterfaceC20712089m interfaceC20712089m;
        int i = 8;
        AbstractC20709089j[] abstractC20709089jArr = {new AbstractC20709089j() { // from class: X.089i
            @Override // X.AbstractC20709089j
            public final int LIZIZ(String str, int i2, Deque<InterfaceC1979907pF> deque, InterfaceC20712089m interfaceC20712089m2) {
                while (AbstractC20709089j.LIZ(i2, str) == ' ') {
                    i2++;
                }
                return interfaceC20712089m2.LIZ(str, i2, deque);
            }
        }, new AbstractC20709089j() { // from class: X.089h
            @Override // X.AbstractC20709089j
            public final int LIZIZ(String str, int i2, Deque<InterfaceC1979907pF> deque, InterfaceC20712089m interfaceC20712089m2) {
                if ('(' != AbstractC20709089j.LIZ(i2, str)) {
                    return interfaceC20712089m2.LIZ(str, i2, deque);
                }
                deque.push(new C1982607pg(EnumC1982507pf.LEFT_PAREN));
                return i2 + 1;
            }
        }, new AbstractC20709089j() { // from class: X.089Z
            @Override // X.AbstractC20709089j
            public final int LIZIZ(String str, int i2, Deque<InterfaceC1979907pF> deque, InterfaceC20712089m interfaceC20712089m2) {
                InterfaceC1979907pF interfaceC1979907pFPollFirst;
                if (')' != AbstractC20709089j.LIZ(i2, str)) {
                    return interfaceC20712089m2.LIZ(str, i2, deque);
                }
                LinkedList<InterfaceC1979907pF> linkedList = new LinkedList();
                while (true) {
                    interfaceC1979907pFPollFirst = deque.pollFirst();
                    if (interfaceC1979907pFPollFirst != null) {
                        if (interfaceC1979907pFPollFirst.LIZIZ() == EnumC1981807pY.METHOD || interfaceC1979907pFPollFirst.LIZIZ() == EnumC1982507pf.LEFT_PAREN) {
                            break;
                        }
                        linkedList.addFirst(interfaceC1979907pFPollFirst);
                    } else {
                        throw new IllegalArgumentException(str.substring(0, i2));
                    }
                }
                if (interfaceC1979907pFPollFirst.LIZIZ() == EnumC1981807pY.METHOD) {
                    C1981607pW c1981607pW = (C1981607pW) interfaceC1979907pFPollFirst;
                    LinkedList linkedList2 = new LinkedList();
                    LinkedList linkedList3 = new LinkedList();
                    for (InterfaceC1979907pF interfaceC1979907pF : linkedList) {
                        if (interfaceC1979907pF.LIZIZ() == EnumC1982507pf.COMMA) {
                            linkedList2.add(C1979207p8.LIZ(i2, str, linkedList3));
                            linkedList3.clear();
                        } else {
                            linkedList3.addLast(interfaceC1979907pF);
                        }
                    }
                    if (!linkedList3.isEmpty()) {
                        linkedList2.add(C1979207p8.LIZ(i2, str, linkedList3));
                    }
                    c1981607pW.LIZ = (InterfaceC1979907pF[]) linkedList2.toArray(new InterfaceC1979907pF[linkedList2.size()]);
                    int i3 = i2 + 1;
                    deque.push(c1981607pW);
                    return i3;
                }
                deque.push(C1979207p8.LIZ(i2, str, linkedList));
                return i2 + 1;
            }
        }, new AbstractC20709089j() { // from class: X.089d
            @Override // X.AbstractC20709089j
            public final int LIZIZ(String str, int i2, Deque<InterfaceC1979907pF> deque, InterfaceC20712089m interfaceC20712089m2) {
                if ('\'' != AbstractC20709089j.LIZ(i2, str)) {
                    return interfaceC20712089m2.LIZ(str, i2, deque);
                }
                int i3 = i2 + 1;
                int length = str.length();
                int i4 = i3;
                while (i4 < length && AbstractC20709089j.LIZ(i4, str) != '\'') {
                    i4++;
                }
                if (AbstractC20709089j.LIZ(i4, str) == '\'') {
                    deque.push(new InterfaceC1979907pF(str.substring(i3, i4)) { // from class: X.00qi
                        public final String LIZ;

                        @Override // X.InterfaceC1979907pF
                        public final String LIZJ() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append('\'');
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append("'");
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        public final String toString() {
                            return LIZJ();
                        }

                        @Override // X.InterfaceC1979907pF
                        public final InterfaceC205300qh LIZIZ() {
                            return EnumC1983107pl.STRING;
                        }

                        {
                            this.LIZ = str;
                        }

                        @Override // X.InterfaceC1979907pF
                        public final Object LIZ(Map<String, JSONObject> map) {
                            return this.LIZ;
                        }
                    });
                    return i4 + 1;
                }
                throw new RuntimeException("String expression not surrounded by '", str.substring(i3 - 1)) { // from class: X.07lF
                    public static final long serialVersionUID = -1549862548075188968L;

                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(",problem area:");
                        sbLIZ.append(str);
                        super(C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
            }
        }, new AbstractC20709089j() { // from class: X.089f
            @Override // X.AbstractC20709089j
            public final int LIZIZ(String str, int i2, Deque<InterfaceC1979907pF> deque, InterfaceC20712089m interfaceC20712089m2) {
                char cLIZ;
                int i3 = i2;
                while (true) {
                    cLIZ = AbstractC20709089j.LIZ(i3, str);
                    if (!C20713089n.LIZ(cLIZ) && !C20713089n.LIZIZ(cLIZ)) {
                        break;
                    }
                    i3++;
                }
                if (cLIZ != '(') {
                    return interfaceC20712089m2.LIZ(str, i2, deque);
                }
                deque.push(new C1981607pW(str.substring(i2, i3)));
                return i3 + 1;
            }
        }, new AbstractC20709089j() { // from class: X.089g
            @Override // X.AbstractC20709089j
            public final int LIZIZ(String str, int i2, Deque<InterfaceC1979907pF> deque, InterfaceC20712089m interfaceC20712089m2) {
                if (',' != AbstractC20709089j.LIZ(i2, str)) {
                    return interfaceC20712089m2.LIZ(str, i2, deque);
                }
                deque.push(new C1982607pg(EnumC1982507pf.COMMA));
                return i2 + 1;
            }
        }, new AbstractC20709089j() { // from class: X.089a
            /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
            
                if (X.C20713089n.LIZIZ(X.AbstractC20709089j.LIZ(r7, r6)) == false) goto L8;
             */
            @Override // X.AbstractC20709089j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LIZIZ(java.lang.String r6, int r7, java.util.Deque<X.InterfaceC1979907pF> r8, X.InterfaceC20712089m r9) {
                /*
                    r5 = this;
                    char r0 = X.AbstractC20709089j.LIZ(r7, r6)
                    r4 = 0
                    r1 = 45
                    if (r1 != r0) goto L24
                    java.lang.Object r0 = r8.peek()
                    if (r0 == 0) goto L2f
                    java.lang.Object r0 = r8.peek()
                    X.07pF r0 = (X.InterfaceC1979907pF) r0
                    X.00qh r0 = r0.LIZIZ()
                    boolean r0 = X.EnumC1979607pC.isOperator(r0)
                    if (r0 != 0) goto L2f
                L1f:
                    int r0 = r9.LIZ(r6, r7, r8)
                    return r0
                L24:
                    char r0 = X.AbstractC20709089j.LIZ(r7, r6)
                    boolean r0 = X.C20713089n.LIZIZ(r0)
                    if (r0 != 0) goto L55
                    goto L1f
                L2f:
                    int r0 = r7 + 1
                    char r0 = X.AbstractC20709089j.LIZ(r0, r6)
                    boolean r0 = X.C20713089n.LIZIZ(r0)
                    if (r0 != 0) goto L55
                    java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "Unrecognized - symbol, not a negative number or operator, problem range:"
                    r1.append(r0)
                    java.lang.String r0 = r6.substring(r4, r7)
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    r2.<init>(r0)
                    throw r2
                L55:
                    char r0 = X.AbstractC20709089j.LIZ(r7, r6)
                    if (r0 != r1) goto L73
                    int r3 = r7 + 1
                L5d:
                    char r2 = X.AbstractC20709089j.LIZ(r3, r6)
                    boolean r1 = X.C20713089n.LIZIZ(r2)
                    r0 = 46
                    if (r1 != 0) goto L6d
                    if (r4 != 0) goto L75
                    if (r2 != r0) goto L75
                L6d:
                    int r3 = r3 + 1
                    if (r2 != r0) goto L5d
                    r4 = 1
                    goto L5d
                L73:
                    r3 = r7
                    goto L5d
                L75:
                    if (r2 == r0) goto L84
                    java.lang.String r1 = r6.substring(r7, r3)
                    X.07sI r0 = new X.07sI
                    r0.<init>(r1)
                    r8.push(r0)
                    return r3
                L84:
                    java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "Illegal negative number format, problem interval:"
                    r1.append(r0)
                    java.lang.String r0 = r6.substring(r7, r3)
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    r2.<init>(r0)
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20700089a.LIZIZ(java.lang.String, int, java.util.Deque, X.089m):int");
            }
        }, new AbstractC20709089j() { // from class: X.089e
            @Override // X.AbstractC20709089j
            public final int LIZIZ(String str, int i2, Deque<InterfaceC1979907pF> deque, InterfaceC20712089m interfaceC20712089m2) {
                int i3;
                char cLIZ = AbstractC20709089j.LIZ(i2, str);
                if (!C20713089n.LIZ(cLIZ) && cLIZ != '$') {
                    return interfaceC20712089m2.LIZ(str, i2, deque);
                }
                int i4 = 0;
                while (true) {
                    i3 = i4 + i2;
                    char cLIZ2 = AbstractC20709089j.LIZ(i3, str);
                    if (!C20713089n.LIZ(cLIZ2) && !C20713089n.LIZIZ(cLIZ2) && '.' != cLIZ2 && '[' != cLIZ2 && ']' != cLIZ2 && '_' != cLIZ2 && '-' != cLIZ2 && '$' != cLIZ2) {
                        break;
                    }
                    i4++;
                }
                String strSubstring = str.substring(i2, i3);
                if (C081V.getKeyWord(strSubstring) != null) {
                    deque.push(new InterfaceC1979907pF(strSubstring) { // from class: X.011j
                        public final Object LIZ;

                        @Override // X.InterfaceC1979907pF
                        public final String LIZJ() {
                            Object obj = this.LIZ;
                            return obj != null ? obj.toString() : "NULL";
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("KeywordNode [keywordValue=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(e3.f);
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.InterfaceC1979907pF
                        public final InterfaceC205300qh LIZIZ() {
                            return EnumC1983107pl.CONSTANT;
                        }

                        {
                            if (strSubstring.equalsIgnoreCase("true")) {
                                this.LIZ = Boolean.TRUE;
                            } else if (strSubstring.equalsIgnoreCase("false")) {
                                this.LIZ = Boolean.FALSE;
                            } else {
                                if (strSubstring.equalsIgnoreCase("null")) {
                                    this.LIZ = null;
                                    return;
                                }
                                throw new IllegalArgumentException();
                            }
                        }

                        @Override // X.InterfaceC1979907pF
                        public final Object LIZ(Map<String, JSONObject> map) {
                            return this.LIZ;
                        }
                    });
                    return i3;
                }
                deque.push(new InterfaceC1979907pF(strSubstring) { // from class: X.00qg
                    public final String LIZ;

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("VariableNode [literals=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(e3.f);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1979907pF
                    public final InterfaceC205300qh LIZIZ() {
                        return EnumC1983107pl.VARIABLE;
                    }

                    @Override // X.InterfaceC1979907pF
                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = strSubstring;
                    }

                    @Override // X.InterfaceC1979907pF
                    public final Object LIZ(Map<String, JSONObject> map) {
                        Object objLIZLLL;
                        if (map == null || map.size() <= 0) {
                            return null;
                        }
                        String str2 = this.LIZ;
                        JSONObject jSONObject = map.get("default_key");
                        if (TextUtils.isEmpty(str2)) {
                            objLIZLLL = null;
                        } else {
                            objLIZLLL = LIZLLL(str2.split("\\."), 0, jSONObject);
                        }
                        if (objLIZLLL == JSONObject.NULL) {
                            return null;
                        }
                        return objLIZLLL;
                    }

                    public static Object LIZLLL(String[] strArr, int i5, JSONObject jSONObject) {
                        Object objOpt;
                        if (strArr != null && strArr.length > 0 && i5 < strArr.length && jSONObject != null) {
                            String str2 = strArr[i5];
                            int iIndexOf = str2.indexOf(e3.e);
                            int iIndexOf2 = str2.indexOf(e3.f);
                            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                                String strSubstring2 = str2.substring(0, iIndexOf);
                                try {
                                    int i6 = CastIntegerProtector.parseInt(str2.substring(iIndexOf + 1, iIndexOf2));
                                    Object objOpt2 = jSONObject.opt(strSubstring2);
                                    if (objOpt2 instanceof JSONArray) {
                                        objOpt = ((JSONArray) objOpt2).opt(i6);
                                    } else {
                                        objOpt = null;
                                    }
                                } catch (NumberFormatException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return null;
                                }
                            } else {
                                objOpt = jSONObject.opt(str2);
                            }
                            if (i5 == strArr.length - 1) {
                                return objOpt;
                            }
                            if (objOpt instanceof String) {
                                try {
                                    return LIZLLL(strArr, i5 + 1, new JSONObject((String) objOpt));
                                } catch (JSONException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    return objOpt;
                                }
                            }
                            if (objOpt instanceof JSONObject) {
                                return LIZLLL(strArr, i5 + 1, (JSONObject) objOpt);
                            }
                        }
                        return null;
                    }
                });
                return i3;
            }
        }, new AbstractC20709089j() { // from class: X.089c
            @Override // X.AbstractC20709089j
            public final int LIZIZ(String str, int i2, Deque<InterfaceC1979907pF> deque, InterfaceC20712089m interfaceC20712089m2) {
                char cLIZ = AbstractC20709089j.LIZ(i2, str);
                if ('+' != cLIZ && '-' != cLIZ && '*' != cLIZ && '/' != cLIZ && '%' != cLIZ && '=' != cLIZ && '>' != cLIZ && '<' != cLIZ && '!' != cLIZ && '&' != cLIZ && '|' != cLIZ && '?' != cLIZ && ':' != cLIZ) {
                    return interfaceC20712089m2.LIZ(str, i2, deque);
                }
                int i3 = i2 + 1;
                String str2 = new String(new char[]{AbstractC20709089j.LIZ(i2, str), AbstractC20709089j.LIZ(i3, str)});
                if (EnumC1979607pC.literalsOf(str2) != null) {
                    deque.push(new InterfaceC1979907pF(EnumC1979607pC.literalsOf(str2)) { // from class: X.07pU
                        public final EnumC1979607pC LIZ;

                        @Override // X.InterfaceC1979907pF
                        public final String LIZJ() {
                            return this.LIZ.getLiterals();
                        }

                        public final String toString() {
                            return LIZJ();
                        }

                        @Override // X.InterfaceC1979907pF
                        public final InterfaceC205300qh LIZIZ() {
                            return this.LIZ;
                        }

                        {
                            this.LIZ = enumC1979607pC;
                        }

                        @Override // X.InterfaceC1979907pF
                        public final Object LIZ(Map<String, JSONObject> map) {
                            throw new UnsupportedOperationException();
                        }
                    });
                    return i2 + 2;
                }
                String strValueOf = String.valueOf(AbstractC20709089j.LIZ(i2, str));
                if (EnumC1979607pC.literalsOf(strValueOf) != null) {
                    deque.push(new InterfaceC1979907pF(EnumC1979607pC.literalsOf(strValueOf)) { // from class: X.07pU
                        public final EnumC1979607pC LIZ;

                        @Override // X.InterfaceC1979907pF
                        public final String LIZJ() {
                            return this.LIZ.getLiterals();
                        }

                        public final String toString() {
                            return LIZJ();
                        }

                        @Override // X.InterfaceC1979907pF
                        public final InterfaceC205300qh LIZIZ() {
                            return this.LIZ;
                        }

                        {
                            this.LIZ = enumC1979607pC;
                        }

                        @Override // X.InterfaceC1979907pF
                        public final Object LIZ(Map<String, JSONObject> map) {
                            throw new UnsupportedOperationException();
                        }
                    });
                    return i3;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unrecognized:");
                sbLIZ.append(strValueOf);
                sbLIZ.append("examine:");
                sbLIZ.append(str.substring(0, i2));
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }};
        final InterfaceC20712089m interfaceC20712089m2 = new InterfaceC20712089m() { // from class: X.089l
            @Override // X.InterfaceC20712089m
            public final int LIZ(String str, int i2, Deque<InterfaceC1979907pF> deque) {
                return i2;
            }
        };
        do {
            final AbstractC20709089j abstractC20709089j = abstractC20709089jArr[i];
            interfaceC20712089m = new InterfaceC20712089m() { // from class: X.089k
                @Override // X.InterfaceC20712089m
                public final int LIZ(String str, int i2, Deque<InterfaceC1979907pF> deque) {
                    return abstractC20709089j.LIZIZ(str, i2, deque, interfaceC20712089m2);
                }
            };
            i--;
            interfaceC20712089m2 = interfaceC20712089m;
        } while (i > -1);
        LJ = interfaceC20712089m;
    }

    public final void LIZ() {
        int length = this.LIZLLL.length();
        int i = 0;
        while (i < length) {
            int iLIZ = this.LIZ.LIZ(this.LIZLLL, i, this.LIZJ);
            if (iLIZ == i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unrecognized expression, unrecognized characters encountered during parsing:");
                sbLIZ.append(this.LIZLLL.substring(0, i));
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            i = iLIZ;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            InterfaceC1979907pF interfaceC1979907pFPollFirst = this.LIZJ.pollFirst();
            if (interfaceC1979907pFPollFirst == null) {
                this.LIZIZ = C1979207p8.LIZ(i, this.LIZLLL, arrayList);
                this.LIZJ = null;
                return;
            }
            ListProtector.add(arrayList, 0, interfaceC1979907pFPollFirst);
        }
    }

    public C20701089b(final String str) {
        InterfaceC20712089m interfaceC20712089m = LJ;
        this.LIZJ = new LinkedList();
        this.LIZ = interfaceC20712089m;
        this.LIZLLL = str;
        try {
            LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(str, e) { // from class: X.07lE
                public static final long serialVersionUID = 6748928105241855848L;

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unable to parse expression:");
                    sbLIZ.append(str);
                    super(C2188811AlT.LIZIZ(sbLIZ), e);
                }
            };
        }
    }
}
