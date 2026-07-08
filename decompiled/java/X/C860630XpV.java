package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.b2c.api.ability.IMBusinessInfoAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem.ProfileReusedUISlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem.ProfileReusedUISlot$bindBusinessInfoContainer$1", f = "ProfileItemViewHolder.kt", l = {376}, m = "invokeSuspend")
public final class C860630XpV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMBusinessInfoAbility LLILLJJLI;
    public final /* synthetic */ ProfileReusedUISlot LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860630XpV(IMBusinessInfoAbility iMBusinessInfoAbility, ProfileReusedUISlot profileReusedUISlot, InterfaceC1364105Vn<? super C860630XpV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMBusinessInfoAbility;
        this.LLILLL = profileReusedUISlot;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860630XpV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileReusedUISlot@2d1.bindBusinessInfoContainer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC332260D0u interfaceC332260D0uSo0 = this.LLILLJJLI.so0();
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLL, 49);
            this.LL = 1;
            if (interfaceC332260D0uSo0.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("ProfileReusedUISlot@2d1.bindBusinessInfoContainer$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
