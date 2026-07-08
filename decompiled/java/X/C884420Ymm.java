package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ymm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.plugin.VOSnapshotPlugin$unbindPage$1$1", f = "VOSnapshotPlugin.kt", l = {}, m = "invokeSuspend")
public final class C884420Ymm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C884470Ymr LL;
    public final /* synthetic */ C884270YmX LLILLJJLI;
    public final /* synthetic */ List<InterfaceC884440Ymo> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884420Ymm(C884470Ymr c884470Ymr, C884270YmX c884270YmX, List<InterfaceC884440Ymo> list, InterfaceC1364105Vn<? super C884420Ymm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c884470Ymr;
        this.LLILLJJLI = c884270YmX;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884420Ymm(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VOSnapshotPlugin@bc0c.unbindPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIJ(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VOSnapshotPlugin@bc0c.unbindPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
