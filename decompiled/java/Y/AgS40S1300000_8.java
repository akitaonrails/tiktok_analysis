package Y;

import X.C05YC;
import X.C07Y9;
import X.C07YA;
import X.C07ZG;
import X.C099R;
import X.C0LX3;
import X.C1346605Ou;
import X.C1882707Yz;
import X.C1902207ci;
import X.C1902507cl;
import X.C201955140j;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C259800zU;
import X.C555990LrJ;
import X.C556460Ls4;
import X.C556810Lsd;
import X.InterfaceC1364105Vn;
import X.InterfaceC1902607cm;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.aikit.api.create.CreateState;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public class AgS40S1300000_8 implements InterfaceC346701Wf {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(com.ss.android.ugc.aweme.aikit.api.create.CreateState r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS40S1300000_8.LIZ$0(com.ss.android.ugc.aweme.aikit.api.create.CreateState, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [T, java.util.Map] */
    public static final Object emit$0(AgS40S1300000_8 agS40S1300000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC1902607cm interfaceC1902607cm = (InterfaceC1902607cm) obj;
        if (interfaceC1902607cm instanceof C07YA) {
            C556460Ls4 c556460Ls4 = (C556460Ls4) agS40S1300000_8.l1;
            if (c556460Ls4.LIZ.LIZ) {
                boolean zIsEmpty = c556460Ls4.LIZLLL.isEmpty();
                C07YA c07ya = (C07YA) interfaceC1902607cm;
                ((C556460Ls4) agS40S1300000_8.l1).LIZLLL.add(c07ya.LIZ);
                C0LX3 c0lx3 = C0LX3.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("first started=");
                sbLIZ.append(zIsEmpty);
                sbLIZ.append(", workflowId=");
                sbLIZ.append(c07ya.LIZ);
                sbLIZ.append(", runningCount=");
                sbLIZ.append(((C556460Ls4) agS40S1300000_8.l1).LIZLLL.size());
                C201955140j.LIZLLL(c0lx3, "AIGCWorkflowSessionStore", C2188811AlT.LIZIZ(sbLIZ));
                if (zIsEmpty) {
                    Object objEmit = ((C556460Ls4) agS40S1300000_8.l1).LJII.emit(new Object() { // from class: X.0Lsc
                    }, interfaceC1364105Vn);
                    if (objEmit != C099R.LJFF()) {
                        return Unit.LIZ;
                    }
                    return objEmit;
                }
            }
        } else if (!(interfaceC1902607cm instanceof C07Y9) && !(interfaceC1902607cm instanceof C1902207ci) && !(interfaceC1902607cm instanceof C1882707Yz)) {
            if (interfaceC1902607cm instanceof C555990LrJ) {
                C259800zU c259800zU = (C259800zU) agS40S1300000_8.l2;
                C555990LrJ c555990LrJ = (C555990LrJ) interfaceC1902607cm;
                c259800zU.element = C2097608Jq.LJIILIIL((Map) c259800zU.element, new Pair(c555990LrJ.LIZ.LIZ, c555990LrJ.LIZIZ));
                Object objEmit2 = ((C05YC) agS40S1300000_8.l3).emit(new C1346605Ou((Map) ((C259800zU) agS40S1300000_8.l2).element), interfaceC1364105Vn);
                if (objEmit2 == C099R.LJFF()) {
                    return objEmit2;
                }
                return Unit.LIZ;
            }
            if (interfaceC1902607cm instanceof C1902507cl) {
                C1902507cl c1902507cl = (C1902507cl) interfaceC1902607cm;
                Object objEmit3 = ((C556460Ls4) agS40S1300000_8.l1).LIZIZ(agS40S1300000_8.s0, c1902507cl.LIZ).emit(c1902507cl.LIZIZ, interfaceC1364105Vn);
                if (objEmit3 == C099R.LJFF()) {
                    return objEmit3;
                }
                return Unit.LIZ;
            }
        } else if (((C556460Ls4) agS40S1300000_8.l1).LIZ.LIZ) {
            String strLIZ = ((C07ZG) interfaceC1902607cm).LIZ();
            boolean zRemove = ((C556460Ls4) agS40S1300000_8.l1).LIZLLL.remove(strLIZ);
            int size = ((C556460Ls4) agS40S1300000_8.l1).LIZLLL.size();
            C0LX3 c0lx32 = C0LX3.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("stop event=");
            sbLIZ2.append(interfaceC1902607cm.getClass().getSimpleName());
            sbLIZ2.append(", workflowId=");
            sbLIZ2.append(strLIZ);
            sbLIZ2.append(", removed=");
            sbLIZ2.append(zRemove);
            sbLIZ2.append(", remaining=");
            sbLIZ2.append(size);
            C201955140j.LIZLLL(c0lx32, "AIGCWorkflowSessionStore", C2188811AlT.LIZIZ(sbLIZ2));
            if (zRemove && size == 0) {
                Object objEmit4 = ((C556460Ls4) agS40S1300000_8.l1).LJII.emit(C556810Lsd.LIZ, interfaceC1364105Vn);
                if (objEmit4 == C099R.LJFF()) {
                    return objEmit4;
                }
                return Unit.LIZ;
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object emit$1(AgS40S1300000_8 agS40S1300000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS40S1300000_8.LIZ$0((CreateState) obj, interfaceC1364105Vn);
    }

    public AgS40S1300000_8(String str, Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
