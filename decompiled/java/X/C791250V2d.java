package X;

import Y.AComparatorS32S0000000_13;
import Y.ARunnableS81S0200000_12;
import android.app.Application;
import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0V2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791250V2d {
    public static int LIZIZ(long j) {
        return (int) ((j >> 41) & 4194303);
    }

    public static boolean LIZLLL(long j) {
        return ((j >> 63) & 1) == 1;
    }

    public static String LIZJ(List<C791260V2e> list) {
        StringBuilder sb;
        Application application;
        StringBuilder sb2 = new StringBuilder();
        HashSet<Integer> hashSet = new HashSet();
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList, new AComparatorS32S0000000_13(25));
        for (int i = 0; i < linkedList.size(); i++) {
            int i2 = ((C791260V2e) linkedList.get(i)).LIZ;
            if (i2 != 4194302) {
                if (((C791260V2e) linkedList.get(i)).LJFF < 16 || hashSet.size() >= 5) {
                    break;
                }
                hashSet.add(Integer.valueOf(i2));
            }
        }
        for (Integer num : hashSet) {
            sb2.append(num);
            sb2.append("\n");
            C791220V2a c791220V2a = C0V2N.LIZ;
            int iIntValue = num.intValue();
            c791220V2a.getClass();
            if (C0V2E.LLJJ) {
                if (!((HashSet) c791220V2a.LIZIZ).contains(Integer.valueOf(iIntValue))) {
                    if (((HashSet) c791220V2a.LIZJ).size() <= c791220V2a.LIZLLL) {
                        ((HashSet) c791220V2a.LIZJ).add(Integer.valueOf(iIntValue));
                    } else {
                        c791220V2a.LIZIZ.addAll(c791220V2a.LIZJ);
                        Iterator it2 = ((HashSet) c791220V2a.LIZJ).iterator();
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            sb = C791220V2a.LJI;
                            if (!zHasNext) {
                                break;
                            }
                            sb.append(it2.next());
                            sb.append(",");
                        }
                        if (sb.length() > c791220V2a.LJ) {
                            String string = sb.toString();
                            if (string != null && (application = C792190V5t.LIZIZ) != null) {
                                C791230V2b.LIZ(application);
                                String string2 = C791230V2b.LIZ.getString("evil_method_SPUtils_key", null);
                                if (string2 != null) {
                                    string = string2.concat(string);
                                }
                                Application application2 = C792190V5t.LIZIZ;
                                if (application2 != null) {
                                    C791230V2b.LIZ(application2);
                                    C791230V2b.LIZ.edit().putString("evil_method_SPUtils_key", string).apply();
                                }
                            }
                            sb.setLength(0);
                        }
                        C786410Ut5.LJJZZIII(c791220V2a.LJFF, new ARunnableS81S0200000_12(c791220V2a, new HashSet(c791220V2a.LIZJ), 86));
                        ((HashSet) c791220V2a.LIZJ).clear();
                    }
                }
            }
        }
        return sb2.toString();
    }

    public static void LIZ(LinkedList linkedList, C791260V2e c791260V2e) {
        C791260V2e c791260V2e2;
        Context context = C792400V6o.LIZ;
        if (!linkedList.isEmpty() && (c791260V2e2 = (C791260V2e) linkedList.peek()) != null && c791260V2e2.LIZ == c791260V2e.LIZ) {
            int i = c791260V2e2.LIZLLL;
            int i2 = c791260V2e.LIZLLL;
            if (i == i2 && i2 != 0) {
                int i3 = c791260V2e.LIZIZ;
                if (i3 == 5000) {
                    i3 = c791260V2e2.LIZIZ;
                }
                c791260V2e.LIZIZ = i3;
                c791260V2e2.LJ++;
                c791260V2e2.LIZIZ = (int) (((long) c791260V2e2.LIZIZ) + ((long) i3));
                return;
            }
        }
        linkedList.push(c791260V2e);
    }

    public static long LJ(LinkedList<C791260V2e> linkedList, StringBuilder sb) {
        long j = 0;
        for (C791260V2e c791260V2e : linkedList) {
            sb.append(c791260V2e.toString());
            sb.append('\n');
            long j2 = c791260V2e.LIZIZ;
            if (j < j2) {
                j = j2;
            }
        }
        return j;
    }

    public static void LJI(int i, List list) {
        LinkedList linkedList = (LinkedList) list;
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            C791260V2e c791260V2e = (C791260V2e) listIterator.previous();
            if (c791260V2e != null && c791260V2e.LIZIZ < i) {
                listIterator.remove();
            }
        }
    }

    public static void LJII(List list, C791150V1t c791150V1t) {
        LinkedList linkedList = (LinkedList) list;
        int size = linkedList.size();
        int i = 1;
        while (size > 30) {
            ListIterator listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious()) {
                if (((C791260V2e) listIterator.previous()).LIZIZ < i * 5) {
                    listIterator.remove();
                    size--;
                    if (size <= 30) {
                        return;
                    }
                }
            }
            size = linkedList.size();
            i++;
            if (60 < i) {
                break;
            }
        }
        int size2 = linkedList.size();
        if (size2 > 30) {
            if (C792400V6o.LJIIIIZZ()) {
                C791280V2g.LIZJ("[fallback] size:%s targetSize:%s stack:%s", Integer.valueOf(size2), 30, list);
            }
            ListIterator listIterator2 = linkedList.listIterator(Math.min(size2, 30));
            while (listIterator2.hasNext()) {
                listIterator2.next();
                listIterator2.remove();
            }
        }
    }

    public static void LJFF(long[] jArr, LinkedList linkedList, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        C791260V2e c791260V2e;
        int iLIZIZ;
        if (jArr != null && jArr.length != 0) {
            long j3 = 0;
            if (jArr[jArr.length - 1] != 0) {
                j2 = jArr[jArr.length - 1] & 2199023255551L;
            } else {
                j2 = Long.MAX_VALUE;
            }
            int i5 = 0;
            while (i5 < jArr.length && (jArr[i5] & 2199023255551L) >= j2) {
                i5++;
            }
            LinkedList linkedList2 = new LinkedList();
            int size = 0;
            boolean z = false;
            while (i5 < jArr.length) {
                long j4 = jArr[i5];
                if (j3 != j4) {
                    if (LIZLLL(j4) && 4194302 == LIZIZ(j4)) {
                        z = true;
                    } else if (!z) {
                        if (LIZIZ(j4) > 4194000) {
                            C791280V2g.LIZIZ("s2 pass this method[%s], isIn [%b] ", Integer.valueOf(LIZIZ(j4)), Boolean.valueOf(LIZLLL(j4)));
                        }
                    }
                    if (LIZLLL(j4)) {
                        if (LIZIZ(j4) == 4194302) {
                            linkedList2.clear();
                            size = 0;
                        }
                        size++;
                        linkedList2.push(Long.valueOf(j4));
                    } else {
                        int iLIZIZ2 = LIZIZ(j4);
                        if (!linkedList2.isEmpty()) {
                            long jLongValue = ((Long) linkedList2.pop()).longValue();
                            size--;
                            LinkedList linkedList3 = new LinkedList();
                            linkedList3.push(Long.valueOf(jLongValue));
                            while (true) {
                                iLIZIZ = LIZIZ(jLongValue);
                                if (iLIZIZ == iLIZIZ2 || linkedList2.isEmpty()) {
                                    break;
                                }
                                if (C792400V6o.LJIIIIZZ()) {
                                    C791280V2g.LIZJ("pop inMethodId[%s] to continue match ouMethodId[%s]", Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ2));
                                }
                                jLongValue = ((Long) linkedList2.pop()).longValue();
                                size--;
                                linkedList3.push(Long.valueOf(jLongValue));
                            }
                            if (iLIZIZ != iLIZIZ2 && iLIZIZ == 4194302) {
                                Context context = C792400V6o.LIZ;
                                linkedList2.addAll(linkedList3);
                                size += linkedList2.size();
                            } else {
                                long j5 = (j4 & 2199023255551L) + C0V2K.LJII;
                                while (linkedList3.size() != 0) {
                                    long jLongValue2 = (((Long) linkedList3.pop()).longValue() & 2199023255551L) + C0V2K.LJII;
                                    long j6 = j5 - jLongValue2;
                                    if (j6 < 0) {
                                        if (C792400V6o.LJIIIIZZ()) {
                                            C791280V2g.LIZ("[structuredDataToStack] trace during invalid:%d", Long.valueOf(j6));
                                        }
                                        linkedList2.clear();
                                        linkedList.clear();
                                        return;
                                    }
                                    LIZ(linkedList, new C791260V2e(iLIZIZ2, (int) j6, jLongValue2, size));
                                }
                            }
                        } else if (C792400V6o.LJIIIIZZ()) {
                            C791280V2g.LIZJ("[structuredDataToStack] method[%s] not found in! ", Integer.valueOf(iLIZIZ2));
                        }
                    }
                }
                i5++;
                j3 = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("structuredDataToStack inner, result.size: ");
            sbLIZ.append(linkedList.size());
            sbLIZ.append(", ");
            sbLIZ.append(linkedList2.size());
            C791280V2g.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
            while (!linkedList2.isEmpty()) {
                long jLongValue3 = ((Long) linkedList2.pop()).longValue();
                int iLIZIZ3 = LIZIZ(jLongValue3);
                boolean zLIZLLL = LIZLLL(jLongValue3);
                long j7 = (jLongValue3 & 2199023255551L) + C0V2K.LJII;
                if (C792400V6o.LJIIIIZZ()) {
                    C791280V2g.LIZJ("[structuredDataToStack] has never out method[%s], isIn:%s, inTime:%s, endTime:%s,rawData size:%s", Integer.valueOf(iLIZIZ3), Boolean.valueOf(zLIZLLL), Long.valueOf(j7), Long.valueOf(j), Integer.valueOf(linkedList2.size()));
                }
                if (!zLIZLLL) {
                    if (C792400V6o.LJIIIIZZ()) {
                        C791280V2g.LIZ("[structuredDataToStack] why has out Method[%s]? is wrong! ", Integer.valueOf(iLIZIZ3));
                    }
                } else {
                    LIZ(linkedList, new C791260V2e(iLIZIZ3, (int) (j - j7), j7, linkedList2.size()));
                }
            }
            C791270V2f c791270V2f = null;
            C791270V2f c791270V2f2 = new C791270V2f(null, null);
            ListIterator listIterator = linkedList.listIterator(0);
            int i6 = 0;
            while (true) {
                if (listIterator.hasNext()) {
                    C791270V2f c791270V2f3 = new C791270V2f((C791260V2e) listIterator.next(), c791270V2f);
                    i6++;
                    if (c791270V2f == null && (c791260V2e = c791270V2f3.LIZ) != null && c791260V2e.LIZLLL != 0) {
                        if (C792400V6o.LJIIIIZZ()) {
                            C791280V2g.LIZ("[stackToTree] SceneMethodsInfo begin error! why the first node'depth is not 0!", new Object[0]);
                        }
                    } else {
                        C791260V2e c791260V2e2 = c791270V2f3.LIZ;
                        if (c791260V2e2 == null) {
                            i2 = 0;
                        } else {
                            i2 = c791260V2e2.LIZLLL;
                        }
                        if (c791270V2f != null && i2 != 0) {
                            C791260V2e c791260V2e3 = c791270V2f.LIZ;
                            if (c791260V2e3 == null) {
                                i3 = 0;
                            } else {
                                i3 = c791260V2e3.LIZLLL;
                            }
                            if (i3 < i2) {
                                c791270V2f.LIZJ.addFirst(c791270V2f3);
                            } else {
                                do {
                                    C791260V2e c791260V2e4 = c791270V2f.LIZ;
                                    if (c791260V2e4 == null) {
                                        i4 = 0;
                                    } else {
                                        i4 = c791260V2e4.LIZLLL;
                                    }
                                    if (i4 > i2) {
                                        c791270V2f = c791270V2f.LIZIZ;
                                    } else {
                                        C791270V2f c791270V2f4 = c791270V2f.LIZIZ;
                                        if (c791270V2f4 != null) {
                                            c791270V2f3.LIZIZ = c791270V2f4;
                                            c791270V2f.LIZIZ.LIZJ.addFirst(c791270V2f3);
                                        }
                                    }
                                } while (c791270V2f != null);
                            }
                            c791270V2f = c791270V2f3;
                        } else {
                            c791270V2f2.LIZJ.addFirst(c791270V2f3);
                            c791270V2f = c791270V2f3;
                        }
                    }
                } else {
                    C791280V2g.LIZIZ("[stackToTree] count [%d] ", Integer.valueOf(i6));
                    break;
                }
            }
            linkedList.clear();
            LinkedList linkedList4 = new LinkedList();
            do {
                C791260V2e c791260V2e5 = c791270V2f2.LIZ;
                if (c791260V2e5 != null) {
                    if (c791270V2f2.LIZJ.isEmpty()) {
                        i = c791270V2f2.LIZ.LIZIZ;
                    } else {
                        int i7 = 0;
                        for (int i8 = 0; i8 < c791270V2f2.LIZJ.size(); i8++) {
                            i7 += c791270V2f2.LIZJ.get(i8).LIZ.LIZIZ;
                        }
                        i = c791270V2f2.LIZ.LIZIZ - i7;
                    }
                    c791260V2e5.LJFF = i;
                    linkedList.add(c791270V2f2.LIZ);
                }
                LinkedList<C791270V2f> linkedList5 = c791270V2f2.LIZJ;
                if (!linkedList5.isEmpty()) {
                    int size2 = linkedList5.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        } else {
                            linkedList4.add(linkedList5.get(size2));
                        }
                    }
                }
                c791270V2f2 = (C791270V2f) linkedList4.pollLast();
            } while (c791270V2f2 != null);
        }
    }
}
