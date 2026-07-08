package X;

import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nAf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424430nAf implements InterfaceC1424330nAV {
    public long LIZIZ = -1;
    public long LIZJ = -10086;
    public final C1DEV LIZLLL = C2191201ApK.LIZ();
    public final C01GW LJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(0));

    public static final void LIZIZ(SearchSugResponse searchSugResponse, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[drop] receive sug list: keyword=");
        String str2 = searchSugResponse.LLILLL;
        if (str2 == null) {
            str2 = searchSugResponse.originQuery;
        }
        sbLIZ.append(str2);
        sbLIZ.append(" responseOrder=");
        sbLIZ.append(searchSugResponse.requestOrder);
        sbLIZ.append(" reason=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        throw new IllegalStateException(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[Catch: all -> 0x0147, TryCatch #0 {all -> 0x0147, blocks: (B:14:0x0043, B:49:0x00ee, B:51:0x00fe, B:52:0x0100, B:57:0x012f, B:58:0x0132, B:32:0x00b4, B:33:0x00b7, B:35:0x00bc, B:37:0x00c0, B:39:0x00c8, B:43:0x00d1, B:59:0x0133, B:60:0x0138, B:61:0x0139, B:62:0x013e, B:63:0x013f, B:64:0x0146, B:24:0x0085, B:28:0x0093, B:46:0x00e6, B:48:0x00ec, B:53:0x0125, B:54:0x012a), top: B:75:0x0026, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #2 {all -> 0x012b, blocks: (B:46:0x00e6, B:48:0x00ec, B:53:0x0125, B:54:0x012a), top: B:78:0x00e6, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125 A[Catch: all -> 0x012b, TRY_ENTER, TryCatch #2 {all -> 0x012b, blocks: (B:46:0x00e6, B:48:0x00ec, B:53:0x0125, B:54:0x012a), top: B:78:0x00e6, outer: #0 }] */
    @Override // X.InterfaceC1424330nAV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r20, java.lang.String r21, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse> r22) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1424430nAf.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
