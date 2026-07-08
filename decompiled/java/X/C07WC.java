package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07WC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WC extends C09AY implements Function0<String> {
    public final /* synthetic */ List<Aweme> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C07WC(List<? extends Aweme> list) {
        super(0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setData], ");
        List<Aweme> list = this.LL;
        sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
