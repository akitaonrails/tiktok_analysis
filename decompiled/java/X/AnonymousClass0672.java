package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0672, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.panel.StreakPetRequestManager$onCreate$1", f = "StreakPetRequestManager.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0672 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AnonymousClass0674 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0672(AnonymousClass0674 anonymousClass0674, InterfaceC1364105Vn<? super AnonymousClass0672> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = anonymousClass0674;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0672(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetRequestManager@9a09.onCreate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final AnonymousClass0674 anonymousClass0674 = this.LL;
        synchronized (anonymousClass0674) {
            if (!anonymousClass0674.LIZIZ.getAndSet(true)) {
                if (!((C1400340mXo) C0I0B.LJFF.LIZ()).LIZJ((String) anonymousClass0674.LIZJ.getValue())) {
                    C06C6 c06c6 = C06C6.LIZIZ;
                    String str = anonymousClass0674.LIZ;
                    c06c6.getClass();
                    final StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(str);
                    C1569106Cj.LJ.getClass();
                    C1569106Cj c1569106Cj = C1569106Cj.LJI;
                    C23250099c.LIZLLL(c1569106Cj.LIZ, null, null, new C06C9("pet_chat_page", anonymousClass0674.LIZ, c1569106Cj, null, new C06CA() { // from class: X.0673
                        @Override // X.C06CA
                        public final void onFailure() {
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C066I(anonymousClass0674.LIZ, null), 3);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
                        @Override // X.C06CA
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZ(com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData r10, boolean r11) {
                            /*
                                Method dump skipped, instruction units count: 235
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0673.LIZ(com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData, boolean):void");
                        }
                    }, null), 3);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetRequestManager@9a09.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
