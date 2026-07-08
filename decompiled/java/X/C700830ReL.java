package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ReL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700830ReL extends C09AY implements Function0<String> {
    public final /* synthetic */ C700820ReK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700830ReL(C700820ReK c700820ReK) {
        super(0);
        this.LL = c700820ReK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed FcpNode(");
        sbLIZ.append(this.LL.modifier.LIZJ().LLLII());
        sbLIZ.append(") receive timing callback. signal#: ");
        sbLIZ.append(this.LL.config.LIZ);
        sbLIZ.append(". current_aid: ");
        sbLIZ.append(this.LL.context.LJIJI);
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
