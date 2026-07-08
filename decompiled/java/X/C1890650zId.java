package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0zId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.widget.change.InboxListChangeMonitorService$handlerInternal$1", f = "InboxListChangeMonitorService.kt", l = {}, m = "invokeSuspend")
public final class C1890650zId extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1890620zIa LL;
    public final /* synthetic */ C259800zU<List<InterfaceC1890700zIi>> LLILLJJLI;
    public final /* synthetic */ C259800zU<List<InterfaceC1890700zIi>> LLILLL;
    public final /* synthetic */ C259800zU<List<InterfaceC1890700zIi>> LLILZ;
    public final /* synthetic */ C259800zU<List<InterfaceC1890700zIi>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1890650zId(C1890620zIa c1890620zIa, C259800zU<List<InterfaceC1890700zIi>> c259800zU, C259800zU<List<InterfaceC1890700zIi>> c259800zU2, C259800zU<List<InterfaceC1890700zIi>> c259800zU3, C259800zU<List<InterfaceC1890700zIi>> c259800zU4, InterfaceC1364105Vn<? super C1890650zId> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1890620zIa;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = c259800zU3;
        this.LLILZIL = c259800zU4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1890650zId(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C21341918fZ c21341918fZLIZ;
        C1C7U.LIZ("InboxListChangeMonitorService@28c9.handlerInternal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1890620zIa c1890620zIa = this.LL;
        final List<InterfaceC1890700zIi> list = this.LLILLJJLI.element;
        final List<InterfaceC1890700zIi> list2 = this.LLILLL.element;
        final List<InterfaceC1890700zIi> list3 = this.LLILZ.element;
        final List<InterfaceC1890700zIi> list4 = this.LLILZIL.element;
        c1890620zIa.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle vertical list change, old size:");
        sbLIZ.append(list.size());
        sbLIZ.append(", new size:");
        sbLIZ.append(list2.size());
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2187451AjH.LIZ;
        C21341918fZ c21341918fZLIZ2 = C21342318fd.LIZ(new AbstractC21342018fa(list, list2) { // from class: X.0zIh
            public final List<InterfaceC1890700zIi> LIZ;
            public final List<InterfaceC1890700zIi> LIZIZ;

            @Override // X.AbstractC21342018fa
            public final Object LIZJ(int i2, int i3) {
                return null;
            }

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = list;
                this.LIZIZ = list2;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i2, int i3) {
                if (i2 < this.LIZ.size() && i2 >= 0 && i3 < this.LIZIZ.size() && i3 >= 0) {
                    C1600120rk2 c1600120rk2IsItemChanged = ((InterfaceC1890700zIi) ListProtector.get(this.LIZ, i2)).isItemChanged((InterfaceC1891350zJl) ListProtector.get(this.LIZIZ, i3));
                    if (c1600120rk2IsItemChanged.LIZ) {
                        C0ZB9 c0zb9Biz = ((InterfaceC1890700zIi) ListProtector.get(this.LIZ, i2)).biz();
                        String str = c1600120rk2IsItemChanged.LIZIZ;
                        if (!((Boolean) C0ALT.LIZ.getValue()).booleanValue() || Math.random() < 0.01d) {
                            C2450909j1.LIZ(new AwS158S1100000_9(c0zb9Biz, str, 25));
                        }
                    }
                    return !c1600120rk2IsItemChanged.LIZ;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i2, int i3) {
                if (i2 < this.LIZ.size() && i2 >= 0 && i3 < this.LIZIZ.size() && i3 >= 0) {
                    return Intrinsics.LJFF(((InterfaceC1890700zIi) ListProtector.get(this.LIZ, i2)).itemUniqueId(), ((InterfaceC1890700zIi) ListProtector.get(this.LIZIZ, i3)).itemUniqueId());
                }
                return false;
            }
        }, true);
        if ((!list3.isEmpty()) && (!list4.isEmpty())) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handle horizontal list change, old size:");
            sbLIZ2.append(list3.size());
            sbLIZ2.append(", new size:");
            sbLIZ2.append(list4.size());
            C2188811AlT.LIZIZ(sbLIZ2);
            c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(list3, list4) { // from class: X.0zIh
                public final List<InterfaceC1890700zIi> LIZ;
                public final List<InterfaceC1890700zIi> LIZIZ;

                @Override // X.AbstractC21342018fa
                public final Object LIZJ(int i2, int i3) {
                    return null;
                }

                @Override // X.AbstractC21342018fa
                public final int LIZLLL() {
                    return this.LIZIZ.size();
                }

                @Override // X.AbstractC21342018fa
                public final int LJ() {
                    return this.LIZ.size();
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LIZ = list3;
                    this.LIZIZ = list4;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZ(int i2, int i3) {
                    if (i2 < this.LIZ.size() && i2 >= 0 && i3 < this.LIZIZ.size() && i3 >= 0) {
                        C1600120rk2 c1600120rk2IsItemChanged = ((InterfaceC1890700zIi) ListProtector.get(this.LIZ, i2)).isItemChanged((InterfaceC1891350zJl) ListProtector.get(this.LIZIZ, i3));
                        if (c1600120rk2IsItemChanged.LIZ) {
                            C0ZB9 c0zb9Biz = ((InterfaceC1890700zIi) ListProtector.get(this.LIZ, i2)).biz();
                            String str = c1600120rk2IsItemChanged.LIZIZ;
                            if (!((Boolean) C0ALT.LIZ.getValue()).booleanValue() || Math.random() < 0.01d) {
                                C2450909j1.LIZ(new AwS158S1100000_9(c0zb9Biz, str, 25));
                            }
                        }
                        return !c1600120rk2IsItemChanged.LIZ;
                    }
                    return false;
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZIZ(int i2, int i3) {
                    if (i2 < this.LIZ.size() && i2 >= 0 && i3 < this.LIZIZ.size() && i3 >= 0) {
                        return Intrinsics.LJFF(((InterfaceC1890700zIi) ListProtector.get(this.LIZ, i2)).itemUniqueId(), ((InterfaceC1890700zIi) ListProtector.get(this.LIZIZ, i3)).itemUniqueId());
                    }
                    return false;
                }
            }, true);
        } else {
            c21341918fZLIZ = null;
        }
        c1890620zIa.LIZJ().LIZLLL(list, list2);
        c21341918fZLIZ2.LIZIZ(c1890620zIa.LIZJ().LIZIZ());
        if (c21341918fZLIZ != null) {
            c1890620zIa.LIZJ().LJI(list3, list4);
            c21341918fZLIZ.LIZIZ(c1890620zIa.LIZJ().LJ());
        }
        c1890620zIa.LIZJ().LIZ();
        if (!this.LLILLL.element.isEmpty()) {
            C1890620zIa c1890620zIa2 = this.LL;
            c1890620zIa2.LJ = this.LLILLL.element;
            c1890620zIa2.LJI.remove("vertical_change");
        }
        if (!this.LLILZIL.element.isEmpty()) {
            C1890620zIa c1890620zIa3 = this.LL;
            c1890620zIa3.LJFF = this.LLILZIL.element;
            c1890620zIa3.LJI.remove("horizontal_change");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxListChangeMonitorService@28c9.handlerInternal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
