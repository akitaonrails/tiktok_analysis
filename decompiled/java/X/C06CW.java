package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS87S1000000_2;
import njp.a;

/* JADX INFO: renamed from: X.06CW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.invitation.StreakPetInviteCardUtil$preloadStreakInviteTemplate$1", f = "StreakPetInviteCardUtil.kt", l = {179}, m = "invokeSuspend")
public final class C06CW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06CW(String str, InterfaceC1364105Vn<? super C06CW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06CW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("StreakPetInviteCardUtil@5b11.preloadStreakInviteTemplate$1");
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
            if (!((Boolean) C139900g9.LIZ.getValue()).booleanValue()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StreakPetInviteCardUtil@5b11.preloadStreakInviteTemplate$1");
                return unit;
            }
            C1575806Ey c1575806Ey = C1575806Ey.LIZJ;
            String str3 = this.LLILLJJLI;
            c1575806Ey.getClass();
            StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str3);
            C06C6 c06c6 = C06C6.LIZIZ;
            String str4 = this.LLILLJJLI;
            c06c6.getClass();
            StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(str4);
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILLJJLI);
            if (c0y8tLIZ != null && c0y8tLIZ.isSingleChat()) {
                if (C1567806Bw.LIZLLL(streakDataLJIIIIZZ) || (streakDataLJIIIIZZ != null && C1567806Bw.LJ(streakDataLJIIIIZZ))) {
                    str = "streak_pet_invitation_v2";
                } else {
                    str = "streak_pet_egg_invitation";
                }
            } else if (C296670Bk1.LIZ() && !C1571306Df.LJ(streakPetDataLIZIZ) && !C1567806Bw.LIZLLL(streakDataLJIIIIZZ)) {
                str = "streak_group_pet_egg_invitation";
            } else {
                str = "streak_group_pet_invitation";
            }
            if (C1567806Bw.LIZLLL(streakDataLJIIIIZZ)) {
                str2 = "adopt";
            } else {
                str2 = "hatch";
            }
            C06CX c06cx = C06CX.LIZIZ;
            AwS87S1000000_2 awS87S1000000_2 = new AwS87S1000000_2(this.LLILLJJLI, 19);
            this.LL = 1;
            if (c06cx.LIZ(str, str2, null, awS87S1000000_2, this) == objLJFF) {
                C1C7U.LIZIZ("StreakPetInviteCardUtil@5b11.preloadStreakInviteTemplate$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetInviteCardUtil@5b11.preloadStreakInviteTemplate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
