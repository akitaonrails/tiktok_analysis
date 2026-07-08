package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Be, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$observeDraftWithAsyncTasks$1", f = "DraftViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2330409Be extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ ICreationAsyncTaskManager LLILLL;
    public final /* synthetic */ DraftViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2330409Be(List<String> list, ICreationAsyncTaskManager iCreationAsyncTaskManager, DraftViewModel draftViewModel, InterfaceC1364105Vn<? super C2330409Be> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = iCreationAsyncTaskManager;
        this.LLILZ = draftViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2330409Be c2330409Be = new C2330409Be(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2330409Be.LL = obj;
        return c2330409Be;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.observeDraftWithAsyncTasks$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        List<String> list = this.LLILLJJLI;
        ICreationAsyncTaskManager iCreationAsyncTaskManager = this.LLILLL;
        final DraftViewModel draftViewModel = this.LLILZ;
        ArrayList<Pair> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (final String str : list) {
            final InterfaceC346201Wa<List<C0LSZ>> interfaceC346201WaLJJJJLI = iCreationAsyncTaskManager.LJJJJLI(str);
            arrayList.add(new Pair(str, C09IC.LJIILL(new InterfaceC346201Wa<C539070LCf>() { // from class: X.09Bf
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super C539070LCf> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = interfaceC346201WaLJJJJLI.collect(new C2330609Bg(interfaceC346701Wf, draftViewModel, str), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            })));
        }
        DraftViewModel draftViewModel2 = this.LLILZ;
        for (Pair pair : arrayList) {
            String str2 = (String) pair.getFirst();
            InterfaceC346201Wa interfaceC346201Wa = (InterfaceC346201Wa) pair.getSecond();
            C09AE c09ae = (C09AE) ((LinkedHashMap) draftViewModel2.LLJLLL).get(str2);
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            draftViewModel2.LLJLLL.put(str2, C23250099c.LIZLLL(interfaceC497601wk, null, null, new C2330809Bi(interfaceC346201Wa, str2, draftViewModel2, null), 3));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftViewModel@38a5.observeDraftWithAsyncTasks$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
