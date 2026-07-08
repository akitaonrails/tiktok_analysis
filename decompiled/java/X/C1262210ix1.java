package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ix1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262210ix1 implements InterfaceC1262160iww {
    public final Function0<Unit> LIZ;
    public final LinkedHashMap<String, List<C1261860iwS>> LIZIZ = new LinkedHashMap<>();

    public C1262210ix1(AwS563S0100000_19 awS563S0100000_19) {
        this.LIZ = awS563S0100000_19;
    }

    @Override // X.InterfaceC1262160iww
    public final List<InterfaceC1262230ix3> LIZ(C1262150iwv c1262150iwv) {
        String nickname;
        User user;
        User user2;
        User user3;
        User user4;
        User user5;
        User user6;
        User user7;
        String uid;
        User user8;
        User user9;
        User user10;
        if (this.LIZIZ.isEmpty()) {
            return c1262150iwv.LIZ;
        }
        List<InterfaceC1262230ix3> list = c1262150iwv.LIZ;
        int i = 10;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<InterfaceC1262230ix3> it2 = list.iterator();
        while (true) {
            String nickname2 = null;
            if (!it2.hasNext()) {
                break;
            }
            Object obj = (InterfaceC1262230ix3) it2.next();
            if ((obj instanceof C1261860iwS) && (user10 = (User) obj) != null) {
                nickname2 = user10.getNickname();
            }
            arrayList.add(nickname2);
        }
        for (Map.Entry<String, List<C1261860iwS>> entry : this.LIZIZ.entrySet()) {
            String key = entry.getKey();
            List<C1261860iwS> value = entry.getValue();
            Iterator<InterfaceC1262230ix3> it3 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it3.next().getElementId(), key)) {
                    if (i2 < 0) {
                        continue;
                    } else {
                        Object obj2 = (InterfaceC1262230ix3) ListProtector.get(list, i2);
                        boolean z = obj2 instanceof C1261860iwS;
                        if (z && (user9 = (User) obj2) != null) {
                            user9.getNickname();
                        }
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(value, i));
                        Iterator<C1261860iwS> it4 = value.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(it4.next().getNickname());
                        }
                        List<InterfaceC1262230ix3> listSubList = list.subList(0, i2);
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listSubList, i));
                        Iterator<InterfaceC1262230ix3> it5 = listSubList.iterator();
                        while (it5.hasNext()) {
                            arrayList3.add(a0.LJJJLL("_recmore", it5.next().getElementId()));
                        }
                        Set setLLIIJI = C13LP.LLIIJI(arrayList3);
                        ArrayList arrayList4 = new ArrayList();
                        for (C1261860iwS c1261860iwS : value) {
                            if (!setLLIIJI.contains(a0.LJJJLL("_recmore", c1261860iwS.getElementId()))) {
                                arrayList4.add(c1261860iwS);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, i));
                        Iterator it6 = arrayList4.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(a0.LJJJLL("_recmore", ((C1261860iwS) it6.next()).getElementId()));
                        }
                        Set setLLIIJI2 = C13LP.LLIIJI(arrayList5);
                        ArrayList arrayList6 = new ArrayList();
                        int i3 = 0;
                        for (InterfaceC1262230ix3 interfaceC1262230ix3 : list) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                InterfaceC1262230ix3 interfaceC1262230ix32 = interfaceC1262230ix3;
                                if (i3 <= i2 || !setLLIIJI2.contains(a0.LJJJLL("_recmore", interfaceC1262230ix32.getElementId()))) {
                                    arrayList6.add(interfaceC1262230ix3);
                                }
                                i3 = i4;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        ArrayList arrayList7 = new ArrayList(arrayList6);
                        Iterator it7 = arrayList7.iterator();
                        int i5 = 0;
                        while (true) {
                            if (it7.hasNext()) {
                                Object obj3 = (InterfaceC1262230ix3) it7.next();
                                if ((obj3 instanceof C1261860iwS) && (user8 = (User) obj3) != null) {
                                    uid = user8.getUid();
                                } else {
                                    uid = null;
                                }
                                if (Intrinsics.LJFF(uid, key)) {
                                    break;
                                }
                                i5++;
                            } else {
                                i5 = -1;
                                break;
                            }
                        }
                        int size = arrayList7.size() - 1;
                        if (i5 > size) {
                            i5 = size;
                        }
                        if (i5 >= 0) {
                            if (i5 != i2) {
                                Object obj4 = ListProtector.get(list, i2);
                                if ((obj4 instanceof C1261860iwS) && (user7 = (User) obj4) != null) {
                                    user7.getNickname();
                                }
                                Object obj5 = ListProtector.get(arrayList7, i5);
                                if ((obj5 instanceof C1261860iwS) && (user6 = (User) obj5) != null) {
                                    user6.getNickname();
                                }
                                int i6 = i5 + 1;
                                int size2 = arrayList7.size();
                                if (i6 > size2) {
                                    i6 = size2;
                                }
                                arrayList7.addAll(i6, arrayList4);
                            } else {
                                Object obj6 = ListProtector.get(list, i2);
                                if ((obj6 instanceof C1261860iwS) && (user3 = (User) obj6) != null) {
                                    user3.getNickname();
                                }
                                Object obj7 = ListProtector.get(arrayList7, i5);
                                if ((obj7 instanceof C1261860iwS) && (user2 = (User) obj7) != null) {
                                    user2.getNickname();
                                }
                                int i7 = i2 + 1;
                                int size3 = arrayList7.size();
                                if (i7 > size3) {
                                    i7 = size3;
                                }
                                arrayList7.addAll(i7, arrayList4);
                            }
                            if (z && (user5 = (User) obj2) != null) {
                                user5.getNickname();
                            }
                            Object obj8 = ListProtector.get(arrayList7, i5);
                            if ((obj8 instanceof C1261860iwS) && (user4 = (User) obj8) != null) {
                                user4.getNickname();
                            }
                            list = arrayList7;
                        }
                    }
                } else {
                    i2++;
                }
            }
            i = 10;
        }
        list.size();
        ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(list, i));
        for (Object obj9 : list) {
            if ((obj9 instanceof C1261860iwS) && (user = (User) obj9) != null) {
                nickname = user.getNickname();
            } else {
                nickname = null;
            }
            arrayList8.add(nickname);
        }
        return list;
    }
}
