package X;

import com.bytedance.android.live.liveinteract.competition.model.MemberRankInfo;
import com.bytedance.android.livesdk.model.message.CompetitionRankListMessage;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.018w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2860018w extends C09AY implements Function1<AnonymousClass0190, AnonymousClass0190> {
    public final /* synthetic */ CompetitionRankListMessage LL;
    public final /* synthetic */ List<C019L> LLILLJJLI;
    public final /* synthetic */ List<MemberRankInfo> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2860018w(CompetitionRankListMessage competitionRankListMessage, List<C019L> list, List<MemberRankInfo> list2) {
        super(1);
        this.LL = competitionRankListMessage;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AnonymousClass0190 invoke(AnonymousClass0190 anonymousClass0190) {
        CompetitionRankListMessage competitionRankListMessage = this.LL;
        C2862018y c2862018y = new C2862018y(competitionRankListMessage.dataVersion, this.LLILLL.size(), competitionRankListMessage.competitionId, this.LLILLJJLI);
        anonymousClass0190.getClass();
        return new AnonymousClass0190(c2862018y);
    }
}
