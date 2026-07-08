package X;

import android.text.Layout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SFK, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFK extends C09AY implements Function0<String> {
    public final /* synthetic */ C718770SHj LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ Pair<Layout, Layout> LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0SFK(C718770SHj c718770SHj, Aweme aweme, Pair<? extends Layout, ? extends Layout> pair, long j) {
        super(0);
        this.LL = c718770SHj;
        this.LLILLJJLI = aweme;
        this.LLILLL = pair;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.hashCode());
        sbLIZ.append(" refreshDescLayoutWithHashTagTruncation [");
        sbLIZ.append(this.LLILLJJLI.getAid());
        sbLIZ.append("] onSuccess: ");
        Layout second = this.LLILLL.getSecond();
        if (second == null) {
            second = this.LLILLL.getFirst();
        }
        sbLIZ.append((Object) second.getText());
        sbLIZ.append(", cost: ");
        sbLIZ.append(System.currentTimeMillis() - this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
