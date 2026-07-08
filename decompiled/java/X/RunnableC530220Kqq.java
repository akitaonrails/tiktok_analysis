package X;

import Y.ARunnableS13S1100000_8;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Kqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC530220Kqq implements Runnable {
    public final /* synthetic */ VEMediaParserProviderV2 LL;

    public RunnableC530220Kqq(VEMediaParserProviderV2 vEMediaParserProviderV2) {
        this.LL = vEMediaParserProviderV2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VEMediaParserProviderV2@d09d.releaseProvider$1");
        try {
            VEMediaParserProviderV2 vEMediaParserProviderV2 = this.LL;
            Iterator it2 = ((LinkedHashMap) vEMediaParserProviderV2.LLILLJJLI).entrySet().iterator();
            while (it2.hasNext()) {
                vEMediaParserProviderV2.LLILLL.execute(new ARunnableS13S1100000_8(vEMediaParserProviderV2, (String) ((Map.Entry) it2.next()).getKey(), 0));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEMediaParserProviderV2@d09d.releaseProvider$1");
    }
}
