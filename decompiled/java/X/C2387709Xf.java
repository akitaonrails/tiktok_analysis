package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftLoader$updateDraftViewInfo$4", f = "DraftLoader.kt", l = {}, m = "invokeSuspend")
public final class C2387709Xf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C0M03 LL;
    public final /* synthetic */ List<DraftViewInfo> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C561130Lzb LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ List<C561950M2f> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2387709Xf(C0M03 c0m03, List<DraftViewInfo> list, Context context, C561130Lzb c561130Lzb, boolean z, List<C561950M2f> list2, InterfaceC1364105Vn<? super C2387709Xf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0m03;
        this.LLILLJJLI = list;
        this.LLILLL = context;
        this.LLILZ = c561130Lzb;
        this.LLILZIL = z;
        this.LLILZLL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2387709Xf(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("DraftLoader@8d42.updateDraftViewInfo$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C561950M2f> listLIZIZ = this.LL.LIZIZ(C2097608Jq.LJ(), this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        if (listLIZIZ != null) {
            boolValueOf = Boolean.valueOf(this.LLILZLL.addAll(listLIZIZ));
        } else {
            boolValueOf = null;
        }
        C1C7U.LIZIZ("DraftLoader@8d42.updateDraftViewInfo$4");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
