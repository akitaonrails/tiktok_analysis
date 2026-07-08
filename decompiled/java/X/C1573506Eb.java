package X;

import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Eb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem$restoreWidgetPosition$1", f = "StreakPetWidgetAssem.kt", l = {293}, m = "invokeSuspend")
public final class C1573506Eb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StreakPetWidgetAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573506Eb(StreakPetWidgetAssem streakPetWidgetAssem, InterfaceC1364105Vn<? super C1573506Eb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = streakPetWidgetAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1573506Eb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        C1C7U.LIZ("StreakPetWidgetAssem@8027.restoreWidgetPosition$1");
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
            C06E0 c06e0 = C06E0.LIZ;
            String strHp = this.LLILLJJLI.hp();
            c06e0.getClass();
            String strLJFF = C0YNP.LJFF(strHp, "streak_widget_margin_top");
            int iIntValue2 = -1;
            if (strLJFF != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strLJFF)) != null) {
                iIntValue = numLJIIJJI2.intValue();
            } else {
                iIntValue = -1;
            }
            String strLJFF2 = C0YNP.LJFF(strHp, "streak_widget_margin_left");
            if (strLJFF2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLJFF2)) != null) {
                iIntValue2 = numLJIIJJI.intValue();
            }
            Pair pair = new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
            int iIntValue3 = ((Number) pair.getFirst()).intValue();
            int iIntValue4 = ((Number) pair.getSecond()).intValue();
            StreakPetWidgetAssem streakPetWidgetAssem = this.LLILLJJLI;
            C1598406Nq c1598406Nq = streakPetWidgetAssem.LLLI;
            if (c1598406Nq == null) {
                synchronized (streakPetWidgetAssem) {
                    c1598406Nq = streakPetWidgetAssem.LLLI;
                    if (c1598406Nq == null) {
                        c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                        streakPetWidgetAssem.LLLI = c1598406Nq;
                    }
                }
            }
            AbstractC2252651DEx abstractC2252651DEx = c1598406Nq.LIZIZ;
            C1589606Kg c1589606Kg = new C1589606Kg(this.LLILLJJLI, iIntValue4, iIntValue3, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2252651DEx, c1589606Kg) == objLJFF) {
                C1C7U.LIZIZ("StreakPetWidgetAssem@8027.restoreWidgetPosition$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetWidgetAssem@8027.restoreWidgetPosition$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
