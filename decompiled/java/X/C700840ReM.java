package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ReM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700840ReM extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C700820ReK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700840ReM(long j, C700820ReK c700820ReK) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = c700820ReK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        C700970ReZ c700970ReZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" --- ");
        sbLIZ.append(this.LLILLJJLI.modifier.LIZJ().LLLII());
        sbLIZ.append(" --- Parent is ");
        C700820ReK c700820ReK = this.LLILLJJLI;
        C700970ReZ c700970ReZLIZ = c700820ReK.context.LIZ.LIZ(c700820ReK.modifier.LIZJ().LLLII());
        String str = null;
        C701030Ref c701030Ref = c700970ReZLIZ != null ? c700970ReZLIZ.LIZ : null;
        if ((c701030Ref instanceof C700970ReZ) && (c700970ReZ = (C700970ReZ) c701030Ref) != null) {
            str = c700970ReZ.LIZJ;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
