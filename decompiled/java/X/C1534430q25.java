package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.CDNFetcher;
import java.io.File;

/* JADX INFO: renamed from: X.0q25, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534430q25 {
    public static File LIZ() {
        File c0vsj = CDNFetcher.directory;
        if (c0vsj == null) {
            c0vsj = new C0VSJ(Forest.Companion.getApp().getCacheDir(), "rl_resource_offline");
        }
        c0vsj.mkdirs();
        CDNFetcher.directory = c0vsj;
        return c0vsj;
    }

    public static void LIZIZ(AbstractC1522680pj8 abstractC1522680pj8) {
        CDNFetcher.loadingRequests.remove(abstractC1522680pj8.toString());
    }
}
