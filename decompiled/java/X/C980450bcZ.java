package X;

import com.bytedance.android.live.liveinteract.matchv2.service.MatchAICommentaryService;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchSettingsInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import webcast.api.battle.OperateSwitchResponse;

/* JADX INFO: renamed from: X.0bcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C980450bcZ extends C09AY implements Function1<C470590Icr<OperateSwitchResponse.ResponseData>, Unit> {
    public final /* synthetic */ EnumC980440bcY LL;
    public final /* synthetic */ MatchAICommentaryService LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ DataChannel LLILZIL;
    public final /* synthetic */ EnumC980470bcb LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C980450bcZ(EnumC980440bcY enumC980440bcY, MatchAICommentaryService matchAICommentaryService, boolean z, Function1<? super Boolean, Unit> function1, DataChannel dataChannel, EnumC980470bcb enumC980470bcb) {
        super(1);
        this.LL = enumC980440bcY;
        this.LLILLJJLI = matchAICommentaryService;
        this.LLILLL = z;
        this.LLILZ = function1;
        this.LLILZIL = dataChannel;
        this.LLILZLL = enumC980470bcb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C470590Icr<OperateSwitchResponse.ResponseData> c470590Icr) {
        MatchSettingsInfo matchSettingsInfoLJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestAnchorFeatureSwitch success: ");
        sbLIZ.append(this.LL.name());
        C20441214yg.LJIIIZ("MatchAICommentaryService", C2188811AlT.LIZIZ(sbLIZ));
        MatchAICommentaryService matchAICommentaryService = this.LLILLJJLI;
        boolean z = this.LLILLL;
        Function2<MatchSettingsInfo, Boolean, Unit> repoUpdater = this.LL.getRepoUpdater();
        matchAICommentaryService.getClass();
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null && (matchSettingsInfoLJJ = interfaceC975810bV5LIZLLL.LJJ()) != null) {
            repoUpdater.invoke(matchSettingsInfoLJJ, Boolean.valueOf(z));
        }
        this.LLILZ.invoke(Boolean.TRUE);
        if (this.LL == EnumC980440bcY.AI_COMMENTARY) {
            C915980Zwa.LJ().iE1(this.LLILLL, this.LLILZIL, this.LLILZLL);
        }
        return Unit.LIZ;
    }
}
