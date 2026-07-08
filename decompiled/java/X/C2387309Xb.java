package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$updateDraftViewInfo$2", f = "DraftViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2387309Xb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftViewModel LL;
    public final /* synthetic */ Map<String, C539070LCf> LLILLJJLI;
    public final /* synthetic */ List<DraftViewInfo> LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2387309Xb(DraftViewModel draftViewModel, Map<String, C539070LCf> map, List<DraftViewInfo> list, Context context, InterfaceC1364105Vn<? super C2387309Xb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftViewModel;
        this.LLILLJJLI = map;
        this.LLILLL = list;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2387309Xb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.updateDraftViewInfo$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DraftViewModel draftViewModel = this.LL;
        Map<String, C539070LCf> map = this.LLILLJJLI;
        draftViewModel.wQ2(this.LLILZ, this.LLILLL, map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftViewModel@38a5.updateDraftViewInfo$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
