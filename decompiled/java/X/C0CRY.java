package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0CRY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.ecommerce.useract.UserActManagerNew$updateUserAction$1", f = "UserActManagerNew.kt", l = {}, m = "invokeSuspend")
public final class C0CRY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CRY(String str, String str2, Map<String, Object> map, InterfaceC1364105Vn<? super C0CRY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRY(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        C313600CRa c313600CRa;
        C1C7U.LIZ("UserActManagerNew@7129.updateUserAction$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C1697810uHb.LJIIJJI("goods_view_action", "search_action", "live_view_action", "video_view_action", "order_view_actions").contains(this.LL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("UserActManagerNew@7129.updateUserAction$1");
            return unit;
        }
        String str = this.LLILLJJLI;
        if (C123100dR.LIZ(str) && str != null) {
            String str2 = this.LL;
            Map<String, Object> map2 = this.LLILLL;
            if (((LinkedHashMap) C341050DYp.LJFF).get(str2) != null && (map = (Map) ((LinkedHashMap) C341050DYp.LJ).get(str2)) != null && (c313600CRa = (C313600CRa) map.get(str)) != null) {
                if (Intrinsics.LJFF(str2, "search_action") && c313600CRa.LIZ.get("session_id") == null) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("UserActManagerNew@7129.updateUserAction$1");
                    return unit2;
                }
                for (Map.Entry<String, Object> entry : map2.entrySet()) {
                    c313600CRa.LIZ(entry.getValue(), str2, entry.getKey());
                }
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("UserActManagerNew@7129.updateUserAction$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
