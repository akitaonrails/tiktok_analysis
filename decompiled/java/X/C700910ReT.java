package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ReT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700910ReT extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C700820ReK LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700910ReT(long j, C700820ReK c700820ReK, boolean z, long j2) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = c700820ReK;
        this.LLILLL = z;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" --- ");
        sbLIZ.append(this.LLILLJJLI.modifier.LIZJ().LLLII());
        sbLIZ.append(" --- FcpNodeActiveTask#compute end, active: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" --- duration: ");
        sbLIZ.append(this.LL - this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
