package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.01Vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.entrance.ECSearchDeepLinkMallHelper$collectSchema$1", f = "ECSearchDeepLinkMallHelper.kt", l = {}, m = "invokeSuspend")
public final class C345801Vw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Uri LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345801Vw(Uri uri, boolean z, InterfaceC1364105Vn<? super C345801Vw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uri;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345801Vw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECSearchDeepLinkMallHelper@f1ad.collectSchema$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Uri uri = this.LL;
        boolean z = this.LLILLJJLI;
        try {
            String string = uri.toString();
            if (C123100dR.LIZ(string) && string != null) {
                StringBuilder sb = new StringBuilder();
                if (!u.LJJIIJZLJL(string, "aweme:", false)) {
                    sb.append("aweme:");
                }
                sb.append(string);
                C1421105hJ.LIZJ("tiktokec_rd_search_schema_report", C2097608Jq.LJIIIIZZ(new Pair("schema", sb.toString()), new Pair("is_ecom_search", C2286608xc.LJ(z ? 1 : 0))));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECSearchDeepLinkMallHelper@f1ad.collectSchema$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
