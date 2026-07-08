package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160470gIv extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL = "preload retry";
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160470gIv(int i, int i2) {
        super(0);
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trigger preload more, reason=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" expectedItemCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" remainingItemsToBottom=");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
