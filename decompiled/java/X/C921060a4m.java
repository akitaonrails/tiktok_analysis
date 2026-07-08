package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0a4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C921060a4m extends C2217421BqW implements Function1<Long, Long> {
    public C921060a4m(Object obj) {
        super(1, obj, MultiLiveAsAnchorListDialogV2.class, "getCoinsByUid", "getCoinsByUid(J)Ljava/lang/Long;", 0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Long, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(Long l) {
        return ((HashMap) ((MultiLiveAsAnchorListDialogV2) this.receiver).LLLLLLL.getValue()).get(Long.valueOf(l.longValue()));
    }
}
