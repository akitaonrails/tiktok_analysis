package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.nearby.vm.ConnectNowMatchVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0u1E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.vm.ConnectNowMatchVM$fetchLatestMatches$2", f = "ConnectNowMatchVM.kt", l = {}, m = "invokeSuspend")
public final class C1687660u1E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public final /* synthetic */ ConnectNowMatchVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687660u1E(ConnectNowMatchVM connectNowMatchVM, InterfaceC1364105Vn<? super C1687660u1E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = connectNowMatchVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1687660u1E(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConnectNowMatchVM@ebf0.fetchLatestMatches$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        Map<String, Long> mapWQ2 = this.LL.wQ2();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1910880zpG c1910880zpG = C1910890zpH.LIZLLL;
        EnumC1910860zpE enumC1910860zpE = EnumC1910860zpE.CONNECT_NOW;
        C1910890zpH c1910890zpHLIZ = c1910880zpG.LIZ(enumC1910860zpE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[request] raw user list discovered by ble ");
        sbLIZ.append(mapWQ2);
        sbLIZ.append(", size ");
        sbLIZ.append(mapWQ2.size());
        c1910890zpHLIZ.LIZ("ConnectNowMatchVM", C2188811AlT.LIZIZ(sbLIZ));
        C1910890zpH c1910890zpHLIZ2 = c1910880zpG.LIZ(enumC1910860zpE);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[data] current state ");
        sbLIZ2.append(this.LL.getState().LLILLJJLI);
        sbLIZ2.append(' ');
        sbLIZ2.append(this.LL.getState().LL);
        c1910890zpHLIZ2.LIZ("ConnectNowMatchVM", C2188811AlT.LIZIZ(sbLIZ2));
        C1910890zpH c1910890zpHLIZ3 = c1910880zpG.LIZ(enumC1910860zpE);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[data] blocked uids: ");
        sbLIZ3.append(this.LL.LLILZ);
        sbLIZ3.append(", ");
        sbLIZ3.append(System.identityHashCode(this.LL.LLILZ));
        c1910890zpHLIZ3.LIZ("ConnectNowMatchVM", C2188811AlT.LIZIZ(sbLIZ3));
        List<C1687730u1L> list = this.LL.getState().LL;
        ConnectNowMatchVM connectNowMatchVM = this.LL;
        Iterator<C1687730u1L> it2 = list.iterator();
        while (true) {
            Long l = null;
            if (!it2.hasNext()) {
                break;
            }
            C1687730u1L next = it2.next();
            String secUid = next.LIZ.getSecUid();
            if (secUid != null) {
                C1717206ny.LIZIZ(secUid, linkedHashSet);
            }
            EnumC1687690u1H enumC1687690u1H = next.LIZIZ;
            EnumC1687690u1H enumC1687690u1H2 = EnumC1687690u1H.BLE;
            if (enumC1687690u1H == enumC1687690u1H2) {
                Long lLJFF = C2286608xc.LJFF(next.LJ);
                connectNowMatchVM.getClass();
                if (ConnectNowMatchVM.xQ2(lLJFF)) {
                    if (mapWQ2.containsKey(next.LIZ.getSecUid())) {
                        User user = next.LIZ;
                        EnumC1687690u1H enumC1687690u1H3 = next.LIZIZ;
                        EnumC1687680u1G enumC1687680u1G = next.LIZJ;
                        EnumC1687680u1G enumC1687680u1G2 = next.LIZLLL;
                        String secUid2 = user.getSecUid();
                        Long lLJFF2 = C2286608xc.LJFF(next.LJ);
                        Long l2 = mapWQ2.get(secUid2);
                        if (l2 != null) {
                            lLJFF2 = l2;
                        }
                        C1717206ny.LIZ(new C1687730u1L(user, enumC1687690u1H3, enumC1687680u1G, enumC1687680u1G2, lLJFF2.longValue()), arrayList);
                    } else {
                        C1717206ny.LIZ(next, arrayList);
                    }
                }
            }
            if (next.LIZIZ == EnumC1687690u1H.BLE_REVERSE) {
                String secUid3 = next.LIZ.getSecUid();
                connectNowMatchVM.getClass();
                Long l3 = mapWQ2.get(secUid3);
                if (l3 != null) {
                    l = l3;
                }
                Long l4 = l;
                if (l4 != null && ConnectNowMatchVM.xQ2(l4)) {
                    C1717206ny.LIZ(new C1687730u1L(next.LIZ, enumC1687690u1H2, next.LIZJ, next.LIZLLL, l4.longValue()), arrayList);
                } else {
                    C1717206ny.LIZ(next, arrayList);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Long> entry : mapWQ2.entrySet()) {
            String key = entry.getKey();
            if (!linkedHashSet.contains(key) && !Intrinsics.LJFF(key, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C1910890zpH c1910890zpHLIZ4 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("[request] fetchLatestMatches - newFoundBLE ");
        sbLIZ4.append(linkedHashMap);
        sbLIZ4.append(", size ");
        sbLIZ4.append(linkedHashMap.size());
        c1910890zpHLIZ4.LIZ("ConnectNowMatchVM", C2188811AlT.LIZIZ(sbLIZ4));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            long jLongValue = ((Number) entry2.getValue()).longValue();
            User user2 = new User();
            user2.setSecUid(str);
            EnumC1687690u1H enumC1687690u1H4 = EnumC1687690u1H.BLE;
            EnumC1687680u1G enumC1687680u1G3 = EnumC1687680u1G.UNKNOWN;
            C1717206ny.LIZ(new C1687730u1L(user2, enumC1687690u1H4, enumC1687680u1G3, enumC1687680u1G3, jLongValue), arrayList);
        }
        arrayList.removeIf(new Predicate() { // from class: X.0u1I
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return ((C1687730u1L) obj2).LIZ.isBlocked();
            }
        });
        C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZ("ConnectNowMatchVM", "[request] fetchLatestMatches - concatUserList " + arrayList + ", size " + arrayList.size());
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1687650u1D(arrayList, this.LL, null), 3);
        C1C7U.LIZIZ("ConnectNowMatchVM@ebf0.fetchLatestMatches$2");
        return anonymousClass0956LIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
