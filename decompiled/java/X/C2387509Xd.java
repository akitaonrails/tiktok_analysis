package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftLoader$updateDraftViewInfo$3", f = "DraftLoader.kt", l = {}, m = "invokeSuspend")
public final class C2387509Xd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C0M03 LL;
    public final /* synthetic */ Map<String, C539070LCf> LLILLJJLI;
    public final /* synthetic */ List<DraftViewInfo> LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ C561130Lzb LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ List<C561950M2f> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2387509Xd(C0M03 c0m03, Map<String, C539070LCf> map, List<DraftViewInfo> list, Context context, C561130Lzb c561130Lzb, boolean z, List<C561950M2f> list2, InterfaceC1364105Vn<? super C2387509Xd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0m03;
        this.LLILLJJLI = map;
        this.LLILLL = list;
        this.LLILZ = context;
        this.LLILZIL = c561130Lzb;
        this.LLILZLL = z;
        this.LLIZ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2387509Xd(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("DraftLoader@8d42.updateDraftViewInfo$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C561950M2f> listLIZIZ = this.LL.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        if (listLIZIZ != null) {
            boolValueOf = Boolean.valueOf(this.LLIZ.addAll(listLIZIZ));
        } else {
            boolValueOf = null;
        }
        C1C7U.LIZIZ("DraftLoader@8d42.updateDraftViewInfo$3");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
