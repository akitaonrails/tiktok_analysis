package X;

import Y.AComparatorS49S0000000_30;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AFwS318S0000000_30;
import kotlin.jvm.internal.AwS43S0000100_30;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.13BW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BW {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"view_2s", "view_6s", "view_15s", "view_firstquartile", "view_midpoint", "view_thirdquartile"});
    public static final Sequence<Pair<String, Function1<Long, Long>>> LIZIZ = C13LQ.LJIIJJI(new Pair[]{new Pair("show", AFwS274S0000000_30.get$arr$(2)), new Pair("play", AFwS274S0000000_30.get$arr$(3)), new Pair("view_2s", AFwS274S0000000_30.get$arr$(4)), new Pair("view_6s", AFwS274S0000000_30.get$arr$(5)), new Pair("view_15s", AFwS274S0000000_30.get$arr$(6)), new Pair("view_firstquartile", AFwS274S0000000_30.get$arr$(7)), new Pair("view_midpoint", AFwS274S0000000_30.get$arr$(8)), new Pair("view_thirdquartile", AFwS274S0000000_30.get$arr$(9)), new Pair("over", AFwS274S0000000_30.get$arr$(10))});

    public static final C13BS LIZ(long j) {
        List listLLIIIJ;
        C13BY c13by = new C13BY(new C2101208La(new C1133920fc6(new C08LY(LIZIZ, new AwS43S0000100_30(j, 0)), new AComparatorS49S0000000_30(0)), AFwS318S0000000_30.get$arr$(0)), new AwS43S0000100_30(j, 1));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C13BX c13bx = new C13BX(c13by);
        while (c13bx.hasNext()) {
            Object next = c13bx.next();
            linkedHashMap.put(((C13BQ) next).LIZ, next);
        }
        List listLLIIII = C13LP.LLIIII(linkedHashMap.entrySet());
        if ((listLLIIII instanceof Collection) && listLLIIII.size() <= 1) {
            listLLIIIJ = C13LP.LLIIII(listLLIIII);
        } else {
            listLLIIIJ = C13LP.LLIIIJ(listLLIIII);
            Collections.reverse(listLLIIIJ);
        }
        return new C13BS(linkedHashMap, C13LP.LJJLIIIJ(listLLIIIJ, "-", null, null, 0, null, AFwS274S0000000_30.get$arr$(1), 30));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            switch(r0) {
                case -232065072: goto La;
                case 3423444: goto L15;
                case 3443508: goto L1e;
                case 3529469: goto L27;
                case 94001407: goto L30;
                case 139885730: goto L39;
                case 454226523: goto L44;
                case 454226647: goto L4f;
                case 1196117557: goto L5a;
                case 1665985561: goto L65;
                default: goto L7;
            }
        L7:
            java.lang.String r1 = "undefined"
        L9:
            return r1
        La:
            java.lang.String r0 = "view_thirdquartile"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "75%"
            return r1
        L15:
            java.lang.String r1 = "over"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L9
            goto L7
        L1e:
            java.lang.String r1 = "play"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L9
            goto L7
        L27:
            java.lang.String r1 = "show"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L9
            goto L7
        L30:
            java.lang.String r1 = "break"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L9
            goto L7
        L39:
            java.lang.String r0 = "view_midpoint"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "50%"
            return r1
        L44:
            java.lang.String r0 = "view_2s"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "2s"
            return r1
        L4f:
            java.lang.String r0 = "view_6s"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "6s"
            return r1
        L5a:
            java.lang.String r0 = "view_15s"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "15s"
            return r1
        L65:
            java.lang.String r0 = "view_firstquartile"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r1 = "25%"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13BW.LIZIZ(java.lang.String):java.lang.String");
    }
}
