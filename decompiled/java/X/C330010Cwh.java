package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cwh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem$inputFlow$1$1", f = "AddYoursInviteFriendsAssem.kt", l = {136}, m = "invokeSuspend")
public final class C330010Cwh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC332260D0u<String> LLILLJJLI;
    public final /* synthetic */ AddYoursInviteFriendsAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330010Cwh(InterfaceC332260D0u<String> interfaceC332260D0u, AddYoursInviteFriendsAssem addYoursInviteFriendsAssem, InterfaceC1364105Vn<? super C330010Cwh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC332260D0u;
        this.LLILLL = addYoursInviteFriendsAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330010Cwh(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursInviteFriendsAssem@84df.inputFlow$1$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILIIL = C09IC.LJIILIIL(this.LLILLJJLI, 200L);
            AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLL, 39);
            this.LL = 1;
            if (interfaceC346201WaLJIILIIL.collect(agS285S0100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("AddYoursInviteFriendsAssem@84df.inputFlow$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursInviteFriendsAssem@84df.inputFlow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
