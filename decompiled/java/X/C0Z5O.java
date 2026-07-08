package X;

import androidx.lifecycle.MutableLiveData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.0Z5O, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z5O implements C0Z2I {
    public static final C0Z5O LIZ = new C0Z5O();
    public static final ConcurrentHashMap<Long, Integer> LIZIZ = new ConcurrentHashMap<>();
    public static final MutableLiveData<List<Long>> LIZJ = new MutableLiveData<>();
    public static final ConcurrentHashMap<Long, CopyOnWriteArrayList<WeakReference<MutableLiveData<Integer>>>> LIZLLL = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<InterfaceC892370Yzb> LJ = new CopyOnWriteArrayList<>();
    public static final C892360Yza LJFF = new C0Y6L() { // from class: X.0Yza
        @Override // X.C0Y6L
        public final void LIZ() {
        }

        @Override // X.C0Y6L
        @InterfaceC1294060jmO
        public final void LIZJ() {
        }

        @Override // X.C0Y6L
        public final void LIZLLL(C0Y6X c0y6x, C0Y69 c0y69) {
            C1461005nk c1461005nk;
            C0Z5O c0z5o = C0Z5O.LIZ;
            List<C0Y8T> list = c0y6x.LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (C0Y8T c0y8t : list) {
                C0Y8T c0y8t2 = c0y8t;
                if (c0y8t2.isGroupChat() && (c1461005nk = C1461005nk.LIZ) != null && c1461005nk.LJIIIZ(c0y8t2, Long.valueOf(C461720I8s.LIZJ()), false)) {
                    arrayList.add(c0y8t);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((C0Y8T) it2.next()).getConversationShortId()));
            }
            for (List list2 : C13LP.LJJJIL(arrayList2, 100)) {
                C0Z5O c0z5o2 = C0Z5O.LIZ;
                AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(560);
                if (!list2.isEmpty()) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2187208ha(list2, null, aFwS248S0000000_14), 3);
                }
            }
        }
    };
    public static final C0Z5Q LJI = new InterfaceC866830XzV() { // from class: X.0Z5Q
        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJJLIIIJ(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJJLJLI(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJJLL(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJJZZI(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJLI(String str, List<C0YAE> list) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJLILLLLZI(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJLL(C1711306n1 c1711306n1) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LLIIII(int i, String str) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LLIILZL(int i, String str, List list) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final int LLLIIII() {
            return 0;
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC867280Y0o
        public final void LLLIZZ(Map<String, C0Y8T> map) {
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJJJJJL(C0Y8T c0y8t) {
            C0Z5O.LIZ.LJFF(c0y8t);
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJZI(C0Y8T c0y8t) {
            C0Z5O.LIZ.LJFF(c0y8t);
        }

        @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
        public final void LJLJI(int i, C0Y8T c0y8t) {
            C0Z5O.LIZ.LJFF(c0y8t);
        }
    };

    public static void LJI(List list) {
        int iIntValue;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            CopyOnWriteArrayList<WeakReference<MutableLiveData<Integer>>> copyOnWriteArrayList = LIZLLL.get(Long.valueOf(jLongValue));
            if (copyOnWriteArrayList != null) {
                Iterator<WeakReference<MutableLiveData<Integer>>> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    MutableLiveData<Integer> mutableLiveData = it3.next().get();
                    if (mutableLiveData != null) {
                        Integer num = LIZIZ.get(Long.valueOf(jLongValue));
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        mutableLiveData.postValue(Integer.valueOf(iIntValue));
                    }
                }
            }
        }
        LIZJ.postValue(list);
    }

    @Override // X.C0Z2I
    public final int LIZJ(long j) {
        Integer num = LIZIZ.get(Long.valueOf(j));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void LJFF(C0Y8T c0y8t) {
        Integer num;
        if (c0y8t != null && c0y8t.isGroupChat() && (num = LIZIZ.get(Long.valueOf(c0y8t.getConversationShortId()))) != null && num.intValue() > 0 && !C0Z58.LIZ.LJIIJJI(c0y8t)) {
            LIZLLL(c0y8t.getConversationShortId(), false);
        }
    }

    @Override // X.C0Z2I
    public final void LIZ(long j, MutableLiveData<Integer> mutableLiveData) {
        int iIntValue;
        ConcurrentHashMap<Long, CopyOnWriteArrayList<WeakReference<MutableLiveData<Integer>>>> concurrentHashMap = LIZLLL;
        concurrentHashMap.putIfAbsent(Long.valueOf(j), new CopyOnWriteArrayList<>());
        CopyOnWriteArrayList<WeakReference<MutableLiveData<Integer>>> copyOnWriteArrayList = concurrentHashMap.get(Long.valueOf(j));
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(new WeakReference<>(mutableLiveData));
        }
        Integer num = LIZIZ.get(Long.valueOf(j));
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        mutableLiveData.postValue(Integer.valueOf(iIntValue));
    }

    @Override // X.C0Z2I
    public final void LIZIZ(long j, MutableLiveData mutableLiveData) {
        CopyOnWriteArrayList<WeakReference<MutableLiveData<Integer>>> copyOnWriteArrayList = LIZLLL.get(Long.valueOf(j));
        if (copyOnWriteArrayList != null) {
            C19719612Di.LJJIIJ(copyOnWriteArrayList, new C5183020f(mutableLiveData, (MutableLiveData<AbstractC1779240wOw<Object>>) 358), true);
        }
    }

    @Override // X.C0Z2I
    public final void LIZLLL(long j, boolean z) {
        LIZIZ.put(Long.valueOf(j), 0);
        LJI(Collections.singletonList(Long.valueOf(j)));
        if (z) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2148808bO(j, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(int r14, long r15, long r17, X.InterfaceC1364105Vn r19) {
        /*
            r13 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C0Z5P
            if (r0 == 0) goto L25
            r6 = r3
            X.0Z5P r6 = (X.C0Z5P) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r6.LLILLL = r2
        L14:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 0
            java.lang.String r2 = "get audit list fail:"
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            goto L4a
        L25:
            X.0Z5P r6 = new X.0Z5P
            r6.<init>(r13, r3)
            goto L14
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r5)
            X.1Dac r0 = X.C2258521Dac.LIZ     // Catch: java.lang.Exception -> L64
            com.ss.android.ugc.aweme.network.model.GetAuditListRequestBody r7 = new com.ss.android.ugc.aweme.network.model.GetAuditListRequestBody     // Catch: java.lang.Exception -> L64
            r10 = r17
            r8 = r15
            r12 = r14
            r7.<init>(r8, r10, r12)     // Catch: java.lang.Exception -> L64
            r6.LLILLL = r1     // Catch: java.lang.Exception -> L64
            java.lang.Object r5 = r0.LIZ(r7, r6)     // Catch: java.lang.Exception -> L64
            if (r5 != r4) goto L4d
            return r4
        L4a:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L64
        L4d:
            com.ss.android.ugc.aweme.network.model.GetAuditListResponseBody r5 = (com.ss.android.ugc.aweme.network.model.GetAuditListResponseBody) r5     // Catch: java.lang.Exception -> L64
            int r0 = r5.status_code     // Catch: java.lang.Exception -> L64
            if (r0 != 0) goto L54
            return r5
        L54:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L64
            r1.append(r2)     // Catch: java.lang.Exception -> L64
            java.lang.String r0 = r5.status_msg     // Catch: java.lang.Exception -> L64
            r1.append(r0)     // Catch: java.lang.Exception -> L64
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L64
            return r3
        L64:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r1)
            X.C2188811AlT.LIZIZ(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z5O.LJ(int, long, long, X.05Vn):java.lang.Object");
    }
}
