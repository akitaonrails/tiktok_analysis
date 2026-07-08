package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS269S0300000_25;
import njp.a;

/* JADX INFO: renamed from: X.0twp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemComposeKt$ListDataLaunchedEffect$1$1", f = "GiftAnchorPanelGiftPageCenterAssemCompose.kt", l = {601, 618, 629}, m = "invokeSuspend")
public final class C1684930twp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1146350fw9 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1684970twt LLILLL;
    public final /* synthetic */ C1146350fw9 LLILZ;
    public final /* synthetic */ C1146430fwH LLILZIL;
    public final /* synthetic */ C1690050u55 LLILZLL;
    public final /* synthetic */ Function1<C1146350fw9, Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1684930twp(C1684970twt c1684970twt, C1146350fw9 c1146350fw9, C1146430fwH c1146430fwH, C1690050u55 c1690050u55, Function1<? super C1146350fw9, Unit> function1, Function0<Unit> function0, InterfaceC1364105Vn<? super C1684930twp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1684970twt;
        this.LLILZ = c1146350fw9;
        this.LLILZIL = c1146430fwH;
        this.LLILZLL = c1690050u55;
        this.LLIZ = function1;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1684930twp(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1146350fw9 c1146350fw9;
        C1146350fw9 c1146350fw92;
        C1146360fwA c1146360fwA;
        C1146350fw9 c1146350fw93;
        Object next;
        int iLJFF;
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ListDataLaunchedEffect$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1146350fw9 = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1133640fbe.LJIIL(8, this.LLILLL.LIZ, C2286608xc.LJFF(SystemClock.uptimeMillis() - this.LLILLL.LIZIZ), null, 8);
            c1146350fw9 = this.LLILZ;
            if (c1146350fw9 != null) {
                List listLJLIL = C13LP.LJLIL(this.LLILZIL.LIZIZ, C1697810uHb.LJIIL(this.LLILZIL.LIZ));
                int i2 = C1146510fwP.LIZ[this.LLILZIL.LIZJ.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new C1954807lC();
                        }
                    } else if (!c1146350fw9.LLJJIJI) {
                        Iterator it2 = ((ArrayList) listLJLIL).iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            InterfaceC1146480fwM interfaceC1146480fwM = (InterfaceC1146480fwM) it2.next();
                            if ((interfaceC1146480fwM instanceof C1146350fw9) && (c1146350fw93 = (C1146350fw9) interfaceC1146480fwM) != null && c1146350fw93.LL == c1146350fw9.LL) {
                                if (i3 >= 0) {
                                    C1690050u55 c1690050u55 = this.LLILZLL;
                                    int i4 = C1684920two.LJ;
                                    List<InterfaceC1685080tx4> listLJII = c1690050u55.LJIIIZ().LJII();
                                    ArrayList arrayList = new ArrayList();
                                    for (InterfaceC1685080tx4 interfaceC1685080tx4 : listLJII) {
                                        InterfaceC1685080tx4 interfaceC1685080tx42 = interfaceC1685080tx4;
                                        if (C1676820tjk.LIZJ(interfaceC1685080tx42.LJIIL()) + ((int) (interfaceC1685080tx42.LIZ() & 4294967295L)) <= c1690050u55.LJIIIZ().LIZIZ()) {
                                            arrayList.add(interfaceC1685080tx4);
                                        }
                                    }
                                    Iterator it3 = arrayList.iterator();
                                    if (!it3.hasNext()) {
                                        next = null;
                                    } else {
                                        next = it3.next();
                                        if (it3.hasNext()) {
                                            int index = ((InterfaceC1685080tx4) next).getIndex();
                                            do {
                                                Object next2 = it3.next();
                                                int index2 = ((InterfaceC1685080tx4) next2).getIndex();
                                                if (index < index2) {
                                                    next = next2;
                                                    index = index2;
                                                }
                                            } while (it3.hasNext());
                                        }
                                    }
                                    InterfaceC1685080tx4 interfaceC1685080tx43 = (InterfaceC1685080tx4) next;
                                    if (interfaceC1685080tx43 != null) {
                                        iLJFF = interfaceC1685080tx43.getIndex();
                                    } else {
                                        iLJFF = c1690050u55.LJIIIZ().LJFF() - 1;
                                    }
                                    if (iLJFF >= i3 && C1684920two.LJIIIZ(this.LLILZLL) <= i3) {
                                        C1684920two.LJIIJ(this.LLILZIL, this.LLILZLL, this.LLILLL, "click");
                                    } else {
                                        C1684970twt c1684970twt = this.LLILLL;
                                        c1684970twt.LJ.LIZ.LIZ = true;
                                        C1690050u55 c1690050u552 = this.LLILZLL;
                                        AwS269S0300000_25 awS269S0300000_25 = new AwS269S0300000_25(this.LLILZIL, c1690050u552, c1684970twt, 2);
                                        this.LL = c1146350fw9;
                                        this.LLILLJJLI = 2;
                                        if (C1684920two.LJIIJJI(i3, c1684970twt, c1690050u552, listLJLIL, awS269S0300000_25, this) == objLJFF) {
                                            C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ListDataLaunchedEffect$1$1");
                                            return objLJFF;
                                        }
                                    }
                                }
                            } else {
                                i3++;
                            }
                        }
                    } else if (C1684920two.LJIIIZ(this.LLILZLL) != 0) {
                        C1684970twt c1684970twt2 = this.LLILLL;
                        c1684970twt2.LJ.LIZ.LIZ = true;
                        C1690050u55 c1690050u553 = this.LLILZLL;
                        AwS269S0300000_25 awS269S0300000_252 = new AwS269S0300000_25(this.LLILZIL, c1690050u553, c1684970twt2, 3);
                        this.LL = c1146350fw9;
                        this.LLILLJJLI = 3;
                        if (C1684920two.LJIIJJI(0, c1684970twt2, c1690050u553, listLJLIL, awS269S0300000_252, this) == objLJFF) {
                            C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ListDataLaunchedEffect$1$1");
                            return objLJFF;
                        }
                    } else {
                        C1684920two.LJIIJ(this.LLILZIL, this.LLILZLL, this.LLILLL, "click");
                    }
                } else if (!c1146350fw9.LLJJIJI) {
                    Iterator it4 = ((ArrayList) listLJLIL).iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        InterfaceC1146480fwM interfaceC1146480fwM2 = (InterfaceC1146480fwM) it4.next();
                        if ((interfaceC1146480fwM2 instanceof C1146350fw9) && (c1146350fw92 = (C1146350fw9) interfaceC1146480fwM2) != null && c1146350fw92.LL == c1146350fw9.LL) {
                            if (i5 >= 0) {
                                C013C c013c = new C013C();
                                C1146360fwA c1146360fwA2 = this.LLILZIL.LIZ;
                                if (c1146360fwA2 != null) {
                                    c013c.element = c1146360fwA2.LLILZLL.isEmpty();
                                }
                                if (!c013c.element && (c1146360fwA = this.LLILZIL.LIZ) != null && c1146360fwA.LLILZ == 3) {
                                    c013c.element = true;
                                }
                                if (!c013c.element || 1 > i5 || i5 >= 5) {
                                    C1690050u55 c1690050u554 = this.LLILZLL;
                                    this.LL = c1146350fw9;
                                    this.LLILLJJLI = 1;
                                    C1687100u0K c1687100u0K = C1690050u55.LJIL;
                                    if (c1690050u554.LJIIJ(i5, 0, this) == objLJFF) {
                                        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ListDataLaunchedEffect$1$1");
                                        return objLJFF;
                                    }
                                }
                            }
                        } else {
                            i5++;
                        }
                    }
                }
            } else {
                this.LLIZLLLIL.invoke();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ListDataLaunchedEffect$1$1");
                return unit;
            }
        }
        this.LLIZ.invoke(c1146350fw9);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ListDataLaunchedEffect$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
