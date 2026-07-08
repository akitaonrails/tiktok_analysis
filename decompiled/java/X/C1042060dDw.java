package X;

import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042060dDw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1042040dDu LL;
    public final /* synthetic */ SparkContext LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ WebView LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042060dDw(C1042040dDu c1042040dDu, SparkContext sparkContext, String str, String str2, WebView webView, String str3) {
        super(0);
        this.LL = c1042040dDu;
        this.LLILLJJLI = sparkContext;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = webView;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1042040dDu c1042040dDu = this.LL;
        c1042040dDu.LIZIZ(this.LLILZIL, this.LLILLJJLI, this.LLILLL, c1042040dDu.LIZLLL, this.LLILZ, this.LLILZLL);
        return Unit.LIZ;
    }
}
