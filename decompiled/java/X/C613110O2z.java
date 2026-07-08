package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.book.anchor.BookAnchorBusinessService$handleIconClick$1$1$3", f = "BookAnchorBusinessService.kt", l = {}, m = "invokeSuspend")
public final class C613110O2z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C613410O4d LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ AnchorCommonStruct LLILZ;
    public final /* synthetic */ InterfaceC497601wk LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613110O2z(C613410O4d c613410O4d, String str, boolean z, AnchorCommonStruct anchorCommonStruct, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C613110O2z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c613410O4d;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = anchorCommonStruct;
        this.LLILZIL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613110O2z(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        C1C7U.LIZ("BookAnchorBusinessService@cb1.handleIconClick$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C613410O4d c613410O4d = this.LL;
        String str = this.LLILLJJLI;
        Boolean bool = c613410O4d.LIZIZ;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = this.LLILLL;
        }
        c613410O4d.LJIIL(Boolean.valueOf(zBooleanValue), str);
        C613410O4d c613410O4d2 = this.LL;
        String str2 = this.LLILLJJLI;
        Boolean bool2 = c613410O4d2.LIZIZ;
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = this.LLILLL;
        }
        C613410O4d.LJIIIZ(this.LLILZ, str2, zBooleanValue2);
        C2296808zG.LIZJ(this.LLILZIL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BookAnchorBusinessService@cb1.handleIconClick$1$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
