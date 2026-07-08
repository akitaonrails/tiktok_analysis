package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158020gEy extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158020gEy(String str, int i) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("render from ");
        sbLIZ.append(this.LL);
        sbLIZ.append(": white noise index ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" not exists");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
