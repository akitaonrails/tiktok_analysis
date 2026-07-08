package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O30, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.book.anchor.BookAnchorBusinessService$handleIconClick$1$1$1", f = "BookAnchorBusinessService.kt", l = {}, m = "invokeSuspend")
public final class C0O30 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C613410O4d LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ AnchorCommonStruct LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O30(C613410O4d c613410O4d, String str, boolean z, AnchorCommonStruct anchorCommonStruct, InterfaceC1364105Vn<? super C0O30> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c613410O4d;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = anchorCommonStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O30(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BookAnchorBusinessService@cb1.handleIconClick$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIL(Boolean.valueOf(this.LLILLL), this.LLILLJJLI);
        C613410O4d.LJIIIZ(this.LLILZ, this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BookAnchorBusinessService@cb1.handleIconClick$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
