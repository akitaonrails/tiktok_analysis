package X;

import com.ss.android.ugc.aweme.feed.model.CollabInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.CollabInfoColdStartCache$getAsync$1$1", f = "CollabInfoColdStartCache.kt", l = {}, m = "invokeSuspend")
public final class C315000CWk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC315010CWl LL;
    public final /* synthetic */ CollabInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315000CWk(InterfaceC315010CWl interfaceC315010CWl, CollabInfo collabInfo, InterfaceC1364105Vn<? super C315000CWk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC315010CWl;
        this.LLILLJJLI = collabInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315000CWk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CollabInfoColdStartCache@32b1.getAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C1259800it8) this.LL).LIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CollabInfoColdStartCache@32b1.getAsync$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
