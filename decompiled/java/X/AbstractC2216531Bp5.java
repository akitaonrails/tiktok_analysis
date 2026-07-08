package X;

import X.C05YF;
import android.os.Looper;
import com.bytedance.creationmodel.framework.ScopeKey;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import om3.q;

/* JADX INFO: renamed from: X.1Bp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2216531Bp5<T extends C05YF, SUB_MODEL extends q> extends AbstractC2255721DQs<T> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), ScopeKey.class, null);
    public final C2216441Bow LLILLL;
    public final InterfaceC1731706qJ LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC2216531Bp5.class, "scopeKey", "getScopeKey()Lcom/bytedance/creationmodel/framework/ScopeKey;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC2216531Bp5.class, "scopeTypeValue", "getScopeTypeValue()Lcom/bytedance/creationmodel/core/ScopeTypeValue;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZLL = 8;
    }

    public static /* synthetic */ void G2() {
    }

    public static /* synthetic */ void X1() {
    }

    public final C1456610o0Z H2() {
        return (C1456610o0Z) this.LLILZ.getValue(this, LLILZIL[1]);
    }

    public Class<SUB_MODEL> T2() {
        throw new IllegalArgumentException("Child DataComponent must override modelPropertyBuilder");
    }

    public C2216661BpI Z1() {
        throw new IllegalArgumentException("Child DataComponent must override modelPropertyBuilder");
    }

    /* JADX WARN: Incorrect return type in method signature: <T::LX/1Bou;>()TT; */
    public final InterfaceC2216421Bou o2() {
        C2216441Bow c2216441Bow = this.LLILLL;
        H2();
        Z1();
        Intrinsics.LJIILIIL();
        throw null;
    }

    public final ScopeKey w2() {
        return (ScopeKey) this.LLILLJJLI.getValue(this, LLILZIL[0]);
    }

    public final C2216441Bow W1() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public AbstractC2216531Bp5(C1DRG c1drg) {
        this.LL = c1drg;
        C2216441Bow c2216441BowLIZ = C2216321Bok.LIZ.LIZ(w2());
        if (c2216441BowLIZ != null) {
            this.LLILLL = c2216441BowLIZ;
            this.LLILZ = C1664770tQJ.LIZ(getDiContainer(), C1456610o0Z.class, null);
            return;
        }
        throw new IllegalArgumentException("CreationScope not found");
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
    public final void W2(Function0<Unit> function0) {
        C2216441Bow c2216441Bow = this.LLILLL;
        Iterator it2 = ((HashMap) c2216441Bow.LJFF).values().iterator();
        while (it2.hasNext()) {
            ((C2216431Bov) it2.next()).LJFF = true;
        }
        function0.invoke();
        for (C2216431Bov c2216431Bov : ((HashMap) c2216441Bow.LJFF).values()) {
            c2216431Bov.LJFF = false;
            c2216431Bov.LIZ = c2216431Bov.LJ;
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                c2216431Bov.LIZIZ.setValue(c2216431Bov.LIZ);
            } else {
                c2216431Bov.LIZIZ.postValue(c2216431Bov.LIZ);
            }
        }
    }
}
