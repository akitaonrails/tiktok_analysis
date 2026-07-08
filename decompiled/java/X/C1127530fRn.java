package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelTopLeafV2$onRegister$1", f = "GiftPanelTopLeafV2.kt", l = {}, m = "invokeSuspend")
public final class C1127530fRn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1127530fRn(InterfaceC1364105Vn<? super C1127530fRn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1127530fRn(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftPanelTopLeafV2@a3e3.onRegister$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AtomicBoolean atomicBoolean = C1127650fRz.LLJJJJJIL;
        int i = 0;
        Class[] clsArr = {C1127680fS2.class, C1127420fRc.class, C1127520fRm.class, C1125190fO1.class, C1127460fRg.class, C1127620fRw.class, C1127560fRq.class, C1127590fRt.class, C1124710fNF.class, C1127610fRv.class, C1124600fN4.class, C1127430fRd.class, C1125090fNr.class, C1127690fS3.class, C1127570fRr.class, C1127540fRo.class, C1124620fN6.class, C1127550fRp.class, C1124690fND.class, C1124580fN2.class, C1124610fN5.class, C1124650fN9.class, C1127750fS9.class, C1127630fRx.class, C1127740fS8.class, C1124670fNB.class, C1127770fSB.class, C1127510fRl.class};
        do {
            Class cls = clsArr[i];
            AtomicBoolean atomicBoolean2 = C1127650fRz.LLJJJJJIL;
            try {
                C189200o6.m2constructorimpl(Class.forName(cls.getName()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            i++;
        } while (i < 28);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftPanelTopLeafV2@a3e3.onRegister$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1127530fRn(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
