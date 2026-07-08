package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0g8W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154020g8W extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154020g8W(Integer num, String str, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = num;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadFailed: (isPreload: ");
        sbLIZ.append(this.LL);
        sbLIZ.append("), (code: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("), (msg: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
