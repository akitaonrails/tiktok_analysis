package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.milestone.StreakMilestoneStoryFrequencyControlMgr$recordStreakMilestoneStoryPosted$1", f = "StreakMilestoneStoryFrequencyControlMgr.kt", l = {}, m = "invokeSuspend")
public final class C332801Qw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332801Qw(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332801Qw(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakMilestoneStoryFrequencyControlMgr@818a.recordStreakMilestoneStoryPosted$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06FL c06fl = C06FL.LIZIZ;
        String str = this.LL;
        c06fl.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("streak_milestone_story_");
        sbLIZ.append(str);
        Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).storeBoolean(String.valueOf(this.LLILLJJLI), true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakMilestoneStoryFrequencyControlMgr@818a.recordStreakMilestoneStoryPosted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
