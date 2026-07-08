package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.EnterRoomPrompt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.common.room.EcommerceRoomStatusProvider$tryToast$1", f = "EcommerceRoomStatusProvider.kt", l = {}, m = "invokeSuspend")
public final class C505001xw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ EnterRoomPrompt LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505001xw(Fragment fragment, EnterRoomPrompt enterRoomPrompt, InterfaceC1364105Vn<? super C505001xw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragment;
        this.LLILLJJLI = enterRoomPrompt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C505001xw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        long jLongValue;
        Long l;
        C1C7U.LIZ("EcommerceRoomStatusProvider@51c7.tryToast$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Fragment fragment = this.LL;
        if (fragment != null) {
            EnterRoomPrompt enterRoomPrompt = this.LLILLJJLI;
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            if (enterRoomPrompt != null) {
                str = enterRoomPrompt.promptText;
            } else {
                str = null;
            }
            c1389890mGx.LJIIJ(str);
            if (enterRoomPrompt != null && (l = enterRoomPrompt.duration) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 3000;
            }
            c1389890mGx.LIZLLL(jLongValue);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcommerceRoomStatusProvider@51c7.tryToast$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
