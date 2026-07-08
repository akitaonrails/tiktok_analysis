package X;

import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.lynx.tasm.TemplateData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor$routeShopV2$deferred$1", f = "StoreInterceptor.kt", l = {408}, m = "invokeSuspend")
public final class C1739070vM9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TemplateData>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;
    public final /* synthetic */ RouteIntent LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ EnumC1161720gKw LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ C1211320hcw LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739070vM9(Uri uri, RouteIntent routeIntent, Map<String, Object> map, String str, String str2, String str3, String str4, EnumC1161720gKw enumC1161720gKw, boolean z, C1211320hcw c1211320hcw, InterfaceC1364105Vn<? super C1739070vM9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = uri;
        this.LLILZ = routeIntent;
        this.LLILZIL = map;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = enumC1161720gKw;
        this.LLJIJIL = z;
        this.LLJILJIL = c1211320hcw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739070vM9(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c7  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1739070vM9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TemplateData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
