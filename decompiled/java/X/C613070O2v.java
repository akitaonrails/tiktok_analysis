package X;

import Y.AgS2S1310000_9;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.anchor.MovieTokAnchorBusinessService$handleIconClick$1", f = "MovieTokAnchorBusinessService.kt", l = {200}, m = "invokeSuspend")
public final class C613070O2v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<C0O7A<? extends C0O3E>> LLILLL;
    public final /* synthetic */ C613440O4g LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ AnchorCommonStruct LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C613070O2v(InterfaceC346201Wa<? extends C0O7A<? extends C0O3E>> interfaceC346201Wa, C613440O4g c613440O4g, String str, boolean z, AnchorCommonStruct anchorCommonStruct, InterfaceC1364105Vn<? super C613070O2v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = c613440O4g;
        this.LLILZIL = str;
        this.LLILZLL = z;
        this.LLIZ = anchorCommonStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C613070O2v c613070O2v = new C613070O2v(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c613070O2v.LLILLJJLI = obj;
        return c613070O2v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MovieTokAnchorBusinessService@ff9f.handleIconClick$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            InterfaceC346201Wa<C0O7A<? extends C0O3E>> interfaceC346201Wa = this.LLILLL;
            AgS2S1310000_9 agS2S1310000_9 = new AgS2S1310000_9(interfaceC497601wk, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, 0);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS2S1310000_9, this) == objLJFF) {
                C1C7U.LIZIZ("MovieTokAnchorBusinessService@ff9f.handleIconClick$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MovieTokAnchorBusinessService@ff9f.handleIconClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
