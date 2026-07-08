package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0r1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572630r1h implements Serializable {
    public static final int $stable = 8;
    public final Map<String, String> extraInfo;
    public final List<User> invited;

    public C1572630r1h() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1572630r1h(Map<String, String> map, List<? extends User> list) {
        this.extraInfo = map;
        this.invited = list;
    }

    public C1572630r1h(Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJ() : map, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
