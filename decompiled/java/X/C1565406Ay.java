package X;

import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS87S1000000_2;
import njp.a;

/* JADX INFO: renamed from: X.06Ay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.triggers.StreakUnlockAnimTrigger$removeUnlockAnim$1", f = "StreakUnlockAnimTrigger.kt", l = {}, m = "invokeSuspend")
public final class C1565406Ay extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1565406Ay(String str, InterfaceC1364105Vn<? super C1565406Ay> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1565406Ay(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakUnlockAnimTrigger@8fc0.removeUnlockAnim$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StreakLocalExtHelper streakLocalExtHelper = StreakLocalExtHelper.LIZ;
        String str = this.LL;
        streakLocalExtHelper.getClass();
        StreakLocalExtHelper.LIZ(new AwS87S1000000_2(str, 3));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakUnlockAnimTrigger@8fc0.removeUnlockAnim$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
