package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06HC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidget$updateFallbackView$1", f = "StreakPetWidget.kt", l = {}, m = "invokeSuspend")
public final class C06HC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C06HD LL;
    public final /* synthetic */ EnumC1579606Gk LLILLJJLI;
    public final /* synthetic */ StreakPetData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06HC(C06HD c06hd, EnumC1579606Gk enumC1579606Gk, StreakPetData streakPetData, InterfaceC1364105Vn<? super C06HC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06hd;
        this.LLILLJJLI = enumC1579606Gk;
        this.LLILLL = streakPetData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06HC(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("StreakPetWidget@92f0.updateFallbackView$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C384150F4j c384150F4j = this.LL.LLJJIJIL;
        if (c384150F4j != null) {
            EnumC1579606Gk enumC1579606Gk = this.LLILLJJLI;
            StreakPetData streakPetData = this.LLILLL;
            boolean z = true;
            if (streakPetData.status == C06G0.StreakPetStatus_Active.getValue() && C1697810uHb.LJIIJJI(EnumC1579606Gk.ACTIVE, EnumC1579606Gk.SECONDARY_ACTIVE).contains(enumC1579606Gk)) {
                InterfaceC1575606Ew interfaceC1575606Ew = c384150F4j.LLIZLLLIL;
                if (interfaceC1575606Ew != null) {
                    interfaceC1575606Ew.LIZJ();
                }
            } else {
                InterfaceC1575606Ew interfaceC1575606Ew2 = c384150F4j.LLIZLLLIL;
                if (interfaceC1575606Ew2 != null) {
                    interfaceC1575606Ew2.LIZIZ();
                }
            }
            if (streakPetData.conversationType != AbstractC1711506n3.LIZIZ) {
                z = false;
            }
            EnumC1579606Gk enumC1579606Gk2 = EnumC1579606Gk.ACTIVE;
            if (enumC1579606Gk == enumC1579606Gk2 && z) {
                str = C1583306Hv.LIZ().fallbackGroupActiveUrl;
            } else if (enumC1579606Gk == enumC1579606Gk2 && !z) {
                str = C1583306Hv.LIZ().fallbackActiveUrl;
            } else if (enumC1579606Gk != enumC1579606Gk2 && z) {
                str = C1583306Hv.LIZ().fallbackGroupGreyUrl;
            } else {
                str = C1583306Hv.LIZ().fallbackGreyUrl;
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(c384150F4j);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetWidget@92f0.updateFallbackView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
