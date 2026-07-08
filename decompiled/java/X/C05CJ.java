package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.service.impl.core.IMUserPortraitManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05CJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMUserPortraitManager$storeRemotePortrait$1", f = "IMUserPortraitManager.kt", l = {}, m = "invokeSuspend")
public final class C05CJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05CJ(InterfaceC1364105Vn<? super C05CJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05CJ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserPortraitManager@19c1.storeRemotePortrait$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (String str : IMUserPortraitManager.LIZJ) {
            String strLIZLLL = C0CP7.LIZ.LIZLLL(str);
            if (strLIZLLL != null) {
                Keva keva = (Keva) C05CL.LIZ.getValue();
                if (str != null) {
                    keva.storeString(str, strLIZLLL);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMUserPortraitManager@19c1.storeRemotePortrait$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05CJ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
