package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20386614ps {
    public final EnumC979090baN LIZ;
    public final String LIZIZ;
    public final EnumC202064144o LIZJ;
    public final Function1<EnumC979090baN, Unit> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookDetailFooterButtonParams(footerType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", footerTitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", footerAction=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20386614ps(EnumC979090baN enumC979090baN, String str, EnumC202064144o enumC202064144o, Function1<? super EnumC979090baN, Unit> function1) {
        this.LIZ = enumC979090baN;
        this.LIZIZ = str;
        this.LIZJ = enumC202064144o;
        this.LIZLLL = function1;
    }
}
