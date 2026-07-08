package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09XY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftLoader$updateDraftViewInfo$7", f = "DraftLoader.kt", l = {}, m = "invokeSuspend")
public final class C09XY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<C0M0P> LL;
    public final /* synthetic */ C0M03 LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ DraftViewInfo LLILZ;
    public final /* synthetic */ C561130Lzb LLILZIL;
    public final /* synthetic */ Map<String, C539070LCf> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09XY(C259800zU<C0M0P> c259800zU, C0M03 c0m03, Context context, DraftViewInfo draftViewInfo, C561130Lzb c561130Lzb, Map<String, C539070LCf> map, InterfaceC1364105Vn<? super C09XY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c0m03;
        this.LLILLL = context;
        this.LLILZ = draftViewInfo;
        this.LLILZIL = c561130Lzb;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09XY(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0M0P] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftLoader@8d42.updateDraftViewInfo$7");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.element = this.LLILLJJLI.LIZJ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftLoader@8d42.updateDraftViewInfo$7");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
