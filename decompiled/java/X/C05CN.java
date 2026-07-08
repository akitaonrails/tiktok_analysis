package X;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05CN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.user.FrontierRoomStatusManager$observeUid$1$1", f = "FrontierRoomStatusManager.kt", l = {}, m = "invokeSuspend")
public final class C05CN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05CO LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05CN(C05CO c05co, InterfaceC1364105Vn<? super C05CN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05co;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05CN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FrontierRoomStatusManager@a415.observeUid$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C05CO c05co = this.LL;
        HashSet<String> hashSet = c05co.LIZ;
        InterfaceC1602300rnY interfaceC1602300rnY = (InterfaceC1602300rnY) c05co.LIZJ.getValue();
        if (interfaceC1602300rnY != null) {
            interfaceC1602300rnY.LJIJ(5, "inbox_dm_head", hashSet, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FrontierRoomStatusManager@a415.observeUid$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
