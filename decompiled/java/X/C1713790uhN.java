package X;

import com.bytedance.pipo.verify.base.tracking.VerifyAnalysisSession;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uhN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713790uhN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1713750uhJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713790uhN(C1713750uhJ c1713750uhJ) {
        super(0);
        this.LL = c1713750uhJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.LJI > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<String, String> mapLIZJ = this.LL.LIZJ();
            mapLIZJ.put("start_timestamp", String.valueOf(this.LL.LJI));
            mapLIZJ.put("finish_timestamp", String.valueOf(jCurrentTimeMillis));
            mapLIZJ.put("duration", String.valueOf(jCurrentTimeMillis - this.LL.LJI));
            mapLIZJ.put("finish_type", "go_forgot_pin");
            mapLIZJ.put("is_final", "false");
            VerifyAnalysisSession verifyAnalysisSessionLIZ = this.LL.LIZ();
            if (verifyAnalysisSessionLIZ != null) {
                for (Map.Entry entry : ((LinkedHashMap) verifyAnalysisSessionLIZ.LJII(jCurrentTimeMillis)).entrySet()) {
                    mapLIZJ.put(entry.getKey(), entry.getValue());
                }
            }
            InterfaceC1713820uhQ interfaceC1713820uhQ = C1713600uh4.LIZJ;
            if (interfaceC1713820uhQ != null) {
                interfaceC1713820uhQ.onEventV3("rd_pipo_veri_center_finish", mapLIZJ);
            }
        }
        return Unit.LIZ;
    }
}
