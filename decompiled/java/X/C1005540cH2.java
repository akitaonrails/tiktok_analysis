package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cH2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckIntegrateImpl$check$1", f = "SmartCheckIntegrateImpl.kt", l = {68}, m = "invokeSuspend")
public final class C1005540cH2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005540cH2(String str, Map<String, String> map, boolean z, String str2, String str3, String str4, String str5, String str6, InterfaceC1364105Vn<? super C1005540cH2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = z;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1005540cH2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Set<String> queryParameterNames;
        boolean z;
        C1C7U.LIZ("SmartCheckIntegrateImpl@2b4b.check$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                Uri uri = UriProtector.parse(this.LLILLJJLI);
                if (this.LLILLL == null) {
                    queryParameterNames = null;
                } else {
                    queryParameterNames = UriProtector.getQueryParameterNames(uri);
                }
                Uri.Builder builderBuildUpon = uri.buildUpon();
                Map<String, String> map = this.LLILLL;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (queryParameterNames == null || !queryParameterNames.contains(entry.getKey())) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                        }
                    }
                }
                String string = builderBuildUpon.toString();
                C1005620cHA c1005620cHA = C1005620cHA.LIZ;
                boolean z2 = this.LLILZ;
                String str = this.LLILZIL;
                String str2 = this.LLILZLL;
                String str3 = this.LLIZ;
                String str4 = this.LLIZLLLIL;
                String str5 = this.LLJ;
                this.LL = 1;
                if (c1005620cHA.LIZ(string, z2, str, str2, str3, str4, str5, this) == objLJFF) {
                    C1C7U.LIZIZ("SmartCheckIntegrateImpl@2b4b.check$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20162213um c20162213um = C20162213um.LIZ;
            String str6 = this.LLILZIL;
            EnumC1005660cHE enumC1005660cHE = EnumC1005660cHE.CHECK;
            String message = e.getMessage();
            c20162213um.getClass();
            C20162213um.LIZ("SmartCheck", str6, enumC1005660cHE, message);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartCheckIntegrateImpl@2b4b.check$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
