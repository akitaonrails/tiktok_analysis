package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1181004jg extends C09AY implements Function0<String> {
    public final /* synthetic */ C2191831AqL LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1181004jg(C2191831AqL c2191831AqL, String str, boolean z, String str2) {
        super(0);
        this.LL = c2191831AqL;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" session changed for new session:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" with isForegroundSession:");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" and oldSessionId:");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('!');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
