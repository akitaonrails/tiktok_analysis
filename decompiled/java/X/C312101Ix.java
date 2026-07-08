package X;

import com.bytedance.android.livesdk.grouplive.inroomranking.panel.GroupLiveRankingPanelViewModel;
import com.bytedance.android.livesdk.model.message.CompetitionRankListMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.grouplive.inroomranking.panel.GroupLiveRankingPanelViewModel$handleEndGame$1$1", f = "GroupLiveRankingPanelViewModel.kt", l = {166}, m = "invokeSuspend")
public final class C312101Ix extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ GroupLiveRankingPanelViewModel LLILLL;
    public final /* synthetic */ CompetitionRankListMessage LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C312101Ix(long j, GroupLiveRankingPanelViewModel groupLiveRankingPanelViewModel, CompetitionRankListMessage competitionRankListMessage, InterfaceC1364105Vn<? super C312101Ix> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = groupLiveRankingPanelViewModel;
        this.LLILZ = competitionRankListMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C312101Ix(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupLiveRankingPanelViewModel@a567.handleEndGame$1$1");
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
            long j = this.LLILLJJLI * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("GroupLiveRankingPanelViewModel@a567.handleEndGame$1$1");
                return objLJFF;
            }
        }
        GroupLiveRankingPanelViewModel groupLiveRankingPanelViewModel = this.LLILLL;
        groupLiveRankingPanelViewModel.withState(new C020W(this.LLILZ, groupLiveRankingPanelViewModel, 93));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupLiveRankingPanelViewModel@a567.handleEndGame$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
