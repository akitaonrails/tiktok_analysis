package X;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;

/* JADX INFO: renamed from: X.0e5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075510e5t extends AbstractC1541650qDj<C2205951BVh> {
    public SparkContext LLIZ;
    public final C1075500e5s LLIZLLLIL = new AbstractC2205961BVi() { // from class: X.0e5s
        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj<?> getExtension() {
            return this.LL;
        }

        @Override // X.AbstractC2205961BVi
        public final void onPageFinished(WebView webView, String str) {
            AbstractC1968807nS abstractC1968807nS;
            ISparkHostApi iSparkHostApi;
            SparkHostApiImpl sparkHostApiImplLJZL;
            super.onPageFinished(webView, str);
            SparkContext sparkContext = this.LL.LLIZ;
            if (sparkContext != null && (abstractC1968807nS = (AbstractC1968807nS) sparkContext.LJFF(AbstractC1968807nS.class)) != null && (iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) != null && (sparkHostApiImplLJZL = iSparkHostApi.LJZL()) != null) {
                sparkHostApiImplLJZL.LLLJIL(abstractC1968807nS, true);
            }
        }

        @Override // X.AbstractC2205961BVi
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            AbstractC1968807nS abstractC1968807nS;
            ISparkHostApi iSparkHostApi;
            SparkHostApiImpl sparkHostApiImplLJZL;
            AbstractC1968807nS abstractC1968807nS2;
            ISparkHostApi iSparkHostApi2;
            SparkHostApiImpl sparkHostApiImplLJZL2;
            super.onPageStarted(webView, str, bitmap);
            SparkContext sparkContext = this.LL.LLIZ;
            if (sparkContext != null && (abstractC1968807nS2 = (AbstractC1968807nS) sparkContext.LJFF(AbstractC1968807nS.class)) != null && (iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) != null && (sparkHostApiImplLJZL2 = iSparkHostApi2.LJZL()) != null) {
                if (str == null) {
                    str = "";
                }
                sparkHostApiImplLJZL2.LLLLIILL(abstractC1968807nS2, str);
            }
            SparkContext sparkContext2 = this.LL.LLIZ;
            if (sparkContext2 != null && (abstractC1968807nS = (AbstractC1968807nS) sparkContext2.LJFF(AbstractC1968807nS.class)) != null && (iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) != null && (sparkHostApiImplLJZL = iSparkHostApi.LJZL()) != null) {
                sparkHostApiImplLJZL.LLLJIL(abstractC1968807nS, false);
            }
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        LIZLLL("onPageStarted", this.LLIZLLLIL);
        LIZLLL("onPageFinished", this.LLIZLLLIL);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0e5s] */
    public C1075510e5t(SparkContext sparkContext) {
        this.LLIZ = sparkContext;
    }
}
