package X;

import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: renamed from: X.0NZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NZ5 {
    public final InterfaceC897330ZId LIZ;
    public final AbstractC595720NYc LIZIZ;
    public final C2252321DDq LIZJ;

    public C0NZ5(InterfaceC897330ZId interfaceC897330ZId, AbstractC595720NYc abstractC595720NYc) {
        this.LIZ = interfaceC897330ZId;
        this.LIZIZ = abstractC595720NYc;
        ActivityStatusService.LIZ.getClass();
        this.LIZJ = C1BNE.LIZ(C595830NYn.LIZ().LIZIZ(abstractC595720NYc));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0NYY, X.0NZ4] */
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
    public final AnonymousClass0956 LIZ(C054G c054g, Function2 function2) {
        ?? r3 = new C0NYY() { // from class: X.0NZ4
            @Override // X.C0NYY
            public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                C595660NXw c595660NXw = map.get(this.LL.LIZIZ.LIZ);
                if (c595660NXw != null) {
                    this.LL.LIZJ.setValue(c595660NXw);
                }
                return Unit.LIZ;
            }
        };
        InterfaceC897330ZId interfaceC897330ZId = this.LIZ;
        if (interfaceC897330ZId != 0) {
            interfaceC897330ZId.LIZIZ(false, r3);
        }
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(c054g, null, null, new C0NZ3(this, function2, null), 3);
        anonymousClass0956LIZLLL.LJII(new AwS375S0200000_9(this, (C0NZ4) r3, 135));
        return anonymousClass0956LIZLLL;
    }
}
