package X;

import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532390pyn<E> {
    public final Function1<E, Integer> LIZ;
    public Object[] LIZIZ;
    public int LIZJ;

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
    public final E LIZIZ() {
        int iIntValue;
        int i = this.LIZJ;
        if (i == 0) {
            return null;
        }
        Object[] objArr = this.LIZIZ;
        int i2 = 1;
        E e = (E) objArr[1];
        Object obj = objArr[i];
        objArr[i] = null;
        int i3 = i - 1;
        this.LIZJ = i3;
        if (i3 > 0) {
            objArr[1] = obj;
            int iIntValue2 = ((Number) this.LIZ.invoke(obj)).intValue();
            int i4 = this.LIZJ >>> 1;
            while (i2 <= i4) {
                int i5 = i2 << 1;
                int iIntValue3 = ((Number) this.LIZ.invoke(this.LIZIZ[i5])).intValue();
                int i6 = i5 + 1;
                if (i6 <= this.LIZJ && (iIntValue = ((Number) this.LIZ.invoke(this.LIZIZ[i6])).intValue()) < iIntValue3) {
                    i5 = i6;
                    iIntValue3 = iIntValue;
                }
                if (iIntValue2 <= iIntValue3) {
                    break;
                }
                Object[] objArr2 = this.LIZIZ;
                objArr2[i2] = objArr2[i5];
                i2 = i5;
            }
            this.LIZIZ[i2] = obj;
        }
        return e;
    }

    public final void LIZ(Pair pair) {
        int i = this.LIZJ + 1;
        int i2 = i + 1;
        Object[] objArr = this.LIZIZ;
        if (i2 > objArr.length) {
            this.LIZIZ = Arrays.copyOf(this.LIZIZ, Math.max(i2, objArr.length + (objArr.length >>> 1)));
        }
        this.LIZIZ[i] = pair;
        this.LIZJ = i;
        int iIntValue = this.LIZ.invoke(pair).intValue();
        while (i > 1) {
            int i3 = i >>> 1;
            if (iIntValue >= this.LIZ.invoke((E) this.LIZIZ[i3]).intValue()) {
                break;
            }
            Object[] objArr2 = this.LIZIZ;
            objArr2[i] = objArr2[i3];
            i = i3;
        }
        this.LIZIZ[i] = pair;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1532390pyn(int i, Function1<? super E, Integer> function1) {
        this.LIZ = function1;
        this.LIZIZ = new Object[i + 1];
    }
}
