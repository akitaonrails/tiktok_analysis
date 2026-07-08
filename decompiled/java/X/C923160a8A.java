package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveLayoutInfo;
import java.util.List;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0a8A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923160a8A {
    public final boolean LIZ;
    public final MultiLiveLayoutInfo LIZIZ;
    public final List<SpotInfo> LIZJ;
    public final boolean LIZLLL;

    public C923160a8A(MultiLiveLayoutInfo multiLiveLayoutInfo, List list, boolean z) {
        this.LIZ = true;
        this.LIZIZ = multiLiveLayoutInfo;
        this.LIZJ = list;
        this.LIZLLL = z;
    }

    public C923160a8A(MultiLiveLayoutInfo multiLiveLayoutInfo, List list, int i) {
        this(multiLiveLayoutInfo, (i & 4) != 0 ? C13BV.INSTANCE : list, false);
    }
}
