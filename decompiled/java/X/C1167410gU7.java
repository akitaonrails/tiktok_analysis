package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS54S0200100_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167410gU7 {
    public long LJ;
    public int LJFF;
    public int LJIIIIZZ;
    public Function1<? super Integer, Unit> LJIIIZ;
    public boolean LJIIJ;
    public List<String> LJIIJJI;
    public List<? extends Aweme> LJIIL;
    public final List<Aweme> LJIILIIL;
    public Pair<Long, Long> LJIILJJIL;
    public Long LJIILL;
    public Boolean LJIILLIIL;
    public final List<Aweme> LJIIZILJ;
    public Pair<Long, Long> LJIJ;
    public Long LJIJI;
    public Boolean LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public final Set<String> LJJ;
    public final List<Aweme> LJJI;
    public final List<Aweme> LJJIFFI;
    public final C1165050gQJ LJJII;
    public final C1DEV LJJIII;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJI = "";
    public String LJII = "";

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1167390gU5 LIZIZ() {
        /*
            r8 = this;
            X.0gU5 r7 = new X.0gU5
            int r6 = r8.LJIL
            boolean r0 = r8.LIZJ()
            if (r0 == 0) goto L3d
            boolean r0 = r8.LJIJJLI
            r5 = 1
            if (r0 != 0) goto L39
            java.lang.Boolean r0 = r8.LJIILLIIL
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            java.lang.Boolean r0 = r8.LJIJJ
            boolean r4 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r1 == 0) goto L3d
            kotlin.Pair<java.lang.Long, java.lang.Long> r3 = r8.LJIJ
            kotlin.Pair r2 = new kotlin.Pair
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.<init>(r0, r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L39
            if (r4 == 0) goto L3d
        L39:
            r7.<init>(r6, r5)
            return r7
        L3d:
            r5 = 0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1167410gU7.LIZIZ():X.0gU5");
    }

    public final boolean LIZJ() {
        return !Intrinsics.LJFF(this.LJIILJJIL, new Pair(-1L, -1L));
    }

    public C1167410gU7() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LJIIJJI = c13bv;
        this.LJIIL = c13bv;
        this.LJIILIIL = new ArrayList();
        this.LJIILJJIL = new Pair<>(-1L, -1L);
        this.LJIIZILJ = new ArrayList();
        this.LJIJ = new Pair<>(Long.MAX_VALUE, Long.MAX_VALUE);
        this.LJJ = new LinkedHashSet();
        this.LJJI = new ArrayList();
        this.LJJIFFI = new ArrayList();
        this.LJJII = new C1165050gQJ();
        this.LJJIII = C2191201ApK.LIZ();
    }

    public static boolean LIZ(long j, Pair pair) {
        if (j >= ((Number) pair.getFirst()).longValue() && j <= ((Number) pair.getSecond()).longValue()) {
            return true;
        }
        return false;
    }

    public static List LIZLLL(List list, List list2) {
        int size;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (Object obj : (ArrayList) list) {
            int i2 = i + 1;
            if (i >= 0) {
                C1166810gT9 c1166810gT9 = (C1166810gT9) obj;
                if (list2 != null) {
                    size = list2.size();
                } else {
                    size = 0;
                }
                c1166810gT9.LLJI = Integer.valueOf(size + i + 1);
                arrayList.add(c1166810gT9);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public static List LJIIIIZZ(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            C1166810gT9 c1166810gT9 = (C1166810gT9) obj;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(((C1166810gT9) it2.next()).LL, c1166810gT9.LL)) {
                        break;
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final Object LJI(long j, C1167420gU8 c1167420gU8) {
        boolean zBooleanValue;
        if (this.LJIJJLI) {
            return new C1167440gUA(C13LP.LJLIL(this.LJIIZILJ, this.LJIILIIL), false, null, null, null, 28);
        }
        if (LIZ(j, this.LJIILJJIL)) {
            List<Aweme> list = this.LJIILIIL;
            Boolean bool = this.LJIILLIIL;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            return new C1167440gUA(list, zBooleanValue, this.LJIILL, null, null, 24);
        }
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c1167420gU8));
        C1165050gQJ.LIZJ(this.LJJII, this.LIZLLL, 3, this.LIZIZ, this.LIZJ, j, new AwS597S0100000_18(this, 1127), new AwS54S0200100_18(j, this, c23260099m, 1), new AwS597S0100000_18(c23260099m, 152));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c1167420gU8);
        }
        return objLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[Catch: Exception -> 0x015c, all -> 0x016d, TRY_LEAVE, TryCatch #1 {Exception -> 0x015c, blocks: (B:26:0x007b, B:27:0x007e, B:29:0x0084, B:32:0x008d, B:34:0x0093, B:35:0x00a0, B:37:0x00a6, B:38:0x00b7, B:43:0x00c3, B:46:0x00c9, B:47:0x00d6, B:49:0x00dc, B:51:0x00e4, B:52:0x00f1, B:53:0x00f4, B:66:0x0139, B:68:0x014a, B:69:0x0153, B:54:0x00f5, B:57:0x0101, B:58:0x010f, B:60:0x0115, B:62:0x011d, B:63:0x0133, B:64:0x0136, B:65:0x0137), top: B:84:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[Catch: Exception -> 0x015c, all -> 0x016d, TRY_ENTER, TryCatch #1 {Exception -> 0x015c, blocks: (B:26:0x007b, B:27:0x007e, B:29:0x0084, B:32:0x008d, B:34:0x0093, B:35:0x00a0, B:37:0x00a6, B:38:0x00b7, B:43:0x00c3, B:46:0x00c9, B:47:0x00d6, B:49:0x00dc, B:51:0x00e4, B:52:0x00f1, B:53:0x00f4, B:66:0x0139, B:68:0x014a, B:69:0x0153, B:54:0x00f5, B:57:0x0101, B:58:0x010f, B:60:0x0115, B:62:0x011d, B:63:0x0133, B:64:0x0136, B:65:0x0137), top: B:84:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(long r14, X.InterfaceC1364105Vn r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1167410gU7.LJ(long, X.05Vn, boolean):java.lang.Object");
    }

    public final Object LJFF(long j, C1167430gU9 c1167430gU9, boolean z) {
        boolean zBooleanValue;
        if (this.LJIJJLI) {
            List<Aweme> listLJLIL = this.LJIILIIL;
            if (z) {
                listLJLIL = C13LP.LJLIL(this.LJIIZILJ, listLJLIL);
            }
            return new C1167440gUA(listLJLIL, false, null, null, null, 28);
        }
        if (LIZ(j, this.LJIJ)) {
            List<Aweme> list = this.LJIIZILJ;
            Boolean bool = this.LJIJJ;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            return new C1167440gUA(list, zBooleanValue, this.LJIJI, null, null, 24);
        }
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c1167430gU9));
        C1165050gQJ.LIZJ(this.LJJII, this.LIZLLL, 2, this.LIZIZ, this.LIZJ, j, new AwS597S0100000_18(this, 1126), new AwS54S0200100_18(j, this, c23260099m, 0), new AwS597S0100000_18(c23260099m, 151));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c1167430gU9);
        }
        return objLIZ;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00d7: INVOKE (r4 I:X.01eN), (r5 I:java.lang.Object) INTERFACE call: X.01eN.LIZIZ(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:50331863), block:B:44:0x00d7 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00df: INVOKE (r4 I:X.01eN), (r5 I:java.lang.Object) INTERFACE call: X.01eN.LIZIZ(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:50331871), block:B:48:0x00df */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[Catch: Exception -> 0x00ce, all -> 0x00db, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ce, blocks: (B:22:0x0065, B:23:0x0068, B:25:0x006e, B:28:0x0077, B:30:0x007b, B:31:0x008a, B:33:0x0090, B:35:0x00a3, B:36:0x00ab, B:38:0x00bc, B:39:0x00c5, B:19:0x0058), top: B:50:0x001d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[Catch: Exception -> 0x00ce, all -> 0x00db, TRY_ENTER, TryCatch #0 {Exception -> 0x00ce, blocks: (B:22:0x0065, B:23:0x0068, B:25:0x006e, B:28:0x0077, B:30:0x007b, B:31:0x008a, B:33:0x0090, B:35:0x00a3, B:36:0x00ab, B:38:0x00bc, B:39:0x00c5, B:19:0x0058), top: B:50:0x001d, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(long r9, java.util.List<X.C1166810gT9> r11, X.InterfaceC1364105Vn<? super X.C443120HZe<? extends X.C443120HZe<? extends java.util.List<X.C1166810gT9>, java.lang.Boolean, java.lang.Long>, java.lang.Integer, ? extends java.lang.Exception>> r12) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1167410gU7.LJII(long, java.util.List, X.05Vn):java.lang.Object");
    }
}
