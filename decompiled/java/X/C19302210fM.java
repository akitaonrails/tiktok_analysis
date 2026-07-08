package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* JADX INFO: renamed from: X.10fM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19302210fM extends C09AY implements Function1<MatchResult, CharSequence> {
    public final /* synthetic */ Map<String, String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19302210fM(Map<String, String> map) {
        super(1);
        this.LL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(MatchResult matchResult) {
        MatchResult matchResult2 = matchResult;
        String str = this.LL.get(ListProtector.get(matchResult2.LIZ(), 1));
        if (str == null) {
            return matchResult2.getValue();
        }
        return str;
    }
}
