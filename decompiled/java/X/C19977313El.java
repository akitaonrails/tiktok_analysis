package X;

import java.util.Map;

/* JADX INFO: renamed from: X.13El, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19977313El<K, V> extends C11U4<K, V> implements C08J0 {
    public final C19977613Eo<K, V> LLILLL;
    public V LLILZ;

    @Override // X.C11U4, java.util.Map.Entry
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
    @Override // X.C11U4, java.util.Map.Entry
    public final V setValue(V v) {
        int iHashCode;
        V v2 = this.LLILZ;
        this.LLILZ = v;
        C19977613Eo<K, V> c19977613Eo = this.LLILLL;
        K k = this.LL;
        C19977413Em<K, V, Map.Entry<K, V>> c19977413Em = c19977613Eo.LL;
        if (c19977413Em.LLILZ.containsKey(k)) {
            if (c19977413Em.LLILLL) {
                AbstractC19977713Ep abstractC19977713Ep = c19977413Em.LL[c19977413Em.LLILLJJLI];
                Object obj = abstractC19977713Ep.LL[abstractC19977713Ep.LLILLL];
                c19977413Em.LLILZ.put(k, v);
                if (obj == null) {
                    iHashCode = 0;
                } else {
                    iHashCode = obj.hashCode();
                }
                c19977413Em.LIZLLL(iHashCode, c19977413Em.LLILZ.LLILLL, obj, 0);
            } else {
                c19977413Em.LLILZ.put(k, v);
            }
            c19977413Em.LLIZ = c19977413Em.LLILZ.LLILZIL;
        }
        return v2;
    }

    public C19977313El(C19977613Eo<K, V> c19977613Eo, K k, V v) {
        super(k, v);
        this.LLILLL = c19977613Eo;
        this.LLILZ = v;
    }
}
