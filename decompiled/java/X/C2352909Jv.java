package X;

import Y.AgS284S0100000_3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.thumbnail.ImageEditThumbnailScene$subscribeAiCoverManager$2", f = "ImageEditThumbnailScene.kt", l = {575}, m = "invokeSuspend")
public final class C2352909Jv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C12G3 LLILLJJLI;
    public final /* synthetic */ C12G1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2352909Jv(C12G3 c12g3, C12G1 c12g1, InterfaceC1364105Vn<? super C2352909Jv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c12g3;
        this.LLILLL = c12g1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2352909Jv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageEditThumbnailScene@6a71.subscribeAiCoverManager$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252331DDr c2252331DDrLJ = this.LLILLJJLI.LJ();
            AgS284S0100000_3 agS284S0100000_3 = new AgS284S0100000_3(this.LLILLL, 4);
            this.LL = 1;
            c2252331DDrLJ.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDrLJ, agS284S0100000_3, this) == objLJFF) {
                C1C7U.LIZIZ("ImageEditThumbnailScene@6a71.subscribeAiCoverManager$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
