package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Xa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftLoader$updateDraftViewInfo$8", f = "DraftLoader.kt", l = {}, m = "invokeSuspend")
public final class C2387209Xa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<C0M0P> LL;
    public final /* synthetic */ C0M03 LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ DraftViewInfo LLILZ;
    public final /* synthetic */ C561130Lzb LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2387209Xa(C259800zU<C0M0P> c259800zU, C0M03 c0m03, Context context, DraftViewInfo draftViewInfo, C561130Lzb c561130Lzb, InterfaceC1364105Vn<? super C2387209Xa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c0m03;
        this.LLILLL = context;
        this.LLILZ = draftViewInfo;
        this.LLILZIL = c561130Lzb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2387209Xa(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0M0P] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftLoader@8d42.updateDraftViewInfo$8");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.element = this.LLILLJJLI.LIZJ(this.LLILLL, this.LLILZ, this.LLILZIL, C2097608Jq.LJ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftLoader@8d42.updateDraftViewInfo$8");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
