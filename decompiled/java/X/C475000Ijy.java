package X;

import Y.AfS176S0100000_7;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.userservice.UserApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ijy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.locationservice.ShowLocationUtilSub$updateView$clickListener$1$onClick$1", f = "ShowLocationUtilSub.kt", l = {}, m = "invokeSuspend")
public final class C475000Ijy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C474990Ijx LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475000Ijy(C474990Ijx c474990Ijx, InterfaceC1364105Vn<? super C475000Ijy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c474990Ijx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C475000Ijy(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        long j;
        C1C7U.LIZ("ShowLocationUtilSub@4c26.updateView$clickListener$1$onClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C480460Ism.LIZ().getClass();
        UserApi userApi = (UserApi) C480460Ism.LIZLLL(UserApi.class);
        CompoundButton compoundButton = this.LL.LIZJ;
        if (compoundButton != null) {
            boolValueOf = Boolean.valueOf(compoundButton.isChecked());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            j = 1;
        } else {
            j = 2;
        }
        userApi.updateSwitch(32L, j).LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(this.LL, 279), new C09JN() { // from class: X.0Ijz
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("ShowLocationUtilSub@4c26.updateView$clickListener$1$onClick$1$2");
                C766270U4b.LIZLLL(2131842705);
                C1C7U.LIZIZ("ShowLocationUtilSub@4c26.updateView$clickListener$1$onClick$1$2");
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShowLocationUtilSub@4c26.updateView$clickListener$1$onClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
