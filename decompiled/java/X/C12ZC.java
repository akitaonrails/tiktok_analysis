package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.12ZC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZC extends AbstractC19899712tX<C12ZD, C12ZC> implements InterfaceC19900412te {
    public final int LJIJJ() {
        return ((C12ZD) this.LLILLJJLI).zzh.size();
    }

    public final String LJJIJ() {
        return ((C12ZD) this.LLILLJJLI).zzu;
    }

    public final List<C12ZI> LJJIJIIJI() {
        return Collections.unmodifiableList(((C12ZD) this.LLILLJJLI).zzh);
    }

    public C12ZC() {
        super(C12ZD.zzc);
    }

    public final void LJJIFFI() {
        LJIIJ();
        C12ZD c12zd = (C12ZD) this.LLILLJJLI;
        int i = C12ZD.LL;
        c12zd.getClass();
        c12zd.zzag = C19886312rN.LLILZ;
    }

    public final void LJJII() {
        LJIIJ();
        C12ZD c12zd = (C12ZD) this.LLILLJJLI;
        int i = C12ZD.LL;
        c12zd.getClass();
        c12zd.zzh = C19886312rN.LLILZ;
    }

    public final void LJJIII() {
        LJIIJ();
        C12ZD.LJLZ((C12ZD) this.LLILLJJLI);
    }

    public final void LJJIIJ() {
        LJIIJ();
        C12ZD.LJL((C12ZD) this.LLILLJJLI);
    }

    public final void LJJIIZ() {
        LJIIJ();
        C12ZD.LJJZ((C12ZD) this.LLILLJJLI);
    }

    public final void LJJIIZI() {
        LJIIJ();
        C12ZD.LJJIFFI((C12ZD) this.LLILLJJLI);
    }

    public final C12ZI LJIIL(int i) {
        return ((C12ZD) this.LLILLJJLI).zzh.get(i);
    }

    public final void LJIILL(C12ZZ c12zz) {
        LJIIJ();
        C12ZD.LJJIIJ((C12ZD) this.LLILLJJLI, c12zz);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJIILLIIL(C19783612ao c19783612ao) {
        LJIIJ();
        C12ZD c12zd = (C12ZD) this.LLILLJJLI;
        AbstractC19899612tW abstractC19899612tWLJI = c19783612ao.LJI();
        int i = C12ZD.LL;
        c12zd.getClass();
        InterfaceC19875012pY<C12ZE> interfaceC19875012pY = c12zd.zzi;
        if (!interfaceC19875012pY.LIZIZ()) {
            c12zd.zzi = AbstractC19899612tW.LJIILIIL(interfaceC19875012pY);
        }
        c12zd.zzi.add((C12ZE) abstractC19899612tWLJI);
    }

    public final void LJIJ(boolean z) {
        LJIIJ();
        C12ZD.LJJIIZ((C12ZD) this.LLILLJJLI, z);
    }

    public final void LJIJI(int i) {
        LJIIJ();
        C12ZD c12zd = (C12ZD) this.LLILLJJLI;
        int i2 = C12ZD.LL;
        c12zd.LJJLIIJ();
        c12zd.zzh.remove(i);
    }

    public final void LJIJJLI(Iterable iterable) {
        LJIIJ();
        C12ZD.LJJIIJZLJL((C12ZD) this.LLILLJJLI, iterable);
    }

    public final void LJIL(int i) {
        LJIIJ();
        C12ZD.LJJLIIIJJIZ((C12ZD) this.LLILLJJLI, i);
    }

    public final void LJJI(int i) {
        LJIIJ();
        C12ZD.LJJLJ((C12ZD) this.LLILLJJLI, i);
    }

    public final void LJJIIJZLJL(String str) {
        LJIIJ();
        C12ZD.LLFF((C12ZD) this.LLILLJJLI, str);
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
    public final void LJIILIIL(int i, C12ZH c12zh) {
        LJIIJ();
        C12ZD c12zd = (C12ZD) this.LLILLJJLI;
        AbstractC19899612tW abstractC19899612tWLJI = c12zh.LJI();
        int i2 = C12ZD.LL;
        c12zd.getClass();
        c12zd.LJJLIIJ();
        c12zd.zzh.set(i, abstractC19899612tWLJI);
    }

    public final void LJIILJJIL(int i, C12ZI c12zi) {
        LJIIJ();
        C12ZD c12zd = (C12ZD) this.LLILLJJLI;
        int i2 = C12ZD.LL;
        c12zd.getClass();
        c12zd.LJJLIIJ();
        c12zd.zzh.set(i, c12zi);
    }
}
