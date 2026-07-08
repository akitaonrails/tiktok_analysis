package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.SharePlatform;
import com.ss.android.ugc.trill.share.data.ShareDatabase;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.order.I18nShareChannelGlobalOrder$initOrderList$1", f = "I18nShareChannelGlobalOrder.kt", l = {119}, m = "invokeSuspend")
public final class C351870Dqr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<SharePlatform> LLILLJJLI;
    public final /* synthetic */ Map<String, Integer> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351870Dqr(Map map, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C351870Dqr(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC351940Dqy interfaceC351940DqyLIZIZ;
        C1C7U.LIZ("I18nShareChannelGlobalOrder@216f.initOrderList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<SharePlatform> listLIZ = this.LLILLJJLI;
            if (listLIZ == null) {
                listLIZ = C349180DmW.LIZ();
            }
            C352000Dr4.LIZIZ.LIZIZ(new C349150DmT(listLIZ));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            Iterator<SharePlatform> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().platformId);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            final Map linkedHashMap = this.LLILLL;
            if (linkedHashMap == null) {
                try {
                    ShareDatabase shareDatabase = (ShareDatabase) C349180DmW.LIZLLL.getValue();
                    if (shareDatabase != null && (interfaceC351940DqyLIZIZ = shareDatabase.LIZIZ()) != null) {
                        List<C353310DtB> listLIZIZ = interfaceC351940DqyLIZIZ.LIZIZ(C2286608xc.LJ(0));
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
                        Iterator<C353310DtB> it3 = listLIZIZ.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(it3.next().LIZJ);
                        }
                        C349180DmW.LIZIZ = new ArrayList(arrayList3);
                        linkedHashMap = C1371650lnX.LIZIZ(10, listLIZIZ, arrayList2);
                    } else {
                        linkedHashMap = new LinkedHashMap();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            if (arrayList2.size() > 1) {
                C08XD.LJJ(arrayList2, new Comparator() { // from class: X.0DmR
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        int iIntValue;
                        Integer num = (Integer) linkedHashMap.get(t2);
                        int iIntValue2 = 0;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        Integer num2 = (Integer) linkedHashMap.get(t);
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        }
                        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
                    }
                });
            }
            C352000Dr4.LIZIZ.LIZIZ(new C349140DmS(arrayList2));
            C349180DmW.LIZ = arrayList2;
            if (C2135008Ya.LIZ()) {
                C08YU c08yu = C08YU.LIZ;
                this.LL = 1;
                if (c08yu.LIZLLL(this) == objLJFF) {
                    C1C7U.LIZIZ("I18nShareChannelGlobalOrder@216f.initOrderList$1");
                    return objLJFF;
                }
            }
        }
        C349180DmW.LIZJ = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nShareChannelGlobalOrder@216f.initOrderList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
