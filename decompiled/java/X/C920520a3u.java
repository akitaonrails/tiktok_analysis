package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0a3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C920520a3u extends C2217421BqW implements Function1<Long, Integer> {
    public C920520a3u(Object obj) {
        super(1, obj, MultiLiveAsAnchorListDialogV2.class, "getRankByUid", "getRankByUid(J)Ljava/lang/Integer;", 0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Integer, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Long l) {
        return ((HashMap) ((MultiLiveAsAnchorListDialogV2) this.receiver).LLLLLLLLL.getValue()).get(Long.valueOf(l.longValue()));
    }
}
