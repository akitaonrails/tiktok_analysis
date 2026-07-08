package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.entry.searchbox.ui.SearchBoxContainerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.057h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.entry.searchbox.ui.SearchBoxContainerAssem$releaseSearchBoxComponent$2", f = "SearchBoxContainerAssem.kt", l = {}, m = "invokeSuspend")
public final class C13011057h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SearchBoxContainerAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13011057h(SearchBoxContainerAssem searchBoxContainerAssem, InterfaceC1364105Vn<? super C13011057h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchBoxContainerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C13011057h c13011057h = new C13011057h(this.LLILLJJLI, interfaceC1364105Vn);
        c13011057h.LL = obj;
        return c13011057h;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC738140SxQ abstractC738140SxQ;
        C1C7U.LIZ("SearchBoxContainerAssem@5964.releaseSearchBoxComponent$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LifecycleOwner parent = this.LLILLJJLI.getParent();
        Boolean boolValueOf = null;
        if ((parent instanceof AbstractC738140SxQ) && (abstractC738140SxQ = (AbstractC738140SxQ) parent) != null) {
            boolValueOf = Boolean.valueOf(C723850SaN.LJII(abstractC738140SxQ, C13LE.LIZ(SearchBoxContainerAssem.class), null));
        }
        if (!Intrinsics.LJFF(boolValueOf, true)) {
            C1AF0.LIZJ("search box release failed");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchBoxContainerAssem@5964.releaseSearchBoxComponent$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
