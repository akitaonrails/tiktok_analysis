package X;

import android.app.Activity;
import android.net.Uri;
import com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.settings.EcSeoDiversionConfigSettings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08xB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.manager.EcUgRedirectSEOSchemaManager$handleRedirectShopSchema$2", f = "EcUgRedirectSEOSchemaManager.kt", l = {254, 314, 314, 314, 314}, m = "invokeSuspend")
public final class C2283908xB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ EcSeoDiversionConfigSettings.EcSeoDiversionConfigModel LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ C817403Hg LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ EcSeoDiversionConfigSettings.CommonPathConfig LLJILLL;
    public final /* synthetic */ Uri LLJJ;
    public final /* synthetic */ Activity LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2283908xB(EcSeoDiversionConfigSettings.EcSeoDiversionConfigModel ecSeoDiversionConfigModel, C259800zU<String> c259800zU, C118300cf c118300cf, C259800zU<String> c259800zU2, C259800zU<String> c259800zU3, Map<String, String> map, C817403Hg c817403Hg, long j, String str, int i, String str2, EcSeoDiversionConfigSettings.CommonPathConfig commonPathConfig, Uri uri, Activity activity, InterfaceC1364105Vn<? super C2283908xB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = ecSeoDiversionConfigModel;
        this.LLILZ = c259800zU;
        this.LLILZIL = c118300cf;
        this.LLILZLL = c259800zU2;
        this.LLIZ = c259800zU3;
        this.LLIZLLLIL = map;
        this.LLJ = c817403Hg;
        this.LLJI = j;
        this.LLJIJIL = str;
        this.LLJILJIL = i;
        this.LLJILJILJ = str2;
        this.LLJILLL = commonPathConfig;
        this.LLJJ = uri;
        this.LLJJI = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2283908xB(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ad  */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57, types: [T, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v61 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2283908xB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
