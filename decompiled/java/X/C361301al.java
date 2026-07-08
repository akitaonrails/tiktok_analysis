package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.preload.GeckoMemResourceManager$parseGeckoFiles$2", f = "GeckoMemResourceManager.kt", l = {}, m = "invokeSuspend")
public final class C361301al extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C361301al(String str, InterfaceC1364105Vn interfaceC1364105Vn, JSONObject jSONObject) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C361301al(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GeckoMemResourceManager@3b1f.parseGeckoFiles$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!new C0VSJ(this.LL).isDirectory()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GeckoMemResourceManager@3b1f.parseGeckoFiles$2");
            return unit;
        }
        Iterator<String> itKeys = this.LLILLJJLI.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next != null && !a0.LJJJIL(next)) {
                C0VSJ c0vsj = new C0VSJ(this.LL, next);
                if (c0vsj.exists()) {
                    C361401am.LIZ(c0vsj, c0vsj.getName());
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GeckoMemResourceManager@3b1f.parseGeckoFiles$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
