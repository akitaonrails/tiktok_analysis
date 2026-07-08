package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0qAQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539600qAQ extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ C1539580qAO LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1533510q0b LLILZ;
    public final /* synthetic */ Function2<byte[], String, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539600qAQ(C1539580qAO c1539580qAO, String str, long j, C1533510q0b c1533510q0b, C1539660qAW c1539660qAW) {
        super(1);
        this.LL = c1539580qAO;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = c1533510q0b;
        this.LLILZIL = c1539660qAW;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        Boolean boolValueOf;
        byte[] bArrLJIIIZ;
        Object c098200Yq;
        Map map;
        C1533790q13 c1533790q132 = c1533790q13;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchTemplateContentIfNeed, isSucceed: ");
        if (c1533790q132 != null) {
            boolValueOf = Boolean.valueOf(c1533790q132.LIZIZ);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1533790q132 != null && c1533790q132.LIZIZ && (bArrLJIIIZ = c1533790q132.LJIIIZ()) != null) {
            C1539580qAO c1539580qAO = this.LL;
            String str = this.LLILLJJLI;
            long j = this.LLILLL;
            C1533510q0b c1533510q0b = this.LLILZ;
            Function2<byte[], String, Unit> function2 = this.LLILZIL;
            try {
                c1539580qAO.LJI = EnumC1539690qAZ.GECKO_BUNDLE_EXIST;
                if (str.length() > 0) {
                    Map map2 = (Map) C1058250de3.LIZIZ().LJII(new String(bArrLJIIIZ, Charsets.UTF_8), Map.class);
                    c1539580qAO.LJIIIIZZ.put("check_template_cost", Long.valueOf(System.currentTimeMillis() - j));
                    String path = new URI(str).getPath();
                    Object obj = map2.get("resources");
                    if ((obj instanceof Map) && (map = (Map) obj) != null) {
                        Iterator it2 = map.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (Intrinsics.LJFF(next, path)) {
                                if (next != null) {
                                    c1539580qAO.LJI = EnumC1539690qAZ.BUNDLE_CHECK_SUCCESS;
                                    c1539580qAO.LJ(c1533510q0b, str, function2);
                                }
                            }
                        }
                        c1539580qAO.LJI = EnumC1539690qAZ.BUNDLE_CHECK_FAILED;
                        c1539580qAO.LJ(null, str, function2);
                        c098200Yq = Unit.LIZ;
                    } else {
                        c098200Yq = null;
                    }
                } else {
                    EnumC1539690qAZ enumC1539690qAZ = EnumC1539690qAZ.HYDRATION_FAILED;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Response is exceptional when load spark manifest, gecko model: ");
                    sbLIZ2.append(c1533510q0b);
                    sbLIZ2.append(", hydratation url: ");
                    sbLIZ2.append(str);
                    c1539580qAO.LJI(enumC1539690qAZ, 225, C2188811AlT.LIZIZ(sbLIZ2));
                    function2.invoke(null, "template_url is empty");
                    c098200Yq = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                EnumC1539690qAZ enumC1539690qAZ2 = EnumC1539690qAZ.HYDRATION_FAILED;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("error occured: ");
                sbLIZ3.append(thM5exceptionOrNullimpl.getMessage());
                c1539580qAO.LJI(enumC1539690qAZ2, 225, C2188811AlT.LIZIZ(sbLIZ3));
                c1539580qAO.LJ(null, str, function2);
            }
            C189200o6.m1boximpl(c098200Yq);
        } else {
            C1539580qAO c1539580qAO2 = this.LL;
            String str2 = this.LLILLJJLI;
            Function2<byte[], String, Unit> function22 = this.LLILZIL;
            C1533510q0b c1533510q0b2 = this.LLILZ;
            if (str2.length() > 0) {
                c1539580qAO2.LJ(null, str2, function22);
            } else {
                function22.invoke(null, "template_url is empty");
                EnumC1539690qAZ enumC1539690qAZ3 = EnumC1539690qAZ.HYDRATION_FAILED;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Response is exceptional when load spark manifest, gecko model: ");
                sbLIZ4.append(c1533510q0b2);
                sbLIZ4.append(", hydratation url: ");
                sbLIZ4.append(str2);
                c1539580qAO2.LJI(enumC1539690qAZ3, 225, C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        return Unit.LIZ;
    }
}
