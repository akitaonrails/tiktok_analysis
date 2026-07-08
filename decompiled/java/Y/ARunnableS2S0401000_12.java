package Y;

import X.AbstractC21342018fa;
import X.C0TA8;
import X.C1C7U;
import X.C21342318fd;
import X.C765900U2q;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS2S0401000_12 implements Runnable {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS2S0401000_12 aRunnableS2S0401000_12) {
        boolean zLIZ;
        C1C7U.LIZ("IBERetryUtil@5c61.performActionWithRetry$1");
        try {
            C0TA8.LIZ((Function1) aRunnableS2S0401000_12.l0, (Function1) aRunnableS2S0401000_12.l1, (Function0) aRunnableS2S0401000_12.l2, aRunnableS2S0401000_12.l3, aRunnableS2S0401000_12.i4 + 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IBERetryUtil@5c61.performActionWithRetry$1");
    }

    public static final void run$1(final ARunnableS2S0401000_12 aRunnableS2S0401000_12) {
        boolean zLIZ;
        C1C7U.LIZ("AsyncListDiffer@ff42.submitList$1");
        try {
            ((C765900U2q) aRunnableS2S0401000_12.l3).LIZJ.execute(new ARunnableS81S0200000_12(aRunnableS2S0401000_12, C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.0U2r
                @Override // X.AbstractC21342018fa
                public final int LIZLLL() {
                    return ((List) this.LIZ.l1).size();
                }

                @Override // X.AbstractC21342018fa
                public final int LJ() {
                    return ((List) this.LIZ.l0).size();
                }

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
                @Override // X.AbstractC21342018fa
                public final boolean LIZ(int i, int i2) {
                    Object obj = ListProtector.get((List) this.LIZ.l0, i);
                    Object obj2 = ListProtector.get((List) this.LIZ.l1, i2);
                    if (obj != null) {
                        if (obj2 != null) {
                            return ((C765900U2q) this.LIZ.l3).LIZIZ.LIZIZ.LIZ(i, i2, obj, obj2);
                        }
                    } else if (obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZIZ(int i, int i2) {
                    Object obj = ListProtector.get((List) this.LIZ.l0, i);
                    Object obj2 = ListProtector.get((List) this.LIZ.l1, i2);
                    if (obj != null) {
                        if (obj2 != null) {
                            return ((C765900U2q) this.LIZ.l3).LIZIZ.LIZIZ.LIZIZ(obj, obj2);
                        }
                        return false;
                    }
                    if (obj2 == null) {
                        return true;
                    }
                    return false;
                }

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
                @Override // X.AbstractC21342018fa
                public final Object LIZJ(int i, int i2) {
                    Object obj = ListProtector.get((List) this.LIZ.l0, i);
                    Object obj2 = ListProtector.get((List) this.LIZ.l1, i2);
                    if (obj != null && obj2 != null) {
                        return ((C765900U2q) this.LIZ.l3).LIZIZ.LIZIZ.LIZJ(i, i2, obj, obj2);
                    }
                    throw new AssertionError();
                }
            }, true), 131));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AsyncListDiffer@ff42.submitList$1");
    }

    public ARunnableS2S0401000_12(C765900U2q c765900U2q, List list, List list2, int i, int i2) {
        this.$t = i2;
        this.l3 = c765900U2q;
        this.l0 = list;
        this.l1 = list2;
        this.i4 = i;
        this.l2 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS2S0401000_12(Function1 function1, Function1<Object, Boolean> function12, Function1<Object, Unit> function13, Function0<Object> function0, Object obj, int i) {
        this.$t = i;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = function13;
        this.l3 = function0;
        this.i4 = obj;
    }
}
