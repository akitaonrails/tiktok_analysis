package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.01rp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C467101rp extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C20377014oK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C467101rp(long j, long j2, C20377014oK c20377014oK) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = c20377014oK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePlaybookFromUnFavorite, totalFavorites=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", totalUsage=");
        sbLIZ.append(this.LLILLJJLI);
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ));
        C20377014oK c20377014oK = this.LLILLL;
        Playbook playbook = c20377014oK.LJFF.LIZ;
        playbook.totalFavorites = this.LL;
        playbook.totalUsage = this.LLILLJJLI;
        playbook.isMyFavorite = false;
        c20377014oK.LIZ(false);
        return Unit.LIZ;
    }
}
