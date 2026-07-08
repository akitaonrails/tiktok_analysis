package X;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wWX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1783950wWX extends C09AY implements Function0<String> {
    public final /* synthetic */ C1785070wYL LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ List<C1785080wYM> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783950wWX(C1785070wYL c1785070wYL, String str, boolean z, List<C1785080wYM> list, boolean z2) {
        super(0);
        this.LL = c1785070wYL;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = list;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timer check un displayed text,isTyping: ");
        sbLIZ.append(this.LL.LIZLLL);
        sbLIZ.append(" uuid: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasUnDisplayText: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" , sortedChunks size: ");
        sbLIZ.append(this.LLILZ.size());
        sbLIZ.append(" hasCompleteChunk: ");
        sbLIZ.append(this.LLILZIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
