package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TIT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TIT extends C09AY implements Function1<Map<String, String>, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TIT(String str, String str2, String str3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, String> map) {
        Map<String, String> map2 = map;
        String str = this.LL;
        if (str == null) {
            str = "";
        }
        map2.put("enter_from", str);
        map2.put("timestamp", String.valueOf(System.currentTimeMillis()));
        map2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LLILLJJLI);
        String str2 = this.LLILLL;
        if (str2 != null) {
            map2.put("message", str2);
        }
        return Unit.LIZ;
    }
}
