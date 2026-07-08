package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0xvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1837990xvh extends AbstractC1837770xvL<AbstractC1837710xvF, InterfaceC1838000xvi> {
    public abstract C1837600xv4 LIZJ(EnumC1837330xud enumC1837330xud);

    public abstract C1837490xut LIZLLL(EnumC1837330xud enumC1837330xud);

    public abstract C1792380wk8 LJ(EnumC1837330xud enumC1837330xud);

    public final void LIZIZ() {
        C1D82 c1d82 = new C1838010xvj(EnumC1837330xud.BIZ_CREATE_ORDER, new AwS571S0100000_27(this, 1172)).LIZIZ;
        C1D82 c1d822 = new C1838010xvj(EnumC1837330xud.GP_PAYMENT, new AwS571S0100000_27(this, 1173)).LIZIZ;
        c1d822.LIZ(c1d82);
        new C1838010xvj(EnumC1837330xud.BIZ_CHECK_ORDER, new AwS571S0100000_27(this, 1171)).LIZIZ.LIZ(c1d822);
        C1D82[] c1d82Arr = (C1D82[]) Arrays.copyOf(new C1D82[]{c1d82}, 1);
        String tag = LIZ().getTag();
        C1D82[] c1d82Arr2 = (C1D82[]) Arrays.copyOf(c1d82Arr, c1d82Arr.length);
        C1440550naf c1440550naf = new C1440550naf(tag, (C1D82[]) Arrays.copyOf(c1d82Arr2, c1d82Arr2.length));
        ((ArrayList) c1440550naf.LIZLLL).add(this.LIZ);
        this.LIZIZ = c1440550naf.LIZ();
        C1D80 c1d80 = this.LIZIZ;
        if (c1d80 != null) {
            final String str = c1d80.LJIIJ;
            final InterfaceC1838000xvi interfaceC1838000xvi = (InterfaceC1838000xvi) this.LIZJ;
            c1d80.LIZ(new C2280651EOp(c1d80.LJIIJ, new AbstractC1446660nkW(str, interfaceC1838000xvi) { // from class: X.0xvd
                public final Object LJ;
                public final InterfaceC1838000xvi LJFF;

                {
                    super(2, str);
                    this.LJ = str;
                    this.LJFF = interfaceC1838000xvi;
                }

                @Override // X.AbstractC1446660nkW
                public final void LJ(Object obj, C1404610meh c1404610meh) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PurchaseServiceObserver onStart:  tag=");
                    sbLIZ.append(obj);
                    C20441214yg.LIZIZ("pcs_payment_log", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1838000xvi interfaceC1838000xvi2 = this.LJFF;
                    if (interfaceC1838000xvi2 != null) {
                        interfaceC1838000xvi2.onStart();
                    }
                }

                @Override // X.AbstractC1446660nkW
                public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PurchaseServiceObserver onCancel: tag=");
                    sbLIZ.append(obj);
                    C20441214yg.LIZIZ("pcs_payment_log", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.AbstractC1446660nkW
                public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
                    AbstractC1837350xuf abstractC1837350xuf;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PurchaseServiceObserver onFailed:  tag=");
                    sbLIZ.append(obj);
                    C20441214yg.LIZIZ("pcs_payment_log", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1838000xvi interfaceC1838000xvi2 = this.LJFF;
                    if (interfaceC1838000xvi2 != null) {
                        Throwable t = c1435220nS4.getT();
                        if (t instanceof AbstractC1837350xuf) {
                            abstractC1837350xuf = (AbstractC1837350xuf) t;
                        } else {
                            abstractC1837350xuf = null;
                        }
                        interfaceC1838000xvi2.LIZ(abstractC1837350xuf);
                    }
                }

                @Override // X.AbstractC1446660nkW
                public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
                    C1404610meh c1404610meh;
                    Object next;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PurchaseServiceObserver onSuccess:  tag=");
                    sbLIZ.append(obj);
                    C20441214yg.LIZIZ("pcs_payment_log", C2188811AlT.LIZIZ(sbLIZ));
                    if ((obj2 instanceof C1404610meh) && (c1404610meh = (C1404610meh) obj2) != null) {
                        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (next instanceof C1193004lc) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        boolean z2 = next instanceof C1193004lc;
                    }
                    InterfaceC1838000xvi interfaceC1838000xvi2 = this.LJFF;
                    if (interfaceC1838000xvi2 != null) {
                        interfaceC1838000xvi2.LIZLLL();
                    }
                }
            }));
            c1d80.LIZ(new C1838040xvm(C1837940xvc.class, new AwS606S0100000_27(this, 387)));
            c1d80.LIZ(new C1838040xvm(AbstractC1837390xuj.class, new AwS606S0100000_27(this, 388)));
            c1d80.LIZ(new C1837310xub(0));
        }
        C1D80 c1d802 = this.LIZIZ;
        if (c1d802 != null) {
            c1d802.LJII();
        }
    }

    public AbstractC1837990xvh(AbstractC1837710xvF abstractC1837710xvF) {
        super(abstractC1837710xvF);
    }
}
