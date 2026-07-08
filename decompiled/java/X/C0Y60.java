package X;

import Y.ARunnableS19S1100000_14;
import Y.ARunnableS47S0300000_14;
import Y.ARunnableS83S0200000_14;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.AwS101S0110000_14;
import kotlin.jvm.internal.AwS28S0001000_14;

/* JADX INFO: renamed from: X.0Y60, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y60 implements InterfaceC866720XzK, C0Y1U {
    public long LJIIJ;
    public long LJIIJJI;
    public final C0YEM LJIILIIL;
    public final C0Y9J LJIILJJIL;
    public final Map<String, C0Y8T> LIZ = new ConcurrentHashMap();
    public final Lock LIZIZ = new ReentrantLock();
    public final Map<String, C0Y8T> LIZJ = new ConcurrentHashMap();
    public final Set<String> LIZLLL = new CopyOnWriteArraySet();
    public final Set<String> LJ = new CopyOnWriteArraySet();
    public final Set<InterfaceC867280Y0o> LJFF = new CopyOnWriteArraySet();
    public final Map<String, Object> LJI = new ConcurrentHashMap();
    public final Object LJII = new Object();
    public boolean LJIIIIZZ = false;
    public final Set<C0Y6L> LJIIIZ = new CopyOnWriteArraySet();
    public final C0Y69 LJIIL = new C0Y69(this);

    @Override // X.C0Y1U
    public final List<C0Y8T> LIZIZ() {
        this.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel getAllConversationSync");
        List<C0Y8T> listLJLI = LJLI();
        if (((ArrayList) listLJLI).size() > 0) {
            LJLJJI(listLJLI);
        }
        return listLJLI;
    }

    @Override // X.InterfaceC866720XzK
    public final List<C0YAE> LIZLLL() {
        return this.LJIILJJIL.LJIILIIL().LIZLLL();
    }

    @Override // X.InterfaceC866720XzK
    public final C878750Ydd LJIILJJIL() {
        long jLJIJJ = this.LJIILJJIL.LJIIJJI().LJIJJ();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (C0Y8T c0y8t : (List) this.LJIILJJIL.LJIIJJI().LJIILIIL(this.LJIILIIL.LJIIIZ().LJIJJLI.LIZLLL()).LIZ(Collections.emptyList())) {
            if (c0y8t.isGroupChat()) {
                i5++;
                if (c0y8t.isRisky()) {
                    i7++;
                } else if (c0y8t.getLastShowMessage() == null) {
                    if (c0y8t.getMinIndex() == 0) {
                        i6++;
                    } else {
                        i8++;
                    }
                }
            } else {
                i++;
                if (c0y8t.isRisky()) {
                    i3++;
                } else if (c0y8t.getLastShowMessage() == null) {
                    if (c0y8t.getMinIndex() == 0) {
                        i2++;
                    } else {
                        i4++;
                    }
                }
            }
        }
        return new C878750Ydd(i, i2, i3, i4, i5, i6, i7, i8, (int) ((jLJIJJ - ((long) i)) - ((long) i5)));
    }

    @Override // X.InterfaceC866720XzK
    public final long LJIILL() {
        return this.LJIILJJIL.LJIIJJI().LJIJJ();
    }

    @Override // X.InterfaceC866720XzK
    public final List<C0Y8T> LJJJJLL() {
        return (List) this.LJIILJJIL.LJIIJJI().LJIIJ(AbstractC1711506n3.LIZIZ).LIZ(Collections.emptyList());
    }

    @Override // X.InterfaceC866720XzK
    public final List<C0Y8T> LJJLIIIJLJLI() {
        this.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel getGroupConversationSync");
        ArrayList arrayList = new ArrayList();
        this.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel getAllConversationSyncNoSort");
        for (C0Y8T c0y8t : (ArrayList) LJLI()) {
            if (c0y8t != null && c0y8t.isGroupChat()) {
                arrayList.add(c0y8t);
            }
        }
        if (arrayList.size() > 0) {
            LJLJJI(arrayList);
        }
        return arrayList;
    }

    public final List<C0Y8T> LJLI() {
        ArrayList arrayList = new ArrayList();
        for (C0Y8T c0y8t : ((ConcurrentHashMap) this.LIZ).values()) {
            if (!c0y8t.isHide()) {
                arrayList.add(c0y8t);
            }
        }
        C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationListModel filterShowList:");
        sbLIZ.append(arrayList.size());
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        return arrayList;
    }

    @Override // X.C0Y1U
    public final void clear() {
        this.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel clear");
        LJJLL(new Runnable() { // from class: X.0Y67
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DefaultConversationListModel@a5c5.clear$1");
                try {
                    ((ConcurrentHashMap) this.LL.LIZ).clear();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DefaultConversationListModel@a5c5.clear$1");
            }
        });
        ((ConcurrentHashMap) this.LIZJ).clear();
        ((ConcurrentHashMap) this.LJI).clear();
        this.LJIIIIZZ = false;
        C868740Y6e c868740Y6eLIZIZ = this.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ();
        ((ConcurrentHashMap) c868740Y6eLIZIZ.LIZ).clear();
        ((ConcurrentHashMap) c868740Y6eLIZIZ.LIZIZ).clear();
    }

    @Override // X.InterfaceC866720XzK
    public final Map<String, C0Y8T> LJJIIZI() {
        return this.LIZ;
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y8T LIZ(String str) {
        if (str == null) {
            return null;
        }
        C0Y8T c0y8t = (C0Y8T) ((ConcurrentHashMap) this.LIZ).get(str);
        if (c0y8t == null) {
            return this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LIZ(str);
        }
        return c0y8t;
    }

    @Override // X.InterfaceC866720XzK
    public final void LIZJ(final String str) {
        if (this.LJIILIIL.LJIIIZ().LJJLIIIIJ.LJJII) {
            this.LJIILIIL.LJIIZILJ().getDomain().LIZJ().LJLLILLLL(null, str);
            return;
        }
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        final C864870XwL c864870XwL = new C864870XwL(c0yem);
        c0yem.LJIIJJI().LIZJ(new InterfaceC872410YKh<C0Y8T>() { // from class: X.0Xvf
            @Override // X.InterfaceC872410YKh
            public final C0Y8T LIZ() throws Throwable {
                C0Y8T c0y8tLIZ = c864870XwL.LIZLLL.LJIIJJI().LIZ(str, false);
                if (c0y8tLIZ == null) {
                    c864870XwL.LJIILJJIL(-1, str);
                    c864870XwL.LJIILL(EnumC864390XvZ.ERROR, -1017, str, -1, "");
                    return null;
                }
                if (C864870XwL.LJIILLIIL(c0y8tLIZ, c864870XwL.LIZJ)) {
                    return null;
                }
                c864870XwL.LJIILJJIL(c0y8tLIZ.getConversationType(), str);
                List listLJI = C0Y2U.LJI(c864870XwL.LIZJ, Arrays.asList(c0y8tLIZ));
                if (((ArrayList) listLJI).isEmpty()) {
                    c864870XwL.LJIILL(EnumC864390XvZ.ERROR, -1036, str, c0y8tLIZ.getConversationType(), "");
                    return null;
                }
                C0Y8T c0y8t = (C0Y8T) ((Pair) ListProtector.get(listLJI, 0)).getFirst();
                int iIntValue = ((Integer) ((Pair) ((Pair) ListProtector.get(listLJI, 0)).getSecond()).getFirst()).intValue();
                AbstractC864890XwN abstractC864890XwN = (AbstractC864890XwN) ((Pair) ((Pair) ListProtector.get(listLJI, 0)).getSecond()).getSecond();
                C864870XwL.LJIILIIL(c864870XwL.LIZJ, c0y8t);
                c864870XwL.LJIIJJI(c0y8tLIZ.getInboxType(), C864870XwL.LJIIL(c864870XwL.LIZJ, c0y8t, abstractC864890XwN, Boolean.FALSE, iIntValue), str, c0y8tLIZ.getConversationType());
                return c0y8t;
            }
        }, new C914010ZtP(10), false, c0yem.LJIIL().LIZJ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJFF(String str) {
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        new C867450Y1f(c870180YBsLIZ.LLILLL).LJIILIIL(str);
    }

    @Override // X.C0Y1U
    public final void LJI(final C0Y8T c0y8t) {
        if (c0y8t != null) {
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel onLeaveConversation:");
            sbLIZ.append(c0y8t.getConversationId());
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            C868200Y4c c868200Y4c = this.LJIILIIL.LJIIZILJ().getDomain().LIZ;
            c868200Y4c.getClass();
            if (!TextUtils.isEmpty(c0y8t.getConversationId())) {
                c868200Y4c.LJIILL(c0y8t.getConversationId(), new InterfaceC864490Xvj<InterfaceC868050Y3n>() { // from class: X.0Y6G
                    @Override // X.InterfaceC864490Xvj
                    public final void invoke(InterfaceC868050Y3n interfaceC868050Y3n) {
                        interfaceC868050Y3n.LJZI(c0y8t);
                    }
                });
            }
            Iterator it2 = ((CopyOnWriteArraySet) this.LJFF).iterator();
            while (it2.hasNext()) {
                ((InterfaceC868050Y3n) it2.next()).LJZI(c0y8t);
            }
            C868740Y6e c868740Y6eLIZIZ = this.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ();
            c868740Y6eLIZIZ.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(c0y8t);
            c868740Y6eLIZIZ.LIZLLL(arrayList, true, false);
        }
    }

    @Override // X.C0Y1U
    public final void LJIIIIZZ(final boolean z) {
        String str;
        final boolean zLIZLLL = this.LJIILIIL.LJIIIZ().LJIJJLI.LIZLLL();
        if (this.LJIILIIL.LJIIIZ().LJJII && this.LJIILIIL.LJIIZILJ().LIZIZ().LIZJ().LJJJLIIL()) {
            if (this.LJIILIIL.LJIIIZ().LJIJJLI.LJI()) {
                str = "preload_all";
            } else {
                str = "preload_light";
            }
            this.LJIILIIL.LJIIIZ().getClass();
            LJLIL(z, false, str, null, zLIZLLL);
            return;
        }
        this.LJIILIIL.LJIIIZ().getClass();
        final C873950YQf c873950YQf = null;
        final long jUptimeMillis = SystemClock.uptimeMillis();
        if (((ConcurrentHashMap) this.LJI).containsKey("legacy")) {
            this.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel async, already isSyncing");
            return;
        }
        ((ConcurrentHashMap) this.LJI).put("preload", this.LJII);
        this.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel start async");
        this.LJIILIIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<List<C0Y8T>>() { // from class: X.0Y62
            @Override // X.InterfaceC872410YKh
            public final List<C0Y8T> LIZ() {
                C0Y60 c0y60 = this.LJ;
                C873950YQf c873950YQf2 = c873950YQf;
                boolean z2 = zLIZLLL;
                c0y60.getClass();
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                List<C0Y8T> listLIZ = c0y60.LJIILJJIL.LJIIJJI().LJIIL(c873950YQf2, z2).LIZ(Collections.emptyList());
                C868740Y6e c868740Y6eLIZIZ = c0y60.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ();
                c868740Y6eLIZIZ.LIZLLL(listLIZ, false, true);
                c868740Y6eLIZIZ.LJ.LJIIIZ().getClass();
                c0y60.LJIIJ = SystemClock.uptimeMillis() - jUptimeMillis2;
                int i = c0y60.LJIILIIL.LJIIIZ().LJIJJ;
                C868780Y6i c868780Y6iLIZLLL = c0y60.LJIILIIL.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ConversationListModel syncConversionList, totalCount:");
                sbLIZ.append(listLIZ == null ? null : Integer.valueOf(listLIZ.size()));
                sbLIZ.append(", limit:");
                sbLIZ.append(i);
                c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                if (listLIZ == null || listLIZ.isEmpty()) {
                    listLIZ = null;
                } else {
                    if (i > 0 && listLIZ.size() > i) {
                        c0y60.LJLJJI(listLIZ);
                        listLIZ = listLIZ.subList(0, i);
                    }
                    c0y60.LJLJJL(listLIZ);
                }
                C0YLE c0yle = this.LJ.LJIILIIL.LJIIZILJ().getDomain().LIZJ;
                C0YLC c0ylc = C0YLC.LOAD_CONV_LIST;
                c0yle.LIZ(c0ylc);
                if (c0yle.LIZLLL(c0ylc)) {
                    return null;
                }
                this.LJ.LJIILIIL.LJIIZILJ().LJFF().LIZ().LIZLLL(false, listLIZ == null ? -1 : listLIZ.size(), z, listLIZ != null, SystemClock.uptimeMillis() - jUptimeMillis, this.LJ.LJIIJ, 0L, 0, "");
                if (!((CopyOnWriteArraySet) this.LJ.LJFF).isEmpty()) {
                    this.LJ.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel async onCallback");
                    Iterator it2 = ((CopyOnWriteArraySet) this.LJ.LJFF).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC867280Y0o) it2.next()).LLLIZZ(this.LJ.LIZ);
                    }
                }
                this.LJ.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ().LJ();
                this.LJ.LJIILIIL.LJIIZILJ().LIZ().LIZIZ().LLLIIII();
                return listLIZ;
            }
        }, new C914030ZtR(this, 7), false, this.LJIILIIL.LJIIL().LIZJ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJIIJ(boolean z) {
        String str;
        boolean zLIZLLL = this.LJIILIIL.LJIIIZ().LJIJJLI.LIZLLL();
        if (!z && !this.LJIILIIL.LJIIIZ().LJIJJLI.LJI()) {
            str = "preload_light";
        } else {
            str = "preload_all";
        }
        this.LJIILIIL.LJIIIZ().getClass();
        LJLIL(false, true, str, null, zLIZLLL);
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y6Q<C867240Y0k> LJIIJJI(C869710Y9x c869710Y9x) {
        boolean z;
        long sortOrder;
        C0Y6Q<List<C0Y8T>> c0y6qLJJIZ = this.LJIILJJIL.LJIIJJI().LJJIZ(c869710Y9x);
        C0YPQ c0ypq = c0y6qLJJIZ.LIZIZ;
        if (c0ypq != null) {
            return C865670Xxd.LIZ(c0ypq.getCode(), c0y6qLJJIZ.LIZIZ.getMessage());
        }
        List<C0Y8T> list = c0y6qLJJIZ.LIZ;
        this.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ().LIZLLL(list, false, false);
        if (c869710Y9x.LIZJ != -1 && list.size() >= c869710Y9x.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        if (!list.isEmpty()) {
            sortOrder = ((C0Y8T) ListProtector.get(list, list.size() - 1)).getSortOrder();
        } else {
            sortOrder = Long.MAX_VALUE;
        }
        return C865670Xxd.LIZJ(new C867240Y0k(c869710Y9x, list, z, sortOrder));
    }

    @Override // X.InterfaceC866720XzK
    public final void LJIIL(C0Y6L c0y6l) {
        if (c0y6l != null) {
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel removePageObserver:");
            sbLIZ.append(c0y6l);
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            ((CopyOnWriteArraySet) this.LJIIIZ).remove(c0y6l);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y8T LJIILIIL(long j) {
        if (j <= 0) {
            return null;
        }
        Iterator it2 = ((ConcurrentHashMap) this.LIZ).keySet().iterator();
        while (it2.hasNext()) {
            C0Y8T c0y8t = (C0Y8T) ((ConcurrentHashMap) this.LIZ).get(it2.next());
            if (c0y8t != null && c0y8t.getConversationShortId() == j) {
                return c0y8t;
            }
        }
        C0Y8T c0y8tLJIILIIL = this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIILIIL(j);
        if (c0y8tLJIILIIL == null) {
            return null;
        }
        return c0y8tLJIILIIL;
    }

    @Override // X.InterfaceC866720XzK
    public final void LJIILLIIL(InterfaceC868750Y6f interfaceC868750Y6f) {
        this.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ().LIZJ = interfaceC868750Y6f;
    }

    @Override // X.InterfaceC866720XzK
    public final List<C0Y8T> LJIJJ(List<String> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : list) {
            C0Y8T c0y8tLIZ = LIZ(str);
            if (c0y8tLIZ != null) {
                arrayList.add(c0y8tLIZ);
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(this.LJIILJJIL.LJIIJJI().LJIJJLI(arrayList2));
        }
        return arrayList;
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y8T LJIL(String str) {
        this.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel getConversation async");
        C0Y8T c0y8tLIZ = LIZ(str);
        if (c0y8tLIZ != null) {
            return c0y8tLIZ;
        }
        C0Y8T c0y8tLIZ2 = this.LJIILJJIL.LJIIJJI().LIZ(str, true);
        if (c0y8tLIZ2 != null) {
            if (this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIILLIIL(c0y8tLIZ2)) {
                this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIIJ(c0y8tLIZ2);
            } else {
                LJLIIIL(c0y8tLIZ2);
                return c0y8tLIZ2;
            }
        }
        return c0y8tLIZ2;
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJIFFI(C0Y6L c0y6l) {
        if (c0y6l != null) {
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel addPageObserver:");
            sbLIZ.append(c0y6l);
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            ((CopyOnWriteArraySet) this.LJIIIZ).add(c0y6l);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJII(InterfaceC867280Y0o interfaceC867280Y0o) {
        if (interfaceC867280Y0o != null) {
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel removeObserver:");
            sbLIZ.append(interfaceC867280Y0o);
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            ((CopyOnWriteArraySet) this.LJFF).remove(interfaceC867280Y0o);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final boolean LJJIII(Map<String, String> map) {
        C869250Y8d c869250Y8dLIZ = this.LJIILJJIL.LIZ();
        c869250Y8dLIZ.getClass();
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update conversation_setting set ");
        sbLIZ.append(EnumC869340Y8m.COLUMN_CONVERSATION_TAGS.key);
        sbLIZ.append(" =  case ");
        StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getKey() != null && !((String) entry.getKey()).isEmpty() && entry.getValue() != null) {
                arrayList.add(entry.getKey());
                sb.append(" when ");
                sb.append(EnumC869340Y8m.COLUMN_ID.key);
                sb.append(" = '");
                sb.append((String) entry.getKey());
                sb.append("' then '");
                sb.append((String) entry.getValue());
                sb.append("'");
            }
        }
        boolean zLIZLLL = false;
        if (!arrayList.isEmpty()) {
            sb.append(" end where ");
            sb.append(EnumC869340Y8m.COLUMN_ID.key);
            sb.append(" in (");
            for (int i = 0; i < arrayList.size(); i++) {
                if (i == 0) {
                    sb.append("'");
                    sb.append((String) ListProtector.get(arrayList, i));
                    sb.append("'");
                } else {
                    sb.append(",'");
                    sb.append((String) ListProtector.get(arrayList, i));
                    sb.append("'");
                }
            }
            sb.append(")");
            try {
                zLIZLLL = c869250Y8dLIZ.LIZJ.getProxy().LIZLLL(sb.toString(), "updateConversationTags");
                if (zLIZLLL) {
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        C0Y8T c0y8t = (C0Y8T) ((ConcurrentHashMap) this.LIZ).get(entry2.getKey());
                        if (c0y8t != null && c0y8t.getSettingInfo() != null) {
                            c0y8t.getSettingInfo().setConversationTagsStr((String) entry2.getValue());
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c869250Y8dLIZ.LIZ.LIZLLL().LJIIIZ("IMConversationSettingDao updateConversationTags", e);
                c869250Y8dLIZ.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
        }
        return zLIZLLL;
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJIIZ(String str) {
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.LIZLLL().LIZLLL().LIZ().LJJLIL(str, new C914150Ztd(c870180YBsLIZ, 17));
    }

    @Override // X.C0Y1U
    public final void LJJIJIIJI(List<C0Y8T> list) {
        int i = this.LJIILIIL.LJIIIZ().LJIJJ;
        C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationListModel handlerInitConversionList, totalCount:");
        sbLIZ.append(Integer.valueOf(((ArrayList) list).size()));
        sbLIZ.append(", limit:");
        sbLIZ.append(i);
        c868780Y6iLIZLLL.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            LJJJJJ(false, 11, (C0Y8T[]) arrayList.toArray(new C0Y8T[arrayList.size()]));
        }
    }

    @Override // X.C0Y1U
    public final void LJJIJIIJIL(String str) {
        ((CopyOnWriteArraySet) this.LIZLLL).add(str);
        ((CopyOnWriteArraySet) this.LJ).add(str);
    }

    @Override // X.C0Y1U
    public final void LJJIJL(final C0Y8T c0y8t) {
        if (c0y8t != null) {
            boolean zLJIILLIIL = this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIILLIIL(c0y8t);
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel onCreateConversation:");
            sbLIZ.append(c0y8t.getConversationId());
            sbLIZ.append(", isMessageRequestConv:");
            sbLIZ.append(zLJIILLIIL);
            sbLIZ.append(", isInBox:");
            sbLIZ.append(c0y8t.isInBox());
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            if (zLJIILLIIL) {
                LJLJI(c0y8t.getConversationId());
                this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIIJ(c0y8t);
                return;
            }
            LJLIIIL(c0y8t);
            C868200Y4c c868200Y4c = this.LJIILIIL.LJIIZILJ().getDomain().LIZ;
            c868200Y4c.getClass();
            if (!TextUtils.isEmpty(c0y8t.getConversationId())) {
                c868200Y4c.LJIILL(c0y8t.getConversationId(), new InterfaceC864490Xvj<InterfaceC868050Y3n>() { // from class: X.0Y6E
                    @Override // X.InterfaceC864490Xvj
                    public final void invoke(InterfaceC868050Y3n interfaceC868050Y3n) {
                        interfaceC868050Y3n.LJLILLLLZI(c0y8t);
                    }
                });
            }
            Iterator it2 = ((CopyOnWriteArraySet) this.LJFF).iterator();
            while (it2.hasNext()) {
                ((InterfaceC868050Y3n) it2.next()).LJLILLLLZI(c0y8t);
            }
        }
    }

    @Override // X.C0Y1U
    public final boolean LJJIJLIJ(String str) {
        if (!TextUtils.isEmpty(str) && ((CopyOnWriteArraySet) this.LIZLLL).contains(str)) {
            return true;
        }
        return false;
    }

    @Override // X.C0Y1U
    public final void LJJIL(C0Y8T c0y8t) {
        if (c0y8t != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c0y8t.getConversationId());
            LJJLJLI(arrayList, Boolean.valueOf(this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIILLIIL(c0y8t)).booleanValue());
        }
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y6Q<C867250Y0l> LJJIZ(C869710Y9x c869710Y9x) {
        C0Y6Q<List<C1279304zX>> c0y6qLJJIL = this.LJIILJJIL.LJIIJJI().LJJIL(c869710Y9x);
        C0YPQ c0ypq = c0y6qLJJIL.LIZIZ;
        if (c0ypq == null) {
            List<C1279304zX> list = c0y6qLJJIL.LIZ;
            boolean z = false;
            if (c869710Y9x.LIZJ != -1 && list.size() >= c869710Y9x.LIZJ) {
                z = true;
            }
            return C865670Xxd.LIZJ(new C867250Y0l(c869710Y9x, list, z, Long.MAX_VALUE));
        }
        return C865670Xxd.LIZIZ(c0ypq);
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJ(List<String> list) {
        this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJFF(list);
    }

    @Override // X.C0Y1U
    public final void LJJJI(String str) {
        ((CopyOnWriteArraySet) this.LIZLLL).add(str);
    }

    @Override // X.C0Y1U
    public final void LJJJIL(String str) {
        ((CopyOnWriteArraySet) this.LIZLLL).remove(str);
    }

    @Override // X.C0Y1U
    public final boolean LJJJJI(String str) {
        if (!TextUtils.isEmpty(str) && ((CopyOnWriteArraySet) this.LJ).contains(str)) {
            return true;
        }
        return false;
    }

    @Override // X.C0Y1U
    public final void LJJJJL(final List<C0YAE> list) {
        if (!list.isEmpty()) {
            C868200Y4c c868200Y4c = this.LJIILIIL.LJIIZILJ().getDomain().LIZ;
            c868200Y4c.getClass();
            if (!list.isEmpty()) {
                c868200Y4c.LJIILL(((C0YAE) ListProtector.get(list, 0)).getConversationId(), new InterfaceC864490Xvj<InterfaceC868050Y3n>() { // from class: X.0Y6K
                    @Override // X.InterfaceC864490Xvj
                    public final void invoke(InterfaceC868050Y3n interfaceC868050Y3n) {
                        interfaceC868050Y3n.LJJLJLI(list);
                    }
                });
            }
            Iterator it2 = ((CopyOnWriteArraySet) this.LJFF).iterator();
            while (it2.hasNext()) {
                ((InterfaceC868050Y3n) it2.next()).LJJLJLI(list);
            }
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJLL(InterfaceC863600XuI interfaceC863600XuI) {
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        final C867450Y1f c867450Y1f = new C867450Y1f(c0yem, interfaceC863600XuI);
        if (c0yem.LJIIIZ().LJJLIIIIJ.LJIJJLI) {
            c0yem.LJIIL().LIZIZ().execute(new Runnable() { // from class: X.0Y1h
                public final /* synthetic */ long LLILLJJLI = 0;

                @Override // java.lang.Runnable
                public final void run() {
                    C867450Y1f c867450Y1f2 = c867450Y1f;
                    long j = this.LLILLJJLI;
                    c867450Y1f2.getClass();
                    C1C7U.LIZ("GetConversationInfoHandler@b454.getByShortId$1L");
                    c867450Y1f2.LJIILL(j);
                    C1C7U.LIZIZ("GetConversationInfoHandler@b454.getByShortId$1L");
                }
            });
        } else {
            c867450Y1f.LJIILL(0L);
        }
    }

    @Override // X.C0Y1U
    public final void LJJJLZIJ(String str) {
        ((CopyOnWriteArraySet) this.LIZLLL).remove(str);
        ((CopyOnWriteArraySet) this.LJ).remove(str);
    }

    @Override // X.C0Y1U
    public final void LJJJZ(final List<C0YAE> list) {
        if (list != null && !list.isEmpty()) {
            C868200Y4c c868200Y4c = this.LJIILIIL.LJIIZILJ().getDomain().LIZ;
            c868200Y4c.getClass();
            if (!list.isEmpty()) {
                c868200Y4c.LJIILL(((C0YAE) ListProtector.get(list, 0)).getConversationId(), new InterfaceC864490Xvj<InterfaceC868050Y3n>() { // from class: X.0Y6I
                    @Override // X.InterfaceC864490Xvj
                    public final void invoke(InterfaceC868050Y3n interfaceC868050Y3n) {
                        interfaceC868050Y3n.LJJZZI(list);
                    }
                });
            }
            Iterator it2 = ((CopyOnWriteArraySet) this.LJFF).iterator();
            while (it2.hasNext()) {
                ((InterfaceC868050Y3n) it2.next()).LJJZZI(list);
            }
        }
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y8T LJJLIIIIJ(String str) {
        this.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel getConversationFromDBSync");
        C0Y8T c0y8tLIZ = this.LJIILJJIL.LJIIJJI().LIZ(str, true);
        if (c0y8tLIZ != null) {
            if (this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIILLIIL(c0y8tLIZ)) {
                this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIIJ(c0y8tLIZ);
            } else {
                LJLIIIL(c0y8tLIZ);
                return c0y8tLIZ;
            }
        }
        return c0y8tLIZ;
    }

    @Override // X.C0Y1U
    public final void LJJLIIIJ(final C0Y8T c0y8t) {
        if (c0y8t != null) {
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel onDissolveConversation:");
            sbLIZ.append(c0y8t.getConversationId());
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            LJJLL(new ARunnableS83S0200000_14(c0y8t, this, 4));
            C868200Y4c c868200Y4c = this.LJIILIIL.LJIIZILJ().getDomain().LIZ;
            c868200Y4c.getClass();
            if (!TextUtils.isEmpty(c0y8t.getConversationId())) {
                c868200Y4c.LJIILL(c0y8t.getConversationId(), new InterfaceC864490Xvj<InterfaceC868050Y3n>() { // from class: X.0Y6F
                    @Override // X.InterfaceC864490Xvj
                    public final void invoke(InterfaceC868050Y3n interfaceC868050Y3n) {
                        interfaceC868050Y3n.LJJJJJL(c0y8t);
                    }
                });
            }
            Iterator it2 = ((CopyOnWriteArraySet) this.LJFF).iterator();
            while (it2.hasNext()) {
                ((InterfaceC868050Y3n) it2.next()).LJJJJJL(c0y8t);
            }
            C868740Y6e c868740Y6eLIZIZ = this.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ();
            InterfaceC868750Y6f interfaceC868750Y6f = c868740Y6eLIZIZ.LIZJ;
            if (interfaceC868750Y6f != null) {
                interfaceC868750Y6f.LIZLLL();
                return;
            }
            ((ConcurrentHashMap) c868740Y6eLIZIZ.LIZ).remove(c0y8t.getConversationId());
            ((ConcurrentHashMap) c868740Y6eLIZIZ.LIZIZ).remove(c0y8t.getConversationId());
            c868740Y6eLIZIZ.LJ();
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJLIIIJILLIZJL(InterfaceC867280Y0o interfaceC867280Y0o) {
        if (interfaceC867280Y0o != null) {
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel addObserver:");
            sbLIZ.append(interfaceC867280Y0o);
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            ((CopyOnWriteArraySet) this.LJFF).add(interfaceC867280Y0o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009b A[LOOP:0: B:15:0x0095->B:17:0x009b, LOOP_END] */
    @Override // X.C0Y1U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJJIZ(final X.C1711306n1 r6) {
        /*
            r5 = this;
            X.0Y8T r2 = r6.LIZIZ
            if (r2 == 0) goto L6b
            X.0YEM r0 = r5.LJIILIIL
            X.0XwD r0 = r0.LJIIZILJ()
            X.0Y5r r0 = r0.LIZLLL()
            X.0Y66 r0 = r0.LJI()
            boolean r4 = r0.LJIILLIIL(r2)
            X.0YEM r0 = r5.LJIILIIL
            X.0Y6i r3 = r0.LIZLLL()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ConversationListModel onSyncConversation:"
            r1.append(r0)
            java.lang.String r0 = r2.getConversationId()
            r1.append(r0)
            java.lang.String r0 = ", isMessageRequestConv:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", isInBox:"
            r1.append(r0)
            boolean r0 = r2.isInBox()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r3.LJIIJJI(r0)
            if (r4 == 0) goto L62
            java.lang.String r0 = r2.getConversationId()
            r5.LJLJI(r0)
            X.0YEM r0 = r5.LJIILIIL
            X.0XwD r0 = r0.LJIIZILJ()
            X.0Y5r r0 = r0.LIZLLL()
            X.0Y66 r0 = r0.LJI()
            r0.LJIIJ(r2)
            return
        L62:
            r0 = 1
            X.0Y8T[] r1 = new X.C0Y8T[r0]
            r0 = 0
            r1[r0] = r2
            r5.LJLIIIL(r1)
        L6b:
            X.0YEM r0 = r5.LJIILIIL
            X.0XwD r0 = r0.LJIIZILJ()
            X.0Y52 r0 = r0.getDomain()
            X.0Y4c r2 = r0.LIZ
            r2.getClass()
            X.0Y8T r0 = r6.LIZIZ
            if (r0 != 0) goto La5
            X.0YMW r0 = r6.LIZJ
            if (r0 != 0) goto Laa
            X.0YEM r0 = r2.LJIILJJIL
            X.0Y6i r1 = r0.LIZLLL()
            java.lang.String r0 = "conv is null and error is null, not allowed"
            r1.LJI(r0)
        L8d:
            java.util.Set<X.0Y0o> r0 = r5.LJFF
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            java.util.Iterator r1 = r0.iterator()
        L95:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r1.next()
            X.0Y3n r0 = (X.InterfaceC868050Y3n) r0
            r0.LJLL(r6)
            goto L95
        La5:
            java.lang.String r1 = r0.getConversationId()
            goto Lb2
        Laa:
            java.lang.Long r0 = r6.LIZ
            if (r0 == 0) goto Lbb
            java.lang.String r1 = java.lang.String.valueOf(r0)
        Lb2:
            X.0Y6D r0 = new X.0Y6D
            r0.<init>()
            r2.LJIILL(r1, r0)
            goto L8d
        Lbb:
            java.lang.String r1 = ""
            goto Lb2
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y60.LJJLIIIJJIZ(X.06n1):void");
    }

    @Override // X.C0Y1U
    public final void LJJLIIIJL(C0Y8T c0y8t) {
        if (this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIILLIIL(c0y8t)) {
            this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIIJ(c0y8t);
        } else {
            LJLIIIL(c0y8t);
            LJLILLLLZI(c0y8t);
        }
    }

    @Override // X.C0Y1U
    public final void LJJLIIJ(final List<C0YAE> list) {
        if (list != null && !list.isEmpty()) {
            C868200Y4c c868200Y4c = this.LJIILIIL.LJIIZILJ().getDomain().LIZ;
            c868200Y4c.getClass();
            if (!list.isEmpty()) {
                c868200Y4c.LJIILL(((C0YAE) ListProtector.get(list, 0)).getConversationId(), new InterfaceC864490Xvj<InterfaceC868050Y3n>() { // from class: X.0Y6J
                    @Override // X.InterfaceC864490Xvj
                    public final void invoke(InterfaceC868050Y3n interfaceC868050Y3n) {
                        interfaceC868050Y3n.LJJLL(list);
                    }
                });
            }
            Iterator it2 = ((CopyOnWriteArraySet) this.LJFF).iterator();
            while (it2.hasNext()) {
                ((InterfaceC868050Y3n) it2.next()).LJJLL(list);
            }
        }
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y6Q<C866930Xzf> LJJLJ(C869710Y9x c869710Y9x) {
        C0Y6Q<Long> c0y6qLJIIIIZZ = this.LJIILJJIL.LJIIJJI().LJIIIIZZ(c869710Y9x);
        C0YPQ c0ypq = c0y6qLJIIIIZZ.LIZIZ;
        if (c0ypq == null) {
            return C865670Xxd.LIZJ(new C866930Xzf(c869710Y9x, c0y6qLJIIIIZZ.LIZ.longValue()));
        }
        return C865670Xxd.LIZIZ(c0ypq);
    }

    public final void LJJLL(Runnable runnable) {
        ((ReentrantLock) this.LIZIZ).lock();
        try {
            runnable.run();
            ((ReentrantLock) this.LIZIZ).unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LIZIZ).unlock();
            throw th;
        }
    }

    public final void LJJZZIII(final C0Y8T c0y8t) {
        LJLJI(c0y8t.getConversationId());
        C868200Y4c c868200Y4c = this.LJIILIIL.LJIIZILJ().getDomain().LIZ;
        c868200Y4c.getClass();
        if (!TextUtils.isEmpty(c0y8t.getConversationId())) {
            c868200Y4c.LJIILL(c0y8t.getConversationId(), new InterfaceC864490Xvj<InterfaceC868050Y3n>() { // from class: X.0Y5o
                @Override // X.InterfaceC864490Xvj
                public final void invoke(InterfaceC868050Y3n interfaceC868050Y3n) {
                    interfaceC868050Y3n.LJJLIIIJ(c0y8t);
                }
            });
        }
        C868740Y6e c868740Y6eLIZIZ = this.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ();
        ((ConcurrentHashMap) c868740Y6eLIZIZ.LIZ).remove(c0y8t.getConversationId());
        ((ConcurrentHashMap) c868740Y6eLIZIZ.LIZIZ).remove(c0y8t.getConversationId());
        c868740Y6eLIZIZ.LJ();
        Iterator it2 = ((CopyOnWriteArraySet) this.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC868050Y3n) it2.next()).LJJLIIIJ(c0y8t);
        }
    }

    public final void LJLIIIL(C0Y8T... c0y8tArr) {
        if (c0y8tArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (C0Y8T c0y8t : c0y8tArr) {
                if (c0y8t != null) {
                    LJJLL(new ARunnableS47S0300000_14(c0y8t, sb, this, 1));
                }
            }
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel insertOrUpdateConversation size:");
            sbLIZ.append(c0y8tArr.length);
            sbLIZ.append(", ids:");
            sbLIZ.append((Object) sb);
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJLILLLLZI(C0Y8T c0y8t) {
        if (c0y8t != null && !((ConcurrentHashMap) this.LJI).isEmpty()) {
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel recordConversationWhileSyncing:");
            sbLIZ.append(c0y8t.getConversationId());
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            ((ConcurrentHashMap) this.LIZJ).put(c0y8t.getConversationId(), c0y8t);
        }
    }

    public final void LJLJI(String str) {
        LJJLL(new ARunnableS19S1100000_14(this, str, 0));
        C868740Y6e c868740Y6eLIZIZ = this.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ();
        ((ConcurrentHashMap) c868740Y6eLIZIZ.LIZ).remove(str);
        ((ConcurrentHashMap) c868740Y6eLIZIZ.LIZIZ).remove(str);
        ((ConcurrentHashMap) this.LIZJ).remove(str);
    }

    public final void LJLJJI(final List<C0Y8T> list) {
        if (!list.isEmpty()) {
            LJJLL(new Runnable() { // from class: X.0Y2Y
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DefaultConversationListModel@a5c5.sortConversations$1");
                    try {
                        this.LLILLJJLI.LJIILIIL.LJ().LIZLLL().LIZ();
                        Collections.sort(list, new Comparator<C0Y8T>() { // from class: X.0Y2Z
                            @Override // java.util.Comparator
                            public final int compare(C0Y8T c0y8t, C0Y8T c0y8t2) {
                                return Long.compare(c0y8t2.getSortOrder(), c0y8t.getSortOrder());
                            }
                        });
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DefaultConversationListModel@a5c5.sortConversations$1");
                }
            });
        }
    }

    public final void LJLJJL(List<C0Y8T> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C0Y8T c0y8t : list) {
                if (CardStruct.IStatusCode.DEFAULT.equals(c0y8t.getConversationId())) {
                    this.LJIILIIL.LIZLLL().LJIILL("ConversationListModel updateLoadedListToMemory dirty conversation");
                    arrayList.add(c0y8t);
                } else if (this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIILLIIL(c0y8t)) {
                    arrayList2.add(c0y8t);
                    this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIIJ(c0y8t);
                }
            }
            if (!arrayList.isEmpty()) {
                list.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                list.removeAll(arrayList2);
            }
            if (!list.isEmpty()) {
                final StringBuilder sb = new StringBuilder();
                for (final C0Y8T c0y8t2 : list) {
                    if (c0y8t2 != null) {
                        LJJLL(new Runnable() { // from class: X.0Y65
                            public final void LIZ() {
                                String conversationId = c0y8t2.getConversationId();
                                StringBuilder sb2 = sb;
                                sb2.append(conversationId);
                                sb2.append("_");
                                C0Y8T c0y8t3 = (C0Y8T) ((ConcurrentHashMap) this.LLILLL.LIZ).get(conversationId);
                                if (c0y8t3 != null && c0y8t3.getUpdatedTime() > c0y8t2.getUpdatedTime()) {
                                    this.LLILLL.LJIILIIL.LIZLLL().LJII("ConversationListModel insertOrUpdateConversation, replace by smaller updateTime, cid:", conversationId);
                                }
                                ((ConcurrentHashMap) this.LLILLL.LIZ).put(conversationId, c0y8t2);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("DefaultConversationListModel@a5c5.insertOrUpdateConversation$2");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("DefaultConversationListModel@a5c5.insertOrUpdateConversation$2");
                            }
                        });
                    }
                }
                C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ConversationListModel insertOrUpdateConversation size:");
                sbLIZ.append(list.size());
                sbLIZ.append(", ids:");
                sbLIZ.append((Object) sb);
                c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            }
            LJJLL(new Runnable() { // from class: X.0Y39
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DefaultConversationListModel@a5c5.updateConversationsWhileSyncingToMemory$1");
                    try {
                        C0Y60 c0y60 = this.LL;
                        ((ConcurrentHashMap) c0y60.LIZ).putAll(c0y60.LIZJ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DefaultConversationListModel@a5c5.updateConversationsWhileSyncingToMemory$1");
                }
            });
            ((ConcurrentHashMap) this.LIZJ).clear();
            synchronized (this) {
                if (list.isEmpty()) {
                    return;
                }
                for (C0Y8T c0y8t3 : list) {
                    if (c0y8t3 != null && c0y8t3.isWaitingInfo()) {
                        C868780Y6i c868780Y6iLIZLLL2 = this.LJIILIIL.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("retryWaitingInfoConversations - ");
                        sbLIZ2.append(c0y8t3.getConversationId());
                        c868780Y6iLIZLLL2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                        C868140Y3w c868140Y3w = this.LJIILIIL.LJIIZILJ().getDomain().LIZIZ;
                        int inboxType = c0y8t3.getInboxType();
                        String conversationId = c0y8t3.getConversationId();
                        c868140Y3w.LIZ(inboxType, c0y8t3.getConversationShortId(), c0y8t3.getUpdatedTime(), c0y8t3.getConversationType(), conversationId);
                    }
                }
                this.LJIILIIL.LJIIZILJ().getDomain().LIZIZ.LIZJ(false);
            }
        }
    }

    public C0Y60(C0YEM c0yem, C0Y9J c0y9j) {
        this.LJIILIIL = c0yem;
        this.LJIILJJIL = c0y9j;
    }

    @Override // X.InterfaceC866720XzK
    public final void LJ(long j, String str) {
        this.LJIILIIL.LJIIZILJ().getDomain().LIZJ().LJ(j, str);
    }

    @Override // X.C0Y1U
    public final void LJII(final String str, final List<C0YAE> list) {
        C868200Y4c c868200Y4c = this.LJIILIIL.LJIIZILJ().getDomain().LIZ;
        c868200Y4c.getClass();
        if (!TextUtils.isEmpty(str)) {
            c868200Y4c.LJIILL(str, new InterfaceC864490Xvj<InterfaceC868050Y3n>() { // from class: X.0Y6H
                @Override // X.InterfaceC864490Xvj
                public final void invoke(InterfaceC868050Y3n interfaceC868050Y3n) {
                    interfaceC868050Y3n.LJLI(str, list);
                }
            });
        }
        Iterator it2 = ((CopyOnWriteArraySet) this.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC868050Y3n) it2.next()).LJLI(str, list);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJIJI(List list, C914150Ztd c914150Ztd) {
        this.LJIILIIL.LJIIZILJ().getDomain().LIZJ().LLLIIL(list, c914150Ztd);
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJ(String str, InterfaceC863600XuI<String> interfaceC863600XuI) {
        this.LJIILIIL.LJIIZILJ().getDomain().LIZ().LIZIZ(str, interfaceC863600XuI);
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJIIJZLJL(List list, InterfaceC863600XuI interfaceC863600XuI) {
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        new C868070Y3p(c0yem, interfaceC863600XuI).LJIIL(c0yem.LJIIZILJ().LIZLLL().LIZ().LJIJJ(list), new AwS28S0001000_14(4));
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJIJ(List<String> list, InterfaceC863600XuI<List<String>> interfaceC863600XuI) {
        this.LJIILIIL.LJIIZILJ().getDomain().LIZJ().LLJJLIIIJLLLLLLLZ(list, interfaceC863600XuI);
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJJJL(Map<String, Map<String, String>> map, InterfaceC863600XuI<Boolean> interfaceC863600XuI) {
        C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationListModel batchUpdateLocalExt, convIdToLocalExtMap size:");
        sbLIZ.append(map.size());
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        this.LJIILIIL.LJIIJJI().LIZJ(new C914040ZtS(this, map, 5), new C914030ZtR(interfaceC863600XuI, 6), false, this.LJIILIIL.LJIIL().LIZJ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJJLI(String str, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        new C867450Y1f(c870180YBsLIZ.LLILLL, interfaceC863600XuI).LJIILIIL(str);
    }

    @Override // X.C0Y1U
    public final void LJJJJZ(Set set, C914130Ztb c914130Ztb) {
        HashSet<String> hashSet = (HashSet) set;
        if (hashSet.isEmpty()) {
            c914130Ztb.onSuccess(Collections.emptyMap());
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str : hashSet) {
            C0Y8T c0y8tLIZ = LIZ(str);
            if (c0y8tLIZ != null) {
                map.put(str, Long.valueOf(c0y8tLIZ.getConversationShortId()));
            } else {
                arrayList.add(str);
            }
        }
        if (map.size() == hashSet.size()) {
            c914130Ztb.onSuccess(map);
        } else {
            this.LJIILIIL.LJIIJJI().LIZIZ(new C914040ZtS(this, arrayList, 8), new C914020ZtQ(c914130Ztb, map, 3));
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJJZI(long j, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        LJJZ(0, j);
        LJJZZI(0, j, interfaceC863600XuI);
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJLIIL(final long j, final String str) {
        if (this.LJIILIIL.LJIIIZ().LJJLIIIIJ.LJJII) {
            this.LJIILIIL.LJIIZILJ().getDomain().LIZJ().LJLLILLLL(Long.valueOf(j), str);
            return;
        }
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        final C864870XwL c864870XwL = new C864870XwL(c0yem);
        c0yem.LJIIJJI().LIZJ(new InterfaceC872410YKh<C0Y8T>() { // from class: X.0XwJ
            @Override // X.InterfaceC872410YKh
            public final C0Y8T LIZ() {
                C0Y8T c0y8tLIZ = c864870XwL.LIZLLL.LJIIJJI().LIZ(str, false);
                if (c0y8tLIZ == null) {
                    c864870XwL.LJIILJJIL(-1, str);
                    c864870XwL.LJIILL(EnumC864390XvZ.ERROR, -1017, str, -1, "");
                } else if (!C864870XwL.LJIILLIIL(c0y8tLIZ, c864870XwL.LIZJ)) {
                    c864870XwL.LJIILJJIL(c0y8tLIZ.getConversationType(), str);
                    int fakeUnreadCount = c0y8tLIZ.getFakeUnreadCount();
                    c0y8tLIZ.setReadIndex(j);
                    c0y8tLIZ.setReadBadgeCount(c0y8tLIZ.getBadgeCount());
                    C0Y2U.LIZJ(c0y8tLIZ, c864870XwL.LIZJ, true);
                    long jLIZ = C0Y2U.LIZ(c0y8tLIZ, c864870XwL.LIZJ, "mark_read_request", "local", false, null);
                    if (jLIZ < 0) {
                        jLIZ = 0;
                    }
                    c0y8tLIZ.setUnreadCount(jLIZ);
                    if (jLIZ <= 0) {
                        c864870XwL.LIZLLL.LIZIZ().LIZJ(str);
                        c0y8tLIZ.setUnreadSelfMentionedMessages(null);
                    } else {
                        c0y8tLIZ.setUnreadSelfMentionedMessages(c864870XwL.LIZLLL.LIZIZ().LJ(j, str));
                    }
                    if (!c864870XwL.LIZLLL.LJIIJJI().LJJJJLI(c0y8tLIZ)) {
                        c864870XwL.LJIILL(EnumC864390XvZ.ERROR, -1036, str, c0y8tLIZ.getConversationType(), "");
                        return null;
                    }
                    c864870XwL.LIZLLL.LJI().LJJLI(j, str);
                    C864870XwL.LJIILIIL(c864870XwL.LIZJ, c0y8tLIZ);
                    c864870XwL.LJIIJJI(c0y8tLIZ.getInboxType(), C864870XwL.LJIIL(c864870XwL.LIZJ, c0y8tLIZ, new C864860XwK(EnumC868460Y5c.TYPE_USER_MESSAGE, j), Boolean.TRUE, fakeUnreadCount), str, c0y8tLIZ.getConversationType());
                    return c0y8tLIZ;
                }
                return null;
            }
        }, new C914010ZtP(11), false, c0yem.LJIIL().LIZJ());
    }

    @Override // X.C0Y1U
    public final void LJJL(int i, C0Y8T c0y8t) {
        if (c0y8t != null) {
            boolean zLJIILLIIL = this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIILLIIL(c0y8t);
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel onUpdateConversation, cid:");
            sbLIZ.append(c0y8t.getConversationId());
            sbLIZ.append(", reason:");
            sbLIZ.append(i);
            sbLIZ.append(", isMessageRequestConv:");
            sbLIZ.append(zLJIILLIIL);
            sbLIZ.append(", isInBox:");
            sbLIZ.append(c0y8t.isInBox());
            sbLIZ.append(" hasMore: ");
            sbLIZ.append(c0y8t.hasMore());
            sbLIZ.append(", unreadCount: ");
            sbLIZ.append(c0y8t.getUnreadCount());
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            if (this.LJIILJJIL.LJIIJJI().LJJJ(c0y8t)) {
                this.LJIILIIL.LJIIJJI().LIZIZ(new C914040ZtS(this, c0y8t, 6), null);
            }
            if (zLJIILLIIL) {
                this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LIZIZ(c0y8t);
            } else {
                LJLIIIL(c0y8t);
                LJL(i, c0y8t);
            }
        }
    }

    @Override // X.C0Y1U
    public final void LJJLI(int i, C0Y8T... c0y8tArr) {
        LJJJJJ(false, i, c0y8tArr);
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJLIL(String str, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0Y8T c0y8tLIZ = LIZ(str);
        if (c0y8tLIZ != null) {
            if (interfaceC863600XuI != null) {
                interfaceC863600XuI.onSuccess(c0y8tLIZ);
                return;
            }
            return;
        }
        this.LJIILIIL.LJIIJJI().LIZJ(new C914060ZtU(this, str, interfaceC863600XuI, 1), new C914010ZtP(2), false, this.LJIILIIL.LJIIL().LIZJ());
    }

    @Override // X.C0Y1U
    public final void LJJLJLI(List<String> list, boolean z) {
        C0Y8T c0y8tLIZ;
        for (final String str : list) {
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel onDeleteConversation:");
            sbLIZ.append(str);
            sbLIZ.append(", isMessageRequestConv:");
            sbLIZ.append(z);
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            if (!z && (c0y8tLIZ = LIZ(str)) != null) {
                LJJZZIII(c0y8tLIZ);
            }
            C868200Y4c c868200Y4c = this.LJIILIIL.LJIIZILJ().getDomain().LIZ;
            c868200Y4c.getClass();
            if (str != null && !TextUtils.isEmpty(str)) {
                c868200Y4c.LJIIZILJ(str, new InterfaceC864490Xvj<InterfaceC868420Y4y>() { // from class: X.0Y4z
                    @Override // X.InterfaceC864490Xvj
                    public final void invoke(InterfaceC868420Y4y interfaceC868420Y4y) {
                        interfaceC868420Y4y.ns(str);
                    }
                });
            }
        }
        if (z) {
            this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJFF(list);
        }
    }

    public final void LJJZ(int i, long j) {
        String strLIZ = C2124408Ty.LIZ(i, j, this.LJIILIIL.getUid());
        if (LIZ(strLIZ) == null) {
            C0Y8T c0y8t = new C0Y8T();
            c0y8t.setInboxType(i);
            c0y8t.setConversationId(strLIZ);
            c0y8t.setConversationType(AbstractC1711506n3.LIZ);
            c0y8t.setUpdatedTime(System.currentTimeMillis());
            c0y8t.setMemberCount(2);
            c0y8t.setIsMember(true);
            LJJIJL(c0y8t);
            this.LJIILIIL.LJIIJJI().LIZIZ(new C914040ZtS(this, c0y8t, 4), null);
        }
    }

    public final void LJL(final int i, final C0Y8T c0y8t) {
        this.LJIILIIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<Void>() { // from class: X.0Y5q
            @Override // X.InterfaceC872410YKh
            public final Void LIZ() {
                final C0Y8T c0y8tLJIL = this.LIZJ.LJIL(c0y8t.getConversationId());
                C868200Y4c c868200Y4c = this.LIZJ.LJIILIIL.LJIIZILJ().getDomain().LIZ;
                final int i2 = i;
                c868200Y4c.getClass();
                if (c0y8tLJIL != null && !TextUtils.isEmpty(c0y8tLJIL.getConversationId())) {
                    c868200Y4c.LJIILL(c0y8tLJIL.getConversationId(), new InterfaceC864490Xvj<InterfaceC868050Y3n>() { // from class: X.0Y5p
                        @Override // X.InterfaceC864490Xvj
                        public final void invoke(InterfaceC868050Y3n interfaceC868050Y3n) {
                            interfaceC868050Y3n.LJLJI(i2, c0y8tLJIL);
                        }
                    });
                }
                Iterator it2 = ((CopyOnWriteArraySet) this.LIZJ.LJFF).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC868050Y3n) it2.next()).LJLJI(i, c0y8tLJIL);
                }
                C868740Y6e c868740Y6eLIZIZ = this.LIZJ.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ();
                c868740Y6eLIZIZ.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(c0y8tLJIL);
                c868740Y6eLIZIZ.LIZLLL(arrayList, true, false);
                return null;
            }
        }, new C914010ZtP(4), false, this.LJIILIIL.LJIIL().LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y6X LJIIZILJ(long j, int i, C869290Y8h c869290Y8h) {
        return LJLIIL(j, i, c869290Y8h);
    }

    @Override // X.InterfaceC866720XzK
    public final boolean LJIJJLI(final long j, final int i, final C869290Y8h c869290Y8h) {
        if (((ConcurrentHashMap) this.LJI).containsKey(c869290Y8h.LIZ)) {
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            c868780Y6iLIZLLL.getClass();
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "ConversationListModel ", "syncingCheck, is syncing already", 4);
            C868780Y6i c868780Y6iLIZLLL2 = this.LJIILIIL.LIZLLL();
            c868780Y6iLIZLLL2.getClass();
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "ConversationListModel ", "loadConversationsWithQuery, is syncing already", 4);
            return false;
        }
        ((ConcurrentHashMap) this.LJI).put(c869290Y8h.LIZ, this.LJII);
        ((ConcurrentHashMap) this.LJI).put(c869290Y8h.LIZ, this.LJII);
        C868780Y6i c868780Y6iLIZLLL3 = this.LJIILIIL.LIZLLL();
        c868780Y6iLIZLLL3.getClass();
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL3, "ConversationListModel ", "loadConversationsWithQuery", 4);
        this.LJIILIIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<C0Y6X>() { // from class: X.0Y64
            @Override // X.InterfaceC872410YKh
            public final C0Y6X LIZ() {
                if (!((CopyOnWriteArraySet) this.LIZLLL.LJIIIZ).isEmpty()) {
                    Iterator it2 = ((CopyOnWriteArraySet) this.LIZLLL.LJIIIZ).iterator();
                    while (it2.hasNext()) {
                        ((C0Y6L) it2.next()).LIZ();
                    }
                }
                C0Y6X c0y6xLJLIIL = this.LIZLLL.LJLIIL(j, i, c869290Y8h);
                if (!((CopyOnWriteArraySet) this.LIZLLL.LJIIIZ).isEmpty()) {
                    C868780Y6i c868780Y6iLIZLLL4 = this.LIZLLL.LJIILIIL.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ConversationListModel asyncRange onCallback IConversationPageListObserver next cursor ");
                    sbLIZ.append(c0y6xLJLIIL.LIZLLL);
                    c868780Y6iLIZLLL4.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                    for (C0Y6L c0y6l : (CopyOnWriteArraySet) this.LIZLLL.LJIIIZ) {
                        try {
                            c0y6l.LIZJ();
                            c0y6l.LIZLLL(c0y6xLJLIIL, this.LIZLLL.LJIIL);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LIZLLL.LJIILIIL.LIZLLL().LJIIIZ("call observer error", e);
                        }
                    }
                }
                if (this.LIZLLL.LJIILIIL.LJIIIZ().LJIIL && !((CopyOnWriteArraySet) this.LIZLLL.LJFF).isEmpty()) {
                    this.LIZLLL.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel asyncRange onCallback IConversationListObserver");
                    Iterator it3 = ((CopyOnWriteArraySet) this.LIZLLL.LJFF).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC867280Y0o) it3.next()).LLLIZZ(this.LIZLLL.LIZ);
                    }
                }
                return c0y6xLJLIIL;
            }
        }, new C914020ZtQ(c869290Y8h, this, 2), true, this.LJIILIIL.LJIIL().LIZJ());
        return true;
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJIJIL(List<C0Y8T> list, Boolean bool, InterfaceC863600XuI<List<String>> interfaceC863600XuI) {
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        Boolean bool2 = Boolean.FALSE;
        c870180YBsLIZ.getClass();
        new C865050Xwd(c870180YBsLIZ.LLILLL, interfaceC863600XuI).LJIIJJI(bool2, bool, list);
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJJIZL(int i, long j, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        LJJZ(i, j);
        LJJZZI(i, j, interfaceC863600XuI);
    }

    @Override // X.C0Y1U
    public final void LJJJJJ(boolean z, final int i, C0Y8T... c0y8tArr) {
        if (c0y8tArr != null && c0y8tArr.length > 0) {
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel onUpdateConversation, conversations:");
            sbLIZ.append(c0y8tArr.length);
            sbLIZ.append(", reason:");
            sbLIZ.append(i);
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            ArrayList arrayList = new ArrayList();
            boolean z2 = this.LJIILIIL.LJIIIZ().LJJLIIIIJ.LJJ;
            for (final C0Y8T c0y8t : c0y8tArr) {
                if (this.LJIILJJIL.LJIIJJI().LJJJ(c0y8t)) {
                    this.LJIILIIL.LJIIJJI().LIZIZ(new C914040ZtS(this, c0y8t, 6), null);
                }
                if (c0y8t != null && this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIILLIIL(c0y8t)) {
                    if (!z2) {
                        this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LIZIZ(c0y8t);
                    }
                    C0Y8T c0y8tM37clone = c0y8t.m37clone();
                    if (c0y8tM37clone != null) {
                        ArrayMap arrayMap = new ArrayMap();
                        Map<String, String> localExt = c0y8t.getLocalExt();
                        if (localExt != null) {
                            arrayMap.putAll(localExt);
                        }
                        arrayMap.put("for_delete_say_hi", "true");
                        c0y8tM37clone.setLocalExt(arrayMap);
                        LJJZZIII(c0y8tM37clone);
                    }
                    arrayList.add(c0y8t);
                } else {
                    if (z) {
                        LJLILLLLZI(c0y8t);
                    }
                    if (c0y8t != null) {
                        final String conversationId = c0y8t.getConversationId();
                        final C0Y8T c0y8t2 = (C0Y8T) ((ConcurrentHashMap) this.LIZ).get(conversationId);
                        if (i == 5 && c0y8t2 != null && c0y8t2.isStickTop() != c0y8t.isStickTop()) {
                            this.LJIILIIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<C0Y8T>() { // from class: X.0Y1n
                                @Override // X.InterfaceC872410YKh
                                public final C0Y8T LIZ() {
                                    if (!this.LIZLLL.LJIILIIL.LJIIIZ().LJIIZILJ || c0y8t2.getLastShowMessage() == null) {
                                        c0y8t.setUpdatedTime(System.currentTimeMillis());
                                    } else {
                                        c0y8t.setUpdatedTime(c0y8t2.getLastShowMessage().getCreatedAt());
                                    }
                                    this.LIZLLL.LJIILJJIL.LJIIJJI().LJJJJ(c0y8t.getUpdatedTime(), conversationId);
                                    this.LIZLLL.LJIILJJIL.LJIIJJI().LJJJJZI(c0y8t);
                                    return c0y8t;
                                }
                            }, new InterfaceC864800XwE<C0Y8T>() { // from class: X.0Y6C
                                @Override // X.InterfaceC864800XwE
                                public final void LIZ(C0Y8T c0y8t3) {
                                    C0Y8T c0y8t4 = c0y8t3;
                                    this.LIZIZ.LJLIIIL(c0y8t4);
                                    this.LIZIZ.LJL(i, c0y8t4);
                                }
                            }, false, this.LJIILIIL.LJIIL().LIZ());
                        } else {
                            LJLIIIL(c0y8t);
                            LJL(i, c0y8t);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                if (z2) {
                    this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIIIZ(arrayList);
                }
                this.LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJ(C1719206oI.LIZ, !z2);
            }
        }
    }

    @Override // X.C0Y1U
    public final void LJJLIIIJLLLLLLLZ(int i, InterfaceC863600XuI interfaceC863600XuI, String str) {
        long jLIZIZ = C2124408Ty.LIZIZ(this.LJIILIIL.getUid(), str);
        if (jLIZIZ == -1) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.statusMsg = "conversation invalid";
            interfaceC863600XuI.LIZIZ(c0ymw);
        } else {
            C0YJ9 c0yj9 = new C0YJ9(this.LJIILIIL);
            c0yj9.LIZJ("imsdk_conv_shortid_refresh");
            c0yj9.LIZ(str, "conversation_id");
            c0yj9.LIZ(Integer.valueOf(i), "imsdk_cmd");
            LJJZZI(0, jLIZIZ, new C914120Zta(interfaceC863600XuI, c0yj9, 0));
        }
    }

    public final void LJJZZI(int i, long j, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        this.LJIILIIL.LJIIZILJ().getDomain().LIZJ().LLFFF(i, j, interfaceC863600XuI);
    }

    public final C0Y6X LJLIIL(long j, int i, C869290Y8h c869290Y8h) {
        long sortOrder;
        List listLJJIFFI = this.LJIILJJIL.LJIIJJI().LJJIFFI(Math.max(j, 0L), i, c869290Y8h);
        boolean z = false;
        this.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ().LIZLLL(listLJJIFFI, false, false);
        this.LJIILIIL.LJIIZILJ().getDomain().LIZJ.LIZ(C0YLC.LOAD_CONV_LIST);
        if (i > 0 && ((ArrayList) listLJJIFFI).size() >= i) {
            z = true;
        }
        ArrayList arrayList = (ArrayList) listLJJIFFI;
        if (!arrayList.isEmpty()) {
            sortOrder = ((C0Y8T) ListProtector.get(listLJJIFFI, arrayList.size() - 1)).getSortOrder();
            if (sortOrder > 0 && sortOrder == j) {
                listLJJIFFI = this.LJIILJJIL.LJIIJJI().LJIJI(j, c869290Y8h);
                sortOrder--;
            }
        } else {
            sortOrder = 0;
        }
        if (this.LJIILIIL.LJIIIZ().LJIIL) {
            LJLJJL(listLJJIFFI);
        }
        return new C0Y6X(c869290Y8h, listLJJIFFI, z, sortOrder, -1, true, -1, "");
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJI(String str, long j, int i, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        new C867450Y1f(c870180YBsLIZ.LLILLL, interfaceC863600XuI).LJIIJJI(0, i, j, System.currentTimeMillis(), str, true);
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJJ(List<String> list, Boolean bool, Map<String, String> map, InterfaceC863600XuI<List<SetConversationSettingInfoResponseBody>> interfaceC863600XuI) {
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        new C868070Y3p(c0yem, interfaceC863600XuI).LJIIL(c0yem.LJIIZILJ().LIZLLL().LIZ().LJIJJ(list), new AwS101S0110000_14(bool.booleanValue(), (boolean) map, (Map<String, String>) 7));
    }

    @Override // X.InterfaceC866720XzK
    public final void LJIJ(long j, C0Y6U c0y6u, C0Z9N[] c0z9nArr, Boolean bool, C1226400i1G c1226400i1G) {
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        C0Y18 c0y18 = new C0Y18(c870180YBsLIZ.LLILLL, c1226400i1G);
        C0Y6S c0y6s = new C0Y6S();
        c0y6s.LJFF = EnumC869400Y8s.GROUP_CHAT;
        c0y6s.LJ = Long.valueOf(j);
        if (c0y6u == null) {
            c0y6u = C0Y6U.JOIN_TIME;
        }
        c0y6s.LIZLLL = c0y6u;
        if (c0z9nArr.length > 0) {
            if (c0z9nArr.length == 1) {
                c0y6s.LJII = Integer.valueOf(c0z9nArr[0].getValue());
            } else {
                ArrayList arrayList = new ArrayList(c0z9nArr.length);
                for (C0Z9N c0z9n : c0z9nArr) {
                    arrayList.add(Integer.valueOf(c0z9n.getValue()));
                }
                C1516540pZE.LIZ(arrayList);
                c0y6s.LJIIL = arrayList;
            }
        }
        if (bool != null) {
            c0y6s.LJIIIZ = bool;
        }
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJLI = c0y6s.build();
        c0y18.LJIIIZ(c0y18.LJ, c1es0.build(), null, new Object[0]);
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJIIJ(List<C0Y8T> list, List<String> list2, List<String> list3, Boolean bool, InterfaceC863600XuI<List<SetConversationSettingInfoResponseBody>> interfaceC863600XuI) {
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        C868070Y3p c868070Y3p = new C868070Y3p(c870180YBsLIZ.LLILLL, interfaceC863600XuI);
        if (list.isEmpty() || (list2.isEmpty() && list3.isEmpty() && bool == null)) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.statusMsg = "nothing to change";
            c868070Y3p.LIZIZ(c0ymw);
            return;
        }
        C23250099c.LIZLLL(c868070Y3p.LJFF, null, null, new C593010NNr(c868070Y3p, list, bool, list2, list3, null), 3);
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJLIIIJJI(String str, long j, int i, boolean z, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C870180YBs c870180YBsLIZ = this.LJIILIIL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        new C867450Y1f(c870180YBsLIZ.LLILLL, interfaceC863600XuI).LJIIJJI(0, i, j, System.currentTimeMillis(), str, z);
    }

    public final void LJLIL(final boolean z, final boolean z2, final String str, final C873950YQf c873950YQf, final boolean z3) {
        Executor executorLIZJ;
        final long jUptimeMillis = SystemClock.uptimeMillis();
        if (((ConcurrentHashMap) this.LJI).containsKey(str)) {
            C868780Y6i c868780Y6iLIZLLL = this.LJIILIIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConversationListModel preAsync already isSyncing, seqId=");
            sbLIZ.append(str);
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!z && this.LJIIIIZZ && !z2) {
            this.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel preAsync first loaded");
            return;
        }
        ((ConcurrentHashMap) this.LJI).put(str, this.LJII);
        this.LJIIIIZZ = true;
        if (!z2 && this.LJIILIIL.LJIIIZ().LJIJJLI.LIZ()) {
            executorLIZJ = this.LJIILIIL.LJIIL().LIZIZ();
        } else {
            executorLIZJ = this.LJIILIIL.LJIIL().LIZJ();
        }
        C868780Y6i c868780Y6iLIZLLL2 = this.LJIILIIL.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ConversationListModel start preAsync, seqId=");
        sbLIZ2.append(str);
        sbLIZ2.append(", executor=");
        sbLIZ2.append(executorLIZJ);
        c868780Y6iLIZLLL2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
        this.LJIILIIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<C0Y6X>() { // from class: X.0Y63
            @Override // X.InterfaceC872410YKh
            public final C0Y6X LIZ() {
                List<C0Y8T> listSubList;
                C0YPQ c0ypq;
                C0Y6X c0y6x;
                if (!((CopyOnWriteArraySet) this.LJI.LJIIIZ).isEmpty()) {
                    Iterator it2 = ((CopyOnWriteArraySet) this.LJI.LJIIIZ).iterator();
                    while (it2.hasNext()) {
                        ((C0Y6L) it2.next()).LIZ();
                    }
                }
                C0Y60 c0y60 = this.LJI;
                String str2 = str;
                boolean z4 = !z2;
                C873950YQf c873950YQf2 = c873950YQf;
                boolean z5 = z3;
                c0y60.getClass();
                C869290Y8h c869290Y8h = new C869290Y8h(str2, 0, null, null, null, z4, 2046);
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int iLIZIZ = c0y60.LJIILIIL.LJIIIZ().LJIJJLI.LIZIZ();
                if (str2.equals("preload_all")) {
                    C0Y6Q<List<C0Y8T>> c0y6qLJIIL = c0y60.LJIILJJIL.LJIIJJI().LJIIL(c873950YQf2, z5);
                    listSubList = c0y6qLJIIL.LIZ;
                    c0ypq = c0y6qLJIIL.LIZIZ;
                    C868740Y6e c868740Y6eLIZIZ = c0y60.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ();
                    c868740Y6eLIZIZ.LIZLLL(listSubList, false, true);
                    c868740Y6eLIZIZ.LJ.LJIIIZ().getClass();
                } else {
                    C0Y6Q c0y6qLJIL = c0y60.LJIILJJIL.LJIIJJI().LJIL(iLIZIZ + 1, z5);
                    listSubList = (List) c0y6qLJIL.LIZ;
                    c0ypq = c0y6qLJIL.LIZIZ;
                }
                c0y60.LJIIJ = SystemClock.uptimeMillis() - jUptimeMillis2;
                long jUptimeMillis3 = SystemClock.uptimeMillis();
                C868780Y6i c868780Y6iLIZLLL3 = c0y60.LJIILIIL.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ConversationListModel getSyncConversionQueryResult, totalCount:");
                sbLIZ3.append(listSubList == null ? null : Integer.valueOf(listSubList.size()));
                sbLIZ3.append(", limit:");
                sbLIZ3.append(iLIZIZ);
                c868780Y6iLIZLLL3.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
                if (listSubList == null || listSubList.isEmpty()) {
                    c0y60.LJIIJJI = -1L;
                    c0y6x = listSubList != null ? new C0Y6X(c869290Y8h, C13BV.INSTANCE, false, Long.MAX_VALUE, 0, true, -1, "") : new C0Y6X(c869290Y8h, C13BV.INSTANCE, false, Long.MAX_VALUE, 0, false, c0ypq != null ? c0ypq.getCode() : -1, c0ypq != null ? c0ypq.getMessage() : "");
                } else if (iLIZIZ > 0) {
                    int size = listSubList.size();
                    c0y60.LJLJJI(listSubList);
                    boolean z6 = listSubList.size() > iLIZIZ;
                    if (c0y60.LJIILIIL.LJIIIZ().LJIIL) {
                        if (listSubList.size() > iLIZIZ) {
                            listSubList = listSubList.subList(0, iLIZIZ);
                        }
                        c0y60.LJLJJL(listSubList);
                    }
                    long sortOrder = ((C0Y8T) ListProtector.get(listSubList, listSubList.size() - 1)).getSortOrder();
                    c0y60.LJIIJJI = SystemClock.uptimeMillis() - jUptimeMillis3;
                    c0y6x = new C0Y6X(c869290Y8h, listSubList, z6, sortOrder, size, true, -1, "");
                } else {
                    c0y60.LJIIJJI = -1L;
                    c0y6x = new C0Y6X(c869290Y8h, listSubList, false, Long.MAX_VALUE, listSubList.size(), true, -1, "");
                }
                C0YLE c0yle = this.LJI.LJIILIIL.LJIIZILJ().getDomain().LIZJ;
                C0YLC c0ylc = C0YLC.LOAD_CONV_LIST;
                c0yle.LIZ(c0ylc);
                if (c0yle.LIZLLL(c0ylc)) {
                    c0y6x = new C0Y6X(c0y6x.LIZ, C13BV.INSTANCE, false, Long.MAX_VALUE, 0, false, -1, "");
                }
                C870460YCu c870460YCuLIZ = this.LJI.LJIILIIL.LJIIZILJ().LJFF().LIZ();
                int size2 = c0y6x.LIZIZ.size();
                boolean z7 = z;
                boolean z8 = c0y6x.LJI;
                long jUptimeMillis4 = SystemClock.uptimeMillis() - jUptimeMillis;
                C0Y60 c0y602 = this.LJI;
                c870460YCuLIZ.LIZLLL(true, size2, z7, z8, jUptimeMillis4, c0y602.LJIIJ, c0y602.LJIIJJI, c0y6x.LJII, c0y6x.LJIIIIZZ);
                if (!((CopyOnWriteArraySet) this.LJI.LJIIIZ).isEmpty()) {
                    C868780Y6i c868780Y6iLIZLLL4 = this.LJI.LJIILIIL.LIZLLL();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("ConversationListModel preAsync onCallback IConversationPageListObserver next cursor ");
                    sbLIZ4.append(c0y6x.LIZLLL);
                    c868780Y6iLIZLLL4.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
                    for (C0Y6L c0y6l : (CopyOnWriteArraySet) this.LJI.LJIIIZ) {
                        c0y6l.LIZJ();
                        c0y6l.LIZLLL(c0y6x, this.LJI.LJIIL);
                    }
                }
                if (this.LJI.LJIILIIL.LJIIIZ().LJIIL && !((CopyOnWriteArraySet) this.LJI.LJFF).isEmpty()) {
                    this.LJI.LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel preAsync onCallback IConversationListObserver");
                    Iterator it3 = ((CopyOnWriteArraySet) this.LJI.LJFF).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC867280Y0o) it3.next()).LLLIZZ(this.LJI.LIZ);
                    }
                }
                this.LJI.LJIILIIL.LJIIZILJ().LIZLLL().LIZIZ().LJ();
                return c0y6x;
            }
        }, new InterfaceC864800XwE<C0Y6X>() { // from class: X.0Y6B
            @Override // X.InterfaceC864800XwE
            public final void LIZ(C0Y6X c0y6x) {
                ((ConcurrentHashMap) this.LIZIZ.LJI).remove(str);
            }
        }, false, executorLIZJ);
    }

    @Override // X.InterfaceC866720XzK
    public final void LJIIIZ(int i, List list, String str, Map map, String str2, String str3, String str4, String str5, String str6, Boolean bool, C913700Zsu c913700Zsu) {
        this.LJIILIIL.LJIIZILJ().getDomain().LIZJ().LJIIIZ(i, list, str, map, str2, str3, str4, str5, str6, bool, c913700Zsu);
    }
}
