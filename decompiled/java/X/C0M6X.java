package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M6X, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.AIRemixDraftBoxEntranceViewHolder$onViewAttachedToWindow$1", f = "AIRemixDraftBoxEntranceViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C0M6X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0M6V LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M6X(C0M6V c0m6v, InterfaceC1364105Vn<? super C0M6X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0m6v;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M6X(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Pair<Integer, Integer> pair;
        String strLIZIZ;
        C1C7U.LIZ("AIRemixDraftBoxEntranceViewHolder@68df.onViewAttachedToWindow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.LLILZLL.get()) {
            C0M6Y c0m6y = C0M6Y.LIZ;
            boolean z = this.LL.LLILZ;
            c0m6y.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z) {
                str = "create_tab";
            } else {
                str = "personal_homepage";
            }
            C0M6O c0m6o = (C0M6O) C0M6Y.LIZIZ.getValue();
            if (c0m6o == null || (pair = c0m6o.LJIILJJIL()) == null) {
                pair = new Pair<>(0, 0);
            }
            int iIntValue = pair.getFirst().intValue();
            int iIntValue2 = pair.getSecond().intValue();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("referpage_name", str);
            c0lab.LIZ(iIntValue2, "generated_cnt");
            c0lab.LIZ(iIntValue, "generating_cnt");
            Map<String, String> map = c0lab.LIZ;
            C20684815ws.LJIILLIIL("ttcrt_airemix_draft_set_show", map);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            map.put("duration", String.valueOf(jCurrentTimeMillis2));
            InterfaceC562960M6c interfaceC562960M6cLIZIZ = C0M6Y.LIZIZ();
            if (interfaceC562960M6cLIZIZ != null) {
                InterfaceC562960M6c interfaceC562960M6cLIZIZ2 = C0M6Y.LIZIZ();
                if (interfaceC562960M6cLIZIZ2 == null || (strLIZIZ = interfaceC562960M6cLIZIZ2.LIZIZ()) == null) {
                    strLIZIZ = "";
                }
                interfaceC562960M6cLIZIZ.LIZ("draft_set_show", strLIZIZ, EnumC562940M6a.INFO, map, System.currentTimeMillis());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportEntranceShow: generatedCount: ");
            sbLIZ.append(iIntValue2);
            sbLIZ.append(", generatingCount: ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(", duration: ");
            sbLIZ.append(jCurrentTimeMillis2);
            C0M6Y.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            this.LL.LLILZLL.compareAndSet(false, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIRemixDraftBoxEntranceViewHolder@68df.onViewAttachedToWindow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
