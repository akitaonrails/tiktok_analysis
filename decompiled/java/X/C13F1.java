package X;

import java.util.Map;

/* JADX INFO: renamed from: X.13F1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13F1<K, V> extends C11U2<K, V> implements C08J0 {
    public final C13F2<K, V> LLILLL;
    public V LLILZ;

    @Override // X.C11U2, java.util.Map.Entry
    public final V getValue() {
        return this.LLILZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // X.C11U2, java.util.Map.Entry
    public final V setValue(V v) {
        int iHashCode;
        V v2 = this.LLILZ;
        this.LLILZ = v;
        C13F2<K, V> c13f2 = this.LLILLL;
        K k = this.LL;
        C19978713Ez<K, V, Map.Entry<K, V>> c19978713Ez = c13f2.LL;
        if (c19978713Ez.LLILZ.containsKey(k)) {
            if (c19978713Ez.LLILLL) {
                C13F3 c13f3 = c19978713Ez.LL[c19978713Ez.LLILLJJLI];
                Object obj = c13f3.LL[c13f3.LLILLL];
                c19978713Ez.LLILZ.put(k, v);
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                c19978713Ez.LIZLLL(iHashCode, c19978713Ez.LLILZ.LLILLL, obj, 0);
            } else {
                c19978713Ez.LLILZ.put(k, v);
            }
            c19978713Ez.LLIZ = c19978713Ez.LLILZ.LLILZIL;
        }
        return v2;
    }

    public C13F1(C13F2<K, V> c13f2, K k, V v) {
        super(k, v);
        this.LLILLL = c13f2;
        this.LLILZ = v;
    }
}
