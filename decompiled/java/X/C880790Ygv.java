package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ygv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880790Ygv {
    public static final C880790Ygv LIZ = new C880790Ygv();
    public static final List<Class<? extends Object>> LIZIZ = C1697810uHb.LJIIJJI(ArrayList.class, Object[].class, Arrays.asList("").getClass(), Integer.class, Integer.TYPE, Number.class, Long.TYPE, Long.class, Enum.class, String.class, Boolean.TYPE, Boolean.class, IMUser.class, IMContact.class, BaseContact.class, UrlModel.class, C886420Yq0.class, C1709506mj.class, C878630YdR.class, InterfaceC879500Yeq.class, C881260Yhg.class, C886440Yq2.class, C879630Yf3.class, AbstractC884010Ym7.class, C880340YgC.class, C880330YgB.class);

    public static List LIZLLL(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            AbstractC885530YoZ abstractC885530YoZLIZIZ = ((AbstractC885540Yoa) it2.next()).LIZIZ();
            if (abstractC885530YoZLIZIZ instanceof C886420Yq0) {
                linkedHashSet.add(((C886420Yq0) abstractC885530YoZLIZIZ).getKey().getConversationId());
            } else if (abstractC885530YoZLIZIZ instanceof C886410Ypz) {
                linkedHashSet.addAll(((C886410Ypz) abstractC885530YoZLIZIZ).getConversations());
            }
        }
        return C13LP.LLIIII(linkedHashSet);
    }

    public static C878960Ydy LJ(EnumC880520YgU enumC880520YgU) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        switch (C880660Ygi.LIZ[enumC880520YgU.ordinal()]) {
            case 1:
            case 2:
                return new C878960Ydy(new C880430YgL(enumC880520YgU, C1697810uHb.LJIIJJI(Collections.singletonList(EnumC880570YgZ.ALL_BUSINESS), Collections.singletonList(EnumC880570YgZ.ALL_FOLLOWER), Collections.singletonList(EnumC880570YgZ.ALL_OTHER))), enumC880520YgU, (EnumC877640Ybq) null, jElapsedRealtime, 9);
            case 3:
                return new C878960Ydy(new C880430YgL(enumC880520YgU, C1697810uHb.LJIIJJI(Collections.singletonList(EnumC880570YgZ.ALL_BUSINESS), Collections.singletonList(EnumC880570YgZ.ALL_OTHER))), enumC880520YgU, (EnumC877640Ybq) null, jElapsedRealtime, 9);
            case 4:
                return new C878960Ydy(new C880430YgL(enumC880520YgU, C1697810uHb.LJIIJJI(Collections.singletonList(EnumC880570YgZ.ALL_CREATORS), Collections.singletonList(EnumC880570YgZ.ALL_OTHER))), enumC880520YgU, (EnumC877640Ybq) null, jElapsedRealtime, 9);
            case 5:
                return new C878960Ydy(new C880430YgL(enumC880520YgU, C1697810uHb.LJIIJJI(Collections.singletonList(EnumC880570YgZ.ALL_FOLLOWER), Collections.singletonList(EnumC880570YgZ.ALL_OTHER))), enumC880520YgU, (EnumC877640Ybq) null, jElapsedRealtime, 9);
            case 6:
                return new C878960Ydy(new C880430YgL(enumC880520YgU, null, 2, null), enumC880520YgU, (EnumC877640Ybq) null, jElapsedRealtime, 9);
            default:
                return new C878960Ydy(new C880430YgL(enumC880520YgU, null, 2, null), enumC880520YgU, (EnumC877640Ybq) null, jElapsedRealtime, 9);
        }
    }

    public static C885030Ynl LIZIZ(C878960Ydy c878960Ydy, C0YUD c0yud, Set set) {
        int i;
        boolean z;
        Set set2 = set;
        if (c878960Ydy.LLILLL == EnumC880520YgU.PRIORITY) {
            if (C612090Nzb.LIZ()) {
                i = C877780Yc4.LIZ().priorityMaxCellCountNew;
            } else {
                i = C877780Yc4.LIZ().priorityLimitSize;
            }
        } else {
            i = 20;
        }
        boolean zLIZIZ = C880690Ygl.LIZIZ(c878960Ydy.LLILLL);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C878590YdN.class);
        if (!zLIZIZ) {
            set2 = null;
        }
        C877540Ybg c877540Ybg = new C877540Ybg(c878960Ydy, i, c0yud, set2);
        if (zLIZIZ && C0CYO.LIZJ.LJIIIIZZ()) {
            z = true;
        } else {
            z = false;
        }
        c877540Ybg.LJI = z;
        List listSingletonList = Collections.singletonList(new Pair(c19719912DlLIZ, c877540Ybg));
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(C13LE.LIZ(C1718506oB.class), C13LE.LIZ(C880890Yh5.class));
        if (c878960Ydy.LLILLL == EnumC880520YgU.ALL_WITHOUT_STORY_REACTIONS) {
            listLJIILJJIL.add(C13LE.LIZ(C880930Yh9.class));
        }
        if (C1689706jX.LIZ()) {
            listLJIILJJIL.add(C13LE.LIZ(C881970Yip.class));
        }
        Pair pair = new Pair(C13LE.LIZ(C880530YgV.class), new C879740YfE(c878960Ydy, c878960Ydy.LLILLJJLI));
        List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(C13LE.LIZ(C879470Yen.class), C13LE.LIZ(C881250Yhf.class), C13LE.LIZ(C879610Yf1.class), C13LE.LIZ(C879600Yf0.class), C13LE.LIZ(C879550Yev.class), C13LE.LIZ(C880440YgM.class));
        if (C1689706jX.LIZ()) {
            listLJIILJJIL2.add(C13LE.LIZ(C882050Yix.class));
        }
        return new C885030Ynl(c878960Ydy, listSingletonList, listLJIILJJIL, pair, listLJIILJJIL2, C1697810uHb.LJIIJJI(C13LE.LIZ(C886460Yq4.class), C13LE.LIZ(C886450Yq3.class)), new C884380Ymi(false, LIZIZ, null, null, i, 0, false, null, 986));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ(java.util.List r10, java.util.List r11, X.EnumC880850Yh1 r12, java.lang.String r13, boolean r14, kotlin.jvm.functions.Function0 r15) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C880790Ygv.LIZ(java.util.List, java.util.List, X.0Yh1, java.lang.String, boolean, kotlin.jvm.functions.Function0):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    public static List LIZJ(boolean z, boolean z2, C878960Ydy c878960Ydy, List list, List list2, List list3, C0YUD c0yud) {
        ?? arrayList;
        List listLIZLLL;
        ?? arrayList2;
        ?? arrayList3;
        if (!z && !z2) {
            if (list != null) {
                arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.LJFF(((AbstractC885540Yoa) obj).LIZLLL(), Boolean.TRUE)) {
                        arrayList2.add(obj);
                    }
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            ArrayList arrayList4 = new ArrayList((Collection) arrayList2);
            if (list2 != null) {
                arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    if (Intrinsics.LJFF(((AbstractC885540Yoa) obj2).LIZLLL(), Boolean.TRUE)) {
                        arrayList3.add(obj2);
                    }
                }
            } else {
                arrayList3 = C13BV.INSTANCE;
            }
            arrayList4.addAll(arrayList3);
            return LIZLLL(arrayList4);
        }
        if (c878960Ydy != null) {
            EnumC880520YgU enumC880520YgU = c878960Ydy.LLILLL;
            if (enumC880520YgU != null && C880690Ygl.LIZIZ(enumC880520YgU) && C880530YgV.LIZ.containsAll(C15438062q.LJIJJLI(c878960Ydy.LLILLJJLI.getFilterOptions()))) {
                arrayList = c0yud.LIZLLL();
            } else {
                C880430YgL c880430YgL = c878960Ydy.LLILLJJLI;
                if (c880430YgL != null) {
                    List<String> listLIZLLL2 = c0yud.LIZLLL();
                    arrayList = new ArrayList();
                    for (String str : listLIZLLL2) {
                        C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str);
                        Set<EnumC880570YgZ> set = C880530YgV.LIZ;
                        if (C880380YgG.LIZ(c880430YgL, c0y8tLJIL, null, 12)) {
                            arrayList.add(str);
                        }
                    }
                }
            }
            if (z) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : (ArrayList) list3) {
                    if (Intrinsics.LJFF(((AbstractC885540Yoa) obj3).LIZLLL(), Boolean.FALSE)) {
                        arrayList5.add(obj3);
                    }
                }
                listLIZLLL = LIZLLL(arrayList5);
            } else {
                listLIZLLL = C13BV.INSTANCE;
            }
            if (!listLIZLLL.isEmpty()) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (!listLIZLLL.contains(obj4)) {
                        arrayList6.add(obj4);
                    }
                }
                return arrayList6;
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
