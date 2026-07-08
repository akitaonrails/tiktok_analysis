package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0fbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133630fbd {
    public boolean LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public int LIZLLL = Integer.MIN_VALUE;
    public int LJ = Integer.MAX_VALUE;
    public final CoroutineContext LJIIJ = C0PEM.LIZ.plus(new C1151890g55(CoroutineExceptionHandler.LJJLIL, 4));
    public long LJIIJJI = -1;

    public final void LIZLLL(int i, int i2, String str, List list) {
        boolean z = this.LIZ;
        this.LIZ = false;
        int i3 = this.LJFF;
        int i4 = this.LJI;
        this.LJFF = i;
        this.LJI = i2;
        int i5 = this.LIZLLL;
        int i6 = this.LJ;
        this.LIZLLL = i;
        this.LJ = i2;
        C23250099c.LIZLLL(C817503Hh.LL, this.LJIIJ, null, new C1133620fbc(this, str, z, i, i2, i3, i4, C13LP.LLIIII(list), i5, i6, null), 2);
    }

    public static void LIZ(int i, int i2, Long l, String str, String str2, List list) {
        int i3;
        InterfaceC1665500tRU<C1146350fw9> interfaceC1665500tRU;
        if (l != null) {
            l.longValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C1146360fwA) {
                    arrayList.add(obj);
                }
            }
            C1146360fwA c1146360fwA = (C1146360fwA) C13LP.LJJJLL(arrayList);
            Object obj2 = null;
            if (c1146360fwA != null && (interfaceC1665500tRU = c1146360fwA.LLILZLL) != null) {
                int i4 = 0;
                for (C1146350fw9 c1146350fw9 : interfaceC1665500tRU) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        C1146350fw9 c1146350fw92 = c1146350fw9;
                        if (c1146350fw92.LL == l.longValue()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("logGiftPreviewFromActivity index(");
                            sbLIZ.append(i4);
                            sbLIZ.append(") ");
                            C20441214yg.LIZIZ("GiftAnchorPanelEventTracker", C2188811AlT.LIZIZ(sbLIZ));
                            C1133640fbe.LJI(c1146350fw92, str, str2, c1146350fw92.LL, i5, i5, 1, c1146350fw92.LLILZIL);
                            return;
                        }
                        i4 = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof C1146350fw9) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((C1146350fw9) next).LL == l.longValue()) {
                    obj2 = next;
                    break;
                }
            }
            C1146350fw9 c1146350fw93 = (C1146350fw9) obj2;
            if (c1146350fw93 != null) {
                Iterator it3 = list.iterator();
                int i6 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it3.next();
                        if ((interfaceC1891350zJl instanceof C1146350fw9) && ((C1146350fw9) interfaceC1891350zJl).LL == c1146350fw93.LL) {
                            break;
                        } else {
                            i6++;
                        }
                    } else {
                        i6 = -1;
                        break;
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("logGiftPreviewFromList index(");
                sbLIZ2.append(i6);
                sbLIZ2.append(") fv(");
                sbLIZ2.append(i);
                sbLIZ2.append(") lv(");
                sbLIZ2.append(i2);
                sbLIZ2.append(") ");
                C20441214yg.LIZIZ("GiftAnchorPanelEventTracker", C2188811AlT.LIZIZ(sbLIZ2));
                if (C13LP.LJJJLL(list) instanceof C1146360fwA) {
                    if (i == 0) {
                        i3 = i6;
                    } else {
                        i3 = (i6 - i) + 1;
                    }
                } else {
                    i3 = (i6 - i) + 1;
                    i6++;
                }
                C1133640fbe.LJI(c1146350fw93, str, str2, c1146350fw93.LL, i3, i6, 0, c1146350fw93.LLILZIL);
            }
        }
    }

    public final void LIZIZ(String str, String str2, int i, int i2, int i3, int i4, List<? extends InterfaceC1891350zJl> list) {
        String str3;
        long j;
        int i5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logGiftShow enterFrom(");
        sbLIZ.append(str);
        sbLIZ.append(") fv(");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(") lv(");
        sbLIZ.append(this.LJ);
        sbLIZ.append(") fcv(");
        sbLIZ.append(i);
        sbLIZ.append(") lcv(");
        sbLIZ.append(i2);
        sbLIZ.append(") ");
        C20441214yg.LIZIZ("GiftAnchorPanelEventTracker", C2188811AlT.LIZIZ(sbLIZ));
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        boolean z = C13LP.LJJJLL(list) instanceof C1146360fwA;
        Iterator<? extends InterfaceC1891350zJl> it2 = list.iterator();
        int i6 = 0;
        while (true) {
            Object obj = null;
            if (it2.hasNext()) {
                InterfaceC1891350zJl next = it2.next();
                int i7 = i6 + 1;
                if (i6 >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = next;
                    if (interfaceC1891350zJl instanceof C1146350fw9) {
                        if (i3 <= i6 && i6 <= i4) {
                            if (z) {
                                i5 = i6;
                            } else {
                                i5 = i7;
                            }
                            linkedList2.add(Integer.valueOf(i5));
                        }
                        if (i <= i6 && i6 <= i2) {
                            linkedList.add(interfaceC1891350zJl);
                            if (!z) {
                                i6 = i7;
                            }
                            linkedList3.add(Integer.valueOf(i6));
                            C1146350fw9 c1146350fw9 = (C1146350fw9) interfaceC1891350zJl;
                            if (c1146350fw9.LLILLJJLI == 3) {
                                j = 7777777;
                            } else {
                                j = c1146350fw9.LL;
                            }
                            linkedList4.add(Long.valueOf(j));
                        }
                    }
                    i6 = i7;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                int size = linkedList2.size();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_gift_show");
                C1133640fbe.LIZ(c474500IjALIZ);
                c474500IjALIZ.LJJII(str, "gift_enter_from");
                c474500IjALIZ.LJJII(str2, "action_type");
                c474500IjALIZ.LJJII(Integer.valueOf(size), "show_gift_cnt");
                c474500IjALIZ.LJJII(linkedList4, "gift_id_set");
                c474500IjALIZ.LJJII(linkedList2, "show_gift_position");
                c474500IjALIZ.LJJII(linkedList3, "gift_position");
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(linkedList, 10));
                Iterator it3 = linkedList.iterator();
                while (it3.hasNext()) {
                    arrayList.add(C1133640fbe.LJ((C1146350fw9) it3.next()));
                }
                c474500IjALIZ.LJJII(arrayList, "gift_type_set");
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(linkedList, 10));
                Iterator it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(C1133640fbe.LIZLLL((C1146350fw9) it4.next()));
                }
                c474500IjALIZ.LJJII(arrayList2, "community_gift_status");
                Iterator it5 = linkedList.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next2 = it5.next();
                    if (((C1146350fw9) next2).LLJJIII.length() > 0) {
                        obj = next2;
                        break;
                    }
                }
                C1146350fw9 c1146350fw92 = (C1146350fw9) obj;
                if (c1146350fw92 == null || (str3 = c1146350fw92.LLJJIII) == null) {
                    str3 = "no_gift";
                }
                c474500IjALIZ.LJJII(str3, "community_gift_status_gift_panel");
                c474500IjALIZ.LIZ();
                return;
            }
        }
    }

    public final void LIZJ(String str, long j, boolean z, long j2, long j3, boolean z2, long j4, int i) {
        int i2;
        C20441214yg.LIZIZ("GiftAnchorPanelEventTracker", "logPanelShow");
        if (!this.LJII) {
            C1133640fbe.LJIIIIZZ(i, j2, j3, j4 - this.LJIIIZ, str, z, z2);
            this.LJIIIIZZ = SystemClock.uptimeMillis();
            this.LJII = true;
        }
        if (z) {
            i2 = 10;
        } else {
            i2 = 9;
        }
        C1133640fbe.LJIIL(i2, str, Long.valueOf(SystemClock.uptimeMillis() - j), null, 8);
    }

    public final void LJ(String str, int i, int i2, List<? extends InterfaceC1891350zJl> list, boolean z, Long l, long j, long j2, long j3, boolean z2, long j4, int i3) {
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i;
        this.LJI = i2;
        LIZJ(str, j, false, j2, j3, z2, j4, i3);
        if (z) {
            LIZ(i, i2, l, str, "call", list);
        }
        LIZIZ(str, "click", i, i2, i, i2, list);
    }
}
