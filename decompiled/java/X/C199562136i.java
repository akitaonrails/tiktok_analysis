package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* JADX INFO: renamed from: X.136i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199562136i<K, V> extends AbstractQueue<InterfaceC199564136k<K, V>> {
    public final C199561136h LL = new C199561136h();

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        InterfaceC199564136k<K, V> interfaceC199564136k = this.LL.LL;
        while (true) {
            C199561136h c199561136h = this.LL;
            if (interfaceC199564136k == c199561136h) {
                c199561136h.LL = c199561136h;
                c199561136h.LLILLJJLI = c199561136h;
                return;
            } else {
                InterfaceC199564136k<K, V> interfaceC199564136kLJI = interfaceC199564136k.LJI();
                C135G c135g = C135G.LL;
                interfaceC199564136k.LJIJ(c135g);
                interfaceC199564136k.LJIJI(c135g);
                interfaceC199564136k = interfaceC199564136kLJI;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        C199561136h c199561136h = this.LL;
        return c199561136h.LL == c199561136h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<InterfaceC199564136k<K, V>> iterator() {
        C199561136h c199561136h = this.LL;
        final InterfaceC199564136k<K, V> interfaceC199564136k = c199561136h.LL;
        if (interfaceC199564136k == c199561136h) {
            interfaceC199564136k = null;
        }
        return new AbstractC19853512m5<InterfaceC199564136k<K, V>>(interfaceC199564136k) { // from class: X.136j
            @Override // X.AbstractC19853512m5
            public final InterfaceC199564136k LIZ(Object obj) {
                InterfaceC199564136k<K, V> interfaceC199564136kLJI = ((InterfaceC199564136k) obj).LJI();
                if (interfaceC199564136kLJI == this.LLILLJJLI.LL) {
                    return null;
                }
                return interfaceC199564136kLJI;
            }
        };
    }

    @Override // java.util.Queue
    public final Object peek() {
        C199561136h c199561136h = this.LL;
        InterfaceC199564136k<K, V> interfaceC199564136k = c199561136h.LL;
        if (interfaceC199564136k == c199561136h) {
            return null;
        }
        return interfaceC199564136k;
    }

    @Override // java.util.Queue
    public final Object poll() {
        C199561136h c199561136h = this.LL;
        InterfaceC199564136k<K, V> interfaceC199564136k = c199561136h.LL;
        if (interfaceC199564136k == c199561136h) {
            return null;
        }
        remove(interfaceC199564136k);
        return interfaceC199564136k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (InterfaceC199564136k<K, V> interfaceC199564136kLJI = this.LL.LL; interfaceC199564136kLJI != this.LL; interfaceC199564136kLJI = interfaceC199564136kLJI.LJI()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (((InterfaceC199564136k) obj).LJI() != C135G.LL) {
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
        InterfaceC199564136k<K, V> interfaceC199564136kLJIIJ = interfaceC199564136k.LJIIJ();
        InterfaceC199564136k<K, V> interfaceC199564136kLJI = interfaceC199564136k.LJI();
        interfaceC199564136kLJIIJ.LJIJ(interfaceC199564136kLJI);
        interfaceC199564136kLJI.LJIJI(interfaceC199564136kLJIIJ);
        InterfaceC199564136k<K, V> interfaceC199564136k2 = this.LL.LLILLJJLI;
        interfaceC199564136k2.LJIJ(interfaceC199564136k);
        interfaceC199564136k.LJIJI(interfaceC199564136k2);
        C199561136h c199561136h = this.LL;
        interfaceC199564136k.LJIJ(c199561136h);
        c199561136h.LLILLJJLI = interfaceC199564136k;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC199564136k interfaceC199564136k = (InterfaceC199564136k) obj;
        InterfaceC199564136k<K, V> interfaceC199564136kLJIIJ = interfaceC199564136k.LJIIJ();
        InterfaceC199564136k<K, V> interfaceC199564136kLJI = interfaceC199564136k.LJI();
        interfaceC199564136kLJIIJ.LJIJ(interfaceC199564136kLJI);
        interfaceC199564136kLJI.LJIJI(interfaceC199564136kLJIIJ);
        C135G c135g = C135G.LL;
        interfaceC199564136k.LJIJ(c135g);
        interfaceC199564136k.LJIJI(c135g);
        if (interfaceC199564136kLJI != c135g) {
            return true;
        }
        return false;
    }
}
