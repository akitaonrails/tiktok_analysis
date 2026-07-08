package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchBatchDiversionRequestParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS263S0000000_23;

/* JADX INFO: renamed from: X.0wAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770440wAk {
    public static final C1770440wAk LIZ = new C1770440wAk();
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS215S0000000_26.get$arr$(10));
        LIZJ = C452501pT.LIZ(enumC452301pR, AFwS187S0000000_2.get$arr$(84));
    }

    public static boolean LIZIZ(String str) {
        if (!C682620Qq4.LJFF || !C682620Qq4.LJI.contains(str)) {
            return false;
        }
        C1770430wAj.LL.getClass();
        if (C1770430wAj.LIZ(AFwS263S0000000_23.get$arr$(16))) {
            return false;
        }
        return true;
    }

    public static List LIZLLL(List list) {
        Object c098200Yq;
        try {
            c098200Yq = C13LP.LJJJJLI(new ArrayList(list));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = C13BV.INSTANCE;
        }
        return (List) c098200Yq;
    }

    public static EcSearchBatchDiversionRequestParams LIZ(String str, List list) {
        List<String> listLLLLLLLZIL;
        C1770180wAK.LIZ.getClass();
        Integer numValueOf = Integer.valueOf(C1770180wAK.LJII() ? 1 : 0);
        C2232408os c2232408os = C341050DYp.LIZ;
        String str2 = null;
        String strLIZ = C341050DYp.LIZ(null);
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService != null) {
            listLLLLLLLZIL = iSearchService.LLLLLLLZIL(20);
        } else {
            listLLLLLLLZIL = null;
        }
        if (!C682620Qq4.LIZJ || C682620Qq4.LIZLLL) {
            str2 = str;
        }
        return new EcSearchBatchDiversionRequestParams(list, numValueOf, strLIZ, listLLLLLLLZIL, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a A[Catch: all -> 0x01b8, TryCatch #2 {all -> 0x01b8, blocks: (B:58:0x012e, B:60:0x0136, B:63:0x013c, B:64:0x015b, B:66:0x0161, B:69:0x016c, B:70:0x0170, B:71:0x017d, B:73:0x0183, B:76:0x018e, B:77:0x0192, B:62:0x013a), top: B:94:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161 A[Catch: all -> 0x01b8, TryCatch #2 {all -> 0x01b8, blocks: (B:58:0x012e, B:60:0x0136, B:63:0x013c, B:64:0x015b, B:66:0x0161, B:69:0x016c, B:70:0x0170, B:71:0x017d, B:73:0x0183, B:76:0x018e, B:77:0x0192, B:62:0x013a), top: B:94:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[Catch: all -> 0x01b8, TryCatch #2 {all -> 0x01b8, blocks: (B:58:0x012e, B:60:0x0136, B:63:0x013c, B:64:0x015b, B:66:0x0161, B:69:0x016c, B:70:0x0170, B:71:0x017d, B:73:0x0183, B:76:0x018e, B:77:0x0192, B:62:0x013a), top: B:94:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cc A[Catch: all -> 0x01e2, TryCatch #0 {all -> 0x01e2, blocks: (B:82:0x01c6, B:84:0x01cc, B:85:0x01dc, B:81:0x01bb, B:18:0x0053, B:19:0x005c, B:21:0x0062, B:23:0x0073, B:29:0x0084, B:30:0x0088, B:31:0x0095, B:33:0x009b, B:36:0x00aa, B:39:0x00b1, B:41:0x00b7, B:44:0x00bc, B:45:0x00c3, B:47:0x00c9, B:48:0x00da, B:50:0x00e0, B:53:0x00eb, B:54:0x00ef), top: B:90:0x0025 }] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.0wAw] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.0wAw] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.0wAw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r24, java.util.List r25, X.InterfaceC1364105Vn r26) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1770440wAk.LIZJ(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }
}
