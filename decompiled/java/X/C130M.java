package X;

import X.AbstractC19933512yz;
import X.InterfaceC19933112yv;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.protobuf.k0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.130M, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C130M<MType extends k0, BType extends AbstractC19933512yz, IType extends InterfaceC19933112yv> implements InterfaceC19935412zI {
    public InterfaceC19935412zI LIZ;
    public InterfaceC19921012wy<MType> LIZIZ;
    public boolean LIZJ;

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
    public final InterfaceC19921012wy LIZLLL() {
        this.LIZJ = true;
        if (!this.LIZIZ.LJJLIL()) {
            return this.LIZIZ;
        }
        if (!this.LIZIZ.LJJLIL()) {
            for (int i = 0; i < this.LIZIZ.size(); i++) {
                MType mtype = this.LIZIZ.get(i);
                C130N c130n = (C130N) ListProtector.get(null, i);
                if (c130n == null || c130n.LIZIZ() == mtype) {
                }
            }
            return this.LIZIZ;
        }
        LJ();
        for (int i2 = 0; i2 < this.LIZIZ.size(); i2++) {
            this.LIZIZ.set(i2, LJI(i2));
        }
        this.LIZIZ.LJJLIIIJL();
        return this.LIZIZ;
    }

    @Override // X.InterfaceC19935412zI
    public final void LIZ() {
        InterfaceC19935412zI interfaceC19935412zI;
        if (!this.LIZJ || (interfaceC19935412zI = this.LIZ) == null) {
            return;
        }
        interfaceC19935412zI.LIZ();
        this.LIZJ = false;
    }

    public final void LJ() {
        if (this.LIZIZ.LJJLIL()) {
            return;
        }
        InterfaceC19921012wy<MType> interfaceC19921012wy = this.LIZIZ;
        this.LIZIZ = interfaceC19921012wy.LJIILL2(interfaceC19921012wy.size());
    }

    public final int LJFF() {
        return this.LIZIZ.size();
    }

    public final boolean LJII() {
        return this.LIZIZ.isEmpty();
    }

    public final void LIZIZ(Iterable iterable) {
        int size;
        InterfaceC19935412zI interfaceC19935412zI;
        for (Object obj : iterable) {
            Charset charset = C19922012x8.LIZ;
            obj.getClass();
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return;
            } else {
                size = collection.size();
            }
        } else {
            size = -1;
        }
        LJ();
        if (size >= 0) {
            InterfaceC19921012wy<MType> interfaceC19921012wy = this.LIZIZ;
            if (interfaceC19921012wy instanceof ArrayList) {
                ((ArrayList) interfaceC19921012wy).ensureCapacity(interfaceC19921012wy.size() + size);
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            LIZJ((k0) it2.next());
        }
        if (this.LIZJ && (interfaceC19935412zI = this.LIZ) != null) {
            interfaceC19935412zI.LIZ();
            this.LIZJ = false;
        }
    }

    public final void LIZJ(k0 k0Var) {
        InterfaceC19935412zI interfaceC19935412zI;
        Charset charset = C19922012x8.LIZ;
        k0Var.getClass();
        LJ();
        this.LIZIZ.add(k0Var);
        if (this.LIZJ && (interfaceC19935412zI = this.LIZ) != null) {
            interfaceC19935412zI.LIZ();
            this.LIZJ = false;
        }
    }

    public final k0 LJI(int i) {
        return this.LIZIZ.get(i);
    }

    public C130M(List list, AbstractC19933512yz.a aVar, boolean z) {
        InterfaceC19921012wy<MType> interfaceC19921012wy;
        if (list instanceof InterfaceC19921012wy) {
            interfaceC19921012wy = (InterfaceC19921012wy) list;
        } else {
            C19888012re<Object> c19888012reLJIILL = C19888012re.LLILZIL.LJIILL(list.size());
            c19888012reLJIILL.addAll(list);
            interfaceC19921012wy = c19888012reLJIILL;
        }
        this.LIZIZ = interfaceC19921012wy;
        this.LIZ = aVar;
        this.LIZJ = z;
    }
}
