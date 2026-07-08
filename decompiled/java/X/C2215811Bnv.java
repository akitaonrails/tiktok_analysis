package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1Bnv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215811Bnv {
    public static final HashMap<String, C2215861Bo0> LIZ = new HashMap<>();

    public static final Object LIZ(String str, Map<String, ? extends Object> map) {
        C2215851Bnz c2215851Bnz;
        C2215851Bnz c2215851Bnz2;
        char c;
        char c2;
        C2215851Bnz c2215851Bnz3;
        C2215851Bnz c2215851Bnz4;
        Object next;
        C2215861Bo0 c2215861Bo0 = LIZ.get(str);
        if (c2215861Bo0 == null) {
            Set<String> setKeySet = C2215831Bnx.LIZ.keySet();
            ArrayList<C2215891Bo3> arrayList = new ArrayList();
            int i = 0;
            int length = 0;
            while (i < str.length()) {
                if (str.charAt(i) == ' ') {
                    if (i != length) {
                        arrayList.add(new C2215891Bo3(str.substring(length, i)));
                    }
                    length = i + 1;
                } else {
                    Iterator<T> it2 = setKeySet.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            String str2 = (String) next;
                            if (str2.length() + i <= str.length() && Intrinsics.LJFF(str.substring(i, str2.length() + i), str2)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    String str3 = (String) next;
                    if (str3 != null) {
                        if (i != length) {
                            arrayList.add(new C2215891Bo3(str.substring(length, i)));
                        }
                        arrayList.add(new C2215891Bo3(str3));
                        length = str3.length() + i;
                    } else {
                        i++;
                    }
                }
                i = length;
            }
            if (i != length) {
                arrayList.add(new C2215891Bo3(str.substring(length, i)));
            }
            Map<String, EnumC2215821Bnw> map2 = C2215831Bnx.LIZ;
            ArrayList<C2215851Bnz> arrayList2 = new ArrayList();
            for (C2215891Bo3 c2215891Bo3 : arrayList) {
                char cCharAt = c2215891Bo3.LIZ.charAt(0);
                if ('0' <= cCharAt && cCharAt < ':') {
                    String str4 = c2215891Bo3.LIZ;
                    char cCharAt2 = str4.charAt(str4.length() - 1);
                    if (cCharAt2 == 'l') {
                        c2215851Bnz4 = new C2215851Bnz(EnumC2215821Bnw.CONST_LONG, Long.valueOf(CastLongProtector.parseLong(c2215891Bo3.LIZ)));
                    } else if (cCharAt2 == 'd') {
                        c2215851Bnz4 = new C2215851Bnz(EnumC2215821Bnw.CONST_DOUBLE, Double.valueOf(CastDoubleProtector.parseDouble(c2215891Bo3.LIZ)));
                    } else if (cCharAt2 == 'f' || a0.LJJIZ(c2215891Bo3.LIZ, '.', 0, false, 6) > 0) {
                        c2215851Bnz4 = new C2215851Bnz(EnumC2215821Bnw.CONST_FLOAT, Float.valueOf(CastFloatProtector.parseFloat(c2215891Bo3.LIZ)));
                    } else {
                        long j = CastLongProtector.parseLong(c2215891Bo3.LIZ);
                        if (j >= -2147483648L && j <= 2147483647L) {
                            c2215851Bnz4 = new C2215851Bnz(EnumC2215821Bnw.CONST_INT, Integer.valueOf((int) j));
                        } else {
                            c2215851Bnz4 = new C2215851Bnz(EnumC2215821Bnw.CONST_LONG, Long.valueOf(j));
                        }
                    }
                    arrayList2.add(c2215851Bnz4);
                } else {
                    String str5 = c2215891Bo3.LIZ;
                    if (Intrinsics.LJFF(str5, "true")) {
                        c2215851Bnz3 = new C2215851Bnz(EnumC2215821Bnw.CONST_BOOLEAN, Boolean.TRUE);
                    } else if (Intrinsics.LJFF(str5, "false")) {
                        c2215851Bnz3 = new C2215851Bnz(EnumC2215821Bnw.CONST_BOOLEAN, Boolean.FALSE);
                    } else if (u.LJJIIJZLJL(c2215891Bo3.LIZ, "\"", false)) {
                        EnumC2215821Bnw enumC2215821Bnw = EnumC2215821Bnw.CONST_STRING;
                        String str6 = c2215891Bo3.LIZ;
                        arrayList2.add(new C2215851Bnz(enumC2215821Bnw, str6.substring(1, str6.length() - 1)));
                    } else {
                        EnumC2215821Bnw enumC2215821Bnw2 = map2.get(c2215891Bo3.LIZ);
                        if (enumC2215821Bnw2 != null) {
                            arrayList2.add(new C2215851Bnz(enumC2215821Bnw2, c2215891Bo3.LIZ));
                        } else {
                            arrayList2.add(new C2215851Bnz(EnumC2215821Bnw.PARAM, c2215891Bo3.LIZ));
                        }
                    }
                    arrayList2.add(c2215851Bnz3);
                }
            }
            C2215801Bnu c2215801Bnu = new C2215801Bnu();
            for (C2215851Bnz c2215851Bnz5 : arrayList2) {
                if (c2215801Bnu.LIZ.isEmpty()) {
                    c2215851Bnz2 = null;
                } else {
                    c2215851Bnz2 = (C2215851Bnz) ((LinkedList) c2215801Bnu.LIZ).peek();
                }
                if (c2215851Bnz5.LIZJ()) {
                    if (c2215851Bnz2 != null) {
                        if (c2215851Bnz2.LIZIZ()) {
                            C2215851Bnz c2215851Bnz6 = (C2215851Bnz) ((LinkedList) c2215801Bnu.LIZ).peek();
                            if (c2215851Bnz6 != null) {
                                if (c2215851Bnz6.LIZLLL == null) {
                                    c2215851Bnz6.LIZLLL = c2215851Bnz5;
                                    c2215801Bnu.LIZ();
                                } else {
                                    throw new C2215701Bnk("express parse failed, hang full node", null);
                                }
                            } else {
                                throw new C2215701Bnk("express parse failed, hang null node", null);
                            }
                        } else if (c2215851Bnz2.LIZJ()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("express parse failed, error node is ");
                            sbLIZ.append(c2215851Bnz5);
                            sbLIZ.append(", last node is ");
                            sbLIZ.append(c2215851Bnz2);
                            throw new C2215701Bnk(C2188811AlT.LIZIZ(sbLIZ), null);
                        }
                    }
                    ((LinkedList) c2215801Bnu.LIZ).push(c2215851Bnz5);
                } else {
                    if (c2215851Bnz5.LIZIZ()) {
                        if (c2215851Bnz2 != null) {
                            if (c2215851Bnz2.LIZJ()) {
                                c2215801Bnu.LIZIZ(c2215851Bnz5);
                            } else if (c2215851Bnz2.LIZIZ()) {
                                EnumC2215821Bnw enumC2215821Bnw3 = c2215851Bnz2.LIZ;
                                EnumC2215821Bnw enumC2215821Bnw4 = EnumC2215821Bnw.OPERATOR_COMPARE;
                                if (enumC2215821Bnw3 != enumC2215821Bnw4 && enumC2215821Bnw3 != EnumC2215821Bnw.OPERATOR_MOD) {
                                    if (enumC2215821Bnw3 != EnumC2215821Bnw.OPERATOR_AND && enumC2215821Bnw3 != EnumC2215821Bnw.OPERATOR_OR) {
                                        c = 0;
                                    } else {
                                        c = 1;
                                    }
                                } else {
                                    c = 2;
                                }
                                EnumC2215821Bnw enumC2215821Bnw5 = c2215851Bnz5.LIZ;
                                if (enumC2215821Bnw5 != enumC2215821Bnw4 && enumC2215821Bnw5 != EnumC2215821Bnw.OPERATOR_MOD) {
                                    if (enumC2215821Bnw5 == EnumC2215821Bnw.OPERATOR_AND || enumC2215821Bnw5 == EnumC2215821Bnw.OPERATOR_OR) {
                                        c2 = 1;
                                    } else {
                                        c2215801Bnu.LIZIZ(c2215851Bnz5);
                                    }
                                } else {
                                    c2 = 2;
                                }
                                if (c < c2) {
                                    C2215851Bnz c2215851Bnz7 = (C2215851Bnz) ((LinkedList) c2215801Bnu.LIZ).peek();
                                    if (c2215851Bnz7 != null) {
                                        C2215851Bnz c2215851Bnz8 = c2215851Bnz7.LIZLLL;
                                        if (c2215851Bnz8 != null) {
                                            c2215851Bnz5.LIZJ = c2215851Bnz8;
                                            c2215851Bnz7.LIZLLL = null;
                                            ((LinkedList) c2215801Bnu.LIZ).push(c2215851Bnz5);
                                        } else {
                                            throw new C2215701Bnk("express parse failed, rob not full node", null);
                                        }
                                    } else {
                                        throw new C2215701Bnk("express parse failed, rob null node", null);
                                    }
                                } else {
                                    c2215801Bnu.LIZIZ(c2215851Bnz5);
                                }
                            }
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("express parse failed, error node is ");
                        sbLIZ2.append(c2215851Bnz5);
                        sbLIZ2.append(", last node is ");
                        sbLIZ2.append(c2215851Bnz2);
                        throw new C2215701Bnk(C2188811AlT.LIZIZ(sbLIZ2), null);
                    }
                    EnumC2215821Bnw enumC2215821Bnw6 = c2215851Bnz5.LIZ;
                    if (enumC2215821Bnw6 == EnumC2215821Bnw.LEFT_BRACKET) {
                        ((LinkedList) c2215801Bnu.LIZ).push(C2215801Bnu.LIZIZ);
                    } else if (enumC2215821Bnw6 != EnumC2215821Bnw.RIGHT_BRACKET) {
                        continue;
                    } else if (((LinkedList) c2215801Bnu.LIZ).removeFirstOccurrence(C2215801Bnu.LIZIZ)) {
                        c2215801Bnu.LIZ();
                    } else {
                        throw new C2215701Bnk("express parse failed, remove barrage error", null);
                    }
                }
            }
            if (((LinkedList) c2215801Bnu.LIZ).size() == 1) {
                if (!c2215801Bnu.LIZ.isEmpty() && (c2215851Bnz = (C2215851Bnz) ((LinkedList) c2215801Bnu.LIZ).peek()) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    C2215751Bnp.LIZ(c2215851Bnz, arrayList3);
                    c2215861Bo0 = new C2215861Bo0(arrayList3);
                    LIZ.put(str, c2215861Bo0);
                } else {
                    throw new C2215701Bnk("express parse failed, stack root is null", null);
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("express parse failed, result stack size is ");
                sbLIZ3.append(((LinkedList) c2215801Bnu.LIZ).size());
                throw new C2215701Bnk(C2188811AlT.LIZIZ(sbLIZ3), null);
            }
        }
        C2215781Bns c2215781Bns = new C2215781Bns();
        Iterator<InterfaceC2215771Bnr> it3 = c2215861Bo0.LIZ.iterator();
        while (it3.hasNext()) {
            it3.next().LIZ(c2215781Bns, map);
        }
        if (((LinkedList) c2215781Bns.LIZ).size() == 1) {
            return ((LinkedList) c2215781Bns.LIZ).peek();
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("express execute failed, stack size is ");
        sbLIZ4.append(((LinkedList) c2215781Bns.LIZ).size());
        throw new C2215701Bnk(C2188811AlT.LIZIZ(sbLIZ4), null);
    }
}
