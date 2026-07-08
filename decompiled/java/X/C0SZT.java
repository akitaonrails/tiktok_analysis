package X;

import X.C03H5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SZT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SZT<R extends C03H5, ITEM> implements C0RF2<R, ITEM> {
    public final C01GW LIZ;

    public final CopyOnWriteArrayList<C0SZS<?, ?>> LIZLLL() {
        return (CopyOnWriteArrayList) this.LIZ.getValue();
    }

    public C0SZT(AbstractC21673619ry<?> abstractC21673619ry) {
        abstractC21673619ry.registerAdapterDataObserver(new AbstractC471570IeR(this) { // from class: X.0SZV
            public final /* synthetic */ C0SZT<R, ITEM> LIZ;

            {
                this.LIZ = this;
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
            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                if (i >= 0 && i2 > 0) {
                    this.LIZ.LJ(i, i2);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC471570IeR
            public final void LJ(int i, int i2) {
                C0SZT<R, ITEM> c0szt = this.LIZ;
                int size = c0szt.LIZLLL().size();
                if (i2 >= 0 && i2 < size && i != i2) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, c0szt.LIZLLL());
                    c0szt.LIZLLL().remove(objLJJJLZIJ);
                    c0szt.LIZLLL().add(i2, objLJJJLZIJ);
                }
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i, int i2) {
                C0SZT<R, ITEM> c0szt = this.LIZ;
                if (c0szt.LIZLLL().size() > i) {
                    int i3 = i2 + i;
                    int size = c0szt.LIZLLL().size();
                    if (i3 > size) {
                        i3 = size;
                    }
                    Iterator<C0SZS<?, ?>> it2 = c0szt.LIZLLL().subList(i, i3).iterator();
                    while (it2.hasNext()) {
                        it2.next();
                        c0szt.LIZLLL().remove(i);
                    }
                }
            }
        });
        this.LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(406));
    }

    public final void LJ(int i, int i2) {
        C0SZS[] c0szsArr = new C0SZS[i2];
        Arrays.fill(c0szsArr, (Object) null);
        if (LIZLLL().size() >= i) {
            LIZLLL().addAll(i, C13LQ.LJJLL(c0szsArr));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    @Override // X.C0RF2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.InterfaceC1587906Jp r15, X.C0SMO<?, ?> r16, int r17, java.util.List<? extends java.lang.Object> r18) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SZT.LIZIZ(X.06Jp, X.0SMO, int, java.util.List):void");
    }
}
