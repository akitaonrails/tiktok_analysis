package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10IK, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10IK extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10IK(int i, String str, String str2, boolean z) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Service] onDetailEnteredFromPush strategy=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" requireUgFirst=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" sender=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" current=");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
