package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06oJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.multiaccount.MultiAccountPopupPanelTask$setMultiAccountPushSettings$1", f = "MultiAccountPopupPanelTask.kt", l = {}, m = "invokeSuspend")
public final class C1719306oJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1912660zs8 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1719306oJ(boolean z, C1912660zs8 c1912660zs8, InterfaceC1364105Vn<? super C1719306oJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c1912660zs8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1719306oJ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("MultiAccountPopupPanelTask@3b60.setMultiAccountPushSettings$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C19296410eQ c19296410eQ = C19296410eQ.LIZIZ;
            if (this.LL) {
                i = 1;
            } else {
                i = 0;
            }
            c19296410eQ.batchSetPushSettingItems("multi_accounts_push", i, false, this.LLILLJJLI.LLILLL, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiAccountPopupPanelTask@3b60.setMultiAccountPushSettings$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
