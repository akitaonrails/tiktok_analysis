package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.autopick.AutoPickAlbumComponent$launchCurrentPageAiAutoCut$2$1", f = "AutoPickAlbumCoordinator.kt", l = {}, m = "invokeSuspend")
public final class C23206097k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23206097k(List<String> list, InterfaceC1364105Vn<? super C23206097k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23206097k(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoPickAlbumComponent@59d1.launchCurrentPageAiAutoCut$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Iterator<String> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            C23203097h.LIZ(it2.next());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoPickAlbumComponent@59d1.launchCurrentPageAiAutoCut$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
