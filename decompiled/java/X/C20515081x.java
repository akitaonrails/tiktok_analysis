package X;

import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.081x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20515081x extends C09AY implements Function0<String> {
    public final /* synthetic */ CopyOnWriteArrayList<PriorityProtocol> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20515081x(String str, CopyOnWriteArrayList copyOnWriteArrayList) {
        super(0);
        this.LL = copyOnWriteArrayList;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostTag MultiPriorityMaker decisionPriorityProtocols => size: ");
        CopyOnWriteArrayList<PriorityProtocol> copyOnWriteArrayList = this.LL;
        sbLIZ.append(copyOnWriteArrayList != null ? Integer.valueOf(copyOnWriteArrayList.size()) : null);
        sbLIZ.append(", value: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
