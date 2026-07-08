package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.toptitle.TakoTopTitleApi$fetchTakoTopTitleList$1", f = "TakoTopTitleApi.kt", l = {23}, m = "invokeSuspend")
public final class C337290DKd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C337290DKd(InterfaceC1364105Vn<? super C337290DKd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C337290DKd(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoTopTitleApi@a93c.fetchTakoTopTitleList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1855770yON.LIZ.getClass();
            if (C1855770yON.LIZJ()) {
                C1863980ybc c1863980ybc = C1863980ybc.LIZ;
                this.LL = 1;
                obj = c1863980ybc.LJIJJLI(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoTopTitleApi@a93c.fetchTakoTopTitleList$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoTopTitleApi@a93c.fetchTakoTopTitleList$1");
            return unit;
        }
        if (obj != null) {
            C1860520yW2.LIZ.getClass();
            Keva kevaLJIIL = C1860520yW2.LJIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tako_top_title_config_response");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            kevaLJIIL.storeString(C2188811AlT.LIZIZ(sbLIZ), GsonProtectorUtils.toJson(C597040NbK.LIZ(), obj));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoTopTitleApi@a93c.fetchTakoTopTitleList$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C337290DKd(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
