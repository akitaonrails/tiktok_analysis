package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialsharesearch.SocialSearchHelperKt$performSocialSearch$2", f = "SocialSearchHelper.kt", l = {27}, m = "invokeSuspend")
public final class C498301wr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends List<? extends InterfaceC1381610m3b>, ? extends Double, ? extends Double>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ List<InterfaceC1381610m3b> LLILZ;
    public final /* synthetic */ InterfaceC498501wt LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C498301wr(InterfaceC498501wt interfaceC498501wt, String str, List list, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = map;
        this.LLILZ = list;
        this.LLILZIL = interfaceC498501wt;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        Map<String, Object> map = this.LLILLL;
        return new C498301wr(this.LLILZIL, this.LLILZLL, this.LLILZ, map, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("SocialSearchHelperKt@3354.performSocialSearch$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Map<String, Object> map = this.LLILLL;
                if (map == null || map.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C443120HZe c443120HZe = new C443120HZe(this.LLILZ, C2286608xc.LIZJ(0.0d), C2286608xc.LIZJ(0.0d));
                    C1C7U.LIZIZ("SocialSearchHelperKt@3354.performSocialSearch$2");
                    return c443120HZe;
                }
                InterfaceC498501wt interfaceC498501wt = this.LLILZIL;
                String str = this.LLILZLL;
                this.LL = str;
                this.LLILLJJLI = 1;
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                interfaceC498501wt.LIZ(str, new C498401ws(c23260099m));
                obj = c23260099m.LIZ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialSearchHelperKt@3354.performSocialSearch$2");
                    return objLJFF;
                }
            }
            C443120HZe c443120HZe2 = (C443120HZe) obj;
            C443120HZe c443120HZe3 = new C443120HZe((List) c443120HZe2.getFirst(), C2286608xc.LIZJ(((Number) c443120HZe2.getSecond()).doubleValue()), C2286608xc.LIZJ(((Number) c443120HZe2.getThird()).doubleValue()));
            C1C7U.LIZIZ("SocialSearchHelperKt@3354.performSocialSearch$2");
            return c443120HZe3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C443120HZe c443120HZe4 = new C443120HZe(C13BV.INSTANCE, C2286608xc.LIZJ(0.0d), C2286608xc.LIZJ(0.0d));
            C1C7U.LIZIZ("SocialSearchHelperKt@3354.performSocialSearch$2");
            return c443120HZe4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends List<? extends InterfaceC1381610m3b>, ? extends Double, ? extends Double>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
