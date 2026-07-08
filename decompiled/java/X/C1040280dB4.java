package X;

import android.webkit.WebView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dB4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autofill.manager.AdAutofillAIInfoManager$requestRemoteAndInject$1", f = "AdAutofillAIInfoManager.kt", l = {169, 217}, m = "invokeSuspend")
public final class C1040280dB4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public C238400w2 LLILLJJLI;
    public C259800zU LLILLL;
    public C259800zU LLILZ;
    public int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ AwemeRawAd LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ WeakReference<WebView> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040280dB4(long j, AwemeRawAd awemeRawAd, String str, WeakReference weakReference, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = str;
        this.LLIZ = awemeRawAd;
        this.LLIZLLLIL = j;
        this.LLJ = weakReference;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILZLL;
        return new C1040280dB4(this.LLIZLLLIL, this.LLIZ, str, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1040280dB4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
