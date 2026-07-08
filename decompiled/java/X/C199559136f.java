package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* JADX INFO: renamed from: X.136f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199559136f<K, V> extends AbstractQueue<InterfaceC199564136k<K, V>> {
    public final C199558136e LL = new C199558136e();

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        InterfaceC199564136k<K, V> interfaceC199564136k = this.LL.LL;
        while (true) {
            C199558136e c199558136e = this.LL;
            if (interfaceC199564136k == c199558136e) {
                c199558136e.LL = c199558136e;
                c199558136e.LLILLJJLI = c199558136e;
                return;
            } else {
                InterfaceC199564136k<K, V> interfaceC199564136kLJIIL = interfaceC199564136k.LJIIL();
                C135G c135g = C135G.LL;
                interfaceC199564136k.LJIILLIIL(c135g);
                interfaceC199564136k.LJIIZILJ(c135g);
                interfaceC199564136k = interfaceC199564136kLJIIL;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        C199558136e c199558136e = this.LL;
        return c199558136e.LL == c199558136e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<InterfaceC199564136k<K, V>> iterator() {
        C199558136e c199558136e = this.LL;
        final InterfaceC199564136k<K, V> interfaceC199564136k = c199558136e.LL;
        if (interfaceC199564136k == c199558136e) {
            interfaceC199564136k = null;
        }
        return new AbstractC19853512m5<InterfaceC199564136k<K, V>>(interfaceC199564136k) { // from class: X.136g
            @Override // X.AbstractC19853512m5
            public final InterfaceC199564136k LIZ(Object obj) {
                InterfaceC199564136k<K, V> interfaceC199564136kLJIIL = ((InterfaceC199564136k) obj).LJIIL();
                if (interfaceC199564136kLJIIL == this.LLILLJJLI.LL) {
                    return null;
                }
                return interfaceC199564136kLJIIL;
            }
        };
    }

    @Override // java.util.Queue
    public final Object peek() {
        C199558136e c199558136e = this.LL;
        InterfaceC199564136k<K, V> interfaceC199564136k = c199558136e.LL;
        if (interfaceC199564136k == c199558136e) {
            return null;
        }
        return interfaceC199564136k;
    }

    @Override // java.util.Queue
    public final Object poll() {
        C199558136e c199558136e = this.LL;
        InterfaceC199564136k<K, V> interfaceC199564136k = c199558136e.LL;
        if (interfaceC199564136k == c199558136e) {
            return null;
        }
        remove(interfaceC199564136k);
        return interfaceC199564136k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (InterfaceC199564136k<K, V> interfaceC199564136kLJIIL = this.LL.LL; interfaceC199564136kLJIIL != this.LL; interfaceC199564136kLJIIL = interfaceC199564136kLJIIL.LJIIL()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (((InterfaceC199564136k) obj).LJIIL() != C135G.LL) {
            return true;
        }
        return false;
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
    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC199564136k<K, V> interfaceC199564136k = (InterfaceC199564136k) obj;
        InterfaceC199564136k<K, V> interfaceC199564136kLJFF = interfaceC199564136k.LJFF();
        InterfaceC199564136k<K, V> interfaceC199564136kLJIIL = interfaceC199564136k.LJIIL();
        interfaceC199564136kLJFF.LJIILLIIL(interfaceC199564136kLJIIL);
        interfaceC199564136kLJIIL.LJIIZILJ(interfaceC199564136kLJFF);
        InterfaceC199564136k<K, V> interfaceC199564136k2 = this.LL.LLILLJJLI;
        interfaceC199564136k2.LJIILLIIL(interfaceC199564136k);
        interfaceC199564136k.LJIIZILJ(interfaceC199564136k2);
        C199558136e c199558136e = this.LL;
        interfaceC199564136k.LJIILLIIL(c199558136e);
        c199558136e.LLILLJJLI = interfaceC199564136k;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC199564136k interfaceC199564136k = (InterfaceC199564136k) obj;
        InterfaceC199564136k<K, V> interfaceC199564136kLJFF = interfaceC199564136k.LJFF();
        InterfaceC199564136k<K, V> interfaceC199564136kLJIIL = interfaceC199564136k.LJIIL();
        interfaceC199564136kLJFF.LJIILLIIL(interfaceC199564136kLJIIL);
        interfaceC199564136kLJIIL.LJIIZILJ(interfaceC199564136kLJFF);
        C135G c135g = C135G.LL;
        interfaceC199564136k.LJIILLIIL(c135g);
        interfaceC199564136k.LJIIZILJ(c135g);
        if (interfaceC199564136kLJIIL != c135g) {
            return true;
        }
        return false;
    }
}
