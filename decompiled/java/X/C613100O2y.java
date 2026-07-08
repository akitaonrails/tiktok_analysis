package X;

import Y.AgS2S1310000_9;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.book.anchor.BookAnchorBusinessService$handleIconClick$1", f = "BookAnchorBusinessService.kt", l = {334}, m = "invokeSuspend")
public final class C613100O2y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<C0O7A<? extends C0O3E>> LLILLL;
    public final /* synthetic */ C613410O4d LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ AnchorCommonStruct LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C613100O2y(InterfaceC346201Wa<? extends C0O7A<? extends C0O3E>> interfaceC346201Wa, C613410O4d c613410O4d, String str, boolean z, AnchorCommonStruct anchorCommonStruct, InterfaceC1364105Vn<? super C613100O2y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = c613410O4d;
        this.LLILZIL = str;
        this.LLILZLL = z;
        this.LLIZ = anchorCommonStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C613100O2y c613100O2y = new C613100O2y(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c613100O2y.LLILLJJLI = obj;
        return c613100O2y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BookAnchorBusinessService@cb1.handleIconClick$1");
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
            AgS2S1310000_9 agS2S1310000_9 = new AgS2S1310000_9(interfaceC497601wk, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, 1);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS2S1310000_9, this) == objLJFF) {
                C1C7U.LIZIZ("BookAnchorBusinessService@cb1.handleIconClick$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BookAnchorBusinessService@cb1.handleIconClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
