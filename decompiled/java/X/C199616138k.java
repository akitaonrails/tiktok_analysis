package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* JADX INFO: renamed from: X.138k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199616138k<K, V> extends AbstractQueue<InterfaceC199613138h<K, V>> {
    public final AnonymousClass1393 LL = new AnonymousClass1393();

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        InterfaceC199613138h<K, V> interfaceC199613138h = this.LL.LL;
        while (true) {
            AnonymousClass1393 anonymousClass1393 = this.LL;
            if (interfaceC199613138h == anonymousClass1393) {
                anonymousClass1393.LL = anonymousClass1393;
                anonymousClass1393.LLILLJJLI = anonymousClass1393;
                return;
            } else {
                InterfaceC199613138h<K, V> interfaceC199613138hLJIIL = interfaceC199613138h.LJIIL();
                EnumC199623138r enumC199623138r = EnumC199623138r.LL;
                interfaceC199613138h.LJIJI(enumC199623138r);
                interfaceC199613138h.LJIJ(enumC199623138r);
                interfaceC199613138h = interfaceC199613138hLJIIL;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        AnonymousClass1393 anonymousClass1393 = this.LL;
        return anonymousClass1393.LL == anonymousClass1393;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<InterfaceC199613138h<K, V>> iterator() {
        AnonymousClass1393 anonymousClass1393 = this.LL;
        final InterfaceC199613138h<K, V> interfaceC199613138h = anonymousClass1393.LL;
        if (interfaceC199613138h == anonymousClass1393) {
            interfaceC199613138h = null;
        }
        return new AbstractC1304900k3s<InterfaceC199613138h<K, V>>(interfaceC199613138h) { // from class: X.1397
            @Override // X.AbstractC1304900k3s
            public final InterfaceC199613138h LIZ(Object obj) {
                InterfaceC199613138h<K, V> interfaceC199613138hLJIIL = ((InterfaceC199613138h) obj).LJIIL();
                if (interfaceC199613138hLJIIL == this.LLILLJJLI.LL) {
                    return null;
                }
                return interfaceC199613138hLJIIL;
            }
        };
    }

    @Override // java.util.Queue
    public final Object peek() {
        AnonymousClass1393 anonymousClass1393 = this.LL;
        InterfaceC199613138h<K, V> interfaceC199613138h = anonymousClass1393.LL;
        if (interfaceC199613138h == anonymousClass1393) {
            return null;
        }
        return interfaceC199613138h;
    }

    @Override // java.util.Queue
    public final Object poll() {
        AnonymousClass1393 anonymousClass1393 = this.LL;
        InterfaceC199613138h<K, V> interfaceC199613138h = anonymousClass1393.LL;
        if (interfaceC199613138h == anonymousClass1393) {
            return null;
        }
        remove(interfaceC199613138h);
        return interfaceC199613138h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (InterfaceC199613138h<K, V> interfaceC199613138hLJIIL = this.LL.LL; interfaceC199613138hLJIIL != this.LL; interfaceC199613138hLJIIL = interfaceC199613138hLJIIL.LJIIL()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (((InterfaceC199613138h) obj).LJIIL() != EnumC199623138r.LL) {
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
        InterfaceC199613138h<K, V> interfaceC199613138h = (InterfaceC199613138h) obj;
        InterfaceC199613138h<K, V> interfaceC199613138hLJFF = interfaceC199613138h.LJFF();
        InterfaceC199613138h<K, V> interfaceC199613138hLJIIL = interfaceC199613138h.LJIIL();
        interfaceC199613138hLJFF.LJIJI(interfaceC199613138hLJIIL);
        interfaceC199613138hLJIIL.LJIJ(interfaceC199613138hLJFF);
        InterfaceC199613138h<K, V> interfaceC199613138h2 = this.LL.LLILLJJLI;
        interfaceC199613138h2.LJIJI(interfaceC199613138h);
        interfaceC199613138h.LJIJ(interfaceC199613138h2);
        AnonymousClass1393 anonymousClass1393 = this.LL;
        interfaceC199613138h.LJIJI(anonymousClass1393);
        anonymousClass1393.LLILLJJLI = interfaceC199613138h;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC199613138h interfaceC199613138h = (InterfaceC199613138h) obj;
        InterfaceC199613138h<K, V> interfaceC199613138hLJFF = interfaceC199613138h.LJFF();
        InterfaceC199613138h<K, V> interfaceC199613138hLJIIL = interfaceC199613138h.LJIIL();
        interfaceC199613138hLJFF.LJIJI(interfaceC199613138hLJIIL);
        interfaceC199613138hLJIIL.LJIJ(interfaceC199613138hLJFF);
        EnumC199623138r enumC199623138r = EnumC199623138r.LL;
        interfaceC199613138h.LJIJI(enumC199623138r);
        interfaceC199613138h.LJIJ(enumC199623138r);
        if (interfaceC199613138hLJIIL != enumC199623138r) {
            return true;
        }
        return false;
    }
}
