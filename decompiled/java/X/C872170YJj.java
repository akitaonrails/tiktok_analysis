package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0YJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872170YJj implements InterfaceC863890Xul {
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;
    public final int LIZJ = C0YMR.GET_MESSAGES_BY_USER_COMBO.getValue();

    public final C868780Y6i LJ() {
        return this.LIZIZ.LIZLLL();
    }

    public final InterfaceC869500Y9c LJFF() {
        return this.LIZIZ.LJIIZILJ().LIZIZ().LIZJ();
    }

    public final void LJI(List<C872330YJz> list) {
        ArrayList<C872330YJz> arrayList = (ArrayList) list;
        for (C872330YJz c872330YJz : arrayList) {
            if (c872330YJz.LJFF == null) {
                C0YE0 c0ye0 = new C0YE0(c872330YJz.LIZIZ, this.LIZIZ.LJIIZILJ().LJFF().LIZ());
                c0ye0.LJJIIJ = c0ye0.LIZJ.invoke().longValue();
                c0ye0.LJIIIZ = true;
                c0ye0.LJIIJ = arrayList.size();
                c0ye0.LJIIJJI = c872330YJz.LIZ;
                c872330YJz.LJFF = c0ye0;
            }
            C871360YGg c871360YGg = this.LIZIZ.LJIIZILJ().getDomain().LIZLLL;
            int i = c872330YJz.LIZ;
            int i2 = c872330YJz.LIZIZ;
            Map<String, Object> map = c872330YJz.LIZJ;
            c871360YGg.getClass();
            c871360YGg.LJ(InterfaceC871310YGb.LIZJ, new C0YMG(i, i2, map));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    public final List<C872330YJz> LJIIIZ(List<C872330YJz> list) {
        ?? arrayList;
        int[] iArrLJ = C870740YDw.LJ(this.LIZIZ.LJIIIZ());
        ArrayList arrayList2 = new ArrayList();
        for (C872330YJz c872330YJz : (ArrayList) list) {
            int i = c872330YJz.LIZ;
            if (i != -2) {
                if (i != -1) {
                    arrayList = Collections.singletonList(c872330YJz);
                } else {
                    C868780Y6i.LJIILJJIL(LJ(), "ComboGetMsgByUserUseCase", "filtering out INVALID inbox type from requests", 4);
                    arrayList = C13BV.INSTANCE;
                }
            } else {
                C868780Y6i.LJIILJJIL(LJ(), "ComboGetMsgByUserUseCase", "expanding ALL inbox type to supported inboxes", 4);
                arrayList = new ArrayList(iArrLJ.length);
                for (int i2 : iArrLJ) {
                    arrayList.add(new C872330YJz(i2, c872330YJz.LIZIZ, c872330YJz.LIZJ, c872330YJz.LIZLLL, c872330YJz.LJ, c872330YJz.LJFF));
                }
            }
            C19719612Di.LJJI(arrayList, arrayList2);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            C872330YJz c872330YJz2 = (C872330YJz) obj;
            if (hashSet.add(new Pair(Integer.valueOf(c872330YJz2.LIZ), c872330YJz2.LIZLLL))) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    public C872170YJj(C0YEM c0yem, InterfaceC864330XvT interfaceC864330XvT) {
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = c0yem;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List r13, X.InterfaceC1364105Vn r14, kotlin.jvm.functions.Function1 r15) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872170YJj.LIZLLL(java.util.List, X.05Vn, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r25, X.C872330YJz r26, X.InterfaceC1364105Vn<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872170YJj.LJII(int, X.0YJz, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r17 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        if (r9 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        r1 = r9.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        r18 = r1.getLogId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (r18 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        r18 = "null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        if (r9 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        r1 = r9.LJFF;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        if (r1 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        r1 = new X.C0YE0(-1, r21.LIZIZ.LJIIZILJ().LJFF().LIZ());
        r1.LJI = -4001;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (r9 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        r9 = null;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        r12 = new X.C0YKD(r13, r14, r15, r17, r18, r1, r9);
        r6.LL = r7;
        r6.LLILLJJLI = r0;
        r6.LLILLL = r3;
        r6.LLILZ = r4;
        r6.LLILZIL = r15;
        r6.LLILZLL = r10;
        r6.LLJ = 2;
        r1 = r2.LIZJ(r12, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ea, code lost:
    
        if (r1 != r5) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ec, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ed, code lost:
    
        r9 = r9.LIZJ;
        r1 = r1;
     */
    /* JADX WARN: Path cross not found for [B:26:0x009c, B:24:0x0096], limit reached: 78 */
    /* JADX WARN: Path cross not found for [B:26:0x009c, B:28:0x00a0], limit reached: 78 */
    /* JADX WARN: Path cross not found for [B:28:0x00a0, B:26:0x009c], limit reached: 78 */
    /* JADX WARN: Path cross not found for [B:28:0x00a0, B:32:0x00aa], limit reached: 78 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d0 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ea -> B:12:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.util.List r22, X.InterfaceC1364105Vn r23, kotlin.jvm.internal.AwS593S0100000_14 r24) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872170YJj.LJIIIIZZ(java.util.List, X.05Vn, kotlin.jvm.internal.AwS593S0100000_14):java.lang.Object");
    }

    @Override // X.InterfaceC863890Xul
    public final Object LIZIZ(List list, Map map, AwS593S0100000_14 awS593S0100000_14, C0YMP c0ymp) {
        Iterable iterableLJJLJ;
        int[] iArrLJ = C870740YDw.LJ(this.LIZIZ.LJIIIZ());
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (iIntValue != -2) {
                if (iIntValue != -1) {
                    iterableLJJLJ = Collections.singletonList(Integer.valueOf(iIntValue));
                } else {
                    C868780Y6i.LJIILJJIL(LJ(), "ComboGetMsgByUserUseCase", "filtering out INVALID inbox type", 4);
                    iterableLJJLJ = C13BV.INSTANCE;
                }
            } else {
                C868780Y6i.LJIILJJIL(LJ(), "ComboGetMsgByUserUseCase", "expanding ALL inbox type to supported inboxes", 4);
                iterableLJJLJ = C13LQ.LJJLJ(iArrLJ);
            }
            C19719612Di.LJJI(iterableLJJLJ, arrayList);
        }
        List listLJJJJI = C13LP.LJJJJI(arrayList);
        if (listLJJJJI.isEmpty()) {
            C868780Y6i.LJIILJJIL(LJ(), "ComboGetMsgByUserUseCase", "pullAndProcessByInboxTypes skipped - no valid inbox types", 4);
            return C2097608Jq.LJ();
        }
        ArrayList arrayList2 = new ArrayList();
        C870830YEf c870830YEfLJIIIZ = this.LIZIZ.LJIIIZ();
        if (c870830YEfLJIIIZ.LJJLI) {
            Iterator it3 = listLJJJJI.iterator();
            while (it3.hasNext()) {
                int iIntValue2 = ((Number) it3.next()).intValue();
                for (C0YFV c0yfv : C0YFV.values()) {
                    if (c0yfv != C0YFV.CURSOR_TYPE_PRIORITY_MSG_CHAIN || c870830YEfLJIIIZ.LJJLIIIIJ.LJIIL) {
                        arrayList2.add(new C872330YJz(iIntValue2, 4, map, c0yfv, LJFF().LJJJJLI(iIntValue2, c0yfv), null));
                    }
                }
            }
        } else {
            Iterator it4 = listLJJJJI.iterator();
            while (it4.hasNext()) {
                int iIntValue3 = ((Number) it4.next()).intValue();
                C0YFV c0yfv2 = C0YFV.CURSOR_TYPE_USER_MSG_CHAIN;
                arrayList2.add(new C872330YJz(iIntValue3, 4, map, c0yfv2, LJFF().LJJJJLI(iIntValue3, c0yfv2), null));
            }
        }
        return LJIIIIZZ(arrayList2, c0ymp, awS593S0100000_14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x018c, code lost:
    
        r3 = r10.intValue();
        r6.LL = r1;
        r6.LLILLJJLI = r7;
        r6.LLILLL = r0;
        r6.LLILZ = r9;
        r6.LLILZIL = r14;
        r6.LLILZLL = r10;
        r6.LLJI = 3;
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a3, code lost:
    
        if (LJII(r3, r11, r6) != r5) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a5, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0083 -> B:14:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01a3 -> B:13:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01d7 -> B:14:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01d9 -> B:14:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List r31, X.InterfaceC1364105Vn r32, kotlin.jvm.functions.Function0 r33, kotlin.jvm.functions.Function1 r34) {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872170YJj.LIZJ(java.util.List, X.05Vn, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[LOOP:0: B:14:0x0047->B:95:?, LOOP_END, SYNTHETIC] */
    @Override // X.InterfaceC863890Xul
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List r22, kotlin.jvm.functions.Function1 r23, X.C871650YHj r24, X.C871760YHu r25, X.InterfaceC1364105Vn r26) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872170YJj.LIZ(java.util.List, kotlin.jvm.functions.Function1, X.0YHj, X.0YHu, X.05Vn):java.lang.Object");
    }
}
