package X;

import java.util.ArrayDeque;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RjK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703920RjK extends C09AY implements Function0<String> {
    public final /* synthetic */ C703900RjI LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ ArrayDeque<C703910RjJ> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C703920RjK(C703900RjI c703900RjI, String str, String str2, int i, ArrayDeque<C703910RjJ> arrayDeque) {
        super(0);
        this.LL = c703900RjI;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = arrayDeque;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enqueuePendingTask dedupe_removed aid=");
        sbLIZ.append(this.LL.LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" dedupeKey=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" removed=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" pendingForSlot=");
        sbLIZ.append(this.LLILZIL.size());
        sbLIZ.append(" pendingTotal=");
        sbLIZ.append(this.LL.LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
