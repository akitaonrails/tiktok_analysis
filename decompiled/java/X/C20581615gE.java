package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.experiment.thought.AvatarThoughtsConfigs;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.15gE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM$onAvatarThoughtGenerateStart$1$2", f = "StoryThoughtAvatarCreationVM.kt", l = {1049}, m = "invokeSuspend")
public final class C20581615gE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryThoughtAvatarCreationVM LLILLJJLI;
    public final /* synthetic */ C09AE LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20581615gE(StoryThoughtAvatarCreationVM storyThoughtAvatarCreationVM, C09AE c09ae, InterfaceC1364105Vn<? super C20581615gE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyThoughtAvatarCreationVM;
        this.LLILLL = c09ae;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20581615gE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryThoughtAvatarCreationVM@cb29.onAvatarThoughtGenerateStart$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                long j = AvatarThoughtsConfigs.LIZ().showToastDelay;
                C411401iq c411401iq = new C411401iq(this.LLILLL, null);
                this.LL = 1;
                if (C099A.LIZIZ(j, c411401iq, this) == objLJFF) {
                    C1C7U.LIZIZ("StoryThoughtAvatarCreationVM@cb29.onAvatarThoughtGenerateStart$1$2");
                    return objLJFF;
                }
            }
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            if (Intrinsics.LJFF(this.LLILLJJLI.LLJZ.getValue(), false)) {
                this.LLILLJJLI.LLLLZI.postValue(Unit.LIZ);
                C20581815gG c20581815gG = C20581815gG.LIZ;
                C20583215gU c20583215gUAQ2 = this.LLILLJJLI.AQ2();
                c20581815gG.getClass();
                C0LAB c0lab = new C0LAB();
                C1609930rzr.LJIJJ(c0lab, c20583215gUAQ2.LIZJ, c20583215gUAQ2.LIZLLL);
                c0lab.LJ("creation_id", c20583215gUAQ2.LJII);
                C20684815ws.LJIILLIIL("asynchronous_waiting_toast", c0lab.LIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtAvatarCreationVM@cb29.onAvatarThoughtGenerateStart$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
