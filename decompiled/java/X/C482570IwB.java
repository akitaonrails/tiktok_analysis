package X;

import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.toplive.vm.ToplivePageListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0IwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.toplive.vm.ToplivePageListViewModel$refreshSections$1$1", f = "ToplivePageListViewModel.kt", l = {69}, m = "invokeSuspend")
public final class C482570IwB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ ToplivePageListViewModel LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C482570IwB(ToplivePageListViewModel toplivePageListViewModel, List<String> list, InterfaceC1364105Vn<? super C482570IwB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = toplivePageListViewModel;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C482570IwB(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        boolean z;
        List list;
        ArrayList arrayList2;
        boolean z2;
        int iNextIndex;
        C1C7U.LIZ("ToplivePageListViewModel@1c07.refreshSections$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    List list2 = (List) this.LL;
                    C155000ia.LIZIZ(obj);
                    list = list2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C482550Iw9 c482550Iw9 = (C482550Iw9) this.LLILLL.getState();
                c482550Iw9.getClass();
                List<AbstractC482420Ivw> list3 = c482550Iw9.getListState().LLILZ;
                if (list3 != null) {
                    arrayList = new ArrayList(list3);
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ToplivePageListViewModel@1c07.refreshSections$1$1");
                    return unit;
                }
                InterfaceC482530Iw7 interfaceC482530Iw7 = (InterfaceC482530Iw7) this.LLILLL.LLILLJJLI.getValue().getOperator();
                List<String> list4 = this.LLILZ;
                EnumC482480Iw2 enumC482480Iw2 = EnumC482480Iw2.AUTO_REFRESH;
                this.LL = arrayList;
                this.LLILLJJLI = 1;
                obj = interfaceC482530Iw7.o(list4, enumC482480Iw2, this);
                list = arrayList;
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ToplivePageListViewModel@1c07.refreshSections$1$1");
                    return objLJFF;
                }
            }
            BaseListResponse baseListResponse = (BaseListResponse) obj;
            for (String str : this.LLILZ) {
                List<T> list5 = baseListResponse.data;
                if (list5 != 0) {
                    arrayList2 = new ArrayList();
                    for (Object obj2 : list5) {
                        if (Intrinsics.LJFF(((AbstractC482420Ivw) obj2).LLILLJJLI, str)) {
                            arrayList2.add(obj2);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    Iterator it2 = list.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (Intrinsics.LJFF(((AbstractC482420Ivw) it2.next()).LLILLJJLI, str)) {
                                break;
                            }
                            i2++;
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (Intrinsics.LJFF(((AbstractC482420Ivw) listIterator.previous()).LLILLJJLI, str)) {
                                iNextIndex = listIterator.nextIndex();
                                break;
                            }
                        } else {
                            iNextIndex = -1;
                            break;
                        }
                    }
                    if (i2 != -1 && iNextIndex != -1) {
                        if (i2 <= iNextIndex) {
                            while (true) {
                                list.remove(iNextIndex);
                                if (iNextIndex == i2) {
                                    break;
                                }
                                iNextIndex--;
                            }
                        }
                        list.addAll(i2, arrayList2);
                    }
                }
            }
            this.LLILLL.listSetItems(list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ToplivePageListViewModel@1c07.refreshSections$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
