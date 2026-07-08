package X;

import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSuggestedStickersAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics;
import java.util.Set;

/* JADX INFO: renamed from: X.06cO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1645406cO {
    public static void LIZJ(IIMSuggestedStickersAnalytics iIMSuggestedStickersAnalytics, String str, String str2, EnumC1644606cG enumC1644606cG, String str3, int i, Set set) {
        iIMSuggestedStickersAnalytics.LIZLLL(str, str2, enumC1644606cG, str3, i, set, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LIZ(String str, String str2, EnumC1644606cG enumC1644606cG, String str3, int i, AbstractC1645706cR abstractC1645706cR, Set set, boolean z, int i2) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        IMSuggestedStickersAnalytics iMSuggestedStickersAnalytics = IMSuggestedStickersAnalytics.LIZIZ;
        if ((i2 & 64) != 0) {
            set = C08CX.INSTANCE;
        }
        if ((i2 & 128) != 0) {
            z = false;
        }
        if ((i2 & 256) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        iMSuggestedStickersAnalytics.LJFF(str, str2, enumC1644606cG, str3, i, abstractC1645706cR, set, z, interfaceC1493505szLIZIZ);
    }
}
