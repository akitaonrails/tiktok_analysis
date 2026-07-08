package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04jh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1181104jh extends C09AY implements Function0<String> {
    public final /* synthetic */ C2191831AqL LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1181104jh(C2191831AqL c2191831AqL, String str, String str2, long j, String str3) {
        super(0);
        this.LL = c2191831AqL;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = j;
        this.LLILZIL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" addTerminateDuration for session:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" with page:");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", duration ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", extraParams:");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append('!');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
