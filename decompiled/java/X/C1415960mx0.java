package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS136S1100000_22;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0mx0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.EditAutoCutComponent$observeAITaskState$1$1", f = "EditAutoCutComponent.kt", l = {}, m = "invokeSuspend")
public final class C1415960mx0 extends C09AX implements Function2<Map<String, ? extends C559050LwF>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1417330mzD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415960mx0(C1417330mzD c1417330mzD, InterfaceC1364105Vn<? super C1415960mx0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1417330mzD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1415960mx0 c1415960mx0 = new C1415960mx0(this.LLILLJJLI, interfaceC1364105Vn);
        c1415960mx0.LL = obj;
        return c1415960mx0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        AutoCutThemeData next;
        String str2;
        C1C7U.LIZ("EditAutoCutComponent@9215.observeAITaskState$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map map = (Map) this.LL;
        C1417330mzD c1417330mzD = this.LLILLJJLI;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C559050LwF c559050LwF = (C559050LwF) entry.getValue();
            Iterator<AutoCutThemeData> it2 = c1417330mzD.d.iterator();
            while (true) {
                str = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.templateId, key)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AutoCutThemeData autoCutThemeData = next;
            int iIndexOf = c1417330mzD.d.indexOf(autoCutThemeData);
            if (iIndexOf >= 0) {
                Pair pairLIZ = C1403130mcJ.LIZ(iIndexOf, c1417330mzD.d);
                int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
                C0MJ9 c0mj9 = (C0MJ9) pairLIZ.getSecond();
                if (c0mj9 != null && iIntValue >= 0) {
                    C1417330mzD.Rg(c1417330mzD, iIntValue, c0mj9, null, null, C2286608xc.LIZLLL(c559050LwF.LJFF / 100.0f));
                }
            }
            if (c559050LwF.LIZJ() && !c1417330mzD.LLLLIILL.contains(key)) {
                AutoCutThemeData autoCutThemeData2 = (AutoCutThemeData) C13LP.LJJJLZIJ(c1417330mzD.T2().LIZIZ.LIZ.intValue(), c1417330mzD.d);
                if (autoCutThemeData2 != null) {
                    str = autoCutThemeData2.templateId;
                }
                if (Intrinsics.LJFF(str, key)) {
                    c1417330mzD.LLLLIILL.add((String) key);
                } else if (autoCutThemeData != null && (str2 = autoCutThemeData.uuid) != null) {
                    c1417330mzD.i3(new AwS136S1100000_22(autoCutThemeData, str2, 2));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditAutoCutComponent@9215.observeAITaskState$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Map<String, ? extends C559050LwF> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(map, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
