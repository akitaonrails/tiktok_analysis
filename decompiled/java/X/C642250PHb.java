package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642250PHb {
    public final C0PHT LIZ;
    public final Function0<List<Aweme>> LIZIZ;
    public final InterfaceC1631620sYq<List<Aweme>, Integer, List<Aweme>, Boolean> LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public Float LJFF;
    public final Set<String> LJI;
    public boolean LJII;
    public final Set<String> LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;

    public final Pair<C0PHX, Aweme> LIZIZ() {
        Aweme aweme;
        HashMap<String, Object> map;
        List<Aweme> listInvoke = this.LIZIZ.invoke();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
        Iterator<T> it2 = listInvoke.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        Set setLLIIIZ = C13LP.LLIIIZ(arrayList);
        C0PHW c0phwLIZIZ = this.LIZ.LIZIZ();
        if (c0phwLIZIZ != null) {
            for (C0PHX c0phx = c0phwLIZIZ.LIZJ; c0phx != null; c0phx = c0phx.LIZLLL) {
                C0P7A c0p7a = c0phx.LIZ.LJIIIZ;
                c0phx.LJ();
                String str = c0phx.LJIIIZ;
                C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(SearchMixFeed.class));
                SearchMixFeed searchMixFeed = (SearchMixFeed) ((c640970PCd == null || (map = c640970PCd.LIZ) == null) ? null : map.get(str));
                String aid = (searchMixFeed == null || (aweme = searchMixFeed.getAweme()) == null) ? null : aweme.getAid();
                c0phx.LJ();
                if (c0phx.LJIIJ.LIZ && searchMixFeed != null && searchMixFeed.isAweme() && aid != null && !setLLIIIZ.contains(aid)) {
                    C0PHX c0phxLIZLLL = c0phx.LIZLLL();
                    c0phxLIZLLL.LJII = true;
                    C0PIB c0pib = new C0PIB(true, 2);
                    C0P7A c0p7a2 = c0phxLIZLLL.LIZ.LJIIIZ;
                    c0phxLIZLLL.LJ();
                    String str2 = c0phxLIZLLL.LJIIIZ;
                    C640970PCd c640970PCd2 = c0p7a2.LIZ.get(C13LE.LIZ(C0PIB.class));
                    if (c640970PCd2 == null) {
                        c640970PCd2 = new C640970PCd();
                        c0p7a2.LIZ.put(C13LE.LIZ(C0PIB.class), c640970PCd2);
                    }
                    HashMap<String, Object> map2 = c640970PCd2.LIZ;
                    if (map2 != null) {
                        map2.put(str2, c0pib);
                    }
                    return new Pair<>(c0phxLIZLLL, searchMixFeed.getAweme());
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0028, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Path cross not found for [B:14:0x0028, B:33:0x005d], limit reached: 41 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d A[PHI: r1 r2
      0x005d: PHI (r1v3 X.0PHW) = (r1v8 X.0PHW), (r1v2 X.0PHW) binds: [B:15:0x002c, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r2v2 X.0PHW) = (r2v6 X.0PHW), (r2v1 X.0PHW) binds: [B:15:0x002c, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063 A[EDGE_INSN: B:39:0x0063->B:37:0x0063 BREAK  A[LOOP:0: B:12:0x0024->B:31:0x0056], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0PHW LIZ(java.lang.String r5) {
        /*
            r4 = this;
            X.0PHT r0 = r4.LIZ
            X.0PHW r1 = r0.LIZJ()
            r3 = 0
            if (r1 == 0) goto L63
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.LIZLLL()
            if (r0 == 0) goto L1a
            java.lang.String r0 = r0.getAid()
        L13:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L1c
            return r1
        L1a:
            r0 = r3
            goto L13
        L1c:
            X.0PHW r2 = r1.LIZIZ()
            X.0PHW r1 = r1.LIZ()
        L24:
            if (r2 == 0) goto L60
            if (r1 == 0) goto L5d
        L28:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.LIZLLL()
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.getAid()
        L32:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L39
            return r1
        L39:
            if (r2 == 0) goto L4c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LIZLLL()
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.getAid()
        L45:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L4e
            return r2
        L4c:
            r0 = r3
            goto L45
        L4e:
            if (r1 == 0) goto L5b
            X.0PHW r1 = r1.LIZ()
        L54:
            if (r2 == 0) goto L5f
            X.0PHW r2 = r2.LIZ()
            goto L24
        L5b:
            r1 = r3
            goto L54
        L5d:
            r0 = r3
            goto L32
        L5f:
            r2 = r3
        L60:
            if (r1 == 0) goto L63
            goto L28
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C642250PHb.LIZ(java.lang.String):X.0PHW");
    }

    public C642250PHb(C0PHT c0pht, C0PII c0pii, C0PJI c0pji) {
        C0PHW c0phwLJFF;
        Aweme awemeLIZLLL;
        String aid;
        this.LIZ = c0pht;
        this.LIZIZ = c0pii;
        this.LIZJ = c0pji;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C0PHW c0phwLIZIZ = c0pht.LIZIZ();
        if (c0phwLIZIZ != null && (c0phwLJFF = c0phwLIZIZ.LJFF()) != null && (awemeLIZLLL = c0phwLJFF.LIZLLL()) != null && (aid = awemeLIZLLL.getAid()) != null && aid.length() > 0) {
            linkedHashSet.add(aid);
        }
        this.LJI = linkedHashSet;
        this.LJIIIIZZ = new LinkedHashSet();
        this.LJIIIZ = true;
    }
}
