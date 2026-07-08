package X;

import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KlR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VTask$stepForward2Album$2", f = "GeneralI2VTask.kt", l = {}, m = "invokeSuspend")
public final class C526870KlR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C535020Kya>, Object> {
    public final /* synthetic */ AlbumAiContentService LL;
    public final /* synthetic */ C535020Kya LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526870KlR(AlbumAiContentService albumAiContentService, C535020Kya c535020Kya, InterfaceC1364105Vn<? super C526870KlR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = albumAiContentService;
        this.LLILLJJLI = c535020Kya;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526870KlR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VTask@5977.stepForward2Album$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C535020Kya c535020KyaLJFF = this.LL.LJFF(this.LLILLJJLI);
        C1C7U.LIZIZ("GeneralI2VTask@5977.stepForward2Album$2");
        return c535020KyaLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C535020Kya> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
