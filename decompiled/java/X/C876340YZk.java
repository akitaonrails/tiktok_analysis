package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0YZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876340YZk {
    public static final C876340YZk LIZ = new C876340YZk();

    public static C0YI5 LIZ(C876340YZk c876340YZk) {
        C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
        c876340YZk.getClass();
        return ((IIMCoreProxyService) ServiceManager.get().getService(IIMCoreProxyService.class)).LIZIZ(c0ym2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LIZIZ(C877830Yc9 c877830Yc9, int i) {
        C0YM2 c0ym2;
        if ((i & 1) != 0) {
            c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
        } else {
            c0ym2 = null;
        }
        AbstractC877810Yc7 abstractC877810Yc7 = c877830Yc9;
        if ((i & 2) != 0) {
            abstractC877810Yc7 = C877820Yc8.LIZ;
        }
        LIZ.getClass();
        ((IIMCoreProxyService) ServiceManager.get().getService(IIMCoreProxyService.class)).LIZIZ(c0ym2).LIZIZ.LIZJ(abstractC877810Yc7);
    }
}
