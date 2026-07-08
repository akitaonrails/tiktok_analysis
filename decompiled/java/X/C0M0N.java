package X;

import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M0N, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$onLongClick$1", f = "DraftFragment.kt", l = {1166}, m = "invokeSuspend")
public final class C0M0N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftFragment LLILLJJLI;
    public final /* synthetic */ C0M0P LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M0N(DraftFragment draftFragment, C0M0P c0m0p, String str, InterfaceC1364105Vn<? super C0M0N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftFragment;
        this.LLILLL = c0m0p;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M0N(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftFragment@975a.onLongClick$1");
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
            DraftFragment draftFragment = this.LLILLJJLI;
            C0M0P c0m0p = this.LLILLL;
            this.LL = 1;
            obj = draftFragment.NR(c0m0p, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftFragment@975a.onLongClick$1");
                return objLJFF;
            }
        }
        C497720JfW c497720JfW = C497720JfW.LIZ;
        String enterFrom = this.LLILLJJLI.getEnterFrom();
        String strOR = this.LLILLJJLI.OR();
        String str = this.LLILZ;
        c497720JfW.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C497720JfW.LIZ(enterFrom, strOR, linkedHashMap);
        linkedHashMap.put("new_draft_id", obj);
        linkedHashMap.put("action", str);
        C20684815ws.LJIILLIIL("long_press_draft_cell", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftFragment@975a.onLongClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
