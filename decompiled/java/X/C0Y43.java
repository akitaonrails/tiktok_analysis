package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y43, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.model.DefaultConversationPrefetchIdModel$fetchConvIds$1", f = "DefaultConversationPrefetchIdModel.kt", l = {216}, m = "invokeSuspend")
public final class C0Y43 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long $lastFetchTimeStamp;
    public final /* synthetic */ boolean $needIds;
    public int label;
    public final /* synthetic */ C0Y48 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y43(C0Y48 c0y48, boolean z, long j, InterfaceC1364105Vn<? super C0Y43> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.this$0 = c0y48;
        this.$needIds = z;
        this.$lastFetchTimeStamp = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y43(this.this$0, this.$needIds, this.$lastFetchTimeStamp, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int size;
        Integer numValueOf;
        EnumC868900Y6u enumC868900Y6u;
        Map<Long, C0Y44> map;
        Collection<C0Y44> collectionValues;
        String strValueOf;
        boolean z;
        long j;
        Object objLJJLIIIJJIZ = obj;
        C1C7U.LIZ("DefaultConversationPrefetchIdModel@de8d.fetchConvIds$1");
        Object objLJFF = C099R.LJFF();
        int i = this.label;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJJLIIIJJIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJJLIIIJJIZ);
            InterfaceC868170Y3z interfaceC868170Y3zLIZJ = this.this$0.LL.LJIIZILJ().getDomain().LIZJ();
            boolean z2 = this.$needIds;
            this.label = 1;
            objLJJLIIIJJIZ = interfaceC868170Y3zLIZJ.LJJLIIIJJIZ(z2, this);
            if (objLJJLIIIJJIZ == objLJFF) {
                C1C7U.LIZIZ("DefaultConversationPrefetchIdModel@de8d.fetchConvIds$1");
                return objLJFF;
            }
        }
        C0Y40 c0y40 = (C0Y40) objLJJLIIIJJIZ;
        C0Y46 c0y46 = c0y40.LIZ;
        if (c0y46 != null) {
            List list = c0y46.LIZ;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            C0Y45 c0y45LIZJ = this.this$0.LIZJ();
            if (c0y45LIZJ != null) {
                C0Y48 c0y48 = this.this$0;
                long j2 = this.$lastFetchTimeStamp;
                C868780Y6i.LJIILJJIL(c0y48.LL.LIZLLL(), "TAG_DefaultConversationPrefetchIdModel", "fetchConvIds: local cache is not null, update cache", 4);
                Set<Long> setKeySet = c0y45LIZJ.LIZ.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : setKeySet) {
                    if (!list.contains(C2286608xc.LJFF(((Number) obj2).longValue()))) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    C868780Y6i c868780Y6iLIZLLL = c0y48.LL.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("these ids:");
                    sbLIZ.append(arrayList);
                    sbLIZ.append(" are not exist on server, not good, check this out");
                    c868780Y6iLIZLLL.LJIIIIZZ("TAG_DefaultConversationPrefetchIdModel", C2188811AlT.LIZIZ(sbLIZ), null);
                    c0y48.LIZ(arrayList, true);
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    long jLongValue = ((Number) it2.next()).longValue();
                    C0Y44 c0y44 = c0y45LIZJ.LIZ.get(C2286608xc.LJFF(jLongValue));
                    if (c0y44 == null || (strValueOf = c0y44.LIZIZ) == null) {
                        strValueOf = String.valueOf(jLongValue);
                    }
                    if (c0y44 != null) {
                        z = c0y44.LIZJ;
                        j = c0y44.LIZLLL;
                    } else {
                        z = true;
                        j = -1;
                    }
                    arrayList2.add(new C0Y44(jLongValue, j, strValueOf, z));
                }
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (Object obj3 : arrayList2) {
                    linkedHashMap.put(C2286608xc.LJFF(((C0Y44) obj3).LIZ), obj3);
                }
                c0y48.LJFF(new C0Y45(c0y46.LIZJ, c0y46.LIZIZ, j2, new LinkedHashMap(linkedHashMap)));
            } else {
                C0Y48 c0y482 = this.this$0;
                long j3 = this.$lastFetchTimeStamp;
                C868780Y6i.LJIILJJIL(c0y482.LL.LIZLLL(), "TAG_DefaultConversationPrefetchIdModel", "fetchConvIds: local cache is null, write all", 4);
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    long jLongValue2 = ((Number) it3.next()).longValue();
                    arrayList3.add(new C0Y44(jLongValue2, -1L, String.valueOf(jLongValue2), true));
                }
                int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList3, 10));
                if (iLIZIZ2 < 16) {
                    iLIZIZ2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ2);
                for (Object obj4 : arrayList3) {
                    linkedHashMap2.put(C2286608xc.LJFF(((C0Y44) obj4).LIZ), obj4);
                }
                c0y482.LJFF(new C0Y45(c0y46.LIZJ, c0y46.LIZIZ, j3, new LinkedHashMap(linkedHashMap2)));
            }
        } else {
            C868780Y6i c868780Y6iLIZLLL2 = this.this$0.LL.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetch id fail error:");
            sbLIZ2.append(c0y40.LIZIZ);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "TAG_DefaultConversationPrefetchIdModel", C2188811AlT.LIZIZ(sbLIZ2), 4);
        }
        C0Y48 c0y483 = this.this$0;
        c0y483.getClass();
        C0Y46 c0y462 = c0y40.LIZ;
        if (c0y462 != null) {
            if (c0y462.LIZ == null) {
                i2 = 2;
            } else {
                i2 = 0;
            }
        }
        C0Y45 c0y45LIZJ2 = c0y483.LIZJ();
        if (c0y45LIZJ2 != null && (map = c0y45LIZJ2.LIZ) != null && (collectionValues = map.values()) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj5 : collectionValues) {
                if (((C0Y44) obj5).LIZJ) {
                    arrayList4.add(obj5);
                }
            }
            size = arrayList4.size();
        } else {
            size = -1;
        }
        C0YJ9 c0yj9 = new C0YJ9(c0y483.LL);
        c0yj9.LIZJ("imsdk_fetch_preassign_conv_id");
        C0Y46 c0y463 = c0y40.LIZ;
        if (c0y463 != null && (enumC868900Y6u = c0y463.LIZLLL) != null) {
            numValueOf = Integer.valueOf(enumC868900Y6u.getValue());
        } else {
            numValueOf = null;
        }
        c0yj9.LIZ(numValueOf, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0yj9.LIZ(Integer.valueOf(i2), "error_code");
        c0yj9.LIZ(Integer.valueOf(size), "unused_ids");
        c0yj9.LIZLLL();
        this.this$0.LLILLL = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultConversationPrefetchIdModel@de8d.fetchConvIds$1");
        return unit;
    }
}
