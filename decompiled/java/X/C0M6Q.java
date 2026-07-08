package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS148S0101000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import njp.a;

/* JADX INFO: renamed from: X.0M6Q, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.AIRemixDraftBoxEntranceViewHolder$loadData$1", f = "AIRemixDraftBoxEntranceViewHolder.kt", l = {175}, m = "invokeSuspend")
public final class C0M6Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0M6V LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0M6V LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M6Q(C0M6V c0m6v, String str, long j, InterfaceC1364105Vn<? super C0M6Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0m6v;
        this.LLILZ = str;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M6Q(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0M6V c0m6v;
        Object objLJIIJ = obj;
        C1C7U.LIZ("AIRemixDraftBoxEntranceViewHolder@68df.loadData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c0m6v = this.LL;
                C155000ia.LIZIZ(objLJIIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIJ);
            InterfaceC562800M5m interfaceC562800M5m = (InterfaceC562800M5m) this.LLILLL.LLJJIJI.getValue();
            if (interfaceC562800M5m != null) {
                c0m6v = this.LLILLL;
                String str = this.LLILZ;
                long j = this.LLILZIL;
                List<C0M6P> listLJIIIIZZ = interfaceC562800M5m.LJIIIIZZ(interfaceC562800M5m.LIZLLL());
                int size = listLJIIIIZZ.size();
                boolean zIsEmpty = listLJIIIIZZ.isEmpty();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadData: triggerSource = ");
                sbLIZ.append(str);
                sbLIZ.append(", unread size = ");
                sbLIZ.append(size);
                c0m6v.P5(C2188811AlT.LIZIZ(sbLIZ));
                C0M6Y c0m6y = C0M6Y.LIZ;
                boolean z = c0m6v.LLIZ;
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                c0m6y.getClass();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("trigger_source", str);
                c0lab.LIZ(size, "unread_count");
                c0lab.LJFF("is_empty", zIsEmpty);
                c0lab.LJFF("is_attached_to_window", z);
                c0lab.LIZIZ(jCurrentTimeMillis, "duration");
                C20684815ws.LJIILLIIL("ttcrt_airemix_draft_load_data_duration", c0lab.LIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("reportLoadDataDuration: triggerSource: ");
                sbLIZ2.append(str);
                sbLIZ2.append(", unreadCount: ");
                sbLIZ2.append(size);
                sbLIZ2.append(", duration: ");
                sbLIZ2.append(jCurrentTimeMillis);
                C0M6Y.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                if (zIsEmpty) {
                    this.LL = c0m6v;
                    this.LLILLJJLI = 1;
                    objLJIIJ = interfaceC562800M5m.LJIIJ(this);
                    if (objLJIIJ == objLJFF) {
                        C1C7U.LIZIZ("AIRemixDraftBoxEntranceViewHolder@68df.loadData$1");
                        return objLJFF;
                    }
                } else {
                    C01TT.LIZLLL(new AwS409S0200000_8(c0m6v, (C0M6V) listLJIIIIZZ, (List<C0M6P>) 103));
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIRemixDraftBoxEntranceViewHolder@68df.loadData$1");
            return unit;
        }
        C01TT.LIZLLL(new AwS148S0101000_8(c0m6v, ((Number) objLJIIJ).intValue(), 8));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIRemixDraftBoxEntranceViewHolder@68df.loadData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
