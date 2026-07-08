package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453230nv7 {
    public static final List<FilterBean> LJFF(InterfaceC1640320sms interfaceC1640320sms) {
        List<FilterBean> list = (List) interfaceC1640320sms.LJI().getValue();
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public static final EffectCategoryResponse LIZ(FilterBean filterBean, InterfaceC1640320sms interfaceC1640320sms) {
        Object next;
        Object first;
        List list = (List) interfaceC1640320sms.LIZ().getValue();
        if (list != null) {
            AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(filterBean, 636);
            C1638440sjq c1638440sjq = C1638720skI.LIZ;
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Iterator it3 = ((Iterable) ((Pair) next).getSecond()).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next2 = it3.next();
                            if (((Boolean) awS601S0100000_22.invoke(next2)).booleanValue()) {
                                if (next2 != null) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Pair pair = (Pair) next;
            if (pair != null) {
                first = pair.getFirst();
            } else {
                first = null;
            }
            EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) first;
            if (effectCategoryResponse == null) {
                Pair pair2 = (Pair) C13LP.LJJJLZIJ(0, list);
                if (pair2 != null) {
                    return (EffectCategoryResponse) pair2.getFirst();
                }
            } else {
                return effectCategoryResponse;
            }
        }
        return null;
    }

    public static final FilterBean LIZIZ(InterfaceC1640320sms interfaceC1640320sms, String str) {
        List list = (List) interfaceC1640320sms.LJFF().getValue();
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((FilterBean) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (FilterBean) obj;
    }

    public static final FilterBean LIZLLL(InterfaceC1640320sms interfaceC1640320sms, int i) {
        int size;
        FilterBean filterBean;
        List list = (List) interfaceC1640320sms.LJI().getValue();
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        int iLIZIZ = C419990GdR.LIZIZ(i, 0, Math.max(size - 1, 0));
        if (list == null || (filterBean = (FilterBean) C13LP.LJJJLZIJ(iLIZIZ, list)) == null) {
            return C1638720skI.LIZLLL();
        }
        return filterBean;
    }

    public static final FilterBean LJ(InterfaceC1640320sms interfaceC1640320sms, String str) {
        List list = (List) interfaceC1640320sms.LJFF().getValue();
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((FilterBean) next).getResId(), str)) {
                obj = next;
                break;
            }
        }
        return (FilterBean) obj;
    }

    public static final int LJI(FilterBean filterBean, InterfaceC1640320sms interfaceC1640320sms) {
        List list;
        if (filterBean == null || (list = (List) interfaceC1640320sms.LJFF().getValue()) == null) {
            return 0;
        }
        Iterator it2 = list.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), filterBean)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    public static final FilterBean LJII(InterfaceC1640320sms interfaceC1640320sms, String str) {
        List list = (List) interfaceC1640320sms.LJI().getValue();
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((FilterBean) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (FilterBean) obj;
    }

    public static final float LJIIIIZZ(FilterBean filterBean, InterfaceC1452660nuC interfaceC1452660nuC) {
        int iLIZJ;
        if (interfaceC1452660nuC instanceof InterfaceC358220E2q) {
            iLIZJ = ((InterfaceC358220E2q) interfaceC1452660nuC).LIZ(filterBean, interfaceC1452660nuC.LIZ());
        } else {
            iLIZJ = C1453210nv5.LIZJ(filterBean, interfaceC1452660nuC.LIZIZ(filterBean), interfaceC1452660nuC.LIZ());
        }
        return iLIZJ / 100.0f;
    }

    public static final boolean LJIIIZ(FilterBean filterBean, InterfaceC1639870sm9 interfaceC1639870sm9) {
        EnumC1641340soW enumC1641340soWLJIIJJI;
        if (filterBean != null) {
            enumC1641340soWLJIIJJI = interfaceC1639870sm9.LJIIJJI(filterBean.getId());
        } else {
            enumC1641340soWLJIIJJI = null;
        }
        if (enumC1641340soWLJIIJJI == EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS) {
            return true;
        }
        return false;
    }

    public static final FilterBean LIZJ(InterfaceC1640320sms interfaceC1640320sms, String str, String str2) {
        List list = (List) interfaceC1640320sms.LJFF().getValue();
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            FilterBean filterBean = (FilterBean) obj2;
            if (Intrinsics.LJFF(filterBean.getResId(), str2) || Intrinsics.LJFF(filterBean.getId(), str)) {
                obj = obj2;
                break;
            }
        }
        return (FilterBean) obj;
    }
}
