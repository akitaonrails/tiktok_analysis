package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qZA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554940qZA extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554940qZA(String str, boolean z) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start to create session ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isForegroundSession: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" ...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
