package X;

import com.bytedance.hybrid.spark.security.api.protocols.DynamicRuleHandler;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828470Wej extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Method LL;
    public final /* synthetic */ C259800zU<C828480Wek> LLILLJJLI;
    public final /* synthetic */ DynamicRuleHandler LLILLL;
    public final /* synthetic */ C259800zU<C828420Wee> LLILZ;
    public final /* synthetic */ C259800zU<C821850WLv> LLILZIL;
    public final /* synthetic */ C013C LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C828470Wej(Method method, C259800zU<C828480Wek> c259800zU, DynamicRuleHandler dynamicRuleHandler, C259800zU<C828420Wee> c259800zU2, C259800zU<C821850WLv> c259800zU3, C013C c013c) {
        super(0);
        this.LL = method;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = dynamicRuleHandler;
        this.LLILZ = c259800zU2;
        this.LLILZIL = c259800zU3;
        this.LLILZLL = c013c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.0Wek] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r5 = this;
            java.util.Map<java.lang.String, java.lang.String> r1 = com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter.dynamicApiNameMapper
            java.lang.reflect.Method r0 = r5.LL
            java.lang.String r0 = r0.getName()
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L16
            java.lang.reflect.Method r0 = r5.LL
            java.lang.String r3 = r0.getName()
        L16:
            X.00zU<X.0Wek> r2 = r5.LLILLJJLI
            com.bytedance.hybrid.spark.security.api.protocols.DynamicRuleHandler r1 = r5.LLILLL
            X.00zU<X.0Wee> r0 = r5.LLILZ
            T r0 = r0.element
            X.0Wee r0 = (X.C828420Wee) r0
            X.0Wek r0 = r1.handle(r3, r0)
            r2.element = r0
            X.00zU<X.0WLv> r2 = r5.LLILZIL
            X.00zU<X.0Wek> r1 = r5.LLILLJJLI
            T r0 = r1.element
            X.0Wek r0 = (X.C828480Wek) r0
            r4 = 0
            if (r0 == 0) goto L7c
            X.0WLv r0 = r0.LIZ
        L33:
            r2.element = r0
            X.013C r2 = r5.LLILZLL
            T r0 = r1.element
            X.0Wek r0 = (X.C828480Wek) r0
            r3 = 0
            if (r0 == 0) goto L7a
            boolean r1 = r0.LIZIZ
            r0 = 1
            if (r1 != r0) goto L7a
        L43:
            r2.element = r0
            java.lang.reflect.Method r0 = r5.LL
            java.lang.Class r1 = r0.getDeclaringClass()
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L73
            if (r1 == 0) goto L73
            java.lang.String r2 = r1.getSimpleName()
            X.00zU<X.0WLv> r0 = r5.LLILZIL
            X.00zU<X.0Wek> r1 = r5.LLILLJJLI
            T r0 = r0.element
            X.0WLv r0 = (X.C821850WLv) r0
            if (r0 == 0) goto L67
            X.0WLo r0 = r0.LIZ(r2)
            if (r0 == 0) goto L67
            X.0WLw r4 = r0.LIZ
        L67:
            X.0WLp r0 = X.EnumC821790WLp.ACTION_UNKNOWN
            if (r4 != r0) goto L73
            T r0 = r1.element
            X.0Wek r0 = (X.C828480Wek) r0
            if (r0 == 0) goto L73
            r0.LIZJ = r3
        L73:
            X.00zU<X.0WLv> r0 = r5.LLILZIL
            T r0 = r0.element
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7a:
            r0 = 0
            goto L43
        L7c:
            r0 = r4
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C828470Wej.invoke():java.lang.Object");
    }
}
