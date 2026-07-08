package X;

import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PQJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQJ {
    public static final C0PQJ LIZ = new C0PQJ();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:4:0x0008, B:7:0x000f, B:9:0x0016, B:11:0x001a, B:32:0x0063, B:34:0x0067, B:20:0x002e, B:21:0x0036, B:22:0x0040, B:24:0x0046, B:26:0x0050, B:27:0x0052, B:29:0x0056, B:30:0x005d, B:31:0x0060, B:35:0x006c), top: B:40:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment r6) {
        /*
            X.0O68 r1 = X.C0O6R.LIZ
            X.0O68 r0 = X.C0O68.AVAILABLE
            r5 = 1
            r4 = 0
            if (r1 != r0) goto L7c
            boolean r0 = r6.isDetached()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto Lf
            return
        Lf:
            com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchNetworkStandardStatusVM r3 = X.C0P7Z.LIZ(r6)     // Catch: java.lang.Throwable -> L70
            r2 = 0
            if (r3 == 0) goto L6c
            X.0PGm r0 = r3.LL     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L60
            int[] r1 = X.C642110PGn.LIZ     // Catch: java.lang.Throwable -> L70
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L70
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L70
            if (r1 == r5) goto L40
            r0 = 2
            if (r1 == r0) goto L36
            r0 = 3
            if (r1 == r0) goto L2e
            r0 = 4
            if (r1 != r0) goto L60
            goto L63
        L2e:
            r3.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L70
            r6.LJJIFFI()     // Catch: java.lang.Throwable -> L70
            kotlin.Unit r2 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L70
            goto L6c
        L36:
            X.0PGm r0 = X.EnumC642100PGm.NORMAL     // Catch: java.lang.Throwable -> L70
            r3.LL = r0     // Catch: java.lang.Throwable -> L70
            r6.PT()     // Catch: java.lang.Throwable -> L70
            kotlin.Unit r2 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L70
            goto L6c
        L40:
            com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchStatusViewVM r0 = X.C0PQK.LIZIZ(r6)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6c
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.LLILLJJLI     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L70
            X.0Q9c r0 = (X.C665660Q9c) r0     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L52
            X.0PRX r2 = r0.LIZ     // Catch: java.lang.Throwable -> L70
        L52:
            X.0PRX r0 = X.C0PRX.ERROR     // Catch: java.lang.Throwable -> L70
            if (r2 != r0) goto L5d
            X.0PGm r0 = X.EnumC642100PGm.NORMAL     // Catch: java.lang.Throwable -> L70
            r3.LL = r0     // Catch: java.lang.Throwable -> L70
            r6.PT()     // Catch: java.lang.Throwable -> L70
        L5d:
            kotlin.Unit r2 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L70
            goto L6c
        L60:
            kotlin.Unit r2 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L70
            goto L6c
        L63:
            boolean r0 = r3.LLILLJJLI     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6c
            r3.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L70
            r6.LJJIFFI()     // Catch: java.lang.Throwable -> L70
        L6c:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L70
            return
        L70:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PQJ.LIZIZ(com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment):void");
    }

    public static boolean LIZ(SearchApiResult searchApiResult, boolean z) {
        String nilItem;
        SearchNilInfo searchNilInfo;
        SearchNilInfo searchNilInfo2;
        if (!z) {
            String nilItem2 = null;
            if (searchApiResult != null && (searchNilInfo2 = searchApiResult.searchNilInfo) != null) {
                nilItem = searchNilInfo2.getNilItem();
            } else {
                nilItem = null;
            }
            SearchNilInfo.Companion companion = SearchNilInfo.Companion;
            if (!Intrinsics.LJFF(nilItem, companion.getFEDERATION_EMPTY())) {
                if (searchApiResult != null && (searchNilInfo = searchApiResult.searchNilInfo) != null) {
                    nilItem2 = searchNilInfo.getNilItem();
                }
                if (!Intrinsics.LJFF(nilItem2, companion.getPACK_NIL())) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
