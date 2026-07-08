package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CaO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.ui.chunks.VideoCaptionMentionRemoteSearchChunk$searchPageConfig$2$1$onRefresh$1$1", f = "VideoCaptionMentionRemoteSearchChunk.kt", l = {}, m = "invokeSuspend")
public final class C316180CaO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Boolean>> LLILLJJLI;
    public final /* synthetic */ AbstractC316870CbV<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C316180CaO(InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn, AbstractC316870CbV<Boolean> abstractC316870CbV, InterfaceC1364105Vn<? super C316180CaO> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLJJLI = interfaceC1364105Vn;
        this.LLILLL = abstractC316870CbV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C316180CaO c316180CaO = new C316180CaO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c316180CaO.LL = obj;
        return c316180CaO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoCaptionMentionRemoteSearchChunk@558a.searchPageConfig$2$1$onRefresh$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C2296808zG.LJI((InterfaceC497601wk) this.LL)) {
            InterfaceC1364105Vn<AbstractC316870CbV<Boolean>> interfaceC1364105Vn = this.LLILLJJLI;
            AbstractC316870CbV<Boolean> abstractC316870CbV = this.LLILLL;
            C189200o6.m2constructorimpl(abstractC316870CbV);
            interfaceC1364105Vn.resumeWith(abstractC316870CbV);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoCaptionMentionRemoteSearchChunk@558a.searchPageConfig$2$1$onRefresh$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
