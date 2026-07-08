package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Pv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.ui.SearchPhotoView$setFakePhotoPlay$1", f = "SearchPhotoView.kt", l = {377, 379}, m = "invokeSuspend")
public final class C660280Pv8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C661460Px2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C660280Pv8(C661460Px2 c661460Px2, InterfaceC1364105Vn<? super C660280Pv8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c661460Px2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C660280Pv8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchPhotoView@d628.setFakePhotoPlay$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long jLongValue = ((Number) C18127078b.LIZLLL.getValue()).longValue();
            if (jLongValue == 0) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(Long.MAX_VALUE, this) == objLJFF) {
                    C1C7U.LIZIZ("SearchPhotoView@d628.setFakePhotoPlay$1");
                    return objLJFF;
                }
            } else {
                this.LL = 2;
                if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                    C1C7U.LIZIZ("SearchPhotoView@d628.setFakePhotoPlay$1");
                    return objLJFF;
                }
            }
        }
        C661460Px2 c661460Px2 = this.LLILLJJLI;
        c661460Px2.LLJJL++;
        Iterator it2 = ((ArrayList) c661460Px2.LLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC661730PxT) it2.next()).LIZIZ(c661460Px2.LLJJLIIIJLLLLLLLZ, c661460Px2.getCount(), c661460Px2.LLJJL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPhotoView@d628.setFakePhotoPlay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
