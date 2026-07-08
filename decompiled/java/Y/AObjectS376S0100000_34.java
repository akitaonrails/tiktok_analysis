package Y;

import X.C098200Yq;
import X.C1699640uKY;
import X.C189200o6;
import X.C2216431Bov;
import X.C2219681BuA;
import X.C2219731BuF;
import X.C2219841BuQ;
import X.C2219981Bue;
import X.C2221081BwQ;
import X.C2221091BwR;
import X.C259800zU;
import X.EnumC2219711BuD;
import X.EnumC2221171BwZ;
import X.EnumC2221181Bwa;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS376S0100000_34 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public AObjectS376S0100000_34(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS376S0100000_34 aObjectS376S0100000_34, Object obj) {
        Object c098200Yq;
        try {
            c098200Yq = ((C2221091BwR) aObjectS376S0100000_34.l0).LJLIIIL((String) obj, EnumC2221171BwZ.LL);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static final Object invoke$1(AObjectS376S0100000_34 aObjectS376S0100000_34, Object obj) {
        Object c098200Yq;
        try {
            c098200Yq = ((C2221081BwQ) aObjectS376S0100000_34.l0).LJLILLLLZI((String) obj, EnumC2221181Bwa.LL);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AObjectS376S0100000_34 aObjectS376S0100000_34, Object obj) {
        ((C259800zU) aObjectS376S0100000_34.l0).element = obj;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS376S0100000_34 aObjectS376S0100000_34, Object obj) {
        C1699640uKY c1699640uKY;
        C2219981Bue c2219981Bue = (C2219981Bue) aObjectS376S0100000_34.l0;
        if ((obj instanceof C1699640uKY) && (c1699640uKY = (C1699640uKY) obj) != null) {
            c2219981Bue.LIZJ.emitJSAPIEvent("onMemoryWarning", new JSONObject().put("level", c1699640uKY.LIZ));
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS376S0100000_34 aObjectS376S0100000_34, Object obj) {
        C2219731BuF c2219731BuF;
        C2219841BuQ c2219841BuQ = (C2219841BuQ) aObjectS376S0100000_34.l0;
        if ((obj instanceof C2219731BuF) && (c2219731BuF = (C2219731BuF) obj) != null) {
            c2219841BuQ.getClass();
        } else {
            C2219681BuA c2219681BuA = c2219841BuQ.LIZ.LJFF;
            c2219681BuA.LJLJJI();
            c2219681BuA.LJLJI();
            c2219731BuF = c2219681BuA.LIZLLL;
        }
        EnumC2219711BuD enumC2219711BuD = c2219731BuF.LIZIZ;
        c2219841BuQ.getClass();
        c2219841BuQ.LIZLLL.emitJSAPIEvent("onNetworkStatusChange", new JSONObject().put("isConnected", c2219731BuF.LIZ).put("networkType", C2219841BuQ.LIZ(enumC2219711BuD)));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS376S0100000_34 aObjectS376S0100000_34, Object obj) {
        C2219731BuF c2219731BuF;
        C2219841BuQ c2219841BuQ = (C2219841BuQ) aObjectS376S0100000_34.l0;
        if ((obj instanceof C2219731BuF) && (c2219731BuF = (C2219731BuF) obj) != null) {
            c2219841BuQ.getClass();
        } else {
            C2219681BuA c2219681BuA = c2219841BuQ.LIZ.LJFF;
            c2219681BuA.LJLJJI();
            c2219681BuA.LJLJI();
            c2219731BuF = c2219681BuA.LIZLLL;
        }
        EnumC2219711BuD enumC2219711BuD = c2219731BuF.LIZIZ;
        c2219841BuQ.getClass();
        c2219841BuQ.LIZLLL.emitJSAPIEvent("onNetworkWeakChange", new JSONObject().put("weakNet", c2219731BuF.LIZJ).put("networkType", C2219841BuQ.LIZ(enumC2219711BuD)));
        return Unit.LIZ;
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
    public static final Object invoke$6(AObjectS376S0100000_34 aObjectS376S0100000_34, Object obj) {
        C2216431Bov c2216431Bov = (C2216431Bov) aObjectS376S0100000_34.l0;
        if (c2216431Bov.LJFF) {
            c2216431Bov.LJ = obj;
        } else {
            c2216431Bov.LIZ = obj;
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                C2216431Bov c2216431Bov2 = (C2216431Bov) aObjectS376S0100000_34.l0;
                c2216431Bov2.LIZIZ.setValue(c2216431Bov2.LIZ);
            } else {
                C2216431Bov c2216431Bov3 = (C2216431Bov) aObjectS376S0100000_34.l0;
                c2216431Bov3.LIZIZ.postValue(c2216431Bov3.LIZ);
            }
        }
        return Unit.LIZ;
    }
}
