package X;

import android.webkit.WebView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS31S0000100_16;
import njp.a;

/* JADX INFO: renamed from: X.0dB3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autofill.manager.AdAutofillAIInfoManager$requestRemoteAndInject$1$2", f = "AdAutofillAIInfoManager.kt", l = {}, m = "invokeSuspend")
public final class C1040270dB3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WeakReference<WebView> LL;
    public final /* synthetic */ AwemeRawAd LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040270dB3(long j, AwemeRawAd awemeRawAd, String str, WeakReference weakReference, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = weakReference;
        this.LLILLJJLI = awemeRawAd;
        this.LLILLL = j;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        WeakReference<WebView> weakReference = this.LL;
        return new C1040270dB3(this.LLILLL, this.LLILLJJLI, this.LLILZ, weakReference, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdAutofillAIInfoManager@a9d9.requestRemoteAndInject$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        WebView webView = this.LL.get();
        if (webView == null) {
            new C1040460dBM(new Object[0]).logAd(C1040450dBL.LIZ, this.LLILLJJLI, new AwS31S0000100_16(this.LLILLL, 30));
            C1040110dAn.LLILZIL.LIZLLL(this.LLILLL);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AdAutofillAIInfoManager@a9d9.requestRemoteAndInject$1$2");
            return unit;
        }
        C1040110dAn c1040110dAn = C1040110dAn.LL;
        C1040110dAn.LIZ(this.LLILLL, webView, this.LLILLJJLI, this.LLILZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AdAutofillAIInfoManager@a9d9.requestRemoteAndInject$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
