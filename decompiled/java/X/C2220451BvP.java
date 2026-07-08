package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220451BvP extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220451BvP(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "close", "close(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1BvO] */
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
    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        final int iIntValue = num.intValue();
        final C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Integer numLJIL = C2220331BvD.LJIL(jSONObject2);
        if (numLJIL != null) {
            final int iIntValue2 = numLJIL.intValue();
            c2220331BvD.LIZ.LIZ.LJJL(iIntValue2, new Function1() { // from class: X.1BvO
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C2220331BvD c2220331BvD2 = c2220331BvD;
                    int i = iIntValue2;
                    int i2 = iIntValue;
                    C2220221Bv2 c2220221Bv2 = (C2220221Bv2) obj;
                    if (c2220221Bv2.LIZIZ.LIZ) {
                        c2220331BvD2.LIZIZ.remove(Integer.valueOf(i));
                    }
                    c2220331BvD2.LIZ.LIZIZ.LJJLIIJ(Integer.valueOf(i2), c2220221Bv2.LIZ());
                    return Unit.LIZ;
                }
            });
            return C2220181Buy.LJ;
        }
        if (jSONObject2.has("fd")) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.BAD_FD, iIntValue);
        }
        return c2220331BvD.LJIIIZ(iIntValue, true);
    }
}
