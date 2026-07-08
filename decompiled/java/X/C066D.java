package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066D, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidgetVisibilityHelper$tryHidePetHatchingWidget$1", f = "StreakPetWidgetVisibilityHelper.kt", l = {}, m = "invokeSuspend")
public final class C066D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C066D(int i, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C066D(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJIILIIL;
        C1C7U.LIZ("StreakPetWidgetVisibilityHelper@8796.tryHidePetHatchingWidget$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> list = this.LL;
        int i = this.LLILLJJLI;
        for (String str : list) {
            C06C6.LIZIZ.getClass();
            StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(str);
            if (streakPetDataLIZIZ == null) {
                boolean z = C1590906Kt.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PetVisibilityHelper: triggerPetHatchingHide: streakPetData == null, triggerReason=");
                sbLIZ.append(i);
                C1590906Kt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                IMContactApi.LIZ.getClass();
                IMUser iMUserLJ = C069P.LIZ().LJ().LJ(String.valueOf(C0YNP.LJII(str)), null);
                if (iMUserLJ != null && iMUserLJ.getFollowStatus() == 2) {
                    long jLongValue = 0;
                    if (C1571306Df.LJI(streakPetDataLIZIZ)) {
                        long j = streakPetDataLIZIZ.hatchingTimestampInSeconds;
                        if (j > 0) {
                            long jLIZJ = C1571306Df.LIZJ(C1204904nX.LIZJ, C1204904nX.LIZIZ, j);
                            if (jLIZJ >= 0 && C1567806Bw.LJI() >= jLIZJ) {
                                C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str);
                                if (c0y8tLJIL == null) {
                                    C1590906Kt.LIZIZ("PetVisibilityHelper: tryHidePetHatchingWidget: conversation == null");
                                } else if (c0y8tLJIL.isGroupChat()) {
                                    C1590906Kt.LIZIZ("PetVisibilityHelper: tryHidePetHatchingWidget: conversation type is group chat");
                                } else {
                                    C066E.LIZ.getClass();
                                    String strLJFF = C0YNP.LJFF(str, "streak_pet_hatching_auto_hide_info");
                                    if (strLJFF != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLJFF)) != null) {
                                        jLongValue = lLJIILIIL.longValue();
                                    }
                                    if (jLongValue >= jLIZJ) {
                                        C1590906Kt.LIZ("PetVisibilityHelper: tryHidePetHatchingWidget, has hide widget already");
                                    } else {
                                        C1569106Cj.LJ.getClass();
                                        C1569106Cj c1569106Cj = C1569106Cj.LJI;
                                        C23250099c.LIZLLL(c1569106Cj.LIZ, null, null, new C06C5(c1569106Cj, str, true, null), 3);
                                        C0YNP.LJIIIIZZ(str, "streak_pet_hatching_auto_hide_info", String.valueOf(jLIZJ));
                                    }
                                }
                            }
                        }
                    }
                    C1590906Kt.LIZ("PetVisibilityHelper: tryHidePetHatchingWidget, it's not the time to hide");
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetWidgetVisibilityHelper@8796.tryHidePetHatchingWidget$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
