package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0xvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1837980xvg extends AbstractC1837770xvL<AbstractC1837700xvE, InterfaceC1837970xvf> {
    public final AbstractC1837700xvE LIZLLL;
    public final C1837750xvJ LJ;

    public abstract C1837640xv8 LIZJ(EnumC1837330xud enumC1837330xud);

    public abstract C1837470xur LIZLLL(EnumC1837330xud enumC1837330xud);

    public abstract C1837660xvA LJ(EnumC1837330xud enumC1837330xud);

    public final void LIZIZ() {
        C1D82 c1d82 = new C1838010xvj(EnumC1837330xud.BIZ_TEMPLATE_FETCH, new AwS571S0100000_27(this, 1161)).LIZIZ;
        C1D82 c1d822 = new C1838010xvj(EnumC1837330xud.GP_PRODUCT_FETCH, new AwS571S0100000_27(this, 1160)).LIZIZ;
        C1D82 c1d823 = new C1838010xvj(EnumC1837330xud.PRE_CHECK, new AwS571S0100000_27(this, 1162)).LIZIZ;
        c1d823.LIZ(c1d82);
        c1d822.LIZ(c1d823);
        C1D82[] c1d82Arr = (C1D82[]) Arrays.copyOf(new C1D82[]{c1d82}, 1);
        String tag = LIZ().getTag();
        C1D82[] c1d82Arr2 = (C1D82[]) Arrays.copyOf(c1d82Arr, c1d82Arr.length);
        C1440550naf c1440550naf = new C1440550naf(tag, (C1D82[]) Arrays.copyOf(c1d82Arr2, c1d82Arr2.length));
        ArrayList arrayList = (ArrayList) c1440550naf.LIZLLL;
        arrayList.add(this.LIZLLL);
        arrayList.add(this.LJ);
        this.LIZIZ = c1440550naf.LIZ();
        C1D80 c1d80 = this.LIZIZ;
        if (c1d80 != null) {
            final String str = c1d80.LJIIJ;
            final InterfaceC1837970xvf interfaceC1837970xvf = (InterfaceC1837970xvf) this.LIZJ;
            c1d80.LIZ(new C2280651EOp(c1d80.LJIIJ, new AbstractC1446660nkW(str, interfaceC1837970xvf) { // from class: X.0xve
                public final Object LJ;
                public final InterfaceC1837970xvf LJFF;

                {
                    super(2, str);
                    this.LJ = str;
                    this.LJFF = interfaceC1837970xvf;
                }

                @Override // X.AbstractC1446660nkW
                public final void LJ(Object obj, C1404610meh c1404610meh) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FetchTaskCallback onStart:  tag=");
                    sbLIZ.append(obj);
                    C20441214yg.LIZIZ("pcs_payment_log", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1837970xvf interfaceC1837970xvf2 = this.LJFF;
                    if (interfaceC1837970xvf2 != null) {
                        interfaceC1837970xvf2.onStart();
                    }
                }

                @Override // X.AbstractC1446660nkW
                public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FetchTaskCallback onCancel: tag=");
                    sbLIZ.append(obj);
                    C20441214yg.LIZIZ("pcs_payment_log", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.AbstractC1446660nkW
                public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
                    AbstractC1837220xuS abstractC1837220xuS;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FetchTaskCallback onFailed:  tag=");
                    sbLIZ.append(obj);
                    C20441214yg.LIZIZ("pcs_payment_log", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1837970xvf interfaceC1837970xvf2 = this.LJFF;
                    if (interfaceC1837970xvf2 != null) {
                        Throwable t = c1435220nS4.getT();
                        if (t instanceof AbstractC1837220xuS) {
                            abstractC1837220xuS = (AbstractC1837220xuS) t;
                        } else {
                            abstractC1837220xuS = null;
                        }
                        interfaceC1837970xvf2.LIZIZ(abstractC1837220xuS);
                    }
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
                @Override // X.AbstractC1446660nkW
                public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
                    C1404610meh c1404610meh;
                    Object next;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FetchTaskCallback onSuccess:  tag=");
                    sbLIZ.append(obj);
                    C20441214yg.LIZIZ("pcs_payment_log", C2188811AlT.LIZIZ(sbLIZ));
                    C1837250xuV c1837250xuV = null;
                    Object obj3 = null;
                    c1837250xuV = null;
                    if ((obj2 instanceof C1404610meh) && (c1404610meh = (C1404610meh) obj2) != null) {
                        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (next instanceof C1837250xuV) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        if (next instanceof C1837250xuV) {
                            obj3 = next;
                        }
                        c1837250xuV = (C1837250xuV) obj3;
                    }
                    InterfaceC1837970xvf interfaceC1837970xvf2 = this.LJFF;
                    if (interfaceC1837970xvf2 != null) {
                        interfaceC1837970xvf2.LIZ(c1837250xuV);
                    }
                }
            }));
            c1d80.LIZ(new C1838040xvm(C1837290xuZ.class, new AwS606S0100000_27(this, 381)));
            c1d80.LIZ(new C1838040xvm(C1837280xuY.class, new AwS606S0100000_27(this, 382)));
            c1d80.LIZ(new C1837310xub(0));
        }
        C1D80 c1d802 = this.LIZIZ;
        if (c1d802 != null) {
            c1d802.LJII();
        }
    }

    public AbstractC1837980xvg(AbstractC1837700xvE abstractC1837700xvE) {
        super(abstractC1837700xvE);
        this.LIZLLL = abstractC1837700xvE;
        this.LJ = new C1837750xvJ(null);
    }
}
