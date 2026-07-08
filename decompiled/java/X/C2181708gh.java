package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dynamic.card.preserve.data.DynamicCardPreserveDataMgr$submitPreserveData$1", f = "DynamicCardPreserveDataMgr.kt", l = {191}, m = "invokeSuspend")
public final class C2181708gh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public InterfaceC383701eN LLILLJJLI;
    public C2184008h4 LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public final /* synthetic */ C2184008h4 LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Map<String, Object> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181708gh(C2184008h4 c2184008h4, String str, String str2, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C2181708gh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c2184008h4;
        this.LLJ = str;
        this.LLJI = str2;
        this.LLJIJIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2181708gh(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        C2184008h4 c2184008h4;
        InterfaceC383701eN interfaceC383701eN;
        Object obj2;
        Object obj3;
        Object obj4;
        C1C7U.LIZ("DynamicCardPreserveDataMgr@a13.submitPreserveData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLIZ;
        if (i != 0) {
            if (i == 1) {
                obj4 = this.LLILZLL;
                obj3 = this.LLILZIL;
                obj2 = this.LLILZ;
                c2184008h4 = this.LLILLL;
                interfaceC383701eN = this.LLILLJJLI;
                arrayList = (List) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start submit preserve data key(");
            sbLIZ.append(this.LLJ);
            sbLIZ.append(") id(");
            sbLIZ.append(this.LLJI);
            sbLIZ.append(") data(");
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            arrayList = new ArrayList();
            c2184008h4 = this.LLIZLLLIL;
            interfaceC383701eN = c2184008h4.LLILZLL;
            obj2 = this.LLJ;
            obj3 = this.LLJI;
            obj4 = this.LLJIJIL;
            this.LL = arrayList;
            this.LLILLJJLI = interfaceC383701eN;
            this.LLILLL = c2184008h4;
            this.LLILZ = obj2;
            this.LLILZIL = obj3;
            this.LLILZLL = obj4;
            this.LLIZ = 1;
            if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("DynamicCardPreserveDataMgr@a13.submitPreserveData$1");
                return objLJFF;
            }
        }
        try {
            for (C2181808gi c2181808gi : C13LP.LLIIII(c2184008h4.LLILZ.values())) {
                Gson gson = C09EF.LIZ;
                Map mapLJ = (Map) gson.LJIIIIZZ(c2181808gi.LIZJ, Map.class);
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                if (mapLJ.containsKey(obj2)) {
                    Map mapLJ2 = (Map) mapLJ.get(obj2);
                    if (mapLJ2 == null) {
                        mapLJ2 = C2097608Jq.LJ();
                    }
                    if (mapLJ2.containsKey(obj3) && !Intrinsics.LJFF(mapLJ2.get(obj3), obj4)) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ2);
                        linkedHashMap.put(obj3, obj4);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapLJ);
                        linkedHashMap2.put(obj2, linkedHashMap);
                        C2181808gi c2181808gi2 = new C2181808gi(c2181808gi.LIZ, gson.LJIILL(linkedHashMap2), c2181808gi.LIZIZ);
                        arrayList.add(c2181808gi2);
                        c2184008h4.LLILZ.put(c2181808gi.LIZ, c2181808gi2);
                    }
                }
            }
            interfaceC383701eN.LIZIZ(null);
            C2184008h4 c2184008h42 = this.LLIZLLLIL;
            c2184008h42.getClass();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            C23250099c.LIZLLL(c2184008h42.LLILZIL, null, null, new C2181908gj(c2184008h42, arrayList, null), 3);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("end submit preserve data key(");
            sbLIZ2.append(this.LLJ);
            sbLIZ2.append(") id(");
            sbLIZ2.append(this.LLJI);
            sbLIZ2.append(") data(");
            sbLIZ2.append(this.LLJIJIL);
            sbLIZ2.append(')');
            C2188811AlT.LIZIZ(sbLIZ2);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DynamicCardPreserveDataMgr@a13.submitPreserveData$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC383701eN.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
