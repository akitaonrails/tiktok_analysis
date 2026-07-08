package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;

/* JADX INFO: renamed from: X.0QPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QPZ {
    public static ECSearchEntranceData LIZ() {
        C0QER c0qer;
        SAFHelper.LIZ.getClass();
        Activity activityLJJIII = SAFHelper.LJJIII();
        if (activityLJJIII == null || !(activityLJJIII instanceof EcSearchActivity)) {
            return null;
        }
        AbstractActivityC1743740vTg abstractActivityC1743740vTg = (AbstractActivityC1743740vTg) activityLJJIII;
        if (abstractActivityC1743740vTg.isFinishing() || (c0qer = (C0QER) abstractActivityC1743740vTg.getIntent().getSerializableExtra("search_enter_param")) == null) {
            return null;
        }
        return c0qer.getEcSearchEntranceData();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0101, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r0.isFromOutside(), java.lang.Boolean.TRUE) != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r7, com.ss.android.ugc.aweme.search.model.SearchResultParam r8, X.C0QER r9, android.os.Bundle r10, X.C650950Pg5 r11, com.bytedance.router.RouteIntent r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QPZ.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.search.model.SearchResultParam, X.0QER, android.os.Bundle, X.0Pg5, com.bytedance.router.RouteIntent):void");
    }
}
