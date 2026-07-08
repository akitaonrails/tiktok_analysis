package X;

import Y.AComparatorS42S0000000_23;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0orH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489290orH {
    public static C1489320orK LIZ() {
        C1489330orL c1489330orL = new C1489330orL();
        ((ArrayList) c1489330orL.LIZ).add(new InterfaceC1489340orM() { // from class: X.0orG
            public final int LIZ = 8;

            @Override // X.InterfaceC1489340orM
            public final EnumC1489260orE getType() {
                return EnumC1489260orE.MINIMUM_LENGTH;
            }

            @Override // X.InterfaceC1489340orM
            public final EnumC1489230orB LIZ(String str, EnumC1489230orB enumC1489230orB) {
                if (str.length() < this.LIZ) {
                    return EnumC1489230orB.INSTANT_WEAK;
                }
                return enumC1489230orB;
            }
        });
        ((ArrayList) c1489330orL.LIZ).add(new InterfaceC1489340orM() { // from class: X.0orI
            public final int LIZ = 3;

            @Override // X.InterfaceC1489340orM
            public final EnumC1489260orE getType() {
                return EnumC1489260orE.DISTINCT_CHAR;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [X.08CX] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Set] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Set] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.util.HashSet, java.util.LinkedHashSet] */
            @Override // X.InterfaceC1489340orM
            public final EnumC1489230orB LIZ(String str, EnumC1489230orB enumC1489230orB) {
                ?? Singleton;
                char[] charArray = str.toCharArray();
                int length = charArray.length;
                if (length != 0) {
                    if (length != 1) {
                        int length2 = charArray.length;
                        if (length2 > 128) {
                            length2 = 128;
                        }
                        Singleton = new LinkedHashSet(C2097908Jt.LIZIZ(length2));
                        for (char c : charArray) {
                            Singleton.add(Character.valueOf(c));
                        }
                    } else {
                        Singleton = Collections.singleton(Character.valueOf(charArray[0]));
                    }
                } else {
                    Singleton = C08CX.INSTANCE;
                }
                int size = Singleton.size();
                if (size < this.LIZ) {
                    return EnumC1489230orB.INSTANT_WEAK;
                }
                if (size < (str.length() / 2) + 1) {
                    EnumC1489230orB enumC1489230orB2 = EnumC1489230orB.MEDIUM;
                    if (enumC1489230orB.getScore$account_awemeaccount_release() >= enumC1489230orB2.getScore$account_awemeaccount_release()) {
                        return enumC1489230orB2;
                    }
                }
                return enumC1489230orB;
            }
        });
        ((ArrayList) c1489330orL.LIZ).add(new InterfaceC1489340orM() { // from class: X.0orD
            @Override // X.InterfaceC1489340orM
            public final EnumC1489260orE getType() {
                return EnumC1489260orE.ADJACENCY;
            }

            @Override // X.InterfaceC1489340orM
            public final EnumC1489230orB LIZ(String str, EnumC1489230orB enumC1489230orB) {
                int length = str.length() - 1;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    char cCharAt = str.charAt(i);
                    i++;
                    char cCharAt2 = str.charAt(i);
                    C01GW c01gw = C1900107cN.LIZ;
                    Pair pair = (Pair) ((Map) c01gw.getValue()).get(Character.valueOf(cCharAt));
                    Pair pair2 = (Pair) ((Map) c01gw.getValue()).get(Character.valueOf(cCharAt2));
                    if (pair != null && pair2 != null && Math.abs(((Number) pair2.getFirst()).intValue() - ((Number) pair.getFirst()).intValue()) + Math.abs(((Number) pair2.getSecond()).intValue() - ((Number) pair.getSecond()).intValue()) < 6) {
                        i2++;
                    }
                }
                if (i2 >= length - 1) {
                    EnumC1489230orB enumC1489230orB2 = EnumC1489230orB.MEDIUM;
                    if (enumC1489230orB.getScore$account_awemeaccount_release() >= enumC1489230orB2.getScore$account_awemeaccount_release()) {
                        return enumC1489230orB2;
                    }
                }
                return enumC1489230orB;
            }
        });
        ((ArrayList) c1489330orL.LIZ).add(new InterfaceC1489340orM() { // from class: X.0orJ
            public final C852350Xc9 LIZ = new C852350Xc9();

            @Override // X.InterfaceC1489340orM
            public final EnumC1489260orE getType() {
                return EnumC1489260orE.VARIETY;
            }

            @Override // X.InterfaceC1489340orM
            public final EnumC1489230orB LIZ(String str, EnumC1489230orB enumC1489230orB) {
                int length = str.length();
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    this.LIZ.getClass();
                    if (PatternProtector.compile("^[A-Za-z0-9_~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\]*$").matcher(String.valueOf(cCharAt)).matches()) {
                        if (Character.isLetter(cCharAt)) {
                            if (Character.isLowerCase(cCharAt)) {
                                z = true;
                            } else if (Character.isUpperCase(cCharAt)) {
                                z2 = true;
                            }
                        } else if (Character.isDigit(cCharAt)) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                    }
                }
                int iCompare = Boolean.compare(z, false) + Boolean.compare(z2, false) + Boolean.compare(z3, false) + Boolean.compare(z4, false);
                if (iCompare <= 1) {
                    return EnumC1489230orB.INSTANT_WEAK;
                }
                if (iCompare != 4) {
                    return enumC1489230orB;
                }
                return enumC1489230orB.getIncreasedComplexity();
            }
        });
        ((ArrayList) c1489330orL.LIZ).add(new InterfaceC1489340orM() { // from class: X.0orF
            public final int LIZ = 12;

            @Override // X.InterfaceC1489340orM
            public final EnumC1489260orE getType() {
                return EnumC1489260orE.LENGTH_BOOSTER;
            }

            @Override // X.InterfaceC1489340orM
            public final EnumC1489230orB LIZ(String str, EnumC1489230orB enumC1489230orB) {
                if (str.length() >= this.LIZ) {
                    return enumC1489230orB.getIncreasedComplexity();
                }
                return enumC1489230orB;
            }
        });
        ArrayList arrayList = (ArrayList) c1489330orL.LIZIZ;
        arrayList.clear();
        arrayList.addAll(C13LP.LJLLLL(new AComparatorS42S0000000_23(22), c1489330orL.LIZ));
        return new C1489320orK(c1489330orL);
    }
}
