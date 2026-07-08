package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0gEp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1157930gEp extends AbstractC1157950gEr {
    public final Map<String, String> LLILLJJLI;
    public final Map<String, Object> LLILLL;
    public final String LLILZ;

    @Override // X.AbstractC1186480gys
    public final String getEventName() {
        String str = this.LLILZ;
        return str == null ? "" : str;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashCommonActionEvent(params=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", rawParams=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", bizName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157930gEp(Map<String, String> map, Map<String, ? extends Object> map2, String str, String str2) {
        super(str2);
        this.LLILLJJLI = map;
        this.LLILLL = map2;
        this.LLILZ = str;
    }
}
