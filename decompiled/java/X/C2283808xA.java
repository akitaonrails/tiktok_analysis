package X;

import android.app.Activity;
import android.net.Uri;
import com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.settings.EcSeoDiversionConfigSettings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08xA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.manager.EcUgRedirectSEOSchemaManager$handleRedirectSEOSchema$1", f = "EcUgRedirectSEOSchemaManager.kt", l = {108, 162, 162, 162, 162}, m = "invokeSuspend")
public final class C2283808xA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ EcSeoDiversionConfigSettings.EcSeoDiversionConfigModel LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ C259800zU<Uri> LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ C259800zU<String> LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;
    public final /* synthetic */ C817403Hg LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ Activity LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2283808xA(EcSeoDiversionConfigSettings.EcSeoDiversionConfigModel ecSeoDiversionConfigModel, C259800zU<String> c259800zU, C118300cf c118300cf, C259800zU<Uri> c259800zU2, C259800zU<String> c259800zU3, C259800zU<String> c259800zU4, Map<String, String> map, C817403Hg c817403Hg, long j, String str, int i, String str2, Activity activity, InterfaceC1364105Vn<? super C2283808xA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = ecSeoDiversionConfigModel;
        this.LLILZ = c259800zU;
        this.LLILZIL = c118300cf;
        this.LLILZLL = c259800zU2;
        this.LLIZ = c259800zU3;
        this.LLIZLLLIL = c259800zU4;
        this.LLJ = map;
        this.LLJI = c817403Hg;
        this.LLJIJIL = j;
        this.LLJILJIL = str;
        this.LLJILJILJ = i;
        this.LLJILLL = str2;
        this.LLJJ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2283808xA(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031f  */
    /* JADX WARN: Type inference failed for: r2v138, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v28 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2283808xA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
