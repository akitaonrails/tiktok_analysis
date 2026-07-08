package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O0A, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.next.standardized.template.common.action.FcpStandardTaskKt$doCheckAppInstalled$task$1$execute$1", f = "FcpStandardTask.kt", l = {268}, m = "invokeSuspend")
public final class C0O0A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ Function0<C690870R8b> LLILLL;
    public final /* synthetic */ C704840Rko LLILZ;
    public final /* synthetic */ C705340Rlc LLILZIL;
    public final /* synthetic */ C0O09 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O0A(Map<String, ? extends Object> map, Function0<C690870R8b> function0, C704840Rko c704840Rko, C705340Rlc c705340Rlc, C0O09 c0o09, InterfaceC1364105Vn<? super C0O0A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
        this.LLILLL = function0;
        this.LLILZ = c704840Rko;
        this.LLILZIL = c705340Rlc;
        this.LLILZLL = c0o09;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O0A(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        Map map;
        Long l;
        C1C7U.LIZ("FcpStandardTaskKt@256e.doCheckAppInstalled$task$1$execute$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Map<String, Object> map2 = this.LLILLJJLI;
            Function0<C690870R8b> function0 = this.LLILLL;
            C704840Rko c704840Rko = this.LLILZ;
            boolean zLJFF = false;
            if (map2 != null) {
                Object obj3 = map2.get("appid");
                if ((obj3 instanceof String) && obj3 != null) {
                    Pair<C20554115bn, Map<String, Object>> pairLJIIIZ = C20554315bp.LIZIZ.LJIIIZ(null);
                    if (pairLJIIIZ.getFirst().LIZ == 0) {
                        Map<String, Object> second = pairLJIIIZ.getSecond();
                        if (second != null) {
                            obj2 = second.get("is_app_installed");
                        } else {
                            obj2 = null;
                        }
                        if ((obj2 instanceof Map) && (map = (Map) obj2) != null && (l = (Long) map.get(obj3)) != null && l.longValue() == 1) {
                            zLJFF = true;
                        }
                    } else {
                        Object obj4 = map2.get("package_name");
                        if ((obj4 instanceof String) && (str = (String) obj4) != null) {
                            C19EG c19egLIZ = C0O0B.LIZ(function0.invoke());
                            if (c19egLIZ != null) {
                                zLJFF = C2162308dZ.LJFF(c19egLIZ, str);
                            }
                        }
                    }
                    Object obj5 = map2.get("intention_download");
                    if (!(obj5 instanceof String)) {
                        obj5 = null;
                    }
                    Object obj6 = map2.get("intention_open");
                    if (!(obj6 instanceof String)) {
                        obj6 = null;
                    }
                    if (zLJFF) {
                        obj5 = obj6;
                    }
                    if (obj5 != null && c704840Rko != null) {
                        c704840Rko.LJIIIZ.put("outreach_intention", (String) obj5);
                    }
                }
            }
            C2238608ps c2238608ps = C2126308Ur.LJFF;
            C0O08 c0o08 = new C0O08(zLJFF, this.LLILZIL, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c0o08) == objLJFF) {
                C1C7U.LIZIZ("FcpStandardTaskKt@256e.doCheckAppInstalled$task$1$execute$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FcpStandardTaskKt@256e.doCheckAppInstalled$task$1$execute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
