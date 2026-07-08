package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823470WSb extends C09AY implements Function0<String> {
    public final /* synthetic */ C840750WyX LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C823470WSb(C840750WyX c840750WyX, String str, String str2, Map<String, String> map) {
        super(0);
        this.LL = c840750WyX;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" \nLegacyStackEventHandler.handleRequestStack\nid: ");
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append(" threadName: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("\nurl: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append('\n');
        sbLIZ.append(this.LLILZ);
        sbLIZ.append("\n ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
