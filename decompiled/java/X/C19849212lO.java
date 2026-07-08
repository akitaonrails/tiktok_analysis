package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.12lO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19849212lO {
    public static final AbstractC19844412kc LIZ(C19849712lT c19849712lT) throws C19849312lP {
        long j;
        try {
            C19849612lS c19849612lSLJFF = c19849712lT.LJFF();
            if (c19849612lSLJFF != null) {
                try {
                    byte b = c19849612lSLJFF.LIZIZ;
                    byte b2 = c19849612lSLJFF.LIZ;
                    int i = 0;
                    if (b2 != -128) {
                        if (b2 != -96) {
                            if (b2 != -64) {
                                if (b2 != -32) {
                                    if (b2 != 0 && b2 != 32) {
                                        if (b2 != 64) {
                                            if (b2 == 96) {
                                                c19849712lT.LJIILLIIL((byte) 96);
                                                String str = new String(c19849712lT.LJIJJ(), StandardCharsets.UTF_8);
                                                LIZIZ(b, str.length());
                                                return new C19844512kd(str);
                                            }
                                            throw new C19849312lP("Unidentifiable major type: " + ((c19849612lSLJFF.LIZ >> 5) & 7));
                                        }
                                        c19849712lT.LJIILLIIL((byte) 64);
                                        byte[] bArrLJIJJ = c19849712lT.LJIJJ();
                                        int length = bArrLJIJJ.length;
                                        LIZIZ(b, length);
                                        return new C19850612lc(AbstractC19851412lk.zzl(bArrLJIJJ, 0, length));
                                    }
                                    long jLIZIZ = c19849712lT.LIZIZ();
                                    if (jLIZIZ > 0) {
                                        j = jLIZIZ;
                                    } else {
                                        j = ~jLIZIZ;
                                    }
                                    LIZIZ(b, j);
                                    return new C19844612ke(jLIZIZ);
                                }
                                final boolean zLJI = c19849712lT.LJI();
                                return new AbstractC19844412kc(zLJI) { // from class: X.12kh
                                    public final boolean LL;

                                    {
                                        this.LL = zLJI;
                                    }

                                    public final int hashCode() {
                                        return Arrays.hashCode(new Object[]{7, Boolean.valueOf(this.LL)});
                                    }

                                    @Override // X.AbstractC19844412kc
                                    public final int zza() {
                                        return 7;
                                    }

                                    public final String toString() {
                                        return Boolean.toString(this.LL);
                                    }

                                    @Override // java.lang.Comparable
                                    public final int compareTo(Object obj) {
                                        int i2;
                                        AbstractC19844412kc abstractC19844412kc = (AbstractC19844412kc) obj;
                                        if (7 != abstractC19844412kc.zza()) {
                                            return 7 - abstractC19844412kc.zza();
                                        }
                                        C19844912kh c19844912kh = (C19844912kh) abstractC19844412kc;
                                        int i3 = 20;
                                        if (true != this.LL) {
                                            i2 = 20;
                                        } else {
                                            i2 = 21;
                                        }
                                        if (true == c19844912kh.LL) {
                                            i3 = 21;
                                        }
                                        return i2 - i3;
                                    }

                                    public final boolean equals(Object obj) {
                                        if (this == obj) {
                                            return true;
                                        }
                                        if (obj != null && C19844912kh.class == obj.getClass() && this.LL == ((C19844912kh) obj).LL) {
                                            return true;
                                        }
                                        return false;
                                    }
                                };
                            }
                            throw new C19849312lP("Tags are currently unsupported");
                        }
                        long jLIZLLL = c19849712lT.LIZLLL();
                        if (jLIZLLL <= 1000) {
                            LIZIZ(b, jLIZLLL);
                            int i2 = (int) jLIZLLL;
                            C19849412lQ[] c19849412lQArr = new C19849412lQ[i2];
                            AbstractC19844412kc abstractC19844412kc = null;
                            int i3 = 0;
                            while (i3 < jLIZLLL) {
                                AbstractC19844412kc abstractC19844412kcLIZ = LIZ(c19849712lT);
                                if (abstractC19844412kc != null && abstractC19844412kcLIZ.compareTo(abstractC19844412kc) <= 0) {
                                    throw new C19849512lR(C786410Ut5.j4("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", new Object[]{abstractC19844412kc.toString(), abstractC19844412kcLIZ.toString()}));
                                }
                                c19849412lQArr[i3] = new C19849412lQ(abstractC19844412kcLIZ, LIZ(c19849712lT));
                                i3++;
                                abstractC19844412kc = abstractC19844412kcLIZ;
                            }
                            TreeMap treeMap = new TreeMap();
                            while (i < i2) {
                                C19849412lQ c19849412lQ = c19849412lQArr[i];
                                if (!treeMap.containsKey(c19849412lQ.LIZ)) {
                                    treeMap.put(c19849412lQ.LIZ, c19849412lQ.LIZIZ);
                                    i++;
                                } else {
                                    throw new C19849512lR("Attempted to add duplicate key to canonical CBOR Map.");
                                }
                            }
                            return new C19850112lX(C19861912nR.zzf(treeMap));
                        }
                        throw new C19849312lP("Parser being asked to read a large CBOR map");
                    }
                    long jLIZ = c19849712lT.LIZ();
                    if (jLIZ <= 1000) {
                        LIZIZ(b, jLIZ);
                        AbstractC19844412kc[] abstractC19844412kcArr = new AbstractC19844412kc[(int) jLIZ];
                        while (i < jLIZ) {
                            abstractC19844412kcArr[i] = LIZ(c19849712lT);
                            i++;
                        }
                        final AbstractC19861312nL abstractC19861312nLZzi = AbstractC19861312nL.zzi(abstractC19844412kcArr);
                        return new AbstractC19844412kc(abstractC19861312nLZzi) { // from class: X.12lV
                            public final AbstractC19861312nL LL;
                            public final int LLILLJJLI;

                            @Override // X.AbstractC19844412kc
                            public final int LIZJ() {
                                return this.LLILLJJLI;
                            }

                            public final int hashCode() {
                                return Arrays.hashCode(new Object[]{4, this.LL});
                            }

                            @Override // X.AbstractC19844412kc
                            public final int zza() {
                                return 4;
                            }

                            public final String toString() {
                                if (this.LL.isEmpty()) {
                                    return "[]";
                                }
                                ArrayList arrayList = new ArrayList();
                                AbstractC19861312nL abstractC19861312nL = this.LL;
                                int size = abstractC19861312nL.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    arrayList.add(ListProtector.get(abstractC19861312nL, i4).toString().replace("\n", "\n  "));
                                }
                                StringBuilder sb = new StringBuilder("[\n  ");
                                Iterator it2 = arrayList.iterator();
                                try {
                                    if (it2.hasNext()) {
                                        sb.append(C19850212lY.LIZ(it2.next()));
                                        while (it2.hasNext()) {
                                            sb.append((CharSequence) ",\n  ");
                                            sb.append(C19850212lY.LIZ(it2.next()));
                                        }
                                    }
                                    sb.append("\n]");
                                    return sb.toString();
                                } catch (IOException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    throw new AssertionError(e);
                                }
                            }

                            {
                                abstractC19861312nLZzi.getClass();
                                this.LL = abstractC19861312nLZzi;
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    AbstractC19861312nL abstractC19861312nL = this.LL;
                                    if (i4 >= abstractC19861312nL.size()) {
                                        break;
                                    }
                                    int iLIZJ = ((AbstractC19844412kc) abstractC19861312nL.get(i4)).LIZJ();
                                    if (i5 < iLIZJ) {
                                        i5 = iLIZJ;
                                    }
                                    i4++;
                                }
                                int i6 = i5 + 1;
                                this.LLILLJJLI = i6;
                                if (i6 <= 4) {
                                } else {
                                    throw new C19849512lR("Exceeded cutoff limit for max depth of cbor value");
                                }
                            }

                            @Override // java.lang.Comparable
                            public final int compareTo(Object obj) {
                                AbstractC19844412kc abstractC19844412kc2 = (AbstractC19844412kc) obj;
                                if (4 != abstractC19844412kc2.zza()) {
                                    return 4 - abstractC19844412kc2.zza();
                                }
                                C19849912lV c19849912lV = (C19849912lV) abstractC19844412kc2;
                                AbstractC19861312nL abstractC19861312nL = this.LL;
                                int size = abstractC19861312nL.size();
                                AbstractC19861312nL abstractC19861312nL2 = c19849912lV.LL;
                                if (size != abstractC19861312nL2.size()) {
                                    return abstractC19861312nL.size() - abstractC19861312nL2.size();
                                }
                                int i4 = 0;
                                while (true) {
                                    AbstractC19861312nL abstractC19861312nL3 = this.LL;
                                    if (i4 >= abstractC19861312nL3.size()) {
                                        return 0;
                                    }
                                    int iCompareTo = ((AbstractC19844412kc) abstractC19861312nL3.get(i4)).compareTo(c19849912lV.LL.get(i4));
                                    if (iCompareTo != 0) {
                                        return iCompareTo;
                                    }
                                    i4++;
                                }
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || C19849912lV.class != obj.getClass()) {
                                    return false;
                                }
                                return this.LL.equals(((C19849912lV) obj).LL);
                            }
                        };
                    }
                    throw new C19849312lP("Parser being asked to read a large CBOR array");
                } catch (IOException | RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new C19849312lP("Error in decoding CborValue from bytes", e);
                }
            }
            throw new C19849312lP("Parser being asked to parse an empty input stream");
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new C19849312lP("Error in decoding CborValue from bytes", e2);
        }
    }

    public static final void LIZIZ(byte b, long j) throws C19849512lR {
        switch (b) {
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                if (j >= 24) {
                    return;
                }
                throw new C19849512lR("Integer value " + j + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j >= 256) {
                    return;
                }
                throw new C19849512lR("Integer value " + j + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j >= 65536) {
                    return;
                }
                throw new C19849512lR("Integer value " + j + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j >= 4294967296L) {
                    return;
                }
                throw new C19849512lR("Integer value " + j + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }
}
