package X;

import com.bytedance.android.livesdk.userservice.UserApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ibh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.locationservice.ShowLocationUtilSub$unCheckedSwitch$1", f = "ShowLocationUtilSub.kt", l = {}, m = "invokeSuspend")
public final class C469870Ibh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C469870Ibh(InterfaceC1364105Vn<? super C469870Ibh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C469870Ibh(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShowLocationUtilSub@4c26.unCheckedSwitch$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C480460Ism.LIZ().getClass();
        ((UserApi) C480460Ism.LIZLLL(UserApi.class)).updateSwitch(32L, 2L).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0Ibj
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("ShowLocationUtilSub@4c26.unCheckedSwitch$1$1");
                C1C7U.LIZIZ("ShowLocationUtilSub@4c26.unCheckedSwitch$1$1");
            }
        }, new C09JN() { // from class: X.0Ibi
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("ShowLocationUtilSub@4c26.unCheckedSwitch$1$2");
                C766270U4b.LIZLLL(2131842705);
                C1C7U.LIZIZ("ShowLocationUtilSub@4c26.unCheckedSwitch$1$2");
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShowLocationUtilSub@4c26.unCheckedSwitch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C469870Ibh(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
