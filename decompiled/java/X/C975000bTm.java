package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975000bTm extends C09AY implements Function2<MultiMatchPrepareResponse, Boolean, Unit> {
    public final /* synthetic */ C974990bTl LL;
    public final /* synthetic */ C974060bSG LLILLJJLI;
    public final /* synthetic */ List<C954460awe> LLILLL;
    public final /* synthetic */ EnumC919170a1j LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C975000bTm(C974990bTl c974990bTl, C974060bSG c974060bSG, List<C954460awe> list, EnumC919170a1j enumC919170a1j, long j) {
        super(2);
        this.LL = c974990bTl;
        this.LLILLJJLI = c974060bSG;
        this.LLILLL = list;
        this.LLILZ = enumC919170a1j;
        this.LLILZIL = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(MultiMatchPrepareResponse multiMatchPrepareResponse, Boolean bool) {
        MultiMatchPrepareResponse multiMatchPrepareResponse2 = multiMatchPrepareResponse;
        boolean zBooleanValue = bool.booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request prepare success = ");
        sbLIZ.append(multiMatchPrepareResponse2);
        sbLIZ.append(", isFromCache=");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LJ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.LJ(this.LLILLJJLI, this.LLILLL, multiMatchPrepareResponse2, this.LLILZ, this.LLILZIL, zBooleanValue);
        return Unit.LIZ;
    }
}
