package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VQ9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQ9 extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VQ9(int i, String str, String str2, long j, String str3) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Scheduler] schedule strategy=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" delay=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("ms reason=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" unique=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" senderUid=");
        sbLIZ.append(this.LLILZIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
